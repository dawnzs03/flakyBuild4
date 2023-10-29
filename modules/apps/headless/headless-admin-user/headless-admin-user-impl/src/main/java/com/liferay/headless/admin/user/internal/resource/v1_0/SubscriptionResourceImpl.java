/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.internal.resource.v1_0;

import com.liferay.headless.admin.user.dto.v1_0.Subscription;
import com.liferay.headless.admin.user.resource.v1_0.SubscriptionResource;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.subscription.service.SubscriptionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Javier Gamarra
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/subscription.properties",
	scope = ServiceScope.PROTOTYPE, service = SubscriptionResource.class
)
public class SubscriptionResourceImpl extends BaseSubscriptionResourceImpl {

	@Override
	public void deleteMyUserAccountSubscription(Long subscriptionId)
		throws Exception {

		_subscriptionLocalService.deleteSubscription(subscriptionId);
	}

	@Override
	public Subscription getMyUserAccountSubscription(Long subscriptionId)
		throws Exception {

		return _toSubscription(
			_subscriptionLocalService.getSubscription(subscriptionId));
	}

	@Override
	public Page<Subscription> getMyUserAccountSubscriptionsPage(
		String contentType, Pagination pagination) {

		long userId = contextUser.getUserId();

		if (contentType != null) {
			return Page.of(
				transform(
					_subscriptionLocalService.getUserSubscriptions(
						userId, _getDTOClassName(contentType)),
					this::_toSubscription));
		}

		return Page.of(
			transform(
				_subscriptionLocalService.getUserSubscriptions(
					userId, pagination.getStartPosition(),
					pagination.getEndPosition(), null),
				this::_toSubscription),
			pagination,
			_subscriptionLocalService.getUserSubscriptionsCount(userId));
	}

	private String _getDTOClassName(String contentType) {
		for (String dtoClassName : _dtoConverterRegistry.getDTOClassNames()) {
			DTOConverter<?, ?> dtoConverter =
				_dtoConverterRegistry.getDTOConverter(dtoClassName);

			if (contentType.equals(dtoConverter.getContentType())) {
				return dtoConverter.getDTOClassName();
			}
		}

		return contentType;
	}

	private Subscription _toSubscription(
		com.liferay.subscription.model.Subscription subscription) {

		return new Subscription() {
			{
				contentId = subscription.getClassPK();
				dateCreated = subscription.getCreateDate();
				dateModified = subscription.getModifiedDate();
				frequency = subscription.getFrequency();
				id = subscription.getSubscriptionId();
				siteId = subscription.getGroupId();

				setContentType(
					() -> {
						DTOConverter<?, ?> dtoConverter =
							_dtoConverterRegistry.getDTOConverter(
								subscription.getClassName());

						if (dtoConverter == null) {
							return subscription.getClassName();
						}

						return dtoConverter.getContentType();
					});
			}
		};
	}

	@Reference
	private DTOConverterRegistry _dtoConverterRegistry;

	@Reference
	private SubscriptionLocalService _subscriptionLocalService;

}