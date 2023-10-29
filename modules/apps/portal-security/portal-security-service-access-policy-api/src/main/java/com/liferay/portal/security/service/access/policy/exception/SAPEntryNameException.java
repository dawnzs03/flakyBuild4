/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.security.service.access.policy.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class SAPEntryNameException extends PortalException {

	public SAPEntryNameException() {
	}

	public SAPEntryNameException(String msg) {
		super(msg);
	}

	public SAPEntryNameException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public SAPEntryNameException(Throwable throwable) {
		super(throwable);
	}

}