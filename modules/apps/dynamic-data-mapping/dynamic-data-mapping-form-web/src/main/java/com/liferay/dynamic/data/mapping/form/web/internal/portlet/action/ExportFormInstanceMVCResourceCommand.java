/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.mapping.form.web.internal.portlet.action;

import com.liferay.dynamic.data.mapping.constants.DDMPortletKeys;
import com.liferay.dynamic.data.mapping.form.web.internal.configuration.DDMFormWebConfiguration;
import com.liferay.dynamic.data.mapping.form.web.internal.configuration.activator.DDMFormWebConfigurationActivator;
import com.liferay.dynamic.data.mapping.io.exporter.DDMFormInstanceRecordExporter;
import com.liferay.dynamic.data.mapping.io.exporter.DDMFormInstanceRecordExporterRequest;
import com.liferay.dynamic.data.mapping.io.exporter.DDMFormInstanceRecordExporterResponse;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceService;
import com.liferay.dynamic.data.mapping.util.comparator.DDMFormInstanceRecordIdComparator;
import com.liferay.dynamic.data.mapping.util.comparator.DDMFormInstanceRecordModifiedDateComparator;
import com.liferay.petra.string.CharPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.SearchOrderByUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marcellus Tavares
 */
@Component(
	property = {
		"javax.portlet.name=" + DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM_ADMIN,
		"mvc.command.name=/dynamic_data_mapping_form/export_form_instance"
	},
	service = MVCResourceCommand.class
)
public class ExportFormInstanceMVCResourceCommand
	extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		String fileExtension = ParamUtil.getString(
			resourceRequest, "fileExtension");

		DDMFormWebConfiguration ddmFormWebConfiguration =
			_ddmFormWebConfigurationActivator.getDDMFormWebConfiguration();

		if (StringUtil.equals(fileExtension, "csv") &&
			StringUtil.equals(
				ddmFormWebConfiguration.csvExport(), "disabled")) {

			return;
		}

		ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long formInstanceId = ParamUtil.getLong(
			resourceRequest, "formInstanceId");

		DDMFormInstanceRecordExporterRequest.Builder builder =
			DDMFormInstanceRecordExporterRequest.Builder.newBuilder(
				formInstanceId, fileExtension);

		DDMFormInstanceRecordExporterRequest
			ddmFormInstanceRecordExporterRequest = builder.withLocale(
				themeDisplay.getLocale()
			).withStatus(
				WorkflowConstants.STATUS_APPROVED
			).withOrderByComparator(
				_getOrderByComparator(resourceRequest)
			).build();

		byte[] content = null;

		try {
			DDMFormInstanceRecordExporterResponse
				ddmFormInstanceRecordExporterResponse =
					_ddmFormInstanceRecordExporter.export(
						ddmFormInstanceRecordExporterRequest);

			content = ddmFormInstanceRecordExporterResponse.getContent();
		}
		catch (Exception exception) {
			content = new byte[0];

			_log.error(exception);
		}

		DDMFormInstance formInstance = _ddmFormInstanceService.getFormInstance(
			formInstanceId);

		String fileName =
			formInstance.getName(themeDisplay.getLocale()) + CharPool.PERIOD +
				fileExtension;

		PortletResponseUtil.sendFile(
			resourceRequest, resourceResponse, fileName, content,
			MimeTypesUtil.getContentType(fileName));
	}

	private OrderByComparator<DDMFormInstanceRecord> _getOrderByComparator(
		ResourceRequest resourceRequest) {

		boolean orderByAsc = false;

		String orderByType = SearchOrderByUtil.getOrderByType(
			resourceRequest, DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM_ADMIN,
			"view-entries-order-by-type", "asc");

		if (orderByType.equals("asc")) {
			orderByAsc = true;
		}

		String orderByCol = SearchOrderByUtil.getOrderByCol(
			resourceRequest, DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM_ADMIN,
			"view-entries-order-by-col", "modified-date");

		if (orderByCol.equals("modified-date")) {
			return new DDMFormInstanceRecordModifiedDateComparator(orderByAsc);
		}

		return new DDMFormInstanceRecordIdComparator(orderByAsc);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ExportFormInstanceMVCResourceCommand.class);

	@Reference
	private DDMFormInstanceRecordExporter _ddmFormInstanceRecordExporter;

	@Reference
	private DDMFormInstanceService _ddmFormInstanceService;

	@Reference
	private DDMFormWebConfigurationActivator _ddmFormWebConfigurationActivator;

}