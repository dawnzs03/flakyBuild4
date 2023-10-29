/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.jaxrs.container.response.filter;

import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.vulcan.extension.EntityExtensionHandler;
import com.liferay.portal.vulcan.extension.EntityExtensionThreadLocal;

import java.io.IOException;
import java.io.Serializable;

import java.util.Map;

import javax.annotation.Priority;

import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;

/**
 * @author Carlos Correa
 */
@Priority(Priorities.USER + 10)
@Provider
public class EntityExtensionContainerResponseFilter
	implements ContainerResponseFilter {

	@Override
	public void filter(
			ContainerRequestContext containerRequestContext,
			ContainerResponseContext containerResponseContext)
		throws IOException {

		Map<String, Serializable> extendedProperties =
			EntityExtensionThreadLocal.getExtendedProperties();

		if (extendedProperties == null) {
			return;
		}

		MediaType mediaType = containerResponseContext.getMediaType();

		if (mediaType == null) {
			mediaType = MediaType.WILDCARD_TYPE;
		}

		ContextResolver<EntityExtensionHandler> contextResolver =
			_providers.getContextResolver(
				EntityExtensionHandler.class, mediaType);

		if (contextResolver == null) {
			return;
		}

		EntityExtensionHandler entityExtensionHandler =
			_getEntityExtensionHandler(
				containerResponseContext.getEntityClass(), contextResolver,
				mediaType);

		if (entityExtensionHandler == null) {
			return;
		}

		try {
			entityExtensionHandler.setExtendedProperties(
				_company.getCompanyId(), _user.getUserId(),
				containerResponseContext.getEntity(), extendedProperties);
		}
		catch (Exception exception) {
			throw new IOException(exception);
		}
		finally {
			EntityExtensionThreadLocal.clearExtendedProperties();
		}
	}

	private EntityExtensionHandler _getEntityExtensionHandler(
		Class<?> clazz, ContextResolver<EntityExtensionHandler> contextResolver,
		MediaType mediaType) {

		if (clazz == null) {
			return null;
		}

		EntityExtensionHandler entityExtensionHandler =
			contextResolver.getContext(clazz);

		if (entityExtensionHandler == null) {
			entityExtensionHandler = _getEntityExtensionHandler(
				clazz.getSuperclass(), contextResolver, mediaType);
		}

		return entityExtensionHandler;
	}

	@Context
	private Company _company;

	@Context
	private Providers _providers;

	@Context
	private User _user;

}