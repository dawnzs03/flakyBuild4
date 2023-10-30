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
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

public final class GameServerClusters {
  private GameServerClusters() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GkeClusterReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_KubernetesClusterState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/gaming/v1/game_server_clu"
          + "sters.proto\022\026google.cloud.gaming.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032#google/cloud/gaming/v1/"
          + "common.proto\032 google/protobuf/field_mask"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\213\002\n\035ListGameServerClustersRequest\022F\n\006par"
          + "ent\030\001 \001(\tB6\342A\001\002\372A/\022-gameservices.googlea"
          + "pis.com/GameServerCluster\022\027\n\tpage_size\030\002"
          + " \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006"
          + "filter\030\004 \001(\tB\004\342A\001\001\022\026\n\010order_by\030\005 \001(\tB\004\342A"
          + "\001\001\022A\n\004view\030\006 \001(\0162-.google.cloud.gaming.v"
          + "1.GameServerClusterViewB\004\342A\001\001\"\227\001\n\036ListGa"
          + "meServerClustersResponse\022G\n\024game_server_"
          + "clusters\030\001 \003(\0132).google.cloud.gaming.v1."
          + "GameServerCluster\022\027\n\017next_page_token\030\002 \001"
          + "(\t\022\023\n\013unreachable\030\004 \003(\t\"\246\001\n\033GetGameServe"
          + "rClusterRequest\022D\n\004name\030\001 \001(\tB6\342A\001\002\372A/\n-"
          + "gameservices.googleapis.com/GameServerCl"
          + "uster\022A\n\004view\030\006 \001(\0162-.google.cloud.gamin"
          + "g.v1.GameServerClusterViewB\004\342A\001\001\"\334\001\n\036Cre"
          + "ateGameServerClusterRequest\022F\n\006parent\030\001 "
          + "\001(\tB6\342A\001\002\372A/\022-gameservices.googleapis.co"
          + "m/GameServerCluster\022$\n\026game_server_clust"
          + "er_id\030\002 \001(\tB\004\342A\001\002\022L\n\023game_server_cluster"
          + "\030\003 \001(\0132).google.cloud.gaming.v1.GameServ"
          + "erClusterB\004\342A\001\002\"\340\002\n%PreviewCreateGameSer"
          + "verClusterRequest\022F\n\006parent\030\001 \001(\tB6\342A\001\002\372"
          + "A/\022-gameservices.googleapis.com/GameServ"
          + "erCluster\022$\n\026game_server_cluster_id\030\002 \001("
          + "\tB\004\342A\001\002\022L\n\023game_server_cluster\030\003 \001(\0132).g"
          + "oogle.cloud.gaming.v1.GameServerClusterB"
          + "\004\342A\001\002\0226\n\014preview_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\004\342A\001\001\022C\n\004view\030\006 \001(\0162-.go"
          + "ogle.cloud.gaming.v1.GameServerClusterVi"
          + "ewB\006\030\001\342A\001\001\"\276\001\n&PreviewCreateGameServerCl"
          + "usterResponse\022\014\n\004etag\030\002 \001(\t\0229\n\014target_st"
          + "ate\030\003 \001(\0132#.google.cloud.gaming.v1.Targe"
          + "tState\022K\n\rcluster_state\030\004 \001(\0132..google.c"
          + "loud.gaming.v1.KubernetesClusterStateB\004\342"
          + "A\001\003\"f\n\036DeleteGameServerClusterRequest\022D\n"
          + "\004name\030\001 \001(\tB6\342A\001\002\372A/\n-gameservices.googl"
          + "eapis.com/GameServerCluster\"\245\001\n%PreviewD"
          + "eleteGameServerClusterRequest\022D\n\004name\030\001 "
          + "\001(\tB6\342A\001\002\372A/\n-gameservices.googleapis.co"
          + "m/GameServerCluster\0226\n\014preview_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\001\"q\n&P"
          + "reviewDeleteGameServerClusterResponse\022\014\n"
          + "\004etag\030\002 \001(\t\0229\n\014target_state\030\003 \001(\0132#.goog"
          + "le.cloud.gaming.v1.TargetState\"\245\001\n\036Updat"
          + "eGameServerClusterRequest\022L\n\023game_server"
          + "_cluster\030\001 \001(\0132).google.cloud.gaming.v1."
          + "GameServerClusterB\004\342A\001\002\0225\n\013update_mask\030\002"
          + " \001(\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\"\344"
          + "\001\n%PreviewUpdateGameServerClusterRequest"
          + "\022L\n\023game_server_cluster\030\001 \001(\0132).google.c"
          + "loud.gaming.v1.GameServerClusterB\004\342A\001\002\0225"
          + "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi"
          + "eldMaskB\004\342A\001\002\0226\n\014preview_time\030\003 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\004\342A\001\001\"q\n&Preview"
          + "UpdateGameServerClusterResponse\022\014\n\004etag\030"
          + "\002 \001(\t\0229\n\014target_state\030\003 \001(\0132#.google.clo"
          + "ud.gaming.v1.TargetState\"\227\001\n\037GameServerC"
          + "lusterConnectionInfo\022L\n\025gke_cluster_refe"
          + "rence\030\007 \001(\0132+.google.cloud.gaming.v1.Gke"
          + "ClusterReferenceH\000\022\021\n\tnamespace\030\005 \001(\tB\023\n"
          + "\021cluster_reference\"&\n\023GkeClusterReferenc"
          + "e\022\017\n\007cluster\030\001 \001(\t\"\330\004\n\021GameServerCluster"
          + "\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\0225\n\013create_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013u"
          + "pdate_time\030\003 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022E\n\006labels\030\004 \003(\01325.google.clou"
          + "d.gaming.v1.GameServerCluster.LabelsEntr"
          + "y\022P\n\017connection_info\030\005 \001(\01327.google.clou"
          + "d.gaming.v1.GameServerClusterConnectionI"
          + "nfo\022\014\n\004etag\030\006 \001(\t\022\023\n\013description\030\007 \001(\t\022K"
          + "\n\rcluster_state\030\013 \001(\0132..google.cloud.gam"
          + "ing.v1.KubernetesClusterStateB\004\342A\001\003\032-\n\013L"
          + "abelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001:\210\001\352A\204\001\n-gameservices.googleapis.com/G"
          + "ameServerCluster\022Sprojects/{project}/loc"
          + "ations/{location}/realms/{realm}/gameSer"
          + "verClusters/{cluster}\"\355\004\n\026KubernetesClus"
          + "terState\022&\n\030agones_version_installed\030\001 \001"
          + "(\tB\004\342A\001\003\022*\n\034kubernetes_version_installed"
          + "\030\002 \001(\tB\004\342A\001\003\022b\n\022installation_state\030\003 \001(\016"
          + "2@.google.cloud.gaming.v1.KubernetesClus"
          + "terState.InstallationStateB\004\342A\001\003\022-\n\037vers"
          + "ion_installed_error_message\030\004 \001(\tB\004\342A\001\003\022"
          + "\026\n\010provider\030\005 \001(\tB\004\342A\001\003\022%\n\027agones_versio"
          + "n_targeted\030\006 \001(\tB\004\342A\001\003\"\254\002\n\021InstallationS"
          + "tate\022\"\n\036INSTALLATION_STATE_UNSPECIFIED\020\000"
          + "\022\'\n#AGONES_KUBERNETES_VERSION_SUPPORTED\020"
          + "\001\022\036\n\032AGONES_VERSION_UNSUPPORTED\020\002\022)\n%AGO"
          + "NES_KUBERNETES_VERSION_UNSUPPORTED\020\003\022\037\n\033"
          + "AGONES_VERSION_UNRECOGNIZED\020\004\022#\n\037KUBERNE"
          + "TES_VERSION_UNRECOGNIZED\020\005\022\037\n\033VERSION_VE"
          + "RIFICATION_FAILED\020\006\022\030\n\024AGONES_NOT_INSTAL"
          + "LED\020\007*V\n\025GameServerClusterView\022(\n$GAME_S"
          + "ERVER_CLUSTER_VIEW_UNSPECIFIED\020\000\022\t\n\005BASI"
          + "C\020\001\022\010\n\004FULL\020\002BR\n\032com.google.cloud.gaming"
          + ".v1P\001Z2cloud.google.com/go/gaming/apiv1/"
          + "gamingpb;gamingpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1.Common.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerClustersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "View",
            });
    internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerClustersResponse_descriptor,
            new java.lang.String[] {
              "GameServerClusters", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GetGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_CreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster",
            });
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GameServerClusterId", "GameServerCluster", "PreviewTime", "View",
            });
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewCreateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState", "ClusterState",
            });
    internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_UpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterRequest_descriptor,
            new java.lang.String[] {
              "GameServerCluster", "UpdateMask", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewUpdateGameServerClusterResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor,
            new java.lang.String[] {
              "GkeClusterReference", "Namespace", "ClusterReference",
            });
    internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1_GkeClusterReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GkeClusterReference_descriptor,
            new java.lang.String[] {
              "Cluster",
            });
    internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1_GameServerCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "ConnectionInfo",
              "Etag",
              "Description",
              "ClusterState",
            });
    internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1_GameServerCluster_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerCluster_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_gaming_v1_KubernetesClusterState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_KubernetesClusterState_descriptor,
            new java.lang.String[] {
              "AgonesVersionInstalled",
              "KubernetesVersionInstalled",
              "InstallationState",
              "VersionInstalledErrorMessage",
              "Provider",
              "AgonesVersionTargeted",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gaming.v1.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
