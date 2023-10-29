/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.testkit;

import static org.assertj.core.api.Assertions.assertThat;

import io.camunda.zeebe.backup.api.Backup;
import io.camunda.zeebe.backup.api.BackupStatusCode;
import io.camunda.zeebe.backup.api.BackupStore;
import io.camunda.zeebe.backup.testkit.support.TestBackupProvider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public interface UpdatingBackupStatus {

  BackupStore getStore();

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void backupIsMarkedAsCompleted(final Backup backup) {
    // when
    getStore().save(backup).join();

    // then
    final var readStatus = getStore().getStatus(backup.id()).join();

    Assertions.assertThat(readStatus.statusCode()).isEqualTo(BackupStatusCode.COMPLETED);
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void backupCanBeMarkedAsFailed(final Backup backup) {
    // given
    getStore().save(backup).join();

    // when
    getStore().markFailed(backup.id(), "error").join();

    // then
    final var readStatus = getStore().getStatus(backup.id()).join();

    Assertions.assertThat(readStatus.statusCode()).isEqualTo(BackupStatusCode.FAILED);
    Assertions.assertThat(readStatus.failureReason()).hasValue("error");
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void markingAsFailedUpdatesTimestamp(final Backup backup) {
    // given
    getStore().save(backup).join();
    final var initialTimestamp =
        getStore().getStatus(backup.id()).join().lastModified().orElseThrow();

    // when
    getStore().markFailed(backup.id(), "failed for testing").join();

    // then
    assertThat(getStore().getStatus(backup.id()).join().lastModified().orElseThrow())
        .isAfter(initialTimestamp);
  }
}
