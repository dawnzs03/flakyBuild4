/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.ai.creator.openai.web.internal.client;

import java.util.Locale;

/**
 * @author Lourdes Fernández Besada
 */
public interface AICreatorOpenAIClient {

	public String getCompletion(
			String apiKey, String content, Locale locale, String tone,
			int words)
		throws Exception;

	public void validateAPIKey(String apiKey) throws Exception;

}