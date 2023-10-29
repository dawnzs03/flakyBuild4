/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.openapi.v1_0;

import com.liferay.portal.vulcan.batch.engine.Field;

import io.swagger.v3.oas.models.media.Schema;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author Luis Miguel Barcos
 */
public interface ObjectEntryOpenAPIResource {

	public Map<String, Field> getFields(UriInfo uriInfo) throws Exception;

	public Response getOpenAPI(
			HttpServletRequest httpServletRequest, String type, UriInfo uriInfo)
		throws Exception;

	public Map<String, Schema> getSchemas() throws Exception;

}