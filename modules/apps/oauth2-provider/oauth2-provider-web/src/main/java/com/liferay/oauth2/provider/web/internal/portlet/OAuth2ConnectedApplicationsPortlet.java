/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.web.internal.portlet;

import com.liferay.oauth2.provider.web.internal.constants.OAuth2ProviderPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Tomas Polesovsky
 */
@Component(
	property = {
		"com.liferay.portlet.css-class-wrapper=portlet-oauth2-provider-connected-applications",
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.preferences-owned-by-group=true",
		"com.liferay.portlet.preferences-unique-per-layout=false",
		"javax.portlet.display-name=OAuth2 Connected Applications",
		"javax.portlet.init-param.portlet-title-based-navigation=true",
		"javax.portlet.init-param.template-path=/connected_applications/",
		"javax.portlet.init-param.view-template=/connected_applications/view.jsp",
		"javax.portlet.name=" + OAuth2ProviderPortletKeys.OAUTH2_CONNECTED_APPLICATIONS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.version=3.0"
	},
	service = Portlet.class
)
public class OAuth2ConnectedApplicationsPortlet extends MVCPortlet {
}