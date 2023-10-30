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

// [START netapp_v1beta1_generated_NetApp_CreateActiveDirectory_LocationnameActivedirectoryString_sync]
import com.google.cloud.netapp.v1beta1.ActiveDirectory;
import com.google.cloud.netapp.v1beta1.LocationName;
import com.google.cloud.netapp.v1beta1.NetAppClient;

public class SyncCreateActiveDirectoryLocationnameActivedirectoryString {

  public static void main(String[] args) throws Exception {
    syncCreateActiveDirectoryLocationnameActivedirectoryString();
  }

  public static void syncCreateActiveDirectoryLocationnameActivedirectoryString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetAppClient netAppClient = NetAppClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      ActiveDirectory activeDirectory = ActiveDirectory.newBuilder().build();
      String activeDirectoryId = "activeDirectoryId589359490";
      ActiveDirectory response =
          netAppClient.createActiveDirectoryAsync(parent, activeDirectory, activeDirectoryId).get();
    }
  }
}
// [END netapp_v1beta1_generated_NetApp_CreateActiveDirectory_LocationnameActivedirectoryString_sync]
