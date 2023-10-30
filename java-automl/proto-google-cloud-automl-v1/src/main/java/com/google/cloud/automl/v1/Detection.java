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
// source: google/cloud/automl/v1/detection.proto

package com.google.cloud.automl.v1;

public final class Detection {
  private Detection() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageObjectDetectionAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageObjectDetectionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ImageObjectDetectionEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ImageObjectDetectionEvaluationMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/automl/v1/detection.proto"
          + "\022\026google.cloud.automl.v1\032%google/cloud/a"
          + "utoml/v1/geometry.proto\"k\n\036ImageObjectDe"
          + "tectionAnnotation\022:\n\014bounding_box\030\001 \001(\0132"
          + "$.google.cloud.automl.v1.BoundingPoly\022\r\n"
          + "\005score\030\002 \001(\002\"\251\002\n\027BoundingBoxMetricsEntry"
          + "\022\025\n\riou_threshold\030\001 \001(\002\022\036\n\026mean_average_"
          + "precision\030\002 \001(\002\022j\n\032confidence_metrics_en"
          + "tries\030\003 \003(\0132F.google.cloud.automl.v1.Bou"
          + "ndingBoxMetricsEntry.ConfidenceMetricsEn"
          + "try\032k\n\026ConfidenceMetricsEntry\022\034\n\024confide"
          + "nce_threshold\030\001 \001(\002\022\016\n\006recall\030\002 \001(\002\022\021\n\tp"
          + "recision\030\003 \001(\002\022\020\n\010f1_score\030\004 \001(\002\"\321\001\n%Ima"
          + "geObjectDetectionEvaluationMetrics\022$\n\034ev"
          + "aluated_bounding_box_count\030\001 \001(\005\022U\n\034boun"
          + "ding_box_metrics_entries\030\002 \003(\0132/.google."
          + "cloud.automl.v1.BoundingBoxMetricsEntry\022"
          + "+\n#bounding_box_mean_average_precision\030\003"
          + " \001(\002B\240\001\n\032com.google.cloud.automl.v1P\001Z2c"
          + "loud.google.com/go/automl/apiv1/automlpb"
          + ";automlpb\252\002\026Google.Cloud.AutoML.V1\312\002\026Goo"
          + "gle\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::Aut"
          + "oML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1.Geometry.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_ImageObjectDetectionAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_ImageObjectDetectionAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageObjectDetectionAnnotation_descriptor,
            new java.lang.String[] {
              "BoundingBox", "Score",
            });
    internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_descriptor,
            new java.lang.String[] {
              "IouThreshold", "MeanAveragePrecision", "ConfidenceMetricsEntries",
            });
    internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor =
        internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_BoundingBoxMetricsEntry_ConfidenceMetricsEntry_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold", "Recall", "Precision", "F1Score",
            });
    internal_static_google_cloud_automl_v1_ImageObjectDetectionEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1_ImageObjectDetectionEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ImageObjectDetectionEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "EvaluatedBoundingBoxCount",
              "BoundingBoxMetricsEntries",
              "BoundingBoxMeanAveragePrecision",
            });
    com.google.cloud.automl.v1.Geometry.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
