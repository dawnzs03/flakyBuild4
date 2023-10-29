/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.util;

import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Marco Leo
 */
public interface CommerceCheckoutStep {

	public String getLabel(Locale locale);

	public String getName();

	public boolean isActive(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	public boolean isOrder();

	public boolean isSennaDisabled();

	public boolean isVisible(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception;

	public void render(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws Exception;

	public boolean showControls(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse);

}