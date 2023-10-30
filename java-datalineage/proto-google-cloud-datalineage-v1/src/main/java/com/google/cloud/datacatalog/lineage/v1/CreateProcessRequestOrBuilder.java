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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface CreateProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.CreateProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project and its location that should own the
   * process.
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
   * Required. The name of the project and its location that should own the
   * process.
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
   * Required. The process to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Process process = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the process field is set.
   */
  boolean hasProcess();
  /**
   *
   *
   * <pre>
   * Required. The process to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Process process = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The process.
   */
  com.google.cloud.datacatalog.lineage.v1.Process getProcess();
  /**
   *
   *
   * <pre>
   * Required. The process to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.Process process = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder getProcessOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
