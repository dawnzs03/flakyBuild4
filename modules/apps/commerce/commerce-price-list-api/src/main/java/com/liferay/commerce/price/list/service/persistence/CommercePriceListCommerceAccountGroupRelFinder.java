/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.price.list.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Alessio Antonio Rendina
 * @generated
 */
@ProviderType
public interface CommercePriceListCommerceAccountGroupRelFinder {

	public int countByCommercePriceListId(
		long commercePriceListId, String name);

	public int countByCommercePriceListId(
		long commercePriceListId, String name, boolean inlineSQLHelper);

	public java.util.List
		<com.liferay.commerce.price.list.model.
			CommercePriceListCommerceAccountGroupRel> findByCommercePriceListId(
				long commercePriceListId, String name, int start, int end);

	public java.util.List
		<com.liferay.commerce.price.list.model.
			CommercePriceListCommerceAccountGroupRel> findByCommercePriceListId(
				long commercePriceListId, String name, int start, int end,
				boolean inlineSQLHelper);

}