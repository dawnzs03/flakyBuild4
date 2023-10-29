/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.internal.dto.v1_0.converter;

import com.liferay.commerce.product.model.CPOptionCategory;
import com.liferay.commerce.product.model.CPSpecificationOption;
import com.liferay.commerce.product.service.CPSpecificationOptionService;
import com.liferay.headless.commerce.admin.catalog.dto.v1_0.OptionCategory;
import com.liferay.headless.commerce.admin.catalog.dto.v1_0.Specification;
import com.liferay.headless.commerce.admin.catalog.internal.dto.v1_0.converter.constants.DTOConverterConstants;
import com.liferay.headless.commerce.core.util.LanguageUtils;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	property = "dto.class.name=com.liferay.commerce.product.model.CPSpecificationOption",
	service = DTOConverter.class
)
public class SpecificationDTOConverter
	implements DTOConverter<CPSpecificationOption, Specification> {

	@Override
	public String getContentType() {
		return Specification.class.getSimpleName();
	}

	@Override
	public Specification toDTO(DTOConverterContext dtoConverterContext)
		throws Exception {

		CPSpecificationOption cpSpecificationOption =
			_cpSpecificationOptionService.getCPSpecificationOption(
				(Long)dtoConverterContext.getId());

		CPOptionCategory cpOptionCategory =
			cpSpecificationOption.getCPOptionCategory();

		Specification specification = new Specification() {
			{
				description = LanguageUtils.getLanguageIdMap(
					cpSpecificationOption.getDescriptionMap());
				facetable = cpSpecificationOption.isFacetable();
				id = cpSpecificationOption.getCPSpecificationOptionId();
				key = cpSpecificationOption.getKey();
				title = LanguageUtils.getLanguageIdMap(
					cpSpecificationOption.getTitleMap());
			}
		};

		if (cpOptionCategory != null) {
			specification.setOptionCategory(
				_optionCategoryDTOConverter.toDTO(
					new DefaultDTOConverterContext(
						cpOptionCategory.getCPOptionCategoryId(),
						dtoConverterContext.getLocale())));
		}

		return specification;
	}

	@Reference
	private CPSpecificationOptionService _cpSpecificationOptionService;

	@Reference(target = DTOConverterConstants.OPTION_CATEGORY_DTO_CONVERTER)
	private DTOConverter<CPOptionCategory, OptionCategory>
		_optionCategoryDTOConverter;

}