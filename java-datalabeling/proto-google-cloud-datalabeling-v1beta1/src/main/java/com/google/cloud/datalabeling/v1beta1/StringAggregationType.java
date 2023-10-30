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
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

/** Protobuf enum {@code google.cloud.datalabeling.v1beta1.StringAggregationType} */
public enum StringAggregationType implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>STRING_AGGREGATION_TYPE_UNSPECIFIED = 0;</code> */
  STRING_AGGREGATION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Majority vote to aggregate answers.
   * </pre>
   *
   * <code>MAJORITY_VOTE = 1;</code>
   */
  MAJORITY_VOTE(1),
  /**
   *
   *
   * <pre>
   * Unanimous answers will be adopted.
   * </pre>
   *
   * <code>UNANIMOUS_VOTE = 2;</code>
   */
  UNANIMOUS_VOTE(2),
  /**
   *
   *
   * <pre>
   * Preserve all answers by crowd compute.
   * </pre>
   *
   * <code>NO_AGGREGATION = 3;</code>
   */
  NO_AGGREGATION(3),
  UNRECOGNIZED(-1),
  ;

  /** <code>STRING_AGGREGATION_TYPE_UNSPECIFIED = 0;</code> */
  public static final int STRING_AGGREGATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Majority vote to aggregate answers.
   * </pre>
   *
   * <code>MAJORITY_VOTE = 1;</code>
   */
  public static final int MAJORITY_VOTE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Unanimous answers will be adopted.
   * </pre>
   *
   * <code>UNANIMOUS_VOTE = 2;</code>
   */
  public static final int UNANIMOUS_VOTE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Preserve all answers by crowd compute.
   * </pre>
   *
   * <code>NO_AGGREGATION = 3;</code>
   */
  public static final int NO_AGGREGATION_VALUE = 3;

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
  public static StringAggregationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StringAggregationType forNumber(int value) {
    switch (value) {
      case 0:
        return STRING_AGGREGATION_TYPE_UNSPECIFIED;
      case 1:
        return MAJORITY_VOTE;
      case 2:
        return UNANIMOUS_VOTE;
      case 3:
        return NO_AGGREGATION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StringAggregationType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<StringAggregationType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StringAggregationType>() {
            public StringAggregationType findValueByNumber(int number) {
              return StringAggregationType.forNumber(number);
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
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final StringAggregationType[] VALUES = values();

  public static StringAggregationType valueOf(
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

  private StringAggregationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datalabeling.v1beta1.StringAggregationType)
}
