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

public interface AccessConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AccessConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Applies to ipv6AccessConfigs only. The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address, it must be unused and in the same region as the instance's zone. If not specified, Google Cloud will automatically assign an external IPv6 address from the instance's subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6 = 532703707;</code>
   *
   * @return Whether the externalIpv6 field is set.
   */
  boolean hasExternalIpv6();
  /**
   *
   *
   * <pre>
   * Applies to ipv6AccessConfigs only. The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address, it must be unused and in the same region as the instance's zone. If not specified, Google Cloud will automatically assign an external IPv6 address from the instance's subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6 = 532703707;</code>
   *
   * @return The externalIpv6.
   */
  java.lang.String getExternalIpv6();
  /**
   *
   *
   * <pre>
   * Applies to ipv6AccessConfigs only. The first IPv6 address of the external IPv6 range associated with this instance, prefix length is stored in externalIpv6PrefixLength in ipv6AccessConfig. To use a static external IP address, it must be unused and in the same region as the instance's zone. If not specified, Google Cloud will automatically assign an external IPv6 address from the instance's subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6 = 532703707;</code>
   *
   * @return The bytes for externalIpv6.
   */
  com.google.protobuf.ByteString getExternalIpv6Bytes();

  /**
   *
   *
   * <pre>
   * Applies to ipv6AccessConfigs only. The prefix length of the external IPv6 range.
   * </pre>
   *
   * <code>optional int32 external_ipv6_prefix_length = 425672143;</code>
   *
   * @return Whether the externalIpv6PrefixLength field is set.
   */
  boolean hasExternalIpv6PrefixLength();
  /**
   *
   *
   * <pre>
   * Applies to ipv6AccessConfigs only. The prefix length of the external IPv6 range.
   * </pre>
   *
   * <code>optional int32 external_ipv6_prefix_length = 425672143;</code>
   *
   * @return The externalIpv6PrefixLength.
   */
  int getExternalIpv6PrefixLength();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
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
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
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
   * [Output Only] Type of the resource. Always compute#accessConfig for access configs.
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
   * The name of this access configuration. In accessConfigs (IPv4), the default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access. In ipv6AccessConfigs, the recommend name is External IPv6.
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
   * The name of this access configuration. In accessConfigs (IPv4), the default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access. In ipv6AccessConfigs, the recommend name is External IPv6.
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
   * The name of this access configuration. In accessConfigs (IPv4), the default and recommended name is External NAT, but you can use any arbitrary string, such as My external IP or Network Access. In ipv6AccessConfigs, the recommend name is External IPv6.
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
   * Applies to accessConfigs (IPv4) only. An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
   * </pre>
   *
   * <code>optional string nat_i_p = 117634556;</code>
   *
   * @return Whether the natIP field is set.
   */
  boolean hasNatIP();
  /**
   *
   *
   * <pre>
   * Applies to accessConfigs (IPv4) only. An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
   * </pre>
   *
   * <code>optional string nat_i_p = 117634556;</code>
   *
   * @return The natIP.
   */
  java.lang.String getNatIP();
  /**
   *
   *
   * <pre>
   * Applies to accessConfigs (IPv4) only. An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the zone of the instance.
   * </pre>
   *
   * <code>optional string nat_i_p = 117634556;</code>
   *
   * @return The bytes for natIP.
   */
  com.google.protobuf.ByteString getNatIPBytes();

  /**
   *
   *
   * <pre>
   * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   *
   * @return Whether the networkTier field is set.
   */
  boolean hasNetworkTier();
  /**
   *
   *
   * <pre>
   * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   *
   * @return The networkTier.
   */
  java.lang.String getNetworkTier();
  /**
   *
   *
   * <pre>
   * This signifies the networking tier used for configuring this access configuration and can only take the following values: PREMIUM, STANDARD. If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be created with this networkTier. If an AccessConfig with a valid external IP address is specified, it must match that of the networkTier associated with the Address resource owning that IP.
   * Check the NetworkTier enum for the list of possible values.
   * </pre>
   *
   * <code>optional string network_tier = 517397843;</code>
   *
   * @return The bytes for networkTier.
   */
  com.google.protobuf.ByteString getNetworkTierBytes();

  /**
   *
   *
   * <pre>
   * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
   * </pre>
   *
   * <code>optional string public_ptr_domain_name = 316599167;</code>
   *
   * @return Whether the publicPtrDomainName field is set.
   */
  boolean hasPublicPtrDomainName();
  /**
   *
   *
   * <pre>
   * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
   * </pre>
   *
   * <code>optional string public_ptr_domain_name = 316599167;</code>
   *
   * @return The publicPtrDomainName.
   */
  java.lang.String getPublicPtrDomainName();
  /**
   *
   *
   * <pre>
   * The DNS domain name for the public PTR record. You can set this field only if the `setPublicPtr` field is enabled in accessConfig. If this field is unspecified in ipv6AccessConfig, a default PTR record will be createc for first IP in associated external IPv6 range.
   * </pre>
   *
   * <code>optional string public_ptr_domain_name = 316599167;</code>
   *
   * @return The bytes for publicPtrDomainName.
   */
  com.google.protobuf.ByteString getPublicPtrDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
   * </pre>
   *
   * <code>optional bool set_public_ptr = 523870229;</code>
   *
   * @return Whether the setPublicPtr field is set.
   */
  boolean hasSetPublicPtr();
  /**
   *
   *
   * <pre>
   * Specifies whether a public DNS 'PTR' record should be created to map the external IP address of the instance to a DNS domain name. This field is not used in ipv6AccessConfig. A default PTR record will be created if the VM has external IPv6 range associated.
   * </pre>
   *
   * <code>optional bool set_public_ptr = 523870229;</code>
   *
   * @return The setPublicPtr.
   */
  boolean getSetPublicPtr();

  /**
   *
   *
   * <pre>
   * The type of configuration. In accessConfigs (IPv4), the default and only option is ONE_TO_ONE_NAT. In ipv6AccessConfigs, the default and only option is DIRECT_IPV6.
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
   * The type of configuration. In accessConfigs (IPv4), the default and only option is ONE_TO_ONE_NAT. In ipv6AccessConfigs, the default and only option is DIRECT_IPV6.
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
   * The type of configuration. In accessConfigs (IPv4), the default and only option is ONE_TO_ONE_NAT. In ipv6AccessConfigs, the default and only option is DIRECT_IPV6.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
