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
// source: google/cloud/gaming/v1beta/common.proto

package com.google.cloud.gaming.v1beta;

public interface OperationStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1beta.OperationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Whether the operation is done or still in progress.
   * </pre>
   *
   * <code>bool done = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The done.
   */
  boolean getDone();

  /**
   *
   *
   * <pre>
   * The error code in case of failures.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.OperationStatus.ErrorCode error_code = 2;</code>
   *
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   *
   *
   * <pre>
   * The error code in case of failures.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.OperationStatus.ErrorCode error_code = 2;</code>
   *
   * @return The errorCode.
   */
  com.google.cloud.gaming.v1beta.OperationStatus.ErrorCode getErrorCode();

  /**
   *
   *
   * <pre>
   * The human-readable error message.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   *
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * The human-readable error message.
   * </pre>
   *
   * <code>string error_message = 3;</code>
   *
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString getErrorMessageBytes();
}
