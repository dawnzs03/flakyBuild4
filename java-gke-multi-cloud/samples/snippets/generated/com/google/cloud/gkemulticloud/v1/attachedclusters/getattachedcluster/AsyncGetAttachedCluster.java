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

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_AttachedClusters_GetAttachedCluster_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkemulticloud.v1.AttachedCluster;
import com.google.cloud.gkemulticloud.v1.AttachedClusterName;
import com.google.cloud.gkemulticloud.v1.AttachedClustersClient;
import com.google.cloud.gkemulticloud.v1.GetAttachedClusterRequest;

public class AsyncGetAttachedCluster {

  public static void main(String[] args) throws Exception {
    asyncGetAttachedCluster();
  }

  public static void asyncGetAttachedCluster() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AttachedClustersClient attachedClustersClient = AttachedClustersClient.create()) {
      GetAttachedClusterRequest request =
          GetAttachedClusterRequest.newBuilder()
              .setName(
                  AttachedClusterName.of("[PROJECT]", "[LOCATION]", "[ATTACHED_CLUSTER]")
                      .toString())
              .build();
      ApiFuture<AttachedCluster> future =
          attachedClustersClient.getAttachedClusterCallable().futureCall(request);
      // Do something.
      AttachedCluster response = future.get();
    }
  }
}
// [END gkemulticloud_v1_generated_AttachedClusters_GetAttachedCluster_async]
