/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.sync.service.persistence.impl;

import com.liferay.document.library.sync.model.DLSyncEventTable;
import com.liferay.document.library.sync.model.impl.DLSyncEventImpl;
import com.liferay.document.library.sync.model.impl.DLSyncEventModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from DLSyncEvent.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.document.library.sync.model.impl.DLSyncEventImpl",
		"table.name=DLSyncEvent"
	},
	service = ArgumentsResolver.class
)
public class DLSyncEventModelArgumentsResolver implements ArgumentsResolver {

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

		DLSyncEventModelImpl dlSyncEventModelImpl =
			(DLSyncEventModelImpl)baseModel;

		long columnBitmask = dlSyncEventModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(dlSyncEventModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					dlSyncEventModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(DLSyncEventPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(dlSyncEventModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return DLSyncEventImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return DLSyncEventTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		DLSyncEventModelImpl dlSyncEventModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = dlSyncEventModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = dlSyncEventModelImpl.getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

	private static final long _ORDER_BY_COLUMNS_BITMASK;

	static {
		long orderByColumnsBitmask = 0;

		orderByColumnsBitmask |= DLSyncEventModelImpl.getColumnBitmask(
			"modifiedTime");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}