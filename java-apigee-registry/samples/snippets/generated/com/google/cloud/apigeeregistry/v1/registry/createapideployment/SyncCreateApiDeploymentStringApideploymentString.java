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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_Registry_CreateApiDeployment_StringApideploymentString_sync]
import com.google.cloud.apigeeregistry.v1.ApiDeployment;
import com.google.cloud.apigeeregistry.v1.ApiName;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class SyncCreateApiDeploymentStringApideploymentString {

  public static void main(String[] args) throws Exception {
    syncCreateApiDeploymentStringApideploymentString();
  }

  public static void syncCreateApiDeploymentStringApideploymentString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RegistryClient registryClient = RegistryClient.create()) {
      String parent = ApiName.of("[PROJECT]", "[LOCATION]", "[API]").toString();
      ApiDeployment apiDeployment = ApiDeployment.newBuilder().build();
      String apiDeploymentId = "apiDeploymentId-1299472902";
      ApiDeployment response =
          registryClient.createApiDeployment(parent, apiDeployment, apiDeploymentId);
    }
  }
}
// [END apigeeregistry_v1_generated_Registry_CreateApiDeployment_StringApideploymentString_sync]
