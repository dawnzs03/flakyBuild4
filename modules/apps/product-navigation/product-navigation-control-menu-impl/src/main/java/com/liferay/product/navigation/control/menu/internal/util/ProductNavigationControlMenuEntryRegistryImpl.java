/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.product.navigation.control.menu.internal.util;

import com.liferay.osgi.service.tracker.collections.map.PropertyServiceReferenceComparator;
import com.liferay.osgi.service.tracker.collections.map.PropertyServiceReferenceMapper;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuCategory;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.util.ProductNavigationControlMenuEntryRegistry;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * @author Julio Camarero
 */
@Component(service = ProductNavigationControlMenuEntryRegistry.class)
public class ProductNavigationControlMenuEntryRegistryImpl
	implements ProductNavigationControlMenuEntryRegistry {

	@Override
	public List<ProductNavigationControlMenuEntry>
		getProductNavigationControlMenuEntries(
			ProductNavigationControlMenuCategory
				productNavigationControlMenuCategory) {

		List<ProductNavigationControlMenuEntry>
			productNavigationControlMenuEntries = _serviceTrackerMap.getService(
				productNavigationControlMenuCategory.getKey());

		if (productNavigationControlMenuEntries == null) {
			return Collections.emptyList();
		}

		return productNavigationControlMenuEntries;
	}

	@Override
	public List<ProductNavigationControlMenuEntry>
		getProductNavigationControlMenuEntries(
			ProductNavigationControlMenuCategory
				productNavigationControlMenuCategory,
			HttpServletRequest httpServletRequest) {

		List<ProductNavigationControlMenuEntry>
			productNavigationControlMenuEntries =
				getProductNavigationControlMenuEntries(
					productNavigationControlMenuCategory);

		if (productNavigationControlMenuEntries.isEmpty()) {
			return productNavigationControlMenuEntries;
		}

		return ListUtil.filter(
			productNavigationControlMenuEntries,
			productNavigationControlMenuEntry -> {
				try {
					return productNavigationControlMenuEntry.isShow(
						httpServletRequest);
				}
				catch (Exception exception) {
					if (_log.isDebugEnabled()) {
						_log.debug(exception);
					}
				}

				return false;
			});
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTrackerMap = ServiceTrackerMapFactory.openMultiValueMap(
			bundleContext, ProductNavigationControlMenuEntry.class, null,
			new PropertyServiceReferenceMapper<>(
				"product.navigation.control.menu.category.key"),
			Collections.reverseOrder(
				new PropertyServiceReferenceComparator<>(
					"product.navigation.control.menu.entry.order")));
	}

	@Deactivate
	protected void deactivate() {
		_serviceTrackerMap.close();
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ProductNavigationControlMenuEntryRegistryImpl.class);

	private ServiceTrackerMap<String, List<ProductNavigationControlMenuEntry>>
		_serviceTrackerMap;

}