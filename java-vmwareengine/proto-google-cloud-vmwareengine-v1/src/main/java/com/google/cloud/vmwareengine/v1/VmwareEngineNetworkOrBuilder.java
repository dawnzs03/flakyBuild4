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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

package com.google.cloud.vmwareengine.v1;

public interface VmwareEngineNetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.VmwareEngineNetwork)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the VMware Engine network.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/global/vmwareEngineNetworks/my-network`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the VMware Engine network.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/global/vmwareEngineNetworks/my-network`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update time of this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-provided description for this VMware Engine network.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided description for this VMware Engine network.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. VMware Engine service VPC networks that provide connectivity
   * from a private cloud to customer projects, the internet, and other Google
   * Cloud services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork vpc_networks = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork>
      getVpcNetworksList();
  /**
   *
   *
   * <pre>
   * Output only. VMware Engine service VPC networks that provide connectivity
   * from a private cloud to customer projects, the internet, and other Google
   * Cloud services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork vpc_networks = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork getVpcNetworks(int index);
  /**
   *
   *
   * <pre>
   * Output only. VMware Engine service VPC networks that provide connectivity
   * from a private cloud to customer projects, the internet, and other Google
   * Cloud services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork vpc_networks = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getVpcNetworksCount();
  /**
   *
   *
   * <pre>
   * Output only. VMware Engine service VPC networks that provide connectivity
   * from a private cloud to customer projects, the internet, and other Google
   * Cloud services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork vpc_networks = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetworkOrBuilder>
      getVpcNetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. VMware Engine service VPC networks that provide connectivity
   * from a private cloud to customer projects, the internet, and other Google
   * Cloud services.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetwork vpc_networks = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.VpcNetworkOrBuilder getVpcNetworksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. State of the VMware Engine network.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.VmwareEngineNetwork.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the VMware Engine network.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.VmwareEngineNetwork.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.State getState();

  /**
   *
   *
   * <pre>
   * Required. VMware Engine network type.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.VmwareEngineNetwork.Type type = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. VMware Engine network type.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.VmwareEngineNetwork.Type type = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.vmwareengine.v1.VmwareEngineNetwork.Type getType();

  /**
   *
   *
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System-generated unique identifier for the resource.
   * </pre>
   *
   * <code>string uid = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Checksum that may be sent on update and delete requests to ensure that the
   * user-provided value is up to date before the server processes a request.
   * The server computes checksums based on the value of other fields in the
   * request.
   * </pre>
   *
   * <code>string etag = 10;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Checksum that may be sent on update and delete requests to ensure that the
   * user-provided value is up to date before the server processes a request.
   * The server computes checksums based on the value of other fields in the
   * request.
   * </pre>
   *
   * <code>string etag = 10;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
