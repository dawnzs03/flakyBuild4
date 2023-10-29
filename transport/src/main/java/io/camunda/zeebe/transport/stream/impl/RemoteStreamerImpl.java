/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.transport.stream.impl;

import io.atomix.cluster.MemberId;
import io.atomix.cluster.messaging.ClusterCommunicationService;
import io.camunda.zeebe.scheduler.Actor;
import io.camunda.zeebe.transport.stream.api.RemoteStream;
import io.camunda.zeebe.transport.stream.api.RemoteStreamErrorHandler;
import io.camunda.zeebe.transport.stream.api.RemoteStreamMetrics;
import io.camunda.zeebe.transport.stream.api.RemoteStreamer;
import io.camunda.zeebe.transport.stream.impl.messages.PushStreamRequest;
import io.camunda.zeebe.transport.stream.impl.messages.StreamTopics;
import io.camunda.zeebe.util.buffer.BufferReader;
import io.camunda.zeebe.util.buffer.BufferUtil;
import io.camunda.zeebe.util.buffer.BufferWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.agrona.DirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;

/**
 * {@link RemoteStreamImpl} is an actor, and any payload pushed will be pushed asynchronously.
 *
 * <p>NOTE: any payload pushed is sent via the stream from {@link #streamFor(DirectBuffer)} will be
 * asynchronous, so the payload should be immutable, and the errors reported to the given {@link
 * RemoteStreamErrorHandler} may be reported on different threads.
 */
public final class RemoteStreamerImpl<M extends BufferReader, P extends BufferWriter> extends Actor
    implements RemoteStreamer<M, P> {
  private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(5);

  private final ClusterCommunicationService transport;
  private final ImmutableStreamRegistry<M> registry;
  private final RemoteStreamPusher<P> remoteStreamPusher;
  private final RemoteStreamErrorHandler<P> errorHandler;

  public RemoteStreamerImpl(
      final ClusterCommunicationService transport,
      final ImmutableStreamRegistry<M> registry,
      final RemoteStreamErrorHandler<P> errorHandler,
      final RemoteStreamMetrics metrics) {
    this.transport = Objects.requireNonNull(transport, "must specify a network transport");
    this.registry = Objects.requireNonNull(registry, "must specify a job stream registry");
    this.errorHandler = Objects.requireNonNull(errorHandler, "must specify an error handler");

    remoteStreamPusher = new RemoteStreamPusher<>(this::send, actor::run, metrics);
  }

  @Override
  public Optional<RemoteStream<M, P>> streamFor(final DirectBuffer streamType) {
    final UnsafeBuffer streamTypeBuffer = new UnsafeBuffer(streamType);
    final var consumers = registry.get(streamTypeBuffer);
    if (consumers.isEmpty()) {
      return Optional.empty();
    }

    return pickStream(consumers)
        .map(target -> new RemoteStreamImpl<>(target, remoteStreamPusher, errorHandler));
  }

  private Optional<AggregatedRemoteStream<M>> pickStream(
      final Set<AggregatedRemoteStream<M>> consumers) {
    final var targets = new ArrayList<>(consumers);
    Collections.shuffle(targets);

    for (final var target : targets) {
      if (!target.streamConsumers().isEmpty()) {
        return Optional.of(target);
      }
    }

    return Optional.empty();
  }

  private CompletableFuture<Void> send(final PushStreamRequest request, final MemberId receiver) {
    return transport
        .send(
            StreamTopics.PUSH.topic(),
            request,
            BufferUtil::bufferAsArray,
            Function.identity(),
            receiver,
            REQUEST_TIMEOUT)
        .thenApply(ok -> null);
  }
}
