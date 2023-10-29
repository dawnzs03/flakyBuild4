/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.users.admin.demo.data.creator.internal;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.users.admin.demo.data.creator.OmniAdminUserDemoDataCreator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Sergio González
 */
@Component(service = OmniAdminUserDemoDataCreator.class)
public class OmniAdminUserDemoDataCreatorImpl
	extends BaseUserDemoDataCreator implements OmniAdminUserDemoDataCreator {

	@Override
	public User create(long companyId) throws PortalException {
		return create(companyId, null);
	}

	@Override
	public User create(long companyId, String emailAddress)
		throws PortalException {

		User user = createUser(companyId, emailAddress);

		Role role = _roleLocalService.getRole(
			companyId, RoleConstants.ADMINISTRATOR);

		userLocalService.addRoleUser(role.getRoleId(), user);

		return userLocalService.getUser(user.getUserId());
	}

	@Reference
	private RoleLocalService _roleLocalService;

}