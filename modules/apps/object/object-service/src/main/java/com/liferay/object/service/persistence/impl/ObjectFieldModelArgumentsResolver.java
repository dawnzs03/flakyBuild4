/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.service.persistence.impl;

import com.liferay.object.model.ObjectFieldTable;
import com.liferay.object.model.impl.ObjectFieldImpl;
import com.liferay.object.model.impl.ObjectFieldModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from ObjectField.
 *
 * @author Marco Leo
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.object.model.impl.ObjectFieldImpl",
		"table.name=ObjectField"
	},
	service = ArgumentsResolver.class
)
public class ObjectFieldModelArgumentsResolver implements ArgumentsResolver {

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

		ObjectFieldModelImpl objectFieldModelImpl =
			(ObjectFieldModelImpl)baseModel;

		long columnBitmask = objectFieldModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(objectFieldModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					objectFieldModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(ObjectFieldPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(objectFieldModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return ObjectFieldImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return ObjectFieldTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		ObjectFieldModelImpl objectFieldModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = objectFieldModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = objectFieldModelImpl.getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

	private static final long _ORDER_BY_COLUMNS_BITMASK;

	static {
		long orderByColumnsBitmask = 0;

		orderByColumnsBitmask |= ObjectFieldModelImpl.getColumnBitmask("name");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}