/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.notification.service.impl;

import com.liferay.notification.model.NotificationRecipient;
import com.liferay.notification.service.base.NotificationRecipientLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Feliphe Marinho
 */
@Component(
	property = "model.class.name=com.liferay.notification.model.NotificationRecipient",
	service = AopService.class
)
public class NotificationRecipientLocalServiceImpl
	extends NotificationRecipientLocalServiceBaseImpl {

	public NotificationRecipient getNotificationRecipientByClassPK(
		long classPK) {

		return notificationRecipientPersistence.fetchByClassPK(classPK);
	}

}