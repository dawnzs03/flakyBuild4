/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.opener.onedrive.web.internal.portlet.action;

import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.document.library.opener.onedrive.web.internal.oauth.OAuth2Controller;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import org.osgi.service.component.annotations.Component;

/**
 * @author Cristina González
 */
@Component(
	property = {
		"auth.token.ignore.mvc.action=true",
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY,
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY_ADMIN,
		"mvc.command.name=/document_library/create_in_one_drive_and_redirect"
	},
	service = MVCActionCommand.class
)
public class CreateInOneDriveAndRedirectMVCActionCommand
	extends CreateInOneDriveMVCActionCommand {

	@Override
	protected OAuth2Controller getOAuth2Controller() {
		return oAuth2ControllerFactory.getRedirectingOAuth2Controller();
	}

}