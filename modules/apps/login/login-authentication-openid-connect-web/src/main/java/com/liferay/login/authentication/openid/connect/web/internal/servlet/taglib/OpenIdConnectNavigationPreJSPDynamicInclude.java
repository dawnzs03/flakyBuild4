/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.login.authentication.openid.connect.web.internal.servlet.taglib;

import com.liferay.oauth.client.persistence.model.OAuthClientEntry;
import com.liferay.oauth.client.persistence.service.OAuthClientEntryLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.taglib.BaseJSPDynamicInclude;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnect;
import com.liferay.portal.security.sso.openid.connect.constants.OpenIdConnectWebKeys;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Checks if OpenID authentication has been enabled for the portal instance when
 * Liferay Portal's Sign In portlet is requested; if so, an OpenID link is added
 * to the Sign In portlet for triggering the authentication process.
 *
 * @author Michael C. Han
 */
@Component(service = DynamicInclude.class)
public class OpenIdConnectNavigationPreJSPDynamicInclude
	extends BaseJSPDynamicInclude {

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public void include(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, String key)
		throws IOException {

		List<OAuthClientEntry> oAuthClientEntries =
			_oAuthClientEntryLocalService.
				getAuthServerWellKnownURISuffixOAuthClientEntries(
					_portal.getCompanyId(httpServletRequest),
					"openid-configuration");

		if (oAuthClientEntries.isEmpty()) {
			return;
		}

		String mvcRenderCommandName = ParamUtil.getString(
			httpServletRequest, "mvcRenderCommandName");

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		if (mvcRenderCommandName.equals(
				OpenIdConnectWebKeys.OPEN_ID_CONNECT_REQUEST_ACTION_NAME) ||
			!_openIdConnect.isEnabled(themeDisplay.getCompanyId())) {

			return;
		}

		super.include(httpServletRequest, httpServletResponse, key);
	}

	@Override
	public void register(
		DynamicInclude.DynamicIncludeRegistry dynamicIncludeRegistry) {

		dynamicIncludeRegistry.register(
			"com.liferay.login.web#/navigation.jsp#pre");
	}

	@Override
	protected String getJspPath() {
		return "/dynamic_include/com.liferay.login.web/navigation" +
			"/openid_connect.jsp";
	}

	@Override
	protected Log getLog() {
		return _log;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		OpenIdConnectNavigationPreJSPDynamicInclude.class);

	@Reference
	private OAuthClientEntryLocalService _oAuthClientEntryLocalService;

	@Reference
	private OpenIdConnect _openIdConnect;

	@Reference
	private Portal _portal;

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.login.authentication.openid.connect.web)"
	)
	private ServletContext _servletContext;

}