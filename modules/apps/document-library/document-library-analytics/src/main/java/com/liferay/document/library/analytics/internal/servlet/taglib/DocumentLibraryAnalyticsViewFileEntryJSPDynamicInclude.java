/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.analytics.internal.servlet.taglib;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.taglib.BaseJSPDynamicInclude;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alejandro Tardín
 */
@Component(service = DynamicInclude.class)
public class DocumentLibraryAnalyticsViewFileEntryJSPDynamicInclude
	extends BaseJSPDynamicInclude {

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register(
			"com.liferay.document.library.web#/document_library" +
				"/view_file_entry.jsp#post");
		dynamicIncludeRegistry.register(
			"com.liferay.document.library.web#/document_library" +
				"/view_file_entry_simple_view.jsp#post");
	}

	@Override
	protected String getJspPath() {
		return "/dynamic_include/view_file_entry.jsp";
	}

	@Override
	protected Log getLog() {
		return _log;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		DocumentLibraryAnalyticsViewFileEntryJSPDynamicInclude.class);

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.document.library.analytics)"
	)
	private ServletContext _servletContext;

}