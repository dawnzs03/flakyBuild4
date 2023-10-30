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
// source: google/cloud/orchestration/airflow/service/v1/image_versions.proto

package com.google.cloud.orchestration.airflow.service.v1;

public final class ImageVersionsOuterClass {
  private ImageVersionsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orchestration_airflow_service_v1_ImageVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1_ImageVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/orchestration/airflow/ser"
          + "vice/v1/image_versions.proto\022-google.clo"
          + "ud.orchestration.airflow.service.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\026google/type/date.proto\"p\n\030Li"
          + "stImageVersionsRequest\022\016\n\006parent\030\001 \001(\t\022\021"
          + "\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\035\n"
          + "\025include_past_releases\030\004 \001(\010\"\211\001\n\031ListIma"
          + "geVersionsResponse\022S\n\016image_versions\030\001 \003"
          + "(\0132;.google.cloud.orchestration.airflow."
          + "service.v1.ImageVersion\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\"\275\001\n\014ImageVersion\022\030\n\020image_versi"
          + "on_id\030\001 \001(\t\022\022\n\nis_default\030\002 \001(\010\022!\n\031suppo"
          + "rted_python_versions\030\003 \003(\t\022\'\n\014release_da"
          + "te\030\004 \001(\0132\021.google.type.Date\022\031\n\021creation_"
          + "disabled\030\005 \001(\010\022\030\n\020upgrade_disabled\030\006 \001(\010"
          + "2\311\002\n\rImageVersions\022\352\001\n\021ListImageVersions"
          + "\022G.google.cloud.orchestration.airflow.se"
          + "rvice.v1.ListImageVersionsRequest\032H.goog"
          + "le.cloud.orchestration.airflow.service.v"
          + "1.ListImageVersionsResponse\"B\332A\006parent\202\323"
          + "\344\223\0023\0221/v1/{parent=projects/*/locations/*"
          + "}/imageVersions\032K\312A\027composer.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\202\001\n1com.google.cloud.orches"
          + "tration.airflow.service.v1P\001ZKcloud.goog"
          + "le.com/go/orchestration/airflow/service/"
          + "apiv1/servicepb;servicepbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "IncludePastReleases",
            });
    internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orchestration_airflow_service_v1_ListImageVersionsResponse_descriptor,
            new java.lang.String[] {
              "ImageVersions", "NextPageToken",
            });
    internal_static_google_cloud_orchestration_airflow_service_v1_ImageVersion_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_orchestration_airflow_service_v1_ImageVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orchestration_airflow_service_v1_ImageVersion_descriptor,
            new java.lang.String[] {
              "ImageVersionId",
              "IsDefault",
              "SupportedPythonVersions",
              "ReleaseDate",
              "CreationDisabled",
              "UpgradeDisabled",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
