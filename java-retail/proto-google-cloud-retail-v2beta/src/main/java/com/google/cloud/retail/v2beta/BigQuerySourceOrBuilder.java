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
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

public interface BigQuerySourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.BigQuerySource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   *
   * Only supported in
   * [ImportProductsRequest][google.cloud.retail.v2beta.ImportProductsRequest].
   * </pre>
   *
   * <code>.google.type.Date partition_date = 6;</code>
   *
   * @return Whether the partitionDate field is set.
   */
  boolean hasPartitionDate();
  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   *
   * Only supported in
   * [ImportProductsRequest][google.cloud.retail.v2beta.ImportProductsRequest].
   * </pre>
   *
   * <code>.google.type.Date partition_date = 6;</code>
   *
   * @return The partitionDate.
   */
  com.google.type.Date getPartitionDate();
  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   *
   * Only supported in
   * [ImportProductsRequest][google.cloud.retail.v2beta.ImportProductsRequest].
   * </pre>
   *
   * <code>.google.type.Date partition_date = 6;</code>
   */
  com.google.type.DateOrBuilder getPartitionDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The project ID (can be project # or ID) that the BigQuery source is in with
   * a length limit of 128 characters. If not specified, inherits the project
   * ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 5;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project ID (can be project # or ID) that the BigQuery source is in with
   * a length limit of 128 characters. If not specified, inherits the project
   * ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 5;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery data set to copy the data from with a length limit
   * of 1,024 characters.
   * </pre>
   *
   * <code>string dataset_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery data set to copy the data from with a length limit
   * of 1,024 characters.
   * </pre>
   *
   * <code>string dataset_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to copy the data from with a length limit of
   * 1,024 characters.
   * </pre>
   *
   * <code>string table_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to copy the data from with a length limit of
   * 1,024 characters.
   * </pre>
   *
   * <code>string table_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * BigQuery export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 3;</code>
   *
   * @return The gcsStagingDir.
   */
  java.lang.String getGcsStagingDir();
  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * BigQuery export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 3;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  com.google.protobuf.ByteString getGcsStagingDirBytes();

  /**
   *
   *
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for product imports:
   *
   * * `product` (default): One JSON
   * [Product][google.cloud.retail.v2beta.Product] per line. Each product must
   *   have a valid [Product.id][google.cloud.retail.v2beta.Product.id].
   * * `product_merchant_center`: See [Importing catalog data from Merchant
   *   Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc).
   *
   * Supported values for user events imports:
   *
   * * `user_event` (default): One JSON
   * [UserEvent][google.cloud.retail.v2beta.UserEvent] per line.
   * * `user_event_ga360`:
   *   The schema is available here:
   *   https://support.google.com/analytics/answer/3437719.
   * * `user_event_ga4`:
   *   The schema is available here:
   *   https://support.google.com/analytics/answer/7029846.
   *
   * Supported values for autocomplete imports:
   *
   * * `suggestions` (default): One JSON completion suggestion per line.
   * * `denylist`:  One JSON deny suggestion per line.
   * * `allowlist`:  One JSON allow suggestion per line.
   * </pre>
   *
   * <code>string data_schema = 4;</code>
   *
   * @return The dataSchema.
   */
  java.lang.String getDataSchema();
  /**
   *
   *
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for product imports:
   *
   * * `product` (default): One JSON
   * [Product][google.cloud.retail.v2beta.Product] per line. Each product must
   *   have a valid [Product.id][google.cloud.retail.v2beta.Product.id].
   * * `product_merchant_center`: See [Importing catalog data from Merchant
   *   Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mc).
   *
   * Supported values for user events imports:
   *
   * * `user_event` (default): One JSON
   * [UserEvent][google.cloud.retail.v2beta.UserEvent] per line.
   * * `user_event_ga360`:
   *   The schema is available here:
   *   https://support.google.com/analytics/answer/3437719.
   * * `user_event_ga4`:
   *   The schema is available here:
   *   https://support.google.com/analytics/answer/7029846.
   *
   * Supported values for autocomplete imports:
   *
   * * `suggestions` (default): One JSON completion suggestion per line.
   * * `denylist`:  One JSON deny suggestion per line.
   * * `allowlist`:  One JSON allow suggestion per line.
   * </pre>
   *
   * <code>string data_schema = 4;</code>
   *
   * @return The bytes for dataSchema.
   */
  com.google.protobuf.ByteString getDataSchemaBytes();

  com.google.cloud.retail.v2beta.BigQuerySource.PartitionCase getPartitionCase();
}
