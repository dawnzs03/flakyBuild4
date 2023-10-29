/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.xml;

/**
 * @author Jorge Díaz
 */
public class DocumentFactory extends org.dom4j.DocumentFactory {

	public static DocumentFactory getInstance() {
		return _documentFactory;
	}

	@Override
	protected QNameCache createQNameCache() {
		return new QNameCache(this);
	}

	private static final DocumentFactory _documentFactory =
		new DocumentFactory();

}