/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.spi.model.registrar;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.search.spi.model.registrar.contributor.ModelSearchDefinitionContributor;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author André de Oliveira
 */
@ProviderType
public interface ModelSearchRegistrarHelper {

	public ServiceRegistration<?> register(
		Class<? extends BaseModel<?>> clazz, BundleContext bundleContext,
		ModelSearchDefinitionContributor modelSearchDefinitionContributor);

	public ServiceRegistration<?> register(
		String className, BundleContext bundleContext,
		ModelSearchDefinitionContributor modelSearchDefinitionContributor);

}