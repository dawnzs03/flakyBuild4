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
// source: google/cloud/datacatalog/v1/bigquery.proto

package com.google.cloud.datacatalog.v1;

public interface BigQueryConnectionSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.BigQueryConnectionSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of the BigQuery connection.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for connectionType.
   */
  int getConnectionTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the BigQuery connection.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType connection_type = 1;
   * </code>
   *
   * @return The connectionType.
   */
  com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionType getConnectionType();

  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   *
   * @return Whether the cloudSql field is set.
   */
  boolean hasCloudSql();
  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   *
   * @return The cloudSql.
   */
  com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec getCloudSql();
  /**
   *
   *
   * <pre>
   * Specification for the BigQuery connection to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpec cloud_sql = 2;</code>
   */
  com.google.cloud.datacatalog.v1.CloudSqlBigQueryConnectionSpecOrBuilder getCloudSqlOrBuilder();

  /**
   *
   *
   * <pre>
   * True if there are credentials attached to the BigQuery connection; false
   * otherwise.
   * </pre>
   *
   * <code>bool has_credential = 3;</code>
   *
   * @return The hasCredential.
   */
  boolean getHasCredential();

  com.google.cloud.datacatalog.v1.BigQueryConnectionSpec.ConnectionSpecCase getConnectionSpecCase();
}
