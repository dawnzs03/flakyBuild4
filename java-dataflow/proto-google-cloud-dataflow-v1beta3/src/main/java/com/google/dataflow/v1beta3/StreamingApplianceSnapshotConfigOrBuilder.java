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
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

public interface StreamingApplianceSnapshotConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StreamingApplianceSnapshotConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If set, indicates the snapshot id for the snapshot being performed.
   * </pre>
   *
   * <code>string snapshot_id = 1;</code>
   *
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   *
   *
   * <pre>
   * If set, indicates the snapshot id for the snapshot being performed.
   * </pre>
   *
   * <code>string snapshot_id = 1;</code>
   *
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString getSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * Indicates which endpoint is used to import appliance state.
   * </pre>
   *
   * <code>string import_state_endpoint = 2;</code>
   *
   * @return The importStateEndpoint.
   */
  java.lang.String getImportStateEndpoint();
  /**
   *
   *
   * <pre>
   * Indicates which endpoint is used to import appliance state.
   * </pre>
   *
   * <code>string import_state_endpoint = 2;</code>
   *
   * @return The bytes for importStateEndpoint.
   */
  com.google.protobuf.ByteString getImportStateEndpointBytes();
}
