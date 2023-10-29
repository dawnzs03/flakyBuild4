/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.notification.web.internal.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.notification.constants.NotificationPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Paulo Albuquerque
 */
@Component(
	property = {
		"panel.app.order:Integer=200",
		"panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL_NOTIFICATIONS
	},
	service = PanelApp.class
)
public class NotificationQueueEntriesPanelApp extends BasePanelApp {

	@Override
	public Portlet getPortlet() {
		return _portlet;
	}

	@Override
	public String getPortletId() {
		return NotificationPortletKeys.NOTIFICATION_QUEUE_ENTRIES;
	}

	@Override
	public boolean isShow(PermissionChecker permissionChecker, Group group)
		throws PortalException {

		return super.isShow(permissionChecker, group);
	}

	@Reference(
		target = "(javax.portlet.name=" + NotificationPortletKeys.NOTIFICATION_QUEUE_ENTRIES + ")"
	)
	private Portlet _portlet;

}