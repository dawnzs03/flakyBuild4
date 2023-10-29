/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.util;

import aQute.bnd.annotation.ProviderType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alessio Antonio Rendina
 */
@ProviderType
public interface CPSubscriptionTypeJSPContributor {

	public void render(
			Object object, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	public void render(
			Object object, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, boolean payment)
		throws Exception;

}