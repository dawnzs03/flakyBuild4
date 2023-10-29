/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.security.sso.openid.connect.persistence.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.security.sso.openid.connect.persistence.model.OpenIdConnectSession;
import com.liferay.portal.security.sso.openid.connect.persistence.service.base.OpenIdConnectSessionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Arthur Chan
 */
@Component(
	property = "model.class.name=com.liferay.portal.security.sso.openid.connect.persistence.model.OpenIdConnectSession",
	service = AopService.class
)
public class OpenIdConnectSessionLocalServiceImpl
	extends OpenIdConnectSessionLocalServiceBaseImpl {

	@Override
	public void deleteOpenIdConnectSessions(long userId) {
		openIdConnectSessionPersistence.removeByUserId(userId);
	}

	@Override
	public void deleteOpenIdConnectSessions(
		long companyId, String authServerWellKnownURI, String clientId) {

		openIdConnectSessionPersistence.removeByC_A_C(
			companyId, authServerWellKnownURI, clientId);
	}

	@Override
	public OpenIdConnectSession fetchOpenIdConnectSession(
		long userId, String authServerWellKnownURI, String clientId) {

		return openIdConnectSessionPersistence.fetchByU_A_C(
			userId, authServerWellKnownURI, clientId);
	}

	@Override
	public List<OpenIdConnectSession>
		getAccessTokenExpirationDateOpenIdConnectSessions(
			Date ltAccessTokenExpirationDate, int start, int end) {

		return openIdConnectSessionPersistence.
			findByLtAccessTokenExpirationDate(
				ltAccessTokenExpirationDate, start, end);
	}

}