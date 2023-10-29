/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.knowledge.base.web.internal.notifications;

import com.liferay.knowledge.base.constants.KBPortletKeys;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;

import org.osgi.service.component.annotations.Component;

/**
 * @author Marco Galluzzi
 */
@Component(
	property = "javax.portlet.name=" + KBPortletKeys.KNOWLEDGE_BASE_ADMIN,
	service = UserNotificationDefinition.class
)
public class KBExpireEntryUserNotificationDefinition
	extends UserNotificationDefinition {

	public KBExpireEntryUserNotificationDefinition() {
		super(
			KBPortletKeys.KNOWLEDGE_BASE_ADMIN, 0,
			UserNotificationDefinition.NOTIFICATION_TYPE_EXPIRED_ENTRY,
			"receive-a-notification-when-a-knowledge-base-article-you-are-" +
				"subscribed-to-has-expired");

		addUserNotificationDeliveryType(
			new UserNotificationDeliveryType(
				"email", UserNotificationDeliveryConstants.TYPE_EMAIL, true,
				true));
		addUserNotificationDeliveryType(
			new UserNotificationDeliveryType(
				"website", UserNotificationDeliveryConstants.TYPE_WEBSITE, true,
				true));
	}

}