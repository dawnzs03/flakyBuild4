/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.server.admin.web.internal.portlet;

import com.liferay.portal.kernel.portlet.ControlPanelEntry;
import com.liferay.portal.kernel.portlet.OmniadminControlPanelEntry;
import com.liferay.portal.kernel.util.PortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Alan Huang
 */
@Component(
	property = "javax.portlet.name=" + PortletKeys.SERVER_ADMIN,
	service = ControlPanelEntry.class
)
public class ServerAdminControlPanelEntry extends OmniadminControlPanelEntry {
}