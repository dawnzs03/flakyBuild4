/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.info.filter;

import com.liferay.info.type.Keyed;

import java.util.Map;

/**
 * @author Eudaldo Alonso
 */
public interface InfoFilterProvider<T extends InfoFilter> extends Keyed {

	public T create(Map<String, String[]> values);

}