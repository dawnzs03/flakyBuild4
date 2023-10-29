/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.service.impl;

import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.dynamic.data.mapping.expression.CreateExpressionRequest;
import com.liferay.dynamic.data.mapping.expression.DDMExpressionFactory;
import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.object.constants.ObjectFieldConstants;
import com.liferay.object.constants.ObjectFieldSettingConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.definition.util.ObjectDefinitionUtil;
import com.liferay.object.exception.DuplicateObjectFieldExternalReferenceCodeException;
import com.liferay.object.exception.ObjectDefinitionEnableLocalizationException;
import com.liferay.object.exception.ObjectFieldBusinessTypeException;
import com.liferay.object.exception.ObjectFieldDBTypeException;
import com.liferay.object.exception.ObjectFieldLabelException;
import com.liferay.object.exception.ObjectFieldListTypeDefinitionIdException;
import com.liferay.object.exception.ObjectFieldLocalizedException;
import com.liferay.object.exception.ObjectFieldNameException;
import com.liferay.object.exception.ObjectFieldReadOnlyConditionExpressionException;
import com.liferay.object.exception.ObjectFieldReadOnlyException;
import com.liferay.object.exception.ObjectFieldRelationshipTypeException;
import com.liferay.object.exception.ObjectFieldSettingValueException;
import com.liferay.object.exception.ObjectFieldStateException;
import com.liferay.object.exception.ObjectFieldSystemException;
import com.liferay.object.exception.RequiredObjectFieldException;
import com.liferay.object.field.business.type.ObjectFieldBusinessType;
import com.liferay.object.field.business.type.ObjectFieldBusinessTypeRegistry;
import com.liferay.object.field.setting.util.ObjectFieldSettingUtil;
import com.liferay.object.internal.dao.db.ObjectDBManagerUtil;
import com.liferay.object.internal.field.setting.contributor.ObjectFieldSettingContributor;
import com.liferay.object.internal.petra.sql.dsl.DynamicObjectDefinitionLocalizationTableFactory;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectEntry;
import com.liferay.object.model.ObjectEntryTable;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectFieldSetting;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.petra.sql.dsl.DynamicObjectDefinitionTable;
import com.liferay.object.petra.sql.dsl.DynamicObjectDefinitionTableUtil;
import com.liferay.object.service.ObjectFieldSettingLocalService;
import com.liferay.object.service.ObjectStateFlowLocalService;
import com.liferay.object.service.ObjectValidationRuleLocalService;
import com.liferay.object.service.ObjectViewLocalService;
import com.liferay.object.service.base.ObjectFieldLocalServiceBaseImpl;
import com.liferay.object.service.persistence.ObjectDefinitionPersistence;
import com.liferay.object.service.persistence.ObjectEntryPersistence;
import com.liferay.object.service.persistence.ObjectFieldSettingPersistence;
import com.liferay.object.service.persistence.ObjectLayoutColumnPersistence;
import com.liferay.object.service.persistence.ObjectRelationshipPersistence;
import com.liferay.object.system.SystemObjectDefinitionManager;
import com.liferay.object.system.SystemObjectDefinitionManagerRegistry;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.Table;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.jdbc.CurrentConnection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.feature.flag.FeatureFlagManagerUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PropsValues;

import java.io.Serializable;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.crypto.spec.SecretKeySpec;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marco Leo
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.object.model.ObjectField",
	service = AopService.class
)
public class ObjectFieldLocalServiceImpl
	extends ObjectFieldLocalServiceBaseImpl {

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField addCustomObjectField(
			String externalReferenceCode, long userId,
			long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbType, boolean indexed,
			boolean indexedAsKeyword, String indexedLanguageId,
			Map<Locale, String> labelMap, boolean localized, String name,
			String readOnly, String readOnlyConditionExpression,
			boolean required, boolean state,
			List<ObjectFieldSetting> objectFieldSettings)
		throws PortalException {

		name = StringUtil.trim(name);

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(objectDefinitionId);

		String dbTableName = objectDefinition.getDBTableName();

		if (objectDefinition.isApproved()) {
			dbTableName = objectDefinition.getExtensionDBTableName();
		}

		ObjectField objectField = _addObjectField(
			externalReferenceCode, userId, listTypeDefinitionId,
			objectDefinitionId, businessType, name + StringPool.UNDERLINE,
			dbTableName, dbType, indexed, indexedAsKeyword, indexedLanguageId,
			labelMap, localized, name, readOnly, readOnlyConditionExpression,
			required, state, false);

		_addOrUpdateObjectFieldSettings(
			objectDefinition, objectField, null, objectFieldSettings);

		if (!objectDefinition.isApproved()) {
			return objectField;
		}

		if (localized) {
			runSQL(
				DynamicObjectDefinitionTableUtil.getAlterTableAddColumnSQL(
					objectDefinition.getLocalizationDBTableName(),
					objectField.getDBColumnName(), dbType));
		}
		else if (!objectField.compareBusinessType(
					ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) &&
				 !objectField.compareBusinessType(
					 ObjectFieldConstants.BUSINESS_TYPE_FORMULA)) {

			runSQL(
				DynamicObjectDefinitionTableUtil.getAlterTableAddColumnSQL(
					dbTableName, objectField.getDBColumnName(), dbType));

			if (GetterUtil.getBoolean(
					ObjectFieldSettingUtil.getValue(
						ObjectFieldSettingConstants.NAME_UNIQUE_VALUES,
						objectField))) {

				ObjectDBManagerUtil.createIndexMetadata(
					objectField.getDBColumnName(),
					_currentConnection.getConnection(
						objectFieldPersistence.getDataSource()),
					dbTableName, true);
			}
		}

		return objectField;
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField addOrUpdateCustomObjectField(
			String externalReferenceCode, long objectFieldId, long userId,
			long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbType, boolean indexed,
			boolean indexedAsKeyword, String indexedLanguageId,
			Map<Locale, String> labelMap, boolean localized, String name,
			String readOnly, String readOnlyConditionExpression,
			boolean required, boolean state,
			List<ObjectFieldSetting> objectFieldSettings)
		throws PortalException {

		ObjectField existingObjectField = null;

		if (objectFieldId > 0) {
			existingObjectField = objectFieldPersistence.fetchByPrimaryKey(
				objectFieldId);
		}

		if ((existingObjectField == null) &&
			Validator.isNotNull(externalReferenceCode)) {

			ObjectDefinition objectDefinition =
				_objectDefinitionPersistence.findByPrimaryKey(
					objectDefinitionId);

			existingObjectField = objectFieldPersistence.fetchByERC_C_ODI(
				externalReferenceCode, objectDefinition.getCompanyId(),
				objectDefinitionId);
		}

		if (existingObjectField == null) {
			return objectFieldLocalService.addCustomObjectField(
				externalReferenceCode, userId, listTypeDefinitionId,
				objectDefinitionId, businessType, dbType, indexed,
				indexedAsKeyword, indexedLanguageId, labelMap, localized, name,
				readOnly, readOnlyConditionExpression, required, state,
				objectFieldSettings);
		}

		return objectFieldLocalService.updateCustomObjectField(
			externalReferenceCode, existingObjectField.getObjectFieldId(),
			listTypeDefinitionId, businessType, dbType, indexed,
			indexedAsKeyword, indexedLanguageId, labelMap, localized, name,
			readOnly, readOnlyConditionExpression, required, state,
			objectFieldSettings);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField addOrUpdateSystemObjectField(
			long userId, long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbColumnName, String dbTableName,
			String dbType, boolean indexed, boolean indexedAsKeyword,
			String indexedLanguageId, Map<Locale, String> labelMap, String name,
			boolean required, boolean state)
		throws PortalException {

		ObjectField existingObjectField = objectFieldPersistence.fetchByODI_N(
			objectDefinitionId, name);

		if (existingObjectField == null) {
			return addSystemObjectField(
				userId, listTypeDefinitionId, objectDefinitionId, businessType,
				dbColumnName, dbTableName, dbType, indexed, indexedAsKeyword,
				indexedLanguageId, labelMap, name, required, state);
		}

		_validateLabel(labelMap, existingObjectField);

		existingObjectField.setLabelMap(labelMap, LocaleUtil.getSiteDefault());

		return objectFieldPersistence.update(existingObjectField);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField addSystemObjectField(
			long userId, long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbColumnName, String dbTableName,
			String dbType, boolean indexed, boolean indexedAsKeyword,
			String indexedLanguageId, Map<Locale, String> labelMap, String name,
			boolean required, boolean state)
		throws PortalException {

		name = StringUtil.trim(name);

		if (Validator.isNull(dbColumnName)) {
			dbColumnName = name;
		}

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(objectDefinitionId);

		if (objectDefinition.isModifiable() && objectDefinition.isSystem() &&
			!ObjectDefinitionUtil.isInvokerBundleAllowed()) {

			throw new ObjectFieldSystemException(
				"Only allowed bundles can add system object fields");
		}

		return _addObjectField(
			null, userId, listTypeDefinitionId, objectDefinitionId,
			businessType, dbColumnName, dbTableName, dbType, indexed,
			indexedAsKeyword, indexedLanguageId, labelMap, false, name,
			ObjectFieldConstants.READ_ONLY_FALSE, null, required, state, true);
	}

	@Indexable(type = IndexableType.DELETE)
	@Override
	public ObjectField deleteObjectField(long objectFieldId)
		throws PortalException {

		ObjectField objectField = objectFieldPersistence.findByPrimaryKey(
			objectFieldId);

		return deleteObjectField(objectField);
	}

	@Indexable(type = IndexableType.DELETE)
	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public ObjectField deleteObjectField(ObjectField objectField)
		throws PortalException {

		return _deleteObjectField(objectField, false);
	}

	@Override
	public void deleteObjectFieldByObjectDefinitionId(Long objectDefinitionId)
		throws PortalException {

		for (ObjectField objectField :
				objectFieldPersistence.findByObjectDefinitionId(
					objectDefinitionId)) {

			if (Validator.isNotNull(objectField.getRelationshipType())) {
				continue;
			}

			objectFieldPersistence.remove(objectField);

			_objectFieldSettingLocalService.deleteObjectFieldObjectFieldSetting(
				objectField);
		}
	}

	@Indexable(type = IndexableType.DELETE)
	@Override
	public ObjectField deleteRelationshipTypeObjectField(long objectFieldId)
		throws PortalException {

		return _deleteObjectField(
			objectFieldPersistence.findByPrimaryKey(objectFieldId), true);
	}

	@Override
	public ObjectField fetchObjectField(long objectFieldId) {
		ObjectField objectField = objectFieldPersistence.fetchByPrimaryKey(
			objectFieldId);

		if (objectField != null) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));
		}

		return objectField;
	}

	@Override
	public ObjectField fetchObjectField(long objectDefinitionId, String name) {
		return objectFieldPersistence.fetchByODI_N(objectDefinitionId, name);
	}

	@Override
	public ObjectField fetchObjectField(
		String externalReferenceCode, long objectDefinitionId) {

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.fetchByPrimaryKey(objectDefinitionId);

		if (objectDefinition == null) {
			return null;
		}

		return objectFieldPersistence.fetchByERC_C_ODI(
			externalReferenceCode, objectDefinition.getCompanyId(),
			objectDefinitionId);
	}

	@Override
	public List<ObjectField> getActiveObjectFields(
			List<ObjectField> objectFields)
		throws PortalException {

		List<ObjectField> activeObjectFields = new ArrayList<>();

		for (ObjectField objectField : objectFields) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));

			if (Validator.isNotNull(objectField.getRelationshipType())) {
				ObjectRelationship objectRelationship =
					_objectRelationshipPersistence.fetchByObjectFieldId2(
						objectField.getObjectFieldId());

				ObjectDefinition objectDefinition =
					_objectDefinitionPersistence.findByPrimaryKey(
						objectRelationship.getObjectDefinitionId1());

				if (objectDefinition.isActive()) {
					activeObjectFields.add(objectField);
				}
			}
			else {
				activeObjectFields.add(objectField);
			}
		}

		return activeObjectFields;
	}

	@Override
	public Column<?, ?> getColumn(long objectDefinitionId, String name) {
		try {
			if (StringUtil.equals(
					name, ObjectEntryTable.INSTANCE.userId.getName())) {

				return ObjectEntryTable.INSTANCE.userId;
			}

			ObjectField objectField = fetchObjectField(
				objectDefinitionId, name);

			if (objectField == null) {
				objectField = _getObjectRelationshipField(
					objectDefinitionId, name);

				if (objectField == null) {
					throw new UnsupportedOperationException(
						"Unsupported method getColumn with field name " + name);
				}
			}

			if (Objects.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_ATTACHMENT) ||
				Objects.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_RICH_TEXT)) {

				throw new UnsupportedOperationException(
					"Unsupported operation with " +
						objectField.getBusinessType() + " field");
			}

			Table<?> table = getTable(
				objectDefinitionId, objectField.getName());

			return table.getColumn(objectField.getDBColumnName());
		}
		catch (PortalException portalException) {
			return ReflectionUtil.throwException(portalException);
		}
	}

	@Override
	public List<ObjectField> getCustomObjectFields(long objectDefinitionId) {
		return getObjectFields(objectDefinitionId, false);
	}

	@Override
	public List<ObjectField> getListTypeDefinitionObjectFields(
		long listTypeDefinitionId, boolean state) {

		return objectFieldPersistence.findByLTDI_S(listTypeDefinitionId, state);
	}

	@Override
	public List<ObjectField> getLocalizedObjectFields(long objectDefinitionId) {
		return objectFieldPersistence.findByODI_L(objectDefinitionId, true);
	}

	@Override
	public ObjectField getObjectField(long objectFieldId)
		throws PortalException {

		ObjectField objectField = objectFieldPersistence.findByPrimaryKey(
			objectFieldId);

		objectField.setObjectFieldSettings(
			_objectFieldSettingLocalService.getObjectFieldObjectFieldSettings(
				objectField.getObjectFieldId()));

		return objectField;
	}

	@Override
	public ObjectField getObjectField(long objectDefinitionId, String name)
		throws PortalException {

		ObjectField objectField = objectFieldPersistence.findByODI_N(
			objectDefinitionId, name);

		objectField.setObjectFieldSettings(
			_objectFieldSettingLocalService.getObjectFieldObjectFieldSettings(
				objectField.getObjectFieldId()));

		return objectField;
	}

	@Override
	public ObjectField getObjectField(
			String externalReferenceCode, long objectDefinitionId)
		throws PortalException {

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(objectDefinitionId);

		return objectFieldPersistence.findByERC_C_ODI(
			externalReferenceCode, objectDefinition.getCompanyId(),
			objectDefinitionId);
	}

	@Override
	public List<ObjectField> getObjectFields(long objectDefinitionId) {
		List<ObjectField> objectFields =
			objectFieldPersistence.findByObjectDefinitionId(objectDefinitionId);

		for (ObjectField objectField : objectFields) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));
		}

		return objectFields;
	}

	@Override
	public List<ObjectField> getObjectFields(
		long objectDefinitionId, boolean system) {

		List<ObjectField> objectFields = objectFieldPersistence.findByODI_S(
			objectDefinitionId, system);

		for (ObjectField objectField : objectFields) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));
		}

		return objectFields;
	}

	@Override
	public List<ObjectField> getObjectFields(
		long objectDefinitionId, int start, int end,
		OrderByComparator<ObjectField> orderByComparator) {

		List<ObjectField> objectFields =
			objectFieldPersistence.findByObjectDefinitionId(
				objectDefinitionId, start, end, orderByComparator);

		for (ObjectField objectField : objectFields) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));
		}

		return objectFields;
	}

	@Override
	public List<ObjectField> getObjectFields(
		long objectDefinitionId, String dbTableName) {

		List<ObjectField> objectFields = objectFieldPersistence.findByODI_DTN(
			objectDefinitionId, dbTableName);

		for (ObjectField objectField : objectFields) {
			objectField.setObjectFieldSettings(
				_objectFieldSettingLocalService.
					getObjectFieldObjectFieldSettings(
						objectField.getObjectFieldId()));
		}

		return objectFields;
	}

	@Override
	public int getObjectFieldsCount(long objectDefinitionId) {
		return objectFieldPersistence.countByObjectDefinitionId(
			objectDefinitionId);
	}

	@Override
	public int getObjectFieldsCount(long objectDefinitionId, boolean system) {
		return objectFieldPersistence.countByODI_S(objectDefinitionId, system);
	}

	@Override
	public int getObjectFieldsCountByListTypeDefinitionId(
		long listTypeDefinitionId) {

		return objectFieldPersistence.countByListTypeDefinitionId(
			listTypeDefinitionId);
	}

	@Override
	public Table getTable(long objectDefinitionId, String name)
		throws PortalException {

		// TODO Cache this across the cluster with proper invalidation when the
		// object definition or its object fields are updated

		ObjectField objectField = getObjectField(objectDefinitionId, name);

		if (Objects.equals(
				objectField.getDBTableName(),
				ObjectEntryTable.INSTANCE.getTableName())) {

			return ObjectEntryTable.INSTANCE;
		}

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.fetchByPrimaryKey(objectDefinitionId);

		if (objectField.isLocalized()) {
			return DynamicObjectDefinitionLocalizationTableFactory.create(
				objectDefinition, this);
		}

		if (Objects.equals(
				objectField.getDBTableName(),
				objectDefinition.getDBTableName())) {

			if (objectDefinition.isUnmodifiableSystemObject()) {
				SystemObjectDefinitionManager systemObjectDefinitionManager =
					_systemObjectDefinitionManagerRegistry.
						getSystemObjectDefinitionManager(
							objectDefinition.getName());

				return systemObjectDefinitionManager.getTable();
			}

			return new DynamicObjectDefinitionTable(
				objectDefinition,
				objectFieldLocalService.getObjectFields(
					objectDefinitionId, objectDefinition.getDBTableName()),
				objectDefinition.getDBTableName());
		}

		return new DynamicObjectDefinitionTable(
			objectDefinition,
			objectFieldLocalService.getObjectFields(
				objectDefinitionId, objectDefinition.getExtensionDBTableName()),
			objectDefinition.getExtensionDBTableName());
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField updateCustomObjectField(
			String externalReferenceCode, long objectFieldId,
			long listTypeDefinitionId, String businessType, String dbType,
			boolean indexed, boolean indexedAsKeyword, String indexedLanguageId,
			Map<Locale, String> labelMap, boolean localized, String name,
			String readOnly, String readOnlyConditionExpression,
			boolean required, boolean state,
			List<ObjectFieldSetting> objectFieldSettings)
		throws PortalException {

		ObjectField oldObjectField = objectFieldPersistence.findByPrimaryKey(
			objectFieldId);

		ObjectField newObjectField = (ObjectField)oldObjectField.clone();

		_validateExternalReferenceCode(
			externalReferenceCode, newObjectField.getObjectFieldId(),
			newObjectField.getCompanyId(),
			newObjectField.getObjectDefinitionId());

		_validateListTypeDefinitionId(listTypeDefinitionId, businessType);
		_validateBusinessTypeEncrypted(
			newObjectField.getObjectDefinitionId(), businessType);
		_validateIndexed(
			businessType, dbType, indexed, indexedAsKeyword, indexedLanguageId);
		_validateLabel(labelMap, newObjectField);
		_validateLocalized(
			businessType, localized, oldObjectField.getObjectDefinition(),
			required);

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(
				newObjectField.getObjectDefinitionId());

		if (Validator.isNotNull(newObjectField.getRelationshipType())) {
			_validateObjectRelationshipDeletionType(objectFieldId, required);

			newObjectField.setRequired(required);

			if (!Objects.equals(newObjectField.getDBType(), dbType) ||
				!Objects.equals(newObjectField.getName(), name)) {

				throw new ObjectFieldRelationshipTypeException(
					"Object field relationship name and DB type cannot be " +
						"changed");
			}
		}
		else {
			_validateName(objectFieldId, objectDefinition, name, false);
		}

		_validateReadOnlyAndReadOnlyConditionExpression(
			businessType, readOnly, readOnlyConditionExpression);

		_validateState(required, state);

		newObjectField.setExternalReferenceCode(externalReferenceCode);
		newObjectField.setIndexed(indexed);
		newObjectField.setIndexedAsKeyword(indexedAsKeyword);
		newObjectField.setIndexedLanguageId(indexedLanguageId);
		newObjectField.setLabelMap(labelMap, LocaleUtil.getSiteDefault());
		newObjectField.setReadOnly(
			_getReadOnly(
				businessType, objectDefinition.isDefaultStorageType(), name,
				readOnly, false));
		newObjectField.setReadOnlyConditionExpression(
			_getReadOnlyConditionExpression(
				newObjectField.getReadOnly(), readOnlyConditionExpression));

		if (objectDefinition.isApproved()) {
			newObjectField = objectFieldPersistence.update(newObjectField);

			_addOrUpdateObjectFieldSettings(
				objectDefinition, newObjectField, oldObjectField,
				objectFieldSettings);

			return newObjectField;
		}

		_setBusinessTypeAndDBType(businessType, dbType, newObjectField);

		newObjectField.setListTypeDefinitionId(listTypeDefinitionId);

		if (!businessType.equals(
				ObjectFieldConstants.BUSINESS_TYPE_RELATIONSHIP)) {

			newObjectField.setDBColumnName(name + StringPool.UNDERLINE);
		}

		newObjectField.setLocalized(localized);
		newObjectField.setName(name);
		newObjectField.setRequired(required);
		newObjectField.setState(state);

		newObjectField = objectFieldPersistence.update(newObjectField);

		_addOrUpdateObjectFieldSettings(
			objectDefinition, newObjectField, oldObjectField,
			objectFieldSettings);

		return newObjectField;
	}

	@Override
	public ObjectField updateObjectField(
			String externalReferenceCode, long objectFieldId, long userId,
			long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbColumnName, String dbTableName,
			String dbType, boolean indexed, boolean indexedAsKeyword,
			String indexedLanguageId, Map<Locale, String> labelMap,
			boolean localized, String name, String readOnly,
			String readOnlyConditionExpression, boolean required, boolean state,
			boolean system, List<ObjectFieldSetting> objectFieldSettings)
		throws PortalException {

		if (system) {
			return objectFieldLocalService.addOrUpdateSystemObjectField(
				userId, listTypeDefinitionId, objectDefinitionId, businessType,
				dbColumnName, dbTableName, dbType, indexed, indexedAsKeyword,
				indexedLanguageId, labelMap, name, required, state);
		}

		return objectFieldLocalService.addOrUpdateCustomObjectField(
			externalReferenceCode, objectFieldId, userId, listTypeDefinitionId,
			objectDefinitionId, businessType, dbType, indexed, indexedAsKeyword,
			indexedLanguageId, labelMap, localized, name, readOnly,
			readOnlyConditionExpression, required, state, objectFieldSettings);
	}

	@Indexable(type = IndexableType.REINDEX)
	@Override
	public ObjectField updateRequired(long objectFieldId, boolean required)
		throws PortalException {

		ObjectField objectField = objectFieldPersistence.findByPrimaryKey(
			objectFieldId);

		if (StringUtil.equals(
				objectField.getBusinessType(),
				ObjectFieldConstants.BUSINESS_TYPE_RELATIONSHIP)) {

			_validateObjectRelationshipDeletionType(objectFieldId, required);
		}

		objectField.setRequired(required);

		return objectFieldPersistence.update(objectField);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerMap = ServiceTrackerMapFactory.openSingleValueMap(
			bundleContext, ObjectFieldSettingContributor.class,
			"object.field.setting.type.key");
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerMap.close();
	}

	private ObjectField _addObjectField(
			String externalReferenceCode, long userId,
			long listTypeDefinitionId, long objectDefinitionId,
			String businessType, String dbColumnName, String dbTableName,
			String dbType, boolean indexed, boolean indexedAsKeyword,
			String indexedLanguageId, Map<Locale, String> labelMap,
			boolean localized, String name, String readOnly,
			String readOnlyConditionExpression, boolean required, boolean state,
			boolean system)
		throws PortalException {

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(objectDefinitionId);

		_validateExternalReferenceCode(
			externalReferenceCode, 0, objectDefinition.getCompanyId(),
			objectDefinitionId);

		_validateListTypeDefinitionId(listTypeDefinitionId, businessType);
		_validateBusinessType(objectDefinition, businessType);
		_validateIndexed(
			businessType, dbType, indexed, indexedAsKeyword, indexedLanguageId);
		_validateLabel(labelMap, null);
		_validateLocalized(businessType, localized, objectDefinition, required);
		_validateName(0, objectDefinition, name, system);
		_validateReadOnlyAndReadOnlyConditionExpression(
			businessType, readOnly, readOnlyConditionExpression);
		_validateState(required, state);

		ObjectField objectField = objectFieldPersistence.create(
			counterLocalService.increment());

		objectField.setExternalReferenceCode(externalReferenceCode);

		_setBusinessTypeAndDBType(businessType, dbType, objectField);

		User user = _userLocalService.getUser(userId);

		objectField.setCompanyId(user.getCompanyId());
		objectField.setUserId(user.getUserId());
		objectField.setUserName(user.getFullName());

		objectField.setListTypeDefinitionId(listTypeDefinitionId);
		objectField.setObjectDefinitionId(objectDefinitionId);
		objectField.setDBColumnName(dbColumnName);
		objectField.setDBTableName(dbTableName);
		objectField.setIndexed(indexed);
		objectField.setIndexedAsKeyword(indexedAsKeyword);
		objectField.setIndexedLanguageId(indexedLanguageId);
		objectField.setLocalized(localized);
		objectField.setLabelMap(labelMap, LocaleUtil.getSiteDefault());
		objectField.setName(name);
		objectField.setReadOnly(
			_getReadOnly(
				businessType, objectDefinition.isDefaultStorageType(), name,
				readOnly, system));
		objectField.setReadOnlyConditionExpression(
			_getReadOnlyConditionExpression(
				objectField.getReadOnly(), readOnlyConditionExpression));
		objectField.setRelationshipType(null);
		objectField.setRequired(required);
		objectField.setState(state);
		objectField.setSystem(system);

		return objectFieldPersistence.update(objectField);
	}

	private void _addOrUpdateObjectFieldSettings(
			ObjectDefinition objectDefinition, ObjectField newObjectField,
			ObjectField oldObjectField,
			List<ObjectFieldSetting> objectFieldSettings)
		throws PortalException {

		ObjectFieldBusinessType objectFieldBusinessType =
			_objectFieldBusinessTypeRegistry.getObjectFieldBusinessType(
				newObjectField.getBusinessType());

		objectFieldBusinessType.validateObjectFieldSettings(
			newObjectField, objectFieldSettings);

		Set<String> unmodifiableObjectFieldSettingsNames =
			objectFieldBusinessType.getUnmodifiableObjectFieldSettingsNames();

		for (ObjectFieldSetting oldObjectFieldSetting :
				_objectFieldSettingPersistence.findByObjectFieldId(
					newObjectField.getObjectFieldId())) {

			ObjectFieldSetting objectFieldSetting = null;

			for (ObjectFieldSetting newObjectFieldSetting :
					objectFieldSettings) {

				if (Objects.equals(
						oldObjectFieldSetting.getName(),
						newObjectFieldSetting.getName())) {

					objectFieldSetting = newObjectFieldSetting;

					break;
				}
			}

			if (objectFieldSetting == null) {
				if (objectDefinition.isApproved() &&
					unmodifiableObjectFieldSettingsNames.contains(
						oldObjectFieldSetting.getName())) {

					throw new ObjectFieldSettingValueException.
						UnmodifiableValue(oldObjectFieldSetting.getName());
				}

				_objectFieldSettingLocalService.deleteObjectFieldSetting(
					oldObjectFieldSetting.getObjectFieldSettingId());
			}
		}

		objectFieldBusinessType.predefineObjectFieldSettings(
			newObjectField, oldObjectField, objectFieldSettings);

		for (ObjectFieldSetting newObjectFieldSetting : objectFieldSettings) {
			ObjectFieldSetting oldObjectFieldSetting =
				_objectFieldSettingPersistence.fetchByOFI_N(
					newObjectField.getObjectFieldId(),
					newObjectFieldSetting.getName());

			if (objectDefinition.isApproved() && (oldObjectField != null) &&
				unmodifiableObjectFieldSettingsNames.contains(
					newObjectFieldSetting.getName()) &&
				((oldObjectFieldSetting == null) ||
				 !StringUtil.equalsIgnoreCase(
					 oldObjectFieldSetting.getValue(),
					 newObjectFieldSetting.getValue()))) {

				throw new ObjectFieldSettingValueException.UnmodifiableValue(
					newObjectFieldSetting.getName());
			}

			ObjectFieldSettingContributor objectFieldSettingContributor =
				_getObjectFieldSettingContributor(
					newObjectFieldSetting.getName());

			if (oldObjectFieldSetting == null) {
				objectFieldSettingContributor.addObjectFieldSetting(
					newObjectField.getUserId(),
					newObjectField.getObjectFieldId(), newObjectFieldSetting);
			}
			else {
				objectFieldSettingContributor.updateObjectFieldSetting(
					oldObjectFieldSetting.getObjectFieldSettingId(),
					newObjectFieldSetting);
			}
		}

		newObjectField.setObjectFieldSettings(
			_objectFieldSettingLocalService.getObjectFieldObjectFieldSettings(
				newObjectField.getObjectFieldId()));
	}

	private void _alterTableDropColumn(String tableName, String columnName) {
		try {
			Connection connection = _currentConnection.getConnection(
				objectFieldPersistence.getDataSource());

			DB db = objectFieldPersistence.getDB();

			db.alterTableDropColumn(connection, tableName, columnName);
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private ObjectField _deleteObjectField(
			ObjectField objectField, boolean deleteRelationshipObjectField)
		throws PortalException {

		if (Validator.isNull(objectField.getRelationshipType())) {
			if (deleteRelationshipObjectField) {
				throw new ObjectFieldRelationshipTypeException(
					"Object field cannot be deleted because it does not have " +
						"a relationship type");
			}
			else if (!objectField.isDeletionAllowed()) {
				throw new RequiredObjectFieldException();
			}
		}
		else if (!deleteRelationshipObjectField) {
			throw new ObjectFieldRelationshipTypeException(
				"Object field cannot be deleted because it has a " +
					"relationship type");
		}

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(
				objectField.getObjectDefinitionId());

		if (objectDefinition.isSystem() && objectField.isSystem() &&
			!ObjectDefinitionUtil.isInvokerBundleAllowed()) {

			throw new ObjectFieldSystemException(
				"Only allowed bundles can delete system object fields");
		}

		List<ObjectField> objectFields = ListUtil.filter(
			objectFieldLocalService.getObjectFields(
				objectField.getObjectDefinitionId()),
			objectField1 -> !objectField1.isMetadata());

		if (objectDefinition.isApproved() && (objectFields.size() == 1)) {
			throw new RequiredObjectFieldException();
		}

		if (Objects.equals(
				objectField.getBusinessType(),
				ObjectFieldConstants.BUSINESS_TYPE_ATTACHMENT)) {

			ObjectFieldSetting objectFieldSetting =
				_objectFieldSettingPersistence.fetchByOFI_N(
					objectField.getObjectFieldId(), "fileSource");

			if (Objects.equals(objectFieldSetting.getValue(), "userComputer")) {
				List<ObjectEntry> objectEntries =
					_objectEntryPersistence.findByObjectDefinitionId(
						objectField.getObjectDefinitionId());

				for (ObjectEntry objectEntry : objectEntries) {

					// getValues must be called before deleting the object field

					Map<String, Serializable> values = objectEntry.getValues();

					try {
						_dlFileEntryLocalService.deleteFileEntry(
							GetterUtil.getLong(
								values.get(objectField.getName())));
					}
					catch (PortalException portalException) {
						if (_log.isDebugEnabled()) {
							_log.debug(portalException);
						}
					}
				}
			}
		}

		objectField = objectFieldPersistence.remove(objectField);

		if (objectDefinition.getAccountEntryRestrictedObjectFieldId() ==
				objectField.getObjectFieldId()) {

			objectDefinition.setAccountEntryRestrictedObjectFieldId(0);
			objectDefinition.setAccountEntryRestricted(false);

			objectDefinition = _objectDefinitionPersistence.update(
				objectDefinition);
		}

		_objectFieldSettingLocalService.deleteObjectFieldObjectFieldSetting(
			objectField);

		_objectLayoutColumnPersistence.removeByObjectFieldId(
			objectField.getObjectFieldId());

		if (objectField.isState()) {
			_objectStateFlowLocalService.deleteObjectFieldObjectStateFlow(
				objectField.getObjectFieldId());
		}

		if (FeatureFlagManagerUtil.isEnabled("LPS-187846")) {
			_objectValidationRuleLocalService.unassociateObjectField(
				objectField);
		}

		_objectViewLocalService.unassociateObjectField(objectField);

		if (objectDefinition.isApproved() &&
			!objectField.compareBusinessType(
				ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) &&
			!objectField.compareBusinessType(
				ObjectFieldConstants.BUSINESS_TYPE_FORMULA)) {

			_alterTableDropColumn(
				objectField.getDBTableName(), objectField.getDBColumnName());
		}

		if (objectDefinition.isApproved() &&
			objectDefinition.isEnableLocalization() &&
			objectField.isLocalized()) {

			_alterTableDropColumn(
				objectDefinition.getLocalizationDBTableName(),
				objectField.getDBColumnName());
		}

		return objectField;
	}

	private ObjectFieldSettingContributor _getObjectFieldSettingContributor(
		String key) {

		ObjectFieldSettingContributor objectFieldSettingContributor =
			_serviceTrackerMap.getService(key);

		if (objectFieldSettingContributor != null) {
			return objectFieldSettingContributor;
		}

		return _serviceTrackerMap.getService("default");
	}

	private ObjectField _getObjectRelationshipField(
		long objectDefinitionId, String relationshipIdName) {

		for (ObjectField objectField : getObjectFields(objectDefinitionId)) {
			if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_RELATIONSHIP) &&
				StringUtil.endsWith(
					objectField.getName(),
					StringPool.UNDERLINE + relationshipIdName)) {

				return objectField;
			}
		}

		return null;
	}

	private String _getReadOnly(
		String businessType, boolean defaultStorageType, String name,
		String readOnly, boolean system) {

		if (_readOnlyObjectFieldNames.contains(name) ||
			Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) ||
			Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_FORMULA)) {

			return ObjectFieldConstants.READ_ONLY_TRUE;
		}

		if ((!defaultStorageType && !system) || Validator.isNull(readOnly)) {
			return ObjectFieldConstants.READ_ONLY_FALSE;
		}

		return readOnly;
	}

	private String _getReadOnlyConditionExpression(
		String readOnly, String readOnlyConditionExpression) {

		if (Objects.equals(readOnly, ObjectFieldConstants.READ_ONLY_TRUE) ||
			Objects.equals(readOnly, ObjectFieldConstants.READ_ONLY_FALSE)) {

			return StringPool.BLANK;
		}

		return readOnlyConditionExpression;
	}

	private void _setBusinessTypeAndDBType(
			String businessType, String dbType, ObjectField objectField)
		throws PortalException {

		ObjectFieldBusinessType objectFieldBusinessType =
			_objectFieldBusinessTypeRegistry.getObjectFieldBusinessType(
				GetterUtil.getString(businessType));

		Set<String> objectFieldDBTypes =
			_objectFieldBusinessTypeRegistry.getObjectFieldDBTypes();

		if (objectFieldBusinessType != null) {
			objectField.setBusinessType(businessType);
			objectField.setDBType(objectFieldBusinessType.getDBType());
		}
		else if (objectFieldDBTypes.contains(dbType) &&
				 _businessTypes.containsKey(dbType)) {

			objectField.setBusinessType(_businessTypes.get(dbType));
			objectField.setDBType(dbType);
		}
		else {
			if (!businessType.isEmpty()) {
				throw new ObjectFieldBusinessTypeException(
					"Invalid business type " + businessType);
			}

			throw new ObjectFieldDBTypeException("Invalid DB type " + dbType);
		}
	}

	private void _validateBusinessType(
			ObjectDefinition objectDefinition, String businessType)
		throws PortalException {

		if (Objects.equals(
				objectDefinition.getStorageType(),
				ObjectDefinitionConstants.STORAGE_TYPE_SALESFORCE) &&
			(businessType.equals(
				ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) ||
			 businessType.equals(
				 ObjectFieldConstants.BUSINESS_TYPE_ATTACHMENT))) {

			throw new ObjectFieldBusinessTypeException(
				"Salesforce storage type does not support aggregation and " +
					"attachment business types");
		}

		_validateBusinessTypeEncrypted(
			objectDefinition.getObjectDefinitionId(), businessType);
	}

	private void _validateBusinessTypeEncrypted(
			long objectDefinitionId, String businessType)
		throws PortalException {

		if (!Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_ENCRYPTED)) {

			return;
		}

		if (!PropsValues.OBJECT_ENCRYPTION_ENABLED) {
			throw new ObjectFieldBusinessTypeException(
				"Business type encrypted is disabled");
		}

		if (Validator.isNull(PropsValues.OBJECT_ENCRYPTION_ALGORITHM)) {
			throw new ObjectFieldBusinessTypeException(
				"Encryption algorithm is required for business type encrypted");
		}

		if (Validator.isNull(PropsValues.OBJECT_ENCRYPTION_KEY)) {
			throw new ObjectFieldBusinessTypeException(
				"Encryption key is required for business type encrypted");
		}

		ObjectDefinition objectDefinition =
			_objectDefinitionPersistence.findByPrimaryKey(objectDefinitionId);

		if (!objectDefinition.isDefaultStorageType()) {
			throw new ObjectFieldBusinessTypeException(
				"Business type encrypted can only be used in object " +
					"definitions with a default storage type");
		}

		try {
			new SecretKeySpec(
				Base64.decode(PropsValues.OBJECT_ENCRYPTION_KEY),
				PropsValues.OBJECT_ENCRYPTION_ALGORITHM);
		}
		catch (Exception exception) {
			throw new PortalException(exception);
		}
	}

	private void _validateExternalReferenceCode(
			String externalReferenceCode, long objectFieldId, long companyId,
			long objectDefinitionId)
		throws PortalException {

		if (Validator.isNull(externalReferenceCode)) {
			return;
		}

		ObjectField objectField = objectFieldPersistence.fetchByERC_C_ODI(
			externalReferenceCode, companyId, objectDefinitionId);

		if ((objectField != null) &&
			(objectField.getObjectFieldId() != objectFieldId)) {

			throw new DuplicateObjectFieldExternalReferenceCodeException();
		}
	}

	private void _validateIndexed(
			String businessType, String dbType, boolean indexed,
			boolean indexedAsKeyword, String indexedLanguageId)
		throws PortalException {

		if (indexed &&
			Objects.equals(dbType, ObjectFieldConstants.DB_TYPE_BLOB)) {

			throw new ObjectFieldDBTypeException("Blob type is not indexable");
		}

		if (((!Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_ATTACHMENT) &&
			  !Objects.equals(dbType, ObjectFieldConstants.DB_TYPE_CLOB) &&
			  !Objects.equals(dbType, ObjectFieldConstants.DB_TYPE_STRING)) ||
			 indexedAsKeyword) &&
			!Validator.isBlank(indexedLanguageId)) {

			throw new ObjectFieldDBTypeException(
				"Indexed language ID can only be applied with type \"Clob\" " +
					"or \"String\" that is not indexed as a keyword");
		}

		if (Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_ENCRYPTED) &&
			indexed) {

			throw new ObjectFieldBusinessTypeException(
				"Encrypted business type is not indexable");
		}
	}

	private void _validateLabel(
			Map<Locale, String> labelMap, ObjectField objectField)
		throws PortalException {

		Locale locale = LocaleUtil.getSiteDefault();

		if (objectField == null) {
			_validateLabelLocale(labelMap, locale);
		}
		else {
			Locale objectFieldDefaultLocale = LocaleUtil.fromLanguageId(
				objectField.getDefaultLanguageId());

			_validateLabelLocale(labelMap, objectFieldDefaultLocale);

			if (Validator.isNull(labelMap.get(locale))) {
				labelMap.put(locale, labelMap.get(objectFieldDefaultLocale));
			}
		}
	}

	private void _validateLabelLocale(
			Map<Locale, String> labelMap, Locale locale)
		throws PortalException {

		if ((labelMap == null) || Validator.isNull(labelMap.get(locale))) {
			throw new ObjectFieldLabelException(
				"Label is null for locale " + locale.getDisplayName());
		}
	}

	private void _validateListTypeDefinitionId(
			long listTypeDefinitionId, String businessType)
		throws PortalException {

		if ((listTypeDefinitionId == 0) &&
			(StringUtil.equals(
				businessType,
				ObjectFieldConstants.BUSINESS_TYPE_MULTISELECT_PICKLIST) ||
			 StringUtil.equals(
				 businessType, ObjectFieldConstants.BUSINESS_TYPE_PICKLIST))) {

			throw new ObjectFieldListTypeDefinitionIdException(
				"List type definition ID is 0");
		}
	}

	private void _validateLocalized(
			String businessType, boolean localized,
			ObjectDefinition objectDefinition, boolean required)
		throws PortalException {

		if (!localized) {
			return;
		}

		if (!businessType.equals(
				ObjectFieldConstants.BUSINESS_TYPE_LONG_TEXT) &&
			!businessType.equals(
				ObjectFieldConstants.BUSINESS_TYPE_RICH_TEXT) &&
			!businessType.equals(ObjectFieldConstants.BUSINESS_TYPE_TEXT)) {

			throw new ObjectFieldLocalizedException(
				StringBundler.concat(
					"Only ", ObjectFieldConstants.BUSINESS_TYPE_LONG_TEXT,
					StringPool.COMMA,
					ObjectFieldConstants.BUSINESS_TYPE_RICH_TEXT, " and ",
					ObjectFieldConstants.BUSINESS_TYPE_TEXT,
					" business types support localization"));
		}

		if (!objectDefinition.isEnableLocalization()) {
			throw new ObjectDefinitionEnableLocalizationException();
		}

		if (required) {
			throw new ObjectFieldLocalizedException(
				"Localized object fields must not be required");
		}
	}

	private void _validateName(
			long objectFieldId, ObjectDefinition objectDefinition, String name,
			boolean system)
		throws PortalException {

		if (Validator.isNull(name)) {
			throw new ObjectFieldNameException.MustNotBeNull();
		}

		char[] nameCharArray = name.toCharArray();

		for (char c : nameCharArray) {
			if (!Validator.isChar(c) && !Validator.isDigit(c)) {
				throw new ObjectFieldNameException.
					MustOnlyContainLettersAndDigits();
			}
		}

		if (!Character.isLowerCase(nameCharArray[0])) {
			throw new ObjectFieldNameException.MustBeginWithLowerCaseLetter();
		}

		if (nameCharArray.length > 41) {
			throw new ObjectFieldNameException.MustBeLessThan41Characters();
		}

		if ((!system &&
			 _reservedNames.contains(StringUtil.toLowerCase(name))) ||
			StringUtil.equalsIgnoreCase(
				objectDefinition.getPKObjectFieldName(), name)) {

			throw new ObjectFieldNameException.MustNotBeReserved(name);
		}

		ObjectField objectField = objectFieldPersistence.fetchByODI_N(
			objectDefinition.getObjectDefinitionId(), name);

		if ((objectField != null) &&
			(objectField.getObjectFieldId() != objectFieldId)) {

			throw new ObjectFieldNameException.MustNotBeDuplicate(name);
		}
	}

	private void _validateObjectRelationshipDeletionType(
			long objectFieldId, boolean required)
		throws PortalException {

		ObjectRelationship objectRelationship =
			_objectRelationshipPersistence.fetchByObjectFieldId2(objectFieldId);

		if (StringUtil.equals(
				objectRelationship.getDeletionType(),
				ObjectRelationshipConstants.DELETION_TYPE_DISASSOCIATE) &&
			required) {

			throw new ObjectFieldRelationshipTypeException(
				"Object field cannot be required because the relationship " +
					"deletion type is disassociate");
		}
	}

	private void _validateReadOnlyAndReadOnlyConditionExpression(
			String businessType, String readOnly,
			String readOnlyConditionExpression)
		throws PortalException {

		if (Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) ||
			Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_FORMULA) ||
			Validator.isNull(readOnly)) {

			return;
		}

		if (!(Objects.equals(
				readOnly, ObjectFieldConstants.READ_ONLY_CONDITIONAL) ||
			  Objects.equals(readOnly, ObjectFieldConstants.READ_ONLY_FALSE) ||
			  Objects.equals(readOnly, ObjectFieldConstants.READ_ONLY_TRUE))) {

			throw new ObjectFieldReadOnlyException(
				"Unknown read only: " + readOnly);
		}

		if (Objects.equals(
				readOnly, ObjectFieldConstants.READ_ONLY_CONDITIONAL)) {

			if (Validator.isNull(readOnlyConditionExpression)) {
				throw new ObjectFieldReadOnlyConditionExpressionException(
					"Read only condition expression is required");
			}

			try {
				_ddmExpressionFactory.createExpression(
					CreateExpressionRequest.Builder.newBuilder(
						readOnlyConditionExpression
					).build());
			}
			catch (Exception exception) {
				if (_log.isDebugEnabled()) {
					_log.debug(exception);
				}

				throw new ObjectFieldReadOnlyConditionExpressionException(
					"Syntax error in: " + readOnlyConditionExpression);
			}
		}
	}

	private void _validateState(boolean required, boolean state)
		throws PortalException {

		if (state && !required) {
			throw new ObjectFieldStateException(
				"Object field must be required when the state is true");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ObjectFieldLocalServiceImpl.class);

	private final Map<String, String> _businessTypes = HashMapBuilder.put(
		"BigDecimal", "PrecisionDecimal"
	).put(
		"Blob", "LargeFile"
	).put(
		"Boolean", "Boolean"
	).put(
		"Clob", "LongText"
	).put(
		"Date", "Date"
	).put(
		"DateTime", "DateTime"
	).put(
		"Double", "Decimal"
	).put(
		"Integer", "Integer"
	).put(
		"Long", "LongInteger"
	).put(
		"String", "Text"
	).build();

	@Reference
	private CurrentConnection _currentConnection;

	@Reference
	private DDMExpressionFactory _ddmExpressionFactory;

	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	private ObjectDefinitionPersistence _objectDefinitionPersistence;

	@Reference
	private ObjectEntryPersistence _objectEntryPersistence;

	@Reference
	private ObjectFieldBusinessTypeRegistry _objectFieldBusinessTypeRegistry;

	@Reference
	private ObjectFieldSettingLocalService _objectFieldSettingLocalService;

	@Reference
	private ObjectFieldSettingPersistence _objectFieldSettingPersistence;

	@Reference
	private ObjectLayoutColumnPersistence _objectLayoutColumnPersistence;

	@Reference
	private ObjectRelationshipPersistence _objectRelationshipPersistence;

	@Reference
	private ObjectStateFlowLocalService _objectStateFlowLocalService;

	@Reference
	private ObjectValidationRuleLocalService _objectValidationRuleLocalService;

	@Reference
	private ObjectViewLocalService _objectViewLocalService;

	private final Set<String> _readOnlyObjectFieldNames = SetUtil.fromArray(
		"createDate", "creator", "id", "modifiedDate", "status");
	private final Set<String> _reservedNames = SetUtil.fromArray(
		"actions", "companyid", "createdate", "creator", "datecreated",
		"datemodified", "externalreferencecode", "groupid", "id",
		"lastpublishdate", "modifieddate", "status", "statusbyuserid",
		"statusbyusername", "statusdate", "userid", "username");
	private ServiceTrackerMap<String, ObjectFieldSettingContributor>
		_serviceTrackerMap;

	@Reference
	private SystemObjectDefinitionManagerRegistry
		_systemObjectDefinitionManagerRegistry;

	@Reference
	private UserLocalService _userLocalService;

}