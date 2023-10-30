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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface ListImportDataFilesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.ListImportDataFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of import data files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportDataFile import_data_files = 1;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ImportDataFile> getImportDataFilesList();
  /**
   *
   *
   * <pre>
   * The list of import data files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportDataFile import_data_files = 1;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportDataFile getImportDataFiles(int index);
  /**
   *
   *
   * <pre>
   * The list of import data files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportDataFile import_data_files = 1;</code>
   */
  int getImportDataFilesCount();
  /**
   *
   *
   * <pre>
   * The list of import data files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportDataFile import_data_files = 1;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ImportDataFileOrBuilder>
      getImportDataFilesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of import data files.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportDataFile import_data_files = 1;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportDataFileOrBuilder getImportDataFilesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
