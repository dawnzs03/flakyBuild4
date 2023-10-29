/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserGroupGroupRoleFinderUtil {

	public static java.util.List
		<com.liferay.portal.kernel.model.UserGroupGroupRole>
			findByGroupRoleType(long groupId, int roleType) {

		return getFinder().findByGroupRoleType(groupId, roleType);
	}

	public static java.util.List
		<com.liferay.portal.kernel.model.UserGroupGroupRole>
			findByUserGroupsUsers(long userId) {

		return getFinder().findByUserGroupsUsers(userId);
	}

	public static java.util.List
		<com.liferay.portal.kernel.model.UserGroupGroupRole>
			findByUserGroupsUsers(long userId, long groupId) {

		return getFinder().findByUserGroupsUsers(userId, groupId);
	}

	public static UserGroupGroupRoleFinder getFinder() {
		if (_finder == null) {
			_finder = (UserGroupGroupRoleFinder)PortalBeanLocatorUtil.locate(
				UserGroupGroupRoleFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(UserGroupGroupRoleFinder finder) {
		_finder = finder;
	}

	private static UserGroupGroupRoleFinder _finder;

}