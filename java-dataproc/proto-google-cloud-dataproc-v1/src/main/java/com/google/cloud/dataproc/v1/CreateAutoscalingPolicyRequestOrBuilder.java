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
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public interface CreateAutoscalingPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.CreateAutoscalingPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The "resource name" of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.autoscalingPolicies.create`, the resource name
   *   of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   *
   * * For `projects.locations.autoscalingPolicies.create`, the resource name
   *   of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
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
   * Required. The "resource name" of the region or location, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.autoscalingPolicies.create`, the resource name
   *   of the region has the following format:
   *   `projects/{project_id}/regions/{region}`
   *
   * * For `projects.locations.autoscalingPolicies.create`, the resource name
   *   of the location has the following format:
   *   `projects/{project_id}/locations/{location}`
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
   * Required. The autoscaling policy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingPolicy policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * Required. The autoscaling policy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingPolicy policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The policy.
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicy getPolicy();
  /**
   *
   *
   * <pre>
   * Required. The autoscaling policy to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingPolicy policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicyOrBuilder getPolicyOrBuilder();
}
