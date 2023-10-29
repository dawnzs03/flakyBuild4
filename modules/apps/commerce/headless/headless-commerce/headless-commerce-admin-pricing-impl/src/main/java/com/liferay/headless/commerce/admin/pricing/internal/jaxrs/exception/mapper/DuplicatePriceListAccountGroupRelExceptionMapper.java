/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.pricing.internal.jaxrs.exception.mapper;

import com.liferay.commerce.price.list.exception.DuplicateCommercePriceListCommerceAccountGroupRelException;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian I. Kim
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Pricing)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Pricing.DuplicatePriceListAccountGroupRelExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicatePriceListAccountGroupRelExceptionMapper
	extends BaseExceptionMapper
		<DuplicateCommercePriceListCommerceAccountGroupRelException> {

	@Override
	protected Problem getProblem(
		DuplicateCommercePriceListCommerceAccountGroupRelException
			duplicateCommercePriceListCommerceAccountGroupRelException) {

		return new Problem(
			Response.Status.CONFLICT,
			"The account group relation already exists.");
	}

}