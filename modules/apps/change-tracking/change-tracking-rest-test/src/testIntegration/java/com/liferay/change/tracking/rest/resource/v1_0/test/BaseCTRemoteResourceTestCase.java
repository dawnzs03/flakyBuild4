/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.change.tracking.rest.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.change.tracking.rest.client.dto.v1_0.CTRemote;
import com.liferay.change.tracking.rest.client.http.HttpInvoker;
import com.liferay.change.tracking.rest.client.pagination.Page;
import com.liferay.change.tracking.rest.client.pagination.Pagination;
import com.liferay.change.tracking.rest.client.resource.v1_0.CTRemoteResource;
import com.liferay.change.tracking.rest.client.serdes.v1_0.CTRemoteSerDes;
import com.liferay.petra.function.UnsafeTriConsumer;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.lang.time.DateUtils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author David Truong
 * @generated
 */
@Generated("")
public abstract class BaseCTRemoteResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_ctRemoteResource.setContextCompany(testCompany);

		CTRemoteResource.Builder builder = CTRemoteResource.builder();

		ctRemoteResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		CTRemote ctRemote1 = randomCTRemote();

		String json = objectMapper.writeValueAsString(ctRemote1);

		CTRemote ctRemote2 = CTRemoteSerDes.toDTO(json);

		Assert.assertTrue(equals(ctRemote1, ctRemote2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		CTRemote ctRemote = randomCTRemote();

		String json1 = objectMapper.writeValueAsString(ctRemote);
		String json2 = CTRemoteSerDes.toJSON(ctRemote);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		CTRemote ctRemote = randomCTRemote();

		ctRemote.setClientId(regex);
		ctRemote.setClientSecret(regex);
		ctRemote.setDescription(regex);
		ctRemote.setName(regex);
		ctRemote.setOwnerName(regex);
		ctRemote.setUrl(regex);

		String json = CTRemoteSerDes.toJSON(ctRemote);

		Assert.assertFalse(json.contains(regex));

		ctRemote = CTRemoteSerDes.toDTO(json);

		Assert.assertEquals(regex, ctRemote.getClientId());
		Assert.assertEquals(regex, ctRemote.getClientSecret());
		Assert.assertEquals(regex, ctRemote.getDescription());
		Assert.assertEquals(regex, ctRemote.getName());
		Assert.assertEquals(regex, ctRemote.getOwnerName());
		Assert.assertEquals(regex, ctRemote.getUrl());
	}

	@Test
	public void testGetCTRemotesPage() throws Exception {
		Page<CTRemote> page = ctRemoteResource.getCTRemotesPage(
			null, Pagination.of(1, 10), null);

		long totalCount = page.getTotalCount();

		CTRemote ctRemote1 = testGetCTRemotesPage_addCTRemote(randomCTRemote());

		CTRemote ctRemote2 = testGetCTRemotesPage_addCTRemote(randomCTRemote());

		page = ctRemoteResource.getCTRemotesPage(
			null, Pagination.of(1, 10), null);

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(ctRemote1, (List<CTRemote>)page.getItems());
		assertContains(ctRemote2, (List<CTRemote>)page.getItems());
		assertValid(page, testGetCTRemotesPage_getExpectedActions());

		ctRemoteResource.deleteCTRemote(ctRemote1.getId());

		ctRemoteResource.deleteCTRemote(ctRemote2.getId());
	}

	protected Map<String, Map<String, String>>
			testGetCTRemotesPage_getExpectedActions()
		throws Exception {

		Map<String, Map<String, String>> expectedActions = new HashMap<>();

		return expectedActions;
	}

	@Test
	public void testGetCTRemotesPageWithPagination() throws Exception {
		Page<CTRemote> totalPage = ctRemoteResource.getCTRemotesPage(
			null, null, null);

		int totalCount = GetterUtil.getInteger(totalPage.getTotalCount());

		CTRemote ctRemote1 = testGetCTRemotesPage_addCTRemote(randomCTRemote());

		CTRemote ctRemote2 = testGetCTRemotesPage_addCTRemote(randomCTRemote());

		CTRemote ctRemote3 = testGetCTRemotesPage_addCTRemote(randomCTRemote());

		Page<CTRemote> page1 = ctRemoteResource.getCTRemotesPage(
			null, Pagination.of(1, totalCount + 2), null);

		List<CTRemote> ctRemotes1 = (List<CTRemote>)page1.getItems();

		Assert.assertEquals(
			ctRemotes1.toString(), totalCount + 2, ctRemotes1.size());

		Page<CTRemote> page2 = ctRemoteResource.getCTRemotesPage(
			null, Pagination.of(2, totalCount + 2), null);

		Assert.assertEquals(totalCount + 3, page2.getTotalCount());

		List<CTRemote> ctRemotes2 = (List<CTRemote>)page2.getItems();

		Assert.assertEquals(ctRemotes2.toString(), 1, ctRemotes2.size());

		Page<CTRemote> page3 = ctRemoteResource.getCTRemotesPage(
			null, Pagination.of(1, totalCount + 3), null);

		assertContains(ctRemote1, (List<CTRemote>)page3.getItems());
		assertContains(ctRemote2, (List<CTRemote>)page3.getItems());
		assertContains(ctRemote3, (List<CTRemote>)page3.getItems());
	}

	@Test
	public void testGetCTRemotesPageWithSortDateTime() throws Exception {
		testGetCTRemotesPageWithSort(
			EntityField.Type.DATE_TIME,
			(entityField, ctRemote1, ctRemote2) -> {
				BeanTestUtil.setProperty(
					ctRemote1, entityField.getName(),
					DateUtils.addMinutes(new Date(), -2));
			});
	}

	@Test
	public void testGetCTRemotesPageWithSortDouble() throws Exception {
		testGetCTRemotesPageWithSort(
			EntityField.Type.DOUBLE,
			(entityField, ctRemote1, ctRemote2) -> {
				BeanTestUtil.setProperty(ctRemote1, entityField.getName(), 0.1);
				BeanTestUtil.setProperty(ctRemote2, entityField.getName(), 0.5);
			});
	}

	@Test
	public void testGetCTRemotesPageWithSortInteger() throws Exception {
		testGetCTRemotesPageWithSort(
			EntityField.Type.INTEGER,
			(entityField, ctRemote1, ctRemote2) -> {
				BeanTestUtil.setProperty(ctRemote1, entityField.getName(), 0);
				BeanTestUtil.setProperty(ctRemote2, entityField.getName(), 1);
			});
	}

	@Test
	public void testGetCTRemotesPageWithSortString() throws Exception {
		testGetCTRemotesPageWithSort(
			EntityField.Type.STRING,
			(entityField, ctRemote1, ctRemote2) -> {
				Class<?> clazz = ctRemote1.getClass();

				String entityFieldName = entityField.getName();

				Method method = clazz.getMethod(
					"get" + StringUtil.upperCaseFirstLetter(entityFieldName));

				Class<?> returnType = method.getReturnType();

				if (returnType.isAssignableFrom(Map.class)) {
					BeanTestUtil.setProperty(
						ctRemote1, entityFieldName,
						Collections.singletonMap("Aaa", "Aaa"));
					BeanTestUtil.setProperty(
						ctRemote2, entityFieldName,
						Collections.singletonMap("Bbb", "Bbb"));
				}
				else if (entityFieldName.contains("email")) {
					BeanTestUtil.setProperty(
						ctRemote1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
					BeanTestUtil.setProperty(
						ctRemote2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()) +
									"@liferay.com");
				}
				else {
					BeanTestUtil.setProperty(
						ctRemote1, entityFieldName,
						"aaa" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
					BeanTestUtil.setProperty(
						ctRemote2, entityFieldName,
						"bbb" +
							StringUtil.toLowerCase(
								RandomTestUtil.randomString()));
				}
			});
	}

	protected void testGetCTRemotesPageWithSort(
			EntityField.Type type,
			UnsafeTriConsumer<EntityField, CTRemote, CTRemote, Exception>
				unsafeTriConsumer)
		throws Exception {

		List<EntityField> entityFields = getEntityFields(type);

		if (entityFields.isEmpty()) {
			return;
		}

		CTRemote ctRemote1 = randomCTRemote();
		CTRemote ctRemote2 = randomCTRemote();

		for (EntityField entityField : entityFields) {
			unsafeTriConsumer.accept(entityField, ctRemote1, ctRemote2);
		}

		ctRemote1 = testGetCTRemotesPage_addCTRemote(ctRemote1);

		ctRemote2 = testGetCTRemotesPage_addCTRemote(ctRemote2);

		for (EntityField entityField : entityFields) {
			Page<CTRemote> ascPage = ctRemoteResource.getCTRemotesPage(
				null, Pagination.of(1, 2), entityField.getName() + ":asc");

			assertEquals(
				Arrays.asList(ctRemote1, ctRemote2),
				(List<CTRemote>)ascPage.getItems());

			Page<CTRemote> descPage = ctRemoteResource.getCTRemotesPage(
				null, Pagination.of(1, 2), entityField.getName() + ":desc");

			assertEquals(
				Arrays.asList(ctRemote2, ctRemote1),
				(List<CTRemote>)descPage.getItems());
		}
	}

	protected CTRemote testGetCTRemotesPage_addCTRemote(CTRemote ctRemote)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPostCTRemote() throws Exception {
		CTRemote randomCTRemote = randomCTRemote();

		CTRemote postCTRemote = testPostCTRemote_addCTRemote(randomCTRemote);

		assertEquals(randomCTRemote, postCTRemote);
		assertValid(postCTRemote);
	}

	protected CTRemote testPostCTRemote_addCTRemote(CTRemote ctRemote)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteCTRemote() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		CTRemote ctRemote = testDeleteCTRemote_addCTRemote();

		assertHttpResponseStatusCode(
			204, ctRemoteResource.deleteCTRemoteHttpResponse(ctRemote.getId()));

		assertHttpResponseStatusCode(
			404, ctRemoteResource.getCTRemoteHttpResponse(ctRemote.getId()));

		assertHttpResponseStatusCode(
			404, ctRemoteResource.getCTRemoteHttpResponse(ctRemote.getId()));
	}

	protected CTRemote testDeleteCTRemote_addCTRemote() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteCTRemote() throws Exception {
		CTRemote ctRemote = testGraphQLDeleteCTRemote_addCTRemote();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteCTRemote",
						new HashMap<String, Object>() {
							{
								put("id", ctRemote.getId());
							}
						})),
				"JSONObject/data", "Object/deleteCTRemote"));
		JSONArray errorsJSONArray = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"cTRemote",
					new HashMap<String, Object>() {
						{
							put("id", ctRemote.getId());
						}
					},
					new GraphQLField("id"))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray.length() > 0);
	}

	protected CTRemote testGraphQLDeleteCTRemote_addCTRemote()
		throws Exception {

		return testGraphQLCTRemote_addCTRemote();
	}

	@Test
	public void testGetCTRemote() throws Exception {
		CTRemote postCTRemote = testGetCTRemote_addCTRemote();

		CTRemote getCTRemote = ctRemoteResource.getCTRemote(
			postCTRemote.getId());

		assertEquals(postCTRemote, getCTRemote);
		assertValid(getCTRemote);
	}

	protected CTRemote testGetCTRemote_addCTRemote() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetCTRemote() throws Exception {
		CTRemote ctRemote = testGraphQLGetCTRemote_addCTRemote();

		Assert.assertTrue(
			equals(
				ctRemote,
				CTRemoteSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"cTRemote",
								new HashMap<String, Object>() {
									{
										put("id", ctRemote.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/cTRemote"))));
	}

	@Test
	public void testGraphQLGetCTRemoteNotFound() throws Exception {
		Long irrelevantId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"cTRemote",
						new HashMap<String, Object>() {
							{
								put("id", irrelevantId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	protected CTRemote testGraphQLGetCTRemote_addCTRemote() throws Exception {
		return testGraphQLCTRemote_addCTRemote();
	}

	@Test
	public void testPatchCTRemote() throws Exception {
		CTRemote postCTRemote = testPatchCTRemote_addCTRemote();

		CTRemote randomPatchCTRemote = randomPatchCTRemote();

		@SuppressWarnings("PMD.UnusedLocalVariable")
		CTRemote patchCTRemote = ctRemoteResource.patchCTRemote(
			postCTRemote.getId(), randomPatchCTRemote);

		CTRemote expectedPatchCTRemote = postCTRemote.clone();

		BeanTestUtil.copyProperties(randomPatchCTRemote, expectedPatchCTRemote);

		CTRemote getCTRemote = ctRemoteResource.getCTRemote(
			patchCTRemote.getId());

		assertEquals(expectedPatchCTRemote, getCTRemote);
		assertValid(getCTRemote);
	}

	protected CTRemote testPatchCTRemote_addCTRemote() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPutCTRemote() throws Exception {
		CTRemote postCTRemote = testPutCTRemote_addCTRemote();

		CTRemote randomCTRemote = randomCTRemote();

		CTRemote putCTRemote = ctRemoteResource.putCTRemote(
			postCTRemote.getId(), randomCTRemote);

		assertEquals(randomCTRemote, putCTRemote);
		assertValid(putCTRemote);

		CTRemote getCTRemote = ctRemoteResource.getCTRemote(
			putCTRemote.getId());

		assertEquals(randomCTRemote, getCTRemote);
		assertValid(getCTRemote);
	}

	protected CTRemote testPutCTRemote_addCTRemote() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected CTRemote testGraphQLCTRemote_addCTRemote() throws Exception {
		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(CTRemote ctRemote, List<CTRemote> ctRemotes) {
		boolean contains = false;

		for (CTRemote item : ctRemotes) {
			if (equals(ctRemote, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			ctRemotes + " does not contain " + ctRemote, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(CTRemote ctRemote1, CTRemote ctRemote2) {
		Assert.assertTrue(
			ctRemote1 + " does not equal " + ctRemote2,
			equals(ctRemote1, ctRemote2));
	}

	protected void assertEquals(
		List<CTRemote> ctRemotes1, List<CTRemote> ctRemotes2) {

		Assert.assertEquals(ctRemotes1.size(), ctRemotes2.size());

		for (int i = 0; i < ctRemotes1.size(); i++) {
			CTRemote ctRemote1 = ctRemotes1.get(i);
			CTRemote ctRemote2 = ctRemotes2.get(i);

			assertEquals(ctRemote1, ctRemote2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<CTRemote> ctRemotes1, List<CTRemote> ctRemotes2) {

		Assert.assertEquals(ctRemotes1.size(), ctRemotes2.size());

		for (CTRemote ctRemote1 : ctRemotes1) {
			boolean contains = false;

			for (CTRemote ctRemote2 : ctRemotes2) {
				if (equals(ctRemote1, ctRemote2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				ctRemotes2 + " does not contain " + ctRemote1, contains);
		}
	}

	protected void assertValid(CTRemote ctRemote) throws Exception {
		boolean valid = true;

		if (ctRemote.getDateCreated() == null) {
			valid = false;
		}

		if (ctRemote.getDateModified() == null) {
			valid = false;
		}

		if (ctRemote.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (ctRemote.getActions() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("clientId", additionalAssertFieldName)) {
				if (ctRemote.getClientId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("clientSecret", additionalAssertFieldName)) {
				if (ctRemote.getClientSecret() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (ctRemote.getDescription() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (ctRemote.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("ownerName", additionalAssertFieldName)) {
				if (ctRemote.getOwnerName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("url", additionalAssertFieldName)) {
				if (ctRemote.getUrl() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<CTRemote> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<CTRemote> page, Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<CTRemote> ctRemotes = page.getItems();

		int size = ctRemotes.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);

		assertValid(page.getActions(), expectedActions);
	}

	protected void assertValid(
		Map<String, Map<String, String>> actions1,
		Map<String, Map<String, String>> actions2) {

		for (String key : actions2.keySet()) {
			Map action = actions1.get(key);

			Assert.assertNotNull(key + " does not contain an action", action);

			Map<String, String> expectedAction = actions2.get(key);

			Assert.assertEquals(
				expectedAction.get("method"), action.get("method"));
			Assert.assertEquals(expectedAction.get("href"), action.get("href"));
		}
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.liferay.change.tracking.rest.dto.v1_0.CTRemote.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(CTRemote ctRemote1, CTRemote ctRemote2) {
		if (ctRemote1 == ctRemote2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (!equals(
						(Map)ctRemote1.getActions(),
						(Map)ctRemote2.getActions())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("clientId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getClientId(), ctRemote2.getClientId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("clientSecret", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getClientSecret(),
						ctRemote2.getClientSecret())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateCreated", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getDateCreated(),
						ctRemote2.getDateCreated())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateModified", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getDateModified(),
						ctRemote2.getDateModified())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("description", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getDescription(),
						ctRemote2.getDescription())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(ctRemote1.getId(), ctRemote2.getId())) {
					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getName(), ctRemote2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("ownerName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getOwnerName(), ctRemote2.getOwnerName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("url", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						ctRemote1.getUrl(), ctRemote2.getUrl())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		return TransformUtil.transform(
			ReflectionUtil.getDeclaredFields(clazz),
			field -> {
				if (field.isSynthetic()) {
					return null;
				}

				return field;
			},
			java.lang.reflect.Field.class);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_ctRemoteResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_ctRemoteResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		if (entityModel == null) {
			return Collections.emptyList();
		}

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		return TransformUtil.transform(
			getEntityFields(),
			entityField -> {
				if (!Objects.equals(entityField.getType(), type) ||
					ArrayUtil.contains(
						getIgnoredEntityFieldNames(), entityField.getName())) {

					return null;
				}

				return entityField;
			});
	}

	protected String getFilterString(
		EntityField entityField, String operator, CTRemote ctRemote) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("actions")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("clientId")) {
			Object object = ctRemote.getClientId();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("clientSecret")) {
			Object object = ctRemote.getClientSecret();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("dateCreated")) {
			if (operator.equals("between")) {
				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(ctRemote.getDateCreated(), -2)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(ctRemote.getDateCreated(), 2)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(ctRemote.getDateCreated()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("dateModified")) {
			if (operator.equals("between")) {
				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(ctRemote.getDateModified(), -2)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(ctRemote.getDateModified(), 2)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(ctRemote.getDateModified()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("description")) {
			Object object = ctRemote.getDescription();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("id")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("name")) {
			Object object = ctRemote.getName();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("ownerName")) {
			Object object = ctRemote.getOwnerName();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("url")) {
			Object object = ctRemote.getUrl();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected CTRemote randomCTRemote() throws Exception {
		return new CTRemote() {
			{
				clientId = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				clientSecret = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				description = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				name = StringUtil.toLowerCase(RandomTestUtil.randomString());
				ownerName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				url = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected CTRemote randomIrrelevantCTRemote() throws Exception {
		CTRemote randomIrrelevantCTRemote = randomCTRemote();

		return randomIrrelevantCTRemote;
	}

	protected CTRemote randomPatchCTRemote() throws Exception {
		return randomCTRemote();
	}

	protected CTRemoteResource ctRemoteResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = _getSuperClass(source.getClass());

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					sourceClass.getDeclaredFields()) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				Method setMethod = _getMethod(
					targetClass, field.getName(), "set",
					getMethod.getReturnType());

				setMethod.invoke(target, getMethod.invoke(source));
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Class<?> _getSuperClass(Class<?> clazz) {
			Class<?> superClass = clazz.getSuperclass();

			if ((superClass == null) || (superClass == Object.class)) {
				return clazz;
			}

			return superClass;
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseCTRemoteResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private com.liferay.change.tracking.rest.resource.v1_0.CTRemoteResource
		_ctRemoteResource;

}