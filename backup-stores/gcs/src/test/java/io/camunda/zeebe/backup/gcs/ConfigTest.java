/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH under
 * one or more contributor license agreements. See the NOTICE file distributed
 * with this work for additional information regarding copyright ownership.
 * Licensed under the Zeebe Community License 1.1. You may not use this file
 * except in compliance with the Zeebe Community License 1.1.
 */
package io.camunda.zeebe.backup.gcs;

import io.camunda.zeebe.backup.gcs.GcsBackupStoreException.ConfigurationException;
import io.camunda.zeebe.backup.gcs.GcsConnectionConfig.Authentication.Auto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

final class ConfigTest {

  @Test
  void shouldRejectMissingBucketName() {
    // given
    final String bucketName = null;
    // when
    final var config = new GcsBackupConfig.Builder().withBucketName(bucketName);

    // then
    Assertions.assertThatThrownBy(config::build)
        .isInstanceOf(ConfigurationException.class)
        .hasMessageContaining("bucketName");
  }

  @Test
  void shouldRejectEmptyBucketName() {
    // given
    final var bucketName = "";
    // when
    final var config = new GcsBackupConfig.Builder().withBucketName(bucketName);

    // then
    Assertions.assertThatThrownBy(config::build)
        .isInstanceOf(ConfigurationException.class)
        .hasMessageContaining("bucketName");
  }

  @Test
  void shouldAcceptSingleSlashAsBasePath() {
    // given
    final var bucketName = "test";
    final var basePath = "/";

    // when
    final var config =
        new GcsBackupConfig.Builder().withBucketName(bucketName).withBasePath(basePath).build();

    // then
    Assertions.assertThat(config.basePath()).isNull();
  }

  @Test
  void shouldRemoveLeadingSlashesFromBasePath() {
    // given
    final var bucketName = "test";
    final var basePath = "/tenant";
    // when
    final var config =
        new GcsBackupConfig.Builder().withBucketName(bucketName).withBasePath(basePath).build();

    // then
    Assertions.assertThat(config.basePath()).isEqualTo("tenant");
  }

  @Test
  void shouldRemoveTrailingSlashesFromBasePath() {
    // given
    final var bucketName = "test";
    final var basePath = "/tenants/abc/";
    // when
    final var config =
        new GcsBackupConfig.Builder().withBucketName(bucketName).withBasePath(basePath).build();

    // then
    Assertions.assertThat(config.basePath()).isEqualTo("tenants/abc");
  }

  @Test
  void shouldRejectBasePathConsistingOfOnlySlashes() {
    // given
    final var bucketName = "test";
    final var basePath = "//";
    // when
    final var config =
        new GcsBackupConfig.Builder().withBucketName(bucketName).withBasePath(basePath);

    // then
    Assertions.assertThatThrownBy(config::build)
        .isInstanceOf(ConfigurationException.class)
        .hasMessageContaining("basePath");
  }

  @Test
  void shouldUseDefaultApplicationCredentialsByDefault() {
    // given
    final var bucketName = "test";

    // when
    final var config = new GcsBackupConfig.Builder().withBucketName(bucketName).build();

    // then
    Assertions.assertThat(config.connection().auth()).isInstanceOf(Auto.class);
  }

  @Test
  void shouldUseNoAuthenticationWhenRequested() {
    // given
    final var bucketName = "test";

    // when
    final var config =
        new GcsBackupConfig.Builder().withBucketName(bucketName).withoutAuthentication().build();

    // then
    Assertions.assertThat(config.connection().auth())
        .isInstanceOf(GcsConnectionConfig.Authentication.None.class);
  }
}
