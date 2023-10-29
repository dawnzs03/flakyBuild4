/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.test.util.record;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RecordingExporterTestWatcher extends TestWatcher {

  public static final Logger LOG = LoggerFactory.getLogger("io.camunda.zeebe.test.records");

  @Override
  protected void failed(final Throwable e, final Description description) {
    RecordLogger.logRecords();
  }

  @Override
  protected void starting(final Description description) {
    RecordingExporter.reset();
  }
}
