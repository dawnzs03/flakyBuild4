/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.editor.ckeditor.web.internal.servlet.taglib;

import com.liferay.portal.kernel.frontend.source.map.FrontendSourceMapUtil;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import java.io.IOException;
import java.io.PrintWriter;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * @author Chema Balsas
 */
@Component(service = DynamicInclude.class)
public class CKEditorOnEditorCreateDynamicInclude implements DynamicInclude {

	@Override
	public void include(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, String key)
		throws IOException {

		Bundle bundle = _bundleContext.getBundle();

		URL entryURL = bundle.getEntry(
			"/META-INF/resources/ckeditor/extension/anchor_dialog_show.js");

		FrontendSourceMapUtil.transferJS(
			entryURL.openStream(), httpServletResponse.getOutputStream());

		PrintWriter printWriter = httpServletResponse.getWriter();

		printWriter.println();

		entryURL = bundle.getEntry(
			"/META-INF/resources/ckeditor/extension/dialog_definition.js");

		FrontendSourceMapUtil.transferJS(
			entryURL.openStream(), httpServletResponse.getOutputStream());

		printWriter.println();
	}

	@Override
	public void register(
		DynamicInclude.DynamicIncludeRegistry dynamicIncludeRegistry) {

		dynamicIncludeRegistry.register(
			"com.liferay.frontend.editor.ckeditor.web#ckeditor#onEditorCreate");
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;
	}

	private BundleContext _bundleContext;

}