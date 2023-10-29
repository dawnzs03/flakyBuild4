/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.term.service.persistence.impl;

import com.liferay.commerce.term.model.CommerceTermEntryTable;
import com.liferay.commerce.term.model.impl.CommerceTermEntryImpl;
import com.liferay.commerce.term.model.impl.CommerceTermEntryModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CommerceTermEntry.
 *
 * @author Luca Pellizzon
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.commerce.term.model.impl.CommerceTermEntryImpl",
		"table.name=CommerceTermEntry"
	},
	service = ArgumentsResolver.class
)
public class CommerceTermEntryModelArgumentsResolver
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

		CommerceTermEntryModelImpl commerceTermEntryModelImpl =
			(CommerceTermEntryModelImpl)baseModel;

		long columnBitmask = commerceTermEntryModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(commerceTermEntryModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					commerceTermEntryModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CommerceTermEntryPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(commerceTermEntryModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CommerceTermEntryImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CommerceTermEntryTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CommerceTermEntryModelImpl commerceTermEntryModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					commerceTermEntryModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = commerceTermEntryModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

	private static final long _ORDER_BY_COLUMNS_BITMASK;

	static {
		long orderByColumnsBitmask = 0;

		orderByColumnsBitmask |= CommerceTermEntryModelImpl.getColumnBitmask(
			"priority");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}