/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.type.virtual.internal.upgrade.registry;

import com.liferay.commerce.product.type.virtual.internal.upgrade.v1_1_0.CPDefinitionVirtualSettingUpgradeProcess;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.MVCCVersionUpgradeProcess;
import com.liferay.portal.kernel.upgrade.UpgradeProcessFactory;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;

/**
 * @author Alessio Antonio Rendina
 */
@Component(service = UpgradeStepRegistrator.class)
public class CommerceProductTypeVirtualServiceUpgradeStepRegistrator
	implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		if (_log.isInfoEnabled()) {
			_log.info(
				"Commerce product type virtual upgrade step registrator " +
					"STARTED");
		}

		registry.register(
			"1.0.0", "1.1.0", new CPDefinitionVirtualSettingUpgradeProcess());

		registry.register(
			"1.1.0", "1.1.1",
			UpgradeProcessFactory.alterColumnType(
				"CPDefinitionVirtualSetting", "url", "VARCHAR(255) null"),
			UpgradeProcessFactory.alterColumnType(
				"CPDefinitionVirtualSetting", "sampleUrl",
				"VARCHAR(255) null"));

		registry.register(
			"1.1.1", "1.2.0",
			new MVCCVersionUpgradeProcess() {

				@Override
				protected String[] getTableNames() {
					return new String[] {"CPDefinitionVirtualSetting"};
				}

			});

		registry.register(
			"1.2.0", "2.0.0",
			UpgradeProcessFactory.alterColumnName(
				"CPDefinitionVirtualSetting", "sampleUrl",
				"sampleURL VARCHAR(255) null"));

		if (_log.isInfoEnabled()) {
			_log.info(
				"Commerce product type virtual upgrade step registrator " +
					"FINISHED");
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CommerceProductTypeVirtualServiceUpgradeStepRegistrator.class);

}