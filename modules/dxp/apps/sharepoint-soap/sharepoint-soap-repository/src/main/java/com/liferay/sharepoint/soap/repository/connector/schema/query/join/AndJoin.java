/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sharepoint.soap.repository.connector.schema.query.join;

import com.liferay.sharepoint.soap.repository.connector.schema.query.QueryClause;

/**
 * @author Iván Zaera
 */
public class AndJoin extends BaseJoin {

	public AndJoin(QueryClause leftQueryClause, QueryClause rightQueryClause) {
		super(leftQueryClause, rightQueryClause);
	}

	@Override
	protected String getNodeName() {
		return "And";
	}

}