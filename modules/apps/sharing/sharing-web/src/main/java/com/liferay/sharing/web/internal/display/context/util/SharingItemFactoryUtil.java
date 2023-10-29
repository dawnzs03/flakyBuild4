/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sharing.web.internal.display.context.util;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Joao Victor Alves
 */
public class SharingItemFactoryUtil {

	public static String getManageCollaboratorsLabel(
		HttpServletRequest httpServletRequest) {

		return _getLabel("manage-collaborators", httpServletRequest);
	}

	public static String getSharingLabel(
		HttpServletRequest httpServletRequest) {

		return _getLabel("share", httpServletRequest);
	}

	private static String _getLabel(
		String key, HttpServletRequest httpServletRequest) {

		return LanguageUtil.get(PortalUtil.getLocale(httpServletRequest), key);
	}

}