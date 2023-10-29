/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.builder.internal.util;

import com.liferay.headless.builder.application.APIApplication;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.test.rule.LiferayUnitTestRule;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Sergio Jiménez del Coso
 */
public class OpenAPIUtilTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Test
	public void testGetCollectionOperationId() {
		Assert.assertEquals(
			"getCamelSchemasPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/camelschemas",
				APIApplication.Endpoint.RetrieveType.COLLECTION,
				"CamelSchema"));
		Assert.assertEquals(
			"getPathNamePage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/path-name",
				APIApplication.Endpoint.RetrieveType.COLLECTION, null));
		Assert.assertEquals(
			"getPathNamePage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/path-name",
				APIApplication.Endpoint.RetrieveType.COLLECTION, "Schema"));
		Assert.assertEquals(
			"getSchemasWhateverPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/schema/whatever",
				APIApplication.Endpoint.RetrieveType.COLLECTION, "Schema"));
		Assert.assertEquals(
			"getScopeScopeKeyNoSchemaPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/scopes/{scopeKey}/no-schema",
				APIApplication.Endpoint.RetrieveType.COLLECTION, null));
		Assert.assertEquals(
			"getScopeScopeKeySiteScopedPathPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/scopes/{scopeKey}/site-scoped-path",
				APIApplication.Endpoint.RetrieveType.COLLECTION, "Schema"));
		Assert.assertEquals(
			"getSegmentASegmentBPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/segment-a/segment-b",
				APIApplication.Endpoint.RetrieveType.COLLECTION, "Schema"));
		Assert.assertEquals(
			"getWhateverPage",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/whatever",
				APIApplication.Endpoint.RetrieveType.COLLECTION,
				"CamelSchema"));
	}

	@Test
	public void testGetIndividualOperationId() {
		Assert.assertEquals(
			"getCamelSchema",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/camelschemas/{camelSchemaId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT,
				"CamelSchema"));
		Assert.assertEquals(
			"getPathNamePathName",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/path-names/{pathNameId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT, null));
		Assert.assertEquals(
			"getPathName",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/path-names/{pathNameId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT, "Schema"));
		Assert.assertEquals(
			"getSchemaWhatever",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/schema/whatever/{whateverId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT, "Schema"));
		Assert.assertEquals(
			"getSegmentASegmentB",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/segment-a/segment-b/{segmentBId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT, "Schema"));
		Assert.assertEquals(
			"getWhatever",
			OpenAPIUtil.getOperationId(
				Http.Method.GET, "/whatever/{whateverId}",
				APIApplication.Endpoint.RetrieveType.SINGLE_ELEMENT,
				"CamelSchema"));
	}

}