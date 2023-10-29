/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.price.list.test.util;

import com.liferay.commerce.price.list.exception.NoSuchPriceEntryException;
import com.liferay.commerce.price.list.model.CommercePriceEntry;
import com.liferay.commerce.price.list.model.CommercePriceList;
import com.liferay.commerce.price.list.model.CommerceTierPriceEntry;
import com.liferay.commerce.price.list.service.CommercePriceEntryLocalServiceUtil;
import com.liferay.commerce.price.list.service.CommerceTierPriceEntryLocalServiceUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;

import java.math.BigDecimal;

/**
 * @author Zoltán Takács
 */
public class CommerceTierPriceEntryTestUtil {

	public static CommerceTierPriceEntry addCommerceTierPriceEntry(
			long commercePriceEntryId, double minQuantity, double price,
			double promoPrice, String externalReferenceCode)
		throws PortalException {

		CommercePriceEntry commercePriceEntry =
			CommercePriceEntryLocalServiceUtil.getCommercePriceEntry(
				commercePriceEntryId);

		CommercePriceList commercePriceList =
			commercePriceEntry.getCommercePriceList();

		return CommerceTierPriceEntryLocalServiceUtil.addCommerceTierPriceEntry(
			externalReferenceCode, commercePriceEntryId,
			BigDecimal.valueOf(price), BigDecimal.valueOf(promoPrice),
			BigDecimal.valueOf(minQuantity),
			ServiceContextTestUtil.getServiceContext(
				commercePriceList.getGroupId()));
	}

	public static CommerceTierPriceEntry addOrUpdateCommerceTierPriceEntry(
			long companyId, long commerceTierPriceEntryId,
			long commercePriceEntryId, double minQuantity, double price,
			double promoPrice, String externalReferenceCode,
			String priceEntryExternalReferenceCode)
		throws PortalException {

		long groupId = _getGroupId(
			companyId, commercePriceEntryId, priceEntryExternalReferenceCode);

		return CommerceTierPriceEntryLocalServiceUtil.
			addOrUpdateCommerceTierPriceEntry(
				externalReferenceCode, commerceTierPriceEntryId,
				commercePriceEntryId, BigDecimal.valueOf(price),
				BigDecimal.valueOf(promoPrice), BigDecimal.valueOf(minQuantity),
				priceEntryExternalReferenceCode,
				ServiceContextTestUtil.getServiceContext(groupId));
	}

	private static long _getGroupId(
			long companyId, long commercePriceEntryId,
			String priceEntryExternalReferenceCode)
		throws PortalException {

		if (commercePriceEntryId > 0) {
			CommercePriceEntry commercePriceEntry =
				CommercePriceEntryLocalServiceUtil.fetchCommercePriceEntry(
					commercePriceEntryId);

			if (commercePriceEntry != null) {
				CommercePriceList commercePriceList =
					commercePriceEntry.getCommercePriceList();

				return commercePriceList.getGroupId();
			}
		}

		if (priceEntryExternalReferenceCode != null) {
			CommercePriceEntry commercePriceEntry =
				CommercePriceEntryLocalServiceUtil.fetchByExternalReferenceCode(
					priceEntryExternalReferenceCode, companyId);

			if (commercePriceEntry != null) {
				CommercePriceList commercePriceList =
					commercePriceEntry.getCommercePriceList();

				return commercePriceList.getGroupId();
			}
		}

		throw new NoSuchPriceEntryException(
			StringBundler.concat(
				"{commercePriceEntryId=", commercePriceEntryId,
				", priceEntryExternalReferenceCode=",
				priceEntryExternalReferenceCode, CharPool.CLOSE_CURLY_BRACE));
	}

}