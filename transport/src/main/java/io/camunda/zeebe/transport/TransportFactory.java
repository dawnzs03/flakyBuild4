/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.transport;

import io.atomix.cluster.messaging.ClusterCommunicationService;
import io.atomix.cluster.messaging.MessagingService;
import io.camunda.zeebe.scheduler.ActorSchedulingService;
import io.camunda.zeebe.transport.impl.AtomixClientTransportAdapter;
import io.camunda.zeebe.transport.impl.AtomixServerTransport;
import io.camunda.zeebe.transport.stream.api.ClientStreamMetrics;
import io.camunda.zeebe.transport.stream.api.ClientStreamService;
import io.camunda.zeebe.transport.stream.api.RemoteStreamErrorHandler;
import io.camunda.zeebe.transport.stream.api.RemoteStreamMetrics;
import io.camunda.zeebe.transport.stream.api.RemoteStreamService;
import io.camunda.zeebe.transport.stream.impl.ClientStreamServiceImpl;
import io.camunda.zeebe.transport.stream.impl.RemoteStreamApiHandler;
import io.camunda.zeebe.transport.stream.impl.RemoteStreamEndpoint;
import io.camunda.zeebe.transport.stream.impl.RemoteStreamRegistry;
import io.camunda.zeebe.transport.stream.impl.RemoteStreamServiceImpl;
import io.camunda.zeebe.transport.stream.impl.RemoteStreamerImpl;
import io.camunda.zeebe.util.buffer.BufferReader;
import io.camunda.zeebe.util.buffer.BufferWriter;
import java.util.function.Supplier;

public final class TransportFactory {

  private final ActorSchedulingService actorSchedulingService;

  public TransportFactory(final ActorSchedulingService actorSchedulingService) {
    this.actorSchedulingService = actorSchedulingService;
  }

  public ServerTransport createServerTransport(
      final int nodeId, final MessagingService messagingService) {
    final var atomixServerTransport = new AtomixServerTransport(messagingService);
    actorSchedulingService.submitActor(atomixServerTransport);
    return atomixServerTransport;
  }

  public ClientTransport createClientTransport(final MessagingService messagingService) {
    final var atomixClientTransportAdapter = new AtomixClientTransportAdapter(messagingService);
    actorSchedulingService.submitActor(atomixClientTransportAdapter);
    return atomixClientTransportAdapter;
  }

  public <M extends BufferReader, P extends BufferWriter>
      RemoteStreamService<M, P> createRemoteStreamServer(
          final ClusterCommunicationService clusterCommunicationService,
          final Supplier<M> metadataFactory,
          final RemoteStreamErrorHandler<P> errorHandler,
          final RemoteStreamMetrics metrics) {
    final RemoteStreamRegistry<M> registry = new RemoteStreamRegistry<>(metrics);
    return new RemoteStreamServiceImpl<>(
        new RemoteStreamerImpl<>(clusterCommunicationService, registry, errorHandler, metrics),
        new RemoteStreamEndpoint<>(
            clusterCommunicationService, new RemoteStreamApiHandler<>(registry, metadataFactory)));
  }

  public <M extends BufferWriter> ClientStreamService<M> createRemoteStreamClient(
      final ClusterCommunicationService clusterCommunicationService,
      final ClientStreamMetrics metrics) {
    return new ClientStreamServiceImpl<>(clusterCommunicationService, metrics);
  }
}
