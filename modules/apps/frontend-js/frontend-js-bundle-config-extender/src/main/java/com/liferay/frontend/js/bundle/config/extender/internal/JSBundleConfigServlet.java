/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.js.bundle.config.extender.internal;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.net.URL;

import java.util.Collection;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Sierra Andrés
 * @author Chema Balsas
 */
@Component(
	property = {
		"osgi.http.whiteboard.servlet.name=com.liferay.frontend.js.bundle.config.extender.internal.JSBundleConfigServlet",
		"osgi.http.whiteboard.servlet.pattern=/js_bundle_config",
		"service.ranking:Integer=" + (Integer.MAX_VALUE - 1000)
	},
	service = Servlet.class
)
public class JSBundleConfigServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		_componentContext.enableComponent(
			JSBundleConfigPortalWebResources.class.getName());
	}

	@Activate
	@Modified
	protected void activate(
			ComponentContext componentContext, Map<String, Object> properties)
		throws Exception {

		_componentContext = componentContext;
	}

	@Override
	protected void service(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws IOException {

		httpServletResponse.setContentType(ContentTypes.TEXT_JAVASCRIPT_UTF8);

		ServletOutputStream servletOutputStream =
			httpServletResponse.getOutputStream();

		PrintWriter printWriter = new PrintWriter(servletOutputStream, true);

		Collection<JSBundleConfigRegistry.JSConfig> jsConfigs =
			_jsBundleConfigRegistry.getJSConfigs();

		if (!jsConfigs.isEmpty()) {
			printWriter.print("(function(){");

			for (JSBundleConfigRegistry.JSConfig jsConfig : jsConfigs) {
				URL url = jsConfig.getURL();

				try (InputStream inputStream = url.openStream()) {
					printWriter.print("try{");

					ServletContext servletContext =
						jsConfig.getServletContext();

					printWriter.print(
						StringBundler.concat(
							"var MODULE_PATH='", _portal.getPathProxy(),
							servletContext.getContextPath(), "';"));

					printWriter.print(
						StringUtil.removeSubstring(
							StringUtil.read(inputStream),
							"//# sourceMappingURL=config.js.map"));

					printWriter.print("}catch(error){console.error(error);}");
				}
				catch (Exception exception) {
					_log.error("Unable to open resource", exception);
				}
			}

			printWriter.print("}());");
		}

		printWriter.close();
	}

	private static final Log _log = LogFactoryUtil.getLog(
		JSBundleConfigServlet.class);

	private volatile ComponentContext _componentContext;

	@Reference
	private JSBundleConfigRegistry _jsBundleConfigRegistry;

	@Reference
	private Portal _portal;

}