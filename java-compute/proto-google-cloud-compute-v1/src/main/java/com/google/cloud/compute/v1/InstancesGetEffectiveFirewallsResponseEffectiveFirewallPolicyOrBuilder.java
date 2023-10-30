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

public interface InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy.
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
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy.
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
   * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy.
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
   * [Output Only] The name of the firewall policy.
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
   * [Output Only] The name of the firewall policy.
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
   * [Output Only] The name of the firewall policy.
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
   * The rules that apply to the network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  java.util.List<com.google.cloud.compute.v1.FirewallPolicyRule> getRulesList();
  /**
   *
   *
   * <pre>
   * The rules that apply to the network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRule getRules(int index);
  /**
   *
   *
   * <pre>
   * The rules that apply to the network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * The rules that apply to the network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.FirewallPolicyRuleOrBuilder>
      getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The rules that apply to the network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRuleOrBuilder getRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The short name of the firewall policy.
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
   * [Output Only] The short name of the firewall policy.
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
   * [Output Only] The short name of the firewall policy.
   * </pre>
   *
   * <code>optional string short_name = 492051566;</code>
   *
   * @return The bytes for shortName.
   */
  com.google.protobuf.ByteString getShortNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK, NETWORK_REGIONAL.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK, NETWORK_REGIONAL.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the firewall policy. Can be one of HIERARCHY, NETWORK, NETWORK_REGIONAL.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
