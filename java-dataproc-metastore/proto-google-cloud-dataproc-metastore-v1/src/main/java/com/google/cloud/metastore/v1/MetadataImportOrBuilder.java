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
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

public interface MetadataImportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.MetadataImport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. A database dump from a pre-existing metastore's database.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1.MetadataImport.DatabaseDump database_dump = 6 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the databaseDump field is set.
   */
  boolean hasDatabaseDump();
  /**
   *
   *
   * <pre>
   * Immutable. A database dump from a pre-existing metastore's database.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1.MetadataImport.DatabaseDump database_dump = 6 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The databaseDump.
   */
  com.google.cloud.metastore.v1.MetadataImport.DatabaseDump getDatabaseDump();
  /**
   *
   *
   * <pre>
   * Immutable. A database dump from a pre-existing metastore's database.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1.MetadataImport.DatabaseDump database_dump = 6 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.metastore.v1.MetadataImport.DatabaseDumpOrBuilder getDatabaseDumpOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the metadata import, of the form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The relative resource name of the metadata import, of the form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the metadata import.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the metadata import.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the metadata import finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the metadata import.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1.MetadataImport.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the metadata import.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1.MetadataImport.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.metastore.v1.MetadataImport.State getState();

  com.google.cloud.metastore.v1.MetadataImport.MetadataCase getMetadataCase();
}
