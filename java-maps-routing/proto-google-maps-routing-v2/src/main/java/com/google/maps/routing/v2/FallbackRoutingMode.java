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
// source: google/maps/routing/v2/fallback_info.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Actual routing mode used for returned fallback response.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.FallbackRoutingMode}
 */
public enum FallbackRoutingMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>FALLBACK_ROUTING_MODE_UNSPECIFIED = 0;</code>
   */
  FALLBACK_ROUTING_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Indicates the `TRAFFIC_UNAWARE` [google.maps.routing.v2.RoutingPreference]
   * was used to compute the response.
   * </pre>
   *
   * <code>FALLBACK_TRAFFIC_UNAWARE = 1;</code>
   */
  FALLBACK_TRAFFIC_UNAWARE(1),
  /**
   *
   *
   * <pre>
   * Indicates the `TRAFFIC_AWARE`
   * [RoutingPreference][google.maps.routing.v2.RoutingPreference] was used to
   * compute the response.
   * </pre>
   *
   * <code>FALLBACK_TRAFFIC_AWARE = 2;</code>
   */
  FALLBACK_TRAFFIC_AWARE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>FALLBACK_ROUTING_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int FALLBACK_ROUTING_MODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Indicates the `TRAFFIC_UNAWARE` [google.maps.routing.v2.RoutingPreference]
   * was used to compute the response.
   * </pre>
   *
   * <code>FALLBACK_TRAFFIC_UNAWARE = 1;</code>
   */
  public static final int FALLBACK_TRAFFIC_UNAWARE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Indicates the `TRAFFIC_AWARE`
   * [RoutingPreference][google.maps.routing.v2.RoutingPreference] was used to
   * compute the response.
   * </pre>
   *
   * <code>FALLBACK_TRAFFIC_AWARE = 2;</code>
   */
  public static final int FALLBACK_TRAFFIC_AWARE_VALUE = 2;

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
  public static FallbackRoutingMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FallbackRoutingMode forNumber(int value) {
    switch (value) {
      case 0:
        return FALLBACK_ROUTING_MODE_UNSPECIFIED;
      case 1:
        return FALLBACK_TRAFFIC_UNAWARE;
      case 2:
        return FALLBACK_TRAFFIC_AWARE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FallbackRoutingMode>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FallbackRoutingMode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FallbackRoutingMode>() {
            public FallbackRoutingMode findValueByNumber(int number) {
              return FallbackRoutingMode.forNumber(number);
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
    return com.google.maps.routing.v2.FallbackInfoProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final FallbackRoutingMode[] VALUES = values();

  public static FallbackRoutingMode valueOf(
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

  private FallbackRoutingMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.FallbackRoutingMode)
}
