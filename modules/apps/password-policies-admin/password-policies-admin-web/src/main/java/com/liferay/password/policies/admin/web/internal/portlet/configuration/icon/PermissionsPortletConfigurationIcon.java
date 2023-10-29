/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.password.policies.admin.web.internal.portlet.configuration.icon;

import com.liferay.password.policies.admin.constants.PasswordPoliciesAdminPortletKeys;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PasswordPolicy;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.configuration.icon.BasePortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.configuration.icon.PortletConfigurationIcon;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.permission.PasswordPolicyPermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.taglib.security.PermissionsURLTag;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pei-Jung Lan
 */
@Component(
	property = {
		"javax.portlet.name=" + PasswordPoliciesAdminPortletKeys.PASSWORD_POLICIES_ADMIN,
		"path=/edit_password_policy.jsp",
		"path=/edit_password_policy_assignments.jsp"
	},
	service = PortletConfigurationIcon.class
)
public class PermissionsPortletConfigurationIcon
	extends BasePortletConfigurationIcon {

	@Override
	public String getMessage(PortletRequest portletRequest) {
		return _language.get(getLocale(portletRequest), "permissions");
	}

	@Override
	public String getURL(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		try {
			return PermissionsURLTag.doTag(
				StringPool.BLANK, PasswordPolicy.class.getName(),
				themeDisplay.getScopeGroupName(), null,
				String.valueOf(_getPasswordPolicyId(portletRequest)),
				LiferayWindowState.POP_UP.toString(), null,
				themeDisplay.getRequest());
		}
		catch (Exception exception) {
			_log.error(exception);
		}

		return StringPool.BLANK;
	}

	@Override
	public double getWeight() {
		return 103;
	}

	@Override
	public boolean isShow(PortletRequest portletRequest) {
		if (_getPasswordPolicyId(portletRequest) == 0) {
			return false;
		}

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (_passwordPolicyPermission.contains(
				themeDisplay.getPermissionChecker(),
				_getPasswordPolicyId(portletRequest), ActionKeys.PERMISSIONS)) {

			return true;
		}

		return false;
	}

	@Override
	public boolean isUseDialog() {
		return true;
	}

	private long _getPasswordPolicyId(PortletRequest portletRequest) {
		return ParamUtil.getLong(
			_portal.getHttpServletRequest(portletRequest), "passwordPolicyId");
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PermissionsPortletConfigurationIcon.class);

	@Reference
	private Language _language;

	@Reference
	private PasswordPolicyPermission _passwordPolicyPermission;

	@Reference
	private Portal _portal;

}