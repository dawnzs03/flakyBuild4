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
// source: google/cloud/retail/v2/catalog_service.proto

package com.google.cloud.retail.v2;

public interface RemoveCatalogAttributeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.RemoveCatalogAttributeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The attributesConfig.
   */
  java.lang.String getAttributesConfig();
  /**
   *
   *
   * <pre>
   * Required. Full AttributesConfig resource name. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for attributesConfig.
   */
  com.google.protobuf.ByteString getAttributesConfigBytes();

  /**
   *
   *
   * <pre>
   * Required. The attribute name key of the
   * [CatalogAttribute][google.cloud.retail.v2.CatalogAttribute] to remove.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Required. The attribute name key of the
   * [CatalogAttribute][google.cloud.retail.v2.CatalogAttribute] to remove.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();
}
