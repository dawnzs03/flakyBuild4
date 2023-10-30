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

public interface UpdateInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UpdateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the instance resource to update.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * Name of the instance resource to update.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.Instance instance_resource = 215988344 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instanceResource field is set.
   */
  boolean hasInstanceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.Instance instance_resource = 215988344 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instanceResource.
   */
  com.google.cloud.compute.v1.Instance getInstanceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.Instance instance_resource = 215988344 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.InstanceOrBuilder getInstanceResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the action to take when updating an instance even if the updated properties do not require it. If not specified, then Compute Engine acts based on the minimum action that the updated properties require.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return Whether the minimalAction field is set.
   */
  boolean hasMinimalAction();
  /**
   *
   *
   * <pre>
   * Specifies the action to take when updating an instance even if the updated properties do not require it. If not specified, then Compute Engine acts based on the minimum action that the updated properties require.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return The minimalAction.
   */
  java.lang.String getMinimalAction();
  /**
   *
   *
   * <pre>
   * Specifies the action to take when updating an instance even if the updated properties do not require it. If not specified, then Compute Engine acts based on the minimum action that the updated properties require.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return The bytes for minimalAction.
   */
  com.google.protobuf.ByteString getMinimalActionBytes();

  /**
   *
   *
   * <pre>
   * Specifies the most disruptive action that can be taken on the instance as part of the update. Compute Engine returns an error if the instance properties require a more disruptive action as part of the instance update. Valid options from lowest to highest are NO_EFFECT, REFRESH, and RESTART.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   *
   * @return Whether the mostDisruptiveAllowedAction field is set.
   */
  boolean hasMostDisruptiveAllowedAction();
  /**
   *
   *
   * <pre>
   * Specifies the most disruptive action that can be taken on the instance as part of the update. Compute Engine returns an error if the instance properties require a more disruptive action as part of the instance update. Valid options from lowest to highest are NO_EFFECT, REFRESH, and RESTART.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   *
   * @return The mostDisruptiveAllowedAction.
   */
  java.lang.String getMostDisruptiveAllowedAction();
  /**
   *
   *
   * <pre>
   * Specifies the most disruptive action that can be taken on the instance as part of the update. Compute Engine returns an error if the instance properties require a more disruptive action as part of the instance update. Valid options from lowest to highest are NO_EFFECT, REFRESH, and RESTART.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   *
   * @return The bytes for mostDisruptiveAllowedAction.
   */
  com.google.protobuf.ByteString getMostDisruptiveAllowedActionBytes();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>
   * string zone = 3744684 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "zone"];
   * </code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>
   * string zone = 3744684 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "zone"];
   * </code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
