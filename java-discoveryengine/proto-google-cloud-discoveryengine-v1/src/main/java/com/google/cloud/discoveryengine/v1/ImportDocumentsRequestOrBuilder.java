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
// source: google/cloud/discoveryengine/v1/import_config.proto

package com.google.cloud.discoveryengine.v1;

public interface ImportDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ImportDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return The inlineSource.
   */
  com.google.cloud.discoveryengine.v1.ImportDocumentsRequest.InlineSource getInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.ImportDocumentsRequest.InlineSourceOrBuilder
      getInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.discoveryengine.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   */
  com.google.cloud.discoveryengine.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.BigQuerySource bigquery_source = 4;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.BigQuerySource bigquery_source = 4;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.discoveryengine.v1.BigQuerySource getBigquerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.BigQuerySource bigquery_source = 4;</code>
   */
  com.google.cloud.discoveryengine.v1.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
   * Requires create/update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
   * Requires create/update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportErrorConfig error_config = 5;</code>
   *
   * @return Whether the errorConfig field is set.
   */
  boolean hasErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportErrorConfig error_config = 5;</code>
   *
   * @return The errorConfig.
   */
  com.google.cloud.discoveryengine.v1.ImportErrorConfig getErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ImportErrorConfig error_config = 5;</code>
   */
  com.google.cloud.discoveryengine.v1.ImportErrorConfigOrBuilder getErrorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing documents and the documents to
   * be imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode reconciliation_mode = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for reconciliationMode.
   */
  int getReconciliationModeValue();
  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing documents and the documents to
   * be imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode reconciliation_mode = 6;
   * </code>
   *
   * @return The reconciliationMode.
   */
  com.google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode
      getReconciliationMode();

  /**
   *
   *
   * <pre>
   * Whether to automatically generate IDs for the documents if absent.
   *
   * If set to `true`,
   * [Document.id][google.cloud.discoveryengine.v1.Document.id]s are
   * automatically generated based on the hash of the payload, where IDs may not
   * be consistent during multiple imports. In which case
   * [ReconciliationMode.FULL][google.cloud.discoveryengine.v1.ImportDocumentsRequest.ReconciliationMode.FULL]
   * is highly recommended to avoid duplicate contents. If unset or set to
   * `false`, [Document.id][google.cloud.discoveryengine.v1.Document.id]s have
   * to be specified using
   * [id_field][google.cloud.discoveryengine.v1.ImportDocumentsRequest.id_field],
   * otherwises, documents without IDs will fail to be imported.
   *
   * Only set this field when using
   * [GcsSource][google.cloud.discoveryengine.v1.GcsSource] or
   * [BigQuerySource][google.cloud.discoveryengine.v1.BigQuerySource], and when
   * [GcsSource.data_schema][google.cloud.discoveryengine.v1.GcsSource.data_schema]
   * or
   * [BigQuerySource.data_schema][google.cloud.discoveryengine.v1.BigQuerySource.data_schema]
   * is `custom`. Otherwise, an INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>bool auto_generate_ids = 8;</code>
   *
   * @return The autoGenerateIds.
   */
  boolean getAutoGenerateIds();

  /**
   *
   *
   * <pre>
   * The field in the Cloud Storage and BigQuery sources that indicates the
   * unique IDs of the documents.
   *
   * For [GcsSource][google.cloud.discoveryengine.v1.GcsSource] it is the key of
   * the JSON field. For instance, `my_id` for JSON `{"my_id": "some_uuid"}`.
   * For [BigQuerySource][google.cloud.discoveryengine.v1.BigQuerySource] it is
   * the column name of the BigQuery table where the unique ids are stored.
   *
   * The values of the JSON field or the BigQuery column will be used as the
   * [Document.id][google.cloud.discoveryengine.v1.Document.id]s. The JSON field
   * or the BigQuery column must be of string type, and the values must be set
   * as valid strings conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * with 1-63 characters. Otherwise, documents without valid IDs will fail to
   * be imported.
   *
   * Only set this field when using
   * [GcsSource][google.cloud.discoveryengine.v1.GcsSource] or
   * [BigQuerySource][google.cloud.discoveryengine.v1.BigQuerySource], and when
   * [GcsSource.data_schema][google.cloud.discoveryengine.v1.GcsSource.data_schema]
   * or
   * [BigQuerySource.data_schema][google.cloud.discoveryengine.v1.BigQuerySource.data_schema]
   * is `custom`. And only set this field when
   * [auto_generate_ids][google.cloud.discoveryengine.v1.ImportDocumentsRequest.auto_generate_ids]
   * is unset or set as `false`. Otherwise, an INVALID_ARGUMENT error is thrown.
   *
   * If it is unset, a default value `_id` is used when importing from the
   * allowed data sources.
   * </pre>
   *
   * <code>string id_field = 9;</code>
   *
   * @return The idField.
   */
  java.lang.String getIdField();
  /**
   *
   *
   * <pre>
   * The field in the Cloud Storage and BigQuery sources that indicates the
   * unique IDs of the documents.
   *
   * For [GcsSource][google.cloud.discoveryengine.v1.GcsSource] it is the key of
   * the JSON field. For instance, `my_id` for JSON `{"my_id": "some_uuid"}`.
   * For [BigQuerySource][google.cloud.discoveryengine.v1.BigQuerySource] it is
   * the column name of the BigQuery table where the unique ids are stored.
   *
   * The values of the JSON field or the BigQuery column will be used as the
   * [Document.id][google.cloud.discoveryengine.v1.Document.id]s. The JSON field
   * or the BigQuery column must be of string type, and the values must be set
   * as valid strings conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * with 1-63 characters. Otherwise, documents without valid IDs will fail to
   * be imported.
   *
   * Only set this field when using
   * [GcsSource][google.cloud.discoveryengine.v1.GcsSource] or
   * [BigQuerySource][google.cloud.discoveryengine.v1.BigQuerySource], and when
   * [GcsSource.data_schema][google.cloud.discoveryengine.v1.GcsSource.data_schema]
   * or
   * [BigQuerySource.data_schema][google.cloud.discoveryengine.v1.BigQuerySource.data_schema]
   * is `custom`. And only set this field when
   * [auto_generate_ids][google.cloud.discoveryengine.v1.ImportDocumentsRequest.auto_generate_ids]
   * is unset or set as `false`. Otherwise, an INVALID_ARGUMENT error is thrown.
   *
   * If it is unset, a default value `_id` is used when importing from the
   * allowed data sources.
   * </pre>
   *
   * <code>string id_field = 9;</code>
   *
   * @return The bytes for idField.
   */
  com.google.protobuf.ByteString getIdFieldBytes();

  com.google.cloud.discoveryengine.v1.ImportDocumentsRequest.SourceCase getSourceCase();
}
