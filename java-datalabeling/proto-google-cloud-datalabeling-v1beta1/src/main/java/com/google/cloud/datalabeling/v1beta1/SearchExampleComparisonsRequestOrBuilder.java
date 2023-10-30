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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface SearchExampleComparisonsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the [Evaluation][google.cloud.datalabeling.v1beta1.Evaluation] resource to search for example
   * comparisons from. Format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/datasets/&lt;var&gt;{dataset_id}&lt;/var&gt;/evaluations/&lt;var&gt;{evaluation_id}&lt;/var&gt;"
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
   * Required. Name of the [Evaluation][google.cloud.datalabeling.v1beta1.Evaluation] resource to search for example
   * comparisons from. Format:
   *
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/datasets/&lt;var&gt;{dataset_id}&lt;/var&gt;/evaluations/&lt;var&gt;{evaluation_id}&lt;/var&gt;"
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
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][SearchExampleComparisons.next_page_token] of the response
   * to a previous search rquest.
   *
   * If you don't specify this field, the API call requests the first page of
   * the search.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][SearchExampleComparisons.next_page_token] of the response
   * to a previous search rquest.
   *
   * If you don't specify this field, the API call requests the first page of
   * the search.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
