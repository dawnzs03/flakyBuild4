/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.kaleo.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskFormTable;
import com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskFormImpl;
import com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskFormModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from KaleoTaskForm.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.portal.workflow.kaleo.model.impl.KaleoTaskFormImpl",
		"table.name=KaleoTaskForm"
	},
	service = ArgumentsResolver.class
)
public class KaleoTaskFormModelArgumentsResolver implements ArgumentsResolver {

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

		KaleoTaskFormModelImpl kaleoTaskFormModelImpl =
			(KaleoTaskFormModelImpl)baseModel;

		long columnBitmask = kaleoTaskFormModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(kaleoTaskFormModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					kaleoTaskFormModelImpl.getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(KaleoTaskFormPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(kaleoTaskFormModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return KaleoTaskFormImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return KaleoTaskFormTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		KaleoTaskFormModelImpl kaleoTaskFormModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = kaleoTaskFormModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = kaleoTaskFormModelImpl.getColumnValue(
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

		orderByColumnsBitmask |= KaleoTaskFormModelImpl.getColumnBitmask(
			"priority");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}