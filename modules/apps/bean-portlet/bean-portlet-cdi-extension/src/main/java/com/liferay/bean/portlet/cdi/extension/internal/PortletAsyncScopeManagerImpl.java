/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.cdi.extension.internal;

import com.liferay.bean.portlet.cdi.extension.internal.scope.ScopedBeanManager;
import com.liferay.bean.portlet.cdi.extension.internal.scope.ScopedBeanManagerThreadLocal;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.async.PortletAsyncScopeManager;

import java.io.Closeable;
import java.io.IOException;

import javax.portlet.PortletConfig;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * @author Neil Griffin
 */
public class PortletAsyncScopeManagerImpl implements PortletAsyncScopeManager {

	public PortletAsyncScopeManagerImpl() {
		_scopedBeanManagersInstallRunnable =
			ScopedBeanManagerThreadLocal.captureScopedBeanManagers();
	}

	@Override
	public void activateScopeContexts() {
		_scopedBeanManagersInstallRunnable.run();
	}

	@Override
	public void activateScopeContexts(
		ResourceRequest resourceRequest, ResourceResponse resourceResponse,
		PortletConfig portletConfig) {

		if (_closeable != null) {
			throw new IllegalStateException(
				"Allready called activateScopeContexts");
		}

		_closeable = ScopedBeanManagerThreadLocal.install(
			new ScopedBeanManager(
				portletConfig, resourceRequest, resourceResponse));
	}

	@Override
	public void deactivateScopeContexts(boolean close) {
		if (!close) {
			ScopedBeanManagerThreadLocal.remove();

			return;
		}

		try {
			_closeable.close();
		}
		catch (IOException ioException) {
			_log.error(ioException);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PortletAsyncScopeManagerImpl.class);

	private Closeable _closeable;
	private final Runnable _scopedBeanManagersInstallRunnable;

}