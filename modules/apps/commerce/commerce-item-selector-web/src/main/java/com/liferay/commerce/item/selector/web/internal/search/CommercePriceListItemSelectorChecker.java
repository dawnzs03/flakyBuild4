/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.item.selector.web.internal.search;

import com.liferay.commerce.price.list.model.CommercePriceList;
import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.util.SetUtil;

import java.util.Set;

import javax.portlet.RenderResponse;

/**
 * @author Alessio Antonio Rendina
 */
public class CommercePriceListItemSelectorChecker
	extends EmptyOnClickRowChecker {

	public CommercePriceListItemSelectorChecker(
		RenderResponse renderResponse, long[] checkedCommercePriceListIds) {

		super(renderResponse);

		_checkedCommercePriceListIds = SetUtil.fromArray(
			checkedCommercePriceListIds);
	}

	@Override
	public boolean isChecked(Object object) {
		CommercePriceList commercePriceList = (CommercePriceList)object;

		return _checkedCommercePriceListIds.contains(
			commercePriceList.getCommercePriceListId());
	}

	@Override
	public boolean isDisabled(Object object) {
		return isChecked(object);
	}

	private final Set<Long> _checkedCommercePriceListIds;

}