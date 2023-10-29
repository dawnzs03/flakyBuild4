/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.search.experiences.rest.internal.jaxrs.exception;

import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;
import com.liferay.search.experiences.exception.DuplicateSXPBlueprintExternalReferenceCodeException;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author Gustavo Lima
 */
@Component(
	enabled = false,
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Search.Experiences.REST)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Search.Experiences.REST.DuplicateSXPBlueprintExternalReferenceCodeExceptionMapper"
	},
	service = ExceptionMapper.class
)
@Provider
public class DuplicateSXPBlueprintExternalReferenceCodeExceptionMapper
	extends BaseExceptionMapper
		<DuplicateSXPBlueprintExternalReferenceCodeException> {

	@Override
	protected Problem getProblem(
		DuplicateSXPBlueprintExternalReferenceCodeException
			duplicateSXPBlueprintExternalReferenceCodeException) {

		return new Problem(duplicateSXPBlueprintExternalReferenceCodeException);
	}

}