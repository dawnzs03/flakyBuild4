/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ObjectEntryService}.
 *
 * @author Marco Leo
 * @see ObjectEntryService
 * @generated
 */
public class ObjectEntryServiceWrapper
	implements ObjectEntryService, ServiceWrapper<ObjectEntryService> {

	public ObjectEntryServiceWrapper() {
		this(null);
	}

	public ObjectEntryServiceWrapper(ObjectEntryService objectEntryService) {
		_objectEntryService = objectEntryService;
	}

	@Override
	public com.liferay.object.model.ObjectEntry addObjectEntry(
			long groupId, long objectDefinitionId,
			java.util.Map<String, java.io.Serializable> values,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.addObjectEntry(
			groupId, objectDefinitionId, values, serviceContext);
	}

	@Override
	public com.liferay.object.model.ObjectEntry addOrUpdateObjectEntry(
			String externalReferenceCode, long groupId, long objectDefinitionId,
			java.util.Map<String, java.io.Serializable> values,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.addOrUpdateObjectEntry(
			externalReferenceCode, groupId, objectDefinitionId, values,
			serviceContext);
	}

	@Override
	public void checkModelResourcePermission(
			long objectDefinitionId, long objectEntryId, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_objectEntryService.checkModelResourcePermission(
			objectDefinitionId, objectEntryId, actionId);
	}

	@Override
	public com.liferay.object.model.ObjectEntry deleteObjectEntry(
			long objectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.deleteObjectEntry(objectEntryId);
	}

	@Override
	public com.liferay.object.model.ObjectEntry deleteObjectEntry(
			String externalReferenceCode, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.deleteObjectEntry(
			externalReferenceCode, companyId, groupId);
	}

	@Override
	public com.liferay.object.model.ObjectEntry fetchManyToOneObjectEntry(
			long groupId, long objectRelationshipId, long primaryKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.fetchManyToOneObjectEntry(
			groupId, objectRelationshipId, primaryKey);
	}

	@Override
	public com.liferay.object.model.ObjectEntry fetchObjectEntry(
			long objectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.fetchObjectEntry(objectEntryId);
	}

	@Override
	public java.util.List<com.liferay.object.model.ObjectEntry>
			getManyToManyObjectEntries(
				long groupId, long objectRelationshipId, long primaryKey,
				boolean related, boolean reverse, String search, int start,
				int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getManyToManyObjectEntries(
			groupId, objectRelationshipId, primaryKey, related, reverse, search,
			start, end);
	}

	@Override
	public int getManyToManyObjectEntriesCount(
			long groupId, long objectRelationshipId, long primaryKey,
			boolean related, boolean reverse, String search)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getManyToManyObjectEntriesCount(
			groupId, objectRelationshipId, primaryKey, related, reverse,
			search);
	}

	@Override
	public com.liferay.portal.kernel.security.permission.resource.
		ModelResourcePermission<com.liferay.object.model.ObjectEntry>
				getModelResourcePermission(
					com.liferay.object.model.ObjectEntry objectEntry)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getModelResourcePermission(objectEntry);
	}

	@Override
	public com.liferay.object.model.ObjectEntry getObjectEntry(
			long objectEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getObjectEntry(objectEntryId);
	}

	@Override
	public com.liferay.object.model.ObjectEntry getObjectEntry(
			String externalReferenceCode, long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getObjectEntry(
			externalReferenceCode, companyId, groupId);
	}

	@Override
	public java.util.List<com.liferay.object.model.ObjectEntry>
			getOneToManyObjectEntries(
				long groupId, long objectRelationshipId, long primaryKey,
				boolean related, String search, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getOneToManyObjectEntries(
			groupId, objectRelationshipId, primaryKey, related, search, start,
			end);
	}

	@Override
	public int getOneToManyObjectEntriesCount(
			long groupId, long objectRelationshipId, long primaryKey,
			boolean related, String search)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.getOneToManyObjectEntriesCount(
			groupId, objectRelationshipId, primaryKey, related, search);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _objectEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public boolean hasModelResourcePermission(
			long objectDefinitionId, long objectEntryId, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.hasModelResourcePermission(
			objectDefinitionId, objectEntryId, actionId);
	}

	@Override
	public boolean hasModelResourcePermission(
			com.liferay.object.model.ObjectEntry objectEntry, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.hasModelResourcePermission(
			objectEntry, actionId);
	}

	@Override
	public boolean hasModelResourcePermission(
			com.liferay.portal.kernel.model.User user, long objectEntryId,
			String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.hasModelResourcePermission(
			user, objectEntryId, actionId);
	}

	@Override
	public boolean hasPortletResourcePermission(
			long groupId, long objectDefinitionId, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.hasPortletResourcePermission(
			groupId, objectDefinitionId, actionId);
	}

	@Override
	public com.liferay.object.model.ObjectEntry updateObjectEntry(
			long objectEntryId,
			java.util.Map<String, java.io.Serializable> values,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _objectEntryService.updateObjectEntry(
			objectEntryId, values, serviceContext);
	}

	@Override
	public ObjectEntryService getWrappedService() {
		return _objectEntryService;
	}

	@Override
	public void setWrappedService(ObjectEntryService objectEntryService) {
		_objectEntryService = objectEntryService;
	}

	private ObjectEntryService _objectEntryService;

}