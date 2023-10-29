/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.product.navigation.simulation.web.internal.application.list;

import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.Language;
import com.liferay.product.navigation.simulation.constants.ProductNavigationSimulationConstants;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eduardo García
 */
@Component(
	property = {
		"panel.category.key=" + PanelCategoryKeys.HIDDEN,
		"panel.category.order:Integer=500"
	},
	service = PanelCategory.class
)
public class SimulationPanelCategory extends BasePanelCategory {

	@Override
	public String getKey() {
		return ProductNavigationSimulationConstants.
			SIMULATION_PANEL_CATEGORY_KEY;
	}

	@Override
	public String getLabel(Locale locale) {
		return _language.get(locale, "simulation");
	}

	@Reference
	private Language _language;

}