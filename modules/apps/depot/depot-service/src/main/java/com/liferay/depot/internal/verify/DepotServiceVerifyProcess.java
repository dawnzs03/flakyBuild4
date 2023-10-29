/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.depot.internal.verify;

import com.liferay.depot.internal.util.DepotRoleUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.verify.VerifyProcess;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Shuyang Zhou
 */
@Component(service = VerifyProcess.class)
public class DepotServiceVerifyProcess extends VerifyProcess {

	@Override
	protected void doVerify() throws Exception {
		_checkDepotRoleDescriptions();
	}

	private void _checkDepotRoleDescriptions() {
		_companyLocalService.forEachCompanyId(
			companyId -> {
				for (String name : DepotRoleUtil.DEPOT_ROLE_NAMES) {
					Role role = _roleLocalService.fetchRole(companyId, name);

					if (role != null) {
						Map<Locale, String> descriptionMap =
							DepotRoleUtil.getDescriptionMap(_language, name);

						if (!Objects.equals(
								descriptionMap, role.getDescriptionMap())) {

							role.setDescriptionMap(descriptionMap);

							_roleLocalService.updateRole(role);
						}
					}
				}
			});
	}

	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private Language _language;

	@Reference
	private RoleLocalService _roleLocalService;

}