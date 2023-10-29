/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.runtime.servlet.profile;

import com.liferay.saml.persistence.model.SamlSpIdpConnection;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stian Sigvartsen
 */
public interface SamlSpIdpConnectionsProfile {

	public boolean isEnabled(
		SamlSpIdpConnection samlSpIdpConnection,
		HttpServletRequest httpServletRequest);

}