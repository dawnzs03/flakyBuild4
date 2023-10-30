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
// source: google/monitoring/dashboard/v1/table.proto

package com.google.monitoring.dashboard.v1;

public interface TimeSeriesTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.TimeSeriesTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet> getDataSetsList();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet getDataSets(int index);
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getDataSetsCount();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSetOrBuilder>
      getDataSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The data displayed in this table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSet data_sets = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.TableDataSetOrBuilder getDataSetsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Store rendering strategy
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.TimeSeriesTable.MetricVisualization metric_visualization = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for metricVisualization.
   */
  int getMetricVisualizationValue();
  /**
   *
   *
   * <pre>
   * Optional. Store rendering strategy
   * </pre>
   *
   * <code>
   * .google.monitoring.dashboard.v1.TimeSeriesTable.MetricVisualization metric_visualization = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metricVisualization.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.MetricVisualization getMetricVisualization();

  /**
   *
   *
   * <pre>
   * Optional. The list of the persistent column settings for the table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings column_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings>
      getColumnSettingsList();
  /**
   *
   *
   * <pre>
   * Optional. The list of the persistent column settings for the table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings column_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings getColumnSettings(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of the persistent column settings for the table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings column_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getColumnSettingsCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of the persistent column settings for the table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings column_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends com.google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettingsOrBuilder>
      getColumnSettingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The list of the persistent column settings for the table.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettings column_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesTable.ColumnSettingsOrBuilder
      getColumnSettingsOrBuilder(int index);
}
