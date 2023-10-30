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

package com.google.cloud.alloydb.v1.samples;

// [START alloydb_v1_generated_AlloyDBAdmin_CreateSecondaryCluster_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.alloydb.v1.AlloyDBAdminClient;
import com.google.cloud.alloydb.v1.Cluster;
import com.google.cloud.alloydb.v1.CreateSecondaryClusterRequest;
import com.google.cloud.alloydb.v1.LocationName;
import com.google.longrunning.Operation;

public class AsyncCreateSecondaryCluster {

  public static void main(String[] args) throws Exception {
    asyncCreateSecondaryCluster();
  }

  public static void asyncCreateSecondaryCluster() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlloyDBAdminClient alloyDBAdminClient = AlloyDBAdminClient.create()) {
      CreateSecondaryClusterRequest request =
          CreateSecondaryClusterRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setClusterId("clusterId561939637")
              .setCluster(Cluster.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .build();
      ApiFuture<Operation> future =
          alloyDBAdminClient.createSecondaryClusterCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END alloydb_v1_generated_AlloyDBAdmin_CreateSecondaryCluster_async]
