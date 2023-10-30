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
// source: google/devtools/source/v1/source_context.proto

package com.google.devtools.source.v1;

public interface CloudWorkspaceIdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.source.v1.CloudWorkspaceId)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the repo containing the workspace.
   * </pre>
   *
   * <code>.google.devtools.source.v1.RepoId repo_id = 1;</code>
   *
   * @return Whether the repoId field is set.
   */
  boolean hasRepoId();
  /**
   *
   *
   * <pre>
   * The ID of the repo containing the workspace.
   * </pre>
   *
   * <code>.google.devtools.source.v1.RepoId repo_id = 1;</code>
   *
   * @return The repoId.
   */
  com.google.devtools.source.v1.RepoId getRepoId();
  /**
   *
   *
   * <pre>
   * The ID of the repo containing the workspace.
   * </pre>
   *
   * <code>.google.devtools.source.v1.RepoId repo_id = 1;</code>
   */
  com.google.devtools.source.v1.RepoIdOrBuilder getRepoIdOrBuilder();

  /**
   *
   *
   * <pre>
   * The unique name of the workspace within the repo.  This is the name
   * chosen by the client in the Source API's CreateWorkspace method.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique name of the workspace within the repo.  This is the name
   * chosen by the client in the Source API's CreateWorkspace method.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
