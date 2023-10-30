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

public interface ListAnnotationSpecSetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getAnnotationSpecSetsList();
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSets(int index);
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  int getAnnotationSpecSetsCount();
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
      getAnnotationSpecSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder getAnnotationSpecSetsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
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
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
