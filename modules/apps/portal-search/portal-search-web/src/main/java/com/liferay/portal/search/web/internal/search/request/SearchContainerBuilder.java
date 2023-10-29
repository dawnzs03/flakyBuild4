/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.web.internal.search.request;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.web.search.request.SearchSettings;

/**
 * @author André de Oliveira
 */
public interface SearchContainerBuilder {

	public SearchContainer<Document> getSearchContainer(
		SearchSettings searchSettings);

}