#!/bin/bash
#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
set -eo pipefail

if [ -n "${GOOGLE_CLOUD_PROJECT}" ]; then
  echo "Using current GOOGLE_CLOUD_PROJECT: $GOOGLE_CLOUD_PROJECT"
  return
fi

currentProject=$(gcloud config get project)
if [ -n "${currentProject}" ]; then
  echo -n "Do you want to use the current gcloud project ($currentProject)? (Y|n): "
  read -r shouldUseCurrent
  if [[ "$shouldUseCurrent" != n* ]] && [[ "$shouldUseCurrent" != N* ]]; then
    GOOGLE_CLOUD_PROJECT=$currentProject
    export GOOGLE_CLOUD_PROJECT
    return
  fi
fi

echo -n "GOOGLE_CLOUD_PROJECT not set. Do you want to create a project? (Y|n): "
read -r shouldCreate
if [[ "$shouldCreate" == n* ]] || [[ "$shouldCreate" == N* ]]; then
  echo "Project required. Exiting."
  exit 1
fi

# Ensure required environment variables are set.
if [ -z "${GOOGLE_CLOUD_FOLDER_ID}" ]; then
  echo -n "GOOGLE_CLOUD_FOLDER_ID not set. GCP Folder ID: "
  read -r folder_id
  export GOOGLE_CLOUD_FOLDER_ID="${folder_id}"
fi
if [ -z "${GOOGLE_CLOUD_BILLING_ACCOUNT}" ]; then
  echo -n "GOOGLE_CLOUD_BILLING_ACCOUNT not set. GCP Billing Account ID: "
  read -r billing_acct
  export GOOGLE_CLOUD_BILLING_ACCOUNT="${billing_acct}"
fi
if [ -z "${GOOGLE_CLOUD_PROJECT_PREFIX}" ]; then
  echo -n "GOOGLE_CLOUD_PROJECT_PREFIX not set. Prefix for New Project: "
  read -r prefix
  export GOOGLE_CLOUD_PROJECT_PREFIX="${prefix}"
fi

# Provision GCP Project
projectId="${GOOGLE_CLOUD_PROJECT_PREFIX}"-"$RANDOM"
gcloud projects create --folder="$GOOGLE_CLOUD_FOLDER_ID" "$projectId" || exit
gcloud config set project "$projectId"
gcloud services enable cloudresourcemanager.googleapis.com
gcloud beta billing projects link "$projectId" --billing-account="$GOOGLE_CLOUD_BILLING_ACCOUNT"
GOOGLE_CLOUD_PROJECT=$projectId
