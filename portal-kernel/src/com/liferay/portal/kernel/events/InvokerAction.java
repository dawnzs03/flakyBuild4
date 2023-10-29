/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.events;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 */
public class InvokerAction extends Action {

	public InvokerAction(Action action, ClassLoader classLoader) {
		_action = action;
		_classLoader = classLoader;
	}

	@Override
	public void run(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws ActionException {

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			_action.run(httpServletRequest, httpServletResponse);
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}
	}

	private final Action _action;
	private final ClassLoader _classLoader;

}