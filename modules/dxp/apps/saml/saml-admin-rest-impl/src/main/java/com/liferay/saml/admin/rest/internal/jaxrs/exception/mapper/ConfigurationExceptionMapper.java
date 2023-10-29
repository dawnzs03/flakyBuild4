/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.admin.rest.internal.jaxrs.exception.mapper;

import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Stian Sigvartsen
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Saml.Admin.REST)",
		"osgi.jaxrs.extension=true"
	},
	service = ExceptionMapper.class
)
public class ConfigurationExceptionMapper
	extends BaseExceptionMapper<ConfigurationException> {

	@Override
	protected Problem getProblem(
		ConfigurationException configurationException) {

		return new Problem(configurationException);
	}

}