/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.exception;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchRecentLayoutRevisionException extends NoSuchModelException {

	public NoSuchRecentLayoutRevisionException() {
	}

	public NoSuchRecentLayoutRevisionException(String msg) {
		super(msg);
	}

	public NoSuchRecentLayoutRevisionException(
		String msg, Throwable throwable) {

		super(msg, throwable);
	}

	public NoSuchRecentLayoutRevisionException(Throwable throwable) {
		super(throwable);
	}

}