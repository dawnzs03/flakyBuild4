/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.osb.testray.service.impl;

import com.liferay.osb.testray.service.base.CompareRunsServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author José Abelenda
 */
@Component(
	property = {
		"json.web.service.context.name=osb",
		"json.web.service.context.path=CompareRuns"
	},
	service = AopService.class
)
public class CompareRunsServiceImpl extends CompareRunsServiceBaseImpl {
}