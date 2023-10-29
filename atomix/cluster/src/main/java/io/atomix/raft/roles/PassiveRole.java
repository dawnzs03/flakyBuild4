/*
 * Copyright 2015-present Open Networking Foundation
 * Copyright © 2020 camunda services GmbH (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.raft.roles;

import io.atomix.raft.RaftError;
import io.atomix.raft.RaftServer;
import io.atomix.raft.impl.RaftContext;
import io.atomix.raft.metrics.SnapshotReplicationMetrics;
import io.atomix.raft.protocol.AppendResponse;
import io.atomix.raft.protocol.InstallRequest;
import io.atomix.raft.protocol.InstallResponse;
import io.atomix.raft.protocol.InternalAppendRequest;
import io.atomix.raft.protocol.PersistedRaftRecord;
import io.atomix.raft.protocol.PollRequest;
import io.atomix.raft.protocol.PollResponse;
import io.atomix.raft.protocol.RaftResponse;
import io.atomix.raft.protocol.ReconfigureRequest;
import io.atomix.raft.protocol.ReconfigureResponse;
import io.atomix.raft.protocol.ReplicatableJournalRecord;
import io.atomix.raft.protocol.ReplicatableRaftRecord;
import io.atomix.raft.protocol.VoteRequest;
import io.atomix.raft.protocol.VoteResponse;
import io.atomix.raft.snapshot.impl.SnapshotChunkImpl;
import io.atomix.raft.storage.log.IndexedRaftLogEntry;
import io.atomix.raft.storage.log.RaftLogReader;
import io.camunda.zeebe.journal.JournalException;
import io.camunda.zeebe.journal.JournalException.InvalidChecksum;
import io.camunda.zeebe.journal.JournalException.InvalidIndex;
import io.camunda.zeebe.snapshots.ReceivedSnapshot;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;
import org.agrona.concurrent.UnsafeBuffer;

/** Passive state. */
public class PassiveRole extends InactiveRole {

  private final SnapshotReplicationMetrics snapshotReplicationMetrics;
  private long pendingSnapshotStartTimestamp;
  private ReceivedSnapshot pendingSnapshot;
  private ByteBuffer nextPendingSnapshotChunkId;

  public PassiveRole(final RaftContext context) {
    super(context);

    snapshotReplicationMetrics = new SnapshotReplicationMetrics(context.getName());
    snapshotReplicationMetrics.setCount(0);
  }

  @Override
  public CompletableFuture<RaftRole> start() {

    return super.start().thenRun(this::truncateUncommittedEntries).thenApply(v -> this);
  }

  @Override
  public CompletableFuture<Void> stop() {
    abortPendingSnapshots();

    // as a safe guard, we clean up any orphaned pending snapshots
    try {
      raft.getPersistedSnapshotStore().purgePendingSnapshots().join();
    } catch (final Exception e) {
      log.warn(
          "Failed to purge pending snapshots, which may result in unnecessary disk usage and should be monitored",
          e);
    }
    return super.stop();
  }

  /** Truncates uncommitted entries from the log. */
  private void truncateUncommittedEntries() {
    if (role() == RaftServer.Role.PASSIVE && raft.getLog().getLastIndex() > raft.getCommitIndex()) {
      raft.getLog().deleteAfter(raft.getCommitIndex());
    }
  }

  @Override
  public RaftServer.Role role() {
    return RaftServer.Role.PASSIVE;
  }

  @Override
  public CompletableFuture<InstallResponse> onInstall(final InstallRequest request) {
    raft.checkThread();
    logRequest(request);
    updateTermAndLeader(request.currentTerm(), request.leader());

    log.debug("Received snapshot {} chunk from {}", request.index(), request.leader());

    // If the request is for a lesser term, reject the request.
    if (request.currentTerm() < raft.getTerm()) {
      return CompletableFuture.completedFuture(
          logResponse(
              InstallResponse.builder()
                  .withStatus(RaftResponse.Status.ERROR)
                  .withError(
                      RaftError.Type.ILLEGAL_MEMBER_STATE,
                      "Request term is less than the local term " + request.currentTerm())
                  .build()));
    }

    // If the index has already been applied, we have enough state to populate the state machine up
    // to this index.
    // Skip the snapshot and response successfully.
    if (raft.getCommitIndex() > request.index()) {
      return CompletableFuture.completedFuture(
          logResponse(InstallResponse.builder().withStatus(RaftResponse.Status.OK).build()));
    }

    // If a snapshot is currently being received and the snapshot versions don't match, simply
    // close the existing snapshot. This is a naive implementation that assumes that the leader
    // will be responsible in sending the correct snapshot to this server. Leaders must dictate
    // where snapshots must be sent since entries can still legitimately exist prior to the
    // snapshot,
    // and so snapshots aren't simply sent at the beginning of the follower's log, but rather the
    // leader dictates when a snapshot needs to be sent.
    if (pendingSnapshot != null && request.index() != pendingSnapshot.index()) {
      abortPendingSnapshots();
    }

    // If the snapshot already exists locally, do not overwrite it with a replicated snapshot.
    // Simply reply to the request successfully.
    final var latestIndex = raft.getCurrentSnapshotIndex();
    if (latestIndex >= request.index()) {
      abortPendingSnapshots();

      return CompletableFuture.completedFuture(
          logResponse(InstallResponse.builder().withStatus(RaftResponse.Status.OK).build()));
    }

    if (!request.complete() && request.nextChunkId() == null) {
      abortPendingSnapshots();
      return CompletableFuture.completedFuture(
          logResponse(
              InstallResponse.builder()
                  .withStatus(RaftResponse.Status.ERROR)
                  .withError(
                      RaftError.Type.PROTOCOL_ERROR,
                      "Snapshot installation is not complete but did not provide any next expected chunk")
                  .build()));
    }

    final var snapshotChunk = new SnapshotChunkImpl();
    final var snapshotChunkBuffer = new UnsafeBuffer(request.data());
    if (!snapshotChunk.tryWrap(snapshotChunkBuffer)) {
      abortPendingSnapshots();
      return CompletableFuture.completedFuture(
          logResponse(
              InstallResponse.builder()
                  .withStatus(RaftResponse.Status.ERROR)
                  .withError(RaftError.Type.APPLICATION_ERROR, "Failed to parse request data")
                  .build()));
    }

    // If there is no pending snapshot, create a new snapshot.
    if (pendingSnapshot == null) {
      // if we have no pending snapshot then the request must be the first chunk, otherwise we could
      // receive an old request and end up in a strange state
      if (!request.isInitial()) {
        return CompletableFuture.completedFuture(
            logResponse(
                InstallResponse.builder()
                    .withStatus(RaftResponse.Status.ERROR)
                    .withError(
                        RaftError.Type.ILLEGAL_MEMBER_STATE, "Request chunk offset is invalid")
                    .build()));
      }

      pendingSnapshot =
          raft.getPersistedSnapshotStore().newReceivedSnapshot(snapshotChunk.getSnapshotId());
      log.info("Started receiving new snapshot {} from {}", pendingSnapshot, request.leader());
      pendingSnapshotStartTimestamp = System.currentTimeMillis();
      snapshotReplicationMetrics.incrementCount();

      // When all chunks of the snapshot is received the log will be reset. Hence notify the
      // listeners in advance so that they can close all consumers of the log.
      raft.notifySnapshotReplicationStarted();
    } else {
      // fail the request if this is not the expected next chunk
      if (!isExpectedChunk(request.chunkId())) {
        abortPendingSnapshots();
        return CompletableFuture.completedFuture(
            logResponse(
                InstallResponse.builder()
                    .withStatus(RaftResponse.Status.ERROR)
                    .withError(
                        RaftError.Type.ILLEGAL_MEMBER_STATE,
                        "Snapshot chunk is received out of order")
                    .build()));
      }
    }

    try {
      pendingSnapshot.apply(snapshotChunk).join();
    } catch (final Exception e) {
      log.warn(
          "Failed to write pending snapshot chunk {}, rolling back snapshot {}",
          snapshotChunk,
          pendingSnapshot,
          e);

      abortPendingSnapshots();
      return CompletableFuture.completedFuture(
          logResponse(
              InstallResponse.builder()
                  .withStatus(RaftResponse.Status.ERROR)
                  .withError(
                      RaftError.Type.APPLICATION_ERROR, "Failed to write pending snapshot chunk")
                  .build()));
    }

    // If the snapshot is complete, store the snapshot and reset state, otherwise update the next
    // snapshot offset.
    if (request.complete()) {
      final long elapsed = System.currentTimeMillis() - pendingSnapshotStartTimestamp;
      log.debug("Committing snapshot {}", pendingSnapshot);
      try {
        // Reset before committing to prevent the edge case where the system crashes after
        // committing the snapshot, and restart with a snapshot and invalid log.
        resetLogOnReceivingSnapshot(pendingSnapshot.index());

        final var snapshot = pendingSnapshot.persist().join();
        log.info("Committed snapshot {}", snapshot);
      } catch (final Exception e) {
        log.error("Failed to commit pending snapshot {}, rolling back", pendingSnapshot, e);
        abortPendingSnapshots();
        return CompletableFuture.completedFuture(
            logResponse(
                InstallResponse.builder()
                    .withStatus(RaftResponse.Status.ERROR)
                    .withError(
                        RaftError.Type.APPLICATION_ERROR, "Failed to commit pending snapshot")
                    .build()));
      }

      pendingSnapshot = null;
      pendingSnapshotStartTimestamp = 0L;
      snapshotReplicationMetrics.decrementCount();
      snapshotReplicationMetrics.observeDuration(elapsed);
      onSnapshotReceiveCompletedOrAborted();
    } else {
      setNextExpected(request.nextChunkId());
    }

    return CompletableFuture.completedFuture(
        logResponse(InstallResponse.builder().withStatus(RaftResponse.Status.OK).build()));
  }

  @Override
  public CompletableFuture<ReconfigureResponse> onReconfigure(final ReconfigureRequest request) {
    raft.checkThread();
    logRequest(request);

    if (raft.getLeader() == null) {
      return CompletableFuture.completedFuture(
          logResponse(
              ReconfigureResponse.builder()
                  .withStatus(RaftResponse.Status.ERROR)
                  .withError(RaftError.Type.NO_LEADER)
                  .build()));
    } else {
      return forward(request, raft.getProtocol()::reconfigure)
          .exceptionally(
              error ->
                  ReconfigureResponse.builder()
                      .withStatus(RaftResponse.Status.ERROR)
                      .withError(RaftError.Type.NO_LEADER)
                      .build())
          .thenApply(this::logResponse);
    }
  }

  @Override
  public CompletableFuture<AppendResponse> onAppend(final InternalAppendRequest request) {
    raft.checkThread();
    logRequest(request);
    updateTermAndLeader(request.term(), request.leader());
    return handleAppend(request);
  }

  @Override
  public CompletableFuture<PollResponse> onPoll(final PollRequest request) {
    raft.checkThread();
    logRequest(request);

    return CompletableFuture.completedFuture(
        logResponse(
            PollResponse.builder()
                .withStatus(RaftResponse.Status.ERROR)
                .withError(RaftError.Type.ILLEGAL_MEMBER_STATE, "Cannot poll RESERVE member")
                .build()));
  }

  @Override
  public CompletableFuture<VoteResponse> onVote(final VoteRequest request) {
    raft.checkThread();
    logRequest(request);
    updateTermAndLeader(request.term(), null);

    return CompletableFuture.completedFuture(
        logResponse(
            VoteResponse.builder()
                .withStatus(RaftResponse.Status.ERROR)
                .withError(
                    RaftError.Type.ILLEGAL_MEMBER_STATE, "Cannot request vote from RESERVE member")
                .build()));
  }

  private void onSnapshotReceiveCompletedOrAborted() {
    // Listeners should be notified whether snapshot is committed or aborted. Otherwise they can
    // wait for ever.
    raft.notifySnapshotReplicationCompleted();
  }

  private void setNextExpected(final ByteBuffer nextChunkId) {
    nextPendingSnapshotChunkId = nextChunkId;
  }

  private boolean isExpectedChunk(final ByteBuffer chunkId) {
    return nextPendingSnapshotChunkId == null || nextPendingSnapshotChunkId.equals(chunkId);
  }

  private void abortPendingSnapshots() {
    if (pendingSnapshot != null) {
      setNextExpected(null);
      log.info("Rolling back snapshot {}", pendingSnapshot);
      try {
        pendingSnapshot.abort();
      } catch (final Exception e) {
        log.error("Failed to abort pending snapshot, clearing status anyway", e);
      }
      pendingSnapshot = null;
      pendingSnapshotStartTimestamp = 0L;

      snapshotReplicationMetrics.decrementCount();
      onSnapshotReceiveCompletedOrAborted();
    }
  }

  /** Handles an AppendRequest. */
  protected CompletableFuture<AppendResponse> handleAppend(final InternalAppendRequest request) {
    final CompletableFuture<AppendResponse> future = new CompletableFuture<>();

    // Check that the term of the given request matches the local term or update the term.
    if (!checkTerm(request, future)) {
      return future;
    }

    // Check that the previous index/term matches the local log's last entry.
    if (!checkPreviousEntry(request, future)) {
      return future;
    }

    // Append the entries to the log.
    appendEntries(request, future);

    // If a snapshot replication was ongoing, reset it. Otherwise SnapshotReplicationListeners will
    // wait for ever for the snapshot to be received.
    abortPendingSnapshots();
    return future;
  }

  /**
   * Checks the leader's term of the given AppendRequest, returning a boolean indicating whether to
   * continue handling the request.
   */
  protected boolean checkTerm(
      final InternalAppendRequest request, final CompletableFuture<AppendResponse> future) {
    if (request.term() < raft.getTerm()) {
      log.debug(
          "Rejected {}: request term is less than the current term ({})", request, raft.getTerm());
      return failAppend(raft.getLog().getLastIndex(), future);
    }
    return true;
  }

  /**
   * Checks the previous index of the given AppendRequest, returning a boolean indicating whether to
   * continue handling the request.
   */
  protected boolean checkPreviousEntry(
      final InternalAppendRequest request, final CompletableFuture<AppendResponse> future) {
    // If the previous term is set, validate that it matches the local log.
    // We check the previous log term since that indicates whether any entry is present in the
    // leader's
    // log at the previous log index. prevLogTerm is 0 only when it is the first entry of the log.
    if (request.prevLogTerm() != 0) {
      // Get the last entry written to the log.
      final IndexedRaftLogEntry lastEntry = raft.getLog().getLastEntry();

      // If the local log is non-empty...
      if (lastEntry != null) {
        return checkPreviousEntry(request, lastEntry.index(), lastEntry.term(), future);
      } else {
        final var currentSnapshot = raft.getCurrentSnapshot();

        if (currentSnapshot != null) {
          return checkPreviousEntry(
              request, currentSnapshot.getIndex(), currentSnapshot.getTerm(), future);
        } else {
          // If the previous log index is set and the last entry is null and there is no snapshot,
          // fail the append.
          if (request.prevLogIndex() > 0) {
            log.debug(
                "Rejected {}: Previous index ({}) is greater than the local log's last index (0)",
                request,
                request.prevLogIndex());
            return failAppend(0, future);
          }
        }
      }
    }
    return true;
  }

  private boolean checkPreviousEntry(
      final InternalAppendRequest request,
      final long lastEntryIndex,
      final long lastEntryTerm,
      final CompletableFuture<AppendResponse> future) {

    // If the previous log index is greater than the last entry index, fail the attempt.
    if (request.prevLogIndex() > lastEntryIndex) {
      log.debug(
          "Rejected {}: Previous index ({}) is greater than the local log's last index ({})",
          request,
          request.prevLogIndex(),
          lastEntryIndex);
      return failAppend(lastEntryIndex, future);
    }

    // If the previous log index is less than the last written entry index, look up the entry.
    if (request.prevLogIndex() < lastEntryIndex) {
      try (final RaftLogReader reader = raft.getLog().openUncommittedReader()) {
        // Reset the reader to the previous log index.
        reader.seek(request.prevLogIndex());

        // The previous entry should exist in the log if we've gotten this far.
        if (!reader.hasNext()) {
          log.debug("Rejected {}: Previous entry does not exist in the local log", request);
          return failAppend(lastEntryIndex, future);
        }

        // Read the previous entry and validate that the term matches the request previous log term.
        final IndexedRaftLogEntry previousEntry = reader.next();
        if (request.prevLogTerm() != previousEntry.term()) {
          log.debug(
              "Rejected {}: Previous entry term ({}) does not match local log's term for the same entry ({})",
              request,
              request.prevLogTerm(),
              previousEntry.term());
          return failAppend(request.prevLogIndex() - 1, future);
        }
      }
    }
    // If the previous log term doesn't equal the last entry term, fail the append, sending the
    // prior entry.
    else if (request.prevLogTerm() != lastEntryTerm) {
      log.debug(
          "Rejected {}: Previous entry term ({}) does not equal the local log's last term ({})",
          request,
          request.prevLogTerm(),
          lastEntryTerm);
      return failAppend(request.prevLogIndex() - 1, future);
    }
    return true;
  }

  /** Appends entries from the given AppendRequest. */
  protected void appendEntries(
      final InternalAppendRequest request, final CompletableFuture<AppendResponse> future) {
    // Compute the last entry index from the previous log index and request entry count.
    final long lastEntryIndex = request.prevLogIndex() + request.entries().size();

    // Ensure the commitIndex is not increased beyond the index of the last entry in the request.
    final long commitIndex =
        Math.max(raft.getCommitIndex(), Math.min(request.commitIndex(), lastEntryIndex));

    // Track the last log index while entries are appended.
    long lastLogIndex = request.prevLogIndex();

    if (!request.entries().isEmpty()) {

      // If the previous term is zero, that indicates the previous index represents the beginning of
      // the log.
      // Reset the log to the previous index plus one.
      if (request.prevLogTerm() == 0) {
        log.debug("Reset first index to {}", request.prevLogIndex() + 1);
        raft.getLog().reset(request.prevLogIndex() + 1);
      }

      // Iterate through entries and append them.
      for (final ReplicatableRaftRecord entry : request.entries()) {
        final long index = ++lastLogIndex;

        // Get the last entry written to the log by the writer.
        final IndexedRaftLogEntry lastEntry = raft.getLog().getLastEntry();

        final boolean failedToAppend = tryToAppend(future, entry, index, lastEntry);
        if (failedToAppend) {
          flush(lastLogIndex - 1, request.prevLogIndex());
          return;
        }

        // If the last log index meets the commitIndex, break the append loop to avoid appending
        // uncommitted entries.
        if (!role().active() && index == commitIndex) {
          break;
        }
      }
    }

    // Set the first commit index.
    raft.setFirstCommitIndex(request.commitIndex());

    // Update the context commit and global indices.
    final long previousCommitIndex = raft.setCommitIndex(commitIndex);
    if (previousCommitIndex < commitIndex) {
      log.trace("Committed entries up to index {}", commitIndex);
    }

    // Make sure all entries are flushed before ack to ensure we have persisted what we acknowledge
    flush(lastLogIndex, request.prevLogIndex());

    // Return a successful append response.
    succeedAppend(lastLogIndex, future);
  }

  private void flush(final long lastFlushedIndex, final long previousEntryIndex) {
    if (lastFlushedIndex > previousEntryIndex) {
      raft.getLog().flush();
    }
  }

  private boolean tryToAppend(
      final CompletableFuture<AppendResponse> future,
      final ReplicatableRaftRecord entry,
      final long index,
      final IndexedRaftLogEntry lastEntry) {
    boolean failedToAppend = false;
    if (lastEntry != null) {
      // If the last written entry index is greater than the next append entry index,
      // we need to validate that the entry that's already in the log matches this entry.
      if (lastEntry.index() > index) {
        failedToAppend = !replaceExistingEntry(future, entry, index);
      } else if (lastEntry.index() == index) {
        // If the last written entry is equal to the append entry index, we don't need
        // to read the entry from disk and can just compare the last entry in the writer.

        // If the last entry term doesn't match the leader's term for the same entry, truncate
        // the log and append the leader's entry.
        if (lastEntry.term() != entry.term()) {
          raft.getLog().deleteAfter(index - 1);

          failedToAppend = !appendEntry(index, entry, future);
        }
      } else { // Otherwise, this entry is being appended at the end of the log.
        failedToAppend = !appendEntry(future, entry, index, lastEntry);
      }
    } else { // Otherwise, if the last entry is null just append the entry and log a message.
      failedToAppend = !appendEntry(index, entry, future);
    }
    return failedToAppend;
  }

  private boolean appendEntry(
      final CompletableFuture<AppendResponse> future,
      final ReplicatableRaftRecord entry,
      final long index,
      final IndexedRaftLogEntry lastEntry) {
    // If the last entry index isn't the previous index, throw an exception because
    // something crazy happened!
    if (lastEntry.index() != index - 1) {
      throw new IllegalStateException(
          "Log writer inconsistent with next append entry index " + index);
    }

    // Append the entry and log a message.
    return appendEntry(index, entry, future);
  }

  private boolean replaceExistingEntry(
      final CompletableFuture<AppendResponse> future,
      final ReplicatableRaftRecord entry,
      final long index) {

    try (final RaftLogReader reader = raft.getLog().openUncommittedReader()) {
      // Reset the reader to the current entry index.
      reader.seek(index);

      // If the reader does not have any next entry, that indicates an inconsistency between
      // the reader and writer.
      if (!reader.hasNext()) {
        throw new IllegalStateException("Log reader inconsistent with log writer");
      }

      // Read the existing entry from the log.
      final IndexedRaftLogEntry existingEntry = reader.next();

      // If the existing entry term doesn't match the leader's term for the same entry,
      // truncate
      // the log and append the leader's entry.
      if (existingEntry.term() != entry.term()) {
        raft.getLog().deleteAfter(index - 1);

        return appendEntry(index, entry, future);
      }
      return true;
    }
  }

  /**
   * Attempts to append an entry, returning {@code false} if the append fails due to an {@link
   * JournalException.OutOfDiskSpace} exception.
   */
  private boolean appendEntry(
      final long index,
      final ReplicatableRaftRecord entry,
      final CompletableFuture<AppendResponse> future) {
    try {
      final IndexedRaftLogEntry indexed;
      if (entry instanceof PersistedRaftRecord raftRecord) {
        indexed = raft.getLog().append(raftRecord);
      } else if (entry instanceof ReplicatableJournalRecord serializedJournalRecord) {
        indexed = raft.getLog().append(serializedJournalRecord);
      } else {
        throw new IllegalStateException(
            "Expected to append PersistedRaftRecord or ReplicatableJournalRecord, but found record of type %s"
                .formatted(entry.getClass()));
      }

      log.trace("Appended {}", indexed);
      raft.getReplicationMetrics().setAppendIndex(indexed.index());
    } catch (final JournalException.OutOfDiskSpace e) {
      log.trace("Failed to append entry at index {} due to out of disk space", index, e);
      raft.getLogCompactor().compact();
      failAppend(index - 1, future);
      return false;
    } catch (final InvalidChecksum e) {
      log.debug(
          "Failed to append entry at index {}. Entry checksum doesn't match entry data: ",
          index,
          e);
      failAppend(index - 1, future);
      return false;
    } catch (final InvalidIndex e) {
      failAppend(index - 1, future);
      return false;
    } catch (final Exception e) {
      log.error("Failed to append entry at index {}", entry.index(), e);
      failAppend(index - 1, future);
      return false;
    }
    return true;
  }

  /**
   * Returns a failed append response.
   *
   * @param lastLogIndex the last log index
   * @param future the append response future
   * @return the append response status
   */
  protected boolean failAppend(
      final long lastLogIndex, final CompletableFuture<AppendResponse> future) {
    return completeAppend(false, lastLogIndex, future);
  }

  /**
   * Returns a successful append response.
   *
   * @param lastLogIndex the last log index
   * @param future the append response future
   * @return the append response status
   */
  protected boolean succeedAppend(
      final long lastLogIndex, final CompletableFuture<AppendResponse> future) {
    return completeAppend(true, lastLogIndex, future);
  }

  /**
   * Returns a successful append response.
   *
   * @param succeeded whether the append succeeded
   * @param lastLogIndex the last log index
   * @param future the append response future
   * @return the append response status
   */
  protected boolean completeAppend(
      final boolean succeeded,
      final long lastLogIndex,
      final CompletableFuture<AppendResponse> future) {
    future.complete(
        logResponse(
            AppendResponse.builder()
                .withStatus(RaftResponse.Status.OK)
                .withTerm(raft.getTerm())
                .withSucceeded(succeeded)
                .withLastLogIndex(lastLogIndex)
                .withLastSnapshotIndex(raft.getCurrentSnapshotIndex())
                .build()));
    return succeeded;
  }

  private void resetLogOnReceivingSnapshot(final long snapshotIndex) {
    final var raftLog = raft.getLog();

    log.info(
        "Delete existing log (lastIndex '{}') and replace with received snapshot (index '{}'). First entry in the log will be at index {}",
        raftLog.getLastIndex(),
        snapshotIndex,
        snapshotIndex + 1);
    raftLog.reset(snapshotIndex + 1);
  }
}
