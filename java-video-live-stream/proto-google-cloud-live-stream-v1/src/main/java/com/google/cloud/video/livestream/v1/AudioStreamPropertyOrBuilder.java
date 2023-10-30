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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

public interface AudioStreamPropertyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.AudioStreamProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Index of this audio stream.
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   *
   * @return Whether the audioFormat field is set.
   */
  boolean hasAudioFormat();
  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   *
   * @return The audioFormat.
   */
  com.google.cloud.video.livestream.v1.AudioFormat getAudioFormat();
  /**
   *
   *
   * <pre>
   * Properties of the audio format.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.AudioFormat audio_format = 2;</code>
   */
  com.google.cloud.video.livestream.v1.AudioFormatOrBuilder getAudioFormatOrBuilder();
}
