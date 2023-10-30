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
 * Access Control Mode.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.contentwarehouse.v1.AccessControlMode}
 */
public enum AccessControlMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * This value is required by protobuf best practices
   * </pre>
   *
   * <code>ACL_MODE_UNKNOWN = 0;</code>
   */
  ACL_MODE_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * Universal Access: No document level access control.
   * </pre>
   *
   * <code>ACL_MODE_UNIVERSAL_ACCESS = 1;</code>
   */
  ACL_MODE_UNIVERSAL_ACCESS(1),
  /**
   *
   *
   * <pre>
   * Document level access control with customer own Identity Service.
   * </pre>
   *
   * <code>ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID = 2;</code>
   */
  ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID(2),
  /**
   *
   *
   * <pre>
   * Document level access control using Google Cloud Identity.
   * </pre>
   *
   * <code>ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI = 3;</code>
   */
  ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * This value is required by protobuf best practices
   * </pre>
   *
   * <code>ACL_MODE_UNKNOWN = 0;</code>
   */
  public static final int ACL_MODE_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Universal Access: No document level access control.
   * </pre>
   *
   * <code>ACL_MODE_UNIVERSAL_ACCESS = 1;</code>
   */
  public static final int ACL_MODE_UNIVERSAL_ACCESS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Document level access control with customer own Identity Service.
   * </pre>
   *
   * <code>ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID = 2;</code>
   */
  public static final int ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Document level access control using Google Cloud Identity.
   * </pre>
   *
   * <code>ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI = 3;</code>
   */
  public static final int ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI_VALUE = 3;

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
  public static AccessControlMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AccessControlMode forNumber(int value) {
    switch (value) {
      case 0:
        return ACL_MODE_UNKNOWN;
      case 1:
        return ACL_MODE_UNIVERSAL_ACCESS;
      case 2:
        return ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID;
      case 3:
        return ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AccessControlMode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AccessControlMode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccessControlMode>() {
            public AccessControlMode findValueByNumber(int number) {
              return AccessControlMode.forNumber(number);
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
    return com.google.cloud.contentwarehouse.v1.CommonProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final AccessControlMode[] VALUES = values();

  public static AccessControlMode valueOf(
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

  private AccessControlMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.contentwarehouse.v1.AccessControlMode)
}
