/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.elasticsearch7.internal.search.engine.adapter.ccr;

import com.liferay.portal.search.engine.adapter.ccr.CCRRequestExecutor;
import com.liferay.portal.search.engine.adapter.ccr.FollowInfoCCRRequest;
import com.liferay.portal.search.engine.adapter.ccr.FollowInfoCCRResponse;
import com.liferay.portal.search.engine.adapter.ccr.PauseFollowCCRRequest;
import com.liferay.portal.search.engine.adapter.ccr.PauseFollowCCRResponse;
import com.liferay.portal.search.engine.adapter.ccr.PutFollowCCRRequest;
import com.liferay.portal.search.engine.adapter.ccr.PutFollowCCRResponse;
import com.liferay.portal.search.engine.adapter.ccr.UnfollowCCRRequest;
import com.liferay.portal.search.engine.adapter.ccr.UnfollowCCRResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Bryan Engler
 */
@Component(
	property = "search.engine.impl=Elasticsearch",
	service = CCRRequestExecutor.class
)
public class ElasticsearchCCRRequestExecutor implements CCRRequestExecutor {

	@Override
	public FollowInfoCCRResponse executeCCRRequest(
		FollowInfoCCRRequest followInfoCCRRequest) {

		return _followInfoCCRRequestExecutor.execute(followInfoCCRRequest);
	}

	@Override
	public PauseFollowCCRResponse executeCCRRequest(
		PauseFollowCCRRequest pauseFollowCCRRequest) {

		return _pauseFollowCCRRequestExecutor.execute(pauseFollowCCRRequest);
	}

	@Override
	public PutFollowCCRResponse executeCCRRequest(
		PutFollowCCRRequest putFollowCCRRequest) {

		return _putFollowCCRRequestExecutor.execute(putFollowCCRRequest);
	}

	@Override
	public UnfollowCCRResponse executeCCRRequest(
		UnfollowCCRRequest unfollowCCRRequest) {

		return _unfollowCCRRequestExecutor.execute(unfollowCCRRequest);
	}

	@Reference
	private FollowInfoCCRRequestExecutor _followInfoCCRRequestExecutor;

	@Reference
	private PauseFollowCCRRequestExecutor _pauseFollowCCRRequestExecutor;

	@Reference
	private PutFollowCCRRequestExecutor _putFollowCCRRequestExecutor;

	@Reference
	private UnfollowCCRRequestExecutor _unfollowCCRRequestExecutor;

}