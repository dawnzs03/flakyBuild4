/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.security.auth;

import java.util.Collection;

/**
 * @author Iván Zaera
 */
public interface AlwaysAllowDoAsUser {

	public Collection<String> getActionNames();

	public Collection<String> getMVCRenderCommandNames();

	public Collection<String> getPaths();

	public Collection<String> getStrutsActions();

}