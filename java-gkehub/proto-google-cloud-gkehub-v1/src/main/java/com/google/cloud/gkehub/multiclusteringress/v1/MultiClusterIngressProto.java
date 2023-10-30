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
// source: google/cloud/gkehub/v1/multiclusteringress/multiclusteringress.proto

package com.google.cloud.gkehub.multiclusteringress.v1;

public final class MultiClusterIngressProto {
  private MultiClusterIngressProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_multiclusteringress_v1_FeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_multiclusteringress_v1_FeatureSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/cloud/gkehub/v1/multiclustering"
          + "ress/multiclusteringress.proto\022*google.c"
          + "loud.gkehub.multiclusteringress.v1\"(\n\013Fe"
          + "atureSpec\022\031\n\021config_membership\030\001 \001(\tB\271\002\n"
          + ".com.google.cloud.gkehub.multiclustering"
          + "ress.v1B\030MultiClusterIngressProtoP\001Z`clo"
          + "ud.google.com/go/gkehub/multiclusteringr"
          + "ess/apiv1/multiclusteringresspb;multiclu"
          + "steringresspb\252\002*Google.Cloud.GkeHub.Mult"
          + "iClusterIngress.V1\312\002*Google\\Cloud\\GkeHub"
          + "\\MultiClusterIngress\\V1\352\002.Google::Cloud:"
          + ":GkeHub::MultiClusterIngress::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_gkehub_multiclusteringress_v1_FeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_multiclusteringress_v1_FeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_multiclusteringress_v1_FeatureSpec_descriptor,
            new java.lang.String[] {
              "ConfigMembership",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
