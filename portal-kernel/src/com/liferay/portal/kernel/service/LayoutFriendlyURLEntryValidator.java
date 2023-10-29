/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.service;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Noor Najjar
 * @author Roberto Díaz
 */
public interface LayoutFriendlyURLEntryValidator {

	public void validateFriendlyURLEntry(
			long groupId, boolean privateLayout, long classPK, String urlTitle)
		throws PortalException;

}