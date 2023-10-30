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
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

public interface DescribeDatabaseEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.DescribeDatabaseEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose database entities
   * are described. Must be in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversionWorkspace.
   */
  java.lang.String getConversionWorkspace();
  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose database entities
   * are described. Must be in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversionWorkspace.
   */
  com.google.protobuf.ByteString getConversionWorkspaceBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of entities to return. The service may return
   * fewer entities than the value specifies.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The nextPageToken value received in the previous call to
   * conversionWorkspace.describeDatabaseEntities, used in the subsequent
   * request to retrieve the next page of results. On first call this should be
   * left blank. When paginating, all other parameters provided to
   * conversionWorkspace.describeDatabaseEntities must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The nextPageToken value received in the previous call to
   * conversionWorkspace.describeDatabaseEntities, used in the subsequent
   * request to retrieve the next page of results. On first call this should be
   * left blank. When paginating, all other parameters provided to
   * conversionWorkspace.describeDatabaseEntities must match the call that
   * provided the page token.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The tree to fetch.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DescribeDatabaseEntitiesRequest.DBTreeType tree = 6;</code>
   *
   * @return The enum numeric value on the wire for tree.
   */
  int getTreeValue();
  /**
   *
   *
   * <pre>
   * The tree to fetch.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DescribeDatabaseEntitiesRequest.DBTreeType tree = 6;</code>
   *
   * @return The tree.
   */
  com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesRequest.DBTreeType getTree();

  /**
   *
   *
   * <pre>
   * Whether to retrieve the latest committed version of the entities or the
   * latest version. This field is ignored if a specific commit_id is specified.
   * </pre>
   *
   * <code>bool uncommitted = 11;</code>
   *
   * @return The uncommitted.
   */
  boolean getUncommitted();

  /**
   *
   *
   * <pre>
   * Request a specific commit ID. If not specified, the entities from the
   * latest commit are returned.
   * </pre>
   *
   * <code>string commit_id = 12;</code>
   *
   * @return The commitId.
   */
  java.lang.String getCommitId();
  /**
   *
   *
   * <pre>
   * Request a specific commit ID. If not specified, the entities from the
   * latest commit are returned.
   * </pre>
   *
   * <code>string commit_id = 12;</code>
   *
   * @return The bytes for commitId.
   */
  com.google.protobuf.ByteString getCommitIdBytes();

  /**
   *
   *
   * <pre>
   * Filter the returned entities based on AIP-160 standard.
   * </pre>
   *
   * <code>string filter = 13;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter the returned entities based on AIP-160 standard.
   * </pre>
   *
   * <code>string filter = 13;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
