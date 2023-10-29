/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.kernel.model;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;
import java.util.Locale;

/**
 * @author Adolfo Pérez
 */
public interface ClassTypeReader {

	public List<ClassType> getAvailableClassTypes(
		long[] groupIds, Locale locale);

	public ClassType getClassType(long classTypeId, Locale locale)
		throws PortalException;

}