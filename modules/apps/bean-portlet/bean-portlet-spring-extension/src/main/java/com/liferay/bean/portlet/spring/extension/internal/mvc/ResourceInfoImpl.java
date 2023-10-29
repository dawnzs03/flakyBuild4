/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.spring.extension.internal.mvc;

import java.lang.reflect.Method;

import javax.ws.rs.container.ResourceInfo;

/**
 * @author Neil Griffin
 */
public class ResourceInfoImpl implements ResourceInfo {

	public ResourceInfoImpl(Class<?> resourceClass, Method resourceMethod) {
		_resourceClass = resourceClass;
		_resourceMethod = resourceMethod;
	}

	@Override
	public Class<?> getResourceClass() {
		return _resourceClass;
	}

	@Override
	public Method getResourceMethod() {
		return _resourceMethod;
	}

	private final Class<?> _resourceClass;
	private final Method _resourceMethod;

}