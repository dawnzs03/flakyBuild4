/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.notification.test.util;

import com.liferay.commerce.notification.model.CommerceNotificationTemplate;
import com.liferay.commerce.notification.service.CommerceNotificationTemplateLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.util.RandomTestUtil;

/**
 * @author Luca Pellizzon
 */
public class CommerceNotificationTestUtil {

	public static CommerceNotificationTemplate addCommerceNotificationTemplate(
			String name, String description, String from, String to,
			String type, ServiceContext serviceContext)
		throws PortalException {

		return CommerceNotificationTemplateLocalServiceUtil.
			addCommerceNotificationTemplate(
				name, description, from, RandomTestUtil.randomLocaleStringMap(),
				to, null, null, type, true,
				RandomTestUtil.randomLocaleStringMap(),
				RandomTestUtil.randomLocaleStringMap(), serviceContext);
	}

	public static CommerceNotificationTemplate addNotificationTemplate(
			String to, String notificationType, ServiceContext serviceContext)
		throws PortalException {

		return addCommerceNotificationTemplate(
			RandomTestUtil.randomString(), RandomTestUtil.randomString(),
			RandomTestUtil.randomString(), to, notificationType,
			serviceContext);
	}

}