/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.content.dashboard.document.library.internal.item.action;

import com.liferay.content.dashboard.item.action.ContentDashboardItemAction;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.Portal;

import java.util.Locale;

import javax.portlet.PortletResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cristina González
 */
public class SharingCollaboratorsFileEntryContentDashboardItemAction
	implements ContentDashboardItemAction {

	public SharingCollaboratorsFileEntryContentDashboardItemAction(
		FileEntry fileEntry, HttpServletRequest httpServletRequest,
		Language language, Portal portal) {

		_fileEntry = fileEntry;
		_httpServletRequest = httpServletRequest;
		_language = language;
		_portal = portal;
	}

	@Override
	public String getIcon() {
		return "share";
	}

	@Override
	public String getLabel(Locale locale) {
		return _language.get(locale, "share");
	}

	@Override
	public String getName() {
		return "share";
	}

	@Override
	public Type getType() {
		return Type.SHARING_COLLABORATORS;
	}

	@Override
	public String getURL() {
		try {
			PortletResponse portletResponse =
				(PortletResponse)_httpServletRequest.getAttribute(
					JavaConstants.JAVAX_PORTLET_RESPONSE);

			return PortletURLBuilder.createRenderURL(
				_portal.getLiferayPortletResponse(portletResponse),
				"com_liferay_content_dashboard_web_portlet_" +
					"ContentDashboardAdminPortlet"
			).setMVCPath(
				"/sharing_collaborators.jsp"
			).setParameter(
				"className", FileEntry.class.getName()
			).setParameter(
				"classPK", _fileEntry.getFileEntryId()
			).setWindowState(
				LiferayWindowState.EXCLUSIVE
			).buildString();
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
		SharingCollaboratorsFileEntryContentDashboardItemAction.class);

	private final FileEntry _fileEntry;
	private final HttpServletRequest _httpServletRequest;
	private final Language _language;
	private final Portal _portal;

}