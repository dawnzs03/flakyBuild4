/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.client.extension.type;

import com.liferay.client.extension.type.annotation.CETProperty;
import com.liferay.client.extension.type.annotation.CETType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Iván Zaera Avellón
 */
@CETType(description = "This is a description.", name = "themeSpritemap")
@ProviderType
public interface ThemeSpritemapCET extends CET {

	@CETProperty(defaultValue = "", name = "url", type = CETProperty.Type.URL)
	public String getURL();

	@CETProperty(
		defaultValue = "false", name = "enableSVG4Everybody",
		type = CETProperty.Type.Boolean
	)
	public boolean isEnableSVG4Everybody();

}