/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.message.boards.web.internal.portlet.configuration.icon;

import com.liferay.message.boards.constants.MBPortletKeys;
import com.liferay.message.boards.model.MBCategory;
import com.liferay.message.boards.settings.MBGroupServiceSettings;
import com.liferay.message.boards.web.internal.portlet.action.ActionUtil;
import com.liferay.message.boards.web.internal.util.MBRequestUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.configuration.icon.BasePortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.configuration.icon.PortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.subscription.service.SubscriptionLocalService;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Sergio González
 */
@Component(
	property = {
		"javax.portlet.name=" + MBPortletKeys.MESSAGE_BOARDS_ADMIN,
		"path=/message_boards/view_category"
	},
	service = PortletConfigurationIcon.class
)
public class CategorySubscriptionPortletConfigurationIcon
	extends BasePortletConfigurationIcon {

	@Override
	public String getMessage(PortletRequest portletRequest) {
		String key = "subscribe";

		try {
			if (_isSubscribed(
					portletRequest, ActionUtil.getCategory(portletRequest))) {

				key = "unsubscribe";
			}
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}
		}

		return _language.get(getLocale(portletRequest), key);
	}

	@Override
	public String getURL(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		PortletURL portletURL = PortletURLBuilder.create(
			_portal.getControlPanelPortletURL(
				portletRequest, MBPortletKeys.MESSAGE_BOARDS_ADMIN,
				PortletRequest.ACTION_PHASE)
		).setActionName(
			"/message_boards/edit_category"
		).buildPortletURL();

		MBCategory category = null;

		try {
			category = ActionUtil.getCategory(portletRequest);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}

			return null;
		}

		if (_isSubscribed(portletRequest, category)) {
			portletURL.setParameter(Constants.CMD, Constants.UNSUBSCRIBE);
		}
		else {
			portletURL.setParameter(Constants.CMD, Constants.SUBSCRIBE);
		}

		portletURL.setParameter(
			"redirect", _portal.getCurrentURL(portletRequest));
		portletURL.setParameter(
			"mbCategoryId", String.valueOf(category.getCategoryId()));

		return portletURL.toString();
	}

	@Override
	public double getWeight() {
		return 101;
	}

	@Override
	public boolean isShow(PortletRequest portletRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		try {
			MBGroupServiceSettings mbGroupServiceSettings =
				MBRequestUtil.getMBGroupServiceSettings(
					_portal.getHttpServletRequest(portletRequest),
					themeDisplay.getScopeGroupId());

			if (!mbGroupServiceSettings.isEmailMessageAddedEnabled() &&
				!mbGroupServiceSettings.isEmailMessageUpdatedEnabled()) {

				return false;
			}

			return _categoryModelResourcePermission.contains(
				themeDisplay.getPermissionChecker(),
				ActionUtil.getCategory(portletRequest), ActionKeys.SUBSCRIBE);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}
		}

		return false;
	}

	private boolean _isSubscribed(
		PortletRequest portletRequest, MBCategory category) {

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		return _subscriptionLocalService.isSubscribed(
			themeDisplay.getCompanyId(), themeDisplay.getUserId(),
			MBCategory.class.getName(), category.getCategoryId());
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CategorySubscriptionPortletConfigurationIcon.class);

	@Reference(
		target = "(model.class.name=com.liferay.message.boards.model.MBCategory)"
	)
	private ModelResourcePermission<MBCategory>
		_categoryModelResourcePermission;

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

	@Reference
	private SubscriptionLocalService _subscriptionLocalService;

}