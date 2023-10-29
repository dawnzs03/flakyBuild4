/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.internal.servlet.filter;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.saml.persistence.model.SamlSpSession;
import com.liferay.saml.runtime.configuration.SamlProviderConfigurationHelper;
import com.liferay.saml.runtime.servlet.profile.SingleLogoutProfile;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Mika Koivisto
 */
@Component(
	property = {
		"before-filter=Session Id Filter", "dispatcher=FORWARD",
		"dispatcher=REQUEST",
		"init-param.url-regex-ignore-pattern=^/html/.+\\.(css|gif|html|ico|jpg|js|png)(\\?.*)?$",
		"servlet-context-name=",
		"servlet-filter-name=SP Session Termination SAML Portal Filter",
		"url-pattern=/*"
	},
	service = Filter.class
)
public class SpSessionTerminationSamlPortalFilter extends BaseSamlPortalFilter {

	@Override
	public void init(FilterConfig filterConfig) {
		super.init(filterConfig);

		_servletContext = filterConfig.getServletContext();
	}

	@Override
	public boolean isFilterEnabled() {
		return true;
	}

	@Override
	public boolean isFilterEnabled(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		if (httpServletRequest.getSession(false) != null) {
			return true;
		}

		return false;
	}

	@Override
	protected void doProcessFilter(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, FilterChain filterChain)
		throws Exception {

		SamlSpSession samlSpSession = _singleLogoutProfile.getSamlSpSession(
			httpServletRequest);

		if ((samlSpSession != null) && samlSpSession.isTerminated()) {
			_singleLogoutProfile.terminateSpSession(
				httpServletRequest, httpServletResponse);

			_singleLogoutProfile.logout(
				httpServletRequest, httpServletResponse);
		}

		filterChain.doFilter(httpServletRequest, httpServletResponse);
	}

	@Override
	protected Log getLog() {
		return _log;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SpSessionTerminationSamlPortalFilter.class);

	@Reference
	private Portal _portal;

	@Reference
	private SamlProviderConfigurationHelper _samlProviderConfigurationHelper;

	private ServletContext _servletContext;

	@Reference
	private SingleLogoutProfile _singleLogoutProfile;

}