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
// source: google/cloud/run/v2/revision.proto

package com.google.cloud.run.v2;

public interface ListRevisionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ListRevisionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Service from which the Revisions should be listed.
   * To list all Revisions across Services, use "-" instead of Service name.
   * Format:
   * projects/{project}/locations/{location}/services/{service}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The Service from which the Revisions should be listed.
   * To list all Revisions across Services, use "-" instead of Service name.
   * Format:
   * projects/{project}/locations/{location}/services/{service}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of revisions to return in this call.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token received from a previous call to ListRevisions.
   * All other parameters must match.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token received from a previous call to ListRevisions.
   * All other parameters must match.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * If true, returns deleted (but unexpired) resources along with active ones.
   * </pre>
   *
   * <code>bool show_deleted = 4;</code>
   *
   * @return The showDeleted.
   */
  boolean getShowDeleted();
}
