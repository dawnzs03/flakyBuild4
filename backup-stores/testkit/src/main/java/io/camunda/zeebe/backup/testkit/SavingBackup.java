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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public interface SavingBackup {
  BackupStore getStore();

  Class<? extends Exception> getBackupInInvalidStateExceptionClass();

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void savingBackupIsSuccessful(final Backup backup) {
    Assertions.assertThat(getStore().save(backup)).succeedsWithin(Duration.ofSeconds(10));
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void backupFailsIfBackupAlreadyExists(final Backup backup) {
    // when
    getStore().save(backup).join();

    // then
    Assertions.assertThat(getStore().save(backup))
        .failsWithin(Duration.ofSeconds(10))
        .withThrowableOfType(Throwable.class)
        .withRootCauseInstanceOf(getBackupInInvalidStateExceptionClass());
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void backupFailsIfFilesAreMissing(final Backup backup) throws IOException {
    // when
    final var deletedFile = backup.segments().files().stream().findFirst().orElseThrow();
    Files.delete(deletedFile);

    // then
    Assertions.assertThat(getStore().save(backup))
        .failsWithin(Duration.ofMinutes(1))
        .withThrowableOfType(Throwable.class)
        .withRootCauseInstanceOf(NoSuchFileException.class)
        .withMessageContaining(deletedFile.toString());
  }

  @ParameterizedTest
  @ArgumentsSource(TestBackupProvider.class)
  default void shouldNotOverwriteCompletedBackup(final Backup backup) {
    // given
    getStore().save(backup).join();
    final var firstStatus = getStore().getStatus(backup.id()).join();

    // when
    final CompletableFuture<Void> saveAttempt = getStore().save(backup);

    // then
    assertThat(saveAttempt)
        .failsWithin(Duration.ofMinutes(1))
        .withThrowableOfType(ExecutionException.class);

    final var status = getStore().getStatus(backup.id()).join();
    assertThat(status.statusCode()).isEqualTo(BackupStatusCode.COMPLETED);
    assertThat(status.lastModified()).isEqualTo(firstStatus.lastModified());
  }
}
