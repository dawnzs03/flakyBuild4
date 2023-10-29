/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.comment.display.context;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Adolfo Pérez
 */
public interface CommentSectionDisplayContext extends CommentDisplayContext {

	public boolean isControlsVisible() throws PortalException;

	public boolean isDiscussionVisible() throws PortalException;

	public boolean isMessageThreadVisible() throws PortalException;

}