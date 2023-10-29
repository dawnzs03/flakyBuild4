/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.content;

import com.liferay.portal.kernel.model.Layout;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Eudaldo Alonso
 */
@ProviderType
public interface LayoutContentProvider {

	public String getLayoutContent(
		HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse, Layout layout, Locale locale);

}