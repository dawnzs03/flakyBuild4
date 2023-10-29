/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.channel.internal.jaxrs.exception.mapper;

import com.liferay.commerce.shipping.engine.fixed.exception.DuplicateCommerceShippingFixedOptionQualifierException;
import com.liferay.headless.commerce.core.exception.mapper.BaseExceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Channel)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Order.DuplicateShippingFixedOptionQualifierExceptionMapper"
	},
	service = ExceptionMapper.class
)
@Provider
public class DuplicateShippingFixedOptionQualifierExceptionMapper
	extends BaseExceptionMapper
		<DuplicateCommerceShippingFixedOptionQualifierException> {

	@Override
	public String getErrorDescription() {
		return "Duplicate shipping fixed option qualifier";
	}

	@Override
	public Response.Status getStatus() {
		return Response.Status.CONFLICT;
	}

	@Override
	protected String toJSON(
		DuplicateCommerceShippingFixedOptionQualifierException
			duplicateCommerceShippingFixedOptionQualifierException,
		int status) {

		return super.toJSON("the-qualifier-is-already-linked", status);
	}

}