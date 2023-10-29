/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.google.places.web.internal.portal.settings.configuration.admin.display;

import com.liferay.google.places.constants.GooglePlacesWebKeys;
import com.liferay.google.places.util.GooglePlacesUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.settings.configuration.admin.display.PortalSettingsConfigurationScreenContributor;

import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Rodrigo Paulino
 */
@Component(service = PortalSettingsConfigurationScreenContributor.class)
public class GooglePlacesPortalSettingsConfigurationScreenContributor
	implements PortalSettingsConfigurationScreenContributor {

	@Override
	public String getCategoryKey() {
		return "maps";
	}

	@Override
	public String getJspPath() {
		return "/portal_settings/google_places.jsp";
	}

	@Override
	public String getKey() {
		return "google-places-portal-settings";
	}

	@Override
	public String getName(Locale locale) {
		return _language.get(locale, "google-places");
	}

	@Override
	public String getSaveMVCActionCommandName() {
		return "/portal_settings/edit_company";
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public void setAttributes(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		PortalSettingsConfigurationScreenContributor.super.setAttributes(
			httpServletRequest, httpServletResponse);

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		httpServletRequest.setAttribute(
			GooglePlacesWebKeys.GOOGLE_PLACES_API_KEY,
			GooglePlacesUtil.getGooglePlacesAPIKey(
				themeDisplay.getCompanyId()));
	}

	@Reference
	private Language _language;

	@Reference(target = "(osgi.web.symbolicname=com.liferay.google.places.web)")
	private ServletContext _servletContext;

}