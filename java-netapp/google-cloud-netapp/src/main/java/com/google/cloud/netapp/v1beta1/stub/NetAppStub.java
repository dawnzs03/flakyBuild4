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

package com.google.cloud.netapp.v1beta1.stub;

import static com.google.cloud.netapp.v1beta1.NetAppClient.ListActiveDirectoriesPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListKmsConfigsPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListLocationsPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListReplicationsPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListSnapshotsPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListStoragePoolsPagedResponse;
import static com.google.cloud.netapp.v1beta1.NetAppClient.ListVolumesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.netapp.v1beta1.ActiveDirectory;
import com.google.cloud.netapp.v1beta1.CreateActiveDirectoryRequest;
import com.google.cloud.netapp.v1beta1.CreateKmsConfigRequest;
import com.google.cloud.netapp.v1beta1.CreateReplicationRequest;
import com.google.cloud.netapp.v1beta1.CreateSnapshotRequest;
import com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest;
import com.google.cloud.netapp.v1beta1.CreateVolumeRequest;
import com.google.cloud.netapp.v1beta1.DeleteActiveDirectoryRequest;
import com.google.cloud.netapp.v1beta1.DeleteKmsConfigRequest;
import com.google.cloud.netapp.v1beta1.DeleteReplicationRequest;
import com.google.cloud.netapp.v1beta1.DeleteSnapshotRequest;
import com.google.cloud.netapp.v1beta1.DeleteStoragePoolRequest;
import com.google.cloud.netapp.v1beta1.DeleteVolumeRequest;
import com.google.cloud.netapp.v1beta1.EncryptVolumesRequest;
import com.google.cloud.netapp.v1beta1.GetActiveDirectoryRequest;
import com.google.cloud.netapp.v1beta1.GetKmsConfigRequest;
import com.google.cloud.netapp.v1beta1.GetReplicationRequest;
import com.google.cloud.netapp.v1beta1.GetSnapshotRequest;
import com.google.cloud.netapp.v1beta1.GetStoragePoolRequest;
import com.google.cloud.netapp.v1beta1.GetVolumeRequest;
import com.google.cloud.netapp.v1beta1.KmsConfig;
import com.google.cloud.netapp.v1beta1.ListActiveDirectoriesRequest;
import com.google.cloud.netapp.v1beta1.ListActiveDirectoriesResponse;
import com.google.cloud.netapp.v1beta1.ListKmsConfigsRequest;
import com.google.cloud.netapp.v1beta1.ListKmsConfigsResponse;
import com.google.cloud.netapp.v1beta1.ListReplicationsRequest;
import com.google.cloud.netapp.v1beta1.ListReplicationsResponse;
import com.google.cloud.netapp.v1beta1.ListSnapshotsRequest;
import com.google.cloud.netapp.v1beta1.ListSnapshotsResponse;
import com.google.cloud.netapp.v1beta1.ListStoragePoolsRequest;
import com.google.cloud.netapp.v1beta1.ListStoragePoolsResponse;
import com.google.cloud.netapp.v1beta1.ListVolumesRequest;
import com.google.cloud.netapp.v1beta1.ListVolumesResponse;
import com.google.cloud.netapp.v1beta1.OperationMetadata;
import com.google.cloud.netapp.v1beta1.Replication;
import com.google.cloud.netapp.v1beta1.ResumeReplicationRequest;
import com.google.cloud.netapp.v1beta1.ReverseReplicationDirectionRequest;
import com.google.cloud.netapp.v1beta1.RevertVolumeRequest;
import com.google.cloud.netapp.v1beta1.Snapshot;
import com.google.cloud.netapp.v1beta1.StopReplicationRequest;
import com.google.cloud.netapp.v1beta1.StoragePool;
import com.google.cloud.netapp.v1beta1.UpdateActiveDirectoryRequest;
import com.google.cloud.netapp.v1beta1.UpdateKmsConfigRequest;
import com.google.cloud.netapp.v1beta1.UpdateReplicationRequest;
import com.google.cloud.netapp.v1beta1.UpdateSnapshotRequest;
import com.google.cloud.netapp.v1beta1.UpdateStoragePoolRequest;
import com.google.cloud.netapp.v1beta1.UpdateVolumeRequest;
import com.google.cloud.netapp.v1beta1.VerifyKmsConfigRequest;
import com.google.cloud.netapp.v1beta1.VerifyKmsConfigResponse;
import com.google.cloud.netapp.v1beta1.Volume;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the NetApp service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class NetAppStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListStoragePoolsRequest, ListStoragePoolsPagedResponse>
      listStoragePoolsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listStoragePoolsPagedCallable()");
  }

  public UnaryCallable<ListStoragePoolsRequest, ListStoragePoolsResponse>
      listStoragePoolsCallable() {
    throw new UnsupportedOperationException("Not implemented: listStoragePoolsCallable()");
  }

  public OperationCallable<CreateStoragePoolRequest, StoragePool, OperationMetadata>
      createStoragePoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createStoragePoolOperationCallable()");
  }

  public UnaryCallable<CreateStoragePoolRequest, Operation> createStoragePoolCallable() {
    throw new UnsupportedOperationException("Not implemented: createStoragePoolCallable()");
  }

  public UnaryCallable<GetStoragePoolRequest, StoragePool> getStoragePoolCallable() {
    throw new UnsupportedOperationException("Not implemented: getStoragePoolCallable()");
  }

  public OperationCallable<UpdateStoragePoolRequest, StoragePool, OperationMetadata>
      updateStoragePoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateStoragePoolOperationCallable()");
  }

  public UnaryCallable<UpdateStoragePoolRequest, Operation> updateStoragePoolCallable() {
    throw new UnsupportedOperationException("Not implemented: updateStoragePoolCallable()");
  }

  public OperationCallable<DeleteStoragePoolRequest, Empty, OperationMetadata>
      deleteStoragePoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteStoragePoolOperationCallable()");
  }

  public UnaryCallable<DeleteStoragePoolRequest, Operation> deleteStoragePoolCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteStoragePoolCallable()");
  }

  public UnaryCallable<ListVolumesRequest, ListVolumesPagedResponse> listVolumesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listVolumesPagedCallable()");
  }

  public UnaryCallable<ListVolumesRequest, ListVolumesResponse> listVolumesCallable() {
    throw new UnsupportedOperationException("Not implemented: listVolumesCallable()");
  }

  public UnaryCallable<GetVolumeRequest, Volume> getVolumeCallable() {
    throw new UnsupportedOperationException("Not implemented: getVolumeCallable()");
  }

  public OperationCallable<CreateVolumeRequest, Volume, OperationMetadata>
      createVolumeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createVolumeOperationCallable()");
  }

  public UnaryCallable<CreateVolumeRequest, Operation> createVolumeCallable() {
    throw new UnsupportedOperationException("Not implemented: createVolumeCallable()");
  }

  public OperationCallable<UpdateVolumeRequest, Volume, OperationMetadata>
      updateVolumeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateVolumeOperationCallable()");
  }

  public UnaryCallable<UpdateVolumeRequest, Operation> updateVolumeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateVolumeCallable()");
  }

  public OperationCallable<DeleteVolumeRequest, Empty, OperationMetadata>
      deleteVolumeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVolumeOperationCallable()");
  }

  public UnaryCallable<DeleteVolumeRequest, Operation> deleteVolumeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVolumeCallable()");
  }

  public OperationCallable<RevertVolumeRequest, Volume, OperationMetadata>
      revertVolumeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: revertVolumeOperationCallable()");
  }

  public UnaryCallable<RevertVolumeRequest, Operation> revertVolumeCallable() {
    throw new UnsupportedOperationException("Not implemented: revertVolumeCallable()");
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsPagedResponse>
      listSnapshotsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsPagedCallable()");
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsCallable()");
  }

  public UnaryCallable<GetSnapshotRequest, Snapshot> getSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: getSnapshotCallable()");
  }

  public OperationCallable<CreateSnapshotRequest, Snapshot, OperationMetadata>
      createSnapshotOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createSnapshotOperationCallable()");
  }

  public UnaryCallable<CreateSnapshotRequest, Operation> createSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: createSnapshotCallable()");
  }

  public OperationCallable<DeleteSnapshotRequest, Empty, OperationMetadata>
      deleteSnapshotOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSnapshotOperationCallable()");
  }

  public UnaryCallable<DeleteSnapshotRequest, Operation> deleteSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSnapshotCallable()");
  }

  public OperationCallable<UpdateSnapshotRequest, Snapshot, OperationMetadata>
      updateSnapshotOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSnapshotOperationCallable()");
  }

  public UnaryCallable<UpdateSnapshotRequest, Operation> updateSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSnapshotCallable()");
  }

  public UnaryCallable<ListActiveDirectoriesRequest, ListActiveDirectoriesPagedResponse>
      listActiveDirectoriesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listActiveDirectoriesPagedCallable()");
  }

  public UnaryCallable<ListActiveDirectoriesRequest, ListActiveDirectoriesResponse>
      listActiveDirectoriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listActiveDirectoriesCallable()");
  }

  public UnaryCallable<GetActiveDirectoryRequest, ActiveDirectory> getActiveDirectoryCallable() {
    throw new UnsupportedOperationException("Not implemented: getActiveDirectoryCallable()");
  }

  public OperationCallable<CreateActiveDirectoryRequest, ActiveDirectory, OperationMetadata>
      createActiveDirectoryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createActiveDirectoryOperationCallable()");
  }

  public UnaryCallable<CreateActiveDirectoryRequest, Operation> createActiveDirectoryCallable() {
    throw new UnsupportedOperationException("Not implemented: createActiveDirectoryCallable()");
  }

  public OperationCallable<UpdateActiveDirectoryRequest, ActiveDirectory, OperationMetadata>
      updateActiveDirectoryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateActiveDirectoryOperationCallable()");
  }

  public UnaryCallable<UpdateActiveDirectoryRequest, Operation> updateActiveDirectoryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateActiveDirectoryCallable()");
  }

  public OperationCallable<DeleteActiveDirectoryRequest, Empty, OperationMetadata>
      deleteActiveDirectoryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteActiveDirectoryOperationCallable()");
  }

  public UnaryCallable<DeleteActiveDirectoryRequest, Operation> deleteActiveDirectoryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteActiveDirectoryCallable()");
  }

  public UnaryCallable<ListKmsConfigsRequest, ListKmsConfigsPagedResponse>
      listKmsConfigsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listKmsConfigsPagedCallable()");
  }

  public UnaryCallable<ListKmsConfigsRequest, ListKmsConfigsResponse> listKmsConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listKmsConfigsCallable()");
  }

  public OperationCallable<CreateKmsConfigRequest, KmsConfig, OperationMetadata>
      createKmsConfigOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createKmsConfigOperationCallable()");
  }

  public UnaryCallable<CreateKmsConfigRequest, Operation> createKmsConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createKmsConfigCallable()");
  }

  public UnaryCallable<GetKmsConfigRequest, KmsConfig> getKmsConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getKmsConfigCallable()");
  }

  public OperationCallable<UpdateKmsConfigRequest, KmsConfig, OperationMetadata>
      updateKmsConfigOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateKmsConfigOperationCallable()");
  }

  public UnaryCallable<UpdateKmsConfigRequest, Operation> updateKmsConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateKmsConfigCallable()");
  }

  public OperationCallable<EncryptVolumesRequest, KmsConfig, OperationMetadata>
      encryptVolumesOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: encryptVolumesOperationCallable()");
  }

  public UnaryCallable<EncryptVolumesRequest, Operation> encryptVolumesCallable() {
    throw new UnsupportedOperationException("Not implemented: encryptVolumesCallable()");
  }

  public UnaryCallable<VerifyKmsConfigRequest, VerifyKmsConfigResponse> verifyKmsConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: verifyKmsConfigCallable()");
  }

  public OperationCallable<DeleteKmsConfigRequest, Empty, OperationMetadata>
      deleteKmsConfigOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteKmsConfigOperationCallable()");
  }

  public UnaryCallable<DeleteKmsConfigRequest, Operation> deleteKmsConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteKmsConfigCallable()");
  }

  public UnaryCallable<ListReplicationsRequest, ListReplicationsPagedResponse>
      listReplicationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listReplicationsPagedCallable()");
  }

  public UnaryCallable<ListReplicationsRequest, ListReplicationsResponse>
      listReplicationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listReplicationsCallable()");
  }

  public UnaryCallable<GetReplicationRequest, Replication> getReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: getReplicationCallable()");
  }

  public OperationCallable<CreateReplicationRequest, Replication, OperationMetadata>
      createReplicationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createReplicationOperationCallable()");
  }

  public UnaryCallable<CreateReplicationRequest, Operation> createReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: createReplicationCallable()");
  }

  public OperationCallable<DeleteReplicationRequest, Empty, OperationMetadata>
      deleteReplicationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteReplicationOperationCallable()");
  }

  public UnaryCallable<DeleteReplicationRequest, Operation> deleteReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteReplicationCallable()");
  }

  public OperationCallable<UpdateReplicationRequest, Replication, OperationMetadata>
      updateReplicationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateReplicationOperationCallable()");
  }

  public UnaryCallable<UpdateReplicationRequest, Operation> updateReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateReplicationCallable()");
  }

  public OperationCallable<StopReplicationRequest, Replication, OperationMetadata>
      stopReplicationOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: stopReplicationOperationCallable()");
  }

  public UnaryCallable<StopReplicationRequest, Operation> stopReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: stopReplicationCallable()");
  }

  public OperationCallable<ResumeReplicationRequest, Replication, OperationMetadata>
      resumeReplicationOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: resumeReplicationOperationCallable()");
  }

  public UnaryCallable<ResumeReplicationRequest, Operation> resumeReplicationCallable() {
    throw new UnsupportedOperationException("Not implemented: resumeReplicationCallable()");
  }

  public OperationCallable<ReverseReplicationDirectionRequest, Replication, OperationMetadata>
      reverseReplicationDirectionOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: reverseReplicationDirectionOperationCallable()");
  }

  public UnaryCallable<ReverseReplicationDirectionRequest, Operation>
      reverseReplicationDirectionCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: reverseReplicationDirectionCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
