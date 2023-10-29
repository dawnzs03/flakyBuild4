/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface ResourcePermissionFinder {

	public int countByR_S(long roleId, int[] scopes);

	public int countByC_N_S_P_R_A(
		long companyId, String name, int scope, String primKey, long[] roleIds,
		long actionId);

	public java.util.Map
		<java.io.Serializable,
		 com.liferay.portal.kernel.model.ResourcePermission> fetchByPrimaryKeys(
			java.util.Set<java.io.Serializable> primaryKeys);

	public java.util.List<com.liferay.portal.kernel.model.ResourcePermission>
		findByResource(
			long companyId, long groupId, String name, String primKey);

	public java.util.List<com.liferay.portal.kernel.model.ResourcePermission>
		findByR_S(long roleId, int[] scopes, int start, int end);

}