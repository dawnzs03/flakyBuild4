/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portlet.configuration.css.web.internal.upgrade.registry;

import com.liferay.portal.kernel.upgrade.BasePortletIdUpgradeProcess;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import com.liferay.portlet.configuration.css.web.internal.constants.PortletConfigurationCSSPortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eudaldo Alonso
 */
@Component(service = UpgradeStepRegistrator.class)
public class PortletConfigurationCSSWebUpgradeStepRegistrator
	implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		registry.registerInitialization();

		registry.register(
			"0.0.1", "1.0.0",
			new BasePortletIdUpgradeProcess() {

				@Override
				protected String[][] getRenamePortletIdsArray() {
					return new String[][] {
						{
							"113",
							PortletConfigurationCSSPortletKeys.
								PORTLET_CONFIGURATION_CSS
						}
					};
				}

			});
	}

}