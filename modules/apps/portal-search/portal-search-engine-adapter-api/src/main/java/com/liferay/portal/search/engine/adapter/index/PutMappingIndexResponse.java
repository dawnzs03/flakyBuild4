/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.engine.adapter.index;

/**
 * @author Dylan Rebelak
 */
public class PutMappingIndexResponse implements IndexResponse {

	public PutMappingIndexResponse(Boolean acknowledged) {
		_acknowledged = acknowledged;
	}

	public boolean isAcknowledged() {
		return _acknowledged;
	}

	private final boolean _acknowledged;

}