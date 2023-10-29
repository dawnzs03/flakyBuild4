/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.user.groups.admin.web.internal.custom.attributes;

import com.liferay.expando.kernel.model.BaseCustomAttributesDisplay;
import com.liferay.expando.kernel.model.CustomAttributesDisplay;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.user.groups.admin.constants.UserGroupsAdminPortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Hugo Huijser
 */
@Component(
	property = "javax.portlet.name=" + UserGroupsAdminPortletKeys.USER_GROUPS_ADMIN,
	service = CustomAttributesDisplay.class
)
public class UserGroupCustomAttributesDisplay
	extends BaseCustomAttributesDisplay {

	@Override
	public String getClassName() {
		return UserGroup.class.getName();
	}

	@Override
	public String getIconCssClass() {
		return "users";
	}

}