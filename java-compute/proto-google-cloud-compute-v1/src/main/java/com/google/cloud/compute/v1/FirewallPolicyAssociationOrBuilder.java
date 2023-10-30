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

public interface FirewallPolicyAssociationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallPolicyAssociation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The target that the firewall policy is attached to.
   * </pre>
   *
   * <code>optional string attachment_target = 175773741;</code>
   *
   * @return Whether the attachmentTarget field is set.
   */
  boolean hasAttachmentTarget();
  /**
   *
   *
   * <pre>
   * The target that the firewall policy is attached to.
   * </pre>
   *
   * <code>optional string attachment_target = 175773741;</code>
   *
   * @return The attachmentTarget.
   */
  java.lang.String getAttachmentTarget();
  /**
   *
   *
   * <pre>
   * The target that the firewall policy is attached to.
   * </pre>
   *
   * <code>optional string attachment_target = 175773741;</code>
   *
   * @return The bytes for attachmentTarget.
   */
  com.google.protobuf.ByteString getAttachmentTargetBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string display_name = 4473832;</code>
   *
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string display_name = 4473832;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string display_name = 4473832;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The firewall policy ID of the association.
   * </pre>
   *
   * <code>optional string firewall_policy_id = 357211849;</code>
   *
   * @return Whether the firewallPolicyId field is set.
   */
  boolean hasFirewallPolicyId();
  /**
   *
   *
   * <pre>
   * [Output Only] The firewall policy ID of the association.
   * </pre>
   *
   * <code>optional string firewall_policy_id = 357211849;</code>
   *
   * @return The firewallPolicyId.
   */
  java.lang.String getFirewallPolicyId();
  /**
   *
   *
   * <pre>
   * [Output Only] The firewall policy ID of the association.
   * </pre>
   *
   * <code>optional string firewall_policy_id = 357211849;</code>
   *
   * @return The bytes for firewallPolicyId.
   */
  com.google.protobuf.ByteString getFirewallPolicyIdBytes();

  /**
   *
   *
   * <pre>
   * The name for an association.
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
   * The name for an association.
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
   * The name for an association.
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
   * [Output Only] The short name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string short_name = 492051566;</code>
   *
   * @return Whether the shortName field is set.
   */
  boolean hasShortName();
  /**
   *
   *
   * <pre>
   * [Output Only] The short name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string short_name = 492051566;</code>
   *
   * @return The shortName.
   */
  java.lang.String getShortName();
  /**
   *
   *
   * <pre>
   * [Output Only] The short name of the firewall policy of the association.
   * </pre>
   *
   * <code>optional string short_name = 492051566;</code>
   *
   * @return The bytes for shortName.
   */
  com.google.protobuf.ByteString getShortNameBytes();
}
