/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.common;

import io.camunda.zeebe.backup.api.BackupIdentifier;

public record BackupIdentifierImpl(int nodeId, int partitionId, long checkpointId)
    implements BackupIdentifier {

  public static BackupIdentifierImpl from(final BackupIdentifier id) {
    return new BackupIdentifierImpl(id.nodeId(), id.partitionId(), id.checkpointId());
  }
}
