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
// source: google/api/servicecontrol/v1/service_controller.proto

package com.google.api.servicecontrol.v1;

public interface ReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.ReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See
   * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
   * for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See
   * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
   * for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Operations to be reported.
   *
   * Typically the service should report one operation per request.
   * Putting multiple operations into a single request is allowed, but should
   * be used only when multiple operations are natually available at the time
   * of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest,
   * however the ReportRequest size should be no larger than 1MB. See
   * [ReportResponse.report_errors][google.api.servicecontrol.v1.ReportResponse.report_errors]
   * for partial failure behavior.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.Operation operations = 2;</code>
   */
  java.util.List<com.google.api.servicecontrol.v1.Operation> getOperationsList();
  /**
   *
   *
   * <pre>
   * Operations to be reported.
   *
   * Typically the service should report one operation per request.
   * Putting multiple operations into a single request is allowed, but should
   * be used only when multiple operations are natually available at the time
   * of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest,
   * however the ReportRequest size should be no larger than 1MB. See
   * [ReportResponse.report_errors][google.api.servicecontrol.v1.ReportResponse.report_errors]
   * for partial failure behavior.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.Operation operations = 2;</code>
   */
  com.google.api.servicecontrol.v1.Operation getOperations(int index);
  /**
   *
   *
   * <pre>
   * Operations to be reported.
   *
   * Typically the service should report one operation per request.
   * Putting multiple operations into a single request is allowed, but should
   * be used only when multiple operations are natually available at the time
   * of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest,
   * however the ReportRequest size should be no larger than 1MB. See
   * [ReportResponse.report_errors][google.api.servicecontrol.v1.ReportResponse.report_errors]
   * for partial failure behavior.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.Operation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   *
   *
   * <pre>
   * Operations to be reported.
   *
   * Typically the service should report one operation per request.
   * Putting multiple operations into a single request is allowed, but should
   * be used only when multiple operations are natually available at the time
   * of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest,
   * however the ReportRequest size should be no larger than 1MB. See
   * [ReportResponse.report_errors][google.api.servicecontrol.v1.ReportResponse.report_errors]
   * for partial failure behavior.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.Operation operations = 2;</code>
   */
  java.util.List<? extends com.google.api.servicecontrol.v1.OperationOrBuilder>
      getOperationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Operations to be reported.
   *
   * Typically the service should report one operation per request.
   * Putting multiple operations into a single request is allowed, but should
   * be used only when multiple operations are natually available at the time
   * of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest,
   * however the ReportRequest size should be no larger than 1MB. See
   * [ReportResponse.report_errors][google.api.servicecontrol.v1.ReportResponse.report_errors]
   * for partial failure behavior.
   * </pre>
   *
   * <code>repeated .google.api.servicecontrol.v1.Operation operations = 2;</code>
   */
  com.google.api.servicecontrol.v1.OperationOrBuilder getOperationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies which version of service config should be used to process the
   * request.
   *
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>string service_config_id = 3;</code>
   *
   * @return The serviceConfigId.
   */
  java.lang.String getServiceConfigId();
  /**
   *
   *
   * <pre>
   * Specifies which version of service config should be used to process the
   * request.
   *
   * If unspecified or no matching version can be found, the
   * latest one will be used.
   * </pre>
   *
   * <code>string service_config_id = 3;</code>
   *
   * @return The bytes for serviceConfigId.
   */
  com.google.protobuf.ByteString getServiceConfigIdBytes();
}
