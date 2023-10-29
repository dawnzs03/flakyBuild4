/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.web.internal.struts;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoaderUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.struts.StrutsAction;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.saml.runtime.exception.StatusException;
import com.liferay.saml.util.JspUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mika Koivisto
 */
public abstract class BaseSamlStrutsAction implements StrutsAction {

	@Override
	public String execute(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception {

		if (!isEnabled()) {
			return "/common/referer_js.jsp";
		}

		httpServletRequest.setAttribute(
			WebKeys.RESOURCE_BUNDLE_LOADER,
			ResourceBundleLoaderUtil.getPortalResourceBundleLoader());

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			Class<? extends BaseSamlStrutsAction> clazz = getClass();

			currentThread.setContextClassLoader(clazz.getClassLoader());

			return doExecute(httpServletRequest, httpServletResponse);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}
			else {
				_log.error(exception);
			}

			Class<?> clazz = exception.getClass();

			SessionErrors.add(httpServletRequest, clazz.getName());

			if (exception instanceof StatusException) {
				StatusException statusException = (StatusException)exception;

				SessionErrors.add(
					httpServletRequest, "statusCodeURI",
					statusException.getMessage());
			}

			JspUtil.dispatch(
				httpServletRequest, httpServletResponse,
				JspUtil.PATH_PORTAL_SAML_ERROR, "status");
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return null;
	}

	public abstract boolean isEnabled();

	protected abstract String doExecute(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	private static final Log _log = LogFactoryUtil.getLog(
		BaseSamlStrutsAction.class);

}