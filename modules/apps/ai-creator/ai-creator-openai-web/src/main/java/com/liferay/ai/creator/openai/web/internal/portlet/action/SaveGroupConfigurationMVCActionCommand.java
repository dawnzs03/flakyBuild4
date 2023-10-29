/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.ai.creator.openai.web.internal.portlet.action;

import com.liferay.ai.creator.openai.configuration.manager.AICreatorOpenAIConfigurationManager;
import com.liferay.configuration.admin.constants.ConfigurationAdminPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.permission.GroupPermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Lourdes Fernández Besada
 */
@Component(
	property = {
		"javax.portlet.name=" + ConfigurationAdminPortletKeys.SITE_SETTINGS,
		"mvc.command.name=/site_settings/save_group_configuration"
	},
	service = MVCActionCommand.class
)
public class SaveGroupConfigurationMVCActionCommand
	extends BaseSaveConfigurationMVCActionCommand {

	@Override
	protected void checkPermission(ThemeDisplay themeDisplay)
		throws PortalException, PortletException {

		_groupPermission.check(
			themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroup(),
			ActionKeys.UPDATE);
	}

	@Override
	protected void saveAICreatorOpenAIConfiguration(
			String apiKey, boolean enableOpenAI, ThemeDisplay themeDisplay)
		throws ConfigurationException {

		_aiCreatorOpenAIConfigurationManager.
			saveAICreatorOpenAIGroupConfiguration(
				themeDisplay.getScopeGroupId(), apiKey, enableOpenAI);
	}

	@Reference
	private AICreatorOpenAIConfigurationManager
		_aiCreatorOpenAIConfigurationManager;

	@Reference
	private GroupPermission _groupPermission;

}