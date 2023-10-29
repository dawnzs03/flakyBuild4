/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.management;

import io.camunda.zeebe.backup.api.Backup;
import io.camunda.zeebe.backup.api.BackupIdentifier;
import io.camunda.zeebe.scheduler.future.ActorFuture;

interface InProgressBackup {

  long checkpointId();

  long checkpointPosition();

  BackupIdentifier id();

  ActorFuture<Void> findValidSnapshot();

  ActorFuture<Void> reserveSnapshot();

  ActorFuture<Void> findSnapshotFiles();

  ActorFuture<Void> findSegmentFiles();

  Backup createBackup();

  void close();
}
