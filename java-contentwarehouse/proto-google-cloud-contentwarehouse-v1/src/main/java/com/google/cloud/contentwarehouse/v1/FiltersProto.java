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
// source: google/cloud/contentwarehouse/v1/filters.proto

package com.google.cloud.contentwarehouse.v1;

public final class FiltersProto {
  private FiltersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DocumentQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DocumentQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_TimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_PropertyFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_PropertyFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_FileTypeFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_FileTypeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_WeightedSchemaProperty_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_WeightedSchemaProperty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/contentwarehouse/v1/filte"
          + "rs.proto\022 google.cloud.contentwarehouse."
          + "v1\032\031google/api/resource.proto\032\032google/ty"
          + "pe/interval.proto\"\377\003\n\rDocumentQuery\022\r\n\005q"
          + "uery\030\001 \001(\t\022\023\n\013is_nl_query\030\014 \001(\010\022\"\n\026custo"
          + "m_property_filter\030\004 \001(\tB\002\030\001\022B\n\014time_filt"
          + "ers\030\005 \003(\0132,.google.cloud.contentwarehous"
          + "e.v1.TimeFilter\022\035\n\025document_schema_names"
          + "\030\006 \003(\t\022I\n\017property_filter\030\007 \003(\01320.google"
          + ".cloud.contentwarehouse.v1.PropertyFilte"
          + "r\022J\n\020file_type_filter\030\010 \001(\01320.google.clo"
          + "ud.contentwarehouse.v1.FileTypeFilter\022\032\n"
          + "\022folder_name_filter\030\t \001(\t\022\025\n\rquery_conte"
          + "xt\030\n \003(\t\022\037\n\027document_creator_filter\030\013 \003("
          + "\t\022X\n\027custom_weights_metadata\030\r \001(\01327.goo"
          + "gle.cloud.contentwarehouse.v1.CustomWeig"
          + "htsMetadata\"\316\001\n\nTimeFilter\022)\n\ntime_range"
          + "\030\001 \001(\0132\025.google.type.Interval\022J\n\ntime_fi"
          + "eld\030\002 \001(\01626.google.cloud.contentwarehous"
          + "e.v1.TimeFilter.TimeField\"I\n\tTimeField\022\032"
          + "\n\026TIME_FIELD_UNSPECIFIED\020\000\022\017\n\013CREATE_TIM"
          + "E\020\001\022\017\n\013UPDATE_TIME\020\002\"v\n\016PropertyFilter\022Q"
          + "\n\024document_schema_name\030\001 \001(\tB3\372A0\n.conte"
          + "ntwarehouse.googleapis.com/DocumentSchem"
          + "a\022\021\n\tcondition\030\002 \001(\t\"\250\001\n\016FileTypeFilter\022"
          + "L\n\tfile_type\030\001 \001(\01629.google.cloud.conten"
          + "twarehouse.v1.FileTypeFilter.FileType\"H\n"
          + "\010FileType\022\031\n\025FILE_TYPE_UNSPECIFIED\020\000\022\007\n\003"
          + "ALL\020\001\022\n\n\006FOLDER\020\002\022\014\n\010DOCUMENT\020\003\"u\n\025Custo"
          + "mWeightsMetadata\022\\\n\032weighted_schema_prop"
          + "erties\030\001 \003(\01328.google.cloud.contentwareh"
          + "ouse.v1.WeightedSchemaProperty\"\203\001\n\026Weigh"
          + "tedSchemaProperty\022Q\n\024document_schema_nam"
          + "e\030\001 \001(\tB3\372A0\n.contentwarehouse.googleapi"
          + "s.com/DocumentSchema\022\026\n\016property_names\030\002"
          + " \003(\tB\364\001\n$com.google.cloud.contentwarehou"
          + "se.v1B\014FiltersProtoP\001ZPcloud.google.com/"
          + "go/contentwarehouse/apiv1/contentwarehou"
          + "sepb;contentwarehousepb\252\002 Google.Cloud.C"
          + "ontentWarehouse.V1\312\002 Google\\Cloud\\Conten"
          + "tWarehouse\\V1\352\002#Google::Cloud::ContentWa"
          + "rehouse::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_DocumentQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_DocumentQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DocumentQuery_descriptor,
            new java.lang.String[] {
              "Query",
              "IsNlQuery",
              "CustomPropertyFilter",
              "TimeFilters",
              "DocumentSchemaNames",
              "PropertyFilter",
              "FileTypeFilter",
              "FolderNameFilter",
              "QueryContext",
              "DocumentCreatorFilter",
              "CustomWeightsMetadata",
            });
    internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_TimeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_TimeFilter_descriptor,
            new java.lang.String[] {
              "TimeRange", "TimeField",
            });
    internal_static_google_cloud_contentwarehouse_v1_PropertyFilter_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_PropertyFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_PropertyFilter_descriptor,
            new java.lang.String[] {
              "DocumentSchemaName", "Condition",
            });
    internal_static_google_cloud_contentwarehouse_v1_FileTypeFilter_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_FileTypeFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_FileTypeFilter_descriptor,
            new java.lang.String[] {
              "FileType",
            });
    internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_CustomWeightsMetadata_descriptor,
            new java.lang.String[] {
              "WeightedSchemaProperties",
            });
    internal_static_google_cloud_contentwarehouse_v1_WeightedSchemaProperty_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_WeightedSchemaProperty_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_WeightedSchemaProperty_descriptor,
            new java.lang.String[] {
              "DocumentSchemaName", "PropertyNames",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
