/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.service.impl;

import com.liferay.portal.kernel.model.UserTrackerPath;
import com.liferay.portal.service.base.UserTrackerPathLocalServiceBaseImpl;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class UserTrackerPathLocalServiceImpl
	extends UserTrackerPathLocalServiceBaseImpl {

	@Override
	public List<UserTrackerPath> getUserTrackerPaths(
		long userTrackerId, int start, int end) {

		return userTrackerPathPersistence.findByUserTrackerId(
			userTrackerId, start, end);
	}

}