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

public interface PacketMirroringOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PacketMirroring)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringForwardingRuleInfo collector_ilb = 426607853;
   * </code>
   *
   * @return Whether the collectorIlb field is set.
   */
  boolean hasCollectorIlb();
  /**
   *
   *
   * <pre>
   * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringForwardingRuleInfo collector_ilb = 426607853;
   * </code>
   *
   * @return The collectorIlb.
   */
  com.google.cloud.compute.v1.PacketMirroringForwardingRuleInfo getCollectorIlb();
  /**
   *
   *
   * <pre>
   * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringForwardingRuleInfo collector_ilb = 426607853;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringForwardingRuleInfoOrBuilder getCollectorIlbOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   *
   *
   * <pre>
   * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return The enable.
   */
  java.lang.String getEnable();
  /**
   *
   *
   * <pre>
   * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
   * Check the Enable enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enable = 311764355;</code>
   *
   * @return The bytes for enable.
   */
  com.google.protobuf.ByteString getEnableBytes();

  /**
   *
   *
   * <pre>
   * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringFilter filter = 336120696;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringFilter filter = 336120696;</code>
   *
   * @return The filter.
   */
  com.google.cloud.compute.v1.PacketMirroringFilter getFilter();
  /**
   *
   *
   * <pre>
   * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringFilter filter = 336120696;</code>
   */
  com.google.cloud.compute.v1.PacketMirroringFilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#packetMirroring for packet mirrorings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#packetMirroring for packet mirrorings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#packetMirroring for packet mirrorings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringMirroredResourceInfo mirrored_resources = 124817348;
   * </code>
   *
   * @return Whether the mirroredResources field is set.
   */
  boolean hasMirroredResources();
  /**
   *
   *
   * <pre>
   * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringMirroredResourceInfo mirrored_resources = 124817348;
   * </code>
   *
   * @return The mirroredResources.
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfo getMirroredResources();
  /**
   *
   *
   * <pre>
   * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.PacketMirroringMirroredResourceInfo mirrored_resources = 124817348;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoOrBuilder
      getMirroredResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringNetworkInfo network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringNetworkInfo network = 232872494;</code>
   *
   * @return The network.
   */
  com.google.cloud.compute.v1.PacketMirroringNetworkInfo getNetwork();
  /**
   *
   *
   * <pre>
   * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.PacketMirroringNetworkInfo network = 232872494;</code>
   */
  com.google.cloud.compute.v1.PacketMirroringNetworkInfoOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
   * </pre>
   *
   * <code>optional uint32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
   * </pre>
   *
   * <code>optional uint32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the packetMirroring resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the packetMirroring resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] URI of the region where the packetMirroring resides.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();
}
