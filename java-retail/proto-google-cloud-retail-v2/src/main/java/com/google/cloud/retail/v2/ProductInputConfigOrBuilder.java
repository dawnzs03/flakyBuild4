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
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

public interface ProductInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.ProductInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Inline source for the input content for products.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ProductInlineSource product_inline_source = 1;</code>
   *
   * @return Whether the productInlineSource field is set.
   */
  boolean hasProductInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for products.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ProductInlineSource product_inline_source = 1;</code>
   *
   * @return The productInlineSource.
   */
  com.google.cloud.retail.v2.ProductInlineSource getProductInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for products.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.ProductInlineSource product_inline_source = 1;</code>
   */
  com.google.cloud.retail.v2.ProductInlineSourceOrBuilder getProductInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.retail.v2.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.GcsSource gcs_source = 2;</code>
   */
  com.google.cloud.retail.v2.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3;</code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  boolean hasBigQuerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3;</code>
   *
   * @return The bigQuerySource.
   */
  com.google.cloud.retail.v2.BigQuerySource getBigQuerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.BigQuerySource big_query_source = 3;</code>
   */
  com.google.cloud.retail.v2.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder();

  com.google.cloud.retail.v2.ProductInputConfig.SourceCase getSourceCase();
}
