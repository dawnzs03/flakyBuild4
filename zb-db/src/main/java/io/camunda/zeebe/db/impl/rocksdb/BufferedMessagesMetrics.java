/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.db.impl.rocksdb;

import io.prometheus.client.Gauge;

public class BufferedMessagesMetrics {

  private static final Gauge BUFFERED_MESSAGES_COUNT =
      Gauge.build()
          .namespace("zeebe")
          .name("buffered_messages_count")
          .help("Current number of buffered messages.")
          .labelNames("partition")
          .register();

  private final String partitionIdLabel;

  public BufferedMessagesMetrics(final int partitionId) {
    partitionIdLabel = String.valueOf(partitionId);
  }

  public void setBufferedMessagesCounter(final long counter) {
    BUFFERED_MESSAGES_COUNT.labels(partitionIdLabel).set((int) counter);
  }
}
