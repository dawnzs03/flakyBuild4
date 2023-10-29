/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bookmarks.configuration;

import com.liferay.bookmarks.configuration.definition.BookmarksGroupServiceConfigurationOverrideImpl;
import com.liferay.portal.kernel.settings.Settings;

/**
 * @author Iván Zaera
 */
@Settings.OverrideClass(BookmarksGroupServiceConfigurationOverrideImpl.class)
public interface BookmarksGroupServiceOverriddenConfiguration
	extends BookmarksGroupServiceConfiguration,
			BookmarksGroupServiceConfigurationOverride {
}