/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.elasticsearch7.internal.aggregation.metrics;

import com.liferay.portal.search.elasticsearch7.internal.LiferayElasticsearchIndexingFixtureFactory;
import com.liferay.portal.search.test.util.aggregation.metrics.BasePercentileRanksAggregationTestCase;
import com.liferay.portal.search.test.util.indexing.IndexingFixture;
import com.liferay.portal.test.rule.LiferayUnitTestRule;

import org.junit.ClassRule;
import org.junit.Rule;

/**
 * @author Rafael Praxedes
 */
public class PercentileRanksAggregationTest
	extends BasePercentileRanksAggregationTestCase {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Override
	protected IndexingFixture createIndexingFixture() throws Exception {
		return LiferayElasticsearchIndexingFixtureFactory.getInstance();
	}

}