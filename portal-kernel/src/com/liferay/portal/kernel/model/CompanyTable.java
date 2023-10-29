/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Company&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Company
 * @generated
 */
public class CompanyTable extends BaseTable<CompanyTable> {

	public static final CompanyTable INSTANCE = new CompanyTable();

	public final Column<CompanyTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<CompanyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CompanyTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> webId = createColumn(
		"webId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> mx = createColumn(
		"mx", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> homeURL = createColumn(
		"homeURL", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Long> logoId = createColumn(
		"logoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Integer> maxUsers = createColumn(
		"maxUsers", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, Boolean> active = createColumn(
		"active_", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> legalName = createColumn(
		"legalName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> legalId = createColumn(
		"legalId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> legalType = createColumn(
		"legalType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> sicCode = createColumn(
		"sicCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> tickerSymbol = createColumn(
		"tickerSymbol", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> industry = createColumn(
		"industry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> type = createColumn(
		"type_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> size = createColumn(
		"size_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> indexNameCurrent = createColumn(
		"indexNameCurrent", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CompanyTable, String> indexNameNext = createColumn(
		"indexNameNext", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CompanyTable() {
		super("Company", CompanyTable::new);
	}

}