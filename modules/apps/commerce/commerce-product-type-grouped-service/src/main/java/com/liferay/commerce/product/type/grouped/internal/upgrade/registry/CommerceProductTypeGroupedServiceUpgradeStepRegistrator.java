/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.type.grouped.internal.upgrade.registry;

import com.liferay.commerce.product.type.grouped.internal.upgrade.v1_1_0.CPDefinitionGroupedEntryUpgradeProcess;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.kernel.upgrade.MVCCVersionUpgradeProcess;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ethan Bustad
 */
@Component(service = UpgradeStepRegistrator.class)
public class CommerceProductTypeGroupedServiceUpgradeStepRegistrator
	implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		if (_log.isInfoEnabled()) {
			_log.info(
				"Commerce product type grouped upgrade step registrator " +
					"'started'");
		}

		registry.register(
			"1.0.0", "1.1.0", new CPDefinitionGroupedEntryUpgradeProcess());

		registry.register(
			"1.1.0", "1.2.0",
			new MVCCVersionUpgradeProcess() {

				@Override
				protected String[] getTableNames() {
					return new String[] {"CPDefinitionGroupedEntry"};
				}

			});

		if (_log.isInfoEnabled()) {
			_log.info(
				"Commerce product type grouped upgrade step registrator " +
					"'finished'");
		}

		registry.register("1.2.0", "1.2.1", new DummyUpgradeStep());
	}

	private static final Log _log = LogFactoryUtil.getLog(
		CommerceProductTypeGroupedServiceUpgradeStepRegistrator.class);

}