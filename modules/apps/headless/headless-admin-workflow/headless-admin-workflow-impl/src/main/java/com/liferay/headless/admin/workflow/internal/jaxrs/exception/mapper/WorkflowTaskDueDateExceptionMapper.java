/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.workflow.internal.jaxrs.exception.mapper;

import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.workflow.WorkflowTaskDueDateException;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Inácio Nery
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Admin.Workflow)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Admin.Workflow.WorkflowTaskDueDateExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class WorkflowTaskDueDateExceptionMapper
	extends BaseExceptionMapper<WorkflowTaskDueDateException> {

	@Override
	protected Problem getProblem(
		WorkflowTaskDueDateException workflowTaskDueDateException) {

		return new Problem(
			Response.Status.BAD_REQUEST,
			_language.get(
				ResourceBundleUtil.getModuleAndPortalResourceBundle(
					_acceptLanguage.getPreferredLocale(),
					WorkflowTaskDueDateExceptionMapper.class),
				"please-enter-a-valid-due-date"));
	}

	@Context
	private AcceptLanguage _acceptLanguage;

	@Reference
	private Language _language;

}