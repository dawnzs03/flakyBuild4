/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.notifications;

import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;

import org.osgi.service.component.annotations.Component;

/**
 * @author Alicia García
 */
@Component(
	property = "javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY,
	service = UserNotificationDefinition.class
)
public class DLReviewEntryUserNotificationDefinition
	extends UserNotificationDefinition {

	public DLReviewEntryUserNotificationDefinition() {
		super(
			DLPortletKeys.DOCUMENT_LIBRARY, 0,
			UserNotificationDefinition.NOTIFICATION_TYPE_REVIEW_ENTRY,
			"receive-a-notification-when-review-is-needed-on-document-in-a-" +
				"folder-you-are-subscribed-to");

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