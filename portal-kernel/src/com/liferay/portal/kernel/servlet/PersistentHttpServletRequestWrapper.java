/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author Shuyang Zhou
 */
public class PersistentHttpServletRequestWrapper
	extends HttpServletRequestWrapper implements Cloneable {

	public PersistentHttpServletRequestWrapper(
		HttpServletRequest httpServletRequest) {

		super(httpServletRequest);
	}

	@Override
	public PersistentHttpServletRequestWrapper clone() {
		try {
			return (PersistentHttpServletRequestWrapper)super.clone();
		}
		catch (CloneNotSupportedException cloneNotSupportedException) {
			throw new RuntimeException(cloneNotSupportedException);
		}
	}

}