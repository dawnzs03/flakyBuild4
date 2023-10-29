/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.journal.util;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

/**
 * @author Tom Wang
 */
public interface ExportArticleHelper {

	public void sendFile(
			String targetExtension, PortletRequest portletRequest,
			PortletResponse portletResponse)
		throws IOException;

}