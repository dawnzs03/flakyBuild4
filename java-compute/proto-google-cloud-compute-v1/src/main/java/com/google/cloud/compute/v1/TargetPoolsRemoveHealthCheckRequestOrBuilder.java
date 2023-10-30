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

public interface TargetPoolsRemoveHealthCheckRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HealthCheckReference> getHealthChecksList();
  /**
   *
   *
   * <pre>
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReference getHealthChecks(int index);
  /**
   *
   *
   * <pre>
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  int getHealthChecksCount();
  /**
   *
   *
   * <pre>
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder>
      getHealthChecksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the following are valid URLs: - https://www.googleapis.com/compute/beta/projects/project /global/httpHealthChecks/health-check - projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheckReference health_checks = 448370606;</code>
   */
  com.google.cloud.compute.v1.HealthCheckReferenceOrBuilder getHealthChecksOrBuilder(int index);
}
