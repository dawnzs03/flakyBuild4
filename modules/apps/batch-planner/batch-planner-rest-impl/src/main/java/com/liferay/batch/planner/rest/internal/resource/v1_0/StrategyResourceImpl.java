/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.planner.rest.internal.resource.v1_0;

import com.liferay.batch.engine.BatchEngineTaskItemDelegate;
import com.liferay.batch.engine.BatchEngineTaskItemDelegateRegistry;
import com.liferay.batch.planner.batch.engine.task.TaskItemUtil;
import com.liferay.batch.planner.rest.dto.v1_0.Strategy;
import com.liferay.batch.planner.rest.resource.v1_0.StrategyResource;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Matija Petanjek
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/strategy.properties",
	scope = ServiceScope.PROTOTYPE, service = StrategyResource.class
)
public class StrategyResourceImpl extends BaseStrategyResourceImpl {

	@Override
	public Page<Strategy> getPlanInternalClassNameKeyStrategiesPage(
			String internalClassNameKey)
		throws Exception {

		List<Strategy> strategies = new ArrayList<>();

		BatchEngineTaskItemDelegate<?> batchEngineTaskItemDelegate =
			_batchEngineTaskItemDelegateRegistry.getBatchEngineTaskItemDelegate(
				TaskItemUtil.getInternalClassName(internalClassNameKey),
				TaskItemUtil.getTaskItemDelegateName(internalClassNameKey));

		for (String createStrategy :
				batchEngineTaskItemDelegate.getAvailableCreateStrategies()) {

			strategies.add(
				new Strategy() {
					{
						name = createStrategy;
						type = "create";
					}
				});
		}

		for (String updateStrategy :
				batchEngineTaskItemDelegate.getAvailableUpdateStrategies()) {

			strategies.add(
				new Strategy() {
					{
						name = updateStrategy;
						type = "update";
					}
				});
		}

		return Page.of(strategies);
	}

	@Reference
	private BatchEngineTaskItemDelegateRegistry
		_batchEngineTaskItemDelegateRegistry;

}