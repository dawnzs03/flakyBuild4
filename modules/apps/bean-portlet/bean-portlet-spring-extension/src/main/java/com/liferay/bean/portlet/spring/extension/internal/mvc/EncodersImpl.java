/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.spring.extension.internal.mvc;

import com.liferay.portal.kernel.util.HtmlUtil;

import javax.annotation.ManagedBean;

import javax.mvc.security.Encoders;

/**
 * @author Neil Griffin
 */
@ManagedBean
public class EncodersImpl implements Encoders {

	@Override
	public String html(String markup) {
		return HtmlUtil.escape(markup);
	}

	@Override
	public String js(String code) {
		return HtmlUtil.escapeJS(code);
	}

}