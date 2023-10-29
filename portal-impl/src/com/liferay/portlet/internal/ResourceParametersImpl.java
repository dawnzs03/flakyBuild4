/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portlet.internal;

import java.util.Map;

import javax.portlet.MutableResourceParameters;
import javax.portlet.ResourceParameters;

/**
 * @author Neil Griffin
 */
public class ResourceParametersImpl
	extends BasePortletParametersImpl<MutableResourceParameters>
	implements ResourceParameters {

	public ResourceParametersImpl(
		Map<String, String[]> parameterMap, String namespace) {

		super(parameterMap, namespace, MutableResourceParametersImpl::new);
	}

}