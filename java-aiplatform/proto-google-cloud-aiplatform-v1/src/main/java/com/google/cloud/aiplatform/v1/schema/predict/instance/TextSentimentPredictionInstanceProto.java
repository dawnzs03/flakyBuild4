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
// source: google/cloud/aiplatform/v1/schema/predict/instance/text_sentiment.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class TextSentimentPredictionInstanceProto {
  private TextSentimentPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextSentimentPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextSentimentPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/text_sentiment.proto\0222googl"
          + "e.cloud.aiplatform.v1.schema.predict.ins"
          + "tance\"E\n\037TextSentimentPredictionInstance"
          + "\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\tB\331\002\n"
          + "6com.google.cloud.aiplatform.v1.schema.p"
          + "redict.instanceB$TextSentimentPrediction"
          + "InstanceProtoP\001ZRcloud.google.com/go/aip"
          + "latform/apiv1/schema/predict/instance/in"
          + "stancepb;instancepb\252\0022Google.Cloud.AIPla"
          + "tform.V1.Schema.Predict.Instance\312\0022Googl"
          + "e\\Cloud\\AIPlatform\\V1\\Schema\\Predict\\Ins"
          + "tance\352\0028Google::Cloud::AIPlatform::V1::S"
          + "chema::Predict::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextSentimentPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextSentimentPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextSentimentPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
