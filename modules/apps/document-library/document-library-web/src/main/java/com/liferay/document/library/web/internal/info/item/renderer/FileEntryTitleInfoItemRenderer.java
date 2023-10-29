/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.info.item.renderer;

import com.liferay.info.item.renderer.InfoItemRenderer;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pavel Savinov
 */
@Component(
	property = "service.ranking:Integer=200", service = InfoItemRenderer.class
)
public class FileEntryTitleInfoItemRenderer
	implements InfoItemRenderer<FileEntry> {

	@Override
	public String getLabel(Locale locale) {
		return _language.get(locale, "title");
	}

	@Override
	public void render(
		FileEntry fileEntry, HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		try {
			httpServletRequest.setAttribute(
				WebKeys.DOCUMENT_LIBRARY_FILE_ENTRY, fileEntry);
			httpServletRequest.setAttribute(
				WebKeys.DOCUMENT_LIBRARY_FILE_VERSION,
				fileEntry.getFileVersion());

			RequestDispatcher requestDispatcher =
				_servletContext.getRequestDispatcher(
					"/document_library/info/item/renderer" +
						"/file_entry_title.jsp");

			requestDispatcher.include(httpServletRequest, httpServletResponse);
		}
		catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	@Reference
	private Language _language;

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.document.library.web)"
	)
	private ServletContext _servletContext;

}