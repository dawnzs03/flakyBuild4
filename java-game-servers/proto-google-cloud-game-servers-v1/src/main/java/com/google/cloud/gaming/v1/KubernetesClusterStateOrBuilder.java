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
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

public interface KubernetesClusterStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.KubernetesClusterState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The version of Agones currently installed in the registered Kubernetes
   * cluster.
   * </pre>
   *
   * <code>string agones_version_installed = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The agonesVersionInstalled.
   */
  java.lang.String getAgonesVersionInstalled();
  /**
   *
   *
   * <pre>
   * Output only. The version of Agones currently installed in the registered Kubernetes
   * cluster.
   * </pre>
   *
   * <code>string agones_version_installed = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for agonesVersionInstalled.
   */
  com.google.protobuf.ByteString getAgonesVersionInstalledBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version of Kubernetes that is currently used in the registered
   * Kubernetes cluster (as detected by the Cloud Game Servers service).
   * </pre>
   *
   * <code>string kubernetes_version_installed = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The kubernetesVersionInstalled.
   */
  java.lang.String getKubernetesVersionInstalled();
  /**
   *
   *
   * <pre>
   * Output only. The version of Kubernetes that is currently used in the registered
   * Kubernetes cluster (as detected by the Cloud Game Servers service).
   * </pre>
   *
   * <code>string kubernetes_version_installed = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for kubernetesVersionInstalled.
   */
  com.google.protobuf.ByteString getKubernetesVersionInstalledBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state for the installed versions of Agones/Kubernetes.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.KubernetesClusterState.InstallationState installation_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for installationState.
   */
  int getInstallationStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state for the installed versions of Agones/Kubernetes.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.KubernetesClusterState.InstallationState installation_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The installationState.
   */
  com.google.cloud.gaming.v1.KubernetesClusterState.InstallationState getInstallationState();

  /**
   *
   *
   * <pre>
   * Output only. The detailed error message for the installed versions of Agones/Kubernetes.
   * </pre>
   *
   * <code>string version_installed_error_message = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The versionInstalledErrorMessage.
   */
  java.lang.String getVersionInstalledErrorMessage();
  /**
   *
   *
   * <pre>
   * Output only. The detailed error message for the installed versions of Agones/Kubernetes.
   * </pre>
   *
   * <code>string version_installed_error_message = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for versionInstalledErrorMessage.
   */
  com.google.protobuf.ByteString getVersionInstalledErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The cloud provider type reported by the first node's providerID in the list
   * of nodes on the Kubernetes endpoint. On Kubernetes platforms that support
   * zero-node clusters (like GKE-on-GCP), the provider type will be empty.
   * </pre>
   *
   * <code>string provider = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   *
   *
   * <pre>
   * Output only. The cloud provider type reported by the first node's providerID in the list
   * of nodes on the Kubernetes endpoint. On Kubernetes platforms that support
   * zero-node clusters (like GKE-on-GCP), the provider type will be empty.
   * </pre>
   *
   * <code>string provider = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString getProviderBytes();

  /**
   *
   *
   * <pre>
   * Output only. The version of Agones that is targeted to be installed in the cluster.
   * </pre>
   *
   * <code>string agones_version_targeted = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The agonesVersionTargeted.
   */
  java.lang.String getAgonesVersionTargeted();
  /**
   *
   *
   * <pre>
   * Output only. The version of Agones that is targeted to be installed in the cluster.
   * </pre>
   *
   * <code>string agones_version_targeted = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for agonesVersionTargeted.
   */
  com.google.protobuf.ByteString getAgonesVersionTargetedBytes();
}
