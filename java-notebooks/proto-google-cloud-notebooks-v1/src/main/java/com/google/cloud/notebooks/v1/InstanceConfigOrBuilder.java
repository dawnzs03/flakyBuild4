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
// source: google/cloud/notebooks/v1/instance_config.proto

package com.google.cloud.notebooks.v1;

public interface InstanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.InstanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cron expression in UTC timezone, used to schedule instance auto upgrade.
   * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
   * </pre>
   *
   * <code>string notebook_upgrade_schedule = 1;</code>
   *
   * @return The notebookUpgradeSchedule.
   */
  java.lang.String getNotebookUpgradeSchedule();
  /**
   *
   *
   * <pre>
   * Cron expression in UTC timezone, used to schedule instance auto upgrade.
   * Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
   * </pre>
   *
   * <code>string notebook_upgrade_schedule = 1;</code>
   *
   * @return The bytes for notebookUpgradeSchedule.
   */
  com.google.protobuf.ByteString getNotebookUpgradeScheduleBytes();

  /**
   *
   *
   * <pre>
   * Verifies core internal services are running.
   * </pre>
   *
   * <code>bool enable_health_monitoring = 2;</code>
   *
   * @return The enableHealthMonitoring.
   */
  boolean getEnableHealthMonitoring();
}
