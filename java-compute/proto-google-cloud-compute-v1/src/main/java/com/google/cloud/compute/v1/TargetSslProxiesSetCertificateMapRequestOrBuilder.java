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

public interface TargetSslProxiesSetCertificateMapRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetSslProxiesSetCertificateMapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return Whether the certificateMap field is set.
   */
  boolean hasCertificateMap();
  /**
   *
   *
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return The certificateMap.
   */
  java.lang.String getCertificateMap();
  /**
   *
   *
   * <pre>
   * URL of the Certificate Map to associate with this TargetSslProxy. Accepted format is //certificatemanager.googleapis.com/projects/{project }/locations/{location}/certificateMaps/{resourceName}.
   * </pre>
   *
   * <code>optional string certificate_map = 156463796;</code>
   *
   * @return The bytes for certificateMap.
   */
  com.google.protobuf.ByteString getCertificateMapBytes();
}
