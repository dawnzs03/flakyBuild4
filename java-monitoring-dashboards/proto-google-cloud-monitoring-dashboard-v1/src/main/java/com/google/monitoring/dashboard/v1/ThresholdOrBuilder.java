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
// source: google/monitoring/dashboard/v1/metrics.proto

package com.google.monitoring.dashboard.v1;

public interface ThresholdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.Threshold)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A label for the threshold.
   * </pre>
   *
   * <code>string label = 1;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * A label for the threshold.
   * </pre>
   *
   * <code>string label = 1;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  /**
   *
   *
   * <pre>
   * The value of the threshold. The value should be defined in the native scale
   * of the metric.
   * </pre>
   *
   * <code>double value = 2;</code>
   *
   * @return The value.
   */
  double getValue();

  /**
   *
   *
   * <pre>
   * The state color for this threshold. Color is not allowed in a XyChart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.Color color = 3;</code>
   *
   * @return The enum numeric value on the wire for color.
   */
  int getColorValue();
  /**
   *
   *
   * <pre>
   * The state color for this threshold. Color is not allowed in a XyChart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.Color color = 3;</code>
   *
   * @return The color.
   */
  com.google.monitoring.dashboard.v1.Threshold.Color getColor();

  /**
   *
   *
   * <pre>
   * The direction for the current threshold. Direction is not allowed in a
   * XyChart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.Direction direction = 4;</code>
   *
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   *
   *
   * <pre>
   * The direction for the current threshold. Direction is not allowed in a
   * XyChart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.Direction direction = 4;</code>
   *
   * @return The direction.
   */
  com.google.monitoring.dashboard.v1.Threshold.Direction getDirection();

  /**
   *
   *
   * <pre>
   * The target axis to use for plotting the threshold. Target axis is not
   * allowed in a Scorecard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.TargetAxis target_axis = 5;</code>
   *
   * @return The enum numeric value on the wire for targetAxis.
   */
  int getTargetAxisValue();
  /**
   *
   *
   * <pre>
   * The target axis to use for plotting the threshold. Target axis is not
   * allowed in a Scorecard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Threshold.TargetAxis target_axis = 5;</code>
   *
   * @return The targetAxis.
   */
  com.google.monitoring.dashboard.v1.Threshold.TargetAxis getTargetAxis();
}
