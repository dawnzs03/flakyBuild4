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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupsAddInstancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupsAddInstancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of instances to add to the instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceReference instances = 29097598;</code>
   */
  java.util.List<com.google.cloud.compute.v1.InstanceReference> getInstancesList();
  /**
   *
   *
   * <pre>
   * The list of instances to add to the instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceReference instances = 29097598;</code>
   */
  com.google.cloud.compute.v1.InstanceReference getInstances(int index);
  /**
   *
   *
   * <pre>
   * The list of instances to add to the instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceReference instances = 29097598;</code>
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * The list of instances to add to the instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceReference instances = 29097598;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InstanceReferenceOrBuilder>
      getInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of instances to add to the instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceReference instances = 29097598;</code>
   */
  com.google.cloud.compute.v1.InstanceReferenceOrBuilder getInstancesOrBuilder(int index);
}
