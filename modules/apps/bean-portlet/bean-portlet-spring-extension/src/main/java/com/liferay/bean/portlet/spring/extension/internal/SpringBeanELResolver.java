/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.spring.extension.internal;

import java.beans.FeatureDescriptor;

import java.util.Iterator;

import javax.el.ELContext;
import javax.el.ELResolver;

import javax.portlet.PortletRequest;

import org.springframework.beans.factory.BeanFactory;

/**
 * @author Neil Griffin
 */
public class SpringBeanELResolver extends ELResolver {

	public SpringBeanELResolver(BeanFactory beanFactory) {
		_beanFactory = beanFactory;
	}

	@Override
	public Class<?> getCommonPropertyType(ELContext elContext, Object base) {
		return null;
	}

	@Override
	public Iterator<FeatureDescriptor> getFeatureDescriptors(
		ELContext elContext, Object base) {

		return null;
	}

	@Override
	public Class<?> getType(ELContext elContext, Object base, Object property) {
		return null;
	}

	@Override
	public Object getValue(ELContext elContext, Object base, Object property) {
		if ((base == null) && (property != null)) {
			String beanName = property.toString();

			if (_beanFactory.containsBean(beanName)) {
				PortletRequest portletRequest = _beanFactory.getBean(
					"portletRequest", PortletRequest.class);

				Object bean = portletRequest.getAttribute(beanName);

				if (bean == null) {
					bean = _beanFactory.getBean(beanName);
				}

				if (bean != null) {
					elContext.setPropertyResolved(true);

					return bean;
				}
			}
		}

		return null;
	}

	@Override
	public boolean isReadOnly(
		ELContext elContext, Object base, Object property) {

		return false;
	}

	@Override
	public void setValue(
		ELContext elContext, Object base, Object property, Object value) {
	}

	private final BeanFactory _beanFactory;

}