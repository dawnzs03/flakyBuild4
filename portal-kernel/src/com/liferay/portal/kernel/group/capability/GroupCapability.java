/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.group.capability;

import com.liferay.portal.kernel.model.Portlet;

/**
 * @author Alejandro Tardín
 */
public interface GroupCapability {

	public boolean isSupportPortlet(Portlet portlet);

	public boolean isSupportsPages();

}