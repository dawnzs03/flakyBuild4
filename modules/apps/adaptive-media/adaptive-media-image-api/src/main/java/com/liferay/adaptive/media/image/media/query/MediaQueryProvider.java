/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.adaptive.media.image.media.query;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;

import java.util.List;

/**
 * @author Alejandro Tardín
 */
public interface MediaQueryProvider {

	public List<MediaQuery> getMediaQueries(FileEntry fileEntry)
		throws PortalException;

}