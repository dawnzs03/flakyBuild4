/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.test.log;

import java.io.Closeable;

import java.util.List;

/**
 * @author Dante Wang
 */
public interface LogCapture extends Closeable {

	@Override
	public void close();

	public List<LogEntry> getLogEntries();

	public List<LogEntry> resetPriority(String priority);

}