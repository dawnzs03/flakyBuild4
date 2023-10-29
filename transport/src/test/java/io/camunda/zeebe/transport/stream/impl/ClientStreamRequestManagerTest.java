/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.transport.stream.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.atomix.cluster.MemberId;
import io.atomix.cluster.messaging.ClusterCommunicationService;
import io.camunda.zeebe.scheduler.testing.TestConcurrencyControl;
import io.camunda.zeebe.transport.stream.impl.ClientStreamRegistration.State;
import io.camunda.zeebe.transport.stream.impl.messages.StreamTopics;
import io.camunda.zeebe.util.buffer.BufferUtil;
import io.camunda.zeebe.util.buffer.BufferWriter;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class ClientStreamRequestManagerTest {

  private final ClusterCommunicationService mockTransport = mock(ClusterCommunicationService.class);
  private final ClientStreamRequestManager<TestMetadata> requestManager =
      new ClientStreamRequestManager<>(mockTransport, new TestConcurrencyControl());
  private final AggregatedClientStream<TestMetadata> clientStream =
      new AggregatedClientStream<>(
          UUID.randomUUID(),
          new LogicalId<>(new UnsafeBuffer(BufferUtil.wrapString("foo")), new TestMetadata()));

  @BeforeEach
  void setup() {
    when(mockTransport.send(any(), any(), any(), any(), any(), any()))
        .thenReturn(CompletableFuture.completedFuture(null));
    clientStream.open(requestManager, Collections.emptySet());
  }

  @Test
  void shouldNotAddWhenRemoving() {
    // given - adding the stream, then removing it without completing the request, leaving it in
    // REMOVING indefinitely
    final var serverId = MemberId.anonymous();
    final var pendingRequest = new CompletableFuture<byte[]>();
    when(mockTransport.<byte[], byte[]>send(
            eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any()))
        .thenReturn(pendingRequest);
    requestManager.add(clientStream, serverId);
    requestManager.remove(clientStream, serverId);

    // when
    requestManager.add(clientStream, serverId);

    // then - should only have sent one ADD request (the initial one)
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any());
  }

  @Test
  void shouldNotRemoveWhenRemoved() {
    // given
    final var serverId = MemberId.anonymous();
    requestManager.add(clientStream, serverId);
    requestManager.remove(clientStream, serverId);

    // when
    requestManager.remove(clientStream, serverId);

    // then - only one request sent ever
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
  }

  @Test
  void shouldWaitForPendingAddOnRemove() {
    // given
    final var pendingRequest = new CompletableFuture<byte[]>();
    final var serverId = MemberId.anonymous();
    when(mockTransport.<byte[], byte[]>send(any(), any(), any(), any(), any(), any()))
        .thenReturn(pendingRequest);
    requestManager.add(clientStream, serverId);

    // when
    requestManager.remove(clientStream, serverId);

    // then - no request sent until we complete the future
    verify(mockTransport, never())
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());

    // then - completes once future is completed
    pendingRequest.complete(new byte[0]);
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
  }

  @Test
  void shouldNotRemoveIfAlreadyRemoving() {
    // given - we add the stream then remove it, with the remove request pending indefinitely
    final var serverId = MemberId.anonymous();
    final var pendingRequest = new CompletableFuture<byte[]>();
    when(mockTransport.<byte[], byte[]>send(
            eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any()))
        .thenReturn(pendingRequest);
    requestManager.add(clientStream, serverId);
    requestManager.remove(clientStream, serverId);

    // when
    requestManager.remove(clientStream, serverId);

    // then - only one request should have been sent
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
  }

  @Test
  void shouldRemoveEvenIfPendingAddFails() {
    // given
    final var pendingRequest = new CompletableFuture<byte[]>();
    final var serverId = MemberId.anonymous();
    when(mockTransport.<byte[], byte[]>send(any(), any(), any(), any(), any(), any()))
        .thenReturn(pendingRequest)
        .thenReturn(CompletableFuture.completedFuture(new byte[0]));
    requestManager.add(clientStream, serverId);

    // when
    requestManager.remove(clientStream, serverId);

    // then - no request sent until we complete the future
    verify(mockTransport, never())
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());

    // then - completes once future is completed
    pendingRequest.completeExceptionally(new RuntimeException("failed"));
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
  }

  @Test
  void shouldAddRegistration() {
    // given
    final var serverId = MemberId.anonymous();

    // when
    requestManager.add(clientStream, serverId);

    // then
    verify(mockTransport)
        .send(eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isTrue();
  }

  @Test
  void shouldRetryWhenAddRequestFails() {
    // given
    final var serverId = MemberId.anonymous();
    when(mockTransport.send(any(), any(), any(), any(), eq(serverId), any()))
        .thenReturn(CompletableFuture.failedFuture(new RuntimeException("Expected")))
        .thenReturn(CompletableFuture.completedFuture(null));

    // when
    requestManager.add(clientStream, serverId);

    // then
    verify(mockTransport, times(2))
        .send(eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isTrue();
  }

  @Test
  void shouldSendRemoveRequest() {
    // given
    final var serverId = MemberId.anonymous();
    requestManager.add(clientStream, serverId);

    // when
    requestManager.remove(clientStream, serverId);

    // then
    verify(mockTransport)
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
  }

  @Test
  void shouldAddAfterRemove() {
    // given
    final var serverId = MemberId.anonymous();
    requestManager.add(clientStream, serverId);
    requestManager.remove(clientStream, serverId);

    // when
    requestManager.add(clientStream, serverId);

    // then
    verify(mockTransport)
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isTrue();
  }

  @Test
  void shouldNotSendRequestOnRemoveIfNeverAdded() {
    // given
    final var serverId = MemberId.anonymous();

    // when
    requestManager.remove(clientStream, serverId);

    // then
    verify(mockTransport, never())
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
  }

  @Test
  void shouldRetryWhenRemoveRequestFails() {
    // given
    final var serverId = MemberId.anonymous();
    requestManager.add(clientStream, serverId);
    when(mockTransport.send(any(), any(), any(), any(), eq(serverId), any()))
        .thenReturn(CompletableFuture.failedFuture(new RuntimeException("Expected")))
        .thenReturn(CompletableFuture.completedFuture(null));

    // when
    requestManager.remove(clientStream, serverId);

    // then
    verify(mockTransport, times(2))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
  }

  @Test
  void shouldNotRetryAddIfClosed() {
    // given
    final var pendingRequest = new CompletableFuture<byte[]>();
    final var serverId = MemberId.anonymous();
    final var registration = requestManager.registrationFor(clientStream, serverId);
    requestManager.add(clientStream, serverId);
    when(mockTransport.<byte[], byte[]>send(any(), any(), any(), any(), eq(serverId), any()))
        .thenReturn(pendingRequest);

    // when
    requestManager.add(clientStream, serverId);
    registration.transitionToClosed();
    pendingRequest.completeExceptionally(new RuntimeException("failed"));

    // then
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
    assertThat(registration.state()).isEqualTo(State.CLOSED);
  }

  @Test
  void shouldNotRetryRemoveIfClosed() {
    // given
    final var pendingRequest = new CompletableFuture<byte[]>();
    final var serverId = MemberId.anonymous();
    requestManager.add(clientStream, serverId);
    when(mockTransport.<byte[], byte[]>send(any(), any(), any(), any(), eq(serverId), any()))
        .thenReturn(pendingRequest);

    // when - remove all, which will close all registrations
    requestManager.remove(clientStream, serverId);
    requestManager.removeAll(Collections.singleton(serverId));
    pendingRequest.completeExceptionally(new RuntimeException("failed"));

    // then
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.REMOVE.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
  }

  @Test
  void shouldNotRetryAddIfRemoving() {
    // given
    final var pendingRequest = new CompletableFuture<byte[]>();
    final var serverId = MemberId.anonymous();
    when(mockTransport.<byte[], byte[]>send(
            eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any()))
        .thenReturn(pendingRequest);

    // when - remove all, which will close all registrations
    requestManager.add(clientStream, serverId);
    requestManager.removeAll(Collections.singleton(serverId));
    pendingRequest.completeExceptionally(new RuntimeException("failed"));

    // then
    verify(mockTransport, times(1))
        .send(eq(StreamTopics.ADD.topic()), any(), any(), any(), eq(serverId), any());
    assertThat(clientStream.isConnected(serverId)).isFalse();
  }

  @Test
  void shouldSendRemoveAllRequestToAllServers() {
    // given
    final MemberId server1 = MemberId.from("1");
    final MemberId server2 = MemberId.from("2");
    final var servers = Set.of(server1, server2);

    // when
    requestManager.removeAll(servers);

    // then
    verify(mockTransport)
        .unicast(eq(StreamTopics.REMOVE_ALL.topic()), any(), any(), eq(server1), anyBoolean());
    verify(mockTransport)
        .unicast(eq(StreamTopics.REMOVE_ALL.topic()), any(), any(), eq(server2), anyBoolean());
  }

  private static class TestMetadata implements BufferWriter {
    @Override
    public int getLength() {
      return Integer.BYTES;
    }

    @Override
    public void write(final MutableDirectBuffer buffer, final int offset) {
      buffer.putInt(offset, 0);
    }
  }
}
