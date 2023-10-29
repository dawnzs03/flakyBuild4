/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.type.virtual.service.persistence.impl;

import com.liferay.commerce.product.type.virtual.model.CPDefinitionVirtualSettingTable;
import com.liferay.commerce.product.type.virtual.model.impl.CPDefinitionVirtualSettingImpl;
import com.liferay.commerce.product.type.virtual.model.impl.CPDefinitionVirtualSettingModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from CPDefinitionVirtualSetting.
 *
 * @author Marco Leo
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.commerce.product.type.virtual.model.impl.CPDefinitionVirtualSettingImpl",
		"table.name=CPDefinitionVirtualSetting"
	},
	service = ArgumentsResolver.class
)
public class CPDefinitionVirtualSettingModelArgumentsResolver
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

		CPDefinitionVirtualSettingModelImpl
			cpDefinitionVirtualSettingModelImpl =
				(CPDefinitionVirtualSettingModelImpl)baseModel;

		long columnBitmask =
			cpDefinitionVirtualSettingModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				cpDefinitionVirtualSettingModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					cpDefinitionVirtualSettingModelImpl.getColumnBitmask(
						columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				cpDefinitionVirtualSettingModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return CPDefinitionVirtualSettingImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return CPDefinitionVirtualSettingTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		CPDefinitionVirtualSettingModelImpl cpDefinitionVirtualSettingModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					cpDefinitionVirtualSettingModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] =
					cpDefinitionVirtualSettingModelImpl.getColumnValue(
						columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}