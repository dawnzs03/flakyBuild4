/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.builder.internal.helper;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.object.rest.filter.parser.ObjectDefinitionFilterParser;
import com.liferay.object.rest.manager.v1_0.DefaultObjectEntryManager;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManager;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactory;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.filter.expression.Expression;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;
import com.liferay.portal.vulcan.fields.NestedFieldsContext;
import com.liferay.portal.vulcan.fields.NestedFieldsContextThreadLocal;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.ws.rs.BadRequestException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Luis Miguel Barcos
 * @author Carlos Correa
 * @author Alejandro Tardín
 */
@Component(service = ObjectEntryHelper.class)
public class ObjectEntryHelper {

	public List<ObjectEntry> getObjectEntries(
			long companyId, String filterString, List<String> nestedFields,
			String objectDefinitionExternalReferenceCode)
		throws Exception {

		Page<ObjectEntry> objectEntriesPage = getObjectEntriesPage(
			companyId, filterString, nestedFields,
			Pagination.of(QueryUtil.ALL_POS, QueryUtil.ALL_POS),
			objectDefinitionExternalReferenceCode);

		return new ArrayList<>(objectEntriesPage.getItems());
	}

	public List<ObjectEntry> getObjectEntries(
			long companyId, String filterString,
			String objectDefinitionExternalReferenceCode)
		throws Exception {

		return getObjectEntries(
			companyId, filterString, Collections.emptyList(),
			objectDefinitionExternalReferenceCode);
	}

	public Page<ObjectEntry> getObjectEntriesPage(
			long companyId, Expression filterExpression,
			List<String> nestedFields, Pagination pagination,
			String objectDefinitionExternalReferenceCode, String scopeKey,
			Sort[] sorts)
		throws Exception {

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalService.
				fetchObjectDefinitionByExternalReferenceCode(
					objectDefinitionExternalReferenceCode, companyId);

		if (objectDefinition == null) {
			return Page.of(Collections.emptyList());
		}

		return _withNestedFields(
			nestedFields,
			() -> {
				PermissionThreadLocal.setPermissionChecker(
					_permissionCheckerFactory.create(
						_userLocalService.getUser(
							objectDefinition.getUserId())));

				DefaultObjectEntryManager defaultObjectEntryManager =
					(DefaultObjectEntryManager)_objectEntryManager;

				return defaultObjectEntryManager.getObjectEntries(
					companyId, objectDefinition, scopeKey, null,
					_getDefaultDTOConverterContext(objectDefinition),
					filterExpression, pagination, null, sorts);
			});
	}

	public Page<ObjectEntry> getObjectEntriesPage(
			long companyId, String filterString, List<String> nestedFields,
			Pagination pagination, String objectDefinitionExternalReferenceCode)
		throws Exception {

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalService.
				fetchObjectDefinitionByExternalReferenceCode(
					objectDefinitionExternalReferenceCode, companyId);

		if (objectDefinition == null) {
			return Page.of(Collections.emptyList());
		}

		return getObjectEntriesPage(
			companyId,
			_objectDefinitionFilterParser.parse(filterString, objectDefinition),
			nestedFields, pagination, objectDefinitionExternalReferenceCode,
			null, null);
	}

	public ObjectEntry getObjectEntry(
			long companyId, List<String> nestedFields, long objectEntryId,
			String objectDefinitionExternalReferenceCode)
		throws Exception {

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalService.
				fetchObjectDefinitionByExternalReferenceCode(
					objectDefinitionExternalReferenceCode, companyId);

		if (objectDefinition == null) {
			return null;
		}

		return _withNestedFields(
			nestedFields,
			() -> {
				PermissionThreadLocal.setPermissionChecker(
					_permissionCheckerFactory.create(
						_userLocalService.getUser(
							objectDefinition.getUserId())));

				DefaultObjectEntryManager defaultObjectEntryManager =
					(DefaultObjectEntryManager)_objectEntryManager;

				return defaultObjectEntryManager.getObjectEntry(
					_getDefaultDTOConverterContext(objectDefinition),
					objectDefinition, objectEntryId);
			});
	}

	public ObjectEntry getObjectEntry(
			long companyId, String filterString,
			String objectDefinitionExternalReferenceCode)
		throws Exception {

		List<ObjectEntry> objectEntries = getObjectEntries(
			companyId, filterString, objectDefinitionExternalReferenceCode);

		if (ListUtil.isEmpty(objectEntries)) {
			return null;
		}

		return objectEntries.get(0);
	}

	public ObjectDefinition getPropertyObjectDefinition(
			ObjectDefinition objectDefinition,
			List<String> objectRelationshipNames)
		throws Exception {

		if (ListUtil.isEmpty(objectRelationshipNames)) {
			return objectDefinition;
		}

		return getPropertyObjectDefinition(
			_getRelatedObjectDefinition(
				objectDefinition,
				_objectRelationshipLocalService.
					getObjectRelationshipByObjectDefinitionId(
						objectDefinition.getObjectDefinitionId(),
						StringUtil.trim(objectRelationshipNames.remove(0)))),
			objectRelationshipNames);
	}

	public boolean isValidObjectEntry(
			long objectEntryId, String externalReferenceCode)
		throws Exception {

		if (objectEntryId == 0) {
			return false;
		}

		com.liferay.object.model.ObjectEntry objectEntry =
			_objectEntryLocalService.fetchObjectEntry(objectEntryId);

		if (objectEntry == null) {
			return false;
		}

		ObjectDefinition objectDefinition =
			_objectDefinitionLocalService.getObjectDefinition(
				objectEntry.getObjectDefinitionId());

		if (!Objects.equals(
				objectDefinition.getExternalReferenceCode(),
				externalReferenceCode)) {

			return false;
		}

		return true;
	}

	private DTOConverterContext _getDefaultDTOConverterContext(
			ObjectDefinition objectDefinition)
		throws Exception {

		return new DefaultDTOConverterContext(
			false, null, null, null, null, LocaleUtil.getSiteDefault(), null,
			_userLocalService.getUser(objectDefinition.getUserId()));
	}

	private ObjectDefinition _getRelatedObjectDefinition(
			ObjectDefinition objectDefinition,
			ObjectRelationship objectRelationship)
		throws Exception {

		long relatedObjectDefinitionId = 0;

		if (objectRelationship.getObjectDefinitionId1() ==
				objectDefinition.getObjectDefinitionId()) {

			relatedObjectDefinitionId =
				objectRelationship.getObjectDefinitionId2();
		}
		else {
			relatedObjectDefinitionId =
				objectRelationship.getObjectDefinitionId1();
		}

		ObjectDefinition relatedObjectDefinition =
			_objectDefinitionLocalService.getObjectDefinition(
				relatedObjectDefinitionId);

		if (!relatedObjectDefinition.isActive()) {
			throw new BadRequestException(
				"Object definition " +
					relatedObjectDefinition.getObjectDefinitionId() +
						" is inactive");
		}

		return relatedObjectDefinition;
	}

	private <T> T _withNestedFields(
			List<String> nestedFields,
			UnsafeSupplier<T, Exception> unsafeSupplier)
		throws Exception {

		NestedFieldsContext nestedFieldsContext = new NestedFieldsContext(
			nestedFields.size(), nestedFields);

		NestedFieldsContext oldNestedFieldsContext =
			NestedFieldsContextThreadLocal.getAndSetNestedFieldsContext(
				nestedFieldsContext);

		try {
			return unsafeSupplier.get();
		}
		finally {
			NestedFieldsContextThreadLocal.setNestedFieldsContext(
				oldNestedFieldsContext);
		}
	}

	@Reference
	private ObjectDefinitionFilterParser _objectDefinitionFilterParser;

	@Reference
	private ObjectDefinitionLocalService _objectDefinitionLocalService;

	@Reference
	private ObjectEntryLocalService _objectEntryLocalService;

	@Reference(target = "(object.entry.manager.storage.type=default)")
	private ObjectEntryManager _objectEntryManager;

	@Reference
	private ObjectRelationshipLocalService _objectRelationshipLocalService;

	@Reference
	private PermissionCheckerFactory _permissionCheckerFactory;

	@Reference
	private UserLocalService _userLocalService;

}