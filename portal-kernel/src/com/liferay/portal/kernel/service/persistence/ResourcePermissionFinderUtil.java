/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ResourcePermissionFinderUtil {

	public static int countByR_S(long roleId, int[] scopes) {
		return getFinder().countByR_S(roleId, scopes);
	}

	public static int countByC_N_S_P_R_A(
		long companyId, String name, int scope, String primKey, long[] roleIds,
		long actionId) {

		return getFinder().countByC_N_S_P_R_A(
			companyId, name, scope, primKey, roleIds, actionId);
	}

	public static java.util.Map
		<java.io.Serializable,
		 com.liferay.portal.kernel.model.ResourcePermission> fetchByPrimaryKeys(
			java.util.Set<java.io.Serializable> primaryKeys) {

		return getFinder().fetchByPrimaryKeys(primaryKeys);
	}

	public static java.util.List
		<com.liferay.portal.kernel.model.ResourcePermission> findByResource(
			long companyId, long groupId, String name, String primKey) {

		return getFinder().findByResource(companyId, groupId, name, primKey);
	}

	public static java.util.List
		<com.liferay.portal.kernel.model.ResourcePermission> findByR_S(
			long roleId, int[] scopes, int start, int end) {

		return getFinder().findByR_S(roleId, scopes, start, end);
	}

	public static ResourcePermissionFinder getFinder() {
		if (_finder == null) {
			_finder = (ResourcePermissionFinder)PortalBeanLocatorUtil.locate(
				ResourcePermissionFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(ResourcePermissionFinder finder) {
		_finder = finder;
	}

	private static ResourcePermissionFinder _finder;

}