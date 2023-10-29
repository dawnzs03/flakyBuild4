/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.admin.web.internal.portal.settings.configuration.admin.display;

import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.Group;
import com.liferay.site.settings.configuration.admin.display.SiteSettingsConfigurationScreenContributor;

import java.util.Locale;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(service = SiteSettingsConfigurationScreenContributor.class)
public class CategorizationSiteSettingsConfigurationScreenContributor
	implements SiteSettingsConfigurationScreenContributor {

	@Override
	public String getCategoryKey() {
		return "assets";
	}

	@Override
	public String getJspPath() {
		return "/site_settings/categorization.jsp";
	}

	@Override
	public String getKey() {
		return "site-configuration-categorization";
	}

	@Override
	public String getName(Locale locale) {
		return _language.get(locale, "categorization");
	}

	@Override
	public String getSaveMVCActionCommandName() {
		return "/site_admin/edit_categorization";
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public boolean isVisible(Group group) {
		if (group.isCompany()) {
			return false;
		}

		return true;
	}

	@Reference
	private Language _language;

	@Reference(target = "(osgi.web.symbolicname=com.liferay.site.admin.web)")
	private ServletContext _servletContext;

}