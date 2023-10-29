/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.configuration.manager;

import com.liferay.portal.kernel.model.Role;

/**
 * @author Mikel Lorza
 */
public interface MenuAccessConfigurationManager {

	public void addAccessRoleToControlMenu(Role role) throws Exception;

	public void deleteRoleAccessToControlMenu(Role role) throws Exception;

	public String[] getAccessToControlMenuRoleIds(long groupId)
		throws Exception;

	public boolean isShowControlMenuByRole(long groupId) throws Exception;

	public void updateMenuAccessConfiguration(
			long groupId, String[] roleIdsCanSeeControlMenu,
			boolean showControlMenuByRole)
		throws Exception;

}