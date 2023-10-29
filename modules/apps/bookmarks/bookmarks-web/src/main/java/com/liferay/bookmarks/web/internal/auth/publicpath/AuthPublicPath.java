/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bookmarks.web.internal.auth.publicpath;

import org.osgi.service.component.annotations.Component;

/**
 * @author Sergio González
 */
@Component(
	property = {
		"auth.public.path=/bookmarks/find_entry",
		"auth.public.path=/bookmarks/find_folder",
		"auth.public.path=/bookmarks/open_entry"
	},
	service = Object.class
)
public class AuthPublicPath {
}