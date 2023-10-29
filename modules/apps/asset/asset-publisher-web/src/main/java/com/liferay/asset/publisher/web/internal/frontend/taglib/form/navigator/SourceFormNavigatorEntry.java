/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.publisher.web.internal.frontend.taglib.form.navigator;

import com.liferay.asset.publisher.constants.AssetPublisherConstants;
import com.liferay.frontend.taglib.form.navigator.FormNavigatorEntry;
import com.liferay.portal.kernel.model.User;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = "form.navigator.entry.order:Integer=400",
	service = FormNavigatorEntry.class
)
public class SourceFormNavigatorEntry
	extends BaseConfigurationFormNavigatorEntry {

	@Override
	public String getCategoryKey() {
		return AssetPublisherConstants.CATEGORY_KEY_ASSET_SELECTION;
	}

	@Override
	public String getKey() {
		return "source";
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public boolean isVisible(User user, Object object) {
		return isDynamicAssetSelection();
	}

	@Override
	protected String getJspPath() {
		return "/configuration/source.jsp";
	}

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.asset.publisher.web)"
	)
	private ServletContext _servletContext;

}