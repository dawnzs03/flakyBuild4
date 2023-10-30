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
// source: google/cloud/osconfig/v1alpha/config_common.proto

package com.google.cloud.osconfig.v1alpha;

public final class ConfigCommonProto {
  private ConfigCommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceConfigStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceConfigStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_ExecResourceOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/osconfig/v1alpha/config_c"
          + "ommon.proto\022\035google.cloud.osconfig.v1alp"
          + "ha\"\261\003\n\032OSPolicyResourceConfigStep\022L\n\004typ"
          + "e\030\001 \001(\0162>.google.cloud.osconfig.v1alpha."
          + "OSPolicyResourceConfigStep.Type\022R\n\007outco"
          + "me\030\002 \001(\0162A.google.cloud.osconfig.v1alpha"
          + ".OSPolicyResourceConfigStep.Outcome\022\025\n\re"
          + "rror_message\030\003 \001(\t\"\222\001\n\004Type\022\024\n\020TYPE_UNSP"
          + "ECIFIED\020\000\022\016\n\nVALIDATION\020\001\022\027\n\023DESIRED_STA"
          + "TE_CHECK\020\002\022\035\n\031DESIRED_STATE_ENFORCEMENT\020"
          + "\003\022(\n$DESIRED_STATE_CHECK_POST_ENFORCEMEN"
          + "T\020\004\032\002\030\001\"A\n\007Outcome\022\027\n\023OUTCOME_UNSPECIFIE"
          + "D\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002\032\002\030\001:\002\030\001\"\205"
          + "\003\n\032OSPolicyResourceCompliance\022\035\n\025os_poli"
          + "cy_resource_id\030\001 \001(\t\022O\n\014config_steps\030\002 \003"
          + "(\01329.google.cloud.osconfig.v1alpha.OSPol"
          + "icyResourceConfigStep\022E\n\005state\030\003 \001(\01626.g"
          + "oogle.cloud.osconfig.v1alpha.OSPolicyCom"
          + "plianceState\022l\n\024exec_resource_output\030\004 \001"
          + "(\0132L.google.cloud.osconfig.v1alpha.OSPol"
          + "icyResourceCompliance.ExecResourceOutput"
          + "H\000\0324\n\022ExecResourceOutput\022\032\n\022enforcement_"
          + "output\030\002 \001(\014:\002\030\001:\002\030\001B\010\n\006output*\227\001\n\027OSPol"
          + "icyComplianceState\022*\n&OS_POLICY_COMPLIAN"
          + "CE_STATE_UNSPECIFIED\020\000\022\r\n\tCOMPLIANT\020\001\022\021\n"
          + "\rNON_COMPLIANT\020\002\022\013\n\007UNKNOWN\020\003\022\035\n\031NO_OS_P"
          + "OLICIES_APPLICABLE\020\004\032\002\030\001B\332\001\n!com.google."
          + "cloud.osconfig.v1alphaB\021ConfigCommonProt"
          + "oP\001Z=cloud.google.com/go/osconfig/apiv1a"
          + "lpha/osconfigpb;osconfigpb\252\002\035Google.Clou"
          + "d.OsConfig.V1Alpha\312\002\035Google\\Cloud\\OsConf"
          + "ig\\V1alpha\352\002 Google::Cloud::OsConfig::V1"
          + "alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceConfigStep_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceConfigStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceConfigStep_descriptor,
            new java.lang.String[] {
              "Type", "Outcome", "ErrorMessage",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_descriptor,
            new java.lang.String[] {
              "OsPolicyResourceId", "ConfigSteps", "State", "ExecResourceOutput", "Output",
            });
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_ExecResourceOutput_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_ExecResourceOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_OSPolicyResourceCompliance_ExecResourceOutput_descriptor,
            new java.lang.String[] {
              "EnforcementOutput",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
