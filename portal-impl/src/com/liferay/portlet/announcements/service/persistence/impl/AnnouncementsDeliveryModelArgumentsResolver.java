/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portlet.announcements.service.persistence.impl;

import com.liferay.announcements.kernel.model.AnnouncementsDeliveryTable;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryImpl;
import com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The arguments resolver class for retrieving value from AnnouncementsDelivery.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@OSGiBeanProperties(
	property = {
		"class.name=com.liferay.portlet.announcements.model.impl.AnnouncementsDeliveryImpl",
		"table.name=AnnouncementsDelivery"
	},
	service = ArgumentsResolver.class
)
public class AnnouncementsDeliveryModelArgumentsResolver
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

		AnnouncementsDeliveryModelImpl announcementsDeliveryModelImpl =
			(AnnouncementsDeliveryModelImpl)baseModel;

		long columnBitmask = announcementsDeliveryModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(
				announcementsDeliveryModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |=
					announcementsDeliveryModelImpl.getColumnBitmask(columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(
				announcementsDeliveryModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return AnnouncementsDeliveryImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return AnnouncementsDeliveryTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		AnnouncementsDeliveryModelImpl announcementsDeliveryModelImpl,
		String[] columnNames, boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] =
					announcementsDeliveryModelImpl.getColumnOriginalValue(
						columnName);
			}
			else {
				arguments[i] = announcementsDeliveryModelImpl.getColumnValue(
					columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}