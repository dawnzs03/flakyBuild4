/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.solr8.internal.search.engine.adapter.index;

import com.liferay.portal.search.engine.adapter.index.PutMappingIndexRequest;
import com.liferay.portal.search.engine.adapter.index.PutMappingIndexResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Bryan Engler
 */
@Component(service = PutMappingIndexRequestExecutor.class)
public class PutMappingIndexRequestExecutorImpl
	implements PutMappingIndexRequestExecutor {

	@Override
	public PutMappingIndexResponse execute(
		PutMappingIndexRequest putMappingIndexRequest) {

		throw new UnsupportedOperationException();
	}

}