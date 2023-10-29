/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.tax.engine.fixed.service;

import com.liferay.commerce.tax.engine.fixed.model.CommerceTaxFixedRateAddressRel;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

/**
 * Provides the remote service utility for CommerceTaxFixedRateAddressRel. This utility wraps
 * <code>com.liferay.commerce.tax.engine.fixed.service.impl.CommerceTaxFixedRateAddressRelServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceTaxFixedRateAddressRelService
 * @generated
 */
public class CommerceTaxFixedRateAddressRelServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.commerce.tax.engine.fixed.service.impl.CommerceTaxFixedRateAddressRelServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static CommerceTaxFixedRateAddressRel
			addCommerceTaxFixedRateAddressRel(
				long groupId, long commerceTaxMethodId, long cpTaxCategoryId,
				long countryId, long regionId, String zip, double rate)
		throws PortalException {

		return getService().addCommerceTaxFixedRateAddressRel(
			groupId, commerceTaxMethodId, cpTaxCategoryId, countryId, regionId,
			zip, rate);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x)
	 */
	@Deprecated
	public static CommerceTaxFixedRateAddressRel
			addCommerceTaxFixedRateAddressRel(
				long commerceTaxMethodId, long cpTaxCategoryId, long countryId,
				long regionId, String zip, double rate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addCommerceTaxFixedRateAddressRel(
			commerceTaxMethodId, cpTaxCategoryId, countryId, regionId, zip,
			rate, serviceContext);
	}

	public static void deleteCommerceTaxFixedRateAddressRel(
			long commerceTaxFixedRateAddressRelId)
		throws PortalException {

		getService().deleteCommerceTaxFixedRateAddressRel(
			commerceTaxFixedRateAddressRelId);
	}

	public static CommerceTaxFixedRateAddressRel
			fetchCommerceTaxFixedRateAddressRel(
				long commerceTaxFixedRateAddressRelId)
		throws PortalException {

		return getService().fetchCommerceTaxFixedRateAddressRel(
			commerceTaxFixedRateAddressRelId);
	}

	public static List<CommerceTaxFixedRateAddressRel>
			getCommerceTaxMethodFixedRateAddressRels(
				long groupId, long commerceTaxMethodId, int start, int end,
				OrderByComparator<CommerceTaxFixedRateAddressRel>
					orderByComparator)
		throws PortalException {

		return getService().getCommerceTaxMethodFixedRateAddressRels(
			groupId, commerceTaxMethodId, start, end, orderByComparator);
	}

	public static int getCommerceTaxMethodFixedRateAddressRelsCount(
			long groupId, long commerceTaxMethodId)
		throws PortalException {

		return getService().getCommerceTaxMethodFixedRateAddressRelsCount(
			groupId, commerceTaxMethodId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static CommerceTaxFixedRateAddressRel
			updateCommerceTaxFixedRateAddressRel(
				long commerceTaxFixedRateAddressRelId, long countryId,
				long regionId, String zip, double rate)
		throws PortalException {

		return getService().updateCommerceTaxFixedRateAddressRel(
			commerceTaxFixedRateAddressRelId, countryId, regionId, zip, rate);
	}

	public static CommerceTaxFixedRateAddressRelService getService() {
		return _service;
	}

	public static void setService(
		CommerceTaxFixedRateAddressRelService service) {

		_service = service;
	}

	private static volatile CommerceTaxFixedRateAddressRelService _service;

}