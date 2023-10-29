/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.testkit;

import io.camunda.zeebe.backup.api.Backup;
import io.camunda.zeebe.backup.api.BackupStatus;
import io.camunda.zeebe.backup.api.BackupStatusCode;
import io.camunda.zeebe.backup.api.BackupStore;
import io.camunda.zeebe.backup.common.BackupIdentifierImpl;
import io.camunda.zeebe.backup.testkit.support.TestBackupProvider;
import java.time.Duration;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public interface DeletingBackup {
  BackupStore getStore();

  @Test
  default void deletingNonExistingBackupSucceeds() {
    // when
    final var delete = getStore().delete(new BackupIdentifierImpl(1, 2, 3));

    // then
    Assertions.assertThat(delete).succeedsWithin(Duration.ofSeconds(10));
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void backupDoesNotExistAfterDeleting(final Backup backup) {
    // given
    getStore().save(backup).join();

    // when
    getStore().delete(backup.id()).join();

    // then
    Assertions.assertThat(getStore().getStatus(backup.id()).join())
        .returns(BackupStatusCode.DOES_NOT_EXIST, Assertions.from(BackupStatus::statusCode));
  }
}
