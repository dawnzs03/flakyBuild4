/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.delivery.cart.internal.jaxrs.exception.mapper;

import com.liferay.headless.commerce.core.exception.mapper.BaseOrderValidatorExceptionMapper;

import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian I. Kim
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Delivery.Cart)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Delivery.Cart.OrderValidatorExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class OrderValidatorExceptionMapper
	extends BaseOrderValidatorExceptionMapper {
}