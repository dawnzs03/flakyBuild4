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
// source: google/monitoring/dashboard/v1/xychart.proto

package com.google.monitoring.dashboard.v1;

public interface XyChartOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.XyChart)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The data displayed in this chart.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.XyChart.DataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.XyChart.DataSet> getDataSetsList();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this chart.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.XyChart.DataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.dashboard.v1.XyChart.DataSet getDataSets(int index);
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this chart.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.XyChart.DataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getDataSetsCount();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this chart.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.XyChart.DataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.XyChart.DataSetOrBuilder>
      getDataSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this chart.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.XyChart.DataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.dashboard.v1.XyChart.DataSetOrBuilder getDataSetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The duration used to display a comparison chart. A comparison chart
   * simultaneously shows values from two similar-length time periods
   * (e.g., week-over-week metrics).
   * The duration must be positive, and it can only be applied to charts with
   * data sets of LINE plot type.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeshift_duration = 4;</code>
   *
   * @return Whether the timeshiftDuration field is set.
   */
  boolean hasTimeshiftDuration();
  /**
   *
   *
   * <pre>
   * The duration used to display a comparison chart. A comparison chart
   * simultaneously shows values from two similar-length time periods
   * (e.g., week-over-week metrics).
   * The duration must be positive, and it can only be applied to charts with
   * data sets of LINE plot type.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeshift_duration = 4;</code>
   *
   * @return The timeshiftDuration.
   */
  com.google.protobuf.Duration getTimeshiftDuration();
  /**
   *
   *
   * <pre>
   * The duration used to display a comparison chart. A comparison chart
   * simultaneously shows values from two similar-length time periods
   * (e.g., week-over-week metrics).
   * The duration must be positive, and it can only be applied to charts with
   * data sets of LINE plot type.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeshift_duration = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeshiftDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Threshold lines drawn horizontally across the chart.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Threshold thresholds = 5;</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.Threshold> getThresholdsList();
  /**
   *
   *
   * <pre>
   * Threshold lines drawn horizontally across the chart.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Threshold thresholds = 5;</code>
   */
  com.google.monitoring.dashboard.v1.Threshold getThresholds(int index);
  /**
   *
   *
   * <pre>
   * Threshold lines drawn horizontally across the chart.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Threshold thresholds = 5;</code>
   */
  int getThresholdsCount();
  /**
   *
   *
   * <pre>
   * Threshold lines drawn horizontally across the chart.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Threshold thresholds = 5;</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.ThresholdOrBuilder>
      getThresholdsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Threshold lines drawn horizontally across the chart.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Threshold thresholds = 5;</code>
   */
  com.google.monitoring.dashboard.v1.ThresholdOrBuilder getThresholdsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The properties applied to the X axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis x_axis = 6;</code>
   *
   * @return Whether the xAxis field is set.
   */
  boolean hasXAxis();
  /**
   *
   *
   * <pre>
   * The properties applied to the X axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis x_axis = 6;</code>
   *
   * @return The xAxis.
   */
  com.google.monitoring.dashboard.v1.XyChart.Axis getXAxis();
  /**
   *
   *
   * <pre>
   * The properties applied to the X axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis x_axis = 6;</code>
   */
  com.google.monitoring.dashboard.v1.XyChart.AxisOrBuilder getXAxisOrBuilder();

  /**
   *
   *
   * <pre>
   * The properties applied to the Y axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y_axis = 7;</code>
   *
   * @return Whether the yAxis field is set.
   */
  boolean hasYAxis();
  /**
   *
   *
   * <pre>
   * The properties applied to the Y axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y_axis = 7;</code>
   *
   * @return The yAxis.
   */
  com.google.monitoring.dashboard.v1.XyChart.Axis getYAxis();
  /**
   *
   *
   * <pre>
   * The properties applied to the Y axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y_axis = 7;</code>
   */
  com.google.monitoring.dashboard.v1.XyChart.AxisOrBuilder getYAxisOrBuilder();

  /**
   *
   *
   * <pre>
   * The properties applied to the Y2 axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y2_axis = 9;</code>
   *
   * @return Whether the y2Axis field is set.
   */
  boolean hasY2Axis();
  /**
   *
   *
   * <pre>
   * The properties applied to the Y2 axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y2_axis = 9;</code>
   *
   * @return The y2Axis.
   */
  com.google.monitoring.dashboard.v1.XyChart.Axis getY2Axis();
  /**
   *
   *
   * <pre>
   * The properties applied to the Y2 axis.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.XyChart.Axis y2_axis = 9;</code>
   */
  com.google.monitoring.dashboard.v1.XyChart.AxisOrBuilder getY2AxisOrBuilder();

  /**
   *
   *
   * <pre>
   * Display options for the chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ChartOptions chart_options = 8;</code>
   *
   * @return Whether the chartOptions field is set.
   */
  boolean hasChartOptions();
  /**
   *
   *
   * <pre>
   * Display options for the chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ChartOptions chart_options = 8;</code>
   *
   * @return The chartOptions.
   */
  com.google.monitoring.dashboard.v1.ChartOptions getChartOptions();
  /**
   *
   *
   * <pre>
   * Display options for the chart.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ChartOptions chart_options = 8;</code>
   */
  com.google.monitoring.dashboard.v1.ChartOptionsOrBuilder getChartOptionsOrBuilder();
}
