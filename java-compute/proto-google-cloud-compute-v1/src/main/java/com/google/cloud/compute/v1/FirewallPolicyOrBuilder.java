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

public interface FirewallPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of associations that belong to this firewall policy.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.FirewallPolicyAssociation> getAssociationsList();
  /**
   *
   *
   * <pre>
   * A list of associations that belong to this firewall policy.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;
   * </code>
   */
  com.google.cloud.compute.v1.FirewallPolicyAssociation getAssociations(int index);
  /**
   *
   *
   * <pre>
   * A list of associations that belong to this firewall policy.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;
   * </code>
   */
  int getAssociationsCount();
  /**
   *
   *
   * <pre>
   * A list of associations that belong to this firewall policy.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.FirewallPolicyAssociationOrBuilder>
      getAssociationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of associations that belong to this firewall policy.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyAssociation associations = 508736530;
   * </code>
   */
  com.google.cloud.compute.v1.FirewallPolicyAssociationOrBuilder getAssociationsOrBuilder(
      int index);

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
   * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Deprecated, please use short name instead. User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the firewall policy.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

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
   * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
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
   * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
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
   * [Output only] Type of the resource. Always compute#firewallPolicyfor firewall policies
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
   * Name of the resource. For Organization Firewall Policies it's a [Output Only] numeric ID allocated by Google Cloud which uniquely identifies the Organization Firewall Policy.
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
   * Name of the resource. For Organization Firewall Policies it's a [Output Only] numeric ID allocated by Google Cloud which uniquely identifies the Organization Firewall Policy.
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
   * Name of the resource. For Organization Firewall Policies it's a [Output Only] numeric ID allocated by Google Cloud which uniquely identifies the Organization Firewall Policy.
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
   * [Output Only] The parent of the firewall policy. This field is not applicable to network firewall policies.
   * </pre>
   *
   * <code>optional string parent = 78317738;</code>
   *
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   *
   *
   * <pre>
   * [Output Only] The parent of the firewall policy. This field is not applicable to network firewall policies.
   * </pre>
   *
   * <code>optional string parent = 78317738;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * [Output Only] The parent of the firewall policy. This field is not applicable to network firewall policies.
   * </pre>
   *
   * <code>optional string parent = 78317738;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] URL of the region where the regional firewall policy resides. This field is not applicable to global firewall policies. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
   * </pre>
   *
   * <code>optional int32 rule_tuple_count = 388342037;</code>
   *
   * @return Whether the ruleTupleCount field is set.
   */
  boolean hasRuleTupleCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
   * </pre>
   *
   * <code>optional int32 rule_tuple_count = 388342037;</code>
   *
   * @return The ruleTupleCount.
   */
  int getRuleTupleCount();

  /**
   *
   *
   * <pre>
   * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  java.util.List<com.google.cloud.compute.v1.FirewallPolicyRule> getRulesList();
  /**
   *
   *
   * <pre>
   * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRule getRules(int index);
  /**
   *
   *
   * <pre>
   * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
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
   * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a firewall policy, a default rule with action "allow" will be added.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.FirewallPolicyRule rules = 108873975;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRuleOrBuilder getRulesOrBuilder(int index);

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

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return Whether the selfLinkWithId field is set.
   */
  boolean hasSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The selfLinkWithId.
   */
  java.lang.String getSelfLinkWithId();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource with the resource id.
   * </pre>
   *
   * <code>optional string self_link_with_id = 44520962;</code>
   *
   * @return The bytes for selfLinkWithId.
   */
  com.google.protobuf.ByteString getSelfLinkWithIdBytes();

  /**
   *
   *
   * <pre>
   * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * User-provided name of the Organization firewall policy. The name should be unique in the organization in which the firewall policy is created. This field is not applicable to network firewall policies. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string short_name = 492051566;</code>
   *
   * @return The bytes for shortName.
   */
  com.google.protobuf.ByteString getShortNameBytes();
}
