/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.display.context;

import com.liferay.portal.kernel.display.context.BaseDisplayContext;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Iván Zaera
 */
public abstract class BaseIGDisplayContext<T extends IGDisplayContext>
	extends BaseDisplayContext<T> implements IGDisplayContext {

	public BaseIGDisplayContext(
		UUID uuid, T parentIGDisplayContext,
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		super(
			uuid, parentIGDisplayContext, httpServletRequest,
			httpServletResponse);
	}

}