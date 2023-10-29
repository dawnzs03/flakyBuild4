/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.resource.v1_0;

import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.rest.openapi.v1_0.ObjectEntryOpenAPIResource;
import com.liferay.object.rest.openapi.v1_0.ObjectEntryOpenAPIResourceProvider;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author Javier Gamarra
 */
@OpenAPIDefinition(info = @Info(title = "Object", version = "v1.0"))
public class OpenAPIResourceImpl {

	public OpenAPIResourceImpl(
		ObjectEntryOpenAPIResourceProvider objectEntryOpenAPIResourceProvider) {

		_objectEntryOpenAPIResourceProvider =
			objectEntryOpenAPIResourceProvider;
	}

	@GET
	@Path("/openapi.{type:json|yaml}")
	@Produces({MediaType.APPLICATION_JSON, "application/yaml"})
	public Response getOpenAPI(@PathParam("type") String type)
		throws Exception {

		ObjectEntryOpenAPIResource objectEntryOpenAPIResource =
			_objectEntryOpenAPIResourceProvider.getObjectEntryOpenAPIResource(
				_objectDefinition);

		return objectEntryOpenAPIResource.getOpenAPI(
			_httpServletRequest, type, _uriInfo);
	}

	@Context
	private HttpServletRequest _httpServletRequest;

	@Context
	private ObjectDefinition _objectDefinition;

	private final ObjectEntryOpenAPIResourceProvider
		_objectEntryOpenAPIResourceProvider;

	@Context
	private UriInfo _uriInfo;

}