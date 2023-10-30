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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DeidentifyContentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DeidentifyContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return The item.
   */
  com.google.privacy.dlp.v2.ContentItem getItem();
  /**
   *
   *
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder();

  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   *
   * @return Whether the overview field is set.
   */
  boolean hasOverview();
  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   *
   * @return The overview.
   */
  com.google.privacy.dlp.v2.TransformationOverview getOverview();
  /**
   *
   *
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationOverview overview = 2;</code>
   */
  com.google.privacy.dlp.v2.TransformationOverviewOrBuilder getOverviewOrBuilder();
}
