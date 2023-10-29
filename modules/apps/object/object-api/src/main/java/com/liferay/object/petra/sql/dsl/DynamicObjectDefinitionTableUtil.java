/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.petra.sql.dsl;

import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;

import java.math.BigDecimal;

import java.sql.Blob;
import java.sql.Timestamp;
import java.sql.Types;

import java.util.Date;
import java.util.Map;

/**
 * @author Feliphe Marinho
 */
public class DynamicObjectDefinitionTableUtil {

	/**
	 * @see com.liferay.portal.dao.db.BaseDB#alterTableAddColumn(
	 *      java.sql.Connection, String, String, String)
	 */
	public static String getAlterTableAddColumnSQL(
		String tableName, String columnName, String dbType) {

		String sql = StringBundler.concat(
			"alter table ", tableName, " add ", columnName, StringPool.SPACE,
			getDataType(dbType), getSQLColumnNull(dbType));

		if (_log.isDebugEnabled()) {
			_log.debug("SQL: " + sql);
		}

		return sql;
	}

	public static String getDataType(String dbType) {
		return _dataTypes.get(dbType);
	}

	public static Class<?> getJavaClass(String dbType) {
		return _javaClasses.get(dbType);
	}

	public static String getSQLColumnNull(String dbType) {
		if (dbType.equals("BigDecimal") || dbType.equals("Double") ||
			dbType.equals("Integer") || dbType.equals("Long")) {

			return " default 0";
		}
		else if (dbType.equals("Boolean")) {
			return " default FALSE";
		}
		else if (dbType.equals("Date") || dbType.equals("DateTime")) {
			return " null";
		}

		return StringPool.BLANK;
	}

	public static Integer getSQLType(String dbType) {
		return _sqlTypes.get(dbType);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		DynamicObjectDefinitionTableUtil.class);

	private static final Map<String, String> _dataTypes = HashMapBuilder.put(
		"BigDecimal", "BIGDECIMAL"
	).put(
		"Blob", "BLOB"
	).put(
		"Boolean", "BOOLEAN"
	).put(
		"Clob", "TEXT"
	).put(
		"Date", "DATE"
	).put(
		"DateTime", "DATE"
	).put(
		"Double", "DOUBLE"
	).put(
		"Integer", "INTEGER"
	).put(
		"Long", "LONG"
	).put(
		"String", "VARCHAR(280)"
	).build();
	private static final Map<String, Class<?>> _javaClasses =
		HashMapBuilder.<String, Class<?>>put(
			"BigDecimal", BigDecimal.class
		).put(
			"Blob", Blob.class
		).put(
			"Boolean", Boolean.class
		).put(
			"Clob", String.class
		).put(
			"Date", Date.class
		).put(
			"DateTime", Timestamp.class
		).put(
			"Double", Double.class
		).put(
			"Integer", Integer.class
		).put(
			"Long", Long.class
		).put(
			"String", String.class
		).build();
	private static final Map<String, Integer> _sqlTypes = HashMapBuilder.put(
		"BigDecimal", Types.DECIMAL
	).put(
		"Blob", Types.BLOB
	).put(
		"Boolean", Types.BOOLEAN
	).put(
		"Clob", Types.CLOB
	).put(
		"Date", Types.DATE
	).put(
		"DateTime", Types.TIMESTAMP
	).put(
		"Double", Types.DOUBLE
	).put(
		"Integer", Types.INTEGER
	).put(
		"Long", Types.BIGINT
	).put(
		"String", Types.VARCHAR
	).build();

}