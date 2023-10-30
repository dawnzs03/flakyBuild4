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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * When a raw document or structured content is supplied, this stores the
 * content category.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.contentwarehouse.v1.ContentCategory}
 */
public enum ContentCategory implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No category is specified.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_UNSPECIFIED = 0;</code>
   */
  CONTENT_CATEGORY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Content is of image type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_IMAGE = 1;</code>
   */
  CONTENT_CATEGORY_IMAGE(1),
  /**
   *
   *
   * <pre>
   * Content is of audio type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_AUDIO = 2;</code>
   */
  CONTENT_CATEGORY_AUDIO(2),
  /**
   *
   *
   * <pre>
   * Content is of video type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_VIDEO = 3;</code>
   */
  CONTENT_CATEGORY_VIDEO(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No category is specified.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int CONTENT_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Content is of image type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_IMAGE = 1;</code>
   */
  public static final int CONTENT_CATEGORY_IMAGE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Content is of audio type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_AUDIO = 2;</code>
   */
  public static final int CONTENT_CATEGORY_AUDIO_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Content is of video type.
   * </pre>
   *
   * <code>CONTENT_CATEGORY_VIDEO = 3;</code>
   */
  public static final int CONTENT_CATEGORY_VIDEO_VALUE = 3;

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
  public static ContentCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContentCategory forNumber(int value) {
    switch (value) {
      case 0:
        return CONTENT_CATEGORY_UNSPECIFIED;
      case 1:
        return CONTENT_CATEGORY_IMAGE;
      case 2:
        return CONTENT_CATEGORY_AUDIO;
      case 3:
        return CONTENT_CATEGORY_VIDEO;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContentCategory> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ContentCategory> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ContentCategory>() {
        public ContentCategory findValueByNumber(int number) {
          return ContentCategory.forNumber(number);
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
    return com.google.cloud.contentwarehouse.v1.DocumentProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ContentCategory[] VALUES = values();

  public static ContentCategory valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContentCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.ContentCategory)
}
