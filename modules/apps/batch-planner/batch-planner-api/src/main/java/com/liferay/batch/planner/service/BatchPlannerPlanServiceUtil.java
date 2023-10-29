/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.planner.service;

import com.liferay.batch.planner.model.BatchPlannerPlan;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

/**
 * Provides the remote service utility for BatchPlannerPlan. This utility wraps
 * <code>com.liferay.batch.planner.service.impl.BatchPlannerPlanServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Igor Beslic
 * @see BatchPlannerPlanService
 * @generated
 */
public class BatchPlannerPlanServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.batch.planner.service.impl.BatchPlannerPlanServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static BatchPlannerPlan addBatchPlannerPlan(
			boolean export, String externalType, String externalURL,
			String internalClassName, String name, int size,
			String taskItemDelegateName, boolean template)
		throws PortalException {

		return getService().addBatchPlannerPlan(
			export, externalType, externalURL, internalClassName, name, size,
			taskItemDelegateName, template);
	}

	public static BatchPlannerPlan deleteBatchPlannerPlan(
			long batchPlannerPlanId)
		throws PortalException {

		return getService().deleteBatchPlannerPlan(batchPlannerPlanId);
	}

	public static BatchPlannerPlan fetchBatchPlannerPlan(
			long batchPlannerPlanId)
		throws PortalException {

		return getService().fetchBatchPlannerPlan(batchPlannerPlanId);
	}

	public static BatchPlannerPlan getBatchPlannerPlan(long batchPlannerPlanId)
		throws PortalException {

		return getService().getBatchPlannerPlan(batchPlannerPlanId);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
		long companyId, boolean export, boolean template, int start, int end,
		OrderByComparator<BatchPlannerPlan> orderByComparator) {

		return getService().getBatchPlannerPlans(
			companyId, export, template, start, end, orderByComparator);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
			long companyId, boolean export, boolean template,
			String searchByKeyword, int start, int end,
			OrderByComparator<BatchPlannerPlan> orderByComparator)
		throws PortalException {

		return getService().getBatchPlannerPlans(
			companyId, export, template, searchByKeyword, start, end,
			orderByComparator);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
		long companyId, boolean template, int start, int end,
		OrderByComparator<BatchPlannerPlan> orderByComparator) {

		return getService().getBatchPlannerPlans(
			companyId, template, start, end, orderByComparator);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
			long companyId, boolean template, String searchByKeyword, int start,
			int end, OrderByComparator<BatchPlannerPlan> orderByComparator)
		throws PortalException {

		return getService().getBatchPlannerPlans(
			companyId, template, searchByKeyword, start, end,
			orderByComparator);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
		long companyId, int start, int end) {

		return getService().getBatchPlannerPlans(companyId, start, end);
	}

	public static List<BatchPlannerPlan> getBatchPlannerPlans(
		long companyId, int start, int end,
		OrderByComparator<BatchPlannerPlan> orderByComparator) {

		return getService().getBatchPlannerPlans(
			companyId, start, end, orderByComparator);
	}

	public static int getBatchPlannerPlansCount(long companyId) {
		return getService().getBatchPlannerPlansCount(companyId);
	}

	public static int getBatchPlannerPlansCount(
		long companyId, boolean template) {

		return getService().getBatchPlannerPlansCount(companyId, template);
	}

	public static int getBatchPlannerPlansCount(
		long companyId, boolean export, boolean template) {

		return getService().getBatchPlannerPlansCount(
			companyId, export, template);
	}

	public static int getBatchPlannerPlansCount(
			long companyId, boolean export, boolean template,
			String searchByKeyword)
		throws PortalException {

		return getService().getBatchPlannerPlansCount(
			companyId, export, template, searchByKeyword);
	}

	public static int getBatchPlannerPlansCount(
			long companyId, boolean template, String searchByKeyword)
		throws PortalException {

		return getService().getBatchPlannerPlansCount(
			companyId, template, searchByKeyword);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static BatchPlannerPlan updateBatchPlannerPlan(
			long batchPlannerPlanId, String externalType,
			String internalClassName, String name)
		throws PortalException {

		return getService().updateBatchPlannerPlan(
			batchPlannerPlanId, externalType, internalClassName, name);
	}

	public static BatchPlannerPlanService getService() {
		return _service;
	}

	public static void setService(BatchPlannerPlanService service) {
		_service = service;
	}

	private static volatile BatchPlannerPlanService _service;

}