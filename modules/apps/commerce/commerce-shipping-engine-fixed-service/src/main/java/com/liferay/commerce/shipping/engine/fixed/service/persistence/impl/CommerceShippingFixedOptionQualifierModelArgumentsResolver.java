/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.shipping.engine.fixed.service.persistence.impl;

import com.liferay.commerce.shipping.engine.fixed.model.CommerceShippingFixedOptionQualifierTable;
import com.liferay.commerce.shipping.engine.fixed.model.impl.CommerceShippingFixedOptionQualifierImpl;
import com.liferay.commerce.shipping.engine.fixed.model.impl.CommerceShippingFixedOptionQualifierModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CommerceShippingFixedOptionQualifier.
 *
 * @author Alessio Antonio Rendina
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.commerce.shipping.engine.fixed.model.impl.CommerceShippingFixedOptionQualifierImpl",
		"table.name=CSFixedOptionQualifier"
	},
	service = ArgumentsResolver.class
)
public class CommerceShippingFixedOptionQualifierModelArgumentsResolver
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

		CommerceShippingFixedOptionQualifierModelImpl
			commerceShippingFixedOptionQualifierModelImpl =
				(CommerceShippingFixedOptionQualifierModelImpl)baseModel;

		long columnBitmask =
			commerceShippingFixedOptionQualifierModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				commerceShippingFixedOptionQualifierModelImpl, columnNames,
				original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					commerceShippingFixedOptionQualifierModelImpl.
						getColumnBitmask(columnName);
			}

			if (finderPath.isBaseModelResult() &&
				(CommerceShippingFixedOptionQualifierPersistenceImpl.
					FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

				finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				commerceShippingFixedOptionQualifierModelImpl, columnNames,
				original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CommerceShippingFixedOptionQualifierImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CommerceShippingFixedOptionQualifierTable.INSTANCE.
			getTableName();
	}

	private static Object[] _getValue(
		CommerceShippingFixedOptionQualifierModelImpl
			commerceShippingFixedOptionQualifierModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					commerceShippingFixedOptionQualifierModelImpl.
						getColumnOriginalValue(columnName);
			}
			else {
				arguments[i] =
					commerceShippingFixedOptionQualifierModelImpl.
						getColumnValue(columnName);
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
			CommerceShippingFixedOptionQualifierModelImpl.getColumnBitmask(
				"createDate");

		_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
	}

}