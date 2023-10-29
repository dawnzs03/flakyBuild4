/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.notification.rest.internal.jaxrs.exception.mapper;

import com.liferay.notification.exception.NotificationQueueEntryTypeException;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Murilo Stodolni
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Notification.REST)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Notification.REST.NotificationQueueEntryTypeExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class NotificationQueueEntryTypeExceptionMapper
	extends BaseExceptionMapper<NotificationQueueEntryTypeException> {

	@Override
	protected Problem getProblem(
		NotificationQueueEntryTypeException
			notificationQueueEntryTypeException) {

		return new Problem(
			Response.Status.BAD_REQUEST,
			_language.get(
				_acceptLanguage.getPreferredLocale(),
				"type-can-only-be-email"));
	}

	@Context
	private AcceptLanguage _acceptLanguage;

	@Reference
	private Language _language;

}