/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.upgrade.v7_0_3;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.dao.db.DBType;
import com.liferay.portal.kernel.upgrade.BaseDBColumnSizeUpgradeProcess;

/**
 * @author Cristina González
 */
public class UpgradeSQLServer extends BaseDBColumnSizeUpgradeProcess {

	public UpgradeSQLServer() {
		super(DBType.SQLSERVER, "nvarchar", 2000);
	}

	@Override
	protected void upgradeColumn(String tableName, String columnName)
		throws Exception {

		runSQL(
			StringBundler.concat(
				"alter table ", tableName, " alter column ", columnName,
				" nvarchar(4000)"));
	}

}