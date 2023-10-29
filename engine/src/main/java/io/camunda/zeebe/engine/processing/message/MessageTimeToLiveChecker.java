/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.processing.message;

import io.camunda.zeebe.engine.state.immutable.MessageState;
import io.camunda.zeebe.engine.state.immutable.MessageState.Index;
import io.camunda.zeebe.protocol.impl.record.value.message.MessageRecord;
import io.camunda.zeebe.protocol.record.intent.MessageIntent;
import io.camunda.zeebe.scheduler.clock.ActorClock;
import io.camunda.zeebe.stream.api.scheduling.ProcessingScheduleService;
import io.camunda.zeebe.stream.api.scheduling.Task;
import io.camunda.zeebe.stream.api.scheduling.TaskResult;
import io.camunda.zeebe.stream.api.scheduling.TaskResultBuilder;
import java.time.Duration;
import org.agrona.collections.MutableInteger;

/**
 * The Message TTL Checker looks for expired message deadlines, and for each of those it writes an
 * EXPIRE Message command.
 *
 * <p>To prevent that it clogs the log stream with too many EXPIRE Message commands, it only writes
 * a limited number of these commands in a single run of {@link #execute(TaskResultBuilder)}.
 *
 * <p>It determines whether to reschedule itself immediately, or after the configured {@link
 * #executionInterval interval}. If it reschedules itself immediately, then it will continue where
 * it left off the last time. Otherwise, it starts with the first expired message deadline it can
 * find.
 */
public final class MessageTimeToLiveChecker implements Task {

  private final MessageRecord emptyDeleteMessageCommand =
      new MessageRecord().setName("").setCorrelationKey("").setTimeToLive(-1L);

  /** This determines the duration that the TTL checker is idle after it completes an execution. */
  private final Duration executionInterval;

  /** This determines the maximum number of EXPIRE commands it will attempt to fit in the result. */
  private final int batchLimit;

  /** This determines whether to run this checker async or not. */
  private final boolean enableMessageTtlCheckerAsync;

  private final ProcessingScheduleService scheduleService;
  private final MessageState messageState;

  /** Keeps track of the timestamp to compare the message deadlines against. */
  private long currentTimestamp = -1;

  /** Keeps track of where to continue between iterations. */
  private MessageState.Index lastIndex;

  public MessageTimeToLiveChecker(
      final Duration executionInterval,
      final int batchLimit,
      final boolean enableMessageTtlCheckerAsync,
      final ProcessingScheduleService scheduleService,
      final MessageState messageState) {
    this.executionInterval = executionInterval;
    this.batchLimit = batchLimit;
    this.enableMessageTtlCheckerAsync = enableMessageTtlCheckerAsync;
    this.messageState = messageState;
    this.scheduleService = scheduleService;
    lastIndex = null;
  }

  @Override
  public TaskResult execute(final TaskResultBuilder taskResultBuilder) {
    if (currentTimestamp == -1) {
      currentTimestamp = ActorClock.currentTimeMillis();
    }

    final var counter = new MutableInteger(0);
    final boolean shouldContinueWhereLeftOff =
        messageState.visitMessagesWithDeadlineBeforeTimestamp(
            currentTimestamp,
            lastIndex,
            (deadline, expiredMessageKey) -> {
              final var newIndex = new Index(expiredMessageKey, deadline);
              final boolean wasIndexAlreadyVisitedLastTime = newIndex.equals(lastIndex);
              lastIndex = newIndex;

              if (wasIndexAlreadyVisitedLastTime) {
                // skip this entry
                return true;
              }

              final boolean stillFitsInResult =
                  taskResultBuilder.appendCommandRecord(
                      expiredMessageKey, MessageIntent.EXPIRE, emptyDeleteMessageCommand);
              return stillFitsInResult && counter.incrementAndGet() < batchLimit;
            });

    if (shouldContinueWhereLeftOff) {
      reschedule(Duration.ZERO);
    } else {
      lastIndex = null;
      currentTimestamp = -1;
      reschedule(executionInterval);
    }

    return taskResultBuilder.build();
  }

  private void reschedule(final Duration idleInterval) {
    if (enableMessageTtlCheckerAsync) {
      scheduleService.runDelayedAsync(idleInterval, this);
    } else {
      scheduleService.runDelayed(idleInterval, this);
    }
  }
}
