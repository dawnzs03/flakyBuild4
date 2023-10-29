/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.registration.portlet;

import java.util.List;

import javax.xml.namespace.QName;

/**
 * @author Neil Griffin
 */
public class EventImpl implements Event {

	public EventImpl(List<QName> aliasQNames, QName qName, String valueType) {
		_aliasQNames = aliasQNames;
		_qName = qName;
		_valueType = valueType;
	}

	@Override
	public List<QName> getAliasQNames() {
		return _aliasQNames;
	}

	@Override
	public QName getQName() {
		return _qName;
	}

	@Override
	public String getValueType() {
		return _valueType;
	}

	private final List<QName> _aliasQNames;
	private final QName _qName;
	private final String _valueType;

}