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
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface FailedEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.FailedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google standard error code that best describes this failure.
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * The Google standard error code that best describes this failure.
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.rpc.Code getCode();

  /**
   *
   *
   * <pre>
   * The human-readable description of the cause of the failure.
   * </pre>
   *
   * <code>string cause = 2;</code>
   *
   * @return The cause.
   */
  java.lang.String getCause();
  /**
   *
   *
   * <pre>
   * The human-readable description of the cause of the failure.
   * </pre>
   *
   * <code>string cause = 2;</code>
   *
   * @return The bytes for cause.
   */
  com.google.protobuf.ByteString getCauseBytes();
}
