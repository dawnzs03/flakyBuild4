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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Strategy used for node pool update.
 * </pre>
 *
 * Protobuf enum {@code google.container.v1beta1.NodePoolUpdateStrategy}
 */
public enum NodePoolUpdateStrategy implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value if unset. GKE internally defaults the update strategy to
   * SURGE for unspecified strategies.
   * </pre>
   *
   * <code>NODE_POOL_UPDATE_STRATEGY_UNSPECIFIED = 0;</code>
   */
  NODE_POOL_UPDATE_STRATEGY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * blue-green upgrade.
   * </pre>
   *
   * <code>BLUE_GREEN = 2;</code>
   */
  BLUE_GREEN(2),
  /**
   *
   *
   * <pre>
   * SURGE is the traditional way of upgrading a node pool.
   * max_surge and max_unavailable determines the level of upgrade parallelism.
   * </pre>
   *
   * <code>SURGE = 3;</code>
   */
  SURGE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value if unset. GKE internally defaults the update strategy to
   * SURGE for unspecified strategies.
   * </pre>
   *
   * <code>NODE_POOL_UPDATE_STRATEGY_UNSPECIFIED = 0;</code>
   */
  public static final int NODE_POOL_UPDATE_STRATEGY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * blue-green upgrade.
   * </pre>
   *
   * <code>BLUE_GREEN = 2;</code>
   */
  public static final int BLUE_GREEN_VALUE = 2;
  /**
   *
   *
   * <pre>
   * SURGE is the traditional way of upgrading a node pool.
   * max_surge and max_unavailable determines the level of upgrade parallelism.
   * </pre>
   *
   * <code>SURGE = 3;</code>
   */
  public static final int SURGE_VALUE = 3;

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
  public static NodePoolUpdateStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NodePoolUpdateStrategy forNumber(int value) {
    switch (value) {
      case 0:
        return NODE_POOL_UPDATE_STRATEGY_UNSPECIFIED;
      case 2:
        return BLUE_GREEN;
      case 3:
        return SURGE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NodePoolUpdateStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NodePoolUpdateStrategy>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NodePoolUpdateStrategy>() {
            public NodePoolUpdateStrategy findValueByNumber(int number) {
              return NodePoolUpdateStrategy.forNumber(number);
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
    return com.google.container.v1beta1.ClusterServiceProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final NodePoolUpdateStrategy[] VALUES = values();

  public static NodePoolUpdateStrategy valueOf(
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

  private NodePoolUpdateStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1beta1.NodePoolUpdateStrategy)
}
