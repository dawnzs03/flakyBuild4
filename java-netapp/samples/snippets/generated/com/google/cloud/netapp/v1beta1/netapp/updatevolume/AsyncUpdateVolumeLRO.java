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

package com.google.cloud.netapp.v1beta1.samples;

// [START netapp_v1beta1_generated_NetApp_UpdateVolume_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.netapp.v1beta1.NetAppClient;
import com.google.cloud.netapp.v1beta1.OperationMetadata;
import com.google.cloud.netapp.v1beta1.UpdateVolumeRequest;
import com.google.cloud.netapp.v1beta1.Volume;
import com.google.protobuf.FieldMask;

public class AsyncUpdateVolumeLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateVolumeLRO();
  }

  public static void asyncUpdateVolumeLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetAppClient netAppClient = NetAppClient.create()) {
      UpdateVolumeRequest request =
          UpdateVolumeRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setVolume(Volume.newBuilder().build())
              .build();
      OperationFuture<Volume, OperationMetadata> future =
          netAppClient.updateVolumeOperationCallable().futureCall(request);
      // Do something.
      Volume response = future.get();
    }
  }
}
// [END netapp_v1beta1_generated_NetApp_UpdateVolume_LRO_async]
