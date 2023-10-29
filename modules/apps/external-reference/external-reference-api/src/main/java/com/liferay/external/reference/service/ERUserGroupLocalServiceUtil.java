/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.external.reference.service;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the local service utility for ERUserGroup. This utility wraps
 * <code>com.liferay.external.reference.service.impl.ERUserGroupLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ERUserGroupLocalService
 * @generated
 */
public class ERUserGroupLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.external.reference.service.impl.ERUserGroupLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.UserGroup
			addOrUpdateUserGroup(
				String externalReferenceCode, long userId, long companyId,
				String name, String description,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addOrUpdateUserGroup(
			externalReferenceCode, userId, companyId, name, description,
			serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ERUserGroupLocalService getService() {
		return _service;
	}

	public static void setService(ERUserGroupLocalService service) {
		_service = service;
	}

	private static volatile ERUserGroupLocalService _service;

}