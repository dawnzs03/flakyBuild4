/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.internal.messaging;

import com.liferay.dispatch.constants.DispatchConstants;
import com.liferay.dispatch.exception.DispatchTriggerSchedulerException;
import com.liferay.dispatch.executor.DispatchTaskClusterMode;
import com.liferay.dispatch.internal.helper.DispatchTriggerHelper;
import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.dispatch.service.DispatchTriggerLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationConfiguration;
import com.liferay.portal.kernel.messaging.DestinationFactory;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;

import java.util.Dictionary;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Matija Petanjek
 */
@Component(service = {})
public class DispatchConfigurator {

	@Activate
	protected void activate(BundleContext bundleContext) {
		DestinationConfiguration destinationConfiguration =
			new DestinationConfiguration(
				DestinationConfiguration.DESTINATION_TYPE_PARALLEL,
				DispatchConstants.EXECUTOR_DESTINATION_NAME);

		destinationConfiguration.setMaximumQueueSize(_MAXIMUM_QUEUE_SIZE);

		RejectedExecutionHandler rejectedExecutionHandler =
			new ThreadPoolExecutor.CallerRunsPolicy() {

				@Override
				public void rejectedExecution(
					Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {

					if (_log.isWarnEnabled()) {
						_log.warn(
							"The current thread will handle the request " +
								"because the graph walker's task queue is at " +
									"its maximum capacity");
					}

					super.rejectedExecution(runnable, threadPoolExecutor);
				}

			};

		destinationConfiguration.setRejectedExecutionHandler(
			rejectedExecutionHandler);

		Destination destination = _destinationFactory.createDestination(
			destinationConfiguration);

		Dictionary<String, Object> properties =
			HashMapDictionaryBuilder.<String, Object>put(
				"destination.name", destination.getName()
			).build();

		_serviceRegistration = bundleContext.registerService(
			Destination.class, destination, properties);

		DispatchTaskClusterMode dispatchTaskClusterMode =
			DispatchTaskClusterMode.ALL_NODES;

		for (DispatchTrigger dispatchTrigger :
				_dispatchTriggerLocalService.getDispatchTriggers(
					true, dispatchTaskClusterMode)) {

			try {
				_dispatchTriggerHelper.addSchedulerJob(
					dispatchTrigger.getDispatchTriggerId(),
					dispatchTrigger.getCronExpression(),
					dispatchTrigger.getStartDate(),
					dispatchTrigger.getEndDate(),
					dispatchTaskClusterMode.getStorageType(),
					dispatchTrigger.getTimeZoneId());
			}
			catch (DispatchTriggerSchedulerException
						dispatchTriggerSchedulerException) {

				_log.error(dispatchTriggerSchedulerException);
			}
		}
	}

	@Deactivate
	protected void deactivate() {
		DispatchTaskClusterMode dispatchTaskClusterMode =
			DispatchTaskClusterMode.ALL_NODES;

		for (DispatchTrigger dispatchTrigger :
				_dispatchTriggerLocalService.getDispatchTriggers(
					true, dispatchTaskClusterMode)) {

			_dispatchTriggerHelper.deleteSchedulerJob(
				dispatchTrigger.getDispatchTriggerId(),
				dispatchTaskClusterMode.getStorageType());
		}

		_serviceRegistration.unregister();
	}

	private static final int _MAXIMUM_QUEUE_SIZE = 100;

	private static final Log _log = LogFactoryUtil.getLog(
		DispatchConfigurator.class);

	@Reference
	private DestinationFactory _destinationFactory;

	@Reference
	private DispatchTriggerHelper _dispatchTriggerHelper;

	@Reference
	private DispatchTriggerLocalService _dispatchTriggerLocalService;

	private ServiceRegistration<Destination> _serviceRegistration;

}