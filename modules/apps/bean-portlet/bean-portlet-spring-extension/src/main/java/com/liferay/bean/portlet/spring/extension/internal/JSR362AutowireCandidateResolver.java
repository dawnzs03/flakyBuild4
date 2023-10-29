/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.spring.extension.internal;

import java.lang.annotation.Annotation;

import javax.portlet.annotations.ContextPath;
import javax.portlet.annotations.Namespace;
import javax.portlet.annotations.PortletName;
import javax.portlet.annotations.WindowId;

import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;

/**
 * @author Neil Griffin
 */
public class JSR362AutowireCandidateResolver
	extends ContextAnnotationAutowireCandidateResolver {

	@Override
	protected boolean isQualifier(Class<? extends Annotation> annotationType) {
		boolean qualifier = super.isQualifier(annotationType);

		if (!qualifier &&
			(ContextPath.class.isAssignableFrom(annotationType) ||
			 Namespace.class.isAssignableFrom(annotationType) ||
			 PortletName.class.isAssignableFrom(annotationType) ||
			 WindowId.class.isAssignableFrom(annotationType))) {

			qualifier = true;
		}

		return qualifier;
	}

}