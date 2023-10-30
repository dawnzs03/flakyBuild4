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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface BigQueryFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BigQueryField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   *
   *
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return The table.
   */
  com.google.privacy.dlp.v2.BigQueryTable getTable();
  /**
   *
   *
   * <pre>
   * Source table of the field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder();

  /**
   *
   *
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   *
   * @return Whether the field field is set.
   */
  boolean hasField();
  /**
   *
   *
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   *
   * @return The field.
   */
  com.google.privacy.dlp.v2.FieldId getField();
  /**
   *
   *
   * <pre>
   * Designated field in the BigQuery table.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field = 2;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldOrBuilder();
}
