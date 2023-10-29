/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portlet.configuration.css.web.internal.frontend.taglib.form.navigator;

import com.liferay.frontend.taglib.form.navigator.FormNavigatorEntry;
import com.liferay.portlet.configuration.css.web.internal.constants.PortletConfigurationCSSConstants;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = "form.navigator.entry.order:Integer=100",
	service = FormNavigatorEntry.class
)
public class GeneralFormNavigatorEntry extends BaseFormNavigatorEntry {

	@Override
	public String getCategoryKey() {
		return PortletConfigurationCSSConstants.CATEGORY_KEY_GENERAL;
	}

	@Override
	public String getKey() {
		return "general";
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	protected String getJspPath() {
		return "/general.jsp";
	}

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.portlet.configuration.css.web)"
	)
	private ServletContext _servletContext;

}