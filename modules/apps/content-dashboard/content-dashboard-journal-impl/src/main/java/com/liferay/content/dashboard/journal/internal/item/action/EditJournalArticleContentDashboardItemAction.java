/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.content.dashboard.journal.internal.item.action;

import com.liferay.content.dashboard.item.action.ContentDashboardItemAction;
import com.liferay.info.display.url.provider.InfoEditURLProvider;
import com.liferay.journal.model.JournalArticle;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.service.PortletLocalService;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.servlet.DynamicServletRequestUtil;

import java.util.Collections;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cristina González
 */
public class EditJournalArticleContentDashboardItemAction
	implements ContentDashboardItemAction {

	public EditJournalArticleContentDashboardItemAction(
		InfoEditURLProvider<JournalArticle> infoEditURLProvider,
		HttpServletRequest httpServletRequest, JournalArticle journalArticle,
		Language language, Portal portal,
		PortletLocalService portletLocalService) {

		_infoEditURLProvider = infoEditURLProvider;
		_httpServletRequest = httpServletRequest;
		_journalArticle = journalArticle;
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
		Portlet portlet = _portletLocalService.getPortletById(
			_portal.getPortletId(_httpServletRequest));

		HttpServletRequest httpServletRequest =
			DynamicServletRequestUtil.createDynamicServletRequest(
				_httpServletRequest, portlet,
				Collections.singletonMap(
					"redirect",
					new String[] {_portal.getCurrentURL(_httpServletRequest)}),
				true);

		try {
			String url = _infoEditURLProvider.getURL(
				_journalArticle, httpServletRequest);

			if (url == null) {
				return StringPool.BLANK;
			}

			return url;
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
		EditJournalArticleContentDashboardItemAction.class);

	private final HttpServletRequest _httpServletRequest;
	private final InfoEditURLProvider<JournalArticle> _infoEditURLProvider;
	private final JournalArticle _journalArticle;
	private final Language _language;
	private final Portal _portal;
	private final PortletLocalService _portletLocalService;

}