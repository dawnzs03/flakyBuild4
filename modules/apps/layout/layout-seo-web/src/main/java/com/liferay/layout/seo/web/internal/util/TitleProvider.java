/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.seo.web.internal.util;

import com.liferay.layout.seo.kernel.LayoutSEOLinkManager;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ListMergeable;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cristina González
 */
public class TitleProvider {

	public TitleProvider(LayoutSEOLinkManager layoutSEOLinkManager) {
		_layoutSEOLinkManager = layoutSEOLinkManager;
	}

	public String getTitle(HttpServletRequest httpServletRequest)
		throws PortalException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		String portletId = (String)httpServletRequest.getAttribute(
			WebKeys.PORTLET_ID);

		ListMergeable<String> titleListMergeable =
			(ListMergeable<String>)httpServletRequest.getAttribute(
				WebKeys.PAGE_TITLE);
		ListMergeable<String> subtitleListMergeable =
			(ListMergeable<String>)httpServletRequest.getAttribute(
				WebKeys.PAGE_SUBTITLE);

		Company company = themeDisplay.getCompany();

		String title = _layoutSEOLinkManager.getFullPageTitle(
			themeDisplay.getLayout(), portletId, themeDisplay.getTilesTitle(),
			titleListMergeable, subtitleListMergeable, company.getName(),
			themeDisplay.getLocale());

		String titleModifierKey = _getTitleModifierKey(httpServletRequest);

		if (Validator.isNotNull(titleModifierKey)) {
			StringBundler sb = new StringBundler(5);

			sb.append(title);
			sb.append(StringPool.SPACE);
			sb.append(StringPool.OPEN_PARENTHESIS);
			sb.append(
				LanguageUtil.get(themeDisplay.getLocale(), titleModifierKey));
			sb.append(StringPool.CLOSE_PARENTHESIS);

			return sb.toString();
		}

		return title;
	}

	private String _getTitleModifierKey(HttpServletRequest httpServletRequest) {
		if (_isEditMode(httpServletRequest)) {
			return "editing";
		}
		else if (_isConfigurationMode(httpServletRequest)) {
			return "configuring";
		}

		return null;
	}

	private boolean _isConfigurationMode(
		HttpServletRequest httpServletRequest) {

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		if (serviceContext != null) {
			httpServletRequest = serviceContext.getRequest();
		}

		String mvcCommand = ParamUtil.getString(
			httpServletRequest, "mvcRenderCommandName");

		if (mvcCommand.equals("/layout_admin/edit_layout")) {
			return true;
		}

		return false;
	}

	private boolean _isEditMode(HttpServletRequest httpServletRequest) {
		HttpServletRequest originalHttpServletRequest =
			PortalUtil.getOriginalServletRequest(httpServletRequest);

		String layoutMode = ParamUtil.getString(
			originalHttpServletRequest, "p_l_mode", Constants.VIEW);

		if (layoutMode.equals(Constants.EDIT)) {
			return true;
		}

		return false;
	}

	private final LayoutSEOLinkManager _layoutSEOLinkManager;

}