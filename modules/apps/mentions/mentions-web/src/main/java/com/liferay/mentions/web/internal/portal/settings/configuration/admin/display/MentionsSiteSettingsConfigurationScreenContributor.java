/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.mentions.web.internal.portal.settings.configuration.admin.display;

import com.liferay.mentions.constants.MentionsWebKeys;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PrefsParamUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.site.settings.configuration.admin.display.SiteSettingsConfigurationScreenContributor;

import java.util.Locale;

import javax.portlet.PortletPreferences;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(service = SiteSettingsConfigurationScreenContributor.class)
public class MentionsSiteSettingsConfigurationScreenContributor
	implements SiteSettingsConfigurationScreenContributor {

	@Override
	public String getCategoryKey() {
		return "community-tools";
	}

	@Override
	public String getJspPath() {
		return "/site_settings/mentions.jsp";
	}

	@Override
	public String getKey() {
		return "site-configuration-mentions";
	}

	@Override
	public String getName(Locale locale) {
		return _language.get(locale, "mentions");
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public boolean isVisible(Group group) {
		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

		PortletPreferences companyPortletPreferences =
			PrefsPropsUtil.getPreferences(group.getCompanyId());

		return PrefsParamUtil.getBoolean(
			companyPortletPreferences, themeDisplay.getRequest(),
			"mentionsEnabled", true);
	}

	@Override
	public void setAttributes(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		SiteSettingsConfigurationScreenContributor.super.setAttributes(
			httpServletRequest, httpServletResponse);

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		Group siteGroup = themeDisplay.getSiteGroup();

		UnicodeProperties typeSettingsUnicodeProperties =
			siteGroup.getTypeSettingsProperties();

		boolean groupMentionsEnabled = GetterUtil.getBoolean(
			typeSettingsUnicodeProperties.getProperty("mentionsEnabled"), true);

		httpServletRequest.setAttribute(
			MentionsWebKeys.GROUP_MENTIONS_ENABLED, groupMentionsEnabled);
	}

	@Reference
	private Language _language;

	@Reference(target = "(osgi.web.symbolicname=com.liferay.mentions.web)")
	private ServletContext _servletContext;

}