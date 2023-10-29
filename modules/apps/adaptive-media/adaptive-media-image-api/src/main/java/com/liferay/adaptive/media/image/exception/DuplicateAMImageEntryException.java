/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.adaptive.media.image.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class DuplicateAMImageEntryException extends PortalException {

	public DuplicateAMImageEntryException() {
	}

	public DuplicateAMImageEntryException(String msg) {
		super(msg);
	}

	public DuplicateAMImageEntryException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public DuplicateAMImageEntryException(Throwable throwable) {
		super(throwable);
	}

}