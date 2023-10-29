/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.taxonomy.internal.jaxrs.exception.mapper;

import com.liferay.asset.kernel.exception.DuplicateVocabularyException;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * Converts any {@code DuplicateVocabularyException} to a {@code 409} error.
 *
 * @author Víctor Galán
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Admin.Taxonomy)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Admin.Taxonomy.DuplicateTaxonomyVocabularyExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicateTaxonomyVocabularyExceptionMapper
	extends BaseExceptionMapper<DuplicateVocabularyException> {

	@Override
	protected Problem getProblem(
		DuplicateVocabularyException duplicateVocabularyException) {

		return new Problem(
			Response.Status.CONFLICT,
			StringUtil.replace(
				duplicateVocabularyException.getMessage(),
				"category vocabulary", "taxonomy vocabulary"));
	}

}