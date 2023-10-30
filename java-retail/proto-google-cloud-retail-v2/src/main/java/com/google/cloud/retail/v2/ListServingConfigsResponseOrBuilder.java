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
// source: google/cloud/retail/v2/serving_config_service.proto

package com.google.cloud.retail.v2;

public interface ListServingConfigsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ListServingConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.ServingConfig serving_configs = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2.ServingConfig> getServingConfigsList();
  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.ServingConfig serving_configs = 1;</code>
   */
  com.google.cloud.retail.v2.ServingConfig getServingConfigs(int index);
  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.ServingConfig serving_configs = 1;</code>
   */
  int getServingConfigsCount();
  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.ServingConfig serving_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2.ServingConfigOrBuilder>
      getServingConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2.ServingConfig serving_configs = 1;</code>
   */
  com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token, if not returned indicates the last page.
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
   * Pagination token, if not returned indicates the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
