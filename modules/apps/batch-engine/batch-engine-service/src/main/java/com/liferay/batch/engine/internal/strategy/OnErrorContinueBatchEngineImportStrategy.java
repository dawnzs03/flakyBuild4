/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.strategy;

import com.liferay.batch.engine.action.ImportTaskPostAction;
import com.liferay.batch.engine.action.ImportTaskPreAction;
import com.liferay.batch.engine.internal.util.ItemIndexThreadLocal;
import com.liferay.batch.engine.model.BatchEngineImportTask;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

/**
 * @author Matija Petanjek
 */
public class OnErrorContinueBatchEngineImportStrategy
	extends BaseBatchEngineImportStrategy {

	public OnErrorContinueBatchEngineImportStrategy(
		BatchEngineImportTask batchEngineImportTask,
		List<ImportTaskPostAction> importTaskPostActions,
		List<ImportTaskPreAction> importTaskPreActions) {

		super(
			batchEngineImportTask, importTaskPostActions, importTaskPreActions);
	}

	@Override
	public <T> T importItem(
		T item, UnsafeFunction<T, T, Exception> unsafeFunction) {

		T persistedItem = null;

		try {
			persistedItem = unsafeFunction.apply(item);
		}
		catch (Exception exception) {
			_log.error(exception);

			addBatchEngineImportTaskError(
				batchEngineImportTask.getCompanyId(),
				batchEngineImportTask.getUserId(),
				batchEngineImportTask.getBatchEngineImportTaskId(),
				item.toString(), ItemIndexThreadLocal.get(),
				exception.toString());
		}
		finally {
			ItemIndexThreadLocal.remove();
		}

		return persistedItem;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		OnErrorContinueBatchEngineImportStrategy.class);

}