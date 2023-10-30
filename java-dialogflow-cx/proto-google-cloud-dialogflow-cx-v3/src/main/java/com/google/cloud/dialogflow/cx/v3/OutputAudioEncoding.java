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
// source: google/cloud/dialogflow/cx/v3/audio_config.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * Audio encoding of the output audio format in Text-To-Speech.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.cx.v3.OutputAudioEncoding}
 */
public enum OutputAudioEncoding implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  OUTPUT_AUDIO_ENCODING_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_LINEAR_16 = 1;</code>
   */
  OUTPUT_AUDIO_ENCODING_LINEAR_16(1),
  /**
   *
   *
   * <pre>
   * MP3 audio at 32kbps.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MP3 = 2;</code>
   */
  OUTPUT_AUDIO_ENCODING_MP3(2),
  /**
   *
   *
   * <pre>
   * MP3 audio at 64kbps.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MP3_64_KBPS = 4;</code>
   */
  OUTPUT_AUDIO_ENCODING_MP3_64_KBPS(4),
  /**
   *
   *
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result will be a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_OGG_OPUS = 3;</code>
   */
  OUTPUT_AUDIO_ENCODING_OGG_OPUS(3),
  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MULAW = 5;</code>
   */
  OUTPUT_AUDIO_ENCODING_MULAW(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_LINEAR_16 = 1;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_LINEAR_16_VALUE = 1;
  /**
   *
   *
   * <pre>
   * MP3 audio at 32kbps.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MP3 = 2;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_MP3_VALUE = 2;
  /**
   *
   *
   * <pre>
   * MP3 audio at 64kbps.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MP3_64_KBPS = 4;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_MP3_64_KBPS_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result will be a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_OGG_OPUS = 3;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_OGG_OPUS_VALUE = 3;
  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * </pre>
   *
   * <code>OUTPUT_AUDIO_ENCODING_MULAW = 5;</code>
   */
  public static final int OUTPUT_AUDIO_ENCODING_MULAW_VALUE = 5;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OutputAudioEncoding valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OutputAudioEncoding forNumber(int value) {
    switch (value) {
      case 0:
        return OUTPUT_AUDIO_ENCODING_UNSPECIFIED;
      case 1:
        return OUTPUT_AUDIO_ENCODING_LINEAR_16;
      case 2:
        return OUTPUT_AUDIO_ENCODING_MP3;
      case 4:
        return OUTPUT_AUDIO_ENCODING_MP3_64_KBPS;
      case 3:
        return OUTPUT_AUDIO_ENCODING_OGG_OPUS;
      case 5:
        return OUTPUT_AUDIO_ENCODING_MULAW;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OutputAudioEncoding>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OutputAudioEncoding>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OutputAudioEncoding>() {
            public OutputAudioEncoding findValueByNumber(int number) {
              return OutputAudioEncoding.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.AudioConfigProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final OutputAudioEncoding[] VALUES = values();

  public static OutputAudioEncoding valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OutputAudioEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3.OutputAudioEncoding)
}
