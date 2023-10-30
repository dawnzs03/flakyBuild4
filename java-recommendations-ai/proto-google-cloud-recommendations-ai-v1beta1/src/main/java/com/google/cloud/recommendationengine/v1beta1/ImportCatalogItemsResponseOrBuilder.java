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
// source: google/cloud/recommendationengine/v1beta1/import.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface ImportCatalogItemsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<com.google.rpc.Status> getErrorSamplesList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.Status getErrorSamples(int index);
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  int getErrorSamplesCount();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 2;</code>
   *
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 2;</code>
   *
   * @return The errorsConfig.
   */
  com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig getErrorsConfig();
  /**
   *
   *
   * <pre>
   * Echoes the destination for the complete errors in the request if set.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 2;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfigOrBuilder
      getErrorsConfigOrBuilder();
}
