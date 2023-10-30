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
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

/**
 *
 *
 * <pre>
 * Describes the current stage of a deployment.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.functions.v1.CloudFunctionStatus}
 */
public enum CloudFunctionStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. Invalid state.
   * </pre>
   *
   * <code>CLOUD_FUNCTION_STATUS_UNSPECIFIED = 0;</code>
   */
  CLOUD_FUNCTION_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Function has been successfully deployed and is serving.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   *
   *
   * <pre>
   * Function deployment failed and the function isn’t serving.
   * </pre>
   *
   * <code>OFFLINE = 2;</code>
   */
  OFFLINE(2),
  /**
   *
   *
   * <pre>
   * Function is being created or updated.
   * </pre>
   *
   * <code>DEPLOY_IN_PROGRESS = 3;</code>
   */
  DEPLOY_IN_PROGRESS(3),
  /**
   *
   *
   * <pre>
   * Function is being deleted.
   * </pre>
   *
   * <code>DELETE_IN_PROGRESS = 4;</code>
   */
  DELETE_IN_PROGRESS(4),
  /**
   *
   *
   * <pre>
   * Function deployment failed and the function serving state is undefined.
   * The function should be updated or deleted to move it out of this state.
   * </pre>
   *
   * <code>UNKNOWN = 5;</code>
   */
  UNKNOWN(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. Invalid state.
   * </pre>
   *
   * <code>CLOUD_FUNCTION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int CLOUD_FUNCTION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Function has been successfully deployed and is serving.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Function deployment failed and the function isn’t serving.
   * </pre>
   *
   * <code>OFFLINE = 2;</code>
   */
  public static final int OFFLINE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Function is being created or updated.
   * </pre>
   *
   * <code>DEPLOY_IN_PROGRESS = 3;</code>
   */
  public static final int DEPLOY_IN_PROGRESS_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Function is being deleted.
   * </pre>
   *
   * <code>DELETE_IN_PROGRESS = 4;</code>
   */
  public static final int DELETE_IN_PROGRESS_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Function deployment failed and the function serving state is undefined.
   * The function should be updated or deleted to move it out of this state.
   * </pre>
   *
   * <code>UNKNOWN = 5;</code>
   */
  public static final int UNKNOWN_VALUE = 5;

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
  public static CloudFunctionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CloudFunctionStatus forNumber(int value) {
    switch (value) {
      case 0:
        return CLOUD_FUNCTION_STATUS_UNSPECIFIED;
      case 1:
        return ACTIVE;
      case 2:
        return OFFLINE;
      case 3:
        return DEPLOY_IN_PROGRESS;
      case 4:
        return DELETE_IN_PROGRESS;
      case 5:
        return UNKNOWN;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CloudFunctionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<CloudFunctionStatus>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CloudFunctionStatus>() {
            public CloudFunctionStatus findValueByNumber(int number) {
              return CloudFunctionStatus.forNumber(number);
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
    return com.google.cloud.functions.v1.FunctionsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CloudFunctionStatus[] VALUES = values();

  public static CloudFunctionStatus valueOf(
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

  private CloudFunctionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.functions.v1.CloudFunctionStatus)
}
