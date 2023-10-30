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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_Networks_ListPeeringRoutes_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.compute.v1.ExchangedPeeringRoute;
import com.google.cloud.compute.v1.ListPeeringRoutesNetworksRequest;
import com.google.cloud.compute.v1.NetworksClient;

public class AsyncListPeeringRoutes {

  public static void main(String[] args) throws Exception {
    asyncListPeeringRoutes();
  }

  public static void asyncListPeeringRoutes() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetworksClient networksClient = NetworksClient.create()) {
      ListPeeringRoutesNetworksRequest request =
          ListPeeringRoutesNetworksRequest.newBuilder()
              .setDirection("direction-962590849")
              .setFilter("filter-1274492040")
              .setMaxResults(1128457243)
              .setNetwork("network1843485230")
              .setOrderBy("orderBy-1207110587")
              .setPageToken("pageToken873572522")
              .setPeeringName("peeringName-1170120213")
              .setProject("project-309310695")
              .setRegion("region-934795532")
              .setReturnPartialSuccess(true)
              .build();
      ApiFuture<ExchangedPeeringRoute> future =
          networksClient.listPeeringRoutesPagedCallable().futureCall(request);
      // Do something.
      for (ExchangedPeeringRoute element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END compute_v1_generated_Networks_ListPeeringRoutes_async]
