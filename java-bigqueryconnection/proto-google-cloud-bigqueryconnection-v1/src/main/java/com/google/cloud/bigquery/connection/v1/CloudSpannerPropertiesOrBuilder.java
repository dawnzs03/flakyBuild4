/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public interface CloudSpannerPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.CloudSpannerProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Spanner database in the form `project/instance/database'
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Cloud Spanner database in the form `project/instance/database'
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * If parallelism should be used when reading from Cloud Spanner
   * </pre>
   *
   * <code>bool use_parallelism = 2;</code>
   *
   * @return The useParallelism.
   */
  boolean getUseParallelism();

  /**
   *
   *
   * <pre>
   * Allows setting max parallelism per query when executing on Spanner
   * independent compute resources. If unspecified, default values of
   * parallelism are chosen that are dependent on the Cloud Spanner instance
   * configuration.
   *
   * REQUIRES: `use_parallelism` must be set.
   * REQUIRES: Either `use_data_boost` or `use_serverless_analytics` must be
   * set.
   * </pre>
   *
   * <code>int32 max_parallelism = 5;</code>
   *
   * @return The maxParallelism.
   */
  int getMaxParallelism();

  /**
   *
   *
   * <pre>
   * If the serverless analytics service should be used to read data from Cloud
   * Spanner.
   * Note: `use_parallelism` must be set when using serverless analytics.
   * </pre>
   *
   * <code>bool use_serverless_analytics = 3;</code>
   *
   * @return The useServerlessAnalytics.
   */
  boolean getUseServerlessAnalytics();

  /**
   *
   *
   * <pre>
   * If set, the request will be executed via Spanner independent compute
   * resources.
   * REQUIRES: `use_parallelism` must be set.
   *
   * NOTE: `use_serverless_analytics` will be deprecated. Prefer
   * `use_data_boost` over `use_serverless_analytics`.
   * </pre>
   *
   * <code>bool use_data_boost = 6;</code>
   *
   * @return The useDataBoost.
   */
  boolean getUseDataBoost();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Spanner database role for fine-grained access control.
   * The Cloud Spanner admin should have provisioned the database role with
   * appropriate permissions, such as `SELECT` and `INSERT`. Other users should
   * only use roles provided by their Cloud Spanner admins.
   *
   * For more details, see [About fine-grained access control]
   * (https://cloud.google.com/spanner/docs/fgac-about).
   *
   * REQUIRES: The database role name must start with a letter, and can only
   * contain letters, numbers, and underscores.
   * </pre>
   *
   * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The databaseRole.
   */
  java.lang.String getDatabaseRole();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Spanner database role for fine-grained access control.
   * The Cloud Spanner admin should have provisioned the database role with
   * appropriate permissions, such as `SELECT` and `INSERT`. Other users should
   * only use roles provided by their Cloud Spanner admins.
   *
   * For more details, see [About fine-grained access control]
   * (https://cloud.google.com/spanner/docs/fgac-about).
   *
   * REQUIRES: The database role name must start with a letter, and can only
   * contain letters, numbers, and underscores.
   * </pre>
   *
   * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for databaseRole.
   */
  com.google.protobuf.ByteString getDatabaseRoleBytes();
}
