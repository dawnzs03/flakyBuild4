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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

package com.google.cloud.bigquery.biglake.v1;

public interface ListTablesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1.ListTablesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The tables from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1.Table tables = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.biglake.v1.Table> getTablesList();
  /**
   *
   *
   * <pre>
   * The tables from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1.Table tables = 1;</code>
   */
  com.google.cloud.bigquery.biglake.v1.Table getTables(int index);
  /**
   *
   *
   * <pre>
   * The tables from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1.Table tables = 1;</code>
   */
  int getTablesCount();
  /**
   *
   *
   * <pre>
   * The tables from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1.Table tables = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.biglake.v1.TableOrBuilder>
      getTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The tables from the specified database.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.biglake.v1.Table tables = 1;</code>
   */
  com.google.cloud.bigquery.biglake.v1.TableOrBuilder getTablesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
