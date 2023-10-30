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
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

package com.google.cloud.binaryauthorization.v1beta1;

public final class BinaryAuthorizationResourcesProto {
  private BinaryAuthorizationResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_ClusterAdmissionRulesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_ClusterAdmissionRulesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesNamespaceAdmissionRulesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesNamespaceAdmissionRulesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesServiceAccountAdmissionRulesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesServiceAccountAdmissionRulesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_IstioServiceIdentityAdmissionRulesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Policy_IstioServiceIdentityAdmissionRulesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_Attestor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_Attestor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_UserOwnedDrydockNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_UserOwnedDrydockNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_PkixPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_PkixPublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_binaryauthorization_v1beta1_AttestorPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_binaryauthorization_v1beta1_AttestorPublicKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/binaryauthorization/v1bet"
          + "a1/resources.proto\022(google.cloud.binarya"
          + "uthorization.v1beta1\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032\037google/protobuf/timestamp.proto\"\273\r\n\006Po"
          + "licy\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\031\n\013description\030"
          + "\006 \001(\tB\004\342A\001\001\022x\n\035global_policy_evaluation_"
          + "mode\030\007 \001(\0162K.google.cloud.binaryauthoriz"
          + "ation.v1beta1.Policy.GlobalPolicyEvaluat"
          + "ionModeB\004\342A\001\001\022o\n\034admission_whitelist_pat"
          + "terns\030\002 \003(\0132C.google.cloud.binaryauthori"
          + "zation.v1beta1.AdmissionWhitelistPattern"
          + "B\004\342A\001\001\022r\n\027cluster_admission_rules\030\003 \003(\0132"
          + "K.google.cloud.binaryauthorization.v1bet"
          + "a1.Policy.ClusterAdmissionRulesEntryB\004\342A"
          + "\001\001\022\213\001\n$kubernetes_namespace_admission_ru"
          + "les\030\n \003(\0132W.google.cloud.binaryauthoriza"
          + "tion.v1beta1.Policy.KubernetesNamespaceA"
          + "dmissionRulesEntryB\004\342A\001\001\022\226\001\n*kubernetes_"
          + "service_account_admission_rules\030\010 \003(\0132\\."
          + "google.cloud.binaryauthorization.v1beta1"
          + ".Policy.KubernetesServiceAccountAdmissio"
          + "nRulesEntryB\004\342A\001\001\022\216\001\n&istio_service_iden"
          + "tity_admission_rules\030\t \003(\0132X.google.clou"
          + "d.binaryauthorization.v1beta1.Policy.Ist"
          + "ioServiceIdentityAdmissionRulesEntryB\004\342A"
          + "\001\001\022]\n\026default_admission_rule\030\004 \001(\01327.goo"
          + "gle.cloud.binaryauthorization.v1beta1.Ad"
          + "missionRuleB\004\342A\001\002\0225\n\013update_time\030\005 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\032u\n\032Clus"
          + "terAdmissionRulesEntry\022\013\n\003key\030\001 \001(\t\022F\n\005v"
          + "alue\030\002 \001(\01327.google.cloud.binaryauthoriz"
          + "ation.v1beta1.AdmissionRule:\0028\001\032\201\001\n&Kube"
          + "rnetesNamespaceAdmissionRulesEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022F\n\005value\030\002 \001(\01327.google.cloud.bi"
          + "naryauthorization.v1beta1.AdmissionRule:"
          + "\0028\001\032\206\001\n+KubernetesServiceAccountAdmissio"
          + "nRulesEntry\022\013\n\003key\030\001 \001(\t\022F\n\005value\030\002 \001(\0132"
          + "7.google.cloud.binaryauthorization.v1bet"
          + "a1.AdmissionRule:\0028\001\032\202\001\n\'IstioServiceIde"
          + "ntityAdmissionRulesEntry\022\013\n\003key\030\001 \001(\t\022F\n"
          + "\005value\030\002 \001(\01327.google.cloud.binaryauthor"
          + "ization.v1beta1.AdmissionRule:\0028\001\"d\n\032Glo"
          + "balPolicyEvaluationMode\022-\n)GLOBAL_POLICY"
          + "_EVALUATION_MODE_UNSPECIFIED\020\000\022\n\n\006ENABLE"
          + "\020\001\022\013\n\007DISABLE\020\002:f\352Ac\n)binaryauthorizatio"
          + "n.googleapis.com/Policy\022\031projects/{proje"
          + "ct}/policy\022\033locations/{location}/policy\""
          + "1\n\031AdmissionWhitelistPattern\022\024\n\014name_pat"
          + "tern\030\001 \001(\t\"\347\003\n\rAdmissionRule\022e\n\017evaluati"
          + "on_mode\030\001 \001(\0162F.google.cloud.binaryautho"
          + "rization.v1beta1.AdmissionRule.Evaluatio"
          + "nModeB\004\342A\001\002\022%\n\027require_attestations_by\030\002"
          + " \003(\tB\004\342A\001\001\022g\n\020enforcement_mode\030\003 \001(\0162G.g"
          + "oogle.cloud.binaryauthorization.v1beta1."
          + "AdmissionRule.EnforcementModeB\004\342A\001\002\"m\n\016E"
          + "valuationMode\022\037\n\033EVALUATION_MODE_UNSPECI"
          + "FIED\020\000\022\020\n\014ALWAYS_ALLOW\020\001\022\027\n\023REQUIRE_ATTE"
          + "STATION\020\002\022\017\n\013ALWAYS_DENY\020\003\"p\n\017Enforcemen"
          + "tMode\022 \n\034ENFORCEMENT_MODE_UNSPECIFIED\020\000\022"
          + " \n\034ENFORCED_BLOCK_AND_AUDIT_LOG\020\001\022\031\n\025DRY"
          + "RUN_AUDIT_LOG_ONLY\020\002\"\277\002\n\010Attestor\022\022\n\004nam"
          + "e\030\001 \001(\tB\004\342A\001\002\022\031\n\013description\030\006 \001(\tB\004\342A\001\001"
          + "\022a\n\027user_owned_drydock_note\030\003 \001(\0132>.goog"
          + "le.cloud.binaryauthorization.v1beta1.Use"
          + "rOwnedDrydockNoteH\000\0225\n\013update_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\004\342A\001\003:Y\352AV\n"
          + "+binaryauthorization.googleapis.com/Atte"
          + "stor\022\'projects/{project}/attestors/{atte"
          + "stor}B\017\n\rattestor_type\"\274\001\n\024UserOwnedDryd"
          + "ockNote\022\034\n\016note_reference\030\001 \001(\tB\004\342A\001\002\022V\n"
          + "\013public_keys\030\002 \003(\0132;.google.cloud.binary"
          + "authorization.v1beta1.AttestorPublicKeyB"
          + "\004\342A\001\001\022.\n delegation_service_account_emai"
          + "l\030\003 \001(\tB\004\342A\001\003\"\304\004\n\rPkixPublicKey\022\026\n\016publi"
          + "c_key_pem\030\001 \001(\t\022g\n\023signature_algorithm\030\002"
          + " \001(\0162J.google.cloud.binaryauthorization."
          + "v1beta1.PkixPublicKey.SignatureAlgorithm"
          + "\"\261\003\n\022SignatureAlgorithm\022#\n\037SIGNATURE_ALG"
          + "ORITHM_UNSPECIFIED\020\000\022\027\n\023RSA_PSS_2048_SHA"
          + "256\020\001\022\027\n\023RSA_PSS_3072_SHA256\020\002\022\027\n\023RSA_PS"
          + "S_4096_SHA256\020\003\022\027\n\023RSA_PSS_4096_SHA512\020\004"
          + "\022\036\n\032RSA_SIGN_PKCS1_2048_SHA256\020\005\022\036\n\032RSA_"
          + "SIGN_PKCS1_3072_SHA256\020\006\022\036\n\032RSA_SIGN_PKC"
          + "S1_4096_SHA256\020\007\022\036\n\032RSA_SIGN_PKCS1_4096_"
          + "SHA512\020\010\022\025\n\021ECDSA_P256_SHA256\020\t\022\027\n\023EC_SI"
          + "GN_P256_SHA256\020\t\022\025\n\021ECDSA_P384_SHA384\020\n\022"
          + "\027\n\023EC_SIGN_P384_SHA384\020\n\022\025\n\021ECDSA_P521_S"
          + "HA512\020\013\022\027\n\023EC_SIGN_P521_SHA512\020\013\032\002\020\001\"\300\001\n"
          + "\021AttestorPublicKey\022\025\n\007comment\030\001 \001(\tB\004\342A\001"
          + "\001\022\n\n\002id\030\002 \001(\t\022&\n\034ascii_armored_pgp_publi"
          + "c_key\030\003 \001(\tH\000\022R\n\017pkix_public_key\030\005 \001(\01327"
          + ".google.cloud.binaryauthorization.v1beta"
          + "1.PkixPublicKeyH\000B\014\n\npublic_keyB\272\002\n,com."
          + "google.cloud.binaryauthorization.v1beta1"
          + "B!BinaryAuthorizationResourcesProtoP\001Z^c"
          + "loud.google.com/go/binaryauthorization/a"
          + "piv1beta1/binaryauthorizationpb;binaryau"
          + "thorizationpb\370\001\001\252\002(Google.Cloud.BinaryAu"
          + "thorization.V1Beta1\312\002(Google\\Cloud\\Binar"
          + "yAuthorization\\V1beta1\352\002+Google::Cloud::"
          + "BinaryAuthorization::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "GlobalPolicyEvaluationMode",
              "AdmissionWhitelistPatterns",
              "ClusterAdmissionRules",
              "KubernetesNamespaceAdmissionRules",
              "KubernetesServiceAccountAdmissionRules",
              "IstioServiceIdentityAdmissionRules",
              "DefaultAdmissionRule",
              "UpdateTime",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_ClusterAdmissionRulesEntry_descriptor =
        internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_ClusterAdmissionRulesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Policy_ClusterAdmissionRulesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesNamespaceAdmissionRulesEntry_descriptor =
        internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesNamespaceAdmissionRulesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesNamespaceAdmissionRulesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesServiceAccountAdmissionRulesEntry_descriptor =
        internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesServiceAccountAdmissionRulesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Policy_KubernetesServiceAccountAdmissionRulesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_IstioServiceIdentityAdmissionRulesEntry_descriptor =
        internal_static_google_cloud_binaryauthorization_v1beta1_Policy_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_binaryauthorization_v1beta1_Policy_IstioServiceIdentityAdmissionRulesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Policy_IstioServiceIdentityAdmissionRulesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionWhitelistPattern_descriptor,
            new java.lang.String[] {
              "NamePattern",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionRule_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_AdmissionRule_descriptor,
            new java.lang.String[] {
              "EvaluationMode", "RequireAttestationsBy", "EnforcementMode",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_Attestor_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_binaryauthorization_v1beta1_Attestor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_Attestor_descriptor,
            new java.lang.String[] {
              "Name", "Description", "UserOwnedDrydockNote", "UpdateTime", "AttestorType",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_UserOwnedDrydockNote_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_binaryauthorization_v1beta1_UserOwnedDrydockNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_UserOwnedDrydockNote_descriptor,
            new java.lang.String[] {
              "NoteReference", "PublicKeys", "DelegationServiceAccountEmail",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_PkixPublicKey_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_binaryauthorization_v1beta1_PkixPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_PkixPublicKey_descriptor,
            new java.lang.String[] {
              "PublicKeyPem", "SignatureAlgorithm",
            });
    internal_static_google_cloud_binaryauthorization_v1beta1_AttestorPublicKey_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_binaryauthorization_v1beta1_AttestorPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_binaryauthorization_v1beta1_AttestorPublicKey_descriptor,
            new java.lang.String[] {
              "Comment", "Id", "AsciiArmoredPgpPublicKey", "PkixPublicKey", "PublicKey",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
