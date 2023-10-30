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
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public final class DataScansProto {
  private DataScansProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScansRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScansResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_RunDataScanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_RunDataScanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataScanJob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dataplex/v1/datascans.pro"
          + "to\022\030google.cloud.dataplex.v1\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032+google/cloud/da"
          + "taplex/v1/data_profile.proto\032+google/clo"
          + "ud/dataplex/v1/data_quality.proto\032)googl"
          + "e/cloud/dataplex/v1/processing.proto\032(go"
          + "ogle/cloud/dataplex/v1/resources.proto\032&"
          + "google/cloud/dataplex/v1/service.proto\032#"
          + "google/longrunning/operations.proto\032\033goo"
          + "gle/protobuf/empty.proto\032 google/protobu"
          + "f/field_mask.proto\032\037google/protobuf/time"
          + "stamp.proto\"\311\001\n\025CreateDataScanRequest\022:\n"
          + "\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.google"
          + "apis.com/Location\022;\n\tdata_scan\030\002 \001(\0132\".g"
          + "oogle.cloud.dataplex.v1.DataScanB\004\342A\001\002\022\032"
          + "\n\014data_scan_id\030\003 \001(\tB\004\342A\001\002\022\033\n\rvalidate_o"
          + "nly\030\004 \001(\010B\004\342A\001\001\"\250\001\n\025UpdateDataScanReques"
          + "t\022;\n\tdata_scan\030\001 \001(\0132\".google.cloud.data"
          + "plex.v1.DataScanB\004\342A\001\002\0225\n\013update_mask\030\002 "
          + "\001(\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\022\033\n"
          + "\rvalidate_only\030\003 \001(\010B\004\342A\001\001\"P\n\025DeleteData"
          + "ScanRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n data"
          + "plex.googleapis.com/DataScan\"\341\001\n\022GetData"
          + "ScanRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n data"
          + "plex.googleapis.com/DataScan\022M\n\004view\030\002 \001"
          + "(\01629.google.cloud.dataplex.v1.GetDataSca"
          + "nRequest.DataScanViewB\004\342A\001\001\"C\n\014DataScanV"
          + "iew\022\036\n\032DATA_SCAN_VIEW_UNSPECIFIED\020\000\022\t\n\005B"
          + "ASIC\020\001\022\010\n\004FULL\020\n\"\263\001\n\024ListDataScansReques"
          + "t\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.go"
          + "ogleapis.com/Location\022\027\n\tpage_size\030\002 \001(\005"
          + "B\004\342A\001\001\022\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filt"
          + "er\030\004 \001(\tB\004\342A\001\001\022\026\n\010order_by\030\005 \001(\tB\004\342A\001\001\"}"
          + "\n\025ListDataScansResponse\0226\n\ndata_scans\030\001 "
          + "\003(\0132\".google.cloud.dataplex.v1.DataScan\022"
          + "\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030"
          + "\003 \003(\t\"M\n\022RunDataScanRequest\0227\n\004name\030\001 \001("
          + "\tB)\342A\001\002\372A\"\n dataplex.googleapis.com/Data"
          + "Scan\"I\n\023RunDataScanResponse\0222\n\003job\030\001 \001(\013"
          + "2%.google.cloud.dataplex.v1.DataScanJob\""
          + "\364\001\n\025GetDataScanJobRequest\022:\n\004name\030\001 \001(\tB"
          + ",\342A\001\002\372A%\n#dataplex.googleapis.com/DataSc"
          + "anJob\022S\n\004view\030\002 \001(\0162?.google.cloud.datap"
          + "lex.v1.GetDataScanJobRequest.DataScanJob"
          + "ViewB\004\342A\001\001\"J\n\017DataScanJobView\022\"\n\036DATA_SC"
          + "AN_JOB_VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004"
          + "FULL\020\n\"\207\001\n\027ListDataScanJobsRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\342A\001\002\372A\"\n dataplex.googleapis"
          + ".com/DataScan\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030"
          + "\n\npage_token\030\003 \001(\tB\004\342A\001\001\"r\n\030ListDataScan"
          + "JobsResponse\022=\n\016data_scan_jobs\030\001 \003(\0132%.g"
          + "oogle.cloud.dataplex.v1.DataScanJob\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"\301\n\n\010DataScan\022\022\n\004nam"
          + "e\030\001 \001(\tB\004\342A\001\003\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\022\031\n\013desc"
          + "ription\030\003 \001(\tB\004\342A\001\001\022\032\n\014display_name\030\004 \001("
          + "\tB\004\342A\001\001\022D\n\006labels\030\005 \003(\0132..google.cloud.d"
          + "ataplex.v1.DataScan.LabelsEntryB\004\342A\001\001\0224\n"
          + "\005state\030\006 \001(\0162\037.google.cloud.dataplex.v1."
          + "StateB\004\342A\001\003\0225\n\013create_time\030\007 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\004\342A\001\003\0225\n\013update_tim"
          + "e\030\010 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\0228\n\004data\030\t \001(\0132$.google.cloud.dataplex."
          + "v1.DataSourceB\004\342A\001\002\022N\n\016execution_spec\030\n "
          + "\001(\01320.google.cloud.dataplex.v1.DataScan."
          + "ExecutionSpecB\004\342A\001\001\022R\n\020execution_status\030"
          + "\013 \001(\01322.google.cloud.dataplex.v1.DataSca"
          + "n.ExecutionStatusB\004\342A\001\003\022:\n\004type\030\014 \001(\0162&."
          + "google.cloud.dataplex.v1.DataScanTypeB\004\342"
          + "A\001\003\022F\n\021data_quality_spec\030d \001(\0132).google."
          + "cloud.dataplex.v1.DataQualitySpecH\000\022F\n\021d"
          + "ata_profile_spec\030e \001(\0132).google.cloud.da"
          + "taplex.v1.DataProfileSpecH\000\022Q\n\023data_qual"
          + "ity_result\030\310\001 \001(\0132+.google.cloud.dataple"
          + "x.v1.DataQualityResultB\004\342A\001\003H\001\022Q\n\023data_p"
          + "rofile_result\030\311\001 \001(\0132+.google.cloud.data"
          + "plex.v1.DataProfileResultB\004\342A\001\003H\001\032o\n\rExe"
          + "cutionSpec\0228\n\007trigger\030\001 \001(\0132!.google.clo"
          + "ud.dataplex.v1.TriggerB\004\342A\001\001\022\025\n\005field\030d "
          + "\001(\tB\004\342A\001\005H\000B\r\n\013incremental\032\205\001\n\017Execution"
          + "Status\0229\n\025latest_job_start_time\030\004 \001(\0132\032."
          + "google.protobuf.Timestamp\0227\n\023latest_job_"
          + "end_time\030\005 \001(\0132\032.google.protobuf.Timesta"
          + "mp\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001:c\352A`\n dataplex.googleapis.com/"
          + "DataScan\022<projects/{project}/locations/{"
          + "location}/dataScans/{dataScan}B\006\n\004specB\010"
          + "\n\006result\"\355\006\n\013DataScanJob\022\022\n\004name\030\001 \001(\tB\004"
          + "\342A\001\003\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\0224\n\nstart_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222\n"
          + "\010end_time\030\004 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\022@\n\005state\030\005 \001(\0162+.google.cloud."
          + "dataplex.v1.DataScanJob.StateB\004\342A\001\003\022\025\n\007m"
          + "essage\030\006 \001(\tB\004\342A\001\003\022:\n\004type\030\007 \001(\0162&.googl"
          + "e.cloud.dataplex.v1.DataScanTypeB\004\342A\001\003\022L"
          + "\n\021data_quality_spec\030d \001(\0132).google.cloud"
          + ".dataplex.v1.DataQualitySpecB\004\342A\001\003H\000\022L\n\021"
          + "data_profile_spec\030e \001(\0132).google.cloud.d"
          + "ataplex.v1.DataProfileSpecB\004\342A\001\003H\000\022Q\n\023da"
          + "ta_quality_result\030\310\001 \001(\0132+.google.cloud."
          + "dataplex.v1.DataQualityResultB\004\342A\001\003H\001\022Q\n"
          + "\023data_profile_result\030\311\001 \001(\0132+.google.clo"
          + "ud.dataplex.v1.DataProfileResultB\004\342A\001\003H\001"
          + "\"q\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RUNN"
          + "ING\020\001\022\r\n\tCANCELING\020\002\022\r\n\tCANCELLED\020\003\022\r\n\tS"
          + "UCCEEDED\020\004\022\n\n\006FAILED\020\005\022\013\n\007PENDING\020\007:q\352An"
          + "\n#dataplex.googleapis.com/DataScanJob\022Gp"
          + "rojects/{project}/locations/{location}/d"
          + "ataScans/{dataScan}/jobs/{job}B\006\n\004specB\010"
          + "\n\006result*R\n\014DataScanType\022\036\n\032DATA_SCAN_TY"
          + "PE_UNSPECIFIED\020\000\022\020\n\014DATA_QUALITY\020\001\022\020\n\014DA"
          + "TA_PROFILE\020\0022\362\014\n\017DataScanService\022\343\001\n\016Cre"
          + "ateDataScan\022/.google.cloud.dataplex.v1.C"
          + "reateDataScanRequest\032\035.google.longrunnin"
          + "g.Operation\"\200\001\312A\035\n\010DataScan\022\021OperationMe"
          + "tadata\332A\035parent,data_scan,data_scan_id\202\323"
          + "\344\223\002:\"-/v1/{parent=projects/*/locations/*"
          + "}/dataScans:\tdata_scan\022\345\001\n\016UpdateDataSca"
          + "n\022/.google.cloud.dataplex.v1.UpdateDataS"
          + "canRequest\032\035.google.longrunning.Operatio"
          + "n\"\202\001\312A\035\n\010DataScan\022\021OperationMetadata\332A\025d"
          + "ata_scan,update_mask\202\323\344\223\002D27/v1/{data_sc"
          + "an.name=projects/*/locations/*/dataScans"
          + "/*}:\tdata_scan\022\313\001\n\016DeleteDataScan\022/.goog"
          + "le.cloud.dataplex.v1.DeleteDataScanReque"
          + "st\032\035.google.longrunning.Operation\"i\312A*\n\025"
          + "google.protobuf.Empty\022\021OperationMetadata"
          + "\332A\004name\202\323\344\223\002/*-/v1/{name=projects/*/loca"
          + "tions/*/dataScans/*}\022\235\001\n\013GetDataScan\022,.g"
          + "oogle.cloud.dataplex.v1.GetDataScanReque"
          + "st\032\".google.cloud.dataplex.v1.DataScan\"<"
          + "\332A\004name\202\323\344\223\002/\022-/v1/{name=projects/*/loca"
          + "tions/*/dataScans/*}\022\260\001\n\rListDataScans\022."
          + ".google.cloud.dataplex.v1.ListDataScansR"
          + "equest\032/.google.cloud.dataplex.v1.ListDa"
          + "taScansResponse\">\332A\006parent\202\323\344\223\002/\022-/v1/{p"
          + "arent=projects/*/locations/*}/dataScans\022"
          + "\257\001\n\013RunDataScan\022,.google.cloud.dataplex."
          + "v1.RunDataScanRequest\032-.google.cloud.dat"
          + "aplex.v1.RunDataScanResponse\"C\332A\004name\202\323\344"
          + "\223\0026\"1/v1/{name=projects/*/locations/*/da"
          + "taScans/*}:run:\001*\022\255\001\n\016GetDataScanJob\022/.g"
          + "oogle.cloud.dataplex.v1.GetDataScanJobRe"
          + "quest\032%.google.cloud.dataplex.v1.DataSca"
          + "nJob\"C\332A\004name\202\323\344\223\0026\0224/v1/{name=projects/"
          + "*/locations/*/dataScans/*/jobs/*}\022\300\001\n\020Li"
          + "stDataScanJobs\0221.google.cloud.dataplex.v"
          + "1.ListDataScanJobsRequest\0322.google.cloud"
          + ".dataplex.v1.ListDataScanJobsResponse\"E\332"
          + "A\006parent\202\323\344\223\0026\0224/v1/{parent=projects/*/l"
          + "ocations/*/dataScans/*}/jobs\032K\312A\027dataple"
          + "x.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformBj\n\034com.google."
          + "cloud.dataplex.v1B\016DataScansProtoP\001Z8clo"
          + "ud.google.com/go/dataplex/apiv1/dataplex"
          + "pb;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.DataProfileProto.getDescriptor(),
              com.google.cloud.dataplex.v1.DataQualityProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ServiceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_CreateDataScanRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DataScan", "DataScanId", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_UpdateDataScanRequest_descriptor,
            new java.lang.String[] {
              "DataScan", "UpdateMask", "ValidateOnly",
            });
    internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DeleteDataScanRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_GetDataScanRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetDataScanRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_ListDataScansRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListDataScansRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataplex_v1_ListDataScansResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListDataScansResponse_descriptor,
            new java.lang.String[] {
              "DataScans", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataplex_v1_RunDataScanRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_RunDataScanRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataplex_v1_RunDataScanResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_RunDataScanResponse_descriptor,
            new java.lang.String[] {
              "Job",
            });
    internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_GetDataScanJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListDataScanJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_ListDataScanJobsResponse_descriptor,
            new java.lang.String[] {
              "DataScanJobs", "NextPageToken",
            });
    internal_static_google_cloud_dataplex_v1_DataScan_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dataplex_v1_DataScan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScan_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Description",
              "DisplayName",
              "Labels",
              "State",
              "CreateTime",
              "UpdateTime",
              "Data",
              "ExecutionSpec",
              "ExecutionStatus",
              "Type",
              "DataQualitySpec",
              "DataProfileSpec",
              "DataQualityResult",
              "DataProfileResult",
              "Spec",
              "Result",
            });
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScan_ExecutionSpec_descriptor,
            new java.lang.String[] {
              "Trigger", "Field", "Incremental",
            });
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScan_ExecutionStatus_descriptor,
            new java.lang.String[] {
              "LatestJobStartTime", "LatestJobEndTime",
            });
    internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor =
        internal_static_google_cloud_dataplex_v1_DataScan_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScan_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dataplex_v1_DataScanJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataScanJob_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "StartTime",
              "EndTime",
              "State",
              "Message",
              "Type",
              "DataQualitySpec",
              "DataProfileSpec",
              "DataQualityResult",
              "DataProfileResult",
              "Spec",
              "Result",
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
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataplex.v1.DataProfileProto.getDescriptor();
    com.google.cloud.dataplex.v1.DataQualityProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
    com.google.cloud.dataplex.v1.ResourcesProto.getDescriptor();
    com.google.cloud.dataplex.v1.ServiceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
