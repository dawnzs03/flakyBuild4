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

package com.google.cloud.websecurityscanner.v1alpha.samples;

// [START websecurityscanner_v1alpha_generated_WebSecurityScanner_StartScanRun_sync]
import com.google.cloud.websecurityscanner.v1alpha.ScanConfigName;
import com.google.cloud.websecurityscanner.v1alpha.ScanRun;
import com.google.cloud.websecurityscanner.v1alpha.StartScanRunRequest;
import com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient;

public class SyncStartScanRun {

  public static void main(String[] args) throws Exception {
    syncStartScanRun();
  }

  public static void syncStartScanRun() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      StartScanRunRequest request =
          StartScanRunRequest.newBuilder()
              .setName(ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]").toString())
              .build();
      ScanRun response = webSecurityScannerClient.startScanRun(request);
    }
  }
}
// [END websecurityscanner_v1alpha_generated_WebSecurityScanner_StartScanRun_sync]
