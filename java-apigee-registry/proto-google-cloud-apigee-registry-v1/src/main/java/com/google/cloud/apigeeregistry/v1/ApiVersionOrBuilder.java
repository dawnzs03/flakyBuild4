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
// source: google/cloud/apigeeregistry/v1/registry_models.proto

package com.google.cloud.apigeeregistry.v1;

public interface ApiVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeregistry.v1.ApiVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-meaningful name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A detailed description.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A user-definable description of the lifecycle phase of this API version.
   * Format: free-form, but we expect single words that describe API maturity,
   * e.g., "CONCEPT", "DESIGN", "DEVELOPMENT", "STAGING", "PRODUCTION",
   * "DEPRECATED", "RETIRED".
   * </pre>
   *
   * <code>string state = 6;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * A user-definable description of the lifecycle phase of this API version.
   * Format: free-form, but we expect single words that describe API maturity,
   * e.g., "CONCEPT", "DESIGN", "DEVELOPMENT", "STAGING", "PRODUCTION",
   * "DEPRECATED", "RETIRED".
   * </pre>
   *
   * <code>string state = 6;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels attach identifying metadata to resources. Identifying metadata can
   * be used to filter list operations.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one resource (System
   * labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with
   * `apigeeregistry.googleapis.com/` and cannot be changed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   *
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   *
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   *
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   *
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Annotations attach non-identifying metadata to resources.
   *
   * Annotation keys and values are less restricted than those of labels, but
   * should be generally used for small values of broad interest. Larger, topic-
   * specific metadata should be stored in Artifacts.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);
}
