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

@java.lang.Deprecated
public interface FaceFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.FaceFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_boxes = 1;
   * </code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.NormalizedBoundingBox>
      getNormalizedBoundingBoxesList();
  /**
   *
   *
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_boxes = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1.NormalizedBoundingBox getNormalizedBoundingBoxes(int index);
  /**
   *
   *
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_boxes = 1;
   * </code>
   */
  int getNormalizedBoundingBoxesCount();
  /**
   *
   *
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_boxes = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder>
      getNormalizedBoundingBoxesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1.NormalizedBoundingBox normalized_bounding_boxes = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1.NormalizedBoundingBoxOrBuilder
      getNormalizedBoundingBoxesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();
}
