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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Selector for how much information is returned in Job responses.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.JobView}
 */
public enum JobView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The job view to return isn't specified, or is unknown.
   * Responses will contain at least the `JOB_VIEW_SUMMARY` information,
   * and may contain additional information.
   * </pre>
   *
   * <code>JOB_VIEW_UNKNOWN = 0;</code>
   */
  JOB_VIEW_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * Request summary information only:
   * Project ID, Job ID, job name, job type, job status, start/end time,
   * and Cloud SDK version details.
   * </pre>
   *
   * <code>JOB_VIEW_SUMMARY = 1;</code>
   */
  JOB_VIEW_SUMMARY(1),
  /**
   *
   *
   * <pre>
   * Request all information available for this job.
   * </pre>
   *
   * <code>JOB_VIEW_ALL = 2;</code>
   */
  JOB_VIEW_ALL(2),
  /**
   *
   *
   * <pre>
   * Request summary info and limited job description data for steps, labels and
   * environment.
   * </pre>
   *
   * <code>JOB_VIEW_DESCRIPTION = 3;</code>
   */
  JOB_VIEW_DESCRIPTION(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The job view to return isn't specified, or is unknown.
   * Responses will contain at least the `JOB_VIEW_SUMMARY` information,
   * and may contain additional information.
   * </pre>
   *
   * <code>JOB_VIEW_UNKNOWN = 0;</code>
   */
  public static final int JOB_VIEW_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Request summary information only:
   * Project ID, Job ID, job name, job type, job status, start/end time,
   * and Cloud SDK version details.
   * </pre>
   *
   * <code>JOB_VIEW_SUMMARY = 1;</code>
   */
  public static final int JOB_VIEW_SUMMARY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Request all information available for this job.
   * </pre>
   *
   * <code>JOB_VIEW_ALL = 2;</code>
   */
  public static final int JOB_VIEW_ALL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Request summary info and limited job description data for steps, labels and
   * environment.
   * </pre>
   *
   * <code>JOB_VIEW_DESCRIPTION = 3;</code>
   */
  public static final int JOB_VIEW_DESCRIPTION_VALUE = 3;

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
  public static JobView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobView forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_VIEW_UNKNOWN;
      case 1:
        return JOB_VIEW_SUMMARY;
      case 2:
        return JOB_VIEW_ALL;
      case 3:
        return JOB_VIEW_DESCRIPTION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobView>() {
        public JobView findValueByNumber(int number) {
          return JobView.forNumber(number);
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
    return com.google.dataflow.v1beta3.JobsProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final JobView[] VALUES = values();

  public static JobView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.JobView)
}
