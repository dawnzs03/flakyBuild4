/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.upgrade.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * @author Luis Ortiz
 */
@RunWith(Arquillian.class)
public class UpgradeLogAppenderUpgradeClientTest
	extends BaseUpgradeLogAppenderTestCase {

	@BeforeClass
	public static void setUpClass() throws Exception {
		setUpClass(true);
	}

	@Override
	protected String getFilePath() {
		return ".";
	}

}