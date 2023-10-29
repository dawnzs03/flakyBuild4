/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.s3.manifest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.camunda.zeebe.backup.api.BackupIdentifier;
import java.time.Instant;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME, property = "statusCode")
@JsonSubTypes({
  @Type(value = CompletedBackupManifest.class, name = "completed"),
  @Type(value = InProgressBackupManifest.class, name = "in_progress"),
  @Type(value = FailedBackupManifest.class, name = "failed")
})
public sealed interface ValidBackupManifest extends Manifest
    permits InProgressBackupManifest, CompletedBackupManifest, FailedBackupManifest {

  @Override
  BackupIdentifier id();

  Instant createdAt();

  Instant modifiedAt();
}
