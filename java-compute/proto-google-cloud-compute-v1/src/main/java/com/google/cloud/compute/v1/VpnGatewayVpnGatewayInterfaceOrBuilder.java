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

public interface VpnGatewayVpnGatewayInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGatewayVpnGatewayInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Numeric identifier for this VPN interface associated with the VPN gateway.
   * </pre>
   *
   * <code>optional uint32 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] Numeric identifier for this VPN interface associated with the VPN gateway.
   * </pre>
   *
   * <code>optional uint32 id = 3355;</code>
   *
   * @return The id.
   */
  int getId();

  /**
   *
   *
   * <pre>
   * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for HA VPN over Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource.
   * </pre>
   *
   * <code>optional string interconnect_attachment = 308135284;</code>
   *
   * @return Whether the interconnectAttachment field is set.
   */
  boolean hasInterconnectAttachment();
  /**
   *
   *
   * <pre>
   * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for HA VPN over Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource.
   * </pre>
   *
   * <code>optional string interconnect_attachment = 308135284;</code>
   *
   * @return The interconnectAttachment.
   */
  java.lang.String getInterconnectAttachment();
  /**
   *
   *
   * <pre>
   * URL of the VLAN attachment (interconnectAttachment) resource for this VPN gateway interface. When the value of this field is present, the VPN gateway is used for HA VPN over Cloud Interconnect; all egress or ingress traffic for this VPN gateway interface goes through the specified VLAN attachment resource.
   * </pre>
   *
   * <code>optional string interconnect_attachment = 308135284;</code>
   *
   * @return The bytes for interconnectAttachment.
   */
  com.google.protobuf.ByteString getInterconnectAttachmentBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For HA VPN over Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non HA VPN over Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For HA VPN over Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non HA VPN over Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * [Output Only] IP address for this VPN interface associated with the VPN gateway. The IP address could be either a regional external IP address or a regional internal IP address. The two IP addresses for a VPN gateway must be all regional external or regional internal IP addresses. There cannot be a mix of regional external IP addresses and regional internal IP addresses. For HA VPN over Cloud Interconnect, the IP addresses for both interfaces could either be regional internal IP addresses or regional external IP addresses. For regular (non HA VPN over Cloud Interconnect) HA VPN tunnels, the IP address must be a regional external IP address.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();
}
