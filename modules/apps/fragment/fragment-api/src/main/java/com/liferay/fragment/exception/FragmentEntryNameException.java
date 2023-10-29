/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.fragment.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Brian Wing Shun Chan
 */
public class FragmentEntryNameException extends PortalException {

	public FragmentEntryNameException() {
	}

	public FragmentEntryNameException(String msg) {
		super(msg);
	}

	public FragmentEntryNameException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public FragmentEntryNameException(Throwable throwable) {
		super(throwable);
	}

}