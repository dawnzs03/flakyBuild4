/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.service.persistence.impl;

import com.liferay.object.model.ObjectFolderTable;
import com.liferay.object.model.impl.ObjectFolderImpl;
import com.liferay.object.model.impl.ObjectFolderModelImpl;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from ObjectFolder.
 *
 * @author Marco Leo
 * @generated
 */
@Component(
	property = {
		"class.name=com.liferay.object.model.impl.ObjectFolderImpl",
		"table.name=ObjectFolder"
	},
	service = ArgumentsResolver.class
)
public class ObjectFolderModelArgumentsResolver implements ArgumentsResolver {

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

		ObjectFolderModelImpl objectFolderModelImpl =
			(ObjectFolderModelImpl)baseModel;

		long columnBitmask = objectFolderModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(objectFolderModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					objectFolderModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(objectFolderModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return ObjectFolderImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return ObjectFolderTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		ObjectFolderModelImpl objectFolderModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = objectFolderModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = objectFolderModelImpl.getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}