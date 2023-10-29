/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.transport.stream.api;

import io.atomix.cluster.MemberId;
import org.agrona.DirectBuffer;

public interface ClientStream<M> {
  ClientStreamId streamId();

  DirectBuffer streamType();

  M metadata();

  boolean isConnected(final MemberId memberId);
}
