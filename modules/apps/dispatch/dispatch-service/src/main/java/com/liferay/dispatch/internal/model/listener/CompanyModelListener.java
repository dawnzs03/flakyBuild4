/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.internal.model.listener;

import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.dispatch.service.DispatchTriggerLocalService;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.ModelListener;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jorge Díaz
 */
@Component(service = ModelListener.class)
public class CompanyModelListener extends BaseModelListener<Company> {

	@Override
	public void onAfterRemove(Company company) throws ModelListenerException {
		try {
			_deleteDispatchTriggers(company);
		}
		catch (PortalException portalException) {
			throw new ModelListenerException(portalException);
		}
	}

	private void _deleteDispatchTriggers(Company company)
		throws PortalException {

		ActionableDynamicQuery actionableDynamicQuery =
			_dispatchTriggerLocalService.getActionableDynamicQuery();

		actionableDynamicQuery.setAddCriteriaMethod(
			dynamicQuery -> dynamicQuery.add(
				RestrictionsFactoryUtil.eq(
					"companyId", company.getCompanyId())));
		actionableDynamicQuery.setPerformActionMethod(
			dispatchTrigger ->
				_dispatchTriggerLocalService.deleteDispatchTrigger(
					(DispatchTrigger)dispatchTrigger));

		actionableDynamicQuery.performActions();
	}

	@Reference
	private DispatchTriggerLocalService _dispatchTriggerLocalService;

}