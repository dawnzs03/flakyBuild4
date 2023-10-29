/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.account.admin.web.internal.users.admin.management.toolbar;

import com.liferay.account.constants.AccountConstants;
import com.liferay.portal.kernel.language.Language;
import com.liferay.users.admin.constants.UsersAdminManagementToolbarKeys;
import com.liferay.users.admin.management.toolbar.FilterContributor;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Drew Brokke
 */
@Component(service = FilterContributor.class)
public class AccountUsersFilterContributor implements FilterContributor {

	@Override
	public String getDefaultValue() {
		return "all";
	}

	@Override
	public String getLabel(Locale locale) {
		return _getMessage(locale, "filter-by-domain");
	}

	@Override
	public String getManagementToolbarKey() {
		return UsersAdminManagementToolbarKeys.VIEW_FLAT_USERS;
	}

	@Override
	public String getParameter() {
		return "domain";
	}

	@Override
	public Map<String, Object> getSearchParameters(String currentValue) {
		Map<String, Object> params = new LinkedHashMap<>();

		if (currentValue.equals("company-users")) {
			params.put("accountEntryIds", new long[0]);
		}
		else if (currentValue.equals("account-users")) {
			params.put(
				"accountEntryIds",
				new long[] {AccountConstants.ACCOUNT_ENTRY_ID_ANY});
		}

		return params;
	}

	@Override
	public String getShortLabel(Locale locale) {
		return _getMessage(locale, "domain");
	}

	@Override
	public String getValueLabel(Locale locale, String value) {
		return _getMessage(locale, value);
	}

	@Override
	public String[] getValues() {
		return new String[] {"all", "company-users", "account-users"};
	}

	private String _getMessage(Locale locale, String key) {
		return _language.get(locale, key);
	}

	@Reference
	private Language _language;

}