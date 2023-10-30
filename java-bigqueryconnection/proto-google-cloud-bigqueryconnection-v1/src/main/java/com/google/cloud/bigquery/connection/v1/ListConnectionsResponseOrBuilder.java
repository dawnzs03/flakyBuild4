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

public interface ListConnectionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.ListConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Next page token.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Next page token.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  java.util.List<com.google.cloud.bigquery.connection.v1.Connection> getConnectionsList();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  com.google.cloud.bigquery.connection.v1.Connection getConnections(int index);
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  int getConnectionsCount();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder>
      getConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of connections.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.connection.v1.Connection connections = 2;</code>
   */
  com.google.cloud.bigquery.connection.v1.ConnectionOrBuilder getConnectionsOrBuilder(int index);
}
