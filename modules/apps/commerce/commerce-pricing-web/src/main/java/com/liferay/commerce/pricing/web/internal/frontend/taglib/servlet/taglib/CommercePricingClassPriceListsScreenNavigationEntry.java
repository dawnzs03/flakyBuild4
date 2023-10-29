/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.pricing.web.internal.frontend.taglib.servlet.taglib;

import com.liferay.commerce.pricing.model.CommercePricingClass;
import com.liferay.commerce.pricing.service.CommercePricingClassService;
import com.liferay.commerce.pricing.web.internal.display.context.CommercePricingClassPriceListDisplayContext;
import com.liferay.frontend.taglib.servlet.taglib.ScreenNavigationEntry;
import com.liferay.frontend.taglib.servlet.taglib.util.JSPRenderer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pedro Victor Silvestre
 */
@Component(
	property = "screen.navigation.entry.order:Integer=10",
	service = ScreenNavigationEntry.class
)
public class CommercePricingClassPriceListsScreenNavigationEntry
	extends CommercePricingClassPriceListsScreenNavigationCategory
	implements ScreenNavigationEntry<CommercePricingClass> {

	@Override
	public String getEntryKey() {
		return getCategoryKey();
	}

	@Override
	public boolean isVisible(
		User user, CommercePricingClass commercePricingClass) {

		if (commercePricingClass == null) {
			return false;
		}

		boolean hasPermission = false;

		try {
			hasPermission =
				_commercePricingClassModelResourcePermission.contains(
					PermissionThreadLocal.getPermissionChecker(),
					commercePricingClass.getCommercePricingClassId(),
					ActionKeys.UPDATE);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}
		}

		return hasPermission;
	}

	@Override
	public void render(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws IOException {

		CommercePricingClassPriceListDisplayContext
			commercePricingClassPriceListDisplayContext =
				new CommercePricingClassPriceListDisplayContext(
					httpServletRequest,
					_commercePricingClassModelResourcePermission,
					_commercePricingClassService);

		httpServletRequest.setAttribute(
			WebKeys.PORTLET_DISPLAY_CONTEXT,
			commercePricingClassPriceListDisplayContext);

		_jspRenderer.renderJSP(
			httpServletRequest, httpServletResponse,
			"/commerce_pricing_class/price_lists.jsp");
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CommercePricingClassPriceListsScreenNavigationEntry.class);

	@Reference(
		target = "(model.class.name=com.liferay.commerce.pricing.model.CommercePricingClass)"
	)
	private ModelResourcePermission<CommercePricingClass>
		_commercePricingClassModelResourcePermission;

	@Reference
	private CommercePricingClassService _commercePricingClassService;

	@Reference
	private JSPRenderer _jspRenderer;

}