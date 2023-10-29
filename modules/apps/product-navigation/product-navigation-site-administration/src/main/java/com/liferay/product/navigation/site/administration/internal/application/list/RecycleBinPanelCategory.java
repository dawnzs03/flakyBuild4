/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.product.navigation.site.administration.internal.application.list;

import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.Language;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = {
		"panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION,
		"panel.category.order:Integer=500"
	},
	service = PanelCategory.class
)
public class RecycleBinPanelCategory extends BasePanelCategory {

	@Override
	public String getKey() {
		return PanelCategoryKeys.SITE_ADMINISTRATION_RECYCLE_BIN;
	}

	@Override
	public String getLabel(Locale locale) {
		return _language.get(
			locale, "category.site_administration.recycle_bin");
	}

	@Reference
	private Language _language;

}