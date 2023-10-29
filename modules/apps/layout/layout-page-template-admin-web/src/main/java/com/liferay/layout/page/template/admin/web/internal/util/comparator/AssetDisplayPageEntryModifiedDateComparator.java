/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.page.template.admin.web.internal.util.comparator;

import com.liferay.asset.display.page.model.AssetDisplayPageEntry;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * @author Rubén Pulido
 */
public class AssetDisplayPageEntryModifiedDateComparator
	extends OrderByComparator<AssetDisplayPageEntry> {

	public static final String ORDER_BY_ASC =
		"AssetDisplayPageEntry.modifiedDate ASC";

	public static final String ORDER_BY_DESC =
		"AssetDisplayPageEntry.modifiedDate DESC";

	public static final String[] ORDER_BY_FIELDS = {"modifiedDate"};

	public AssetDisplayPageEntryModifiedDateComparator() {
		this(true);
	}

	public AssetDisplayPageEntryModifiedDateComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(
		AssetDisplayPageEntry assetDisplayPageEntry1,
		AssetDisplayPageEntry assetDisplayPageEntry2) {

		int value = DateUtil.compareTo(
			assetDisplayPageEntry1.getModifiedDate(),
			assetDisplayPageEntry2.getModifiedDate());

		if (_ascending) {
			return value;
		}

		return -value;
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}

		return ORDER_BY_DESC;
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private final boolean _ascending;

}