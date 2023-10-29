/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.internal.test;

import javax.ws.rs.core.MultivaluedMap;

/**
 * @author Arthur Chan
 */
public interface AuthorizationGrant {

	public MultivaluedMap<String, String> getAuthorizationGrantParameters();

}