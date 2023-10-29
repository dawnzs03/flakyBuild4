/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.announcements.web.internal.display.context;

import com.liferay.portal.kernel.display.context.DisplayContext;

import java.util.Map;

/**
 * @author Roberto Díaz
 */
public interface AnnouncementsAdminViewDisplayContext extends DisplayContext {

	public String getCurrentDistributionScopeLabel() throws Exception;

	public Map<String, String> getDistributionScopes() throws Exception;

}