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
// source: google/apps/script/type/addon_widget_set.proto

package com.google.apps.script.type;

public final class AddOnWidgetSetProto {
  private AddOnWidgetSetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_AddOnWidgetSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_AddOnWidgetSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/apps/script/type/addon_widget_s"
          + "et.proto\022\027google.apps.script.type\"\244\002\n\016Ad"
          + "dOnWidgetSet\022H\n\014used_widgets\030\001 \003(\01622.goo"
          + "gle.apps.script.type.AddOnWidgetSet.Widg"
          + "etType\"\307\001\n\nWidgetType\022\033\n\027WIDGET_TYPE_UNS"
          + "PECIFIED\020\000\022\017\n\013DATE_PICKER\020\001\022\022\n\016STYLED_BU"
          + "TTONS\020\002\022\024\n\020PERSISTENT_FORMS\020\003\022\020\n\014FIXED_F"
          + "OOTER\020\004\022!\n\035UPDATE_SUBJECT_AND_RECIPIENTS"
          + "\020\005\022\017\n\013GRID_WIDGET\020\006\022\033\n\027ADDON_COMPOSE_UI_"
          + "ACTION\020\007B\275\001\n\033com.google.apps.script.type"
          + "B\023AddOnWidgetSetProtoP\001Z6google.golang.o"
          + "rg/genproto/googleapis/apps/script/type\252"
          + "\002\027Google.Apps.Script.Type\312\002\027Google\\Apps\\"
          + "Script\\Type\352\002\032Google::Apps::Script::Type"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_apps_script_type_AddOnWidgetSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_script_type_AddOnWidgetSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_AddOnWidgetSet_descriptor,
            new java.lang.String[] {
              "UsedWidgets",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
