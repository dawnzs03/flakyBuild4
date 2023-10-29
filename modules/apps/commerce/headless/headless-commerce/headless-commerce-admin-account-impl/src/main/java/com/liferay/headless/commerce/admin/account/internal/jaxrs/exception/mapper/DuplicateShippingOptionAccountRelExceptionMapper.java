/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.account.internal.jaxrs.exception.mapper;

import com.liferay.commerce.exception.DuplicateCommerceShippingOptionAccountEntryRelException;
import com.liferay.headless.commerce.core.exception.mapper.BaseExceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author Danny Situ
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Account)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Account.DuplicateShippingOptionAccountRelExceptionMapper"
	},
	service = ExceptionMapper.class
)
@Provider
public class DuplicateShippingOptionAccountRelExceptionMapper
	extends BaseExceptionMapper
		<DuplicateCommerceShippingOptionAccountEntryRelException> {

	@Override
	public String getErrorDescription() {
		return "Duplicate shipping option account relationship";
	}

	@Override
	public Response.Status getStatus() {
		return Response.Status.CONFLICT;
	}

}