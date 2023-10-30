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

package com.google.cloud.websecurityscanner.v1.samples;

// [START websecurityscanner_v1_generated_WebSecurityScanner_UpdateScanConfig_sync]
import com.google.cloud.websecurityscanner.v1.ScanConfig;
import com.google.cloud.websecurityscanner.v1.UpdateScanConfigRequest;
import com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient;
import com.google.protobuf.FieldMask;

public class SyncUpdateScanConfig {

  public static void main(String[] args) throws Exception {
    syncUpdateScanConfig();
  }

  public static void syncUpdateScanConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      UpdateScanConfigRequest request =
          UpdateScanConfigRequest.newBuilder()
              .setScanConfig(ScanConfig.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ScanConfig response = webSecurityScannerClient.updateScanConfig(request);
    }
  }
}
// [END websecurityscanner_v1_generated_WebSecurityScanner_UpdateScanConfig_sync]
