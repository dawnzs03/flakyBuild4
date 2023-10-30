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
// source: google/cloud/aiplatform/v1beta1/pipeline_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class Pipeline {
  private Pipeline() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifactsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTemplateMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTemplateMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_PipelineTaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_job.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032.google/cloud/"
          + "aiplatform/v1beta1/artifact.proto\032-googl"
          + "e/cloud/aiplatform/v1beta1/context.proto"
          + "\0325google/cloud/aiplatform/v1beta1/encryp"
          + "tion_spec.proto\032/google/cloud/aiplatform"
          + "/v1beta1/execution.proto\032=google/cloud/a"
          + "iplatform/v1beta1/pipeline_failure_polic"
          + "y.proto\0324google/cloud/aiplatform/v1beta1"
          + "/pipeline_state.proto\032+google/cloud/aipl"
          + "atform/v1beta1/value.proto\032\034google/proto"
          + "buf/struct.proto\032\037google/protobuf/timest"
          + "amp.proto\032\027google/rpc/status.proto\"\372\016\n\013P"
          + "ipelineJob\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\024\n\014displa"
          + "y_name\030\002 \001(\t\0225\n\013create_time\030\003 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\004\342A\001\003\0224\n\nstart_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\003\0222\n\010end_time\030\005 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\004\342A\001\003\0225\n\013update_time\030\006 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022.\n\rpipeline"
          + "_spec\030\007 \001(\0132\027.google.protobuf.Struct\022C\n\005"
          + "state\030\010 \001(\0162..google.cloud.aiplatform.v1"
          + "beta1.PipelineStateB\004\342A\001\003\022L\n\njob_detail\030"
          + "\t \001(\01322.google.cloud.aiplatform.v1beta1."
          + "PipelineJobDetailB\004\342A\001\003\022\'\n\005error\030\n \001(\0132\022"
          + ".google.rpc.StatusB\004\342A\001\003\022H\n\006labels\030\013 \003(\013"
          + "28.google.cloud.aiplatform.v1beta1.Pipel"
          + "ineJob.LabelsEntry\022R\n\016runtime_config\030\014 \001"
          + "(\0132:.google.cloud.aiplatform.v1beta1.Pip"
          + "elineJob.RuntimeConfig\022H\n\017encryption_spe"
          + "c\030\020 \001(\0132/.google.cloud.aiplatform.v1beta"
          + "1.EncryptionSpec\022\027\n\017service_account\030\021 \001("
          + "\t\0224\n\007network\030\022 \001(\tB#\372A \n\036compute.googlea"
          + "pis.com/Network\022\032\n\022reserved_ip_ranges\030\031 "
          + "\003(\t\022\024\n\014template_uri\030\023 \001(\t\022Z\n\021template_me"
          + "tadata\030\024 \001(\01329.google.cloud.aiplatform.v"
          + "1beta1.PipelineTemplateMetadataB\004\342A\001\003\032\227\006"
          + "\n\rRuntimeConfig\022b\n\nparameters\030\001 \003(\0132J.go"
          + "ogle.cloud.aiplatform.v1beta1.PipelineJo"
          + "b.RuntimeConfig.ParametersEntryB\002\030\001\022\"\n\024g"
          + "cs_output_directory\030\002 \001(\tB\004\342A\001\002\022i\n\020param"
          + "eter_values\030\003 \003(\0132O.google.cloud.aiplatf"
          + "orm.v1beta1.PipelineJob.RuntimeConfig.Pa"
          + "rameterValuesEntry\022N\n\016failure_policy\030\004 \001"
          + "(\01626.google.cloud.aiplatform.v1beta1.Pip"
          + "elineFailurePolicy\022g\n\017input_artifacts\030\005 "
          + "\003(\0132N.google.cloud.aiplatform.v1beta1.Pi"
          + "pelineJob.RuntimeConfig.InputArtifactsEn"
          + "try\032.\n\rInputArtifact\022\025\n\013artifact_id\030\001 \001("
          + "\tH\000B\006\n\004kind\032Y\n\017ParametersEntry\022\013\n\003key\030\001 "
          + "\001(\t\0225\n\005value\030\002 \001(\0132&.google.cloud.aiplat"
          + "form.v1beta1.Value:\0028\001\032N\n\024ParameterValue"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.goo"
          + "gle.protobuf.Value:\0028\001\032\177\n\023InputArtifacts"
          + "Entry\022\013\n\003key\030\001 \001(\t\022W\n\005value\030\002 \001(\0132H.goog"
          + "le.cloud.aiplatform.v1beta1.PipelineJob."
          + "RuntimeConfig.InputArtifact:\0028\001\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:o"
          + "\352Al\n%aiplatform.googleapis.com/PipelineJ"
          + "ob\022Cprojects/{project}/locations/{locati"
          + "on}/pipelineJobs/{pipeline_job}\"+\n\030Pipel"
          + "ineTemplateMetadata\022\017\n\007version\030\003 \001(\t\"\374\001\n"
          + "\021PipelineJobDetail\022H\n\020pipeline_context\030\001"
          + " \001(\0132(.google.cloud.aiplatform.v1beta1.C"
          + "ontextB\004\342A\001\003\022L\n\024pipeline_run_context\030\002 \001"
          + "(\0132(.google.cloud.aiplatform.v1beta1.Con"
          + "textB\004\342A\001\003\022O\n\014task_details\030\003 \003(\01323.googl"
          + "e.cloud.aiplatform.v1beta1.PipelineTaskD"
          + "etailB\004\342A\001\003\"\340\013\n\022PipelineTaskDetail\022\025\n\007ta"
          + "sk_id\030\001 \001(\003B\004\342A\001\003\022\034\n\016parent_task_id\030\014 \001("
          + "\003B\004\342A\001\003\022\027\n\ttask_name\030\002 \001(\tB\004\342A\001\003\0225\n\013crea"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0224\n\nstart_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\004\342A\001\003\0222\n\010end_time\030\005 \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\022Z\n\017exe"
          + "cutor_detail\030\006 \001(\0132;.google.cloud.aiplat"
          + "form.v1beta1.PipelineTaskExecutorDetailB"
          + "\004\342A\001\003\022N\n\005state\030\007 \001(\01629.google.cloud.aipl"
          + "atform.v1beta1.PipelineTaskDetail.StateB"
          + "\004\342A\001\003\022C\n\texecution\030\010 \001(\0132*.google.cloud."
          + "aiplatform.v1beta1.ExecutionB\004\342A\001\003\022\'\n\005er"
          + "ror\030\t \001(\0132\022.google.rpc.StatusB\004\342A\001\003\022j\n\024p"
          + "ipeline_task_status\030\r \003(\0132F.google.cloud"
          + ".aiplatform.v1beta1.PipelineTaskDetail.P"
          + "ipelineTaskStatusB\004\342A\001\003\022U\n\006inputs\030\n \003(\0132"
          + "?.google.cloud.aiplatform.v1beta1.Pipeli"
          + "neTaskDetail.InputsEntryB\004\342A\001\003\022W\n\007output"
          + "s\030\013 \003(\0132@.google.cloud.aiplatform.v1beta"
          + "1.PipelineTaskDetail.OutputsEntryB\004\342A\001\003\032"
          + "\304\001\n\022PipelineTaskStatus\0225\n\013update_time\030\001 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022N\n"
          + "\005state\030\002 \001(\01629.google.cloud.aiplatform.v"
          + "1beta1.PipelineTaskDetail.StateB\004\342A\001\003\022\'\n"
          + "\005error\030\003 \001(\0132\022.google.rpc.StatusB\004\342A\001\003\032R"
          + "\n\014ArtifactList\022B\n\tartifacts\030\001 \003(\0132).goog"
          + "le.cloud.aiplatform.v1beta1.ArtifactB\004\342A"
          + "\001\003\032o\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022O\n\005value\030"
          + "\002 \001(\0132@.google.cloud.aiplatform.v1beta1."
          + "PipelineTaskDetail.ArtifactList:\0028\001\032p\n\014O"
          + "utputsEntry\022\013\n\003key\030\001 \001(\t\022O\n\005value\030\002 \001(\0132"
          + "@.google.cloud.aiplatform.v1beta1.Pipeli"
          + "neTaskDetail.ArtifactList:\0028\001\"\246\001\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007R"
          + "UNNING\020\002\022\r\n\tSUCCEEDED\020\003\022\022\n\016CANCEL_PENDIN"
          + "G\020\004\022\016\n\nCANCELLING\020\005\022\r\n\tCANCELLED\020\006\022\n\n\006FA"
          + "ILED\020\007\022\013\n\007SKIPPED\020\010\022\021\n\rNOT_TRIGGERED\020\t\"\335"
          + "\004\n\032PipelineTaskExecutorDetail\022m\n\020contain"
          + "er_detail\030\001 \001(\0132K.google.cloud.aiplatfor"
          + "m.v1beta1.PipelineTaskExecutorDetail.Con"
          + "tainerDetailB\004\342A\001\003H\000\022n\n\021custom_job_detai"
          + "l\030\002 \001(\0132K.google.cloud.aiplatform.v1beta"
          + "1.PipelineTaskExecutorDetail.CustomJobDe"
          + "tailB\004\342A\001\003H\000\032\353\001\n\017ContainerDetail\022>\n\010main"
          + "_job\030\001 \001(\tB,\342A\001\003\372A%\n#aiplatform.googleap"
          + "is.com/CustomJob\022K\n\025pre_caching_check_jo"
          + "b\030\002 \001(\tB,\342A\001\003\372A%\n#aiplatform.googleapis."
          + "com/CustomJob\022\036\n\020failed_main_jobs\030\003 \003(\tB"
          + "\004\342A\001\003\022+\n\035failed_pre_caching_check_jobs\030\004"
          + " \003(\tB\004\342A\001\003\032g\n\017CustomJobDetail\0229\n\003job\030\001 \001"
          + "(\tB,\342A\001\003\372A%\n#aiplatform.googleapis.com/C"
          + "ustomJob\022\031\n\013failed_jobs\030\003 \003(\tB\004\342A\001\003B\t\n\007d"
          + "etailsB\260\002\n#com.google.cloud.aiplatform.v"
          + "1beta1B\010PipelineP\001ZCcloud.google.com/go/"
          + "aiplatform/apiv1beta1/aiplatformpb;aipla"
          + "tformpb\252\002\037Google.Cloud.AIPlatform.V1Beta"
          + "1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Go"
          + "ogle::Cloud::AIPlatform::V1beta1\352AN\n\036com"
          + "pute.googleapis.com/Network\022,projects/{p"
          + "roject}/global/networks/{network}b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ContextProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineFailurePolicyProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "PipelineSpec",
              "State",
              "JobDetail",
              "Error",
              "Labels",
              "RuntimeConfig",
              "EncryptionSpec",
              "ServiceAccount",
              "Network",
              "ReservedIpRanges",
              "TemplateUri",
              "TemplateMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "Parameters",
              "GcsOutputDirectory",
              "ParameterValues",
              "FailurePolicy",
              "InputArtifacts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifact_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifact_descriptor,
            new java.lang.String[] {
              "ArtifactId", "Kind",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifactsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTemplateMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTemplateMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTemplateMetadata_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineJobDetail_descriptor,
            new java.lang.String[] {
              "PipelineContext", "PipelineRunContext", "TaskDetails",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor,
            new java.lang.String[] {
              "TaskId",
              "ParentTaskId",
              "TaskName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "ExecutorDetail",
              "State",
              "Execution",
              "Error",
              "PipelineTaskStatus",
              "Inputs",
              "Outputs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_PipelineTaskStatus_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_PipelineTaskStatus_descriptor,
            new java.lang.String[] {
              "UpdateTime", "State", "Error",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_ArtifactList_descriptor,
            new java.lang.String[] {
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskDetail_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor,
            new java.lang.String[] {
              "ContainerDetail", "CustomJobDetail", "Details",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_ContainerDetail_descriptor,
            new java.lang.String[] {
              "MainJob", "PreCachingCheckJob", "FailedMainJobs", "FailedPreCachingCheckJobs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor,
            new java.lang.String[] {
              "Job", "FailedJobs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ContextProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineFailurePolicyProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PipelineStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
