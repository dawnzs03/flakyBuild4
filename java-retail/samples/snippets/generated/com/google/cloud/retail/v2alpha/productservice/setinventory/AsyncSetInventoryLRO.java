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

package com.google.cloud.retail.v2alpha.samples;

// [START retail_v2alpha_generated_ProductService_SetInventory_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.retail.v2alpha.Product;
import com.google.cloud.retail.v2alpha.ProductServiceClient;
import com.google.cloud.retail.v2alpha.SetInventoryMetadata;
import com.google.cloud.retail.v2alpha.SetInventoryRequest;
import com.google.cloud.retail.v2alpha.SetInventoryResponse;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;

public class AsyncSetInventoryLRO {

  public static void main(String[] args) throws Exception {
    asyncSetInventoryLRO();
  }

  public static void asyncSetInventoryLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ProductServiceClient productServiceClient = ProductServiceClient.create()) {
      SetInventoryRequest request =
          SetInventoryRequest.newBuilder()
              .setInventory(Product.newBuilder().build())
              .setSetMask(FieldMask.newBuilder().build())
              .setSetTime(Timestamp.newBuilder().build())
              .setAllowMissing(true)
              .build();
      OperationFuture<SetInventoryResponse, SetInventoryMetadata> future =
          productServiceClient.setInventoryOperationCallable().futureCall(request);
      // Do something.
      SetInventoryResponse response = future.get();
    }
  }
}
// [END retail_v2alpha_generated_ProductService_SetInventory_LRO_async]
