/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.workflow.kaleo.model.KaleoDefinitionVersion;
import com.liferay.portal.workflow.kaleo.service.KaleoDefinitionVersionLocalServiceUtil;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class KaleoDefinitionImpl extends KaleoDefinitionBaseImpl {

	@Override
	public List<KaleoDefinitionVersion> getKaleoDefinitionVersions()
		throws PortalException {

		return KaleoDefinitionVersionLocalServiceUtil.
			getKaleoDefinitionVersions(getCompanyId(), getName());
	}

}