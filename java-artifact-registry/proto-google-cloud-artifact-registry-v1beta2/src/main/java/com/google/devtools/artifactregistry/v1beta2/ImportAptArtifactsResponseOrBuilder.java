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
// source: google/devtools/artifactregistry/v1beta2/apt_artifact.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface ImportAptArtifactsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Apt artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.AptArtifact apt_artifacts = 1;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.AptArtifact> getAptArtifactsList();
  /**
   *
   *
   * <pre>
   * The Apt artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.AptArtifact apt_artifacts = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.AptArtifact getAptArtifacts(int index);
  /**
   *
   *
   * <pre>
   * The Apt artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.AptArtifact apt_artifacts = 1;</code>
   */
  int getAptArtifactsCount();
  /**
   *
   *
   * <pre>
   * The Apt artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.AptArtifact apt_artifacts = 1;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.AptArtifactOrBuilder>
      getAptArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Apt artifacts imported.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.AptArtifact apt_artifacts = 1;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.AptArtifactOrBuilder getAptArtifactsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Detailed error info for artifacts that were not imported.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo errors = 2;
   * </code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo>
      getErrorsList();
  /**
   *
   *
   * <pre>
   * Detailed error info for artifacts that were not imported.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo errors = 2;
   * </code>
   */
  com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo getErrors(int index);
  /**
   *
   *
   * <pre>
   * Detailed error info for artifacts that were not imported.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo errors = 2;
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Detailed error info for artifacts that were not imported.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo errors = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfoOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Detailed error info for artifacts that were not imported.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfo errors = 2;
   * </code>
   */
  com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsErrorInfoOrBuilder
      getErrorsOrBuilder(int index);
}
