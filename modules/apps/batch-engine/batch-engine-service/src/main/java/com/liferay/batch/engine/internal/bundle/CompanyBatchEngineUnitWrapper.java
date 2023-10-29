/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.batch.engine.internal.bundle;

import com.liferay.batch.engine.unit.BatchEngineUnit;
import com.liferay.batch.engine.unit.BatchEngineUnitConfiguration;
import com.liferay.portal.kernel.model.Company;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alejandro Tardín
 */
public class CompanyBatchEngineUnitWrapper implements BatchEngineUnit {

	public CompanyBatchEngineUnitWrapper(
		BatchEngineUnit batchEngineUnit, Company company) {

		_batchEngineUnit = batchEngineUnit;
		_company = company;
	}

	@Override
	public BatchEngineUnitConfiguration getBatchEngineUnitConfiguration()
		throws IOException {

		BatchEngineUnitConfiguration batchEngineUnitConfiguration =
			_batchEngineUnit.getBatchEngineUnitConfiguration();

		return new BatchEngineUnitConfiguration() {
			{
				setCallbackURL(batchEngineUnitConfiguration.getCallbackURL());
				setClassName(batchEngineUnitConfiguration.getClassName());
				setCompanyId(_company.getCompanyId());
				setFieldNameMappingMap(
					batchEngineUnitConfiguration.getFieldNameMappingMap());
				setMultiCompany(batchEngineUnitConfiguration.isMultiCompany());
				setParameters(batchEngineUnitConfiguration.getParameters());
				setTaskItemDelegateName(
					batchEngineUnitConfiguration.getTaskItemDelegateName());
				setUserId(batchEngineUnitConfiguration.getUserId());
				setVersion(batchEngineUnitConfiguration.getVersion());
			}
		};
	}

	@Override
	public InputStream getConfigurationInputStream() throws IOException {
		return _batchEngineUnit.getConfigurationInputStream();
	}

	@Override
	public String getDataFileName() {
		return _batchEngineUnit.getDataFileName();
	}

	@Override
	public InputStream getDataInputStream() throws IOException {
		return _batchEngineUnit.getDataInputStream();
	}

	@Override
	public String getFileName() {
		return _batchEngineUnit.getFileName();
	}

	@Override
	public boolean isValid() {
		return _batchEngineUnit.isValid();
	}

	private final BatchEngineUnit _batchEngineUnit;
	private final Company _company;

}