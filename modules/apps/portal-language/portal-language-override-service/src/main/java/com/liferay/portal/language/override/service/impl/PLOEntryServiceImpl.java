/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.language.override.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.permission.PortalPermission;
import com.liferay.portal.language.override.constants.PLOActionKeys;
import com.liferay.portal.language.override.model.PLOEntry;
import com.liferay.portal.language.override.service.base.PLOEntryServiceBaseImpl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=portallanguageoverride",
		"json.web.service.context.path=PLOEntry"
	},
	service = AopService.class
)
public class PLOEntryServiceImpl extends PLOEntryServiceBaseImpl {

	@Override
	public PLOEntry addOrUpdatePLOEntry(
			String key, String languageId, String value)
		throws PortalException {

		PermissionChecker permissionChecker = getPermissionChecker();

		_portalPermission.check(
			permissionChecker, PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		return ploEntryLocalService.addOrUpdatePLOEntry(
			permissionChecker.getCompanyId(), permissionChecker.getUserId(),
			key, languageId, value);
	}

	@Override
	public void deletePLOEntries(String key) throws PortalException {
		PermissionChecker permissionChecker = getPermissionChecker();

		_portalPermission.check(
			permissionChecker, PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		ploEntryLocalService.deletePLOEntries(
			permissionChecker.getCompanyId(), key);
	}

	@Override
	public PLOEntry deletePLOEntry(String key, String languageId)
		throws PortalException {

		PermissionChecker permissionChecker = getPermissionChecker();

		_portalPermission.check(
			permissionChecker, PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		return ploEntryLocalService.deletePLOEntry(
			permissionChecker.getCompanyId(), key, languageId);
	}

	@Override
	public List<PLOEntry> getPLOEntries(long companyId) throws PortalException {
		_portalPermission.check(
			getPermissionChecker(), PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		return ploEntryLocalService.getPLOEntries(companyId);
	}

	@Override
	public int getPLOEntriesCount(long companyId) throws PortalException {
		_portalPermission.check(
			getPermissionChecker(), PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		return ploEntryLocalService.getPLOEntriesCount(companyId);
	}

	@Override
	public void setPLOEntries(String key, Map<Locale, String> localizationMap)
		throws PortalException {

		PermissionChecker permissionChecker = getPermissionChecker();

		_portalPermission.check(
			permissionChecker, PLOActionKeys.MANAGE_LANGUAGE_OVERRIDES);

		ploEntryLocalService.setPLOEntries(
			permissionChecker.getCompanyId(), permissionChecker.getUserId(),
			key, localizationMap);
	}

	@Reference
	private PortalPermission _portalPermission;

}