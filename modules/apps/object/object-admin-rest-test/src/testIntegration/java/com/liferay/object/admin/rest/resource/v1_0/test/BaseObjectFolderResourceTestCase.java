/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.object.admin.rest.client.dto.v1_0.ObjectFolder;
import com.liferay.object.admin.rest.client.http.HttpInvoker;
import com.liferay.object.admin.rest.client.pagination.Page;
import com.liferay.object.admin.rest.client.pagination.Pagination;
import com.liferay.object.admin.rest.client.resource.v1_0.ObjectFolderResource;
import com.liferay.object.admin.rest.client.serdes.v1_0.ObjectFolderSerDes;
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
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseObjectFolderResourceTestCase {

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

		_objectFolderResource.setContextCompany(testCompany);

		ObjectFolderResource.Builder builder = ObjectFolderResource.builder();

		objectFolderResource = builder.authentication(
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

		ObjectFolder objectFolder1 = randomObjectFolder();

		String json = objectMapper.writeValueAsString(objectFolder1);

		ObjectFolder objectFolder2 = ObjectFolderSerDes.toDTO(json);

		Assert.assertTrue(equals(objectFolder1, objectFolder2));
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

		ObjectFolder objectFolder = randomObjectFolder();

		String json1 = objectMapper.writeValueAsString(objectFolder);
		String json2 = ObjectFolderSerDes.toJSON(objectFolder);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		ObjectFolder objectFolder = randomObjectFolder();

		objectFolder.setExternalReferenceCode(regex);
		objectFolder.setName(regex);

		String json = ObjectFolderSerDes.toJSON(objectFolder);

		Assert.assertFalse(json.contains(regex));

		objectFolder = ObjectFolderSerDes.toDTO(json);

		Assert.assertEquals(regex, objectFolder.getExternalReferenceCode());
		Assert.assertEquals(regex, objectFolder.getName());
	}

	@Test
	public void testGetObjectFoldersPage() throws Exception {
		Page<ObjectFolder> page = objectFolderResource.getObjectFoldersPage(
			null, Pagination.of(1, 10));

		long totalCount = page.getTotalCount();

		ObjectFolder objectFolder1 = testGetObjectFoldersPage_addObjectFolder(
			randomObjectFolder());

		ObjectFolder objectFolder2 = testGetObjectFoldersPage_addObjectFolder(
			randomObjectFolder());

		page = objectFolderResource.getObjectFoldersPage(
			null, Pagination.of(1, 10));

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(objectFolder1, (List<ObjectFolder>)page.getItems());
		assertContains(objectFolder2, (List<ObjectFolder>)page.getItems());
		assertValid(page, testGetObjectFoldersPage_getExpectedActions());

		objectFolderResource.deleteObjectFolder(objectFolder1.getId());

		objectFolderResource.deleteObjectFolder(objectFolder2.getId());
	}

	protected Map<String, Map<String, String>>
			testGetObjectFoldersPage_getExpectedActions()
		throws Exception {

		Map<String, Map<String, String>> expectedActions = new HashMap<>();

		return expectedActions;
	}

	@Test
	public void testGetObjectFoldersPageWithPagination() throws Exception {
		Page<ObjectFolder> totalPage =
			objectFolderResource.getObjectFoldersPage(null, null);

		int totalCount = GetterUtil.getInteger(totalPage.getTotalCount());

		ObjectFolder objectFolder1 = testGetObjectFoldersPage_addObjectFolder(
			randomObjectFolder());

		ObjectFolder objectFolder2 = testGetObjectFoldersPage_addObjectFolder(
			randomObjectFolder());

		ObjectFolder objectFolder3 = testGetObjectFoldersPage_addObjectFolder(
			randomObjectFolder());

		Page<ObjectFolder> page1 = objectFolderResource.getObjectFoldersPage(
			null, Pagination.of(1, totalCount + 2));

		List<ObjectFolder> objectFolders1 =
			(List<ObjectFolder>)page1.getItems();

		Assert.assertEquals(
			objectFolders1.toString(), totalCount + 2, objectFolders1.size());

		Page<ObjectFolder> page2 = objectFolderResource.getObjectFoldersPage(
			null, Pagination.of(2, totalCount + 2));

		Assert.assertEquals(totalCount + 3, page2.getTotalCount());

		List<ObjectFolder> objectFolders2 =
			(List<ObjectFolder>)page2.getItems();

		Assert.assertEquals(
			objectFolders2.toString(), 1, objectFolders2.size());

		Page<ObjectFolder> page3 = objectFolderResource.getObjectFoldersPage(
			null, Pagination.of(1, totalCount + 3));

		assertContains(objectFolder1, (List<ObjectFolder>)page3.getItems());
		assertContains(objectFolder2, (List<ObjectFolder>)page3.getItems());
		assertContains(objectFolder3, (List<ObjectFolder>)page3.getItems());
	}

	protected ObjectFolder testGetObjectFoldersPage_addObjectFolder(
			ObjectFolder objectFolder)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetObjectFoldersPage() throws Exception {
		GraphQLField graphQLField = new GraphQLField(
			"objectFolders",
			new HashMap<String, Object>() {
				{
					put("page", 1);
					put("pageSize", 10);
				}
			},
			new GraphQLField("items", getGraphQLFields()),
			new GraphQLField("page"), new GraphQLField("totalCount"));

		JSONObject objectFoldersJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/objectFolders");

		long totalCount = objectFoldersJSONObject.getLong("totalCount");

		ObjectFolder objectFolder1 =
			testGraphQLGetObjectFoldersPage_addObjectFolder();
		ObjectFolder objectFolder2 =
			testGraphQLGetObjectFoldersPage_addObjectFolder();

		objectFoldersJSONObject = JSONUtil.getValueAsJSONObject(
			invokeGraphQLQuery(graphQLField), "JSONObject/data",
			"JSONObject/objectFolders");

		Assert.assertEquals(
			totalCount + 2, objectFoldersJSONObject.getLong("totalCount"));

		assertContains(
			objectFolder1,
			Arrays.asList(
				ObjectFolderSerDes.toDTOs(
					objectFoldersJSONObject.getString("items"))));
		assertContains(
			objectFolder2,
			Arrays.asList(
				ObjectFolderSerDes.toDTOs(
					objectFoldersJSONObject.getString("items"))));
	}

	protected ObjectFolder testGraphQLGetObjectFoldersPage_addObjectFolder()
		throws Exception {

		return testGraphQLObjectFolder_addObjectFolder();
	}

	@Test
	public void testPostObjectFolder() throws Exception {
		ObjectFolder randomObjectFolder = randomObjectFolder();

		ObjectFolder postObjectFolder = testPostObjectFolder_addObjectFolder(
			randomObjectFolder);

		assertEquals(randomObjectFolder, postObjectFolder);
		assertValid(postObjectFolder);
	}

	protected ObjectFolder testPostObjectFolder_addObjectFolder(
			ObjectFolder objectFolder)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetObjectFolderByExternalReferenceCode() throws Exception {
		ObjectFolder postObjectFolder =
			testGetObjectFolderByExternalReferenceCode_addObjectFolder();

		ObjectFolder getObjectFolder =
			objectFolderResource.getObjectFolderByExternalReferenceCode(
				postObjectFolder.getExternalReferenceCode());

		assertEquals(postObjectFolder, getObjectFolder);
		assertValid(getObjectFolder);
	}

	protected ObjectFolder
			testGetObjectFolderByExternalReferenceCode_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetObjectFolderByExternalReferenceCode()
		throws Exception {

		ObjectFolder objectFolder =
			testGraphQLGetObjectFolderByExternalReferenceCode_addObjectFolder();

		Assert.assertTrue(
			equals(
				objectFolder,
				ObjectFolderSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"objectFolderByExternalReferenceCode",
								new HashMap<String, Object>() {
									{
										put(
											"externalReferenceCode",
											"\"" +
												objectFolder.
													getExternalReferenceCode() +
														"\"");
									}
								},
								getGraphQLFields())),
						"JSONObject/data",
						"Object/objectFolderByExternalReferenceCode"))));
	}

	@Test
	public void testGraphQLGetObjectFolderByExternalReferenceCodeNotFound()
		throws Exception {

		String irrelevantExternalReferenceCode =
			"\"" + RandomTestUtil.randomString() + "\"";

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"objectFolderByExternalReferenceCode",
						new HashMap<String, Object>() {
							{
								put(
									"externalReferenceCode",
									irrelevantExternalReferenceCode);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	protected ObjectFolder
			testGraphQLGetObjectFolderByExternalReferenceCode_addObjectFolder()
		throws Exception {

		return testGraphQLObjectFolder_addObjectFolder();
	}

	@Test
	public void testPutObjectFolderByExternalReferenceCode() throws Exception {
		ObjectFolder postObjectFolder =
			testPutObjectFolderByExternalReferenceCode_addObjectFolder();

		ObjectFolder randomObjectFolder = randomObjectFolder();

		ObjectFolder putObjectFolder =
			objectFolderResource.putObjectFolderByExternalReferenceCode(
				postObjectFolder.getExternalReferenceCode(),
				randomObjectFolder);

		assertEquals(randomObjectFolder, putObjectFolder);
		assertValid(putObjectFolder);

		ObjectFolder getObjectFolder =
			objectFolderResource.getObjectFolderByExternalReferenceCode(
				putObjectFolder.getExternalReferenceCode());

		assertEquals(randomObjectFolder, getObjectFolder);
		assertValid(getObjectFolder);

		ObjectFolder newObjectFolder =
			testPutObjectFolderByExternalReferenceCode_createObjectFolder();

		putObjectFolder =
			objectFolderResource.putObjectFolderByExternalReferenceCode(
				newObjectFolder.getExternalReferenceCode(), newObjectFolder);

		assertEquals(newObjectFolder, putObjectFolder);
		assertValid(putObjectFolder);

		getObjectFolder =
			objectFolderResource.getObjectFolderByExternalReferenceCode(
				putObjectFolder.getExternalReferenceCode());

		assertEquals(newObjectFolder, getObjectFolder);

		Assert.assertEquals(
			newObjectFolder.getExternalReferenceCode(),
			putObjectFolder.getExternalReferenceCode());
	}

	protected ObjectFolder
			testPutObjectFolderByExternalReferenceCode_createObjectFolder()
		throws Exception {

		return randomObjectFolder();
	}

	protected ObjectFolder
			testPutObjectFolderByExternalReferenceCode_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteObjectFolder() throws Exception {
		@SuppressWarnings("PMD.UnusedLocalVariable")
		ObjectFolder objectFolder = testDeleteObjectFolder_addObjectFolder();

		assertHttpResponseStatusCode(
			204,
			objectFolderResource.deleteObjectFolderHttpResponse(
				objectFolder.getId()));

		assertHttpResponseStatusCode(
			404,
			objectFolderResource.getObjectFolderHttpResponse(
				objectFolder.getId()));

		assertHttpResponseStatusCode(
			404, objectFolderResource.getObjectFolderHttpResponse(0L));
	}

	protected ObjectFolder testDeleteObjectFolder_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLDeleteObjectFolder() throws Exception {
		ObjectFolder objectFolder =
			testGraphQLDeleteObjectFolder_addObjectFolder();

		Assert.assertTrue(
			JSONUtil.getValueAsBoolean(
				invokeGraphQLMutation(
					new GraphQLField(
						"deleteObjectFolder",
						new HashMap<String, Object>() {
							{
								put("objectFolderId", objectFolder.getId());
							}
						})),
				"JSONObject/data", "Object/deleteObjectFolder"));
		JSONArray errorsJSONArray = JSONUtil.getValueAsJSONArray(
			invokeGraphQLQuery(
				new GraphQLField(
					"objectFolder",
					new HashMap<String, Object>() {
						{
							put("objectFolderId", objectFolder.getId());
						}
					},
					new GraphQLField("id"))),
			"JSONArray/errors");

		Assert.assertTrue(errorsJSONArray.length() > 0);
	}

	protected ObjectFolder testGraphQLDeleteObjectFolder_addObjectFolder()
		throws Exception {

		return testGraphQLObjectFolder_addObjectFolder();
	}

	@Test
	public void testGetObjectFolder() throws Exception {
		ObjectFolder postObjectFolder = testGetObjectFolder_addObjectFolder();

		ObjectFolder getObjectFolder = objectFolderResource.getObjectFolder(
			postObjectFolder.getId());

		assertEquals(postObjectFolder, getObjectFolder);
		assertValid(getObjectFolder);
	}

	protected ObjectFolder testGetObjectFolder_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGraphQLGetObjectFolder() throws Exception {
		ObjectFolder objectFolder =
			testGraphQLGetObjectFolder_addObjectFolder();

		Assert.assertTrue(
			equals(
				objectFolder,
				ObjectFolderSerDes.toDTO(
					JSONUtil.getValueAsString(
						invokeGraphQLQuery(
							new GraphQLField(
								"objectFolder",
								new HashMap<String, Object>() {
									{
										put(
											"objectFolderId",
											objectFolder.getId());
									}
								},
								getGraphQLFields())),
						"JSONObject/data", "Object/objectFolder"))));
	}

	@Test
	public void testGraphQLGetObjectFolderNotFound() throws Exception {
		Long irrelevantObjectFolderId = RandomTestUtil.randomLong();

		Assert.assertEquals(
			"Not Found",
			JSONUtil.getValueAsString(
				invokeGraphQLQuery(
					new GraphQLField(
						"objectFolder",
						new HashMap<String, Object>() {
							{
								put("objectFolderId", irrelevantObjectFolderId);
							}
						},
						getGraphQLFields())),
				"JSONArray/errors", "Object/0", "JSONObject/extensions",
				"Object/code"));
	}

	protected ObjectFolder testGraphQLGetObjectFolder_addObjectFolder()
		throws Exception {

		return testGraphQLObjectFolder_addObjectFolder();
	}

	@Test
	public void testPatchObjectFolder() throws Exception {
		ObjectFolder postObjectFolder = testPatchObjectFolder_addObjectFolder();

		ObjectFolder randomPatchObjectFolder = randomPatchObjectFolder();

		@SuppressWarnings("PMD.UnusedLocalVariable")
		ObjectFolder patchObjectFolder = objectFolderResource.patchObjectFolder(
			postObjectFolder.getId(), randomPatchObjectFolder);

		ObjectFolder expectedPatchObjectFolder = postObjectFolder.clone();

		BeanTestUtil.copyProperties(
			randomPatchObjectFolder, expectedPatchObjectFolder);

		ObjectFolder getObjectFolder = objectFolderResource.getObjectFolder(
			patchObjectFolder.getId());

		assertEquals(expectedPatchObjectFolder, getObjectFolder);
		assertValid(getObjectFolder);
	}

	protected ObjectFolder testPatchObjectFolder_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testPutObjectFolder() throws Exception {
		ObjectFolder postObjectFolder = testPutObjectFolder_addObjectFolder();

		ObjectFolder randomObjectFolder = randomObjectFolder();

		ObjectFolder putObjectFolder = objectFolderResource.putObjectFolder(
			postObjectFolder.getId(), randomObjectFolder);

		assertEquals(randomObjectFolder, putObjectFolder);
		assertValid(putObjectFolder);

		ObjectFolder getObjectFolder = objectFolderResource.getObjectFolder(
			putObjectFolder.getId());

		assertEquals(randomObjectFolder, getObjectFolder);
		assertValid(getObjectFolder);
	}

	protected ObjectFolder testPutObjectFolder_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected ObjectFolder testGraphQLObjectFolder_addObjectFolder()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		ObjectFolder objectFolder, List<ObjectFolder> objectFolders) {

		boolean contains = false;

		for (ObjectFolder item : objectFolders) {
			if (equals(objectFolder, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			objectFolders + " does not contain " + objectFolder, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		ObjectFolder objectFolder1, ObjectFolder objectFolder2) {

		Assert.assertTrue(
			objectFolder1 + " does not equal " + objectFolder2,
			equals(objectFolder1, objectFolder2));
	}

	protected void assertEquals(
		List<ObjectFolder> objectFolders1, List<ObjectFolder> objectFolders2) {

		Assert.assertEquals(objectFolders1.size(), objectFolders2.size());

		for (int i = 0; i < objectFolders1.size(); i++) {
			ObjectFolder objectFolder1 = objectFolders1.get(i);
			ObjectFolder objectFolder2 = objectFolders2.get(i);

			assertEquals(objectFolder1, objectFolder2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<ObjectFolder> objectFolders1, List<ObjectFolder> objectFolders2) {

		Assert.assertEquals(objectFolders1.size(), objectFolders2.size());

		for (ObjectFolder objectFolder1 : objectFolders1) {
			boolean contains = false;

			for (ObjectFolder objectFolder2 : objectFolders2) {
				if (equals(objectFolder1, objectFolder2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				objectFolders2 + " does not contain " + objectFolder1,
				contains);
		}
	}

	protected void assertValid(ObjectFolder objectFolder) throws Exception {
		boolean valid = true;

		if (objectFolder.getDateCreated() == null) {
			valid = false;
		}

		if (objectFolder.getDateModified() == null) {
			valid = false;
		}

		if (objectFolder.getId() == null) {
			valid = false;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (objectFolder.getActions() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (objectFolder.getExternalReferenceCode() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("label", additionalAssertFieldName)) {
				if (objectFolder.getLabel() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (objectFolder.getName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"objectFolderItems", additionalAssertFieldName)) {

				if (objectFolder.getObjectFolderItems() == null) {
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

	protected void assertValid(Page<ObjectFolder> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<ObjectFolder> page,
		Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<ObjectFolder> objectFolders = page.getItems();

		int size = objectFolders.size();

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
					com.liferay.object.admin.rest.dto.v1_0.ObjectFolder.
						class)) {

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

	protected boolean equals(
		ObjectFolder objectFolder1, ObjectFolder objectFolder2) {

		if (objectFolder1 == objectFolder2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("actions", additionalAssertFieldName)) {
				if (!equals(
						(Map)objectFolder1.getActions(),
						(Map)objectFolder2.getActions())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateCreated", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						objectFolder1.getDateCreated(),
						objectFolder2.getDateCreated())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dateModified", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						objectFolder1.getDateModified(),
						objectFolder2.getDateModified())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"externalReferenceCode", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						objectFolder1.getExternalReferenceCode(),
						objectFolder2.getExternalReferenceCode())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("id", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						objectFolder1.getId(), objectFolder2.getId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("label", additionalAssertFieldName)) {
				if (!equals(
						(Map)objectFolder1.getLabel(),
						(Map)objectFolder2.getLabel())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("name", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						objectFolder1.getName(), objectFolder2.getName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"objectFolderItems", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						objectFolder1.getObjectFolderItems(),
						objectFolder2.getObjectFolderItems())) {

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

		if (!(_objectFolderResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_objectFolderResource;

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
		EntityField entityField, String operator, ObjectFolder objectFolder) {

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

		if (entityFieldName.equals("dateCreated")) {
			if (operator.equals("between")) {
				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(
							objectFolder.getDateCreated(), -2)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(
							objectFolder.getDateCreated(), 2)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(objectFolder.getDateCreated()));
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
						DateUtils.addSeconds(
							objectFolder.getDateModified(), -2)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(
						DateUtils.addSeconds(
							objectFolder.getDateModified(), 2)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_dateFormat.format(objectFolder.getDateModified()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("externalReferenceCode")) {
			Object object = objectFolder.getExternalReferenceCode();

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

		if (entityFieldName.equals("label")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("name")) {
			Object object = objectFolder.getName();

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

		if (entityFieldName.equals("objectFolderItems")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
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

	protected ObjectFolder randomObjectFolder() throws Exception {
		return new ObjectFolder() {
			{
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				externalReferenceCode = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				id = RandomTestUtil.randomLong();
				name = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected ObjectFolder randomIrrelevantObjectFolder() throws Exception {
		ObjectFolder randomIrrelevantObjectFolder = randomObjectFolder();

		return randomIrrelevantObjectFolder;
	}

	protected ObjectFolder randomPatchObjectFolder() throws Exception {
		return randomObjectFolder();
	}

	protected ObjectFolderResource objectFolderResource;
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
		LogFactoryUtil.getLog(BaseObjectFolderResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private com.liferay.object.admin.rest.resource.v1_0.ObjectFolderResource
		_objectFolderResource;

}