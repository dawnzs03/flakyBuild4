/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.search.experiences.web.internal.blueprint.options.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.permission.PortletPermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.search.experiences.constants.SXPPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Kevin Tan
 */
@Component(
	enabled = false,
	property = {
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.css-class-wrapper=portlet-sxp-blueprint-options",
		"com.liferay.portlet.display-category=category.search",
		"com.liferay.portlet.header-portlet-css=/sxp_blueprint_options/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/META-INF/resources/sxp_blueprint_options/",
		"javax.portlet.init-param.view-template=/sxp_blueprint_options/view.jsp",
		"javax.portlet.name=" + SXPPortletKeys.SXP_BLUEPRINT_OPTIONS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.version=3.0"
	},
	service = Portlet.class
)
public class SXPBlueprintOptionsPortlet extends MVCPortlet {

	@Override
	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		if (!_containsConfiguration(renderRequest)) {
			renderRequest.setAttribute(
				WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, Boolean.TRUE);
		}

		super.render(renderRequest, renderResponse);
	}

	private boolean _containsConfiguration(RenderRequest renderRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		try {
			return _portletPermission.contains(
				themeDisplay.getPermissionChecker(), themeDisplay.getPlid(),
				_portal.getPortletId(renderRequest), ActionKeys.CONFIGURATION);
		}
		catch (PortalException portalException) {
			_log.error(portalException);

			return false;
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SXPBlueprintOptionsPortlet.class);

	@Reference
	private Portal _portal;

	@Reference
	private PortletPermission _portletPermission;

}