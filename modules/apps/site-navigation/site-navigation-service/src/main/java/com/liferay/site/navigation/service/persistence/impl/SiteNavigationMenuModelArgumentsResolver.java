/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.site.navigation.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.site.navigation.model.SiteNavigationMenuTable;
import com.liferay.site.navigation.model.impl.SiteNavigationMenuImpl;
import com.liferay.site.navigation.model.impl.SiteNavigationMenuModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from SiteNavigationMenu.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.site.navigation.model.impl.SiteNavigationMenuImpl",
		"table.name=SiteNavigationMenu"
	},
	service = ArgumentsResolver.class
)
public class SiteNavigationMenuModelArgumentsResolver
	implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		SiteNavigationMenuModelImpl siteNavigationMenuModelImpl =
			(SiteNavigationMenuModelImpl)baseModel;

		long columnBitmask = siteNavigationMenuModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				siteNavigationMenuModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					siteNavigationMenuModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				siteNavigationMenuModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return SiteNavigationMenuImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return SiteNavigationMenuTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		SiteNavigationMenuModelImpl siteNavigationMenuModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					siteNavigationMenuModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = siteNavigationMenuModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}