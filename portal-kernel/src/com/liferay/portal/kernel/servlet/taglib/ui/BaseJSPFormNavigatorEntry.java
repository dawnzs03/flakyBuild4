/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.servlet.taglib.ui;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletBag;
import com.liferay.portal.kernel.portlet.PortletBagPool;
import com.liferay.portal.kernel.portlet.PortletIdCodec;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author     Julio Camarero
 * @deprecated As of Cavanaugh (7.4.x), replaced by {@link
 *             com.liferay.frontend.taglib.form.navigator.BaseJSPFormNavigatorEntry}
 */
@Deprecated
public abstract class BaseJSPFormNavigatorEntry<T>
	extends BaseFormNavigatorEntry<T> implements FormNavigatorEntry<T> {

	@Override
	public void include(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws IOException {

		ServletContext servletContext = getServletContext(httpServletRequest);

		RequestDispatcher requestDispatcher =
			servletContext.getRequestDispatcher(getJspPath());

		try {
			requestDispatcher.include(httpServletRequest, httpServletResponse);
		}
		catch (ServletException servletException) {
			_log.error(
				"Unable to include JSP " + getJspPath(), servletException);

			throw new IOException(
				"Unable to include " + getJspPath(), servletException);
		}
	}

	public void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	protected abstract String getJspPath();

	protected ServletContext getServletContext(
		HttpServletRequest httpServletRequest) {

		if (_servletContext != null) {
			return _servletContext;
		}

		String portletId = PortalUtil.getPortletId(httpServletRequest);

		if (Validator.isNotNull(portletId)) {
			String rootPortletId = PortletIdCodec.decodePortletName(portletId);

			PortletBag portletBag = PortletBagPool.get(rootPortletId);

			return portletBag.getServletContext();
		}

		return (ServletContext)httpServletRequest.getAttribute(WebKeys.CTX);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		BaseJSPFormNavigatorEntry.class);

	private ServletContext _servletContext;

}