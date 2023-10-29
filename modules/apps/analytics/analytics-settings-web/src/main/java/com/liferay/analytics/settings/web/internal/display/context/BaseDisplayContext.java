/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.analytics.settings.web.internal.display.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Riccardo Ferrari
 */
public abstract class BaseDisplayContext implements DisplayContext {

	public BaseDisplayContext(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		this.httpServletRequest = httpServletRequest;
		this.httpServletResponse = httpServletResponse;
	}

	protected final HttpServletRequest httpServletRequest;
	protected final HttpServletResponse httpServletResponse;

}