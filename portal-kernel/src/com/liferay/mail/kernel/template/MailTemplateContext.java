/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.mail.kernel.template;

import com.liferay.portal.kernel.util.EscapableLocalizableFunction;

import java.util.Map;

/**
 * @author Adolfo Pérez
 */
public interface MailTemplateContext {

	public MailTemplateContext aggregateWith(
		MailTemplateContext mailTemplateContext);

	public Map<String, EscapableLocalizableFunction> getReplacements();

}