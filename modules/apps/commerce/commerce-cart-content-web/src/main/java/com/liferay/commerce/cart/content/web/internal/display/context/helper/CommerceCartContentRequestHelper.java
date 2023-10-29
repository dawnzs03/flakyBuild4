/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.cart.content.web.internal.display.context.helper;

import com.liferay.commerce.constants.CommerceWebKeys;
import com.liferay.commerce.context.CommerceContext;
import com.liferay.portal.kernel.display.context.helper.BaseRequestHelper;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Andrea Di Giorgi
 */
public class CommerceCartContentRequestHelper extends BaseRequestHelper {

	public CommerceCartContentRequestHelper(
		HttpServletRequest httpServletRequest) {

		super(httpServletRequest);
	}

	public CommerceContext getCommerceContext() {
		HttpServletRequest httpServletRequest = getRequest();

		return (CommerceContext)httpServletRequest.getAttribute(
			CommerceWebKeys.COMMERCE_CONTEXT);
	}

}