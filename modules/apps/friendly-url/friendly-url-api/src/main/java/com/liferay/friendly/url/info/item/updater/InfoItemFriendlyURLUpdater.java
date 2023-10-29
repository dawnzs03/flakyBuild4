/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.friendly.url.info.item.updater;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Adolfo Pérez
 */
public interface InfoItemFriendlyURLUpdater<T> {

	public void restoreFriendlyURL(
			long userId, long classPK, long friendlyURLEntryId,
			String languageId)
		throws PortalException;

}