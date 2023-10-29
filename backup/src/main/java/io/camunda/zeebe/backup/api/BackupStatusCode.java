/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.api;

import java.util.Comparator;

public enum BackupStatusCode {
  // WARNING! Must be ordered from "worst" to "best" for comparator below!
  DOES_NOT_EXIST,
  FAILED,

  IN_PROGRESS,
  COMPLETED;

  public static final Comparator<BackupStatus> BY_STATUS =
      Comparator.comparing(BackupStatus::statusCode);
}
