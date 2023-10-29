/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.engine.state;

import io.camunda.zeebe.protocol.record.RecordValue;
import io.camunda.zeebe.protocol.record.intent.Intent;

/** Applies the state changes for a specific event. */
public interface EventApplier {

  /**
   * Returns the latest EventApplier version of a given Intent.
   *
   * @param intent the Intent of the EventApplier
   * @return the latest version of the given intent, -1 if no EventApplier is found
   */
  int getLatestVersion(final Intent intent);

  /**
   * Apply the state changes of the given event. It will use the event applier that matches the
   * specified version.
   *
   * @param key the key of the event
   * @param intent the intent of the event
   * @param recordValue the value of the event
   * @param recordVersion the record version of the event
   */
  void applyState(long key, Intent intent, RecordValue recordValue, final int recordVersion);
}
