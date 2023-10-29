/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.test.util.record;

import io.camunda.zeebe.protocol.record.Record;
import io.camunda.zeebe.protocol.record.value.SignalRecordValue;
import java.util.stream.Stream;

public final class SignalRecordStream
    extends ExporterRecordWithVariablesStream<SignalRecordValue, SignalRecordStream> {

  public SignalRecordStream(final Stream<Record<SignalRecordValue>> wrappedStream) {
    super(wrappedStream);
  }

  @Override
  protected SignalRecordStream supply(final Stream<Record<SignalRecordValue>> wrappedStream) {
    return new SignalRecordStream(wrappedStream);
  }

  public SignalRecordStream withSignalName(final String signalName) {
    return valueFilter(v -> signalName.equals(v.getSignalName()));
  }
}
