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
// source: google/cloud/retail/v2alpha/serving_config.proto

package com.google.cloud.retail.v2alpha;

public final class ServingConfigProto {
  private ServingConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ServingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/retail/v2alpha/serving_co"
          + "nfig.proto\022\033google.cloud.retail.v2alpha\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032(google/cloud/retail"
          + "/v2alpha/common.proto\0320google/cloud/reta"
          + "il/v2alpha/search_service.proto\"\215\010\n\rServ"
          + "ingConfig\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\032\n\014display"
          + "_name\030\002 \001(\tB\004\342A\001\002\022\020\n\010model_id\030\003 \001(\t\022\035\n\025p"
          + "rice_reranking_level\030\004 \001(\t\022\031\n\021facet_cont"
          + "rol_ids\030\005 \003(\t\022W\n\022dynamic_facet_spec\030\006 \001("
          + "\0132;.google.cloud.retail.v2alpha.SearchRe"
          + "quest.DynamicFacetSpec\022\031\n\021boost_control_"
          + "ids\030\007 \003(\t\022\032\n\022filter_control_ids\030\t \003(\t\022\034\n"
          + "\024redirect_control_ids\030\n \003(\t\022#\n\033twoway_sy"
          + "nonyms_control_ids\030\022 \003(\t\022#\n\033oneway_synon"
          + "yms_control_ids\030\014 \003(\t\022$\n\034do_not_associat"
          + "e_control_ids\030\r \003(\t\022\037\n\027replacement_contr"
          + "ol_ids\030\016 \003(\t\022\032\n\022ignore_control_ids\030\017 \003(\t"
          + "\022\027\n\017diversity_level\030\010 \001(\t\022P\n\016diversity_t"
          + "ype\030\024 \001(\01628.google.cloud.retail.v2alpha."
          + "ServingConfig.DiversityType\022$\n\034enable_ca"
          + "tegory_filter_level\030\020 \001(\t\022\\\n\024personaliza"
          + "tion_spec\030\025 \001(\0132>.google.cloud.retail.v2"
          + "alpha.SearchRequest.PersonalizationSpec\022"
          + "H\n\016solution_types\030\023 \003(\0162).google.cloud.r"
          + "etail.v2alpha.SolutionTypeB\005\342A\002\002\005\"d\n\rDiv"
          + "ersityType\022\036\n\032DIVERSITY_TYPE_UNSPECIFIED"
          + "\020\000\022\030\n\024RULE_BASED_DIVERSITY\020\002\022\031\n\025DATA_DRI"
          + "VEN_DIVERSITY\020\003:\205\001\352A\201\001\n#retail.googleapi"
          + "s.com/ServingConfig\022Zprojects/{project}/"
          + "locations/{location}/catalogs/{catalog}/"
          + "servingConfigs/{serving_config}B\326\001\n\037com."
          + "google.cloud.retail.v2alphaB\022ServingConf"
          + "igProtoP\001Z7cloud.google.com/go/retail/ap"
          + "iv2alpha/retailpb;retailpb\242\002\006RETAIL\252\002\033Go"
          + "ogle.Cloud.Retail.V2Alpha\312\002\033Google\\Cloud"
          + "\\Retail\\V2alpha\352\002\036Google::Cloud::Retail:"
          + ":V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_ServingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ServingConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "ModelId",
              "PriceRerankingLevel",
              "FacetControlIds",
              "DynamicFacetSpec",
              "BoostControlIds",
              "FilterControlIds",
              "RedirectControlIds",
              "TwowaySynonymsControlIds",
              "OnewaySynonymsControlIds",
              "DoNotAssociateControlIds",
              "ReplacementControlIds",
              "IgnoreControlIds",
              "DiversityLevel",
              "DiversityType",
              "EnableCategoryFilterLevel",
              "PersonalizationSpec",
              "SolutionTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.CommonProto.getDescriptor();
    com.google.cloud.retail.v2alpha.SearchServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
