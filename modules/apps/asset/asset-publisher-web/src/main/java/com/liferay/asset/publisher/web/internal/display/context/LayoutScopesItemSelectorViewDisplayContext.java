/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.publisher.web.internal.display.context;

import com.liferay.asset.publisher.util.AssetPublisherHelper;
import com.liferay.item.selector.criteria.group.criterion.GroupItemSelectorCriterion;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.site.search.GroupSearch;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eudaldo Alonso
 */
public class LayoutScopesItemSelectorViewDisplayContext
	extends BaseItemSelectorViewDisplayContext {

	public LayoutScopesItemSelectorViewDisplayContext(
		HttpServletRequest httpServletRequest,
		AssetPublisherHelper assetPublisherHelper,
		GroupItemSelectorCriterion groupItemSelectorCriterion,
		PortletURL portletURL) {

		super(httpServletRequest, assetPublisherHelper, portletURL);

		_groupItemSelectorCriterion = groupItemSelectorCriterion;
	}

	@Override
	public long getGroupId() {
		long groupId = super.getGroupId();

		if (groupId <= 0) {
			ThemeDisplay themeDisplay =
				(ThemeDisplay)httpServletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			return themeDisplay.getScopeGroupId();
		}

		return groupId;
	}

	@Override
	public GroupSearch getGroupSearch() throws Exception {
		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		long groupId = getGroupId();

		GroupSearch groupSearch = new GroupSearch(
			getPortletRequest(), portletURL);

		groupSearch.setResultsAndTotal(
			() -> _filterLayoutGroups(
				GroupLocalServiceUtil.getGroups(
					themeDisplay.getCompanyId(), Layout.class.getName(),
					groupId, groupSearch.getStart(), groupSearch.getEnd()),
				_isPrivateLayout()),
			GroupLocalServiceUtil.getGroupsCount(
				themeDisplay.getCompanyId(), Layout.class.getName(), groupId));

		return groupSearch;
	}

	@Override
	public boolean isShowSearch() {
		return false;
	}

	private List<Group> _filterLayoutGroups(
			List<Group> groups, Boolean privateLayout)
		throws Exception {

		if (privateLayout == null) {
			return groups;
		}

		List<Group> filteredGroups = new ArrayList<>();

		for (Group group : groups) {
			if (!group.isLayout()) {
				continue;
			}

			Layout layout = LayoutLocalServiceUtil.getLayout(
				group.getClassPK());

			if (layout.isPrivateLayout() == privateLayout) {
				filteredGroups.add(group);
			}
		}

		return filteredGroups;
	}

	private Boolean _isPrivateLayout() {
		if (_privateLayout != null) {
			return _privateLayout;
		}

		_privateLayout = _groupItemSelectorCriterion.isPrivateLayout();

		return _privateLayout;
	}

	private final GroupItemSelectorCriterion _groupItemSelectorCriterion;
	private Boolean _privateLayout;

}