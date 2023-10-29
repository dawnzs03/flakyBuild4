/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.info.collection.provider.item.selector.web.internal.item.selector;

import com.liferay.info.collection.provider.InfoCollectionProvider;
import com.liferay.info.item.InfoItemServiceRegistry;
import com.liferay.info.list.provider.item.selector.criterion.InfoListProviderItemSelectorReturnType;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eudaldo Alonso
 */
public class InfoCollectionProviderItemSelectorViewDescriptor
	extends BaseItemSelectorViewDescriptor<InfoCollectionProvider<?>> {

	public InfoCollectionProviderItemSelectorViewDescriptor(
		HttpServletRequest httpServletRequest, PortletURL portletURL,
		List<InfoCollectionProvider<?>> infoCollectionProviders,
		InfoItemServiceRegistry infoItemServiceRegistry) {

		super(httpServletRequest, portletURL, infoCollectionProviders);

		_infoItemServiceRegistry = infoItemServiceRegistry;
	}

	@Override
	public ItemDescriptor getItemDescriptor(
		InfoCollectionProvider<?> infoCollectionProvider) {

		return new InfoCollectionProviderItemDescriptor(
			httpServletRequest, infoCollectionProvider,
			_infoItemServiceRegistry);
	}

	@Override
	public ItemSelectorReturnType getItemSelectorReturnType() {
		return new InfoListProviderItemSelectorReturnType();
	}

	public SearchContainer<InfoCollectionProvider<?>> getSearchContainer() {
		PortletRequest portletRequest =
			(PortletRequest)httpServletRequest.getAttribute(
				JavaConstants.JAVAX_PORTLET_REQUEST);

		SearchContainer<InfoCollectionProvider<?>> searchContainer =
			new SearchContainer<>(
				portletRequest, portletURL, null,
				"there-are-no-info-collection-providers");

		List<InfoCollectionProvider<?>> infoCollectionProviderList =
			new ArrayList<>(infoCollectionProviders);

		String itemType = ParamUtil.getString(httpServletRequest, "itemType");

		if (Validator.isNotNull(itemType)) {
			infoCollectionProviderList = ListUtil.filter(
				infoCollectionProviderList,
				infoCollectionProvider -> Objects.equals(
					infoCollectionProvider.getCollectionItemClassName(),
					itemType));
		}

		String keywords = ParamUtil.getString(httpServletRequest, "keywords");

		if (Validator.isNotNull(keywords)) {
			infoCollectionProviderList = ListUtil.filter(
				infoCollectionProviderList,
				infoCollectionProvider -> {
					String label = StringUtil.toLowerCase(
						infoCollectionProvider.getLabel(
							themeDisplay.getLocale()));

					return label.contains(StringUtil.toLowerCase(keywords));
				});
		}

		searchContainer.setResultsAndTotal(infoCollectionProviderList);

		return searchContainer;
	}

	private final InfoItemServiceRegistry _infoItemServiceRegistry;

}