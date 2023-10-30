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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ListReplicationCyclesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ListReplicationCyclesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The list of replication cycles response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmmigration.v1.ReplicationCycle replication_cycles = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.vmmigration.v1.ReplicationCycle> getReplicationCyclesList();
  /**
   *
   *
   * <pre>
   * Output only. The list of replication cycles response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmmigration.v1.ReplicationCycle replication_cycles = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmmigration.v1.ReplicationCycle getReplicationCycles(int index);
  /**
   *
   *
   * <pre>
   * Output only. The list of replication cycles response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmmigration.v1.ReplicationCycle replication_cycles = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getReplicationCyclesCount();
  /**
   *
   *
   * <pre>
   * Output only. The list of replication cycles response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmmigration.v1.ReplicationCycle replication_cycles = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vmmigration.v1.ReplicationCycleOrBuilder>
      getReplicationCyclesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The list of replication cycles response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vmmigration.v1.ReplicationCycle replication_cycles = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.vmmigration.v1.ReplicationCycleOrBuilder getReplicationCyclesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. A token, which can be sent as `page_token` to retrieve the
   * next page. If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Output only. A token, which can be sent as `page_token` to retrieve the
   * next page. If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Output only. Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
