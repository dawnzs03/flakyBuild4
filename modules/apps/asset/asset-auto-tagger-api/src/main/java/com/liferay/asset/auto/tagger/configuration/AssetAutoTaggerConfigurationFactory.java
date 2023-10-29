/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.auto.tagger.configuration;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;

/**
 * @author Alejandro Tardín
 */
public interface AssetAutoTaggerConfigurationFactory {

	public AssetAutoTaggerConfiguration getCompanyAssetAutoTaggerConfiguration(
		Company company);

	public AssetAutoTaggerConfiguration getGroupAssetAutoTaggerConfiguration(
		Group group);

	public AssetAutoTaggerConfiguration getSystemAssetAutoTaggerConfiguration();

}