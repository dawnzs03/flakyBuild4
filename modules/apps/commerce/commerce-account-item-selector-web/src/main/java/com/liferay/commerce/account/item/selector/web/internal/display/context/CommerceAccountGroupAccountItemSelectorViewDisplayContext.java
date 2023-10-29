/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.account.item.selector.web.internal.display.context;

import com.liferay.account.constants.AccountConstants;
import com.liferay.account.model.AccountEntry;
import com.liferay.account.model.AccountGroup;
import com.liferay.account.service.AccountEntryLocalService;
import com.liferay.account.service.AccountGroupRelLocalService;
import com.liferay.account.service.AccountGroupService;
import com.liferay.commerce.account.item.selector.web.internal.display.context.helper.CommerceAccountItemSelectorRequestHelper;
import com.liferay.commerce.account.item.selector.web.internal.search.CommerceAccountGroupAccountItemSelectorChecker;
import com.liferay.commerce.product.constants.CommerceChannelConstants;
import com.liferay.commerce.util.CommerceAccountHelper;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alessio Antonio Rendina
 */
public class CommerceAccountGroupAccountItemSelectorViewDisplayContext {

	public CommerceAccountGroupAccountItemSelectorViewDisplayContext(
		AccountGroupRelLocalService accountGroupRelLocalService,
		AccountGroupService accountGroupService,
		AccountEntryLocalService accountEntryLocalService,
		CommerceAccountHelper commerceAccountHelper,
		HttpServletRequest httpServletRequest, PortletURL portletURL,
		String itemSelectedEventName) {

		_accountGroupRelLocalService = accountGroupRelLocalService;
		_accountGroupService = accountGroupService;
		_accountEntryLocalService = accountEntryLocalService;
		_commerceAccountHelper = commerceAccountHelper;
		_itemSelectedEventName = itemSelectedEventName;

		_commerceAccountItemSelectorRequestHelper =
			new CommerceAccountItemSelectorRequestHelper(httpServletRequest);

		_portletURL = PortletURLBuilder.create(
			portletURL
		).setParameter(
			"commerceAccountGroupId",
			ParamUtil.getString(
				_commerceAccountItemSelectorRequestHelper.getRenderRequest(),
				"commerceAccountGroupId")
		).buildPortletURL();
	}

	public String getItemSelectedEventName() {
		return _itemSelectedEventName;
	}

	public String getOrderByCol() {
		return ParamUtil.getString(
			_commerceAccountItemSelectorRequestHelper.getRenderRequest(),
			SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, "createDate_sortable");
	}

	public String getOrderByType() {
		return ParamUtil.getString(
			_commerceAccountItemSelectorRequestHelper.getRenderRequest(),
			SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, "desc");
	}

	public PortletURL getPortletURL() {
		return _portletURL;
	}

	public SearchContainer<AccountEntry> getSearchContainer()
		throws PortalException {

		if (_searchContainer != null) {
			return _searchContainer;
		}

		_searchContainer = new SearchContainer<>(
			_commerceAccountItemSelectorRequestHelper.
				getLiferayPortletRequest(),
			getPortletURL(), null, "there-are-no-accounts");

		_searchContainer.setOrderByCol(getOrderByCol());
		_searchContainer.setOrderByType(getOrderByType());
		_searchContainer.setResultsAndTotal(
			() -> _accountEntryLocalService.getUserAccountEntries(
				_commerceAccountItemSelectorRequestHelper.getUserId(),
				AccountConstants.PARENT_ACCOUNT_ENTRY_ID_DEFAULT, getKeywords(),
				_commerceAccountHelper.toAccountEntryTypes(
					CommerceChannelConstants.SITE_TYPE_B2X),
				_searchContainer.getStart(), _searchContainer.getEnd()),
			_accountEntryLocalService.getUserAccountEntriesCount(
				_commerceAccountItemSelectorRequestHelper.getUserId(),
				AccountConstants.PARENT_ACCOUNT_ENTRY_ID_DEFAULT, getKeywords(),
				_commerceAccountHelper.toAccountEntryTypes(
					CommerceChannelConstants.SITE_TYPE_B2X),
				null));
		_searchContainer.setRowChecker(
			new CommerceAccountGroupAccountItemSelectorChecker(
				_commerceAccountItemSelectorRequestHelper.getRenderResponse(),
				_getAccountGroup(), _accountGroupRelLocalService));

		return _searchContainer;
	}

	protected String getKeywords() {
		if (_keywords != null) {
			return _keywords;
		}

		_keywords = ParamUtil.getString(
			_commerceAccountItemSelectorRequestHelper.getRenderRequest(),
			"keywords");

		return _keywords;
	}

	private AccountGroup _getAccountGroup() throws PortalException {
		long accountGroupId = ParamUtil.getLong(
			_commerceAccountItemSelectorRequestHelper.getRenderRequest(),
			"commerceAccountGroupId");

		if (accountGroupId > 0) {
			return _accountGroupService.getAccountGroup(accountGroupId);
		}

		return null;
	}

	private final AccountEntryLocalService _accountEntryLocalService;
	private final AccountGroupRelLocalService _accountGroupRelLocalService;
	private final AccountGroupService _accountGroupService;
	private final CommerceAccountHelper _commerceAccountHelper;
	private final CommerceAccountItemSelectorRequestHelper
		_commerceAccountItemSelectorRequestHelper;
	private final String _itemSelectedEventName;
	private String _keywords;
	private final PortletURL _portletURL;
	private SearchContainer<AccountEntry> _searchContainer;

}