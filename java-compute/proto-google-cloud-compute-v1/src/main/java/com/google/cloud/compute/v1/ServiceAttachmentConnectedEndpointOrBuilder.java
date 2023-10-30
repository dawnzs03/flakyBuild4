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

public interface ServiceAttachmentConnectedEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ServiceAttachmentConnectedEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   *
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   *
   *
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * The url of a connected endpoint.
   * </pre>
   *
   * <code>optional string endpoint = 130489749;</code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * The PSC connection id of the connected endpoint.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   *
   * @return Whether the pscConnectionId field is set.
   */
  boolean hasPscConnectionId();
  /**
   *
   *
   * <pre>
   * The PSC connection id of the connected endpoint.
   * </pre>
   *
   * <code>optional uint64 psc_connection_id = 292082397;</code>
   *
   * @return The pscConnectionId.
   */
  long getPscConnectionId();

  /**
   *
   *
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * The status of a connected endpoint to this service attachment.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
