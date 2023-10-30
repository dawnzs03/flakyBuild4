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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface DiskResourceStatusAsyncReplicationStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DiskResourceStatusAsyncReplicationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   *
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   *
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   *
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();
}
