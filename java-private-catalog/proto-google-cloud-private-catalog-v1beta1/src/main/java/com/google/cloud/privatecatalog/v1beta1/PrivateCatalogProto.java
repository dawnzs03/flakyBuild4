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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public final class PrivateCatalogProto {
  private PrivateCatalogProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/privatecatalog/v1beta1/pr"
          + "ivate_catalog.proto\022#google.cloud.privat"
          + "ecatalog.v1beta1\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032#google/longrunning/operatio"
          + "ns.proto\032\034google/protobuf/struct.proto\032\037"
          + "google/protobuf/timestamp.proto\"e\n\025Searc"
          + "hCatalogsRequest\022\026\n\010resource\030\001 \001(\tB\004\342A\001\002"
          + "\022\r\n\005query\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npa"
          + "ge_token\030\004 \001(\t\"q\n\026SearchCatalogsResponse"
          + "\022>\n\010catalogs\030\001 \003(\0132,.google.cloud.privat"
          + "ecatalog.v1beta1.Catalog\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\"e\n\025SearchProductsRequest\022\026\n\010re"
          + "source\030\001 \001(\tB\004\342A\001\002\022\r\n\005query\030\002 \001(\t\022\021\n\tpag"
          + "e_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"q\n\026Sear"
          + "chProductsResponse\022>\n\010products\030\001 \003(\0132,.g"
          + "oogle.cloud.privatecatalog.v1beta1.Produ"
          + "ct\022\027\n\017next_page_token\030\002 \001(\t\"k\n\025SearchVer"
          + "sionsRequest\022\026\n\010resource\030\001 \001(\tB\004\342A\001\002\022\023\n\005"
          + "query\030\002 \001(\tB\004\342A\001\002\022\021\n\tpage_size\030\003 \001(\005\022\022\n\n"
          + "page_token\030\004 \001(\t\"q\n\026SearchVersionsRespon"
          + "se\022>\n\010versions\030\001 \003(\0132,.google.cloud.priv"
          + "atecatalog.v1beta1.Version\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"\207\002\n\007Catalog\022\022\n\004name\030\001 \001(\tB\004\342"
          + "A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\003\022\031\n\013descr"
          + "iption\030\003 \001(\tB\004\342A\001\003\0225\n\013create_time\030\004 \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013upd"
          + "ate_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\004\342A\001\003:C\352A@\n*cloudprivatecatalog.googl"
          + "eapis.com/Catalog\022\022catalogs/{catalog}\"\221\003"
          + "\n\007Product\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\030\n\nasset_t"
          + "ype\030\002 \001(\tB\004\342A\001\003\0228\n\020display_metadata\030\003 \001("
          + "\0132\027.google.protobuf.StructB\005\342A\002\002\003\022\026\n\010ico"
          + "n_uri\030\004 \001(\tB\004\342A\001\003\022S\n\020asset_references\030\n "
          + "\003(\01323.google.cloud.privatecatalog.v1beta"
          + "1.AssetReferenceB\004\342A\001\003\0225\n\013create_time\030\005 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n"
          + "\013update_time\030\006 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003:C\352A@\n*cloudprivatecatalog.g"
          + "oogleapis.com/Product\022\022products/{product"
          + "}\"\351\005\n\016AssetReference\022\020\n\002id\030\001 \001(\tB\004\342A\001\003\022\031"
          + "\n\013description\030\002 \001(\tB\004\342A\001\003\022A\n\006inputs\030\006 \001("
          + "\0132+.google.cloud.privatecatalog.v1beta1."
          + "InputsB\004\342A\001\003\022i\n\021validation_status\030\007 \001(\0162"
          + "H.google.cloud.privatecatalog.v1beta1.As"
          + "setReference.AssetValidationStateB\004\342A\001\003\022"
          + "A\n\024validation_operation\030\010 \001(\0132\035.google.l"
          + "ongrunning.OperationB\004\342A\001\003\022\025\n\005asset\030\n \001("
          + "\tB\004\342A\001\003H\000\022\032\n\010gcs_path\030\013 \001(\tB\006\030\001\342A\001\003H\000\022J\n"
          + "\ngit_source\030\017 \001(\0132..google.cloud.private"
          + "catalog.v1beta1.GitSourceB\004\342A\001\003H\000\022H\n\ngcs"
          + "_source\030\020 \001(\0132..google.cloud.privatecata"
          + "log.v1beta1.GcsSourceB\004\342A\001\003\0225\n\013create_ti"
          + "me\030\014 \001(\0132\032.google.protobuf.TimestampB\004\342A"
          + "\001\003\0225\n\013update_time\030\r \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\022\023\n\007version\030\016 \001(\tB\002\030\001\"c"
          + "\n\024AssetValidationState\022&\n\"ASSET_VALIDATI"
          + "ON_STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\t\n\005V"
          + "ALID\020\002\022\013\n\007INVALID\020\003B\010\n\006source\";\n\006Inputs\022"
          + "1\n\nparameters\030\001 \001(\0132\027.google.protobuf.St"
          + "ructB\004\342A\001\003\"t\n\tGcsSource\022\026\n\010gcs_path\030\001 \001("
          + "\tB\004\342A\001\003\022\030\n\ngeneration\030\002 \001(\003B\004\342A\001\003\0225\n\013upd"
          + "ate_time\030\003 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\004\342A\001\003\"`\n\tGitSource\022\014\n\004repo\030\001 \001(\t\022\013\n\003d"
          + "ir\030\002 \001(\t\022\020\n\006commit\030\003 \001(\tH\000\022\020\n\006branch\030\004 \001"
          + "(\tH\000\022\r\n\003tag\030\005 \001(\tH\000B\005\n\003ref\"\277\002\n\007Version\022\022"
          + "\n\004name\030\001 \001(\tB\004\342A\001\003\022\031\n\013description\030\002 \001(\tB"
          + "\004\342A\001\003\022,\n\005asset\030\003 \001(\0132\027.google.protobuf.S"
          + "tructB\004\342A\001\003\0225\n\013create_time\030\005 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\004\342A\001\003\0225\n\013update_tim"
          + "e\030\006 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003:i\352Af\n*cloudprivatecatalog.googleapis.c"
          + "om/Version\0228catalogs/{catalog}/products/"
          + "{product}/versions/{version}2\362\007\n\016Private"
          + "Catalog\022\253\002\n\016SearchCatalogs\022:.google.clou"
          + "d.privatecatalog.v1beta1.SearchCatalogsR"
          + "equest\032;.google.cloud.privatecatalog.v1b"
          + "eta1.SearchCatalogsResponse\"\237\001\202\323\344\223\002\230\001\022./"
          + "v1beta1/{resource=projects/*}/catalogs:s"
          + "earchZ5\0223/v1beta1/{resource=organization"
          + "s/*}/catalogs:searchZ/\022-/v1beta1/{resour"
          + "ce=folders/*}/catalogs:search\022\253\002\n\016Search"
          + "Products\022:.google.cloud.privatecatalog.v"
          + "1beta1.SearchProductsRequest\032;.google.cl"
          + "oud.privatecatalog.v1beta1.SearchProduct"
          + "sResponse\"\237\001\202\323\344\223\002\230\001\022./v1beta1/{resource="
          + "projects/*}/products:searchZ5\0223/v1beta1/"
          + "{resource=organizations/*}/products:sear"
          + "chZ/\022-/v1beta1/{resource=folders/*}/prod"
          + "ucts:search\022\253\002\n\016SearchVersions\022:.google."
          + "cloud.privatecatalog.v1beta1.SearchVersi"
          + "onsRequest\032;.google.cloud.privatecatalog"
          + ".v1beta1.SearchVersionsResponse\"\237\001\202\323\344\223\002\230"
          + "\001\022./v1beta1/{resource=projects/*}/versio"
          + "ns:searchZ5\0223/v1beta1/{resource=organiza"
          + "tions/*}/versions:searchZ/\022-/v1beta1/{re"
          + "source=folders/*}/versions:search\032V\312A\"cl"
          + "oudprivatecatalog.googleapis.com\322A.https"
          + "://www.googleapis.com/auth/cloud-platfor"
          + "mB\206\002\n\'com.google.cloud.privatecatalog.v1"
          + "beta1B\023PrivateCatalogProtoP\001ZOcloud.goog"
          + "le.com/go/privatecatalog/apiv1beta1/priv"
          + "atecatalogpb;privatecatalogpb\252\002#Google.C"
          + "loud.PrivateCatalog.V1Beta1\312\002#Google\\Clo"
          + "ud\\PrivateCatalog\\V1beta1\352\002&Google::Clou"
          + "d::PrivateCatalog::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchCatalogsResponse_descriptor,
            new java.lang.String[] {
              "Catalogs", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchProductsResponse_descriptor,
            new java.lang.String[] {
              "Products", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsRequest_descriptor,
            new java.lang.String[] {
              "Resource", "Query", "PageSize", "PageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_SearchVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_privatecatalog_v1beta1_Catalog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Catalog_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_privatecatalog_v1beta1_Product_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Product_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "DisplayMetadata",
              "IconUri",
              "AssetReferences",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_AssetReference_descriptor,
            new java.lang.String[] {
              "Id",
              "Description",
              "Inputs",
              "ValidationStatus",
              "ValidationOperation",
              "Asset",
              "GcsPath",
              "GitSource",
              "GcsSource",
              "CreateTime",
              "UpdateTime",
              "Version",
              "Source",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_privatecatalog_v1beta1_Inputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Inputs_descriptor,
            new java.lang.String[] {
              "Parameters",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "GcsPath", "Generation", "UpdateTime",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_privatecatalog_v1beta1_GitSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_GitSource_descriptor,
            new java.lang.String[] {
              "Repo", "Dir", "Commit", "Branch", "Tag", "Ref",
            });
    internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_privatecatalog_v1beta1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_privatecatalog_v1beta1_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Asset", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
