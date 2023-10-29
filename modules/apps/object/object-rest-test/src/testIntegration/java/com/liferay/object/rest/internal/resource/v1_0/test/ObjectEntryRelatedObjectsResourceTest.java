/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.resource.v1_0.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.headless.admin.user.dto.v1_0.UserAccount;
import com.liferay.object.constants.ObjectFieldConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.field.util.ObjectFieldUtil;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.test.util.ObjectDefinitionTestUtil;
import com.liferay.object.rest.test.util.ObjectEntryTestUtil;
import com.liferay.object.rest.test.util.ObjectFieldTestUtil;
import com.liferay.object.rest.test.util.ObjectRelationshipTestUtil;
import com.liferay.object.rest.test.util.UserAccountTestUtil;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.object.system.JaxRsApplicationDescriptor;
import com.liferay.object.system.SystemObjectDefinitionManager;
import com.liferay.object.system.SystemObjectDefinitionManagerRegistry;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.HTTPTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.RoleTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.test.log.LogCapture;
import com.liferay.portal.test.log.LoggerTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PermissionCheckerMethodTestRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * @author Carlos Correa
 */
@RunWith(Arquillian.class)
public class ObjectEntryRelatedObjectsResourceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(),
			PermissionCheckerMethodTestRule.INSTANCE);

	@Before
	public void setUp() throws Exception {
		_objectDefinition1 = ObjectDefinitionTestUtil.publishObjectDefinition(
			Collections.singletonList(
				ObjectFieldUtil.createObjectField(
					"Text", "String", true, true, null,
					RandomTestUtil.randomString(), _OBJECT_FIELD_NAME_1,
					false)));

		_objectEntry1 = ObjectEntryTestUtil.addObjectEntry(
			_objectDefinition1, _OBJECT_FIELD_NAME_1, _OBJECT_FIELD_VALUE_1);

		_objectDefinition2 = ObjectDefinitionTestUtil.publishObjectDefinition(
			Collections.singletonList(
				ObjectFieldUtil.createObjectField(
					"Text", "String", true, true, null,
					RandomTestUtil.randomString(), _OBJECT_FIELD_NAME_2,
					false)));

		_objectEntry2 = ObjectEntryTestUtil.addObjectEntry(
			_objectDefinition2, _OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_2);
		_objectEntry3 = ObjectEntryTestUtil.addObjectEntry(
			_objectDefinition2, _OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_2);

		_objectDefinition3 = ObjectDefinitionTestUtil.publishObjectDefinition(
			Collections.singletonList(
				ObjectFieldUtil.createObjectField(
					"Text", "String", true, true, null,
					RandomTestUtil.randomString(), _OBJECT_FIELD_NAME_2,
					false)));

		_objectEntry4 = ObjectEntryTestUtil.addObjectEntry(
			_objectDefinition3, _OBJECT_FIELD_NAME_2,
			RandomTestUtil.randomString());

		_user1 = TestPropsValues.getUser();
		_user2 = UserTestUtil.addUser(TestPropsValues.getGroupId());

		_userSystemObjectDefinitionManager =
			_systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager("User");

		_userSystemObjectDefinition =
			_objectDefinitionLocalService.fetchSystemObjectDefinition(
				_userSystemObjectDefinitionManager.getName());
	}

	@After
	public void tearDown() throws Exception {
		for (ObjectRelationship objectRelationship : _objectRelationships) {
			_objectRelationshipLocalService.deleteObjectRelationship(
				objectRelationship);
		}
	}

	@Test
	public void testDeleteCustomObjectDefinition1WithCustomObjectDefinition2()
		throws Exception {

		Long irrelevantCurrentObjectId = RandomTestUtil.randomLong();

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2(
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2(
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2NotFound(
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				irrelevantCurrentObjectId, StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				irrelevantCurrentObjectId),
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2NotFound(
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				irrelevantCurrentObjectId, StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				irrelevantCurrentObjectId),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2(
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2NotFound(
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				irrelevantCurrentObjectId, StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				irrelevantCurrentObjectId),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));

		_objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2NotFound(
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				irrelevantCurrentObjectId, StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey()),
			StringBundler.concat(
				_objectDefinition2.getRESTContextPath(), StringPool.SLASH,
				_objectEntry2.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName(), StringPool.SLASH,
				irrelevantCurrentObjectId),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				_objectRelationship.getName()));
	}

	@Test
	public void testDeleteCustomObjectDefinitionWithSystemObjectDefinition()
		throws Exception {

		_testDeleteCustomObjectDefinitionWithSystemObjectDefinition(
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);
		_testDeleteCustomObjectDefinitionWithSystemObjectDefinition(
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);
		_testDeleteCustomObjectDefinitionWithSystemObjectDefinitionNotFound(
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);
		_testDeleteCustomObjectDefinitionWithSystemObjectDefinitionNotFound(
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);
	}

	@Test
	public void testGetRelatedCustomObjectEntriesWhenRelationExists()
		throws Exception {

		// Many to many relationships

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_objectEntry2, jsonObject.getJSONArray("items"));

		objectRelationship = _addObjectRelationship(
			_objectDefinition2, _objectDefinition1,
			_objectEntry2.getPrimaryKey(), _objectEntry1.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_objectEntry2, jsonObject.getJSONArray("items"));

		// One to many relationship

		objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_objectEntry2, jsonObject.getJSONArray("items"));
	}

	@Test
	public void testGetRelatedCustomObjectEntriesWithARegularRole()
		throws Exception {

		Role role = RoleTestUtil.addRole(RoleConstants.TYPE_REGULAR);

		String password = RandomTestUtil.randomString();

		User user = UserTestUtil.addUser(
			TestPropsValues.getCompanyId(), TestPropsValues.getUserId(),
			password, RandomTestUtil.randomString() + "@liferay.com",
			RandomTestUtil.randomString(), LocaleUtil.getDefault(),
			RandomTestUtil.randomString(), RandomTestUtil.randomString(), null,
			ServiceContextTestUtil.getServiceContext());

		UserLocalServiceUtil.addRoleUser(role.getRoleId(), user.getUserId());

		ResourcePermissionLocalServiceUtil.setResourcePermissions(
			TestPropsValues.getCompanyId(), _objectEntry1.getModelClassName(),
			ResourceConstants.SCOPE_INDIVIDUAL,
			String.valueOf(_objectEntry1.getPrimaryKey()), role.getRoleId(),
			new String[] {ActionKeys.VIEW});
		ResourcePermissionLocalServiceUtil.setResourcePermissions(
			TestPropsValues.getCompanyId(), _objectEntry2.getModelClassName(),
			ResourceConstants.SCOPE_INDIVIDUAL,
			String.valueOf(_objectEntry2.getPrimaryKey()), role.getRoleId(),
			new String[] {ActionKeys.VIEW});

		HTTPTestUtil.customize(
		).withCredentials(
			user.getEmailAddress(), password
		).apply(
			this::testGetRelatedCustomObjectEntriesWhenRelationExists
		);
	}

	@Test
	public void testGetRelatedCustomObjectEntriesWithPagination()
		throws Exception {

		// Many to many relationships

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_objectEntry1.getPrimaryKey(), _objectEntry3.getPrimaryKey(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_objectEntry2, objectRelationship);

		objectRelationship = _addObjectRelationship(
			_objectDefinition2, _objectDefinition1,
			_objectEntry2.getPrimaryKey(), _objectEntry1.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_objectEntry3.getPrimaryKey(), _objectEntry1.getPrimaryKey(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_objectEntry2, objectRelationship);

		// One to many relationship

		objectRelationship = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			_objectEntry1.getPrimaryKey(), _objectEntry2.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_objectEntry1.getPrimaryKey(), _objectEntry3.getPrimaryKey(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_objectEntry2, objectRelationship);
	}

	@Test
	public void testGetRelatedObjectEntriesWhenRelationDoesNotExist()
		throws Exception {

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(StringUtil.randomId()), Http.Method.GET);

		Assert.assertEquals("NOT_FOUND", jsonObject.getString("status"));
	}

	@Test
	public void testGetRelatedSystemObjectsWhenRelationExists()
		throws Exception {

		_userSystemObjectDefinitionManager =
			_systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager("User");

		ObjectDefinition relatedObjectDefinition =
			_objectDefinitionLocalService.fetchSystemObjectDefinition(
				_userSystemObjectDefinitionManager.getName());

		// Many to many relationships

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_user1, jsonObject.getJSONArray("items"));

		objectRelationship = _addObjectRelationship(
			relatedObjectDefinition, _objectDefinition1, _user1.getUserId(),
			_objectEntry1.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_user1, jsonObject.getJSONArray("items"));

		// One to many relationship

		objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		_assertEquals(_user1, jsonObject.getJSONArray("items"));
	}

	@Test
	public void testGetRelatedSystemObjectsWithPagination() throws Exception {

		// Many to many relationships

		_userSystemObjectDefinitionManager =
			_systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager("User");

		ObjectDefinition relatedObjectDefinition =
			_objectDefinitionLocalService.fetchSystemObjectDefinition(
				_userSystemObjectDefinitionManager.getName());

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_objectEntry1.getPrimaryKey(), _user2.getUserId(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_user1, objectRelationship);

		objectRelationship = _addObjectRelationship(
			relatedObjectDefinition, _objectDefinition1, _user1.getUserId(),
			_objectEntry1.getPrimaryKey(),
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_user2.getUserId(), _objectEntry1.getPrimaryKey(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_user1, objectRelationship);

		// One to many relationship

		objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(),
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		ObjectRelationshipTestUtil.relateObjectEntries(
			_objectEntry1.getPrimaryKey(), _user2.getUserId(),
			objectRelationship, TestPropsValues.getUserId());

		_assertPagination(_user1, objectRelationship);
	}

	@Test
	public void testPostCustomObjectEntryWithInvalidNestedSystemObjectEntries()
		throws Exception {

		try (LogCapture logCapture = LoggerTestUtil.configureLog4JLogger(
				"com.liferay.portal.vulcan.internal.jaxrs.exception.mapper." +
					"WebApplicationExceptionMapper",
				LoggerTestUtil.WARN)) {

			// Many to many

			_testPostCustomObjectEntryWithInvalidNestedSystemObjectEntries(
				_addObjectRelationship(
					_userSystemObjectDefinition, _objectDefinition1,
					ObjectRelationshipConstants.TYPE_MANY_TO_MANY),
				false);

			// Many to one

			_testPostCustomObjectEntryWithInvalidNestedSystemObjectEntries(
				_addObjectRelationship(
					_userSystemObjectDefinition, _objectDefinition1,
					ObjectRelationshipConstants.TYPE_ONE_TO_MANY),
				true);

			// One to many

			_testPostCustomObjectEntryWithInvalidNestedSystemObjectEntries(
				_addObjectRelationship(
					_objectDefinition1, _userSystemObjectDefinition,
					ObjectRelationshipConstants.TYPE_ONE_TO_MANY),
				false);
		}
	}

	@Test
	public void testPostCustomObjectEntryWithNestedSystemObjectEntry()
		throws Exception {

		// Many to many

		ObjectFieldTestUtil.addCustomObjectField(
			TestPropsValues.getUserId(),
			ObjectFieldConstants.BUSINESS_TYPE_TEXT,
			ObjectFieldConstants.DB_TYPE_STRING, _userSystemObjectDefinition,
			_SYSTEM_OBJECT_FIELD_NAME_1);

		_testPostCustomObjectEntryWithNestedSystemObjectEntry(
			false,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY));

		// Many to one

		_testPostCustomObjectEntryWithNestedSystemObjectEntry(
			true,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));

		// One to many

		_testPostCustomObjectEntryWithNestedSystemObjectEntry(
			false,
			_addObjectRelationship(
				_objectDefinition1, _userSystemObjectDefinition,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));
	}

	@Test
	public void testPutCustomObjectEntryUnlinkNestedSystemObjectEntries()
		throws Exception {

		// Many to many

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntries(
			false,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY));

		// Many to one

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntries(
			true,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));

		// One to many

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntries(
			false,
			_addObjectRelationship(
				_objectDefinition1, _userSystemObjectDefinition,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));
	}

	@Test
	public void testPutCustomObjectEntryUnlinkNestedSystemObjectEntriesByExternalReferenceCode()
		throws Exception {

		// Many to many

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntriesByExternalReferenceCode(
			false,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY));

		// Many to one

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntriesByExternalReferenceCode(
			true,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));

		// One to many

		_testPutCustomObjectEntryUnlinkNestedSystemObjectEntriesByExternalReferenceCode(
			false,
			_addObjectRelationship(
				_objectDefinition1, _userSystemObjectDefinition,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));
	}

	@Test
	public void testPutCustomObjectEntryWithNestedSystemObjectEntry()
		throws Exception {

		// Many to many

		ObjectFieldTestUtil.addCustomObjectField(
			TestPropsValues.getUserId(),
			ObjectFieldConstants.BUSINESS_TYPE_TEXT,
			ObjectFieldConstants.DB_TYPE_STRING, _userSystemObjectDefinition,
			_SYSTEM_OBJECT_FIELD_NAME_2);

		_testPutCustomObjectEntryWithNestedSystemObjectEntry(
			false,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY));

		// Many to one

		_testPutCustomObjectEntryWithNestedSystemObjectEntry(
			true,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));

		// One to many

		_testPutCustomObjectEntryWithNestedSystemObjectEntry(
			false,
			_addObjectRelationship(
				_objectDefinition1, _userSystemObjectDefinition,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));
	}

	@Test
	public void testPutCustomObjectEntryWithNestedSystemObjectEntryByExternalReferenceCode()
		throws Exception {

		// Many to many

		ObjectFieldTestUtil.addCustomObjectField(
			TestPropsValues.getUserId(),
			ObjectFieldConstants.BUSINESS_TYPE_TEXT,
			ObjectFieldConstants.DB_TYPE_STRING, _userSystemObjectDefinition,
			_SYSTEM_OBJECT_FIELD_NAME_3);

		_testPutCustomObjectEntryWithNestedSystemObjectEntryByExternalReferenceCode(
			false,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY));

		// Many to one

		_testPutCustomObjectEntryWithNestedSystemObjectEntryByExternalReferenceCode(
			true,
			_addObjectRelationship(
				_userSystemObjectDefinition, _objectDefinition1,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));

		// One to many

		_testPutCustomObjectEntryWithNestedSystemObjectEntryByExternalReferenceCode(
			false,
			_addObjectRelationship(
				_objectDefinition1, _userSystemObjectDefinition,
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY));
	}

	@Test
	public void testPutObjectEntryRelatedObjectEntry() throws Exception {

		// Many to many relationship

		ObjectRelationship objectRelationship1 = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship1.getName()), Http.Method.GET);

		JSONArray jsonArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, jsonArray.length());

		_assertEquals(
			_objectEntry2,
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(
					objectRelationship1.getName(),
					_objectEntry2.getPrimaryKey()),
				Http.Method.PUT));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship1.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		_assertEquals(_objectEntry2, jsonArray);

		// Many to many and one to many relationships

		ObjectRelationship objectRelationship2 = _addObjectRelationship(
			_objectDefinition1, _objectDefinition3,
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		_assertEquals(
			_objectEntry4,
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(
					objectRelationship2.getName(),
					_objectEntry4.getPrimaryKey()),
				Http.Method.PUT));

		Assert.assertEquals(
			200,
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1
				).put(
					objectRelationship1.getName(),
					JSONUtil.putAll(
						JSONUtil.put(
							_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1
						).put(
							"externalReferenceCode",
							_objectEntry2.getExternalReferenceCode()
						),
						JSONUtil.put(
							_OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_3))
				).put(
					objectRelationship2.getName(),
					JSONUtil.putAll(
						JSONUtil.put(
							_OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_1))
				).toString(),
				_objectDefinition1.getRESTContextPath() + StringPool.SLASH +
					_objectEntry1.getPrimaryKey(),
				Http.Method.PUT));

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1
					).put(
						"externalReferenceCode",
						_objectEntry2.getExternalReferenceCode()
					),
					JSONUtil.put(_OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_3))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 2
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, _getEndpoint(objectRelationship1.getName()),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);
		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(_OBJECT_FIELD_NAME_2, _OBJECT_FIELD_VALUE_1))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 1
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, _getEndpoint(objectRelationship2.getName()),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);

		Assert.assertEquals(
			200,
			HTTPTestUtil.invokeToHttpCode(
				JSONUtil.put(
					_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1
				).put(
					objectRelationship1.getName(), JSONUtil.putAll()
				).put(
					objectRelationship2.getName(),
					JSONUtil.putAll(
						JSONUtil.put(
							_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1))
				).toString(),
				_objectDefinition1.getRESTContextPath() + StringPool.SLASH +
					_objectEntry1.getPrimaryKey(),
				Http.Method.PUT));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship1.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, jsonArray.length());

		JSONAssert.assertEquals(
			JSONUtil.put(
				"items",
				JSONUtil.putAll(
					JSONUtil.put(
						_OBJECT_FIELD_NAME_2, _NEW_OBJECT_FIELD_VALUE_1))
			).put(
				"lastPage", 1
			).put(
				"page", 1
			).put(
				"pageSize", 20
			).put(
				"totalCount", 1
			).toString(),
			HTTPTestUtil.invokeToJSONObject(
				null, _getEndpoint(objectRelationship2.getName()),
				Http.Method.GET
			).toString(),
			JSONCompareMode.LENIENT);

		// One to many relationship

		objectRelationship1 = _addObjectRelationship(
			_objectDefinition1, _objectDefinition2,
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship1.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, jsonArray.length());

		_assertEquals(
			_objectEntry2,
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(
					objectRelationship1.getName(),
					_objectEntry2.getPrimaryKey()),
				Http.Method.PUT));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship1.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		_assertEquals(_objectEntry2, jsonArray);
	}

	@Test
	public void testPutObjectEntryRelatedSystemObject() throws Exception {
		_userSystemObjectDefinitionManager =
			_systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager("User");

		ObjectDefinition relatedObjectDefinition =
			_objectDefinitionLocalService.fetchSystemObjectDefinition(
				_userSystemObjectDefinitionManager.getName());

		// Many to many relationship

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		JSONArray jsonArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, jsonArray.length());

		_assertEquals(
			_user1,
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(objectRelationship.getName(), _user1.getUserId()),
				Http.Method.PUT));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		_assertEquals(_user1, jsonArray);

		// One to many relationship

		objectRelationship = _addObjectRelationship(
			_objectDefinition1, relatedObjectDefinition,
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, jsonArray.length());

		_assertEquals(
			_user1,
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(objectRelationship.getName(), _user1.getUserId()),
				Http.Method.PUT));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		jsonArray = jsonObject.getJSONArray("items");

		_assertEquals(_user1, jsonArray);
	}

	private ObjectRelationship _addObjectRelationship(
			ObjectDefinition objectDefinition1,
			ObjectDefinition objectDefinition2, long primaryKey1,
			long primaryKey2, String type)
		throws Exception {

		ObjectRelationship objectRelationship = _addObjectRelationship(
			objectDefinition1, objectDefinition2, type);

		ObjectRelationshipTestUtil.relateObjectEntries(
			primaryKey1, primaryKey2, objectRelationship,
			TestPropsValues.getUserId());

		return objectRelationship;
	}

	private ObjectRelationship _addObjectRelationship(
			ObjectDefinition objectDefinition1,
			ObjectDefinition objectDefinition2, String type)
		throws Exception {

		ObjectRelationship objectRelationship =
			ObjectRelationshipTestUtil.addObjectRelationship(
				objectDefinition1, objectDefinition2,
				TestPropsValues.getUserId(), type);

		_objectRelationships.add(objectRelationship);

		return objectRelationship;
	}

	private <T> void _assertEquals(
		BaseModel<T> baseModel, JSONArray jsonArray) {

		Assert.assertEquals(1, jsonArray.length());

		_assertEquals(baseModel, jsonArray.getJSONObject(0));
	}

	private <T> void _assertEquals(
		BaseModel<T> baseModel, JSONObject jsonObject) {

		Assert.assertEquals(
			baseModel.getPrimaryKeyObj(), jsonObject.getLong("id"));
	}

	private void _assertPagination(
			BaseModel<?> baseModel, ObjectRelationship objectRelationship)
		throws Exception {

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null,
			_getEndpoint(objectRelationship.getName()) + "?page=1&pageSize=1",
			Http.Method.GET);

		_assertEquals(baseModel, jsonObject.getJSONArray("items"));

		Assert.assertEquals(2, jsonObject.getLong("lastPage"));
		Assert.assertEquals(1, jsonObject.getLong("page"));
		Assert.assertEquals(1, jsonObject.getLong("pageSize"));
		Assert.assertEquals(2, jsonObject.getLong("totalCount"));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null,
			_getEndpoint(objectRelationship.getName()) + "?page=0&pageSize=0",
			Http.Method.GET);

		JSONArray itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(2, itemsJSONArray.length());
	}

	private void _assertSystemObjectEntry(
		JSONObject systemObjectEntryJSONObject, String systemObjectFieldName,
		String systemObjectFieldValue, UserAccount userAccount) {

		Assert.assertEquals(
			systemObjectEntryJSONObject.get(systemObjectFieldName),
			systemObjectFieldValue);
		Assert.assertEquals(
			systemObjectEntryJSONObject.get("emailAddress"),
			userAccount.getEmailAddress());
	}

	private JSONObject _createSystemObjectEntryJSONObject(
			String systemObjectFieldName, String systemObjectFieldValue,
			UserAccount userAccount)
		throws Exception {

		JSONObject userAccountJSONObject = JSONFactoryUtil.createJSONObject(
			userAccount.toString());

		return userAccountJSONObject.put(
			systemObjectFieldName, systemObjectFieldValue);
	}

	private String _getEndpoint(
		boolean manyToOne, String objectEntryId,
		String objectRelationshipName) {

		if (manyToOne) {
			return StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				objectEntryId, "?nestedFields=", objectRelationshipName);
		}

		return StringBundler.concat(
			_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
			objectEntryId, StringPool.SLASH, objectRelationshipName);
	}

	private String _getEndpoint(String name) {
		return StringBundler.concat(
			_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
			_objectEntry1.getObjectEntryId(), StringPool.SLASH, name);
	}

	private String _getEndpoint(String name, long primaryKey) {
		return StringBundler.concat(
			_getEndpoint(name), StringPool.SLASH, primaryKey);
	}

	private String _getSystemObjectEntryId(
			String customObjectEntryId, boolean manyToOne,
			ObjectRelationship objectRelationship)
		throws Exception {

		JSONObject systemObjectEntryJSONObject = null;

		JSONObject customObjectEntryJSONObject =
			HTTPTestUtil.invokeToJSONObject(
				null,
				_getEndpoint(
					manyToOne, customObjectEntryId,
					objectRelationship.getName()),
				Http.Method.GET);

		if (manyToOne) {
			systemObjectEntryJSONObject =
				customObjectEntryJSONObject.getJSONObject(
					objectRelationship.getName());
		}
		else {
			JSONArray itemsJSONArray = customObjectEntryJSONObject.getJSONArray(
				"items");

			systemObjectEntryJSONObject = itemsJSONArray.getJSONObject(0);
		}

		return systemObjectEntryJSONObject.getString("id");
	}

	private void _testDeleteCustomObjectDefinition1WithCustomObjectDefinition2(
			String deleteEndpoint, String getEndpoint)
		throws Exception {

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, getEndpoint, Http.Method.GET);

		JSONArray itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(1, itemsJSONArray.length());

		HTTPTestUtil.invokeToJSONObject(
			null, deleteEndpoint, Http.Method.DELETE);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, getEndpoint, Http.Method.GET);

		itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, itemsJSONArray.length());
	}

	private void
			_testDeleteCustomObjectDefinition1WithCustomObjectDefinition2NotFound(
				String deleteEndpoint1, String deleteEndpoint2,
				String getEndpoint)
		throws Exception {

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, deleteEndpoint1, Http.Method.DELETE);

		Assert.assertEquals("NOT_FOUND", jsonObject.getString("status"));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, deleteEndpoint2, Http.Method.DELETE);

		Assert.assertEquals("NOT_FOUND", jsonObject.getString("status"));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, getEndpoint, Http.Method.GET);

		JSONArray itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(1, itemsJSONArray.length());
	}

	private void _testDeleteCustomObjectDefinitionWithSystemObjectDefinition(
			String type)
		throws Exception {

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, _userSystemObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(), type);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		JSONArray itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(1, itemsJSONArray.length());

		HTTPTestUtil.invokeToJSONObject(
			null,
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				objectRelationship.getName(), StringPool.SLASH,
				_user1.getUserId()),
			Http.Method.DELETE);

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(0, itemsJSONArray.length());
	}

	private void
			_testDeleteCustomObjectDefinitionWithSystemObjectDefinitionNotFound(
				String type)
		throws Exception {

		Long irrelevantPrimaryKey = RandomTestUtil.randomLong();

		Long irrelevantUserId = RandomTestUtil.randomLong();

		ObjectRelationship objectRelationship = _addObjectRelationship(
			_objectDefinition1, _userSystemObjectDefinition,
			_objectEntry1.getPrimaryKey(), _user1.getUserId(), type);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			null,
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				irrelevantPrimaryKey, StringPool.SLASH,
				objectRelationship.getName(), StringPool.SLASH,
				_user1.getUserId()),
			Http.Method.DELETE);

		Assert.assertEquals("NOT_FOUND", jsonObject.getString("status"));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null,
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				_objectEntry1.getPrimaryKey(), StringPool.SLASH,
				objectRelationship.getName(), StringPool.SLASH,
				irrelevantUserId),
			Http.Method.DELETE);

		Assert.assertEquals("NOT_FOUND", jsonObject.getString("status"));

		jsonObject = HTTPTestUtil.invokeToJSONObject(
			null, _getEndpoint(objectRelationship.getName()), Http.Method.GET);

		JSONArray itemsJSONArray = jsonObject.getJSONArray("items");

		Assert.assertEquals(1, itemsJSONArray.length());
	}

	private void _testPostCustomObjectEntryWithInvalidNestedSystemObjectEntries(
			ObjectRelationship objectRelationship, boolean manyToOne)
		throws Exception {

		// Flip manyToOne to ensure invalid nested system object entries

		manyToOne = !manyToOne;

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(
				manyToOne, objectRelationship,
				JSONFactoryUtil.createJSONObject(
					String.valueOf(UserAccountTestUtil.randomUserAccount()))),
			_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		Assert.assertEquals("BAD_REQUEST", jsonObject.get("status"));
	}

	private void _testPostCustomObjectEntryWithNestedSystemObjectEntry(
			boolean manyToOne, ObjectRelationship objectRelationship)
		throws Exception {

		UserAccount userAccount = UserAccountTestUtil.randomUserAccount();

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(
				manyToOne, objectRelationship,
				_createSystemObjectEntryJSONObject(
					_SYSTEM_OBJECT_FIELD_NAME_1, _SYSTEM_OBJECT_FIELD_VALUE,
					userAccount)),
			_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		Assert.assertEquals(
			0,
			jsonObject.getJSONObject(
				"status"
			).get(
				"code"
			));

		if (manyToOne) {
			JSONObject systemObjectEntryJSONObject = jsonObject.getJSONObject(
				objectRelationship.getName());

			Assert.assertEquals(
				systemObjectEntryJSONObject.get("emailAddress"),
				userAccount.getEmailAddress());
		}
		else {
			JSONArray relatedSystemObjectEntriesJSONArray =
				jsonObject.getJSONArray(objectRelationship.getName());

			_assertSystemObjectEntry(
				relatedSystemObjectEntriesJSONArray.getJSONObject(0),
				_SYSTEM_OBJECT_FIELD_NAME_1, _SYSTEM_OBJECT_FIELD_VALUE,
				userAccount);
		}

		JaxRsApplicationDescriptor jaxRsApplicationDescriptor =
			_userSystemObjectDefinitionManager.getJaxRsApplicationDescriptor();

		_assertSystemObjectEntry(
			HTTPTestUtil.invokeToJSONObject(
				null,
				StringBundler.concat(
					jaxRsApplicationDescriptor.getRESTContextPath(),
					StringPool.SLASH,
					_getSystemObjectEntryId(
						jsonObject.getString("id"), manyToOne,
						objectRelationship)),
				Http.Method.GET),
			_SYSTEM_OBJECT_FIELD_NAME_1, _SYSTEM_OBJECT_FIELD_VALUE,
			userAccount);
	}

	private void _testPutCustomObjectEntryUnlinkNestedSystemObjectEntries(
			boolean manyToOne, ObjectRelationship objectRelationship)
		throws Exception {

		UserAccount postUserAccount = UserAccountTestUtil.randomUserAccount();

		JSONObject customObjectEntryJSONObject =
			HTTPTestUtil.invokeToJSONObject(
				_toBody(
					manyToOne, objectRelationship,
					JSONFactoryUtil.createJSONObject(
						postUserAccount.toString())),
				_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(manyToOne, objectRelationship, null),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				customObjectEntryJSONObject.getString("id")),
			Http.Method.PUT);

		if (manyToOne) {
			JSONObject systemObjectEntryJSONObject = jsonObject.getJSONObject(
				objectRelationship.getName());

			Assert.assertNull(systemObjectEntryJSONObject);
		}
		else {
			JSONArray relatedSystemObjectEntriesJSONArray =
				jsonObject.getJSONArray(objectRelationship.getName());

			Assert.assertEquals(
				0, relatedSystemObjectEntriesJSONArray.length());
		}
	}

	private void
			_testPutCustomObjectEntryUnlinkNestedSystemObjectEntriesByExternalReferenceCode(
				boolean manyToOne, ObjectRelationship objectRelationship)
		throws Exception {

		UserAccount postUserAccount = UserAccountTestUtil.randomUserAccount();

		JSONObject customObjectEntryJSONObject =
			HTTPTestUtil.invokeToJSONObject(
				_toBody(
					manyToOne, objectRelationship,
					JSONFactoryUtil.createJSONObject(
						postUserAccount.toString())),
				_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(manyToOne, objectRelationship, null),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(),
				"/by-external-reference-code/",
				customObjectEntryJSONObject.getString("externalReferenceCode")),
			Http.Method.PUT);

		if (manyToOne) {
			JSONObject systemObjectEntryJSONObject = jsonObject.getJSONObject(
				objectRelationship.getName());

			Assert.assertNull(systemObjectEntryJSONObject);
		}
		else {
			JSONArray relatedSystemObjectEntriesJSONArray =
				jsonObject.getJSONArray(objectRelationship.getName());

			Assert.assertEquals(
				0, relatedSystemObjectEntriesJSONArray.length());
		}
	}

	private void _testPutCustomObjectEntryWithNestedSystemObjectEntry(
			boolean manyToOne, ObjectRelationship objectRelationship)
		throws Exception {

		JSONObject customObjectEntryJSONObject =
			HTTPTestUtil.invokeToJSONObject(
				_toBody(
					manyToOne, objectRelationship,
					_createSystemObjectEntryJSONObject(
						_SYSTEM_OBJECT_FIELD_NAME_2, _SYSTEM_OBJECT_FIELD_VALUE,
						UserAccountTestUtil.randomUserAccount())),
				_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		String customObjectEntryId = customObjectEntryJSONObject.getString(
			"id");

		UserAccount putUserAccount = UserAccountTestUtil.randomUserAccount();

		putUserAccount.setEmailAddress(
			StringUtil.toLowerCase(RandomTestUtil.randomString()) +
				"@liferay.com");
		putUserAccount.setExternalReferenceCode(
			() -> {
				JSONObject systemObjectEntryJSONObject =
					HTTPTestUtil.invokeToJSONObject(
						null,
						_getEndpoint(
							manyToOne, customObjectEntryId,
							objectRelationship.getName()),
						Http.Method.GET);

				if (manyToOne) {
					return systemObjectEntryJSONObject.getString(
						StringBundler.concat(
							"r_", objectRelationship.getName(), "_",
							StringUtil.replaceLast(
								_userSystemObjectDefinition.
									getPKObjectFieldName(),
								"Id", "ERC")));
				}

				JSONArray itemsJSONArray =
					systemObjectEntryJSONObject.getJSONArray("items");

				systemObjectEntryJSONObject = itemsJSONArray.getJSONObject(0);

				return systemObjectEntryJSONObject.getString(
					"externalReferenceCode");
			});

		String systemObjectFieldValue = RandomTestUtil.randomString();

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(
				manyToOne, objectRelationship,
				_createSystemObjectEntryJSONObject(
					_SYSTEM_OBJECT_FIELD_NAME_2, systemObjectFieldValue,
					putUserAccount)),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(), StringPool.SLASH,
				customObjectEntryId),
			Http.Method.PUT);

		if (manyToOne) {
			JSONObject systemObjectEntryJSONObject = jsonObject.getJSONObject(
				objectRelationship.getName());

			Assert.assertEquals(
				systemObjectEntryJSONObject.get("emailAddress"),
				putUserAccount.getEmailAddress());
		}
		else {
			JSONArray relatedSystemObjectEntriesJSONArray =
				jsonObject.getJSONArray(objectRelationship.getName());

			Assert.assertEquals(
				1, relatedSystemObjectEntriesJSONArray.length());

			_assertSystemObjectEntry(
				relatedSystemObjectEntriesJSONArray.getJSONObject(0),
				_SYSTEM_OBJECT_FIELD_NAME_2, systemObjectFieldValue,
				putUserAccount);
		}

		JaxRsApplicationDescriptor jaxRsApplicationDescriptor =
			_userSystemObjectDefinitionManager.getJaxRsApplicationDescriptor();

		_assertSystemObjectEntry(
			HTTPTestUtil.invokeToJSONObject(
				null,
				StringBundler.concat(
					jaxRsApplicationDescriptor.getRESTContextPath(),
					StringPool.SLASH,
					_getSystemObjectEntryId(
						customObjectEntryId, manyToOne, objectRelationship)),
				Http.Method.GET),
			_SYSTEM_OBJECT_FIELD_NAME_2, systemObjectFieldValue,
			putUserAccount);
	}

	private void
			_testPutCustomObjectEntryWithNestedSystemObjectEntryByExternalReferenceCode(
				boolean manyToOne, ObjectRelationship objectRelationship)
		throws Exception {

		JSONObject customObjectEntryJSONObject =
			HTTPTestUtil.invokeToJSONObject(
				_toBody(
					manyToOne, objectRelationship,
					_createSystemObjectEntryJSONObject(
						_SYSTEM_OBJECT_FIELD_NAME_3, _SYSTEM_OBJECT_FIELD_VALUE,
						UserAccountTestUtil.randomUserAccount())),
				_objectDefinition1.getRESTContextPath(), Http.Method.POST);

		UserAccount putUserAccount = UserAccountTestUtil.randomUserAccount();

		putUserAccount.setEmailAddress(
			StringUtil.toLowerCase(RandomTestUtil.randomString()) +
				"@liferay.com");
		putUserAccount.setExternalReferenceCode(
			() -> {
				JSONObject systemObjectEntryJSONObject =
					HTTPTestUtil.invokeToJSONObject(
						null,
						_getEndpoint(
							manyToOne,
							customObjectEntryJSONObject.getString("id"),
							objectRelationship.getName()),
						Http.Method.GET);

				if (manyToOne) {
					return systemObjectEntryJSONObject.getString(
						StringBundler.concat(
							"r_", objectRelationship.getName(), "_",
							StringUtil.replaceLast(
								_userSystemObjectDefinition.
									getPKObjectFieldName(),
								"Id", "ERC")));
				}

				JSONArray itemsJSONArray =
					systemObjectEntryJSONObject.getJSONArray("items");

				systemObjectEntryJSONObject = itemsJSONArray.getJSONObject(0);

				return systemObjectEntryJSONObject.getString(
					"externalReferenceCode");
			});

		String systemObjectFieldValue = RandomTestUtil.randomString();

		JSONObject jsonObject = HTTPTestUtil.invokeToJSONObject(
			_toBody(
				manyToOne, objectRelationship,
				_createSystemObjectEntryJSONObject(
					_SYSTEM_OBJECT_FIELD_NAME_3, systemObjectFieldValue,
					putUserAccount)),
			StringBundler.concat(
				_objectDefinition1.getRESTContextPath(),
				"/by-external-reference-code/",
				customObjectEntryJSONObject.getString("externalReferenceCode")),
			Http.Method.PUT);

		if (manyToOne) {
			JSONObject systemObjectEntryJSONObject = jsonObject.getJSONObject(
				objectRelationship.getName());

			Assert.assertEquals(
				systemObjectEntryJSONObject.get("emailAddress"),
				putUserAccount.getEmailAddress());
		}
		else {
			JSONArray relatedSystemObjectEntriesJSONArray =
				jsonObject.getJSONArray(objectRelationship.getName());

			Assert.assertEquals(
				1, relatedSystemObjectEntriesJSONArray.length());

			_assertSystemObjectEntry(
				relatedSystemObjectEntriesJSONArray.getJSONObject(0),
				_SYSTEM_OBJECT_FIELD_NAME_3, systemObjectFieldValue,
				putUserAccount);
		}

		JaxRsApplicationDescriptor jaxRsApplicationDescriptor =
			_userSystemObjectDefinitionManager.getJaxRsApplicationDescriptor();

		_assertSystemObjectEntry(
			HTTPTestUtil.invokeToJSONObject(
				null,
				StringBundler.concat(
					jaxRsApplicationDescriptor.getRESTContextPath(),
					StringPool.SLASH,
					_getSystemObjectEntryId(
						customObjectEntryJSONObject.getString("id"), manyToOne,
						objectRelationship)),
				Http.Method.GET),
			_SYSTEM_OBJECT_FIELD_NAME_3, systemObjectFieldValue,
			putUserAccount);
	}

	private String _toBody(
		boolean manyToOne, ObjectRelationship objectRelationship,
		JSONObject userAccountJSONObject) {

		if (userAccountJSONObject != null) {
			return JSONUtil.put(
				objectRelationship.getName(),
				manyToOne ? userAccountJSONObject :
					JSONUtil.put(userAccountJSONObject)
			).toString();
		}

		return JSONUtil.put(
			objectRelationship.getName(),
			manyToOne ? JSONFactoryUtil.createJSONObject() :
				JSONFactoryUtil.createJSONArray()
		).toString();
	}

	private static final String _NEW_OBJECT_FIELD_VALUE_1 =
		RandomTestUtil.randomString();

	private static final String _OBJECT_FIELD_NAME_1 =
		"x" + RandomTestUtil.randomString();

	private static final String _OBJECT_FIELD_NAME_2 =
		"x" + RandomTestUtil.randomString();

	private static final String _OBJECT_FIELD_VALUE_1 =
		RandomTestUtil.randomString();

	private static final String _OBJECT_FIELD_VALUE_2 =
		RandomTestUtil.randomString();

	private static final String _OBJECT_FIELD_VALUE_3 =
		RandomTestUtil.randomString();

	private static final String _SYSTEM_OBJECT_FIELD_NAME_1 =
		"x" + RandomTestUtil.randomString();

	private static final String _SYSTEM_OBJECT_FIELD_NAME_2 =
		"x" + RandomTestUtil.randomString();

	private static final String _SYSTEM_OBJECT_FIELD_NAME_3 =
		"x" + RandomTestUtil.randomString();

	private static final String _SYSTEM_OBJECT_FIELD_VALUE =
		RandomTestUtil.randomString();

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition1;

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition2;

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition3;

	@Inject
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@DeleteAfterTestRun
	private ObjectEntry _objectEntry1;

	@DeleteAfterTestRun
	private ObjectEntry _objectEntry2;

	@DeleteAfterTestRun
	private ObjectEntry _objectEntry3;

	@DeleteAfterTestRun
	private ObjectEntry _objectEntry4;

	@DeleteAfterTestRun
	private ObjectEntry _objectEntry5;

	private ObjectRelationship _objectRelationship;

	@Inject
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	private final List<ObjectRelationship> _objectRelationships =
		new ArrayList<>();

	@Inject
	private SystemObjectDefinitionManagerRegistry
		_systemObjectDefinitionManagerRegistry;

	private User _user1;
	private User _user2;
	private ObjectDefinition _userSystemObjectDefinition;
	private SystemObjectDefinitionManager _userSystemObjectDefinitionManager;

}