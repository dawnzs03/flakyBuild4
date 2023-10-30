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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface OracleSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.OracleSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema_name = 1;</code>
   *
   * @return The schemaName.
   */
  java.lang.String getSchemaName();
  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema_name = 1;</code>
   *
   * @return The bytes for schemaName.
   */
  com.google.protobuf.ByteString getSchemaNameBytes();

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleTable oracle_tables = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.OracleTable> getOracleTablesList();
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleTable oracle_tables = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleTable getOracleTables(int index);
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleTable oracle_tables = 2;</code>
   */
  int getOracleTablesCount();
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleTable oracle_tables = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.OracleTableOrBuilder>
      getOracleTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleTable oracle_tables = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleTableOrBuilder getOracleTablesOrBuilder(int index);
}
