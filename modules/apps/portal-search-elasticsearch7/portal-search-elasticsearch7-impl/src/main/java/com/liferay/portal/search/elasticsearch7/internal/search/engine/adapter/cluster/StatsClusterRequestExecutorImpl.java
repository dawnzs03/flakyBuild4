/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.elasticsearch7.internal.search.engine.adapter.cluster;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.search.elasticsearch7.internal.connection.ElasticsearchClientResolver;
import com.liferay.portal.search.engine.adapter.cluster.ClusterHealthStatus;
import com.liferay.portal.search.engine.adapter.cluster.StatsClusterRequest;
import com.liferay.portal.search.engine.adapter.cluster.StatsClusterResponse;

import org.apache.http.util.EntityUtils;

import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Dylan Rebelak
 */
@Component(service = StatsClusterRequestExecutor.class)
public class StatsClusterRequestExecutorImpl
	implements StatsClusterRequestExecutor {

	@Override
	public StatsClusterResponse execute(
		StatsClusterRequest statsClusterRequest) {

		RestHighLevelClient restHighLevelClient =
			_elasticsearchClientResolver.getRestHighLevelClient(
				statsClusterRequest.getConnectionId(),
				statsClusterRequest.isPreferLocalCluster());

		RestClient restClient = restHighLevelClient.getLowLevelClient();

		String nodeIds = StringPool.BLANK;

		if (ArrayUtil.isNotEmpty(statsClusterRequest.getNodeIds())) {
			nodeIds =
				"/nodes/" + StringUtil.merge(statsClusterRequest.getNodeIds());
		}

		String endpoint = "/_cluster/stats" + nodeIds;

		Request request = new Request("GET", endpoint);

		try {
			Response response = restClient.performRequest(request);

			String responseBody = EntityUtils.toString(response.getEntity());

			JSONObject responseJSONObject = _jsonFactory.createJSONObject(
				responseBody);

			String status = GetterUtil.getString(
				responseJSONObject.get("status"));

			ClusterHealthStatus clusterHealthStatus = null;

			if (!status.equals(StringPool.BLANK)) {
				clusterHealthStatus = _clusterHealthStatusTranslator.translate(
					status);
			}

			return new StatsClusterResponse(clusterHealthStatus, responseBody);
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	private ClusterHealthStatusTranslator _clusterHealthStatusTranslator;

	@Reference
	private ElasticsearchClientResolver _elasticsearchClientResolver;

	@Reference
	private JSONFactory _jsonFactory;

}