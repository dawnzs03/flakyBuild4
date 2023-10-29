/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.portlet.route;

import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Sergio González
 */
@Component(
	property = {
		"com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/document-library-routes.xml",
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY
	},
	service = FriendlyURLMapper.class
)
public class DLFriendlyURLMapper extends DefaultFriendlyURLMapper {

	@Override
	public String getMapping() {
		return _MAPPING;
	}

	private static final String _MAPPING = "document_library";

}