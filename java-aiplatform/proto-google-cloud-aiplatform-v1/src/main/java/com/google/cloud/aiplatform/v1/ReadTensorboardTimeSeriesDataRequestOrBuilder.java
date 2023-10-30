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
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface ReadTensorboardTimeSeriesDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to read data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The tensorboardTimeSeries.
   */
  java.lang.String getTensorboardTimeSeries();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to read data from.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string tensorboard_time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for tensorboardTimeSeries.
   */
  com.google.protobuf.ByteString getTensorboardTimeSeriesBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of TensorboardTimeSeries' data to return.
   *
   * This value should be a positive integer.
   * This value can be set to -1 to return all data.
   * </pre>
   *
   * <code>int32 max_data_points = 2;</code>
   *
   * @return The maxDataPoints.
   */
  int getMaxDataPoints();

  /**
   *
   *
   * <pre>
   * Reads the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Reads the TensorboardTimeSeries' data that match the filter expression.
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
