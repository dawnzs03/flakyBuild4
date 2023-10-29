/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.content.dashboard.blogs.internal.item.action;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.content.dashboard.item.action.ContentDashboardItemAction;
import com.liferay.info.display.url.provider.InfoEditURLProvider;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.PortletLocalService;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.servlet.DynamicServletRequestUtil;

import java.util.Collections;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cristina González
 */
public class EditBlogsEntryContentDashboardItemAction
	implements ContentDashboardItemAction {

	public EditBlogsEntryContentDashboardItemAction(
		BlogsEntry blogsEntry, HttpServletRequest httpServletRequest,
		InfoEditURLProvider<BlogsEntry> infoEditURLProvider, Language language,
		Portal portal, PortletLocalService portletLocalService) {

		_blogsEntry = blogsEntry;
		_httpServletRequest = httpServletRequest;
		_infoEditURLProvider = infoEditURLProvider;
		_language = language;
		_portal = portal;
		_portletLocalService = portletLocalService;
	}

	@Override
	public String getIcon() {
		return "pencil";
	}

	@Override
	public String getLabel(Locale locale) {
		return _language.get(locale, "edit");
	}

	@Override
	public String getName() {
		return "edit";
	}

	@Override
	public Type getType() {
		return Type.EDIT;
	}

	@Override
	public String getURL() {
		try {
			return _infoEditURLProvider.getURL(
				_blogsEntry,
				DynamicServletRequestUtil.createDynamicServletRequest(
					_httpServletRequest,
					_portletLocalService.getPortletById(
						_portal.getPortletId(_httpServletRequest)),
					Collections.singletonMap(
						"redirect",
						new String[] {
							_portal.getCurrentURL(_httpServletRequest)
						}),
					true));
		}
		catch (Exception exception) {
			_log.error(exception);

			return StringPool.BLANK;
		}
	}

	@Override
	public String getURL(Locale locale) {
		return getURL();
	}

	private static final Log _log = LogFactoryUtil.getLog(
		EditBlogsEntryContentDashboardItemAction.class);

	private final BlogsEntry _blogsEntry;
	private final HttpServletRequest _httpServletRequest;
	private final InfoEditURLProvider<BlogsEntry> _infoEditURLProvider;
	private final Language _language;
	private final Portal _portal;
	private final PortletLocalService _portletLocalService;

}