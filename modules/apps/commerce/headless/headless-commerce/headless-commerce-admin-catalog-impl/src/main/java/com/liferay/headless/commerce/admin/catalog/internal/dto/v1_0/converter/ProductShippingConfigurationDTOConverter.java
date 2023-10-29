/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.catalog.internal.dto.v1_0.converter;

import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.service.CPDefinitionService;
import com.liferay.headless.commerce.admin.catalog.dto.v1_0.ProductShippingConfiguration;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

import java.math.BigDecimal;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	property = "dto.class.name=ProductShippingConfiguration",
	service = DTOConverter.class
)
public class ProductShippingConfigurationDTOConverter
	implements DTOConverter<CPDefinition, ProductShippingConfiguration> {

	@Override
	public String getContentType() {
		return ProductShippingConfiguration.class.getSimpleName();
	}

	@Override
	public ProductShippingConfiguration toDTO(
			DTOConverterContext dtoConverterContext)
		throws Exception {

		CPDefinition cpDefinition = _cpDefinitionService.getCPDefinition(
			(Long)dtoConverterContext.getId());

		return new ProductShippingConfiguration() {
			{
				depth = BigDecimal.valueOf(cpDefinition.getDepth());
				freeShipping = cpDefinition.isFreeShipping();
				height = BigDecimal.valueOf(cpDefinition.getHeight());
				shippable = cpDefinition.isShippable();
				shippingExtraPrice = BigDecimal.valueOf(
					cpDefinition.getShippingExtraPrice());
				shippingSeparately = cpDefinition.isShipSeparately();
				weight = BigDecimal.valueOf(cpDefinition.getWeight());
				width = BigDecimal.valueOf(cpDefinition.getWidth());
			}
		};
	}

	@Reference
	private CPDefinitionService _cpDefinitionService;

}