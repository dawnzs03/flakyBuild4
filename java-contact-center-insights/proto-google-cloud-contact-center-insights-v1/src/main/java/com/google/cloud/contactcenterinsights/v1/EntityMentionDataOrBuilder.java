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

public interface EntityMentionDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.EntityMentionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The key of this entity in conversation entities.
   * Can be used to retrieve the exact `Entity` this mention is attached to.
   * </pre>
   *
   * <code>string entity_unique_id = 1;</code>
   *
   * @return The entityUniqueId.
   */
  java.lang.String getEntityUniqueId();
  /**
   *
   *
   * <pre>
   * The key of this entity in conversation entities.
   * Can be used to retrieve the exact `Entity` this mention is attached to.
   * </pre>
   *
   * <code>string entity_unique_id = 1;</code>
   *
   * @return The bytes for entityUniqueId.
   */
  com.google.protobuf.ByteString getEntityUniqueIdBytes();

  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the entity mention.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.contactcenterinsights.v1.EntityMentionData.MentionType getType();

  /**
   *
   *
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   *
   * @return Whether the sentiment field is set.
   */
  boolean hasSentiment();
  /**
   *
   *
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   *
   * @return The sentiment.
   */
  com.google.cloud.contactcenterinsights.v1.SentimentData getSentiment();
  /**
   *
   *
   * <pre>
   * Sentiment expressed for this mention of the entity.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentOrBuilder();
}
