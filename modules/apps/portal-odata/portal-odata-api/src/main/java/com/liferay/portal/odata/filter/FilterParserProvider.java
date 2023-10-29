/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.odata.filter;

import com.liferay.portal.odata.entity.EntityModel;

/**
 * @author Cristina González
 */
public interface FilterParserProvider {

	public FilterParser provide(EntityModel entityModel);

}