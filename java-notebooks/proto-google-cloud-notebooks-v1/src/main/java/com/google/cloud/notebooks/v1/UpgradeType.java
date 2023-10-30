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
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Definition of the types of upgrade that can be used on this
 * instance.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.notebooks.v1.UpgradeType}
 */
public enum UpgradeType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Upgrade type is not specified.
   * </pre>
   *
   * <code>UPGRADE_TYPE_UNSPECIFIED = 0;</code>
   */
  UPGRADE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Upgrade ML framework.
   * </pre>
   *
   * <code>UPGRADE_FRAMEWORK = 1;</code>
   */
  UPGRADE_FRAMEWORK(1),
  /**
   *
   *
   * <pre>
   * Upgrade Operating System.
   * </pre>
   *
   * <code>UPGRADE_OS = 2;</code>
   */
  UPGRADE_OS(2),
  /**
   *
   *
   * <pre>
   * Upgrade CUDA.
   * </pre>
   *
   * <code>UPGRADE_CUDA = 3;</code>
   */
  UPGRADE_CUDA(3),
  /**
   *
   *
   * <pre>
   * Upgrade All (OS, Framework and CUDA).
   * </pre>
   *
   * <code>UPGRADE_ALL = 4;</code>
   */
  UPGRADE_ALL(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Upgrade type is not specified.
   * </pre>
   *
   * <code>UPGRADE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int UPGRADE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Upgrade ML framework.
   * </pre>
   *
   * <code>UPGRADE_FRAMEWORK = 1;</code>
   */
  public static final int UPGRADE_FRAMEWORK_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Upgrade Operating System.
   * </pre>
   *
   * <code>UPGRADE_OS = 2;</code>
   */
  public static final int UPGRADE_OS_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Upgrade CUDA.
   * </pre>
   *
   * <code>UPGRADE_CUDA = 3;</code>
   */
  public static final int UPGRADE_CUDA_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Upgrade All (OS, Framework and CUDA).
   * </pre>
   *
   * <code>UPGRADE_ALL = 4;</code>
   */
  public static final int UPGRADE_ALL_VALUE = 4;

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
  public static UpgradeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UpgradeType forNumber(int value) {
    switch (value) {
      case 0:
        return UPGRADE_TYPE_UNSPECIFIED;
      case 1:
        return UPGRADE_FRAMEWORK;
      case 2:
        return UPGRADE_OS;
      case 3:
        return UPGRADE_CUDA;
      case 4:
        return UPGRADE_ALL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UpgradeType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UpgradeType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<UpgradeType>() {
        public UpgradeType findValueByNumber(int number) {
          return UpgradeType.forNumber(number);
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
    return com.google.cloud.notebooks.v1.NotebooksProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UpgradeType[] VALUES = values();

  public static UpgradeType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UpgradeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.notebooks.v1.UpgradeType)
}
