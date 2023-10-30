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
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface WorkspaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.Workspace)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the workspace.
   * Workspace names have the form `workspaces/{workspace}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the workspace.
   * Workspace names have the form `workspaces/{workspace}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The human readable title of the workspace.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The human readable title of the workspace.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The list of tables in the workspace.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Table tables = 3;</code>
   */
  java.util.List<com.google.area120.tables.v1alpha1.Table> getTablesList();
  /**
   *
   *
   * <pre>
   * The list of tables in the workspace.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Table tables = 3;</code>
   */
  com.google.area120.tables.v1alpha1.Table getTables(int index);
  /**
   *
   *
   * <pre>
   * The list of tables in the workspace.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Table tables = 3;</code>
   */
  int getTablesCount();
  /**
   *
   *
   * <pre>
   * The list of tables in the workspace.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Table tables = 3;</code>
   */
  java.util.List<? extends com.google.area120.tables.v1alpha1.TableOrBuilder>
      getTablesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of tables in the workspace.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.Table tables = 3;</code>
   */
  com.google.area120.tables.v1alpha1.TableOrBuilder getTablesOrBuilder(int index);
}
