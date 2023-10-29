/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.data.set.sample.web.internal.display.context;

import com.liferay.frontend.data.set.sample.web.internal.constants.FDSSampleFDSNames;
import com.liferay.frontend.data.set.sample.web.internal.model.UserEntry;
import com.liferay.frontend.data.set.sample.web.internal.view.util.FDSViewSerializerUtil;
import com.liferay.frontend.data.set.view.FDSViewSerializer;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Marko Cikos
 */
public class ControlledFDSDisplayContext {

	public ControlledFDSDisplayContext(HttpServletRequest httpServletRequest) {
		_httpServletRequest = httpServletRequest;
	}

	public Object getItems() {
		ThemeDisplay themeDisplay =
			(ThemeDisplay)_httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		return TransformUtil.transform(
			UserLocalServiceUtil.getUsers(
				themeDisplay.getCompanyId(), WorkflowConstants.STATUS_APPROVED,
				0, 20, null),
			user -> new UserEntry(
				user.getEmailAddress(), user.getFirstName(), user.getUserId(),
				user.getLastName()));
	}

	public Object getViews() {
		FDSViewSerializer fdsViewSerializer =
			FDSViewSerializerUtil.getFDSViewSerializer();

		return fdsViewSerializer.serialize(
			FDSSampleFDSNames.CONTROLLED,
			PortalUtil.getLocale(_httpServletRequest));
	}

	private final HttpServletRequest _httpServletRequest;

}