/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.redirect.tracker;

import com.liferay.portal.kernel.model.Group;

/**
 * @author Adolfo Pérez
 */
public interface RedirectNotFoundTracker {

	public void trackURL(Group group, String url);

}