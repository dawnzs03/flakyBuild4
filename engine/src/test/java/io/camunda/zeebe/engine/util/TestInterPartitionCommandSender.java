/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.util;

import io.camunda.zeebe.logstreams.log.LogAppendEntry;
import io.camunda.zeebe.logstreams.log.LogStreamWriter;
import io.camunda.zeebe.protocol.Protocol;
import io.camunda.zeebe.protocol.impl.record.RecordMetadata;
import io.camunda.zeebe.protocol.impl.record.UnifiedRecordValue;
import io.camunda.zeebe.protocol.record.RecordType;
import io.camunda.zeebe.protocol.record.ValueType;
import io.camunda.zeebe.protocol.record.intent.Intent;
import io.camunda.zeebe.stream.api.InterPartitionCommandSender;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TestInterPartitionCommandSender implements InterPartitionCommandSender {

  private final Map<Integer, LogStreamWriter> writers = new HashMap<>();
  private final Function<Integer, LogStreamWriter> writerFactory;

  public TestInterPartitionCommandSender(final Function<Integer, LogStreamWriter> writerFactory) {
    this.writerFactory = writerFactory;
  }

  @Override
  public void sendCommand(
      final int receiverPartitionId,
      final ValueType valueType,
      final Intent intent,
      final UnifiedRecordValue command) {
    sendCommand(receiverPartitionId, valueType, intent, null, command);
  }

  @Override
  public void sendCommand(
      final int receiverPartitionId,
      final ValueType valueType,
      final Intent intent,
      final Long recordKey,
      final UnifiedRecordValue command) {
    final var metadata =
        new RecordMetadata().recordType(RecordType.COMMAND).intent(intent).valueType(valueType);
    final var writer = writers.get(receiverPartitionId);
    final LogAppendEntry entry;
    if (recordKey != null) {
      entry = LogAppendEntry.of(recordKey, metadata, command);
    } else {
      entry = LogAppendEntry.of(metadata, command);
    }

    writer.tryWrite(entry);
  }

  // Pre-initialize dedicated writers.
  // We must build new writers because reusing the writers from the environmentRule is unsafe.
  // We can't build them on-demand during `sendCommand` because that might run within an actor
  // context where we can't build new `SyncLogStream`s.
  public void initializeWriters(final int partitionCount) {
    for (int i = Protocol.DEPLOYMENT_PARTITION;
        i < Protocol.DEPLOYMENT_PARTITION + partitionCount;
        i++) {
      writers.put(i, writerFactory.apply(i));
    }
  }
}
