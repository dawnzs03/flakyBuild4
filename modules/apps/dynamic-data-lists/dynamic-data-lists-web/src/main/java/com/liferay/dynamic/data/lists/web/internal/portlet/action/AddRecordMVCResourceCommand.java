/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.lists.web.internal.portlet.action;

import com.liferay.dynamic.data.lists.constants.DDLPortletKeys;
import com.liferay.dynamic.data.lists.model.DDLRecordSet;
import com.liferay.dynamic.data.lists.service.DDLRecordService;
import com.liferay.dynamic.data.lists.service.DDLRecordSetService;
import com.liferay.dynamic.data.mapping.io.DDMFormValuesDeserializer;
import com.liferay.dynamic.data.mapping.io.DDMFormValuesDeserializerDeserializeRequest;
import com.liferay.dynamic.data.mapping.io.DDMFormValuesDeserializerDeserializeResponse;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Michael Bowerman
 */
@Component(
	property = {
		"javax.portlet.name=" + DDLPortletKeys.DYNAMIC_DATA_LISTS,
		"javax.portlet.name=" + DDLPortletKeys.DYNAMIC_DATA_LISTS_DISPLAY,
		"mvc.command.name=/dynamic_data_lists/add_record"
	},
	service = MVCResourceCommand.class
)
public class AddRecordMVCResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		_ddlRecordService.addRecord(
			ParamUtil.getLong(resourceRequest, "groupId"),
			ParamUtil.getLong(resourceRequest, "recordSetId"),
			ParamUtil.getInteger(resourceRequest, "displayIndex"),
			_getDDMFormValues(
				ParamUtil.getString(resourceRequest, "ddmFormValues"),
				ParamUtil.getLong(resourceRequest, "recordSetId")),
			_getServiceContext(resourceRequest));
	}

	private DDMFormValues _getDDMFormValues(
			String ddmFormValuesJSON, long recordSetId)
		throws Exception {

		DDLRecordSet ddlRecordSet = _ddlRecordSetService.getRecordSet(
			recordSetId);

		DDMStructure ddmStructure = ddlRecordSet.getDDMStructure();

		DDMFormValuesDeserializerDeserializeResponse
			ddmFormValuesDeserializerDeserializeResponse =
				_jsonDDMFormValuesDeserializer.deserialize(
					DDMFormValuesDeserializerDeserializeRequest.Builder.
						newBuilder(
							ddmFormValuesJSON,
							ddmStructure.getFullHierarchyDDMForm()
						).build());

		return ddmFormValuesDeserializerDeserializeResponse.getDDMFormValues();
	}

	private ServiceContext _getServiceContext(ResourceRequest resourceRequest)
		throws Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			resourceRequest);

		serviceContext.setAttribute(
			"workflowAction", WorkflowConstants.ACTION_PUBLISH);

		return serviceContext;
	}

	@Reference
	private DDLRecordService _ddlRecordService;

	@Reference
	private DDLRecordSetService _ddlRecordSetService;

	@Reference(target = "(ddm.form.values.deserializer.type=json)")
	private DDMFormValuesDeserializer _jsonDDMFormValuesDeserializer;

}