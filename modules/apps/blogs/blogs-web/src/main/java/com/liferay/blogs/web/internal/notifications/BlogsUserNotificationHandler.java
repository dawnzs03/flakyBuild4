/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.blogs.web.internal.notifications;

import com.liferay.blogs.constants.BlogsPortletKeys;
import com.liferay.portal.kernel.notifications.BaseModelUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;

import org.osgi.service.component.annotations.Component;

/**
 * @author Sergio González
 */
@Component(
	property = "javax.portlet.name=" + BlogsPortletKeys.BLOGS,
	service = UserNotificationHandler.class
)
public class BlogsUserNotificationHandler
	extends BaseModelUserNotificationHandler {

	public BlogsUserNotificationHandler() {
		setPortletId(BlogsPortletKeys.BLOGS);
	}

}