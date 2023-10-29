/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface UserGroupGroupRoleFinder {

	public java.util.List<com.liferay.portal.kernel.model.UserGroupGroupRole>
		findByGroupRoleType(long groupId, int roleType);

	public java.util.List<com.liferay.portal.kernel.model.UserGroupGroupRole>
		findByUserGroupsUsers(long userId);

	public java.util.List<com.liferay.portal.kernel.model.UserGroupGroupRole>
		findByUserGroupsUsers(long userId, long groupId);

}