/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.list.retriever;

import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author Eudaldo Alonso
 */
public class ClassedModelListObjectReference implements ListObjectReference {

	public ClassedModelListObjectReference(JSONObject jsonObject) {
		_classPK = jsonObject.getLong("classPK");
		_className = jsonObject.getString("className");
		_itemType = jsonObject.getString("itemType");
		_title = jsonObject.getString("title");
	}

	public String getClassName() {
		return _className;
	}

	public long getClassPK() {
		return _classPK;
	}

	@Override
	public String getItemType() {
		return _itemType;
	}

	public String getTitle() {
		return _title;
	}

	private final String _className;
	private final long _classPK;
	private final String _itemType;
	private final String _title;

}