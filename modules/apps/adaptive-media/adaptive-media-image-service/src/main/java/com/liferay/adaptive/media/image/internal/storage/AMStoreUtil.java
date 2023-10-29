/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.adaptive.media.image.internal.storage;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.repository.model.FileVersion;

/**
 * @author Roberto Díaz
 */
public class AMStoreUtil {

	public static String getFileVersionPath(
		FileVersion fileVersion, String configurationUuid) {

		return StringBundler.concat(
			"adaptive/", configurationUuid, "/", fileVersion.getGroupId(), "/",
			fileVersion.getRepositoryId(), "/", fileVersion.getFileEntryId(),
			"/", fileVersion.getFileVersionId(), "/");
	}

}