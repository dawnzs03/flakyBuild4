/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.monitoring.web.internal.portlet.action;

import com.liferay.monitoring.web.internal.constants.MonitoringPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Philip Jones
 */
@Component(
	property = {
		"javax.portlet.name=" + MonitoringPortletKeys.MONITORING,
		"mvc.command.name=/monitoring/edit_session"
	},
	service = MVCRenderCommand.class
)
public class EditSessionMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		return "/edit_session.jsp";
	}

}