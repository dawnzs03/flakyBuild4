/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.internal.dto.v1_0.util;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.asset.link.service.AssetLinkLocalService;
import com.liferay.headless.delivery.dto.v1_0.RelatedContent;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;

import java.util.Locale;

/**
 * @author Javier Gamarra
 */
public class RelatedContentUtil {

	public static RelatedContent[] toRelatedContents(
		AssetEntryLocalService assetEntryLocalService,
		AssetLinkLocalService assetLinkLocalService,
		DTOConverterRegistry dtoConverterRegistry, String className,
		long classPK, Locale locale) {

		AssetEntry assetEntry = assetEntryLocalService.fetchEntry(
			className, classPK);

		if (assetEntry == null) {
			return null;
		}

		return TransformUtil.transformToArray(
			assetLinkLocalService.getDirectLinks(assetEntry.getEntryId()),
			assetLink -> _toRelatedContent(
				assetEntryLocalService.getEntry(assetLink.getEntryId2()),
				dtoConverterRegistry, locale),
			RelatedContent.class);
	}

	private static RelatedContent _toRelatedContent(
		AssetEntry assetEntry, DTOConverterRegistry dtoConverterRegistry,
		Locale locale) {

		if (assetEntry == null) {
			return null;
		}

		return new RelatedContent() {
			{
				id = assetEntry.getClassPK();
				title = assetEntry.getTitle(locale);

				setContentType(
					() -> {
						DTOConverter<?, ?> dtoConverter =
							dtoConverterRegistry.getDTOConverter(
								assetEntry.getClassName());

						if (dtoConverter == null) {
							return assetEntry.getClassName();
						}

						return dtoConverter.getContentType();
					});
			}
		};
	}

}