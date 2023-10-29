/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.internal.jaxrs.exception.mapper;

import com.liferay.commerce.product.exception.CPInstanceUnitOfMeasureIncrementalOrderQuantityException;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author Stefano Motta
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Catalog)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Catalog.SkuUnitOfMeasureIncrementalOrderQuantityExceptionMapper"
	},
	service = ExceptionMapper.class
)
@Provider
public class SkuUnitOfMeasureIncrementalOrderQuantityExceptionMapper
	extends BaseExceptionMapper
		<CPInstanceUnitOfMeasureIncrementalOrderQuantityException> {

	@Override
	protected Problem getProblem(
		CPInstanceUnitOfMeasureIncrementalOrderQuantityException
			cpInstanceUnitOfMeasureIncrementalOrderQuantityException) {

		return new Problem(
			Response.Status.BAD_REQUEST,
			"Sku unit of measure incremental order quantity is invalid");
	}

}