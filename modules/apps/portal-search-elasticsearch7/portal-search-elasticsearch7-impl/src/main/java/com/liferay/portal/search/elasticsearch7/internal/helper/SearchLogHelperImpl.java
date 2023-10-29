/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.elasticsearch7.internal.helper;

import com.liferay.petra.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.search.elasticsearch7.configuration.RESTClientLoggerLevel;

import java.io.IOException;

import org.elasticsearch.action.ActionResponse;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.common.io.stream.OutputStreamStreamOutput;

/**
 * @author Adam Brandizzi
 */
public class SearchLogHelperImpl implements SearchLogHelper {

	@Override
	public void logActionResponse(Log log, ActionResponse actionResponse) {
		if (!log.isInfoEnabled()) {
			return;
		}

		UnsyncByteArrayOutputStream unsyncByteArrayOutputStream =
			new UnsyncByteArrayOutputStream();

		try {
			actionResponse.writeTo(
				new OutputStreamStreamOutput(unsyncByteArrayOutputStream));
		}
		catch (IOException ioException) {
			throw new RuntimeException(ioException);
		}

		String string = unsyncByteArrayOutputStream.toString();

		log.info(string.trim());
	}

	@Override
	public void logActionResponse(Log log, BulkResponse bulkResponse) {
		if (bulkResponse.hasFailures()) {
			log.error(bulkResponse.buildFailureMessage());
		}

		logActionResponse(log, (ActionResponse)bulkResponse);
	}

	@Override
	public void setRESTClientLoggerLevel(
		RESTClientLoggerLevel restClientLoggerLevel) {
	}

}