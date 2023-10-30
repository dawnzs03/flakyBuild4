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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

package com.google.cloud.networkmanagement.v1beta1;

public interface VpnGatewayInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.VpnGatewayInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of a VPN gateway.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of a VPN gateway.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * URI of a VPN gateway.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of a VPN gateway.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network where the VPN gateway is configured.
   * </pre>
   *
   * <code>string network_uri = 3;</code>
   *
   * @return The networkUri.
   */
  java.lang.String getNetworkUri();
  /**
   *
   *
   * <pre>
   * URI of a Compute Engine network where the VPN gateway is configured.
   * </pre>
   *
   * <code>string network_uri = 3;</code>
   *
   * @return The bytes for networkUri.
   */
  com.google.protobuf.ByteString getNetworkUriBytes();

  /**
   *
   *
   * <pre>
   * IP address of the VPN gateway.
   * </pre>
   *
   * <code>string ip_address = 4;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the VPN gateway.
   * </pre>
   *
   * <code>string ip_address = 4;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * A VPN tunnel that is associated with this VPN gateway.
   * There may be multiple VPN tunnels configured on a VPN gateway, and only
   * the one relevant to the test is displayed.
   * </pre>
   *
   * <code>string vpn_tunnel_uri = 5;</code>
   *
   * @return The vpnTunnelUri.
   */
  java.lang.String getVpnTunnelUri();
  /**
   *
   *
   * <pre>
   * A VPN tunnel that is associated with this VPN gateway.
   * There may be multiple VPN tunnels configured on a VPN gateway, and only
   * the one relevant to the test is displayed.
   * </pre>
   *
   * <code>string vpn_tunnel_uri = 5;</code>
   *
   * @return The bytes for vpnTunnelUri.
   */
  com.google.protobuf.ByteString getVpnTunnelUriBytes();

  /**
   *
   *
   * <pre>
   * Name of a Google Cloud region where this VPN gateway is configured.
   * </pre>
   *
   * <code>string region = 6;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of a Google Cloud region where this VPN gateway is configured.
   * </pre>
   *
   * <code>string region = 6;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();
}
