/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.monitoring.v3.samples;

// [START monitoring_v3_generated_ServiceMonitoringService_CreateServiceLevelObjective_StringServicelevelobjective_sync]
import com.google.cloud.monitoring.v3.ServiceMonitoringServiceClient;
import com.google.monitoring.v3.ServiceLevelObjective;
import com.google.monitoring.v3.ServiceName;

public class SyncCreateServiceLevelObjectiveStringServicelevelobjective {

  public static void main(String[] args) throws Exception {
    syncCreateServiceLevelObjectiveStringServicelevelobjective();
  }

  public static void syncCreateServiceLevelObjectiveStringServicelevelobjective() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceMonitoringServiceClient serviceMonitoringServiceClient =
        ServiceMonitoringServiceClient.create()) {
      String parent = ServiceName.ofProjectServiceName("[PROJECT]", "[SERVICE]").toString();
      ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
      ServiceLevelObjective response =
          serviceMonitoringServiceClient.createServiceLevelObjective(parent, serviceLevelObjective);
    }
  }
}
// [END monitoring_v3_generated_ServiceMonitoringService_CreateServiceLevelObjective_StringServicelevelobjective_sync]
