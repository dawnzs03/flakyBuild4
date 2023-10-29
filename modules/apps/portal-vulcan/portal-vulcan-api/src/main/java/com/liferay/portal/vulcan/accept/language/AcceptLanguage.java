/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.accept.language;

import java.util.List;
import java.util.Locale;

/**
 * @author Alejandro Hernández
 */
public interface AcceptLanguage {

	public List<Locale> getLocales();

	public String getPreferredLanguageId();

	public Locale getPreferredLocale();

	public default boolean isAcceptAllLanguages() {
		return false;
	}

}