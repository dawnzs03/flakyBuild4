/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.google.places.util;

import com.liferay.google.places.constants.GooglePlacesWebKeys;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;

import javax.portlet.PortletPreferences;

/**
 * @author Rodrigo Paulino
 */
public class GooglePlacesUtil {

	public static String getGooglePlacesAPIKey(long companyId) {
		PortletPreferences companyPortletPreferences =
			PrefsPropsUtil.getPreferences(companyId);

		return companyPortletPreferences.getValue(
			GooglePlacesWebKeys.GOOGLE_PLACES_API_KEY, null);
	}

	public static String getGooglePlacesAPIKey(
		long companyId, long groupId, GroupLocalService groupLocalService) {

		String googlePlacesAPIKey = getGooglePlacesAPIKey(companyId);

		Group group = groupLocalService.fetchGroup(groupId);

		if (group == null) {
			return googlePlacesAPIKey;
		}

		if (group.isStagingGroup()) {
			group = group.getLiveGroup();
		}

		return GetterUtil.getString(
			group.getTypeSettingsProperty(
				GooglePlacesWebKeys.GOOGLE_PLACES_API_KEY),
			googlePlacesAPIKey);
	}

}