/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.admin.web.internal.change.tracking.spi.display;

import com.liferay.change.tracking.spi.display.BaseCTDisplayRenderer;
import com.liferay.change.tracking.spi.display.CTDisplayRenderer;
import com.liferay.layout.admin.constants.LayoutAdminPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.permission.GroupPermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Preston Crary
 */
@Component(service = CTDisplayRenderer.class)
public class LayoutSetCTDisplayRenderer
	extends BaseCTDisplayRenderer<LayoutSet> {

	@Override
	public String getEditURL(
			HttpServletRequest httpServletRequest, LayoutSet layoutSet)
		throws PortalException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		Group group = layoutSet.getGroup();

		if (!_groupPermission.contains(
				themeDisplay.getPermissionChecker(), group,
				ActionKeys.UPDATE)) {

			return null;
		}

		PortletURL portletURL = PortletURLBuilder.create(
			_portal.getControlPanelPortletURL(
				httpServletRequest, group, LayoutAdminPortletKeys.GROUP_PAGES,
				0, 0, PortletRequest.RENDER_PHASE)
		).setMVCRenderCommandName(
			"/layout_admin/edit_layout_set"
		).buildPortletURL();

		String currentURL = _portal.getCurrentURL(httpServletRequest);

		portletURL.setParameter("redirect", currentURL);
		portletURL.setParameter("backURL", currentURL);

		portletURL.setParameter(
			"groupId", String.valueOf(layoutSet.getGroupId()));
		portletURL.setParameter(
			"privateLayout", String.valueOf(layoutSet.isPrivateLayout()));

		return portletURL.toString();
	}

	@Override
	public Class<LayoutSet> getModelClass() {
		return LayoutSet.class;
	}

	@Override
	public String getTitle(Locale locale, LayoutSet layoutSet)
		throws PortalException {

		Group group = layoutSet.getGroup();

		if (!group.isLayoutSetPrototype() && !group.isLayoutPrototype()) {
			return group.getLayoutRootNodeName(
				layoutSet.isPrivateLayout(), locale);
		}

		return _language.get(locale, "page-set");
	}

	@Override
	public String getTypeName(Locale locale) {
		return _language.get(locale, "page-set");
	}

	@Reference
	private GroupPermission _groupPermission;

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

}