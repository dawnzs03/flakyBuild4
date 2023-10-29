/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.rest.internal.endpoint.info;

import com.liferay.oauth2.provider.model.OAuth2Application;
import com.liferay.oauth2.provider.service.OAuth2ApplicationLocalService;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.util.Validator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Stian Sigvartsen
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.OAuth2.Application)",
		"osgi.jaxrs.name=Liferay.Authorization.Application.Info",
		"osgi.jaxrs.resource=true"
	},
	service = OAuth2ProviderApplicationInfo.class
)
@Path("/application")
public class OAuth2ProviderApplicationInfo {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(
		@QueryParam("externalReferenceCode") String externalReferenceCode) {

		OAuth2Application oAuth2Application = null;

		if (!Validator.isBlank(externalReferenceCode)) {
			oAuth2Application =
				_oAuth2ApplicationLocalService.
					fetchOAuth2ApplicationByExternalReferenceCode(
						externalReferenceCode,
						CompanyThreadLocal.getCompanyId());
		}

		if (oAuth2Application == null) {
			return Response.status(
				Response.Status.BAD_REQUEST
			).type(
				MediaType.TEXT_PLAIN
			).build();
		}

		return Response.ok(
			JSONUtil.put(
				"client_id", oAuth2Application.getClientId()
			).toString()
		).build();
	}

	@Reference
	private OAuth2ApplicationLocalService _oAuth2ApplicationLocalService;

}