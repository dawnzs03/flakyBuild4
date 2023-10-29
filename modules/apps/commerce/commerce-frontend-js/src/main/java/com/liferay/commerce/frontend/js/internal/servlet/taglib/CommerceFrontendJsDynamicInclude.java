/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.frontend.js.internal.servlet.taglib;

import com.liferay.account.model.AccountEntry;
import com.liferay.commerce.constants.CommerceWebKeys;
import com.liferay.commerce.context.CommerceContext;
import com.liferay.commerce.currency.model.CommerceCurrency;
import com.liferay.commerce.model.CommerceOrder;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.taglib.BaseDynamicInclude;
import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;
import com.liferay.portal.kernel.util.Portal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Fabio Mastrorilli
 */
@Component(
	property = "service.ranking:Integer=" + Integer.MAX_VALUE,
	service = DynamicInclude.class
)
public class CommerceFrontendJsDynamicInclude extends BaseDynamicInclude {

	@Override
	public void include(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, String key)
		throws IOException {

		CommerceContext commerceContext =
			(CommerceContext)httpServletRequest.getAttribute(
				CommerceWebKeys.COMMERCE_CONTEXT);

		if (commerceContext == null) {
			return;
		}

		try {
			PrintWriter printWriter = httpServletResponse.getWriter();

			printWriter.println(
				_getContent(commerceContext, httpServletRequest));
		}
		catch (PortalException portalException) {
			_log.error(portalException);
		}
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		dynamicIncludeRegistry.register(
			"/html/common/themes/top_head.jsp#post");
	}

	private String _getContent(
			CommerceContext commerceContext,
			HttpServletRequest httpServletRequest)
		throws PortalException {

		return StringBundler.concat(
			"<script data-senna-track=\"temporary\">var Liferay = ",
			"window.Liferay || {}; Liferay.CommerceContext = ",
			JSONUtil.put(
				"account",
				() -> {
					AccountEntry accountEntry =
						commerceContext.getAccountEntry();

					if (accountEntry == null) {
						return null;
					}

					return JSONUtil.put(
						"accountId", accountEntry.getAccountEntryId()
					).put(
						"accountName", accountEntry.getName()
					);
				}
			).put(
				"accountEntryAllowedTypes",
				commerceContext.getAccountEntryAllowedTypes()
			).put(
				"commerceAccountGroupIds",
				commerceContext.getCommerceAccountGroupIds()
			).put(
				"commerceChannelId", commerceContext.getCommerceChannelId()
			).put(
				"commerceSiteType", commerceContext.getCommerceSiteType()
			).put(
				"currency",
				() -> {
					CommerceCurrency commerceCurrency =
						commerceContext.getCommerceCurrency();

					if (commerceCurrency == null) {
						return null;
					}

					return JSONUtil.put(
						"currencyCode", commerceCurrency.getCode()
					).put(
						"currencyId", commerceCurrency.getCommerceCurrencyId()
					);
				}
			).put(
				"order",
				() -> {
					CommerceOrder commerceOrder =
						commerceContext.getCommerceOrder();

					if (commerceOrder == null) {
						return null;
					}

					return JSONUtil.put(
						"orderId", commerceOrder.getCommerceOrderId()
					).put(
						"orderType", commerceOrder.getCommerceOrderTypeId()
					);
				}
			),
			";</script><link href=\"",
			_portal.getPathProxy() + httpServletRequest.getContextPath(),
			"/o/commerce-frontend-js/styles/main.css\" rel=\"stylesheet\" ",
			"type=\"text/css\" />");
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CommerceFrontendJsDynamicInclude.class);

	@Reference
	private Portal _portal;

}