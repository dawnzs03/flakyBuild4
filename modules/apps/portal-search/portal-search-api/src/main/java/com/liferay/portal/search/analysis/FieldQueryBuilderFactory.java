/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.analysis;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Rodrigo Paulino
 */
@ProviderType
public interface FieldQueryBuilderFactory {

	public FieldQueryBuilder getQueryBuilder(String fieldName);

}