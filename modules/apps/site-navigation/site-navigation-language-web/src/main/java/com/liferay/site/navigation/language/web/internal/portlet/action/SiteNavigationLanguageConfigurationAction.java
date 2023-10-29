/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.navigation.language.web.internal.portlet.action;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.site.navigation.language.constants.SiteNavigationLanguagePortletKeys;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = "javax.portlet.name=" + SiteNavigationLanguagePortletKeys.SITE_NAVIGATION_LANGUAGE,
	service = ConfigurationAction.class
)
public class SiteNavigationLanguageConfigurationAction
	extends DefaultConfigurationAction {

	@Override
	public String getJspPath(HttpServletRequest httpServletRequest) {
		return "/configuration.jsp";
	}

}