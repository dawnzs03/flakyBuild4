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

public interface CloudRepoSourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.source.v1.CloudRepoSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the repo.
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
   * The ID of the repo.
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
   * The ID of the repo.
   * </pre>
   *
   * <code>.google.devtools.source.v1.RepoId repo_id = 1;</code>
   */
  com.google.devtools.source.v1.RepoIdOrBuilder getRepoIdOrBuilder();

  /**
   *
   *
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return Whether the revisionId field is set.
   */
  boolean hasRevisionId();
  /**
   *
   *
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * The name of an alias (branch, tag, etc.).
   * </pre>
   *
   * <code>string alias_name = 3 [deprecated = true];</code>
   *
   * @deprecated google.devtools.source.v1.CloudRepoSourceContext.alias_name is deprecated. See
   *     google/devtools/source/v1/source_context.proto;l=95
   * @return Whether the aliasName field is set.
   */
  @java.lang.Deprecated
  boolean hasAliasName();
  /**
   *
   *
   * <pre>
   * The name of an alias (branch, tag, etc.).
   * </pre>
   *
   * <code>string alias_name = 3 [deprecated = true];</code>
   *
   * @deprecated google.devtools.source.v1.CloudRepoSourceContext.alias_name is deprecated. See
   *     google/devtools/source/v1/source_context.proto;l=95
   * @return The aliasName.
   */
  @java.lang.Deprecated
  java.lang.String getAliasName();
  /**
   *
   *
   * <pre>
   * The name of an alias (branch, tag, etc.).
   * </pre>
   *
   * <code>string alias_name = 3 [deprecated = true];</code>
   *
   * @deprecated google.devtools.source.v1.CloudRepoSourceContext.alias_name is deprecated. See
   *     google/devtools/source/v1/source_context.proto;l=95
   * @return The bytes for aliasName.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getAliasNameBytes();

  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.source.v1.AliasContext alias_context = 4;</code>
   *
   * @return Whether the aliasContext field is set.
   */
  boolean hasAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.source.v1.AliasContext alias_context = 4;</code>
   *
   * @return The aliasContext.
   */
  com.google.devtools.source.v1.AliasContext getAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.source.v1.AliasContext alias_context = 4;</code>
   */
  com.google.devtools.source.v1.AliasContextOrBuilder getAliasContextOrBuilder();

  com.google.devtools.source.v1.CloudRepoSourceContext.RevisionCase getRevisionCase();
}
