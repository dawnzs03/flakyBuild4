/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.tools;

import java.io.IOException;

import java.util.regex.Pattern;

/**
 * @author Hugo Huijser
 */
public interface ImportsFormatter {

	public String format(String content, Pattern importPattern)
		throws IOException;

	public String format(String content, String packageDir, String className)
		throws IOException;

}