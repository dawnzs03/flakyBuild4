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
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public final class NotificationServiceProto {
  private NotificationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/monitoring/v3/notification_serv"
          + "ice.proto\022\024google.monitoring.v3\032\034google/"
          + "api/annotations.proto\032\027google/api/client"
          + ".proto\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\'google/monit"
          + "oring/v3/notification.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\242\001\n)ListNotificationChannelDescripto"
          + "rsRequest\022N\n\004name\030\004 \001(\tB@\342A\001\002\372A9\0227monito"
          + "ring.googleapis.com/NotificationChannelD"
          + "escriptor\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok"
          + "en\030\003 \001(\t\"\227\001\n*ListNotificationChannelDesc"
          + "riptorsResponse\022P\n\023channel_descriptors\030\001"
          + " \003(\01323.google.monitoring.v3.Notification"
          + "ChannelDescriptor\022\027\n\017next_page_token\030\002 \001"
          + "(\t\"y\n\'GetNotificationChannelDescriptorRe"
          + "quest\022N\n\004name\030\003 \001(\tB@\342A\001\002\372A9\n7monitoring"
          + ".googleapis.com/NotificationChannelDescr"
          + "iptor\"\267\001\n CreateNotificationChannelReque"
          + "st\022D\n\004name\030\003 \001(\tB6\342A\001\002\372A/\022-monitoring.go"
          + "ogleapis.com/NotificationChannel\022M\n\024noti"
          + "fication_channel\030\002 \001(\0132).google.monitori"
          + "ng.v3.NotificationChannelB\004\342A\001\002\"\260\001\n\037List"
          + "NotificationChannelsRequest\022D\n\004name\030\005 \001("
          + "\tB6\342A\001\002\372A/\022-monitoring.googleapis.com/No"
          + "tificationChannel\022\016\n\006filter\030\006 \001(\t\022\020\n\010ord"
          + "er_by\030\007 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_t"
          + "oken\030\004 \001(\t\"\231\001\n ListNotificationChannelsR"
          + "esponse\022H\n\025notification_channels\030\003 \003(\0132)"
          + ".google.monitoring.v3.NotificationChanne"
          + "l\022\027\n\017next_page_token\030\002 \001(\t\022\022\n\ntotal_size"
          + "\030\004 \001(\005\"e\n\035GetNotificationChannelRequest\022"
          + "D\n\004name\030\003 \001(\tB6\342A\001\002\372A/\n-monitoring.googl"
          + "eapis.com/NotificationChannel\"\242\001\n Update"
          + "NotificationChannelRequest\022/\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMask\022M\n\024n"
          + "otification_channel\030\003 \001(\0132).google.monit"
          + "oring.v3.NotificationChannelB\004\342A\001\002\"w\n De"
          + "leteNotificationChannelRequest\022D\n\004name\030\003"
          + " \001(\tB6\342A\001\002\372A/\n-monitoring.googleapis.com"
          + "/NotificationChannel\022\r\n\005force\030\005 \001(\010\"v\n.S"
          + "endNotificationChannelVerificationCodeRe"
          + "quest\022D\n\004name\030\001 \001(\tB6\342A\001\002\372A/\n-monitoring"
          + ".googleapis.com/NotificationChannel\"\246\001\n-"
          + "GetNotificationChannelVerificationCodeRe"
          + "quest\022D\n\004name\030\001 \001(\tB6\342A\001\002\372A/\n-monitoring"
          + ".googleapis.com/NotificationChannel\022/\n\013e"
          + "xpire_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tamp\"o\n.GetNotificationChannelVerificati"
          + "onCodeResponse\022\014\n\004code\030\001 \001(\t\022/\n\013expire_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\"|\n"
          + " VerifyNotificationChannelRequest\022D\n\004nam"
          + "e\030\001 \001(\tB6\342A\001\002\372A/\n-monitoring.googleapis."
          + "com/NotificationChannel\022\022\n\004code\030\002 \001(\tB\004\342"
          + "A\001\0022\352\022\n\032NotificationChannelService\022\354\001\n\"L"
          + "istNotificationChannelDescriptors\022?.goog"
          + "le.monitoring.v3.ListNotificationChannel"
          + "DescriptorsRequest\032@.google.monitoring.v"
          + "3.ListNotificationChannelDescriptorsResp"
          + "onse\"C\332A\004name\202\323\344\223\0026\0224/v3/{name=projects/"
          + "*}/notificationChannelDescriptors\022\335\001\n Ge"
          + "tNotificationChannelDescriptor\022=.google."
          + "monitoring.v3.GetNotificationChannelDesc"
          + "riptorRequest\0323.google.monitoring.v3.Not"
          + "ificationChannelDescriptor\"E\332A\004name\202\323\344\223\002"
          + "8\0226/v3/{name=projects/*/notificationChan"
          + "nelDescriptors/*}\022\304\001\n\030ListNotificationCh"
          + "annels\0225.google.monitoring.v3.ListNotifi"
          + "cationChannelsRequest\0326.google.monitorin"
          + "g.v3.ListNotificationChannelsResponse\"9\332"
          + "A\004name\202\323\344\223\002,\022*/v3/{name=projects/*}/noti"
          + "ficationChannels\022\265\001\n\026GetNotificationChan"
          + "nel\0223.google.monitoring.v3.GetNotificati"
          + "onChannelRequest\032).google.monitoring.v3."
          + "NotificationChannel\";\332A\004name\202\323\344\223\002.\022,/v3/"
          + "{name=projects/*/notificationChannels/*}"
          + "\022\344\001\n\031CreateNotificationChannel\0226.google."
          + "monitoring.v3.CreateNotificationChannelR"
          + "equest\032).google.monitoring.v3.Notificati"
          + "onChannel\"d\332A\031name,notification_channel\202"
          + "\323\344\223\002B\"*/v3/{name=projects/*}/notificatio"
          + "nChannels:\024notification_channel\022\203\002\n\031Upda"
          + "teNotificationChannel\0226.google.monitorin"
          + "g.v3.UpdateNotificationChannelRequest\032)."
          + "google.monitoring.v3.NotificationChannel"
          + "\"\202\001\332A update_mask,notification_channel\202\323"
          + "\344\223\002Y2A/v3/{notification_channel.name=pro"
          + "jects/*/notificationChannels/*}:\024notific"
          + "ation_channel\022\256\001\n\031DeleteNotificationChan"
          + "nel\0226.google.monitoring.v3.DeleteNotific"
          + "ationChannelRequest\032\026.google.protobuf.Em"
          + "pty\"A\332A\nname,force\202\323\344\223\002.*,/v3/{name=proj"
          + "ects/*/notificationChannels/*}\022\334\001\n\'SendN"
          + "otificationChannelVerificationCode\022D.goo"
          + "gle.monitoring.v3.SendNotificationChanne"
          + "lVerificationCodeRequest\032\026.google.protob"
          + "uf.Empty\"S\332A\004name\202\323\344\223\002F\"A/v3/{name=proje"
          + "cts/*/notificationChannels/*}:sendVerifi"
          + "cationCode:\001*\022\207\002\n&GetNotificationChannel"
          + "VerificationCode\022C.google.monitoring.v3."
          + "GetNotificationChannelVerificationCodeRe"
          + "quest\032D.google.monitoring.v3.GetNotifica"
          + "tionChannelVerificationCodeResponse\"R\332A\004"
          + "name\202\323\344\223\002E\"@/v3/{name=projects/*/notific"
          + "ationChannels/*}:getVerificationCode:\001*\022"
          + "\312\001\n\031VerifyNotificationChannel\0226.google.m"
          + "onitoring.v3.VerifyNotificationChannelRe"
          + "quest\032).google.monitoring.v3.Notificatio"
          + "nChannel\"J\332A\tname,code\202\323\344\223\0028\"3/v3/{name="
          + "projects/*/notificationChannels/*}:verif"
          + "y:\001*\032\251\001\312A\031monitoring.googleapis.com\322A\211\001h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tform,https://www.googleapis.com/auth/mo"
          + "nitoring,https://www.googleapis.com/auth"
          + "/monitoring.readB\323\001\n\030com.google.monitori"
          + "ng.v3B\030NotificationServiceProtoP\001ZAcloud"
          + ".google.com/go/monitoring/apiv3/v2/monit"
          + "oringpb;monitoringpb\252\002\032Google.Cloud.Moni"
          + "toring.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002"
          + "\035Google::Cloud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.NotificationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ChannelDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "NotificationChannel",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor,
            new java.lang.String[] {
              "NotificationChannels", "NextPageToken", "TotalSize",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "NotificationChannel",
            });
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor,
            new java.lang.String[] {
              "Name", "ExpireTime",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor,
            new java.lang.String[] {
              "Code", "ExpireTime",
            });
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "Code",
            });
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
    com.google.monitoring.v3.NotificationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
