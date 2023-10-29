/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.list.asset.entry.provider;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.persistence.AssetEntryQuery;
import com.liferay.asset.list.model.AssetListEntry;

import java.util.List;

/**
 * @author Sarai Díaz
 */
public interface AssetListAssetEntryProvider {

	public List<AssetEntry> getAssetEntries(
		AssetListEntry assetListEntry, long[] segmentsEntryIds,
		long[][] assetCategoryIds, String[][] assetTagNames, String keywords,
		String userId, int start, int end);

	public int getAssetEntriesCount(
		AssetListEntry assetListEntry, long[] segmentsEntryIds,
		long[][] assetCategoryIds, String[][] assetTagNames, String keywords,
		String userId);

	public AssetEntryQuery getAssetEntryQuery(
		AssetListEntry assetListEntry, long[] segmentsEntryIds, String userId);

}