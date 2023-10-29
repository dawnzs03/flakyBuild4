/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.batch;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Bryan Engler
 * @author André de Oliveira
 */
@ProviderType
public interface BatchIndexingHelper {

	public int getBulkSize(String entryClassName);

}