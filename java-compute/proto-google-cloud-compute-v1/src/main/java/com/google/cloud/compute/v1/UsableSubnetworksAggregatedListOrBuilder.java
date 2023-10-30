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

public interface UsableSubnetworksAggregatedListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UsableSubnetworksAggregatedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output] A list of usable subnetwork URLs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UsableSubnetwork items = 100526016;</code>
   */
  java.util.List<com.google.cloud.compute.v1.UsableSubnetwork> getItemsList();
  /**
   *
   *
   * <pre>
   * [Output] A list of usable subnetwork URLs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UsableSubnetwork items = 100526016;</code>
   */
  com.google.cloud.compute.v1.UsableSubnetwork getItems(int index);
  /**
   *
   *
   * <pre>
   * [Output] A list of usable subnetwork URLs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UsableSubnetwork items = 100526016;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * [Output] A list of usable subnetwork URLs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UsableSubnetwork items = 100526016;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.UsableSubnetworkOrBuilder>
      getItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output] A list of usable subnetwork URLs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.UsableSubnetwork items = 100526016;</code>
   */
  com.google.cloud.compute.v1.UsableSubnetworkOrBuilder getItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated lists of usable subnetworks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated lists of usable subnetworks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#usableSubnetworksAggregatedList for aggregated lists of usable subnetworks.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results. In special cases listUsable may return 0 subnetworks and nextPageToken which still should be used to get the next page of results.
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
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results. In special cases listUsable may return 0 subnetworks and nextPageToken which still should be used to get the next page of results.
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
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results. In special cases listUsable may return 0 subnetworks and nextPageToken which still should be used to get the next page of results.
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
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

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
