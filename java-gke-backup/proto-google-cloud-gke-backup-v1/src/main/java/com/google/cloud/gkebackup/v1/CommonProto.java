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
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Namespaces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/common.proto"
          + "\022\031google.cloud.gkebackup.v1\032\031google/api/"
          + "resource.proto\" \n\nNamespaces\022\022\n\nnamespac"
          + "es\030\001 \003(\t\"1\n\016NamespacedName\022\021\n\tnamespace\030"
          + "\001 \001(\t\022\014\n\004name\030\002 \001(\t\"V\n\017NamespacedNames\022C"
          + "\n\020namespaced_names\030\001 \003(\0132).google.cloud."
          + "gkebackup.v1.NamespacedName\"W\n\rEncryptio"
          + "nKey\022F\n\026gcp_kms_encryption_key\030\001 \001(\tB&\372A"
          + "#\n!cloudkms.googleapis.com/CryptoKeyB\302\001\n"
          + "\035com.google.cloud.gkebackup.v1B\013CommonPr"
          + "otoP\001Z;cloud.google.com/go/gkebackup/api"
          + "v1/gkebackuppb;gkebackuppb\252\002\031Google.Clou"
          + "d.GkeBackup.V1\312\002\031Google\\Cloud\\GkeBackup\\"
          + "V1\352\002\034Google::Cloud::GkeBackup::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Namespaces_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor,
            new java.lang.String[] {
              "Namespaces",
            });
    internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor,
            new java.lang.String[] {
              "Namespace", "Name",
            });
    internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor,
            new java.lang.String[] {
              "NamespacedNames",
            });
    internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor,
            new java.lang.String[] {
              "GcpKmsEncryptionKey",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
