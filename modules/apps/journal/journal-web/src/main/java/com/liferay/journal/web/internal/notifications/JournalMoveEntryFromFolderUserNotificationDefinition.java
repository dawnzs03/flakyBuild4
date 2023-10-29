/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.journal.web.internal.notifications;

import com.liferay.journal.constants.JournalArticleConstants;
import com.liferay.journal.constants.JournalPortletKeys;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;

import org.osgi.service.component.annotations.Component;

/**
 * @author Pavel Savinov
 */
@Component(
	property = "javax.portlet.name=" + JournalPortletKeys.JOURNAL,
	service = UserNotificationDefinition.class
)
public class JournalMoveEntryFromFolderUserNotificationDefinition
	extends BaseJournalUserNotificationDefinition {

	public JournalMoveEntryFromFolderUserNotificationDefinition() {
		super(
			JournalArticleConstants.NOTIFICATION_TYPE_MOVE_ENTRY_FROM_FOLDER,
			"receive-a-notification-when-someone-moves-from-folder-web-" +
				"content-you-are-subscribed-to");

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