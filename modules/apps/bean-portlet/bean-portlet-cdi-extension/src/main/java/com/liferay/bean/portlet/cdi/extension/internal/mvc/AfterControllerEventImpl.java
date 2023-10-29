/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.cdi.extension.internal.mvc;

import javax.mvc.event.AfterControllerEvent;

import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.UriInfo;

/**
 * @author Neil Griffin
 */
public class AfterControllerEventImpl
	extends BaseControllerEventImpl implements AfterControllerEvent {

	public AfterControllerEventImpl(
		ResourceInfo resourceInfo, UriInfo uriInfo) {

		super(resourceInfo, uriInfo);
	}

}