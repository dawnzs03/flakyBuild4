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
// source: google/maps/routing/v2/route_label.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * Labels for the [Route][google.maps.routing.v2.Route] that are useful to
 * identify specific properties of the route to compare against others.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.RouteLabel}
 */
public enum RouteLabel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default - not used.
   * </pre>
   *
   * <code>ROUTE_LABEL_UNSPECIFIED = 0;</code>
   */
  ROUTE_LABEL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The default "best" route returned for the route computation.
   * </pre>
   *
   * <code>DEFAULT_ROUTE = 1;</code>
   */
  DEFAULT_ROUTE(1),
  /**
   *
   *
   * <pre>
   * An alternative to the default "best" route. Routes like this will be
   * returned when
   * [compute_alternative_routes][google.maps.routing.v2.ComputeRoutesRequest.compute_alternative_routes]
   * is specified.
   * </pre>
   *
   * <code>DEFAULT_ROUTE_ALTERNATE = 2;</code>
   */
  DEFAULT_ROUTE_ALTERNATE(2),
  /**
   *
   *
   * <pre>
   * Fuel efficient route. Routes labeled with this value are determined to be
   * optimized for Eco parameters such as fuel consumption.
   * </pre>
   *
   * <code>FUEL_EFFICIENT = 3;</code>
   */
  FUEL_EFFICIENT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default - not used.
   * </pre>
   *
   * <code>ROUTE_LABEL_UNSPECIFIED = 0;</code>
   */
  public static final int ROUTE_LABEL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The default "best" route returned for the route computation.
   * </pre>
   *
   * <code>DEFAULT_ROUTE = 1;</code>
   */
  public static final int DEFAULT_ROUTE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * An alternative to the default "best" route. Routes like this will be
   * returned when
   * [compute_alternative_routes][google.maps.routing.v2.ComputeRoutesRequest.compute_alternative_routes]
   * is specified.
   * </pre>
   *
   * <code>DEFAULT_ROUTE_ALTERNATE = 2;</code>
   */
  public static final int DEFAULT_ROUTE_ALTERNATE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Fuel efficient route. Routes labeled with this value are determined to be
   * optimized for Eco parameters such as fuel consumption.
   * </pre>
   *
   * <code>FUEL_EFFICIENT = 3;</code>
   */
  public static final int FUEL_EFFICIENT_VALUE = 3;

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
  public static RouteLabel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RouteLabel forNumber(int value) {
    switch (value) {
      case 0:
        return ROUTE_LABEL_UNSPECIFIED;
      case 1:
        return DEFAULT_ROUTE;
      case 2:
        return DEFAULT_ROUTE_ALTERNATE;
      case 3:
        return FUEL_EFFICIENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RouteLabel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RouteLabel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RouteLabel>() {
        public RouteLabel findValueByNumber(int number) {
          return RouteLabel.forNumber(number);
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
    return com.google.maps.routing.v2.RouteLabelProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RouteLabel[] VALUES = values();

  public static RouteLabel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RouteLabel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.RouteLabel)
}
