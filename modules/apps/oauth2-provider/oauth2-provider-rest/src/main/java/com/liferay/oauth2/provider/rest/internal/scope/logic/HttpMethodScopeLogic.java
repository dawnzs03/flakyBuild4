/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.rest.internal.scope.logic;

import com.liferay.oauth2.provider.rest.internal.scope.util.HttpMethodScopeLogicUtil;
import com.liferay.oauth2.provider.scope.ScopeChecker;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import java.util.Map;
import java.util.function.Function;

import javax.ws.rs.HttpMethod;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Correa
 * @author Stian Sigvartsen
 */
@Component(
	property = "oauth2.scope.checker.type=http.method",
	service = ScopeLogic.class
)
public class HttpMethodScopeLogic implements ScopeLogic {

	@Override
	public boolean check(
		Function<String, Object> propertyAccessorFunction,
		Class<?> resourceClass, Method resourceMethod,
		ScopeChecker scopeChecker) {

		return HttpMethodScopeLogicUtil.check(
			_bundleContext, propertyAccessorFunction, scopeChecker,
			_getHttpMethod(resourceMethod));
	}

	@Activate
	protected void activate(
		BundleContext bundleContext, Map<String, Object> properties) {

		_bundleContext = bundleContext;
	}

	private String _getHttpMethod(Method method) {
		while (method != null) {
			for (Annotation annotation : method.getAnnotations()) {
				Class<? extends Annotation> annotationType =
					annotation.annotationType();

				HttpMethod[] annotationsByType =
					annotationType.getAnnotationsByType(HttpMethod.class);

				if (annotationsByType != null) {
					for (HttpMethod httpMethod : annotationsByType) {
						return httpMethod.value();
					}
				}
			}

			method = _getSuperMethod(method);
		}

		throw new UnsupportedOperationException();
	}

	private Method _getSuperMethod(Method method) {
		Class<?> clazz = method.getDeclaringClass();

		clazz = clazz.getSuperclass();

		if (clazz == Object.class) {
			return null;
		}

		try {
			return clazz.getDeclaredMethod(
				method.getName(), method.getParameterTypes());
		}
		catch (NoSuchMethodException noSuchMethodException) {
			if (_log.isDebugEnabled()) {
				_log.debug(noSuchMethodException);
			}

			return null;
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		HttpMethodScopeLogic.class);

	private BundleContext _bundleContext;

}