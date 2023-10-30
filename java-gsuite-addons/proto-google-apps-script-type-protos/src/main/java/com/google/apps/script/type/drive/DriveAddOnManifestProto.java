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
// source: google/apps/script/type/drive/drive_addon_manifest.proto

package com.google.apps.script.type.drive;

public final class DriveAddOnManifestProto {
  private DriveAddOnManifestProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_drive_DriveAddOnManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_drive_DriveExtensionPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_drive_DriveExtensionPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/apps/script/type/drive/drive_ad"
          + "don_manifest.proto\022\035google.apps.script.t"
          + "ype.drive\032-google/apps/script/type/exten"
          + "sion_point.proto\"\266\001\n\022DriveAddOnManifest\022"
          + "I\n\020homepage_trigger\030\001 \001(\0132/.google.apps."
          + "script.type.HomepageExtensionPoint\022U\n\031on"
          + "_items_selected_trigger\030\002 \001(\01322.google.a"
          + "pps.script.type.drive.DriveExtensionPoin"
          + "t\"+\n\023DriveExtensionPoint\022\024\n\014run_function"
          + "\030\001 \001(\tB\340\001\n!com.google.apps.script.type.d"
          + "riveB\027DriveAddOnManifestProtoP\001Z<google."
          + "golang.org/genproto/googleapis/apps/scri"
          + "pt/type/drive\252\002\035Google.Apps.Script.Type."
          + "Drive\312\002\035Google\\Apps\\Script\\Type\\Drive\352\002!"
          + "Google::Apps::Script::Type::Driveb\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.apps.script.type.ExtensionPoint.getDescriptor(),
            });
    internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_script_type_drive_DriveAddOnManifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_drive_DriveAddOnManifest_descriptor,
            new java.lang.String[] {
              "HomepageTrigger", "OnItemsSelectedTrigger",
            });
    internal_static_google_apps_script_type_drive_DriveExtensionPoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_script_type_drive_DriveExtensionPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_drive_DriveExtensionPoint_descriptor,
            new java.lang.String[] {
              "RunFunction",
            });
    com.google.apps.script.type.ExtensionPoint.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
