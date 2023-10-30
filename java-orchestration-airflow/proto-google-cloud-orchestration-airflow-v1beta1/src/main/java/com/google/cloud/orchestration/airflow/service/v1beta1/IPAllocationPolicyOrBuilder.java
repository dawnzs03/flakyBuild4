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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface IPAllocationPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.IPAllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Whether or not to enable Alias IPs in the GKE cluster.
   * If `true`, a VPC-native cluster is created.
   *
   * This field is only supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*. Environments in newer versions always use
   * VPC-native GKE clusters.
   * </pre>
   *
   * <code>bool use_ip_aliases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useIpAliases.
   */
  boolean getUseIpAliases();

  /**
   *
   *
   * <pre>
   * Optional. The name of the cluster's secondary range used to allocate
   * IP addresses to pods. Specify either `cluster_secondary_range_name`
   * or `cluster_ipv4_cidr_block` but not both.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterSecondaryRangeName.
   */
  java.lang.String getClusterSecondaryRangeName();
  /**
   *
   *
   * <pre>
   * Optional. The name of the cluster's secondary range used to allocate
   * IP addresses to pods. Specify either `cluster_secondary_range_name`
   * or `cluster_ipv4_cidr_block` but not both.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterSecondaryRangeName.
   */
  com.google.protobuf.ByteString getClusterSecondaryRangeNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the services' secondary range used to allocate
   * IP addresses to the cluster. Specify either `services_secondary_range_name`
   * or `services_ipv4_cidr_block` but not both.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string services_secondary_range_name = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The servicesSecondaryRangeName.
   */
  java.lang.String getServicesSecondaryRangeName();
  /**
   *
   *
   * <pre>
   * Optional. The name of the services' secondary range used to allocate
   * IP addresses to the cluster. Specify either `services_secondary_range_name`
   * or `services_ipv4_cidr_block` but not both.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string services_secondary_range_name = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for servicesSecondaryRangeName.
   */
  com.google.protobuf.ByteString getServicesSecondaryRangeNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address range used to allocate IP addresses to pods in
   * the cluster.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * Specify `cluster_secondary_range_name` or `cluster_ipv4_cidr_block`
   * but not both.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterIpv4CidrBlock.
   */
  java.lang.String getClusterIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The IP address range used to allocate IP addresses to pods in
   * the cluster.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * Specify `cluster_secondary_range_name` or `cluster_ipv4_cidr_block`
   * but not both.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getClusterIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address range of the services IP addresses in this
   * cluster.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * Specify `services_secondary_range_name` or `services_ipv4_cidr_block`
   * but not both.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The servicesIpv4CidrBlock.
   */
  java.lang.String getServicesIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The IP address range of the services IP addresses in this
   * cluster.
   *
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * Specify `services_secondary_range_name` or `services_ipv4_cidr_block`
   * but not both.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for servicesIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getServicesIpv4CidrBlockBytes();
}
