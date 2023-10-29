/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.friendly.url;

/**
 * @author Alejandro Tardín
 */
public interface LayoutFriendlyURLEntryHelper {

	public String getClassName(boolean privateLayout);

	public long getClassNameId(boolean privateLayout);

}