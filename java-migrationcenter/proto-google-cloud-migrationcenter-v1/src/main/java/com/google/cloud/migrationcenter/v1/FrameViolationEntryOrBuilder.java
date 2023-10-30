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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface FrameViolationEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.FrameViolationEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The field of the original frame where the violation occurred.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The field.
   */
  java.lang.String getField();
  /**
   *
   *
   * <pre>
   * The field of the original frame where the violation occurred.
   * </pre>
   *
   * <code>string field = 1;</code>
   *
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString getFieldBytes();

  /**
   *
   *
   * <pre>
   * A message describing the violation.
   * </pre>
   *
   * <code>string violation = 2;</code>
   *
   * @return The violation.
   */
  java.lang.String getViolation();
  /**
   *
   *
   * <pre>
   * A message describing the violation.
   * </pre>
   *
   * <code>string violation = 2;</code>
   *
   * @return The bytes for violation.
   */
  com.google.protobuf.ByteString getViolationBytes();
}
