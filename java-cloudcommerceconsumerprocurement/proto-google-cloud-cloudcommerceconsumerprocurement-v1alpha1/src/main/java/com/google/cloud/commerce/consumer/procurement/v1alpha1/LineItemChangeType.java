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
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

package com.google.cloud.commerce.consumer.procurement.v1alpha1;

/**
 *
 *
 * <pre>
 * Type of a line item change.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeType}
 */
public enum LineItemChangeType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Sentinel value. Do not use.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_UNSPECIFIED = 0;</code>
   */
  LINE_ITEM_CHANGE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The change is to create a new line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_CREATE = 1;</code>
   */
  LINE_ITEM_CHANGE_TYPE_CREATE(1),
  /**
   *
   *
   * <pre>
   * The change is to update an existing line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_UPDATE = 2;</code>
   */
  LINE_ITEM_CHANGE_TYPE_UPDATE(2),
  /**
   *
   *
   * <pre>
   * The change is to cancel an existing line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_CANCEL = 3;</code>
   */
  LINE_ITEM_CHANGE_TYPE_CANCEL(3),
  /**
   *
   *
   * <pre>
   * The change is to revert a cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_REVERT_CANCELLATION = 4;</code>
   */
  LINE_ITEM_CHANGE_TYPE_REVERT_CANCELLATION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Sentinel value. Do not use.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int LINE_ITEM_CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The change is to create a new line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_CREATE = 1;</code>
   */
  public static final int LINE_ITEM_CHANGE_TYPE_CREATE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The change is to update an existing line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_UPDATE = 2;</code>
   */
  public static final int LINE_ITEM_CHANGE_TYPE_UPDATE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The change is to cancel an existing line item.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_CANCEL = 3;</code>
   */
  public static final int LINE_ITEM_CHANGE_TYPE_CANCEL_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The change is to revert a cancellation.
   * </pre>
   *
   * <code>LINE_ITEM_CHANGE_TYPE_REVERT_CANCELLATION = 4;</code>
   */
  public static final int LINE_ITEM_CHANGE_TYPE_REVERT_CANCELLATION_VALUE = 4;

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
  public static LineItemChangeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LineItemChangeType forNumber(int value) {
    switch (value) {
      case 0:
        return LINE_ITEM_CHANGE_TYPE_UNSPECIFIED;
      case 1:
        return LINE_ITEM_CHANGE_TYPE_CREATE;
      case 2:
        return LINE_ITEM_CHANGE_TYPE_UPDATE;
      case 3:
        return LINE_ITEM_CHANGE_TYPE_CANCEL;
      case 4:
        return LINE_ITEM_CHANGE_TYPE_REVERT_CANCELLATION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LineItemChangeType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LineItemChangeType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LineItemChangeType>() {
            public LineItemChangeType findValueByNumber(int number) {
              return LineItemChangeType.forNumber(number);
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
    return com.google.cloud.commerce.consumer.procurement.v1alpha1.OrderOuterClass.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final LineItemChangeType[] VALUES = values();

  public static LineItemChangeType valueOf(
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

  private LineItemChangeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.commerce.consumer.procurement.v1alpha1.LineItemChangeType)
}
