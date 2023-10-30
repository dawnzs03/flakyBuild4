/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/network_security.proto

package com.google.cloud.networksecurity.v1;

public final class NetworkSecurityOuterClass {
  private NetworkSecurityOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/networksecurity/v1/networ"
          + "k_security.proto\022\037google.cloud.networkse"
          + "curity.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032:google/cloud/n"
          + "etworksecurity/v1/authorization_policy.p"
          + "roto\0327google/cloud/networksecurity/v1/cl"
          + "ient_tls_policy.proto\0327google/cloud/netw"
          + "orksecurity/v1/server_tls_policy.proto\032#"
          + "google/longrunning/operations.proto2\375 \n\017"
          + "NetworkSecurity\022\356\001\n\031ListAuthorizationPol"
          + "icies\022A.google.cloud.networksecurity.v1."
          + "ListAuthorizationPoliciesRequest\032B.googl"
          + "e.cloud.networksecurity.v1.ListAuthoriza"
          + "tionPoliciesResponse\"J\332A\006parent\202\323\344\223\002;\0229/"
          + "v1/{parent=projects/*/locations/*}/autho"
          + "rizationPolicies\022\330\001\n\026GetAuthorizationPol"
          + "icy\022>.google.cloud.networksecurity.v1.Ge"
          + "tAuthorizationPolicyRequest\0324.google.clo"
          + "ud.networksecurity.v1.AuthorizationPolic"
          + "y\"H\332A\004name\202\323\344\223\002;\0229/v1/{name=projects/*/l"
          + "ocations/*/authorizationPolicies/*}\022\330\002\n\031"
          + "CreateAuthorizationPolicy\022A.google.cloud"
          + ".networksecurity.v1.CreateAuthorizationP"
          + "olicyRequest\032\035.google.longrunning.Operat"
          + "ion\"\330\001\312AH\n\023AuthorizationPolicy\0221google.c"
          + "loud.networksecurity.v1.OperationMetadat"
          + "a\332A3parent,authorization_policy,authoriz"
          + "ation_policy_id\202\323\344\223\002Q\"9/v1/{parent=proje"
          + "cts/*/locations/*}/authorizationPolicies"
          + ":\024authorization_policy\022\332\002\n\031UpdateAuthori"
          + "zationPolicy\022A.google.cloud.networksecur"
          + "ity.v1.UpdateAuthorizationPolicyRequest\032"
          + "\035.google.longrunning.Operation\"\332\001\312AH\n\023Au"
          + "thorizationPolicy\0221google.cloud.networks"
          + "ecurity.v1.OperationMetadata\332A authoriza"
          + "tion_policy,update_mask\202\323\344\223\002f2N/v1/{auth"
          + "orization_policy.name=projects/*/locatio"
          + "ns/*/authorizationPolicies/*}:\024authoriza"
          + "tion_policy\022\225\002\n\031DeleteAuthorizationPolic"
          + "y\022A.google.cloud.networksecurity.v1.Dele"
          + "teAuthorizationPolicyRequest\032\035.google.lo"
          + "ngrunning.Operation\"\225\001\312AJ\n\025google.protob"
          + "uf.Empty\0221google.cloud.networksecurity.v"
          + "1.OperationMetadata\332A\004name\202\323\344\223\002;*9/v1/{n"
          + "ame=projects/*/locations/*/authorization"
          + "Policies/*}\022\336\001\n\025ListServerTlsPolicies\022=."
          + "google.cloud.networksecurity.v1.ListServ"
          + "erTlsPoliciesRequest\032>.google.cloud.netw"
          + "orksecurity.v1.ListServerTlsPoliciesResp"
          + "onse\"F\332A\006parent\202\323\344\223\0027\0225/v1/{parent=proje"
          + "cts/*/locations/*}/serverTlsPolicies\022\310\001\n"
          + "\022GetServerTlsPolicy\022:.google.cloud.netwo"
          + "rksecurity.v1.GetServerTlsPolicyRequest\032"
          + "0.google.cloud.networksecurity.v1.Server"
          + "TlsPolicy\"D\332A\004name\202\323\344\223\0027\0225/v1/{name=proj"
          + "ects/*/locations/*/serverTlsPolicies/*}\022"
          + "\277\002\n\025CreateServerTlsPolicy\022=.google.cloud"
          + ".networksecurity.v1.CreateServerTlsPolic"
          + "yRequest\032\035.google.longrunning.Operation\""
          + "\307\001\312AD\n\017ServerTlsPolicy\0221google.cloud.net"
          + "worksecurity.v1.OperationMetadata\332A-pare"
          + "nt,server_tls_policy,server_tls_policy_i"
          + "d\202\323\344\223\002J\"5/v1/{parent=projects/*/location"
          + "s/*}/serverTlsPolicies:\021server_tls_polic"
          + "y\022\301\002\n\025UpdateServerTlsPolicy\022=.google.clo"
          + "ud.networksecurity.v1.UpdateServerTlsPol"
          + "icyRequest\032\035.google.longrunning.Operatio"
          + "n\"\311\001\312AD\n\017ServerTlsPolicy\0221google.cloud.n"
          + "etworksecurity.v1.OperationMetadata\332A\035se"
          + "rver_tls_policy,update_mask\202\323\344\223\002\\2G/v1/{"
          + "server_tls_policy.name=projects/*/locati"
          + "ons/*/serverTlsPolicies/*}:\021server_tls_p"
          + "olicy\022\211\002\n\025DeleteServerTlsPolicy\022=.google"
          + ".cloud.networksecurity.v1.DeleteServerTl"
          + "sPolicyRequest\032\035.google.longrunning.Oper"
          + "ation\"\221\001\312AJ\n\025google.protobuf.Empty\0221goog"
          + "le.cloud.networksecurity.v1.OperationMet"
          + "adata\332A\004name\202\323\344\223\0027*5/v1/{name=projects/*"
          + "/locations/*/serverTlsPolicies/*}\022\336\001\n\025Li"
          + "stClientTlsPolicies\022=.google.cloud.netwo"
          + "rksecurity.v1.ListClientTlsPoliciesReque"
          + "st\032>.google.cloud.networksecurity.v1.Lis"
          + "tClientTlsPoliciesResponse\"F\332A\006parent\202\323\344"
          + "\223\0027\0225/v1/{parent=projects/*/locations/*}"
          + "/clientTlsPolicies\022\310\001\n\022GetClientTlsPolic"
          + "y\022:.google.cloud.networksecurity.v1.GetC"
          + "lientTlsPolicyRequest\0320.google.cloud.net"
          + "worksecurity.v1.ClientTlsPolicy\"D\332A\004name"
          + "\202\323\344\223\0027\0225/v1/{name=projects/*/locations/*"
          + "/clientTlsPolicies/*}\022\277\002\n\025CreateClientTl"
          + "sPolicy\022=.google.cloud.networksecurity.v"
          + "1.CreateClientTlsPolicyRequest\032\035.google."
          + "longrunning.Operation\"\307\001\312AD\n\017ClientTlsPo"
          + "licy\0221google.cloud.networksecurity.v1.Op"
          + "erationMetadata\332A-parent,client_tls_poli"
          + "cy,client_tls_policy_id\202\323\344\223\002J\"5/v1/{pare"
          + "nt=projects/*/locations/*}/clientTlsPoli"
          + "cies:\021client_tls_policy\022\301\002\n\025UpdateClient"
          + "TlsPolicy\022=.google.cloud.networksecurity"
          + ".v1.UpdateClientTlsPolicyRequest\032\035.googl"
          + "e.longrunning.Operation\"\311\001\312AD\n\017ClientTls"
          + "Policy\0221google.cloud.networksecurity.v1."
          + "OperationMetadata\332A\035client_tls_policy,up"
          + "date_mask\202\323\344\223\002\\2G/v1/{client_tls_policy."
          + "name=projects/*/locations/*/clientTlsPol"
          + "icies/*}:\021client_tls_policy\022\211\002\n\025DeleteCl"
          + "ientTlsPolicy\022=.google.cloud.networksecu"
          + "rity.v1.DeleteClientTlsPolicyRequest\032\035.g"
          + "oogle.longrunning.Operation\"\221\001\312AJ\n\025googl"
          + "e.protobuf.Empty\0221google.cloud.networkse"
          + "curity.v1.OperationMetadata\332A\004name\202\323\344\223\0027"
          + "*5/v1/{name=projects/*/locations/*/clien"
          + "tTlsPolicies/*}\032R\312A\036networksecurity.goog"
          + "leapis.com\322A.https://www.googleapis.com/"
          + "auth/cloud-platformB\337\001\n#com.google.cloud"
          + ".networksecurity.v1P\001ZMcloud.google.com/"
          + "go/networksecurity/apiv1/networksecurity"
          + "pb;networksecuritypb\252\002\037Google.Cloud.Netw"
          + "orkSecurity.V1\312\002\037Google\\Cloud\\NetworkSec"
          + "urity\\V1\352\002\"Google::Cloud::NetworkSecurit"
          + "y::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.networksecurity.v1.AuthorizationPolicyProto.getDescriptor(),
              com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.getDescriptor(),
              com.google.cloud.networksecurity.v1.ServerTlsPolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.networksecurity.v1.AuthorizationPolicyProto.getDescriptor();
    com.google.cloud.networksecurity.v1.ClientTlsPolicyProto.getDescriptor();
    com.google.cloud.networksecurity.v1.ServerTlsPolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
