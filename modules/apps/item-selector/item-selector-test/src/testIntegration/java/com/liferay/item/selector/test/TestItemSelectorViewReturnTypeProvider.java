/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.item.selector.test;

import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.ItemSelectorViewReturnTypeProvider;

import java.util.List;

/**
 * @author Roberto Díaz
 */
public class TestItemSelectorViewReturnTypeProvider
	implements ItemSelectorViewReturnTypeProvider {

	@Override
	public List<ItemSelectorReturnType>
		populateSupportedItemSelectorReturnTypes(
			List<ItemSelectorReturnType> itemSelectorReturnTypes) {

		itemSelectorReturnTypes.clear();

		itemSelectorReturnTypes.add(new TestItemSelectorReturnType());

		return itemSelectorReturnTypes;
	}

}