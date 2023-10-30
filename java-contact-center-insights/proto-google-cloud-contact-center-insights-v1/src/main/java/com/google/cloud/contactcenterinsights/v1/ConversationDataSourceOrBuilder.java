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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface ConversationDataSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.ConversationDataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.contactcenterinsights.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   *
   * @return Whether the dialogflowSource field is set.
   */
  boolean hasDialogflowSource();
  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   *
   * @return The dialogflowSource.
   */
  com.google.cloud.contactcenterinsights.v1.DialogflowSource getDialogflowSource();
  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder
      getDialogflowSourceOrBuilder();

  com.google.cloud.contactcenterinsights.v1.ConversationDataSource.SourceCase getSourceCase();
}
