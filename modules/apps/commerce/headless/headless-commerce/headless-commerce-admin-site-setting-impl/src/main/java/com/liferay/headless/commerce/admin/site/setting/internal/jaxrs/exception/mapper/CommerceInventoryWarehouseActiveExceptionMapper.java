/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.site.setting.internal.jaxrs.exception.mapper;

import com.liferay.commerce.inventory.exception.CommerceInventoryWarehouseActiveException;
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
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Site.Setting)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Commerce.Admin.Site.Setting.CommerceInventoryWarehouseActiveExceptionMapper"
	},
	service = ExceptionMapper.class
)
@Provider
public class CommerceInventoryWarehouseActiveExceptionMapper
	extends BaseExceptionMapper<CommerceInventoryWarehouseActiveException> {

	@Override
	public String getErrorDescription() {
		return "Cannot activate warehouse without latitude and longitude";
	}

	@Override
	public Response.Status getStatus() {
		return Response.Status.BAD_REQUEST;
	}

}