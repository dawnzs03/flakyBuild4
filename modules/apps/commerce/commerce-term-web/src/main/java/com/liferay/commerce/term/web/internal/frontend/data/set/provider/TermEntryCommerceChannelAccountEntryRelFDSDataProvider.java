/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.term.web.internal.frontend.data.set.provider;

import com.liferay.commerce.product.model.CommerceChannel;
import com.liferay.commerce.product.model.CommerceChannelAccountEntryRel;
import com.liferay.commerce.product.service.CommerceChannelAccountEntryRelService;
import com.liferay.commerce.product.service.CommerceChannelService;
import com.liferay.commerce.term.model.CommerceTermEntry;
import com.liferay.commerce.term.service.CommerceTermEntryService;
import com.liferay.commerce.term.web.internal.entry.constants.CommerceTermEntryFDSNames;
import com.liferay.commerce.term.web.internal.model.TermEntry;
import com.liferay.frontend.data.set.provider.FDSDataProvider;
import com.liferay.frontend.data.set.provider.search.FDSKeywords;
import com.liferay.frontend.data.set.provider.search.FDSPagination;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	property = {
		"fds.data.provider.key=" + CommerceTermEntryFDSNames.ACCOUNT_ENTRY_DELIVERY_TERM_ENTRIES,
		"fds.data.provider.key=" + CommerceTermEntryFDSNames.ACCOUNT_ENTRY_PAYMENT_TERM_ENTRIES
	},
	service = FDSDataProvider.class
)
public class TermEntryCommerceChannelAccountEntryRelFDSDataProvider
	implements FDSDataProvider<TermEntry> {

	@Override
	public List<TermEntry> getItems(
			FDSKeywords fdsKeywords, FDSPagination fdsPagination,
			HttpServletRequest httpServletRequest, Sort sort)
		throws PortalException {

		long accountEntryId = ParamUtil.getLong(
			httpServletRequest, "accountEntryId");
		int type = ParamUtil.getInteger(httpServletRequest, "type");

		return TransformUtil.transform(
			_commerceChannelAccountEntryRelService.
				getCommerceChannelAccountEntryRels(
					accountEntryId, type, fdsPagination.getStartPosition(),
					fdsPagination.getEndPosition(), null),
			commerceChannelAccountEntryRel -> {
				CommerceTermEntry commerceTermEntry =
					_commerceTermEntryService.getCommerceTermEntry(
						commerceChannelAccountEntryRel.getClassPK());

				return new TermEntry(
					commerceChannelAccountEntryRel.getAccountEntryId(),
					commerceTermEntry.isActive(),
					_getChannelName(
						accountEntryId,
						commerceChannelAccountEntryRel.getCommerceChannelId(),
						httpServletRequest, type),
					commerceChannelAccountEntryRel.
						getCommerceChannelAccountEntryRelId(),
					commerceTermEntry.getLabel(
						_language.getLanguageId(httpServletRequest)),
					commerceChannelAccountEntryRel.isOverrideEligibility(),
					commerceChannelAccountEntryRel.getPriority(),
					commerceChannelAccountEntryRel.getType());
			});
	}

	@Override
	public int getItemsCount(
			FDSKeywords fdsKeywords, HttpServletRequest httpServletRequest)
		throws PortalException {

		return _commerceChannelAccountEntryRelService.
			getCommerceChannelAccountEntryRelsCount(
				ParamUtil.getLong(httpServletRequest, "accountEntryId"),
				ParamUtil.getInteger(httpServletRequest, "type"));
	}

	private String _getChannelName(
			long accountEntryId, long commerceChannelId,
			HttpServletRequest httpServletRequest, int type)
		throws PortalException {

		CommerceChannel commerceChannel =
			_commerceChannelService.fetchCommerceChannel(commerceChannelId);

		if (commerceChannel == null) {
			List<CommerceChannelAccountEntryRel>
				commerceChannelAccountEntryRels =
					_commerceChannelAccountEntryRelService.
						getCommerceChannelAccountEntryRels(
							accountEntryId, type, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS, null);

			if (commerceChannelAccountEntryRels.size() == 1) {
				CommerceChannelAccountEntryRel commerceChannelAccountEntryRel =
					commerceChannelAccountEntryRels.get(0);

				if (commerceChannelAccountEntryRel.getCommerceChannelId() ==
						0) {

					return _language.get(httpServletRequest, "all-channels");
				}
			}
			else if (!commerceChannelAccountEntryRels.isEmpty()) {
				return _language.get(httpServletRequest, "all-other-channels");
			}

			return _language.get(httpServletRequest, "all-channels");
		}

		return commerceChannel.getName();
	}

	@Reference
	private CommerceChannelAccountEntryRelService
		_commerceChannelAccountEntryRelService;

	@Reference
	private CommerceChannelService _commerceChannelService;

	@Reference
	private CommerceTermEntryService _commerceTermEntryService;

	@Reference
	private Language _language;

}