/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.pricing.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Riccardo Alberti
 * @generated
 */
@ProviderType
public interface CommercePriceModifierFinder {

	public java.util.List
		<com.liferay.commerce.pricing.model.CommercePriceModifier>
			findByC_C_C_P(
				long commercePriceListId, long cpDefinitionId,
				long[] assetCategoriesIds, long[] commercePricingClassesIds);

}