/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.internal.filter;

import com.liferay.portal.search.filter.DateRangeFilterBuilder;
import com.liferay.portal.search.filter.FilterBuilders;
import com.liferay.portal.search.filter.TermsSetFilterBuilder;

import org.osgi.service.component.annotations.Component;

/**
 * @author André de Oliveira
 */
@Component(service = FilterBuilders.class)
public class FilterBuildersImpl implements FilterBuilders {

	@Override
	public DateRangeFilterBuilder dateRangeFilterBuilder() {
		return new DateRangeFilterBuilderImpl();
	}

	@Override
	public TermsSetFilterBuilder termsSetFilterBuilder() {
		return new TermsSetFilterBuilderImpl();
	}

}