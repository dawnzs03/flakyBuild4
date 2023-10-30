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

public interface AutoscalerStatusDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AutoscalerStatusDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The status message.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The status message.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The status message.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * The type of error, warning, or notice returned. Current set of possible values: - ALL_INSTANCES_UNHEALTHY (WARNING): All instances in the instance group are unhealthy (not in RUNNING state). - BACKEND_SERVICE_DOES_NOT_EXIST (ERROR): There is no backend service attached to the instance group. - CAPPED_AT_MAX_NUM_REPLICAS (WARNING): Autoscaler recommends a size greater than maxNumReplicas. - CUSTOM_METRIC_DATA_POINTS_TOO_SPARSE (WARNING): The custom metric samples are not exported often enough to be a credible base for autoscaling. - CUSTOM_METRIC_INVALID (ERROR): The custom metric that was specified does not exist or does not have the necessary labels. - MIN_EQUALS_MAX (WARNING): The minNumReplicas is equal to maxNumReplicas. This means the autoscaler cannot add or remove instances from the instance group. - MISSING_CUSTOM_METRIC_DATA_POINTS (WARNING): The autoscaler did not receive any data from the custom metric configured for autoscaling. - MISSING_LOAD_BALANCING_DATA_POINTS (WARNING): The autoscaler is configured to scale based on a load balancing signal but the instance group has not received any requests from the load balancer. - MODE_OFF (WARNING): Autoscaling is turned off. The number of instances in the group won't change automatically. The autoscaling configuration is preserved. - MODE_ONLY_UP (WARNING): Autoscaling is in the "Autoscale only out" mode. The autoscaler can add instances but not remove any. - MORE_THAN_ONE_BACKEND_SERVICE (ERROR): The instance group cannot be autoscaled because it has more than one backend service attached to it. - NOT_ENOUGH_QUOTA_AVAILABLE (ERROR): There is insufficient quota for the necessary resources, such as CPU or number of instances. - REGION_RESOURCE_STOCKOUT (ERROR): Shown only for regional autoscalers: there is a resource stockout in the chosen region. - SCALING_TARGET_DOES_NOT_EXIST (ERROR): The target to be scaled does not exist. - UNSUPPORTED_MAX_RATE_LOAD_BALANCING_CONFIGURATION (ERROR): Autoscaling does not work with an HTTP/S load balancer that has been configured for maxRate. - ZONE_RESOURCE_STOCKOUT (ERROR): For zonal autoscalers: there is a resource stockout in the chosen zone. For regional autoscalers: in at least one of the zones you're using there is a resource stockout. New values might be added in the future. Some of the values might not be available in all API versions.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * The type of error, warning, or notice returned. Current set of possible values: - ALL_INSTANCES_UNHEALTHY (WARNING): All instances in the instance group are unhealthy (not in RUNNING state). - BACKEND_SERVICE_DOES_NOT_EXIST (ERROR): There is no backend service attached to the instance group. - CAPPED_AT_MAX_NUM_REPLICAS (WARNING): Autoscaler recommends a size greater than maxNumReplicas. - CUSTOM_METRIC_DATA_POINTS_TOO_SPARSE (WARNING): The custom metric samples are not exported often enough to be a credible base for autoscaling. - CUSTOM_METRIC_INVALID (ERROR): The custom metric that was specified does not exist or does not have the necessary labels. - MIN_EQUALS_MAX (WARNING): The minNumReplicas is equal to maxNumReplicas. This means the autoscaler cannot add or remove instances from the instance group. - MISSING_CUSTOM_METRIC_DATA_POINTS (WARNING): The autoscaler did not receive any data from the custom metric configured for autoscaling. - MISSING_LOAD_BALANCING_DATA_POINTS (WARNING): The autoscaler is configured to scale based on a load balancing signal but the instance group has not received any requests from the load balancer. - MODE_OFF (WARNING): Autoscaling is turned off. The number of instances in the group won't change automatically. The autoscaling configuration is preserved. - MODE_ONLY_UP (WARNING): Autoscaling is in the "Autoscale only out" mode. The autoscaler can add instances but not remove any. - MORE_THAN_ONE_BACKEND_SERVICE (ERROR): The instance group cannot be autoscaled because it has more than one backend service attached to it. - NOT_ENOUGH_QUOTA_AVAILABLE (ERROR): There is insufficient quota for the necessary resources, such as CPU or number of instances. - REGION_RESOURCE_STOCKOUT (ERROR): Shown only for regional autoscalers: there is a resource stockout in the chosen region. - SCALING_TARGET_DOES_NOT_EXIST (ERROR): The target to be scaled does not exist. - UNSUPPORTED_MAX_RATE_LOAD_BALANCING_CONFIGURATION (ERROR): Autoscaling does not work with an HTTP/S load balancer that has been configured for maxRate. - ZONE_RESOURCE_STOCKOUT (ERROR): For zonal autoscalers: there is a resource stockout in the chosen zone. For regional autoscalers: in at least one of the zones you're using there is a resource stockout. New values might be added in the future. Some of the values might not be available in all API versions.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of error, warning, or notice returned. Current set of possible values: - ALL_INSTANCES_UNHEALTHY (WARNING): All instances in the instance group are unhealthy (not in RUNNING state). - BACKEND_SERVICE_DOES_NOT_EXIST (ERROR): There is no backend service attached to the instance group. - CAPPED_AT_MAX_NUM_REPLICAS (WARNING): Autoscaler recommends a size greater than maxNumReplicas. - CUSTOM_METRIC_DATA_POINTS_TOO_SPARSE (WARNING): The custom metric samples are not exported often enough to be a credible base for autoscaling. - CUSTOM_METRIC_INVALID (ERROR): The custom metric that was specified does not exist or does not have the necessary labels. - MIN_EQUALS_MAX (WARNING): The minNumReplicas is equal to maxNumReplicas. This means the autoscaler cannot add or remove instances from the instance group. - MISSING_CUSTOM_METRIC_DATA_POINTS (WARNING): The autoscaler did not receive any data from the custom metric configured for autoscaling. - MISSING_LOAD_BALANCING_DATA_POINTS (WARNING): The autoscaler is configured to scale based on a load balancing signal but the instance group has not received any requests from the load balancer. - MODE_OFF (WARNING): Autoscaling is turned off. The number of instances in the group won't change automatically. The autoscaling configuration is preserved. - MODE_ONLY_UP (WARNING): Autoscaling is in the "Autoscale only out" mode. The autoscaler can add instances but not remove any. - MORE_THAN_ONE_BACKEND_SERVICE (ERROR): The instance group cannot be autoscaled because it has more than one backend service attached to it. - NOT_ENOUGH_QUOTA_AVAILABLE (ERROR): There is insufficient quota for the necessary resources, such as CPU or number of instances. - REGION_RESOURCE_STOCKOUT (ERROR): Shown only for regional autoscalers: there is a resource stockout in the chosen region. - SCALING_TARGET_DOES_NOT_EXIST (ERROR): The target to be scaled does not exist. - UNSUPPORTED_MAX_RATE_LOAD_BALANCING_CONFIGURATION (ERROR): Autoscaling does not work with an HTTP/S load balancer that has been configured for maxRate. - ZONE_RESOURCE_STOCKOUT (ERROR): For zonal autoscalers: there is a resource stockout in the chosen zone. For regional autoscalers: in at least one of the zones you're using there is a resource stockout. New values might be added in the future. Some of the values might not be available in all API versions.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
