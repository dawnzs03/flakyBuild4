/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.taglib.soy.servlet.taglib;

/**
 * @author Chema Balsas
 * @deprecated As of Cavanaugh (7.4.x), with no direct replacement
 */
@Deprecated
public class ComponentRendererTag extends TemplateRendererTag {

	@Override
	public int doStartTag() {
		setHydrate(true);

		return super.doStartTag();
	}

}