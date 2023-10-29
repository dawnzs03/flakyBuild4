/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.deploy.auto;

import com.liferay.portal.kernel.deploy.auto.AutoDeployException;
import com.liferay.portal.kernel.deploy.auto.AutoDeployer;
import com.liferay.portal.kernel.deploy.auto.BaseAutoDeployListener;

import java.io.File;

/**
 * @author Ivica Cardic
 * @author Brian Wing Shun Chan
 * @author Manuel de la Peña
 */
public class ThemeAutoDeployListener extends BaseAutoDeployListener {

	@Override
	protected AutoDeployer buildAutoDeployer() {
		return new ThemeAutoDeployer();
	}

	@Override
	protected String getPluginPathInfoMessage(File file) {
		return "Copying themes for " + file.getPath();
	}

	@Override
	protected String getSuccessMessage(File file) {
		return "Themes for " + file.getPath() + " copied successfully";
	}

	@Override
	protected boolean isDeployable(File file) throws AutoDeployException {
		PluginAutoDeployListenerHelper pluginAutoDeployListenerHelper =
			new PluginAutoDeployListenerHelper(file);

		return pluginAutoDeployListenerHelper.isThemePlugin();
	}

}