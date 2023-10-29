/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.internal.jaxrs.exception.mapper;

import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;
import com.liferay.wiki.exception.DuplicateNodeNameException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * Converts any {@code DuplicateNodeNameException} to a {@code 400} error.
 *
 * @author Javier Gamarra
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Delivery)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Delivery.DuplicateWikiNodeNameExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicateWikiNodeNameExceptionMapper
	extends BaseExceptionMapper<DuplicateNodeNameException> {

	@Override
	protected Problem getProblem(
		DuplicateNodeNameException duplicateNodeNameException) {

		return new Problem(
			Response.Status.CONFLICT,
			"A wiki node already exists with the name " +
				duplicateNodeNameException.getMessage());
	}

}