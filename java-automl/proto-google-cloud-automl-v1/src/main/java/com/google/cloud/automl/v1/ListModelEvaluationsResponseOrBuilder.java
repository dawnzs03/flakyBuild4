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
// source: google/cloud/automl/v1/service.proto

package com.google.cloud.automl.v1;

public interface ListModelEvaluationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ListModelEvaluationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1.ModelEvaluation> getModelEvaluationList();
  /**
   *
   *
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  com.google.cloud.automl.v1.ModelEvaluation getModelEvaluation(int index);
  /**
   *
   *
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  int getModelEvaluationCount();
  /**
   *
   *
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1.ModelEvaluationOrBuilder>
      getModelEvaluationOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of model evaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1.ModelEvaluation model_evaluation = 1;</code>
   */
  com.google.cloud.automl.v1.ModelEvaluationOrBuilder getModelEvaluationOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
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
   * Pass to the [ListModelEvaluationsRequest.page_token][google.cloud.automl.v1.ListModelEvaluationsRequest.page_token] field of a new
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] request to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
