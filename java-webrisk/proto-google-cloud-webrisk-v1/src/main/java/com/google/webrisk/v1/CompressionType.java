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
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

/**
 *
 *
 * <pre>
 * The ways in which threat entry sets can be compressed.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.webrisk.v1.CompressionType}
 */
public enum CompressionType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>COMPRESSION_TYPE_UNSPECIFIED = 0;</code>
   */
  COMPRESSION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Raw, uncompressed data.
   * </pre>
   *
   * <code>RAW = 1;</code>
   */
  RAW(1),
  /**
   *
   *
   * <pre>
   * Rice-Golomb encoded data.
   * </pre>
   *
   * <code>RICE = 2;</code>
   */
  RICE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>COMPRESSION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int COMPRESSION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Raw, uncompressed data.
   * </pre>
   *
   * <code>RAW = 1;</code>
   */
  public static final int RAW_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Rice-Golomb encoded data.
   * </pre>
   *
   * <code>RICE = 2;</code>
   */
  public static final int RICE_VALUE = 2;

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
  public static CompressionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CompressionType forNumber(int value) {
    switch (value) {
      case 0:
        return COMPRESSION_TYPE_UNSPECIFIED;
      case 1:
        return RAW;
      case 2:
        return RICE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompressionType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<CompressionType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<CompressionType>() {
        public CompressionType findValueByNumber(int number) {
          return CompressionType.forNumber(number);
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
    return com.google.webrisk.v1.WebRiskProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final CompressionType[] VALUES = values();

  public static CompressionType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CompressionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.webrisk.v1.CompressionType)
}
