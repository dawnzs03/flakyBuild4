/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.admin.web.internal.info.item.provider;

import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.item.ClassPKInfoItemIdentifier;
import com.liferay.info.item.InfoItemIdentifier;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.segments.model.SegmentsExperience;
import com.liferay.segments.service.SegmentsExperienceLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Adolfo Pérez
 */
@Component(
	property = "info.item.identifier=com.liferay.info.item.ClassPKInfoItemIdentifier",
	service = InfoItemObjectProvider.class
)
public class LayoutSegmentsExperienceInfoItemObjectProvider
	implements InfoItemObjectProvider<SegmentsExperience> {

	@Override
	public SegmentsExperience getInfoItem(InfoItemIdentifier infoItemIdentifier)
		throws NoSuchInfoItemException {

		if (!(infoItemIdentifier instanceof ClassPKInfoItemIdentifier)) {
			throw new NoSuchInfoItemException(
				"Unsupported info item identifier type " + infoItemIdentifier);
		}

		ClassPKInfoItemIdentifier classPKInfoItemIdentifier =
			(ClassPKInfoItemIdentifier)infoItemIdentifier;

		try {
			return _segmentsExperienceLocalService.getSegmentsExperience(
				classPKInfoItemIdentifier.getClassPK());
		}
		catch (PortalException portalException) {
			throw new NoSuchInfoItemException(
				"No segments experience found with ID " +
					classPKInfoItemIdentifier.getClass(),
				portalException);
		}
	}

	@Reference
	private SegmentsExperienceLocalService _segmentsExperienceLocalService;

}