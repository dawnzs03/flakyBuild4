/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.tools.service.builder.test.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.tools.service.builder.test.model.EagerBlobEntryTable;
import com.liferay.portal.tools.service.builder.test.model.impl.EagerBlobEntryImpl;
import com.liferay.portal.tools.service.builder.test.model.impl.EagerBlobEntryModelImpl;

import java.util.Objects;

/**
 * The arguments resolver class for retrieving value from EagerBlobEntry.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@OSGiBeanProperties(
	property = {
		"class.name=com.liferay.portal.tools.service.builder.test.model.impl.EagerBlobEntryImpl",
		"table.name=EagerBlobEntry"
	},
	service = ArgumentsResolver.class
)
public class EagerBlobEntryModelArgumentsResolver implements ArgumentsResolver {

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

		EagerBlobEntryModelImpl eagerBlobEntryModelImpl =
			(EagerBlobEntryModelImpl)baseModel;

		if (!checkColumn ||
			_hasModifiedColumns(eagerBlobEntryModelImpl, columnNames)) {

			return _getValue(eagerBlobEntryModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return EagerBlobEntryImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return EagerBlobEntryTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		EagerBlobEntryModelImpl eagerBlobEntryModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = eagerBlobEntryModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = eagerBlobEntryModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static boolean _hasModifiedColumns(
		EagerBlobEntryModelImpl eagerBlobEntryModelImpl, String[] columnNames) {

		if (columnNames.length == 0) {
			return false;
		}

		for (String columnName : columnNames) {
			if (!Objects.equals(
					eagerBlobEntryModelImpl.getColumnOriginalValue(columnName),
					eagerBlobEntryModelImpl.getColumnValue(columnName))) {

				return true;
			}
		}

		return false;
	}

}