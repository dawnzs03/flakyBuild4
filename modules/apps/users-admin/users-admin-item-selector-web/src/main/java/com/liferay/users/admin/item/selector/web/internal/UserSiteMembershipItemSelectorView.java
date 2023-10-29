/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.users.admin.item.selector.web.internal;

import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.ItemSelectorView;
import com.liferay.item.selector.ItemSelectorViewDescriptorRenderer;
import com.liferay.item.selector.criteria.UUIDItemSelectorReturnType;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.users.admin.item.selector.UserSiteMembershipItemSelectorCriterion;
import com.liferay.users.admin.item.selector.web.internal.display.context.UserSiteMembershipItemSelectorViewDisplayContext;

import java.io.IOException;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(service = ItemSelectorView.class)
public class UserSiteMembershipItemSelectorView
	implements ItemSelectorView<UserSiteMembershipItemSelectorCriterion> {

	@Override
	public Class<UserSiteMembershipItemSelectorCriterion>
		getItemSelectorCriterionClass() {

		return UserSiteMembershipItemSelectorCriterion.class;
	}

	@Override
	public List<ItemSelectorReturnType> getSupportedItemSelectorReturnTypes() {
		return _supportedItemSelectorReturnTypes;
	}

	@Override
	public String getTitle(Locale locale) {
		return _language.get(locale, "users");
	}

	@Override
	public void renderHTML(
			ServletRequest servletRequest, ServletResponse servletResponse,
			UserSiteMembershipItemSelectorCriterion
				userSiteMembershipItemSelectorCriterion,
			PortletURL portletURL, String itemSelectedEventName, boolean search)
		throws IOException, ServletException {

		HttpServletRequest httpServletRequest =
			(HttpServletRequest)servletRequest;

		RenderRequest renderRequest =
			(RenderRequest)httpServletRequest.getAttribute(
				JavaConstants.JAVAX_PORTLET_REQUEST);
		RenderResponse renderResponse =
			(RenderResponse)httpServletRequest.getAttribute(
				JavaConstants.JAVAX_PORTLET_RESPONSE);

		UserSiteMembershipItemSelectorViewDisplayContext
			userSiteMembershipItemSelectorViewDisplayContext =
				new UserSiteMembershipItemSelectorViewDisplayContext(
					httpServletRequest, portletURL, renderRequest,
					renderResponse, userSiteMembershipItemSelectorCriterion);

		_itemSelectorViewDescriptorRenderer.renderHTML(
			httpServletRequest, servletResponse,
			userSiteMembershipItemSelectorCriterion, portletURL,
			itemSelectedEventName, search,
			new UserItemSelectorViewDescriptor(
				httpServletRequest, true,
				userSiteMembershipItemSelectorViewDisplayContext.
					getUserSearchContainer()));
	}

	private static final List<ItemSelectorReturnType>
		_supportedItemSelectorReturnTypes = Collections.singletonList(
			new UUIDItemSelectorReturnType());

	@Reference
	private ItemSelectorViewDescriptorRenderer
		<UserSiteMembershipItemSelectorCriterion>
			_itemSelectorViewDescriptorRenderer;

	@Reference
	private Language _language;

}