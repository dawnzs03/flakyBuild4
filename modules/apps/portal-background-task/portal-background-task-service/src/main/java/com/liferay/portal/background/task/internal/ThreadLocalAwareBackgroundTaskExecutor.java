/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.background.task.internal;

import com.liferay.portal.kernel.backgroundtask.BackgroundTask;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskExecutor;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskResult;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskThreadLocalManager;
import com.liferay.portal.kernel.backgroundtask.DelegatingBackgroundTaskExecutor;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.Serializable;

import java.util.Map;

/**
 * @author Michael C. Han
 */
public class ThreadLocalAwareBackgroundTaskExecutor
	extends DelegatingBackgroundTaskExecutor {

	public ThreadLocalAwareBackgroundTaskExecutor(
		BackgroundTaskExecutor backgroundTaskExecutor,
		BackgroundTaskThreadLocalManager backgroundTaskThreadLocalManager) {

		super(backgroundTaskExecutor);

		_backgroundTaskThreadLocalManager = backgroundTaskThreadLocalManager;
	}

	@Override
	public BackgroundTaskExecutor clone() {
		return new ThreadLocalAwareBackgroundTaskExecutor(
			getBackgroundTaskExecutor(), _backgroundTaskThreadLocalManager);
	}

	@Override
	public BackgroundTaskResult execute(BackgroundTask backgroundTask)
		throws Exception {

		Map<String, Serializable> threadLocalValues =
			_backgroundTaskThreadLocalManager.getThreadLocalValues();

		try {
			try {
				_backgroundTaskThreadLocalManager.deserializeThreadLocals(
					backgroundTask.getTaskContextMap());
			}
			catch (StaleBackgroundTaskException staleBackgroundTaskException) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Skipped stale background task " + backgroundTask,
						staleBackgroundTaskException);
				}

				return BackgroundTaskResult.SUCCESS;
			}

			return super.execute(backgroundTask);
		}
		finally {
			_backgroundTaskThreadLocalManager.setThreadLocalValues(
				threadLocalValues);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ThreadLocalAwareBackgroundTaskExecutor.class);

	private final BackgroundTaskThreadLocalManager
		_backgroundTaskThreadLocalManager;

}