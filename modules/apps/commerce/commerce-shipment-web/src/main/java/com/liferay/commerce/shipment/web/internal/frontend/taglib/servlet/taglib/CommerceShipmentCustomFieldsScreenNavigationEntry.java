/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.shipment.web.internal.frontend.taglib.servlet.taglib;

import com.liferay.commerce.model.CommerceShipment;
import com.liferay.frontend.taglib.servlet.taglib.ScreenNavigationEntry;
import com.liferay.frontend.taglib.servlet.taglib.util.JSPRenderer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.taglib.util.CustomAttributesUtil;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Joao Victor Alves
 */
@Component(
	property = "screen.navigation.entry.order:Integer=10",
	service = ScreenNavigationEntry.class
)
public class CommerceShipmentCustomFieldsScreenNavigationEntry
	extends CommerceShipmentCustomFieldsScreenNavigationCategory
	implements ScreenNavigationEntry<CommerceShipment> {

	@Override
	public String getEntryKey() {
		return getCategoryKey();
	}

	@Override
	public boolean isVisible(User user, CommerceShipment commerceShipment) {
		boolean hasCustomAttributesAvailable = false;

		try {
			hasCustomAttributesAvailable =
				CustomAttributesUtil.hasCustomAttributes(
					user.getCompanyId(), CommerceShipment.class.getName(),
					commerceShipment.getCommerceShipmentId(), null);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}
		}

		return hasCustomAttributesAvailable;
	}

	@Override
	public void render(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
		throws IOException {

		_jspRenderer.renderJSP(
			httpServletRequest, httpServletResponse,
			"/commerce_shipment/custom_fields.jsp");
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CommerceShipmentCustomFieldsScreenNavigationEntry.class);

	@Reference
	private JSPRenderer _jspRenderer;

}