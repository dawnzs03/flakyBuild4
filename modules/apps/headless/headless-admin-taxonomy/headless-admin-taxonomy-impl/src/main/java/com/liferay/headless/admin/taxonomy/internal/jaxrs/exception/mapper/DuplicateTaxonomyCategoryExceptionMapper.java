/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.taxonomy.internal.jaxrs.exception.mapper;

import com.liferay.asset.kernel.exception.DuplicateCategoryException;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * Converts any {@code DuplicateTagException} to a {@code 409} error.
 *
 * @author Víctor Galán
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Admin.Taxonomy)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Admin.Taxonomy.DuplicateTaxonomyCategoryExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicateTaxonomyCategoryExceptionMapper
	extends BaseExceptionMapper<DuplicateCategoryException> {

	@Override
	protected Problem getProblem(
		DuplicateCategoryException duplicateCategoryException) {

		return new Problem(
			Response.Status.CONFLICT,
			StringUtil.replace(
				duplicateCategoryException.getMessage(), "category",
				"taxonomy category"));
	}

}