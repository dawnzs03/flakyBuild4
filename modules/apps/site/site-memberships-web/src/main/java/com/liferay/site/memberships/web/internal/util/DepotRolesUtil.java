/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.memberships.web.internal.util;

import com.liferay.depot.constants.DepotRolesConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.permission.GroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Eudaldo Alonso
 */
public class DepotRolesUtil {

	/**
	 * @see com.liferay.depot.web.internal.display.context.DepotAdminMembershipsDisplayContext.Step2#_filterGroupRoles(
	 *      List)
	 */
	public static List<Role> filterGroupRoles(
			PermissionChecker permissionChecker, long groupId, List<Role> roles)
		throws PortalException {

		if (permissionChecker.isCompanyAdmin() ||
			permissionChecker.isGroupOwner(groupId)) {

			return ListUtil.filter(
				roles,
				role ->
					!Objects.equals(
						role.getName(),
						DepotRolesConstants.
							ASSET_LIBRARY_CONNECTED_SITE_MEMBER) &&
					!Objects.equals(
						role.getName(),
						DepotRolesConstants.ASSET_LIBRARY_MEMBER));
		}

		if (!GroupPermissionUtil.contains(
				permissionChecker, groupId, ActionKeys.ASSIGN_USER_ROLES)) {

			return Collections.emptyList();
		}

		return ListUtil.filter(
			roles,
			role ->
				!Objects.equals(
					role.getName(),
					DepotRolesConstants.ASSET_LIBRARY_CONNECTED_SITE_MEMBER) &&
				!Objects.equals(
					role.getName(), DepotRolesConstants.ASSET_LIBRARY_MEMBER) &&
				!Objects.equals(
					role.getName(),
					DepotRolesConstants.ASSET_LIBRARY_ADMINISTRATOR) &&
				!Objects.equals(
					role.getName(), DepotRolesConstants.ASSET_LIBRARY_OWNER) &&
				RolePermissionUtil.contains(
					permissionChecker, groupId, role.getRoleId(),
					ActionKeys.ASSIGN_MEMBERS));
	}

}