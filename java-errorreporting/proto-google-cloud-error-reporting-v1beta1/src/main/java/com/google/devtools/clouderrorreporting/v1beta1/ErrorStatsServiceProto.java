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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public final class ErrorStatsServiceProto {
  private ErrorStatsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroupStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroupStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_TimedCount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_TimedCount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/devtools/clouderrorreporting/v1"
          + "beta1/error_stats_service.proto\022+google."
          + "devtools.clouderrorreporting.v1beta1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\0328google/"
          + "devtools/clouderrorreporting/v1beta1/com"
          + "mon.proto\032\036google/protobuf/duration.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\215\005\n\025L"
          + "istGroupStatsRequest\022J\n\014project_name\030\001 \001"
          + "(\tB4\342A\001\002\372A-\n+cloudresourcemanager.google"
          + "apis.com/Project\022\026\n\010group_id\030\002 \003(\tB\004\342A\001\001"
          + "\022_\n\016service_filter\030\003 \001(\0132A.google.devtoo"
          + "ls.clouderrorreporting.v1beta1.ServiceCo"
          + "ntextFilterB\004\342A\001\001\022U\n\ntime_range\030\005 \001(\0132;."
          + "google.devtools.clouderrorreporting.v1be"
          + "ta1.QueryTimeRangeB\004\342A\001\001\022=\n\024timed_count_"
          + "duration\030\006 \001(\0132\031.google.protobuf.Duratio"
          + "nB\004\342A\001\001\022Y\n\talignment\030\007 \001(\0162@.google.devt"
          + "ools.clouderrorreporting.v1beta1.TimedCo"
          + "untAlignmentB\004\342A\001\001\0228\n\016alignment_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\004\342A\001\001\022Q\n\005"
          + "order\030\t \001(\0162<.google.devtools.clouderror"
          + "reporting.v1beta1.ErrorGroupOrderB\004\342A\001\001\022"
          + "\027\n\tpage_size\030\013 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\014"
          + " \001(\tB\004\342A\001\001\"\300\001\n\026ListGroupStatsResponse\022W\n"
          + "\021error_group_stats\030\001 \003(\0132<.google.devtoo"
          + "ls.clouderrorreporting.v1beta1.ErrorGrou"
          + "pStats\022\027\n\017next_page_token\030\002 \001(\t\0224\n\020time_"
          + "range_begin\030\004 \001(\0132\032.google.protobuf.Time"
          + "stamp\"\206\004\n\017ErrorGroupStats\022F\n\005group\030\001 \001(\013"
          + "27.google.devtools.clouderrorreporting.v"
          + "1beta1.ErrorGroup\022\r\n\005count\030\002 \001(\003\022\034\n\024affe"
          + "cted_users_count\030\003 \001(\003\022M\n\014timed_counts\030\004"
          + " \003(\01327.google.devtools.clouderrorreporti"
          + "ng.v1beta1.TimedCount\0223\n\017first_seen_time"
          + "\030\005 \001(\0132\032.google.protobuf.Timestamp\0222\n\016la"
          + "st_seen_time\030\006 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022V\n\021affected_services\030\007 \003(\0132;.goog"
          + "le.devtools.clouderrorreporting.v1beta1."
          + "ServiceContext\022\035\n\025num_affected_services\030"
          + "\010 \001(\005\022O\n\016representative\030\t \001(\01327.google.d"
          + "evtools.clouderrorreporting.v1beta1.Erro"
          + "rEvent\"y\n\nTimedCount\022\r\n\005count\030\001 \001(\003\022.\n\ns"
          + "tart_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "amp\022,\n\010end_time\030\003 \001(\0132\032.google.protobuf."
          + "Timestamp\"\342\002\n\021ListEventsRequest\022J\n\014proje"
          + "ct_name\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresourceman"
          + "ager.googleapis.com/Project\022\026\n\010group_id\030"
          + "\002 \001(\tB\004\342A\001\002\022_\n\016service_filter\030\003 \001(\0132A.go"
          + "ogle.devtools.clouderrorreporting.v1beta"
          + "1.ServiceContextFilterB\004\342A\001\001\022U\n\ntime_ran"
          + "ge\030\004 \001(\0132;.google.devtools.clouderrorrep"
          + "orting.v1beta1.QueryTimeRangeB\004\342A\001\001\022\027\n\tp"
          + "age_size\030\006 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\007 \001(\t"
          + "B\004\342A\001\001\"\262\001\n\022ListEventsResponse\022M\n\014error_e"
          + "vents\030\001 \003(\01327.google.devtools.clouderror"
          + "reporting.v1beta1.ErrorEvent\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\0224\n\020time_range_begin\030\004 \001(\0132"
          + "\032.google.protobuf.Timestamp\"\347\001\n\016QueryTim"
          + "eRange\022R\n\006period\030\001 \001(\0162B.google.devtools"
          + ".clouderrorreporting.v1beta1.QueryTimeRa"
          + "nge.Period\"\200\001\n\006Period\022\026\n\022PERIOD_UNSPECIF"
          + "IED\020\000\022\021\n\rPERIOD_1_HOUR\020\001\022\022\n\016PERIOD_6_HOU"
          + "RS\020\002\022\020\n\014PERIOD_1_DAY\020\003\022\021\n\rPERIOD_1_WEEK\020"
          + "\004\022\022\n\016PERIOD_30_DAYS\020\005\"a\n\024ServiceContextF"
          + "ilter\022\025\n\007service\030\002 \001(\tB\004\342A\001\001\022\025\n\007version\030"
          + "\003 \001(\tB\004\342A\001\001\022\033\n\rresource_type\030\004 \001(\tB\004\342A\001\001"
          + "\"a\n\023DeleteEventsRequest\022J\n\014project_name\030"
          + "\001 \001(\tB4\342A\001\002\372A-\n+cloudresourcemanager.goo"
          + "gleapis.com/Project\"\026\n\024DeleteEventsRespo"
          + "nse*u\n\023TimedCountAlignment\022%\n!ERROR_COUN"
          + "T_ALIGNMENT_UNSPECIFIED\020\000\022\033\n\027ALIGNMENT_E"
          + "QUAL_ROUNDED\020\001\022\032\n\026ALIGNMENT_EQUAL_AT_END"
          + "\020\002*}\n\017ErrorGroupOrder\022\033\n\027GROUP_ORDER_UNS"
          + "PECIFIED\020\000\022\016\n\nCOUNT_DESC\020\001\022\022\n\016LAST_SEEN_"
          + "DESC\020\002\022\020\n\014CREATED_DESC\020\003\022\027\n\023AFFECTED_USE"
          + "RS_DESC\020\0042\213\006\n\021ErrorStatsService\022\352\001\n\016List"
          + "GroupStats\022B.google.devtools.clouderrorr"
          + "eporting.v1beta1.ListGroupStatsRequest\032C"
          + ".google.devtools.clouderrorreporting.v1b"
          + "eta1.ListGroupStatsResponse\"O\332A\027project_"
          + "name,time_range\202\323\344\223\002/\022-/v1beta1/{project"
          + "_name=projects/*}/groupStats\022\330\001\n\nListEve"
          + "nts\022>.google.devtools.clouderrorreportin"
          + "g.v1beta1.ListEventsRequest\032?.google.dev"
          + "tools.clouderrorreporting.v1beta1.ListEv"
          + "entsResponse\"I\332A\025project_name,group_id\202\323"
          + "\344\223\002+\022)/v1beta1/{project_name=projects/*}"
          + "/events\022\325\001\n\014DeleteEvents\022@.google.devtoo"
          + "ls.clouderrorreporting.v1beta1.DeleteEve"
          + "ntsRequest\032A.google.devtools.clouderrorr"
          + "eporting.v1beta1.DeleteEventsResponse\"@\332"
          + "A\014project_name\202\323\344\223\002+*)/v1beta1/{project_"
          + "name=projects/*}/events\032V\312A\"clouderrorre"
          + "porting.googleapis.com\322A.https://www.goo"
          + "gleapis.com/auth/cloud-platformB\224\002\n/com."
          + "google.devtools.clouderrorreporting.v1be"
          + "ta1B\026ErrorStatsServiceProtoP\001ZOcloud.goo"
          + "gle.com/go/errorreporting/apiv1beta1/err"
          + "orreportingpb;errorreportingpb\370\001\001\252\002#Goog"
          + "le.Cloud.ErrorReporting.V1Beta1\312\002#Google"
          + "\\Cloud\\ErrorReporting\\V1beta1\352\002&Google::"
          + "Cloud::ErrorReporting::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsRequest_descriptor,
            new java.lang.String[] {
              "ProjectName",
              "GroupId",
              "ServiceFilter",
              "TimeRange",
              "TimedCountDuration",
              "Alignment",
              "AlignmentTime",
              "Order",
              "PageSize",
              "PageToken",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ListGroupStatsResponse_descriptor,
            new java.lang.String[] {
              "ErrorGroupStats", "NextPageToken", "TimeRangeBegin",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroupStats_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroupStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ErrorGroupStats_descriptor,
            new java.lang.String[] {
              "Group",
              "Count",
              "AffectedUsersCount",
              "TimedCounts",
              "FirstSeenTime",
              "LastSeenTime",
              "AffectedServices",
              "NumAffectedServices",
              "Representative",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_TimedCount_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_clouderrorreporting_v1beta1_TimedCount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_TimedCount_descriptor,
            new java.lang.String[] {
              "Count", "StartTime", "EndTime",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsRequest_descriptor,
            new java.lang.String[] {
              "ProjectName", "GroupId", "ServiceFilter", "TimeRange", "PageSize", "PageToken",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ListEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorEvents", "NextPageToken", "TimeRangeBegin",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor,
            new java.lang.String[] {
              "Period",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor,
            new java.lang.String[] {
              "Service", "Version", "ResourceType",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsRequest_descriptor,
            new java.lang.String[] {
              "ProjectName",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_DeleteEventsResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
