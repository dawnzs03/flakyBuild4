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
// source: google/cloud/discoveryengine/v1/document_service.proto

package com.google.cloud.discoveryengine.v1;

public interface UpdateDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.UpdateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The document to update/create.
   *
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1.Document], regardless of whether
   * or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * If the [Document][google.cloud.discoveryengine.v1.Document] to update does
   * not exist and
   * [allow_missing][google.cloud.discoveryengine.v1.UpdateDocumentRequest.allow_missing]
   * is not set, a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Required. The document to update/create.
   *
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1.Document], regardless of whether
   * or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * If the [Document][google.cloud.discoveryengine.v1.Document] to update does
   * not exist and
   * [allow_missing][google.cloud.discoveryengine.v1.UpdateDocumentRequest.allow_missing]
   * is not set, a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  com.google.cloud.discoveryengine.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Required. The document to update/create.
   *
   * If the caller does not have permission to update the
   * [Document][google.cloud.discoveryengine.v1.Document], regardless of whether
   * or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * If the [Document][google.cloud.discoveryengine.v1.Document] to update does
   * not exist and
   * [allow_missing][google.cloud.discoveryengine.v1.UpdateDocumentRequest.allow_missing]
   * is not set, a `NOT_FOUND` error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Document document = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the
   * [Document][google.cloud.discoveryengine.v1.Document] is not found, a new
   * [Document][google.cloud.discoveryengine.v1.Document] will be created.
   * </pre>
   *
   * <code>bool allow_missing = 2;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
