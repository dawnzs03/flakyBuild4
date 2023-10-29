/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.display.context;

import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alicia Garcia
 */
public class DLEditFileEntryTypeDataEngineDisplayContext {

	public DLEditFileEntryTypeDataEngineDisplayContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse) {

		_liferayPortletRequest = liferayPortletRequest;
		_liferayPortletResponse = liferayPortletResponse;

		_httpServletRequest = PortalUtil.getHttpServletRequest(
			liferayPortletRequest);
	}

	public List<Map<String, Object>> getAdditionalPanels(
		String npmResolvedPackageName) {

		List<Map<String, Object>> additionalPanels = new ArrayList<>();

		additionalPanels.add(
			HashMapBuilder.<String, Object>put(
				"icon", "cog"
			).put(
				"label", LanguageUtil.get(_httpServletRequest, "details")
			).put(
				"pluginEntryPoint",
				npmResolvedPackageName +
					"/document_library/js/data-engine/panels/index.es"
			).put(
				"sidebarPanelId", "details"
			).put(
				"url",
				() -> PortletURLBuilder.createRenderURL(
					_liferayPortletResponse
				).setMVCPath(
					"/document_library/ddm/details.jsp"
				).setParameter(
					"fileEntryTypeId",
					ParamUtil.getLong(_liferayPortletRequest, "fileEntryTypeId")
				).setWindowState(
					LiferayWindowState.EXCLUSIVE
				).buildString()
			).build());

		additionalPanels.add(
			HashMapBuilder.<String, Object>put(
				"icon", "document"
			).put(
				"label",
				LanguageUtil.get(
					_httpServletRequest, "additional-metadata-fields")
			).put(
				"pluginEntryPoint",
				npmResolvedPackageName +
					"/document_library/js/data-engine/panels/index.es"
			).put(
				"sidebarPanelId", "additionalMetadataFields"
			).put(
				"url",
				() -> PortletURLBuilder.createRenderURL(
					_liferayPortletResponse
				).setMVCPath(
					"/document_library/ddm/additional_metadata_fields.jsp"
				).setParameter(
					"fileEntryTypeId",
					ParamUtil.getLong(_liferayPortletRequest, "fileEntryTypeId")
				).setWindowState(
					LiferayWindowState.EXCLUSIVE
				).buildString()
			).build());

		DLFileEntryType fileEntryType =
			(DLFileEntryType)_liferayPortletRequest.getAttribute(
				WebKeys.DOCUMENT_LIBRARY_FILE_ENTRY_TYPE);

		if (fileEntryType == null) {
			additionalPanels.add(
				HashMapBuilder.<String, Object>put(
					"icon", "lock"
				).put(
					"label",
					LanguageUtil.get(_httpServletRequest, "permissions")
				).put(
					"pluginEntryPoint",
					npmResolvedPackageName +
						"/document_library/js/data-engine/panels/index.es"
				).put(
					"sidebarPanelId", "permissions"
				).put(
					"url",
					() -> PortletURLBuilder.createRenderURL(
						_liferayPortletResponse
					).setMVCPath(
						"/document_library/ddm/permissions.jsp"
					).setWindowState(
						LiferayWindowState.EXCLUSIVE
					).buildString()
				).build());
		}

		return additionalPanels;
	}

	private final HttpServletRequest _httpServletRequest;
	private final LiferayPortletRequest _liferayPortletRequest;
	private final LiferayPortletResponse _liferayPortletResponse;

}