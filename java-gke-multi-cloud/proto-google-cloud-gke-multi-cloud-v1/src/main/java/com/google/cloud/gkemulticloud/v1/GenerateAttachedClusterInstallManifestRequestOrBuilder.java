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
// source: google/cloud/gkemulticloud/v1/attached_service.proto

package com.google.cloud.gkemulticloud.v1;

public interface GenerateAttachedClusterInstallManifestRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.GenerateAttachedClusterInstallManifestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent location where this
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * will be created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent location where this
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * will be created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. A client provided ID of the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * name formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   *
   * When generating an install manifest for importing an existing Membership
   * resource, the attached_cluster_id field must be the Membership id.
   *
   * Membership names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/memberships/&lt;membership-id&gt;`.
   * </pre>
   *
   * <code>string attached_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The attachedClusterId.
   */
  java.lang.String getAttachedClusterId();
  /**
   *
   *
   * <pre>
   * Required. A client provided ID of the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AttachedCluster][google.cloud.gkemulticloud.v1.AttachedCluster] resource
   * name formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/attachedClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   *
   * When generating an install manifest for importing an existing Membership
   * resource, the attached_cluster_id field must be the Membership id.
   *
   * Membership names are formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/memberships/&lt;membership-id&gt;`.
   * </pre>
   *
   * <code>string attached_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for attachedClusterId.
   */
  com.google.protobuf.ByteString getAttachedClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The platform version for the cluster (e.g. `1.19.0-gke.1000`).
   *
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedClusters.GetAttachedServerConfig].
   * </pre>
   *
   * <code>string platform_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The platformVersion.
   */
  java.lang.String getPlatformVersion();
  /**
   *
   *
   * <pre>
   * Required. The platform version for the cluster (e.g. `1.19.0-gke.1000`).
   *
   * You can list all supported versions on a given Google Cloud region by
   * calling
   * [GetAttachedServerConfig][google.cloud.gkemulticloud.v1.AttachedClusters.GetAttachedServerConfig].
   * </pre>
   *
   * <code>string platform_version = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for platformVersion.
   */
  com.google.protobuf.ByteString getPlatformVersionBytes();
}
