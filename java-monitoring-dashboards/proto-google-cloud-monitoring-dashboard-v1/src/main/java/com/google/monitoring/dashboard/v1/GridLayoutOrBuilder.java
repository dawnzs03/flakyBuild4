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
// source: google/monitoring/dashboard/v1/layouts.proto

package com.google.monitoring.dashboard.v1;

public interface GridLayoutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.GridLayout)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of columns into which the view's width is divided. If omitted
   * or set to zero, a system default will be used while rendering.
   * </pre>
   *
   * <code>int64 columns = 1;</code>
   *
   * @return The columns.
   */
  long getColumns();

  /**
   *
   *
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.Widget> getWidgetsList();
  /**
   *
   *
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  com.google.monitoring.dashboard.v1.Widget getWidgets(int index);
  /**
   *
   *
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  int getWidgetsCount();
  /**
   *
   *
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.WidgetOrBuilder>
      getWidgetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The informational elements that are arranged into the columns row-first.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.Widget widgets = 2;</code>
   */
  com.google.monitoring.dashboard.v1.WidgetOrBuilder getWidgetsOrBuilder(int index);
}
