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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

public interface ReconfigureTrustRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1.ReconfigureTrustRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource domain name, project name and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource domain name, project name and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The fully-qualified target domain name which will be in trust with current
   * domain.
   * </pre>
   *
   * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The targetDomainName.
   */
  java.lang.String getTargetDomainName();
  /**
   *
   *
   * <pre>
   * Required. The fully-qualified target domain name which will be in trust with current
   * domain.
   * </pre>
   *
   * <code>string target_domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for targetDomainName.
   */
  com.google.protobuf.ByteString getTargetDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the targetDnsIpAddresses.
   */
  java.util.List<java.lang.String> getTargetDnsIpAddressesList();
  /**
   *
   *
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of targetDnsIpAddresses.
   */
  int getTargetDnsIpAddressesCount();
  /**
   *
   *
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The targetDnsIpAddresses at the given index.
   */
  java.lang.String getTargetDnsIpAddresses(int index);
  /**
   *
   *
   * <pre>
   * Required. The target DNS server IP addresses to resolve the remote domain involved
   * in the trust.
   * </pre>
   *
   * <code>repeated string target_dns_ip_addresses = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetDnsIpAddresses at the given index.
   */
  com.google.protobuf.ByteString getTargetDnsIpAddressesBytes(int index);
}
