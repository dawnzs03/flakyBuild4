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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Specifies the types of import job views that provide complete or partial
 * details of an import job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.migrationcenter.v1.ImportJobView}
 */
public enum ImportJobView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The import job view is not specified. The API displays the basic view by
   * default.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_UNSPECIFIED = 0;</code>
   */
  IMPORT_JOB_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The import job view includes basic metadata of an import job.
   * This view does not include payload information.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_BASIC = 1;</code>
   */
  IMPORT_JOB_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * The import job view includes all metadata of an import job.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_FULL = 2;</code>
   */
  IMPORT_JOB_VIEW_FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The import job view is not specified. The API displays the basic view by
   * default.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int IMPORT_JOB_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The import job view includes basic metadata of an import job.
   * This view does not include payload information.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_BASIC = 1;</code>
   */
  public static final int IMPORT_JOB_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The import job view includes all metadata of an import job.
   * </pre>
   *
   * <code>IMPORT_JOB_VIEW_FULL = 2;</code>
   */
  public static final int IMPORT_JOB_VIEW_FULL_VALUE = 2;

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
  public static ImportJobView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImportJobView forNumber(int value) {
    switch (value) {
      case 0:
        return IMPORT_JOB_VIEW_UNSPECIFIED;
      case 1:
        return IMPORT_JOB_VIEW_BASIC;
      case 2:
        return IMPORT_JOB_VIEW_FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImportJobView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ImportJobView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ImportJobView>() {
        public ImportJobView findValueByNumber(int number) {
          return ImportJobView.forNumber(number);
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
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.getDescriptor()
        .getEnumTypes()
        .get(3);
  }

  private static final ImportJobView[] VALUES = values();

  public static ImportJobView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImportJobView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.ImportJobView)
}
