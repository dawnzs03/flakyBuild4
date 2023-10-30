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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface PeripheralsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.PeripheralsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>
   * string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The metastoreService.
   */
  java.lang.String getMetastoreService();
  /**
   *
   *
   * <pre>
   * Optional. Resource name of an existing Dataproc Metastore service.
   *
   * Example:
   *
   * * `projects/[project_id]/locations/[region]/services/[service_id]`
   * </pre>
   *
   * <code>
   * string metastore_service = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for metastoreService.
   */
  com.google.protobuf.ByteString getMetastoreServiceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkHistoryServerConfig field is set.
   */
  boolean hasSparkHistoryServerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkHistoryServerConfig.
   */
  com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig();
  /**
   *
   *
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder
      getSparkHistoryServerConfigOrBuilder();
}
