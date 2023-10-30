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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface ExplicitContentAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.ExplicitContentAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.ExplicitContentFrame> getFramesList();
  /**
   *
   *
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentFrame getFrames(int index);
  /**
   *
   *
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  int getFramesCount();
  /**
   *
   *
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.ExplicitContentFrameOrBuilder>
      getFramesOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentFrameOrBuilder getFramesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
