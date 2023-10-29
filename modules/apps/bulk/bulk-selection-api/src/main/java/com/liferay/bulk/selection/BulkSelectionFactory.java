/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bulk.selection;

import java.util.Map;

/**
 * @author Adolfo Pérez
 */
public interface BulkSelectionFactory<T> {

	public BulkSelection<T> create(Map<String, String[]> parameterMap);

}