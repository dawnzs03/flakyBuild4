/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.display.page.internal;

import com.liferay.layout.display.page.LayoutDisplayPageInfoItemFieldValuesProvider;
import com.liferay.layout.display.page.LayoutDisplayPageInfoItemFieldValuesProviderRegistry;
import com.liferay.osgi.service.tracker.collections.map.PropertyServiceReferenceComparator;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMap;
import com.liferay.osgi.service.tracker.collections.map.ServiceTrackerMapFactory;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * @author Lourdes Fernández Besada
 */
@Component(service = LayoutDisplayPageInfoItemFieldValuesProviderRegistry.class)
public class LayoutDisplayPageInfoItemFieldValuesProviderRegistryImpl
	implements LayoutDisplayPageInfoItemFieldValuesProviderRegistry {

	@Override
	public LayoutDisplayPageInfoItemFieldValuesProvider<?>
		getLayoutDisplayPageInfoItemFieldValuesProvider(String className) {

		return _layoutDisplayPageDetailsProviderServiceTrackerMap.getService(
			className);
	}

	@Override
	public List<LayoutDisplayPageInfoItemFieldValuesProvider<?>>
		getLayoutDisplayPageInfoItemFieldValuesProviders() {

		return new ArrayList(
			_layoutDisplayPageDetailsProviderServiceTrackerMap.values());
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_layoutDisplayPageDetailsProviderServiceTrackerMap =
			ServiceTrackerMapFactory.openSingleValueMap(
				bundleContext,
				(Class<LayoutDisplayPageInfoItemFieldValuesProvider<?>>)
					(Class<?>)
						LayoutDisplayPageInfoItemFieldValuesProvider.class,
				null,
				(serviceReference, emitter) -> {
					LayoutDisplayPageInfoItemFieldValuesProvider<?>
						layoutDisplayPageInfoItemFieldValuesProvider =
							bundleContext.getService(serviceReference);

					try {
						emitter.emit(
							layoutDisplayPageInfoItemFieldValuesProvider.
								getClassName());
					}
					finally {
						bundleContext.ungetService(serviceReference);
					}
				},
				new PropertyServiceReferenceComparator<>("service.ranking"));
	}

	private ServiceTrackerMap
		<String, LayoutDisplayPageInfoItemFieldValuesProvider<?>>
			_layoutDisplayPageDetailsProviderServiceTrackerMap;

}