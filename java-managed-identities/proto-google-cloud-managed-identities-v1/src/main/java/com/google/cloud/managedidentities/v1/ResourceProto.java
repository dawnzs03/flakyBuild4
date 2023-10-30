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
// source: google/cloud/managedidentities/v1/resource.proto

package com.google.cloud.managedidentities.v1;

public final class ResourceProto {
  private ResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Domain_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Domain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_managedidentities_v1_Trust_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_managedidentities_v1_Trust_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/managedidentities/v1/reso"
          + "urce.proto\022!google.cloud.managedidentiti"
          + "es.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\252\006\n\006Domain\022\022\n\004name\030\001 "
          + "\001(\tB\004\342A\001\002\022K\n\006labels\030\002 \003(\01325.google.cloud"
          + ".managedidentities.v1.Domain.LabelsEntry"
          + "B\004\342A\001\001\022!\n\023authorized_networks\030\003 \003(\tB\004\342A\001"
          + "\001\022\037\n\021reserved_ip_range\030\004 \001(\tB\004\342A\001\002\022\027\n\tlo"
          + "cations\030\005 \003(\tB\004\342A\001\002\022\023\n\005admin\030\006 \001(\tB\004\342A\001\001"
          + "\022\022\n\004fqdn\030\n \001(\tB\004\342A\001\003\0225\n\013create_time\030\013 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013u"
          + "pdate_time\030\014 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022D\n\005state\030\r \001(\0162/.google.cloud"
          + ".managedidentities.v1.Domain.StateB\004\342A\001\003"
          + "\022\034\n\016status_message\030\016 \001(\tB\004\342A\001\003\022>\n\006trusts"
          + "\030\017 \003(\0132(.google.cloud.managedidentities."
          + "v1.TrustB\004\342A\001\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\217\001\n\005State\022\025\n\021STATE"
          + "_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020\002\022"
          + "\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\r\n\tREPAIRING"
          + "\020\005\022\032\n\026PERFORMING_MAINTENANCE\020\006\022\017\n\013UNAVAI"
          + "LABLE\020\007:f\352Ac\n\'managedidentities.googleap"
          + "is.com/Domain\0228projects/{project}/locati"
          + "ons/{location}/domains/{domain}\"\354\006\n\005Trus"
          + "t\022 \n\022target_domain_name\030\001 \001(\tB\004\342A\001\002\022L\n\nt"
          + "rust_type\030\002 \001(\01622.google.cloud.managedid"
          + "entities.v1.Trust.TrustTypeB\004\342A\001\002\022V\n\017tru"
          + "st_direction\030\003 \001(\01627.google.cloud.manage"
          + "didentities.v1.Trust.TrustDirectionB\004\342A\001"
          + "\002\022&\n\030selective_authentication\030\004 \001(\010B\004\342A\001"
          + "\001\022%\n\027target_dns_ip_addresses\030\005 \003(\tB\004\342A\001\002"
          + "\022$\n\026trust_handshake_secret\030\006 \001(\tB\004\342A\001\002\0225"
          + "\n\013create_time\030\007 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\004\342A\001\003\0225\n\013update_time\030\010 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022C\n\005state\030\t "
          + "\001(\0162..google.cloud.managedidentities.v1."
          + "Trust.StateB\004\342A\001\003\022\037\n\021state_description\030\013"
          + " \001(\tB\004\342A\001\003\022C\n\031last_trust_heartbeat_time\030"
          + "\014 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\""
          + "i\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREAT"
          + "ING\020\001\022\014\n\010UPDATING\020\002\022\014\n\010DELETING\020\003\022\r\n\tCON"
          + "NECTED\020\004\022\020\n\014DISCONNECTED\020\005\"A\n\tTrustType\022"
          + "\032\n\026TRUST_TYPE_UNSPECIFIED\020\000\022\n\n\006FOREST\020\001\022"
          + "\014\n\010EXTERNAL\020\002\"_\n\016TrustDirection\022\037\n\033TRUST"
          + "_DIRECTION_UNSPECIFIED\020\000\022\013\n\007INBOUND\020\001\022\014\n"
          + "\010OUTBOUND\020\002\022\021\n\rBIDIRECTIONAL\020\003B\374\001\n%com.g"
          + "oogle.cloud.managedidentities.v1B\rResour"
          + "ceProtoP\001ZScloud.google.com/go/managedid"
          + "entities/apiv1/managedidentitiespb;manag"
          + "edidentitiespb\252\002!Google.Cloud.ManagedIde"
          + "ntities.V1\312\002!Google\\Cloud\\ManagedIdentit"
          + "ies\\V1\352\002$Google::Cloud::ManagedIdentitie"
          + "s::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_managedidentities_v1_Domain_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_managedidentities_v1_Domain_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Domain_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "AuthorizedNetworks",
              "ReservedIpRange",
              "Locations",
              "Admin",
              "Fqdn",
              "CreateTime",
              "UpdateTime",
              "State",
              "StatusMessage",
              "Trusts",
            });
    internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor =
        internal_static_google_cloud_managedidentities_v1_Domain_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Domain_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_managedidentities_v1_Trust_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_managedidentities_v1_Trust_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_managedidentities_v1_Trust_descriptor,
            new java.lang.String[] {
              "TargetDomainName",
              "TrustType",
              "TrustDirection",
              "SelectiveAuthentication",
              "TargetDnsIpAddresses",
              "TrustHandshakeSecret",
              "CreateTime",
              "UpdateTime",
              "State",
              "StateDescription",
              "LastTrustHeartbeatTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
