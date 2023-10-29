/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.spi.searcher;

import com.liferay.portal.search.searcher.SearchRequest;

/**
 * @author André de Oliveira
 */
public interface SearchRequestContributor {

	public SearchRequest contribute(SearchRequest searchRequest);

}