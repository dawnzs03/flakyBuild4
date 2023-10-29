/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.kernel.configuration.provider;

import com.liferay.portal.kernel.module.configuration.ConfigurationException;

/**
 * @author Lourdes Fernández Besada
 */
public interface AssetCategoryConfigurationProvider {

	public boolean isSearchHierarchical(long companyId)
		throws ConfigurationException;

}