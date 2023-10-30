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

public interface RegionInstanceGroupManagersListInstanceConfigsRespOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupManagersListInstanceConfigsResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The list of PerInstanceConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig items = 100526016;</code>
   */
  java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> getItemsList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of PerInstanceConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig items = 100526016;</code>
   */
  com.google.cloud.compute.v1.PerInstanceConfig getItems(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The list of PerInstanceConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig items = 100526016;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of PerInstanceConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig items = 100526016;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
      getItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] The list of PerInstanceConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig items = 100526016;</code>
   */
  com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return Whether the nextPageToken field is set.
   */
  boolean hasNextPageToken();
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
