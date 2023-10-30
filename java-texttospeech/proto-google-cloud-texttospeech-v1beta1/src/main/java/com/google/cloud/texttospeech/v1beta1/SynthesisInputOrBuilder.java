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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

public interface SynthesisInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.SynthesisInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * The raw text to be synthesized.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return Whether the ssml field is set.
   */
  boolean hasSsml();
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return The ssml.
   */
  java.lang.String getSsml();
  /**
   *
   *
   * <pre>
   * The SSML document to be synthesized. The SSML document must be valid
   * and well-formed. Otherwise the RPC will fail and return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]. For more information, see
   * [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
   * </pre>
   *
   * <code>string ssml = 2;</code>
   *
   * @return The bytes for ssml.
   */
  com.google.protobuf.ByteString getSsmlBytes();

  com.google.cloud.texttospeech.v1beta1.SynthesisInput.InputSourceCase getInputSourceCase();
}
