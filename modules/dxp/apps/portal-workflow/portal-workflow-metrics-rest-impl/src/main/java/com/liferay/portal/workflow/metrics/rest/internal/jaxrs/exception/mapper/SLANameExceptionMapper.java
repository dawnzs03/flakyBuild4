/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.metrics.rest.internal.jaxrs.exception.mapper;

import com.liferay.portal.workflow.metrics.exception.WorkflowMetricsSLADefinitionNameException;
import com.liferay.portal.workflow.metrics.rest.dto.v1_0.GenericError;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Rafael Praxedes
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Portal.Workflow.Metrics.REST)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Portal.Workflow.Metrics.REST.SLANameExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class SLANameExceptionMapper
	extends BaseSLAExceptionMapper<WorkflowMetricsSLADefinitionNameException> {

	@Override
	public List<GenericError> toGenericErrors(
		WorkflowMetricsSLADefinitionNameException
			workflowMetricsSLADefinitionNameException) {

		return Collections.singletonList(
			new GenericError() {
				{
					fieldName = "name";
					message = SLANameExceptionMapper.this.getMessage(
						"a-name-is-required");
				}
			});
	}

}