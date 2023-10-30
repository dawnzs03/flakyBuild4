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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

public interface DiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.Disk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Size of disk in GB.  If zero or unspecified, the service will
   * attempt to choose a reasonable default.
   * </pre>
   *
   * <code>int32 size_gb = 1;</code>
   *
   * @return The sizeGb.
   */
  int getSizeGb();

  /**
   *
   *
   * <pre>
   * Disk storage type, as defined by Google Compute Engine.  This
   * must be a disk type appropriate to the project and zone in which
   * the workers will run.  If unknown or unspecified, the service
   * will attempt to choose a reasonable default.
   *
   * For example, the standard persistent disk type is a resource name
   * typically ending in "pd-standard".  If SSD persistent disks are
   * available, the resource name typically ends with "pd-ssd".  The
   * actual valid values are defined the Google Compute Engine API,
   * not by the Cloud Dataflow API; consult the Google Compute Engine
   * documentation for more information about determining the set of
   * available disk types for a particular project and zone.
   *
   * Google Compute Engine Disk types are local to a particular
   * project in a particular zone, and so the resource name will
   * typically look something like this:
   *
   * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
   * </pre>
   *
   * <code>string disk_type = 2;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Disk storage type, as defined by Google Compute Engine.  This
   * must be a disk type appropriate to the project and zone in which
   * the workers will run.  If unknown or unspecified, the service
   * will attempt to choose a reasonable default.
   *
   * For example, the standard persistent disk type is a resource name
   * typically ending in "pd-standard".  If SSD persistent disks are
   * available, the resource name typically ends with "pd-ssd".  The
   * actual valid values are defined the Google Compute Engine API,
   * not by the Cloud Dataflow API; consult the Google Compute Engine
   * documentation for more information about determining the set of
   * available disk types for a particular project and zone.
   *
   * Google Compute Engine Disk types are local to a particular
   * project in a particular zone, and so the resource name will
   * typically look something like this:
   *
   * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
   * </pre>
   *
   * <code>string disk_type = 2;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Directory in a VM where disk is mounted.
   * </pre>
   *
   * <code>string mount_point = 3;</code>
   *
   * @return The mountPoint.
   */
  java.lang.String getMountPoint();
  /**
   *
   *
   * <pre>
   * Directory in a VM where disk is mounted.
   * </pre>
   *
   * <code>string mount_point = 3;</code>
   *
   * @return The bytes for mountPoint.
   */
  com.google.protobuf.ByteString getMountPointBytes();
}
