/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.portlet;

import java.io.Closeable;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Raymond Augé
 */
@ProviderType
public interface FriendlyURLMapperTracker extends Closeable {

	@Override
	public void close();

	public FriendlyURLMapper getFriendlyURLMapper();

	public void register(FriendlyURLMapper friendlyURLMapper);

	public void unregister(FriendlyURLMapper friendlyURLMapper);

}