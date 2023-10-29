/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.change.tracking.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;CTCollectionTemplate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CTCollectionTemplate
 * @generated
 */
public class CTCollectionTemplateTable
	extends BaseTable<CTCollectionTemplateTable> {

	public static final CTCollectionTemplateTable INSTANCE =
		new CTCollectionTemplateTable();

	public final Column<CTCollectionTemplateTable, Long> mvccVersion =
		createColumn(
			"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<CTCollectionTemplateTable, Long>
		ctCollectionTemplateId = createColumn(
			"ctCollectionTemplateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CTCollectionTemplateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CTCollectionTemplateTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CTCollectionTemplateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CTCollectionTemplateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CTCollectionTemplateTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CTCollectionTemplateTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private CTCollectionTemplateTable() {
		super("CTCollectionTemplate", CTCollectionTemplateTable::new);
	}

}