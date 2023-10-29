/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.inventory.service.impl;

import com.liferay.commerce.inventory.constants.CommerceInventoryActionKeys;
import com.liferay.commerce.inventory.constants.CommerceInventoryConstants;
import com.liferay.commerce.inventory.model.CommerceInventoryBookedQuantity;
import com.liferay.commerce.inventory.service.base.CommerceInventoryBookedQuantityServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Luca Pellizzon
 * @author Alessio Antonio Rendina
 */
@Component(
	property = {
		"json.web.service.context.name=commerce",
		"json.web.service.context.path=CommerceInventoryBookedQuantity"
	},
	service = AopService.class
)
public class CommerceInventoryBookedQuantityServiceImpl
	extends CommerceInventoryBookedQuantityServiceBaseImpl {

	@Override
	public List<CommerceInventoryBookedQuantity>
			getCommerceInventoryBookedQuantities(
				long companyId, String sku, String unitOfMeasureKey, int start,
				int end)
		throws PrincipalException {

		_portletResourcePermission.check(
			getPermissionChecker(), null,
			CommerceInventoryActionKeys.MANAGE_INVENTORY);

		return commerceInventoryBookedQuantityLocalService.
			getCommerceInventoryBookedQuantities(
				companyId, sku, unitOfMeasureKey, start, end);
	}

	@Override
	public List<CommerceInventoryBookedQuantity>
			getCommerceInventoryBookedQuantities(
				long companyId, String keywords, String sku,
				String unitOfMeasureKey, int start, int end)
		throws PortalException {

		_portletResourcePermission.check(
			getPermissionChecker(), null,
			CommerceInventoryActionKeys.MANAGE_INVENTORY);

		return commerceInventoryBookedQuantityLocalService.
			getCommerceInventoryBookedQuantities(
				companyId, keywords, sku, unitOfMeasureKey, start, end);
	}

	@Override
	public int getCommerceInventoryBookedQuantitiesCount(
			long companyId, String sku, String unitOfMeasureKey)
		throws PrincipalException {

		_portletResourcePermission.check(
			getPermissionChecker(), null,
			CommerceInventoryActionKeys.MANAGE_INVENTORY);

		return commerceInventoryBookedQuantityLocalService.
			getCommerceInventoryBookedQuantitiesCount(
				companyId, sku, unitOfMeasureKey);
	}

	@Override
	public int getCommerceInventoryBookedQuantitiesCount(
			long companyId, String keywords, String sku,
			String unitOfMeasureKey)
		throws PortalException {

		_portletResourcePermission.check(
			getPermissionChecker(), null,
			CommerceInventoryActionKeys.MANAGE_INVENTORY);

		return commerceInventoryBookedQuantityLocalService.
			getCommerceInventoryBookedQuantitiesCount(
				companyId, keywords, sku, unitOfMeasureKey);
	}

	@Reference(
		target = "(resource.name=" + CommerceInventoryConstants.RESOURCE_NAME + ")"
	)
	private PortletResourcePermission _portletResourcePermission;

}