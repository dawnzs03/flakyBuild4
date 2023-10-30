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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

public interface MembershipSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.MembershipSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1;</code>
   *
   * @return Whether the configSync field is set.
   */
  boolean hasConfigSync();
  /**
   *
   *
   * <pre>
   * Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1;</code>
   *
   * @return The configSync.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSync getConfigSync();
  /**
   *
   *
   * <pre>
   * Config Sync configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.ConfigSync config_sync = 1;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.ConfigSyncOrBuilder getConfigSyncOrBuilder();

  /**
   *
   *
   * <pre>
   * Policy Controller configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2;
   * </code>
   *
   * @return Whether the policyController field is set.
   */
  boolean hasPolicyController();
  /**
   *
   *
   * <pre>
   * Policy Controller configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2;
   * </code>
   *
   * @return The policyController.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyController getPolicyController();
  /**
   *
   *
   * <pre>
   * Policy Controller configuration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyController policy_controller = 2;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerOrBuilder
      getPolicyControllerOrBuilder();

  /**
   *
   *
   * <pre>
   * Binauthz conifguration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3;</code>
   *
   * @return Whether the binauthz field is set.
   */
  boolean hasBinauthz();
  /**
   *
   *
   * <pre>
   * Binauthz conifguration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3;</code>
   *
   * @return The binauthz.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig getBinauthz();
  /**
   *
   *
   * <pre>
   * Binauthz conifguration for the cluster.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfig binauthz = 3;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.BinauthzConfigOrBuilder getBinauthzOrBuilder();

  /**
   *
   *
   * <pre>
   * Hierarchy Controller configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4;
   * </code>
   *
   * @return Whether the hierarchyController field is set.
   */
  boolean hasHierarchyController();
  /**
   *
   *
   * <pre>
   * Hierarchy Controller configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4;
   * </code>
   *
   * @return The hierarchyController.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig
      getHierarchyController();
  /**
   *
   *
   * <pre>
   * Hierarchy Controller configuration for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfig hierarchy_controller = 4;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.HierarchyControllerConfigOrBuilder
      getHierarchyControllerOrBuilder();

  /**
   *
   *
   * <pre>
   * Version of ACM installed.
   * </pre>
   *
   * <code>string version = 10;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Version of ACM installed.
   * </pre>
   *
   * <code>string version = 10;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
