/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.related.models.test;

import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.exception.RequiredObjectRelationshipException;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.related.models.ObjectRelatedModelsProvider;
import com.liferay.object.related.models.ObjectRelatedModelsProviderRegistry;
import com.liferay.object.related.models.test.util.ObjectDefinitionTestUtil;
import com.liferay.object.related.models.test.util.ObjectEntryTestUtil;
import com.liferay.object.related.models.test.util.ObjectRelationshipTestUtil;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.test.AssertUtils;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;

import java.io.Serializable;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Pedro Leite
 */
public abstract class BaseSystemObjectRelatedModelsProviderTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		_objectDefinition = ObjectDefinitionTestUtil.addObjectDefinition();
		_systemObjectDefinition = getSystemObjectDefinition();

		PermissionThreadLocal.setPermissionChecker(
			PermissionCheckerFactoryUtil.create(TestPropsValues.getUser()));

		PrincipalThreadLocal.setName(TestPropsValues.getUserId());
	}

	@Test
	public void testSystemObjectEntry1toMObjectRelatedModelsProviderImpl()
		throws Exception {

		long[] primaryKeys = addBaseModels(3);

		_addObjectRelationship(
			_objectDefinition, _systemObjectDefinition,
			ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
			ObjectRelationshipConstants.TYPE_ONE_TO_MANY);

		ObjectEntry objectEntry1 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			Collections.emptyMap());

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId());

		_insertIntoOrUpdateExtensionTable(
			objectEntry1.getObjectEntryId(), primaryKeys[0],
			_systemObjectDefinition.getObjectDefinitionId());
		_insertIntoOrUpdateExtensionTable(
			objectEntry1.getObjectEntryId(), primaryKeys[1],
			_systemObjectDefinition.getObjectDefinitionId());
		_insertIntoOrUpdateExtensionTable(
			objectEntry1.getObjectEntryId(), primaryKeys[2],
			_systemObjectDefinition.getObjectDefinitionId());

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			3, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId());

		// Get related models with search

		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), StringUtil.randomString());
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), String.valueOf(primaryKeys[1]));
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), getName(primaryKeys[1]));

		// Disassociate related models

		_objectRelatedModelsProvider.disassociateRelatedModels(
			TestPropsValues.getUserId(),
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getPrimaryKey(), primaryKeys[0]);

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			2, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId());

		// Object relationship deletion type cascade

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_CASCADE,
			_objectRelationship.getLabelMap());

		_objectEntryLocalService.deleteObjectEntry(objectEntry1);

		assertFailure(primaryKeys[1]);
		assertFailure(primaryKeys[2]);

		// Object relationship deletion type disassociate

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_DISASSOCIATE,
			_objectRelationship.getLabelMap());

		ObjectEntry objectEntry2 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			Collections.emptyMap());

		_insertIntoOrUpdateExtensionTable(
			objectEntry2.getObjectEntryId(), primaryKeys[0],
			_systemObjectDefinition.getObjectDefinitionId());

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry2.getObjectEntryId());

		_objectEntryLocalService.deleteObjectEntry(objectEntry2);

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry2.getObjectEntryId());

		Assert.assertNotNull(fetchBaseModel(primaryKeys[0]));

		// Object relationship deletion type prevent

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
			_objectRelationship.getLabelMap());

		ObjectEntry objectEntry3 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			Collections.emptyMap());

		_insertIntoOrUpdateExtensionTable(
			objectEntry3.getObjectEntryId(), primaryKeys[0],
			_systemObjectDefinition.getObjectDefinitionId());

		AssertUtils.assertFailure(
			RequiredObjectRelationshipException.class,
			StringBundler.concat(
				"Object relationship ",
				_objectRelationship.getObjectRelationshipId(),
				" does not allow deletes"),
			() -> _objectEntryLocalService.deleteObjectEntry(objectEntry3));

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry3.getObjectEntryId());

		_objectRelationshipLocalService.deleteObjectRelationship(
			_objectRelationship);
	}

	@Test
	public void testSystemObjectEntryMtoMObjectRelatedModels()
		throws Exception {

		long[] primaryKeys = addBaseModels(3);

		_addObjectRelationship(
			_objectDefinition, _systemObjectDefinition,
			ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
			ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectEntry objectEntry1 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			Collections.emptyMap());

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId());

		ObjectRelationshipTestUtil.addObjectRelationshipMappingTableValues(
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), primaryKeys[0]);
		ObjectRelationshipTestUtil.addObjectRelationshipMappingTableValues(
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), primaryKeys[1]);

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			2, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId());

		// Get related models with search

		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), StringUtil.randomString());
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), String.valueOf(primaryKeys[0]));
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry1.getObjectEntryId(), getName(primaryKeys[1]));

		// Object relationship deletion type cascade

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_CASCADE,
			_objectRelationship.getLabelMap());

		deleteBaseModel(primaryKeys[1]);

		Assert.assertNotNull(
			_objectEntryLocalService.fetchObjectEntry(
				objectEntry1.getObjectEntryId()));

		assertFailure(primaryKeys[1]);

		_objectEntryLocalService.deleteObjectEntry(objectEntry1);

		Assert.assertNull(
			_objectEntryLocalService.fetchObjectEntry(
				objectEntry1.getObjectEntryId()));

		assertFailure(primaryKeys[0]);

		// Object relationship deletion type disassociate

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_DISASSOCIATE,
			_objectRelationship.getLabelMap());

		ObjectEntry objectEntry2 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			Collections.emptyMap());

		ObjectRelationshipTestUtil.addObjectRelationshipMappingTableValues(
			_objectRelationship.getObjectRelationshipId(),
			objectEntry2.getObjectEntryId(), primaryKeys[2]);

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry2.getObjectEntryId());

		_objectEntryLocalService.deleteObjectEntry(objectEntry2);

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(),
			objectEntry2.getObjectEntryId());

		Assert.assertNotNull(fetchBaseModel(primaryKeys[2]));

		// Object relationship deletion type prevent

		ObjectRelationshipTestUtil.updateObjectRelationship(
			_objectRelationship.getObjectRelationshipId(),
			ObjectRelationshipConstants.DELETION_TYPE_PREVENT,
			_objectRelationship.getLabelMap());

		ObjectEntry objectEntry3 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			HashMapBuilder.<String, Serializable>put(
				"able", "Entry"
			).build());

		ObjectRelationshipTestUtil.addObjectRelationshipMappingTableValues(
			_objectRelationship.getObjectRelationshipId(),
			objectEntry3.getObjectEntryId(), primaryKeys[2]);

		AssertUtils.assertFailure(
			RequiredObjectRelationshipException.class,
			StringBundler.concat(
				"Object relationship ",
				_objectRelationship.getObjectRelationshipId(),
				" does not allow deletes"),
			() -> _objectEntryLocalService.deleteObjectEntry(objectEntry3));

		// Reverse object relationship

		// Get related models with database

		_objectRelationship =
			_objectRelationshipLocalService.fetchReverseObjectRelationship(
				_objectRelationship, true);

		_objectRelatedModelsProvider =
			_objectRelatedModelsProviderRegistry.getObjectRelatedModelsProvider(
				_objectDefinition.getClassName(),
				_objectDefinition.getCompanyId(),
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY);

		ObjectEntry objectEntry4 = ObjectEntryTestUtil.addObjectEntry(
			0, _objectDefinition.getObjectDefinitionId(),
			HashMapBuilder.<String, Serializable>put(
				"able", "New Entry"
			).build());

		ObjectRelationshipTestUtil.addObjectRelationshipMappingTableValues(
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2],
			objectEntry4.getObjectEntryId());

		ObjectRelationshipTestUtil.assertGetRelatedModels(
			2, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2]);

		// Get related models with search

		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			0, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2],
			StringUtil.randomString());
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2],
			String.valueOf(objectEntry3.getObjectEntryId()));
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			1, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2],
			"New");
		ObjectRelationshipTestUtil.assertSearchRelatedModels(
			2, _objectRelatedModelsProvider,
			_objectRelationship.getObjectRelationshipId(), primaryKeys[2],
			"Entry");

		_objectRelationshipLocalService.deleteObjectRelationships(
			_objectDefinition.getObjectDefinitionId());

		Assert.assertNull(
			_objectRelationshipLocalService.fetchObjectRelationship(
				_objectRelationship.getObjectRelationshipId()));
	}

	protected abstract long[] addBaseModels(int count) throws Exception;

	protected abstract void assertFailure(long primaryKey) throws Exception;

	protected abstract void deleteBaseModel(long primaryKey) throws Exception;

	protected abstract Object fetchBaseModel(long primaryKey);

	protected abstract String getName(long primaryKey) throws Exception;

	protected abstract ObjectDefinition getSystemObjectDefinition()
		throws Exception;

	private void _addObjectRelationship(
			ObjectDefinition objectDefinition1,
			ObjectDefinition objectDefinition2, String deletionType,
			String relationshipType)
		throws Exception {

		_objectRelationship =
			_objectRelationshipLocalService.addObjectRelationship(
				TestPropsValues.getUserId(),
				objectDefinition1.getObjectDefinitionId(),
				objectDefinition2.getObjectDefinitionId(), 0, deletionType,
				LocalizedMapUtil.getLocalizedMap(RandomTestUtil.randomString()),
				StringUtil.randomId(), relationshipType);

		if (!StringUtil.equals(
				relationshipType,
				ObjectRelationshipConstants.TYPE_MANY_TO_MANY)) {

			_relationshipObjectField = _objectFieldLocalService.getObjectField(
				_objectRelationship.getObjectFieldId2());
		}

		_objectRelatedModelsProvider =
			_objectRelatedModelsProviderRegistry.getObjectRelatedModelsProvider(
				objectDefinition2.getClassName(),
				objectDefinition2.getCompanyId(), relationshipType);
	}

	private void _insertIntoOrUpdateExtensionTable(
			long objectEntryId, long primaryKey, long systemObjectDefinitionId)
		throws Exception {

		_objectEntryLocalService.insertIntoOrUpdateExtensionTable(
			TestPropsValues.getUserId(), systemObjectDefinitionId, primaryKey,
			HashMapBuilder.<String, Serializable>put(
				"textField", RandomTestUtil.randomString()
			).put(
				_relationshipObjectField.getName(), objectEntryId
			).build());
	}

	@DeleteAfterTestRun
	private ObjectDefinition _objectDefinition;

	@Inject
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Inject
	private ObjectEntryLocalService _objectEntryLocalService;

	@Inject
	private ObjectFieldLocalService _objectFieldLocalService;

	private ObjectRelatedModelsProvider<ObjectEntry>
		_objectRelatedModelsProvider;

	@Inject
	private ObjectRelatedModelsProviderRegistry
		_objectRelatedModelsProviderRegistry;

	private ObjectRelationship _objectRelationship;

	@Inject
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	private ObjectField _relationshipObjectField;
	private ObjectDefinition _systemObjectDefinition;

}