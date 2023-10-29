/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.tools.service.builder.test.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.tools.service.builder.test.model.LVEntryLocalizationTable;
import com.liferay.portal.tools.service.builder.test.model.impl.LVEntryLocalizationImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.LVEntryLocalizationModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The arguments resolver class for retrieving value from LVEntryLocalization.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@OSGiBeanProperties(
	property = {
		"class.name=com.liferay.portal.tools.service.builder.test.model.impl.LVEntryLocalizationImpl",
		"table.name=LVEntryLocalization"
	},
	service = ArgumentsResolver.class
)
public class LVEntryLocalizationModelArgumentsResolver
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

		LVEntryLocalizationModelImpl lvEntryLocalizationModelImpl =
			(LVEntryLocalizationModelImpl)baseModel;

		long columnBitmask = lvEntryLocalizationModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				lvEntryLocalizationModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					lvEntryLocalizationModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				lvEntryLocalizationModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return LVEntryLocalizationImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return LVEntryLocalizationTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		LVEntryLocalizationModelImpl lvEntryLocalizationModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					lvEntryLocalizationModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = lvEntryLocalizationModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}