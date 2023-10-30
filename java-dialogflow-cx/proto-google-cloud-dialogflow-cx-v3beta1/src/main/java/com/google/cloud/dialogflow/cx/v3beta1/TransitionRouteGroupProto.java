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
// source: google/cloud/dialogflow/cx/v3beta1/transition_route_group.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class TransitionRouteGroupProto {
  private TransitionRouteGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/dialogflow/cx/v3beta1/tra"
          + "nsition_route_group.proto\022\"google.cloud."
          + "dialogflow.cx.v3beta1\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032-google/cloud/dialogflo"
          + "w/cx/v3beta1/page.proto\032\033google/protobuf"
          + "/empty.proto\032 google/protobuf/field_mask"
          + ".proto\"\273\002\n\024TransitionRouteGroup\022\014\n\004name\030"
          + "\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022N\n\021tra"
          + "nsition_routes\030\005 \003(\01323.google.cloud.dial"
          + "ogflow.cx.v3beta1.TransitionRoute:\250\001\352A\244\001"
          + "\n.dialogflow.googleapis.com/TransitionRo"
          + "uteGroup\022rprojects/{project}/locations/{"
          + "location}/agents/{agent}/flows/{flow}/tr"
          + "ansitionRouteGroups/{transition_route_gr"
          + "oup}\"\251\001\n ListTransitionRouteGroupsReques"
          + "t\022G\n\006parent\030\001 \001(\tB7\342A\001\002\372A0\022.dialogflow.g"
          + "oogleapis.com/TransitionRouteGroup\022\021\n\tpa"
          + "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\025\n\rlan"
          + "guage_code\030\004 \001(\t\"\227\001\n!ListTransitionRoute"
          + "GroupsResponse\022Y\n\027transition_route_group"
          + "s\030\001 \003(\01328.google.cloud.dialogflow.cx.v3b"
          + "eta1.TransitionRouteGroup\022\027\n\017next_page_t"
          + "oken\030\002 \001(\t\"~\n\036GetTransitionRouteGroupReq"
          + "uest\022E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n.dialogflow."
          + "googleapis.com/TransitionRouteGroup\022\025\n\rl"
          + "anguage_code\030\002 \001(\t\"\343\001\n!CreateTransitionR"
          + "outeGroupRequest\022G\n\006parent\030\001 \001(\tB7\342A\001\002\372A"
          + "0\022.dialogflow.googleapis.com/TransitionR"
          + "outeGroup\022^\n\026transition_route_group\030\002 \001("
          + "\01328.google.cloud.dialogflow.cx.v3beta1.T"
          + "ransitionRouteGroupB\004\342A\001\002\022\025\n\rlanguage_co"
          + "de\030\003 \001(\t\"\313\001\n!UpdateTransitionRouteGroupR"
          + "equest\022^\n\026transition_route_group\030\001 \001(\01328"
          + ".google.cloud.dialogflow.cx.v3beta1.Tran"
          + "sitionRouteGroupB\004\342A\001\002\022/\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMask\022\025\n\rlangu"
          + "age_code\030\003 \001(\t\"y\n!DeleteTransitionRouteG"
          + "roupRequest\022E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n.dial"
          + "ogflow.googleapis.com/TransitionRouteGro"
          + "up\022\r\n\005force\030\002 \001(\0102\367\013\n\025TransitionRouteGro"
          + "ups\022\212\002\n\031ListTransitionRouteGroups\022D.goog"
          + "le.cloud.dialogflow.cx.v3beta1.ListTrans"
          + "itionRouteGroupsRequest\032E.google.cloud.d"
          + "ialogflow.cx.v3beta1.ListTransitionRoute"
          + "GroupsResponse\"`\332A\006parent\202\323\344\223\002Q\022O/v3beta"
          + "1/{parent=projects/*/locations/*/agents/"
          + "*/flows/*}/transitionRouteGroups\022\367\001\n\027Get"
          + "TransitionRouteGroup\022B.google.cloud.dial"
          + "ogflow.cx.v3beta1.GetTransitionRouteGrou"
          + "pRequest\0328.google.cloud.dialogflow.cx.v3"
          + "beta1.TransitionRouteGroup\"^\332A\004name\202\323\344\223\002"
          + "Q\022O/v3beta1/{name=projects/*/locations/*"
          + "/agents/*/flows/*/transitionRouteGroups/"
          + "*}\022\257\002\n\032CreateTransitionRouteGroup\022E.goog"
          + "le.cloud.dialogflow.cx.v3beta1.CreateTra"
          + "nsitionRouteGroupRequest\0328.google.cloud."
          + "dialogflow.cx.v3beta1.TransitionRouteGro"
          + "up\"\217\001\332A\035parent,transition_route_group\202\323\344"
          + "\223\002i\"O/v3beta1/{parent=projects/*/locatio"
          + "ns/*/agents/*/flows/*}/transitionRouteGr"
          + "oups:\026transition_route_group\022\314\002\n\032UpdateT"
          + "ransitionRouteGroup\022E.google.cloud.dialo"
          + "gflow.cx.v3beta1.UpdateTransitionRouteGr"
          + "oupRequest\0328.google.cloud.dialogflow.cx."
          + "v3beta1.TransitionRouteGroup\"\254\001\332A\"transi"
          + "tion_route_group,update_mask\202\323\344\223\002\200\0012f/v3"
          + "beta1/{transition_route_group.name=proje"
          + "cts/*/locations/*/agents/*/flows/*/trans"
          + "itionRouteGroups/*}:\026transition_route_gr"
          + "oup\022\333\001\n\032DeleteTransitionRouteGroup\022E.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.DeleteTr"
          + "ansitionRouteGroupRequest\032\026.google.proto"
          + "buf.Empty\"^\332A\004name\202\323\344\223\002Q*O/v3beta1/{name"
          + "=projects/*/locations/*/agents/*/flows/*"
          + "/transitionRouteGroups/*}\032x\312A\031dialogflow"
          + ".googleapis.com\322AYhttps://www.googleapis"
          + ".com/auth/cloud-platform,https://www.goo"
          + "gleapis.com/auth/dialogflowB\323\001\n&com.goog"
          + "le.cloud.dialogflow.cx.v3beta1B\031Transiti"
          + "onRouteGroupProtoP\001Z6cloud.google.com/go"
          + "/dialogflow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002"
          + "\002DF\252\002\"Google.Cloud.Dialogflow.Cx.V3Beta1"
          + "\352\002&Google::Cloud::Dialogflow::CX::V3beta"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_TransitionRouteGroup_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "TransitionRoutes",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListTransitionRouteGroupsResponse_descriptor,
            new java.lang.String[] {
              "TransitionRouteGroups", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TransitionRouteGroup", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "TransitionRouteGroup", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteTransitionRouteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
