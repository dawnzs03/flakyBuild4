/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.multi.factor.authentication.email.otp.web.internal.configuration.admin.category;

import com.liferay.configuration.admin.category.ConfigurationCategory;

import org.osgi.service.component.annotations.Component;

/**
 * @author Carlos Sierra Andrés
 */
@Component(service = ConfigurationCategory.class)
public class MFAEmailOTPConfigurationCategory implements ConfigurationCategory {

	@Override
	public String getCategoryIcon() {
		return "lock";
	}

	@Override
	public String getCategoryKey() {
		return "multi-factor-authentication";
	}

	@Override
	public String getCategorySection() {
		return "security";
	}

}