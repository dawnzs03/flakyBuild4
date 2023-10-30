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

public interface CloudSqlCredentialOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.CloudSqlCredential)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The username for the credential.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * The username for the credential.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * The password for the credential.
   * </pre>
   *
   * <code>string password = 2;</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * The password for the credential.
   * </pre>
   *
   * <code>string password = 2;</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();
}
