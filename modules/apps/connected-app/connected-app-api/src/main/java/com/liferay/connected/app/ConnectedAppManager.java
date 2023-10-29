/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.connected.app;

import com.liferay.portal.kernel.model.User;

import java.util.List;

/**
 * @author Alejandro Tardín
 */
public interface ConnectedAppManager {

	public ConnectedApp getConnectedApp(User user, String key);

	public List<ConnectedApp> getConnectedApps(User user);

}