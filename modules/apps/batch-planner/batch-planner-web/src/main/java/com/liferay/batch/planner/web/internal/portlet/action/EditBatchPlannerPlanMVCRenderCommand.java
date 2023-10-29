/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.planner.web.internal.portlet.action;

import com.liferay.batch.planner.constants.BatchPlannerPortletKeys;
import com.liferay.batch.planner.model.BatchPlannerPlan;
import com.liferay.batch.planner.service.BatchPlannerPlanService;
import com.liferay.batch.planner.web.internal.display.context.EditBatchPlannerPlanDisplayContext;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegate;
import com.liferay.portal.vulcan.batch.engine.VulcanBatchEngineTaskItemDelegateRegistry;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 */
@Component(
	property = {
		"javax.portlet.name=" + BatchPlannerPortletKeys.BATCH_PLANNER,
		"mvc.command.name=/batch_planner/edit_export_batch_planner_plan",
		"mvc.command.name=/batch_planner/edit_import_batch_planner_plan"
	},
	service = MVCRenderCommand.class
)
public class EditBatchPlannerPlanMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		try {
			return _render(renderRequest);
		}
		catch (PortalException portalException) {
			SessionErrors.add(renderRequest, PortalException.class);

			_log.error("Unable to process render request", portalException);
		}

		return "/view.jsp";
	}

	private Map<String, String> _getInternalClassNameKeyCategories(
		long companyId, boolean export) {

		Map<String, String> internalClassNameKeyCategories = new HashMap<>();

		for (String entityClassName :
				_vulcanBatchEngineTaskItemDelegateRegistry.getEntityClassNames(
					companyId)) {

			if (!_isBatchPlannerEnabled(companyId, entityClassName, export)) {
				continue;
			}

			VulcanBatchEngineTaskItemDelegate
				vulcanBatchEngineTaskItemDelegate =
					_vulcanBatchEngineTaskItemDelegateRegistry.
						getVulcanBatchEngineTaskItemDelegate(
							companyId, entityClassName);

			internalClassNameKeyCategories.put(
				entityClassName,
				_getInternalClassNameKeyCategory(
					FrameworkUtil.getBundle(
						vulcanBatchEngineTaskItemDelegate.getClass())));
		}

		return internalClassNameKeyCategories;
	}

	private String _getInternalClassNameKeyCategory(Bundle bundle) {
		Dictionary<String, String> headers = bundle.getHeaders(
			StringPool.BLANK);

		String bundleName = GetterUtil.getString(
			headers.get(Constants.BUNDLE_NAME));

		return bundleName.substring(
			0, bundleName.lastIndexOf(StringPool.SPACE));
	}

	private boolean _isBatchPlannerEnabled(
		long companyId, String entityClassName, boolean export) {

		if (export) {
			return _vulcanBatchEngineTaskItemDelegateRegistry.
				isBatchPlannerExportEnabled(companyId, entityClassName);
		}

		return _vulcanBatchEngineTaskItemDelegateRegistry.
			isBatchPlannerImportEnabled(companyId, entityClassName);
	}

	private boolean _isExport(String value) {
		if (value.equals("export")) {
			return true;
		}

		return false;
	}

	private String _render(RenderRequest renderRequest) throws PortalException {
		long companyId = _portal.getCompanyId(renderRequest);

		boolean export = _isExport(
			ParamUtil.getString(renderRequest, "navigation"));

		Map<String, String> internalClassNameKeyCategories =
			_getInternalClassNameKeyCategories(companyId, export);

		long batchPlannerPlanId = ParamUtil.getLong(
			renderRequest, "batchPlannerPlanId");

		if (batchPlannerPlanId == 0) {
			if (export) {
				renderRequest.setAttribute(
					WebKeys.PORTLET_DISPLAY_CONTEXT,
					new EditBatchPlannerPlanDisplayContext(
						_batchPlannerPlanService.getBatchPlannerPlans(
							companyId, true, true, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS, null),
						internalClassNameKeyCategories, renderRequest, null));

				return "/export/edit_batch_planner_plan.jsp";
			}

			renderRequest.setAttribute(
				WebKeys.PORTLET_DISPLAY_CONTEXT,
				new EditBatchPlannerPlanDisplayContext(
					_batchPlannerPlanService.getBatchPlannerPlans(
						_portal.getCompanyId(renderRequest), false, true,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS, null),
					internalClassNameKeyCategories, renderRequest, null));

			return "/import/edit_batch_planner_plan.jsp";
		}

		BatchPlannerPlan batchPlannerPlan =
			_batchPlannerPlanService.getBatchPlannerPlan(batchPlannerPlanId);

		if (batchPlannerPlan.isExport()) {
			renderRequest.setAttribute(
				WebKeys.PORTLET_DISPLAY_CONTEXT,
				new EditBatchPlannerPlanDisplayContext(
					_batchPlannerPlanService.getBatchPlannerPlans(
						_portal.getCompanyId(renderRequest), true, true,
						QueryUtil.ALL_POS, QueryUtil.ALL_POS, null),
					internalClassNameKeyCategories, renderRequest,
					batchPlannerPlan));

			return "/export/edit_batch_planner_plan.jsp";
		}

		renderRequest.setAttribute(
			WebKeys.PORTLET_DISPLAY_CONTEXT,
			new EditBatchPlannerPlanDisplayContext(
				_batchPlannerPlanService.getBatchPlannerPlans(
					_portal.getCompanyId(renderRequest), false, true,
					QueryUtil.ALL_POS, QueryUtil.ALL_POS, null),
				internalClassNameKeyCategories, renderRequest,
				batchPlannerPlan));

		return "/import/edit_batch_planner_plan.jsp";
	}

	private static final Log _log = LogFactoryUtil.getLog(
		EditBatchPlannerPlanMVCRenderCommand.class);

	@Reference
	private BatchPlannerPlanService _batchPlannerPlanService;

	@Reference
	private Portal _portal;

	@Reference
	private VulcanBatchEngineTaskItemDelegateRegistry
		_vulcanBatchEngineTaskItemDelegateRegistry;

}