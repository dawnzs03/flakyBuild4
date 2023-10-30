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

public interface PreviewCreateGameServerClusterResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.PreviewCreateGameServerClusterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   *
   * @return Whether the targetState field is set.
   */
  boolean hasTargetState();
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   *
   * @return The targetState.
   */
  com.google.cloud.gaming.v1.TargetState getTargetState();
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.TargetState target_state = 3;</code>
   */
  com.google.cloud.gaming.v1.TargetStateOrBuilder getTargetStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the Kubernetes cluster in preview, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.KubernetesClusterState cluster_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the clusterState field is set.
   */
  boolean hasClusterState();
  /**
   *
   *
   * <pre>
   * Output only. The state of the Kubernetes cluster in preview, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.KubernetesClusterState cluster_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The clusterState.
   */
  com.google.cloud.gaming.v1.KubernetesClusterState getClusterState();
  /**
   *
   *
   * <pre>
   * Output only. The state of the Kubernetes cluster in preview, this will be available if
   * 'view' is set to `FULL` in the relevant List/Get/Preview request.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.KubernetesClusterState cluster_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gaming.v1.KubernetesClusterStateOrBuilder getClusterStateOrBuilder();
}
