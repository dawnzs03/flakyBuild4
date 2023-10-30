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
// source: google/cloud/datalabeling/v1beta1/annotation_spec_set.proto

package com.google.cloud.datalabeling.v1beta1;

public final class AnnotationSpecSetOuterClass {
  private AnnotationSpecSetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/datalabeling/v1beta1/anno"
          + "tation_spec_set.proto\022!google.cloud.data"
          + "labeling.v1beta1\032\031google/api/resource.pr"
          + "oto\"\246\002\n\021AnnotationSpecSet\022\014\n\004name\030\001 \001(\t\022"
          + "\024\n\014display_name\030\002 \001(\t\022\023\n\013description\030\003 \001"
          + "(\t\022K\n\020annotation_specs\030\004 \003(\01321.google.cl"
          + "oud.datalabeling.v1beta1.AnnotationSpec\022"
          + "\032\n\022blocking_resources\030\005 \003(\t:o\352Al\n-datala"
          + "beling.googleapis.com/AnnotationSpecSet\022"
          + ";projects/{project}/annotationSpecSets/{"
          + "annotation_spec_set}\";\n\016AnnotationSpec\022\024"
          + "\n\014display_name\030\001 \001(\t\022\023\n\013description\030\002 \001("
          + "\tB\343\001\n%com.google.cloud.datalabeling.v1be"
          + "ta1P\001ZIcloud.google.com/go/datalabeling/"
          + "apiv1beta1/datalabelingpb;datalabelingpb"
          + "\252\002!Google.Cloud.DataLabeling.V1Beta1\312\002!G"
          + "oogle\\Cloud\\DataLabeling\\V1beta1\352\002$Googl"
          + "e::Cloud::DataLabeling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpecSet_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "AnnotationSpecs", "BlockingResources",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationSpec_descriptor,
            new java.lang.String[] {
              "DisplayName", "Description",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
