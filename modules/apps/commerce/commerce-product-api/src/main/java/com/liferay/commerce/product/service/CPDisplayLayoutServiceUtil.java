/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.service;

import com.liferay.commerce.product.model.CPDisplayLayout;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the remote service utility for CPDisplayLayout. This utility wraps
 * <code>com.liferay.commerce.product.service.impl.CPDisplayLayoutServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Marco Leo
 * @see CPDisplayLayoutService
 * @generated
 */
public class CPDisplayLayoutServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.commerce.product.service.impl.CPDisplayLayoutServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static CPDisplayLayout addCPDisplayLayout(
			long groupId, Class<?> clazz, long classPK,
			String layoutPageTemplateEntryUuid, String layoutUuid)
		throws PortalException {

		return getService().addCPDisplayLayout(
			groupId, clazz, classPK, layoutPageTemplateEntryUuid, layoutUuid);
	}

	public static void deleteCPDisplayLayout(long cpDisplayLayoutId)
		throws PortalException {

		getService().deleteCPDisplayLayout(cpDisplayLayoutId);
	}

	public static CPDisplayLayout fetchCPDisplayLayout(long cpDisplayLayoutId)
		throws PortalException {

		return getService().fetchCPDisplayLayout(cpDisplayLayoutId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<CPDisplayLayout> searchCPDisplayLayout(
				long companyId, long groupId, String className, Integer type,
				String keywords, int start, int end,
				com.liferay.portal.kernel.search.Sort sort)
			throws PortalException {

		return getService().searchCPDisplayLayout(
			companyId, groupId, className, type, keywords, start, end, sort);
	}

	public static CPDisplayLayout updateCPDisplayLayout(
			long cpDisplayLayoutId, long classPK,
			String layoutPageTemplateEntryUuid, String layoutUuid)
		throws PortalException {

		return getService().updateCPDisplayLayout(
			cpDisplayLayoutId, classPK, layoutPageTemplateEntryUuid,
			layoutUuid);
	}

	public static CPDisplayLayoutService getService() {
		return _service;
	}

	public static void setService(CPDisplayLayoutService service) {
		_service = service;
	}

	private static volatile CPDisplayLayoutService _service;

}