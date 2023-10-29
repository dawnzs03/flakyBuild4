/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.lists.service.impl;

import com.liferay.dynamic.data.lists.exception.NoSuchRecordSetVersionException;
import com.liferay.dynamic.data.lists.model.DDLRecordSetVersion;
import com.liferay.dynamic.data.lists.service.base.DDLRecordSetVersionLocalServiceBaseImpl;
import com.liferay.dynamic.data.lists.util.comparator.DDLRecordSetVersionVersionComparator;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * Provides the local service for accessing, adding, deleting, and updating
 * dynamic data list (DDL) record set versions.
 *
 * @author Leonardo Barros
 */
@Component(
	property = "model.class.name=com.liferay.dynamic.data.lists.model.DDLRecordSetVersion",
	service = AopService.class
)
public class DDLRecordSetVersionLocalServiceImpl
	extends DDLRecordSetVersionLocalServiceBaseImpl {

	@Override
	public void deleteByRecordSetId(long recordSetId) {
		ddlRecordSetVersionPersistence.removeByRecordSetId(recordSetId);
	}

	@Override
	public DDLRecordSetVersion getLatestRecordSetVersion(long recordSetId)
		throws PortalException {

		List<DDLRecordSetVersion> recordSetVersions =
			ddlRecordSetVersionPersistence.findByRecordSetId(recordSetId);

		if (recordSetVersions.isEmpty()) {
			throw new NoSuchRecordSetVersionException(
				"No record set versions found for record set ID " +
					recordSetId);
		}

		recordSetVersions = ListUtil.copy(recordSetVersions);

		Collections.sort(
			recordSetVersions, new DDLRecordSetVersionVersionComparator());

		return recordSetVersions.get(0);
	}

	@Override
	public DDLRecordSetVersion getRecordSetVersion(long recordSetVersionId)
		throws PortalException {

		return ddlRecordSetVersionPersistence.findByPrimaryKey(
			recordSetVersionId);
	}

	@Override
	public DDLRecordSetVersion getRecordSetVersion(
			long recordSetId, String version)
		throws PortalException {

		return ddlRecordSetVersionPersistence.findByRS_V(recordSetId, version);
	}

	@Override
	public List<DDLRecordSetVersion> getRecordSetVersions(long recordSetId) {
		return ddlRecordSetVersionPersistence.findByRecordSetId(recordSetId);
	}

	@Override
	public List<DDLRecordSetVersion> getRecordSetVersions(
		long recordSetId, int start, int end,
		OrderByComparator<DDLRecordSetVersion> orderByComparator) {

		return ddlRecordSetVersionPersistence.findByRecordSetId(
			recordSetId, start, end, orderByComparator);
	}

	@Override
	public int getRecordSetVersionsCount(long recordSetId) {
		return ddlRecordSetVersionPersistence.countByRecordSetId(recordSetId);
	}

}