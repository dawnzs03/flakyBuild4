/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.discount.service.persistence.impl;

import com.liferay.commerce.discount.model.CommerceDiscountOrderTypeRelTable;
import com.liferay.commerce.discount.model.impl.CommerceDiscountOrderTypeRelImpl;
import com.liferay.commerce.discount.model.impl.CommerceDiscountOrderTypeRelModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CommerceDiscountOrderTypeRel.
 *
 * @author Marco Leo
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.commerce.discount.model.impl.CommerceDiscountOrderTypeRelImpl",
		"table.name=CommerceDiscountOrderTypeRel"
	},
	service = ArgumentsResolver.class
)
public class CommerceDiscountOrderTypeRelModelArgumentsResolver
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

		CommerceDiscountOrderTypeRelModelImpl
			commerceDiscountOrderTypeRelModelImpl =
				(CommerceDiscountOrderTypeRelModelImpl)baseModel;

		long columnBitmask =
			commerceDiscountOrderTypeRelModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				commerceDiscountOrderTypeRelModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					commerceDiscountOrderTypeRelModelImpl.getColumnBitmask(
						columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CommerceDiscountOrderTypeRelPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				commerceDiscountOrderTypeRelModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CommerceDiscountOrderTypeRelImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CommerceDiscountOrderTypeRelTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CommerceDiscountOrderTypeRelModelImpl
			commerceDiscountOrderTypeRelModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					commerceDiscountOrderTypeRelModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					commerceDiscountOrderTypeRelModelImpl.getColumnValue(
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

		orderByColumnsBitmask |=
			CommerceDiscountOrderTypeRelModelImpl.getColumnBitmask("priority");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}