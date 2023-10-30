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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface DNSConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.DNSConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * cluster_dns indicates which in-cluster DNS provider should be used.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
   *
   * @return The enum numeric value on the wire for clusterDns.
   */
  int getClusterDnsValue();
  /**
   *
   *
   * <pre>
   * cluster_dns indicates which in-cluster DNS provider should be used.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.Provider cluster_dns = 1;</code>
   *
   * @return The clusterDns.
   */
  com.google.container.v1.DNSConfig.Provider getClusterDns();

  /**
   *
   *
   * <pre>
   * cluster_dns_scope indicates the scope of access to cluster DNS records.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
   *
   * @return The enum numeric value on the wire for clusterDnsScope.
   */
  int getClusterDnsScopeValue();
  /**
   *
   *
   * <pre>
   * cluster_dns_scope indicates the scope of access to cluster DNS records.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig.DNSScope cluster_dns_scope = 2;</code>
   *
   * @return The clusterDnsScope.
   */
  com.google.container.v1.DNSConfig.DNSScope getClusterDnsScope();

  /**
   *
   *
   * <pre>
   * cluster_dns_domain is the suffix used for all cluster service records.
   * </pre>
   *
   * <code>string cluster_dns_domain = 3;</code>
   *
   * @return The clusterDnsDomain.
   */
  java.lang.String getClusterDnsDomain();
  /**
   *
   *
   * <pre>
   * cluster_dns_domain is the suffix used for all cluster service records.
   * </pre>
   *
   * <code>string cluster_dns_domain = 3;</code>
   *
   * @return The bytes for clusterDnsDomain.
   */
  com.google.protobuf.ByteString getClusterDnsDomainBytes();
}
