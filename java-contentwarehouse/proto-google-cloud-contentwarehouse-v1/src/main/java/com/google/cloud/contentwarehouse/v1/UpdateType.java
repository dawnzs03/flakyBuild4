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
// source: google/cloud/contentwarehouse/v1/common.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Update type of the requests.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.contentwarehouse.v1.UpdateType}
 */
public enum UpdateType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Defaults to full replace behavior, ie. FULL_REPLACE.
   * </pre>
   *
   * <code>UPDATE_TYPE_UNSPECIFIED = 0;</code>
   */
  UPDATE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Fully replace all the fields (including previously linked raw document).
   * Any field masks will be ignored.
   * </pre>
   *
   * <code>UPDATE_TYPE_REPLACE = 1;</code>
   */
  UPDATE_TYPE_REPLACE(1),
  /**
   *
   *
   * <pre>
   * Merge the fields into the existing entities.
   * </pre>
   *
   * <code>UPDATE_TYPE_MERGE = 2;</code>
   */
  UPDATE_TYPE_MERGE(2),
  /**
   *
   *
   * <pre>
   * Inserts the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES = 3;</code>
   */
  UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES(3),
  /**
   *
   *
   * <pre>
   * Replace the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES = 4;</code>
   */
  UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES(4),
  /**
   *
   *
   * <pre>
   * Delete the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES = 5;</code>
   */
  UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES(5),
  /**
   *
   *
   * <pre>
   * For each of the property, replaces the property if the it exists, otherwise
   * inserts a new property. And for the rest of the fields, merge them based on
   * update mask and merge fields options.
   * </pre>
   *
   * <code>UPDATE_TYPE_MERGE_AND_REPLACE_OR_INSERT_PROPERTIES_BY_NAMES = 6;</code>
   */
  UPDATE_TYPE_MERGE_AND_REPLACE_OR_INSERT_PROPERTIES_BY_NAMES(6),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Defaults to full replace behavior, ie. FULL_REPLACE.
   * </pre>
   *
   * <code>UPDATE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int UPDATE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Fully replace all the fields (including previously linked raw document).
   * Any field masks will be ignored.
   * </pre>
   *
   * <code>UPDATE_TYPE_REPLACE = 1;</code>
   */
  public static final int UPDATE_TYPE_REPLACE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Merge the fields into the existing entities.
   * </pre>
   *
   * <code>UPDATE_TYPE_MERGE = 2;</code>
   */
  public static final int UPDATE_TYPE_MERGE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Inserts the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES = 3;</code>
   */
  public static final int UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Replace the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES = 4;</code>
   */
  public static final int UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Delete the properties by names.
   * </pre>
   *
   * <code>UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES = 5;</code>
   */
  public static final int UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES_VALUE = 5;
  /**
   *
   *
   * <pre>
   * For each of the property, replaces the property if the it exists, otherwise
   * inserts a new property. And for the rest of the fields, merge them based on
   * update mask and merge fields options.
   * </pre>
   *
   * <code>UPDATE_TYPE_MERGE_AND_REPLACE_OR_INSERT_PROPERTIES_BY_NAMES = 6;</code>
   */
  public static final int UPDATE_TYPE_MERGE_AND_REPLACE_OR_INSERT_PROPERTIES_BY_NAMES_VALUE = 6;

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
  public static UpdateType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UpdateType forNumber(int value) {
    switch (value) {
      case 0:
        return UPDATE_TYPE_UNSPECIFIED;
      case 1:
        return UPDATE_TYPE_REPLACE;
      case 2:
        return UPDATE_TYPE_MERGE;
      case 3:
        return UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES;
      case 4:
        return UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES;
      case 5:
        return UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES;
      case 6:
        return UPDATE_TYPE_MERGE_AND_REPLACE_OR_INSERT_PROPERTIES_BY_NAMES;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UpdateType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UpdateType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<UpdateType>() {
        public UpdateType findValueByNumber(int number) {
          return UpdateType.forNumber(number);
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
    return com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UpdateType[] VALUES = values();

  public static UpdateType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UpdateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.UpdateType)
}
