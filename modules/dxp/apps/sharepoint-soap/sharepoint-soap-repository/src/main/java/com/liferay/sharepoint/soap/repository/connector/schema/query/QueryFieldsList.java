/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.sharepoint.soap.repository.connector.schema.query;

import com.liferay.portal.kernel.xml.simple.Element;
import com.liferay.sharepoint.soap.repository.connector.schema.BaseNode;

/**
 * @author Iván Zaera
 */
public class QueryFieldsList extends BaseNode {

	public QueryFieldsList(QueryField... queryFields) {
		if (queryFields == null) {
			_queryFields = _EMPTY_QUERY_FIELDS;
		}
		else {
			_queryFields = queryFields;
		}
	}

	@Override
	protected String getNodeName() {
		return "ViewFields";
	}

	@Override
	protected void populate(Element element) {
		super.populate(element);

		for (QueryField queryField : _queryFields) {
			queryField.attach(element);
		}
	}

	private static final QueryField[] _EMPTY_QUERY_FIELDS = new QueryField[0];

	private final QueryField[] _queryFields;

}