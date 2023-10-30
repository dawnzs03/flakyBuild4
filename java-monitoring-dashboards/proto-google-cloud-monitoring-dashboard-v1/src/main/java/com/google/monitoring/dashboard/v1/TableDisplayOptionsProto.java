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
// source: google/monitoring/dashboard/v1/table_display_options.proto

package com.google.monitoring.dashboard.v1;

public final class TableDisplayOptionsProto {
  private TableDisplayOptionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TableDisplayOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TableDisplayOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/monitoring/dashboard/v1/table_d"
          + "isplay_options.proto\022\036google.monitoring."
          + "dashboard.v1\032\037google/api/field_behavior."
          + "proto\"4\n\023TableDisplayOptions\022\035\n\rshown_co"
          + "lumns\030\001 \003(\tB\006\030\001\342A\001\001B\201\002\n\"com.google.monit"
          + "oring.dashboard.v1B\030TableDisplayOptionsP"
          + "rotoP\001ZFcloud.google.com/go/monitoring/d"
          + "ashboard/apiv1/dashboardpb;dashboardpb\252\002"
          + "$Google.Cloud.Monitoring.Dashboard.V1\312\002$"
          + "Google\\Cloud\\Monitoring\\Dashboard\\V1\352\002(G"
          + "oogle::Cloud::Monitoring::Dashboard::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_TableDisplayOptions_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TableDisplayOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TableDisplayOptions_descriptor,
            new java.lang.String[] {
              "ShownColumns",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
