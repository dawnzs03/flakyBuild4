/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.set.prototype.web.internal.portlet;

import com.liferay.layout.set.prototype.constants.LayoutSetPrototypePortletKeys;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eudaldo Alonso
 */
@Component(
	configurationPid = "com.liferay.layout.set.prototype.configuration.LayoutSetPrototypeConfiguration",
	property = {
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=portlet-users-admin",
		"com.liferay.portlet.icon=/icons/site_settings.png",
		"com.liferay.portlet.preferences-owned-by-group=true",
		"com.liferay.portlet.private-request-attributes=false",
		"com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.system=true",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=Site Template Settings",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/META-INF/resources/",
		"javax.portlet.init-param.view-template=/edit_layout_set_prototype.jsp",
		"javax.portlet.name=" + LayoutSetPrototypePortletKeys.SITE_TEMPLATE_SETTINGS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator",
		"javax.portlet.version=3.0"
	},
	service = Portlet.class
)
public class SiteTemplateSettingsPortlet extends LayoutSetPrototypePortlet {
}