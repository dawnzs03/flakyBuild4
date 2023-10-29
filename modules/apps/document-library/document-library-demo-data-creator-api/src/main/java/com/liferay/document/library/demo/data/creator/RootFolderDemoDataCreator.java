/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.demo.data.creator;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.Folder;

/**
 * @author Alejandro Hernández
 */
public interface RootFolderDemoDataCreator extends BaseFolderDemoDataCreator {

	public Folder create(long userId, long groupId) throws PortalException;

	public Folder create(long userId, long groupId, String name)
		throws PortalException;

}