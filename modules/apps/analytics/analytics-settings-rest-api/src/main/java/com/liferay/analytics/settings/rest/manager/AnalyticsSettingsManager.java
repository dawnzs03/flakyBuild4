/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.analytics.settings.rest.manager;

import com.liferay.analytics.settings.configuration.AnalyticsConfiguration;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Riccardo Ferrari
 */
@ProviderType
public interface AnalyticsSettingsManager {

	public void deleteCompanyConfiguration(long companyId)
		throws ConfigurationException;

	public AnalyticsConfiguration getAnalyticsConfiguration(long companyId)
		throws ConfigurationException;

	public Long[] getCommerceChannelIds(
			String analyticsChannelId, long companyId)
		throws Exception;

	public Long[] getSiteIds(String analyticsChannelId, long companyId)
		throws Exception;

	public boolean isAnalyticsEnabled(long companyId) throws Exception;

	public boolean isSiteIdSynced(long companyId, long groupId)
		throws Exception;

	public boolean syncedAccountFieldsChanged(long companyId) throws Exception;

	public boolean syncedAccountSettingsChanged(long companyId)
		throws Exception;

	public boolean syncedAccountSettingsEnabled(long companyId)
		throws Exception;

	public boolean syncedCommerceSettingsChanged(long companyId)
		throws Exception;

	public boolean syncedCommerceSettingsEnabled(long companyId)
		throws Exception;

	public boolean syncedContactSettingsChanged(long companyId)
		throws Exception;

	public boolean syncedContactSettingsEnabled(long companyId)
		throws Exception;

	public boolean syncedOrderFieldsChanged(long companyId) throws Exception;

	public boolean syncedProductFieldsChanged(long companyId) throws Exception;

	public boolean syncedUserFieldsChanged(long companyId) throws Exception;

	public String[] updateCommerceChannelIds(
			String analyticsChannelId, long companyId,
			Long[] dataSourceCommerceChannelIds)
		throws Exception;

	public void updateCompanyConfiguration(
			long companyId, Map<String, Object> properties)
		throws Exception;

	public String[] updateSiteIds(
			String analyticsChannelId, long companyId, Long[] dataSourceSiteIds)
		throws Exception;

}