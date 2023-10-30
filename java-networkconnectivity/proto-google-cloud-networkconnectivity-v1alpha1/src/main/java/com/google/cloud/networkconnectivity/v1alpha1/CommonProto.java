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
// source: google/cloud/networkconnectivity/v1alpha1/common.proto

package com.google.cloud.networkconnectivity.v1alpha1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networkconnectivity_v1alpha1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networkconnectivity_v1alpha1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/networkconnectivity/v1alp"
          + "ha1/common.proto\022)google.cloud.networkco"
          + "nnectivity.v1alpha1\032\037google/api/field_be"
          + "havior.proto\032\037google/protobuf/timestamp."
          + "proto\"\207\002\n\021OperationMetadata\0225\n\013create_ti"
          + "me\030\001 \001(\0132\032.google.protobuf.TimestampB\004\342A"
          + "\001\003\0222\n\010end_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004"
          + "verb\030\004 \001(\tB\004\342A\001\003\022\034\n\016status_message\030\005 \001(\t"
          + "B\004\342A\001\003\022$\n\026requested_cancellation\030\006 \001(\010B\004"
          + "\342A\001\003\022\031\n\013api_version\030\007 \001(\tB\004\342A\001\003B\246\002\n-com."
          + "google.cloud.networkconnectivity.v1alpha"
          + "1B\013CommonProtoP\001Z_cloud.google.com/go/ne"
          + "tworkconnectivity/apiv1alpha1/networkcon"
          + "nectivitypb;networkconnectivitypb\252\002)Goog"
          + "le.Cloud.NetworkConnectivity.V1Alpha1\312\002)"
          + "Google\\Cloud\\NetworkConnectivity\\V1alpha"
          + "1\352\002,Google::Cloud::NetworkConnectivity::"
          + "V1alpha1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networkconnectivity_v1alpha1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networkconnectivity_v1alpha1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networkconnectivity_v1alpha1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
