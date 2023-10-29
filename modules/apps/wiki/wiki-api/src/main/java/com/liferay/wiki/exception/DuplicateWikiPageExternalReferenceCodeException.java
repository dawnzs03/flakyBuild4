/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.wiki.exception;

import com.liferay.portal.kernel.exception.DuplicateExternalReferenceCodeException;

/**
 * @author Brian Wing Shun Chan
 */
public class DuplicateWikiPageExternalReferenceCodeException
	extends DuplicateExternalReferenceCodeException {

	public DuplicateWikiPageExternalReferenceCodeException() {
	}

	public DuplicateWikiPageExternalReferenceCodeException(String msg) {
		super(msg);
	}

	public DuplicateWikiPageExternalReferenceCodeException(
		String msg, Throwable throwable) {

		super(msg, throwable);
	}

	public DuplicateWikiPageExternalReferenceCodeException(
		Throwable throwable) {

		super(throwable);
	}

}