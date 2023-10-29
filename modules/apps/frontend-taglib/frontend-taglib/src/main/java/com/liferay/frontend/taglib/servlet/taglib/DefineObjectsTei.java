/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.taglib.servlet.taglib;

import java.util.ResourceBundle;

import javax.portlet.PortletURL;
import javax.portlet.WindowState;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

/**
 * @author Adolfo Pérez
 */
public class DefineObjectsTei extends TagExtraInfo {

	@Override
	public VariableInfo[] getVariableInfo(TagData data) {
		return Concealer._variableInfo;
	}

	private static class Concealer {

		private static final VariableInfo[] _variableInfo = {
			new VariableInfo(
				"currentURL", String.class.getName(), true,
				VariableInfo.AT_END),
			new VariableInfo(
				"currentURLObj", PortletURL.class.getName(), true,
				VariableInfo.AT_END),
			new VariableInfo(
				"npmResolvedPackageName", String.class.getName(), true,
				VariableInfo.AT_END),
			new VariableInfo(
				"resourceBundle", ResourceBundle.class.getName(), true,
				VariableInfo.AT_END),
			new VariableInfo(
				"windowState", WindowState.class.getName(), true,
				VariableInfo.AT_END)
		};

	}

}