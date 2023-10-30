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
// source: google/cloud/retail/v2beta/completion_service.proto

package com.google.cloud.retail.v2beta;

public interface CompleteQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.CompleteQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Catalog for which the completion is performed.
   *
   * Full resource name of catalog, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>
   * string catalog = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The catalog.
   */
  java.lang.String getCatalog();
  /**
   *
   *
   * <pre>
   * Required. Catalog for which the completion is performed.
   *
   * Full resource name of catalog, such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog`.
   * </pre>
   *
   * <code>
   * string catalog = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for catalog.
   */
  com.google.protobuf.ByteString getCatalogBytes();

  /**
   *
   *
   * <pre>
   * Required. The query used to generate suggestions.
   *
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query used to generate suggestions.
   *
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Required field. A unique identifier for tracking visitors. For example,
   * this could be implemented with an HTTP cookie, which should be able to
   * uniquely identify a visitor on a single device. This unique identifier
   * should not change if the visitor logs in or out of the website.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string visitor_id = 7;</code>
   *
   * @return The visitorId.
   */
  java.lang.String getVisitorId();
  /**
   *
   *
   * <pre>
   * Required field. A unique identifier for tracking visitors. For example,
   * this could be implemented with an HTTP cookie, which should be able to
   * uniquely identify a visitor on a single device. This unique identifier
   * should not change if the visitor logs in or out of the website.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string visitor_id = 7;</code>
   *
   * @return The bytes for visitorId.
   */
  com.google.protobuf.ByteString getVisitorIdBytes();

  /**
   *
   *
   * <pre>
   * Note that this field applies for `user-data` dataset only. For requests
   * with `cloud-retail` dataset, setting this field has no effect.
   *
   * The language filters applied to the output suggestions. If set, it should
   * contain the language of the query. If not set, suggestions are returned
   * without considering language restrictions. This is the BCP-47 language
   * code, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum
   * number of language codes is 3.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String> getLanguageCodesList();
  /**
   *
   *
   * <pre>
   * Note that this field applies for `user-data` dataset only. For requests
   * with `cloud-retail` dataset, setting this field has no effect.
   *
   * The language filters applied to the output suggestions. If set, it should
   * contain the language of the query. If not set, suggestions are returned
   * without considering language restrictions. This is the BCP-47 language
   * code, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum
   * number of language codes is 3.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * Note that this field applies for `user-data` dataset only. For requests
   * with `cloud-retail` dataset, setting this field has no effect.
   *
   * The language filters applied to the output suggestions. If set, it should
   * contain the language of the query. If not set, suggestions are returned
   * without considering language restrictions. This is the BCP-47 language
   * code, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum
   * number of language codes is 3.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * Note that this field applies for `user-data` dataset only. For requests
   * with `cloud-retail` dataset, setting this field has no effect.
   *
   * The language filters applied to the output suggestions. If set, it should
   * contain the language of the query. If not set, suggestions are returned
   * without considering language restrictions. This is the BCP-47 language
   * code, such as "en-US" or "sr-Latn". For more information, see [Tags for
   * Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum
   * number of language codes is 3.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString getLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * The device type context for completion suggestions. We recommend that you
   * leave this field empty.
   *
   * It can apply different suggestions on different device types, e.g.
   * `DESKTOP`, `MOBILE`. If it is empty, the suggestions are across all device
   * types.
   *
   * Supported formats:
   *
   * * `UNKNOWN_DEVICE_TYPE`
   *
   * * `DESKTOP`
   *
   * * `MOBILE`
   *
   * * A customized string starts with `OTHER_`, e.g. `OTHER_IPHONE`.
   * </pre>
   *
   * <code>string device_type = 4;</code>
   *
   * @return The deviceType.
   */
  java.lang.String getDeviceType();
  /**
   *
   *
   * <pre>
   * The device type context for completion suggestions. We recommend that you
   * leave this field empty.
   *
   * It can apply different suggestions on different device types, e.g.
   * `DESKTOP`, `MOBILE`. If it is empty, the suggestions are across all device
   * types.
   *
   * Supported formats:
   *
   * * `UNKNOWN_DEVICE_TYPE`
   *
   * * `DESKTOP`
   *
   * * `MOBILE`
   *
   * * A customized string starts with `OTHER_`, e.g. `OTHER_IPHONE`.
   * </pre>
   *
   * <code>string device_type = 4;</code>
   *
   * @return The bytes for deviceType.
   */
  com.google.protobuf.ByteString getDeviceTypeBytes();

  /**
   *
   *
   * <pre>
   * Determines which dataset to use for fetching completion. "user-data" will
   * use the imported dataset through
   * [CompletionService.ImportCompletionData][google.cloud.retail.v2beta.CompletionService.ImportCompletionData].
   * "cloud-retail" will use the dataset generated by cloud retail based on user
   * events. If leave empty, it will use the "user-data".
   *
   * Current supported values:
   *
   * * user-data
   *
   * * cloud-retail:
   *   This option requires enabling auto-learning function first. See
   *   [guidelines](https://cloud.google.com/retail/docs/completion-overview#generated-completion-dataset).
   * </pre>
   *
   * <code>string dataset = 6;</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Determines which dataset to use for fetching completion. "user-data" will
   * use the imported dataset through
   * [CompletionService.ImportCompletionData][google.cloud.retail.v2beta.CompletionService.ImportCompletionData].
   * "cloud-retail" will use the dataset generated by cloud retail based on user
   * events. If leave empty, it will use the "user-data".
   *
   * Current supported values:
   *
   * * user-data
   *
   * * cloud-retail:
   *   This option requires enabling auto-learning function first. See
   *   [guidelines](https://cloud.google.com/retail/docs/completion-overview#generated-completion-dataset).
   * </pre>
   *
   * <code>string dataset = 6;</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Completion max suggestions. If left unset or set to 0, then will fallback
   * to the configured value
   * [CompletionConfig.max_suggestions][google.cloud.retail.v2beta.CompletionConfig.max_suggestions].
   *
   * The maximum allowed max suggestions is 20. If it is set higher, it will be
   * capped by 20.
   * </pre>
   *
   * <code>int32 max_suggestions = 5;</code>
   *
   * @return The maxSuggestions.
   */
  int getMaxSuggestions();

  /**
   *
   *
   * <pre>
   * The entity for customers that may run multiple different entities, domains,
   * sites or regions, for example, `Google US`, `Google Ads`, `Waymo`,
   * `google.com`, `youtube.com`, etc.
   * If this is set, it should be exactly matched with
   * [UserEvent.entity][google.cloud.retail.v2beta.UserEvent.entity] to get
   * per-entity autocomplete results.
   * </pre>
   *
   * <code>string entity = 10;</code>
   *
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   *
   *
   * <pre>
   * The entity for customers that may run multiple different entities, domains,
   * sites or regions, for example, `Google US`, `Google Ads`, `Waymo`,
   * `google.com`, `youtube.com`, etc.
   * If this is set, it should be exactly matched with
   * [UserEvent.entity][google.cloud.retail.v2beta.UserEvent.entity] to get
   * per-entity autocomplete results.
   * </pre>
   *
   * <code>string entity = 10;</code>
   *
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString getEntityBytes();
}
