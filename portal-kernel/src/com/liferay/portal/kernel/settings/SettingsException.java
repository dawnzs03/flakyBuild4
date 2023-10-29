/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.settings;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Iván Zaera
 */
public class SettingsException extends PortalException {

	public SettingsException() {
	}

	public SettingsException(String msg) {
		super(msg);
	}

	public SettingsException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public SettingsException(Throwable throwable) {
		super(throwable);
	}

}