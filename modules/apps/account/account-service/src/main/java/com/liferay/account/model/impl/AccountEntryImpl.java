/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.account.model.impl;

import com.liferay.account.constants.AccountConstants;
import com.liferay.account.model.AccountEntry;
import com.liferay.account.model.AccountEntryOrganizationRel;
import com.liferay.account.model.AccountEntryUserRel;
import com.liferay.account.service.AccountEntryOrganizationRelLocalServiceUtil;
import com.liferay.account.service.AccountEntryUserRelLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.AddressLocalServiceUtil;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class AccountEntryImpl extends AccountEntryBaseImpl {

	@Override
	public List<Organization> fetchOrganizations() {
		List<Organization> organizations = new ArrayList<>();

		for (AccountEntryOrganizationRel accountEntryOrganizationRel :
				AccountEntryOrganizationRelLocalServiceUtil.
					getAccountEntryOrganizationRels(getAccountEntryId())) {

			try {
				organizations.add(
					accountEntryOrganizationRel.getOrganization());
			}
			catch (PortalException portalException) {
				_log.error(portalException);
			}
		}

		return organizations;
	}

	@Override
	public List<User> fetchUsers() {
		List<User> users = new ArrayList<>();

		for (AccountEntryUserRel accountEntryUserRel :
				AccountEntryUserRelLocalServiceUtil.
					getAccountEntryUserRelsByAccountEntryId(
						getAccountEntryId())) {

			try {
				users.add(accountEntryUserRel.getUser());
			}
			catch (PortalException portalException) {
				_log.error(portalException);
			}
		}

		return users;
	}

	@Override
	public Group getAccountEntryGroup() {
		return _getAccountEntryGroup();
	}

	@Override
	public long getAccountEntryGroupId() {
		Group group = _getAccountEntryGroup();

		if (group == null) {
			return GroupConstants.DEFAULT_LIVE_GROUP_ID;
		}

		return group.getGroupId();
	}

	@Override
	public Address getDefaultBillingAddress() {
		return AddressLocalServiceUtil.fetchAddress(
			getDefaultBillingAddressId());
	}

	@Override
	public Address getDefaultShippingAddress() {
		return AddressLocalServiceUtil.fetchAddress(
			getDefaultShippingAddressId());
	}

	@Override
	public String[] getDomainsArray() {
		return StringUtil.split(getDomains());
	}

	@Override
	public boolean isBusinessAccount() {
		if (StringUtil.equals(
				getType(), AccountConstants.ACCOUNT_ENTRY_TYPE_BUSINESS)) {

			return true;
		}

		return false;
	}

	@Override
	public boolean isGuestAccount() {
		if (StringUtil.equals(
				getType(), AccountConstants.ACCOUNT_ENTRY_TYPE_GUEST)) {

			return true;
		}

		return false;
	}

	@Override
	public boolean isPersonalAccount() {
		if (StringUtil.equals(
				getType(), AccountConstants.ACCOUNT_ENTRY_TYPE_PERSON)) {

			return true;
		}

		return false;
	}

	private Group _getAccountEntryGroup() {
		return GroupLocalServiceUtil.fetchGroup(
			getCompanyId(),
			ClassNameLocalServiceUtil.getClassNameId(AccountEntry.class),
			getAccountEntryId());
	}

	private static final Log _log = LogFactoryUtil.getLog(
		AccountEntryImpl.class);

}