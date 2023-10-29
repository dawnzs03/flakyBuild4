/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.admin.web.internal.util;

import com.liferay.layout.page.template.model.LayoutPageTemplateCollection;
import com.liferay.layout.page.template.model.LayoutPageTemplateEntry;
import com.liferay.layout.page.template.util.comparator.LayoutPageTemplateCollectionCreateDateComparator;
import com.liferay.layout.page.template.util.comparator.LayoutPageTemplateCollectionNameComparator;
import com.liferay.layout.page.template.util.comparator.LayoutPageTemplateEntryCreateDateComparator;
import com.liferay.layout.page.template.util.comparator.LayoutPageTemplateEntryNameComparator;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * @author Jürgen Kappler
 */
public class LayoutPageTemplatePortletUtil {

	public static OrderByComparator<LayoutPageTemplateCollection>
		getLayoutPageTemplateCollectionOrderByComparator(
			String orderByCol, String orderByType) {

		boolean orderByAsc = false;

		if (orderByType.equals("asc")) {
			orderByAsc = true;
		}

		OrderByComparator<LayoutPageTemplateCollection> orderByComparator =
			null;

		if (orderByCol.equals("create-date")) {
			orderByComparator =
				new LayoutPageTemplateCollectionCreateDateComparator(
					orderByAsc);
		}
		else if (orderByCol.equals("name")) {
			orderByComparator = new LayoutPageTemplateCollectionNameComparator(
				orderByAsc);
		}

		return orderByComparator;
	}

	public static OrderByComparator<LayoutPageTemplateEntry>
		getLayoutPageTemplateEntryOrderByComparator(
			String orderByCol, String orderByType) {

		boolean orderByAsc = false;

		if (orderByType.equals("asc")) {
			orderByAsc = true;
		}

		OrderByComparator<LayoutPageTemplateEntry> orderByComparator = null;

		if (orderByCol.equals("create-date")) {
			orderByComparator = new LayoutPageTemplateEntryCreateDateComparator(
				orderByAsc);
		}
		else if (orderByCol.equals("name")) {
			orderByComparator = new LayoutPageTemplateEntryNameComparator(
				orderByAsc);
		}

		return orderByComparator;
	}

}