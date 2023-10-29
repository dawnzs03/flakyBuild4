/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.configuration.cluster.internal.messaging;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.configuration.cluster.internal.ConfigurationThreadLocal;
import com.liferay.portal.configuration.cluster.internal.constants.ConfigurationClusterDestinationNames;
import com.liferay.portal.configuration.persistence.ReloadablePersistenceManager;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import java.util.Dictionary;
import java.util.Set;

import org.osgi.framework.Constants;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.ConfigurationEvent;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Raymond Augé
 */
@Component(
	enabled = false,
	property = "destination.name=" + ConfigurationClusterDestinationNames.CONFIGURATION,
	service = MessageListener.class
)
public class ConfigurationMessageListener extends BaseMessageListener {

	@Override
	protected void doReceive(Message message) throws Exception {
		_reloadConfiguration(
			message.getString(Constants.SERVICE_PID),
			message.getInteger("configuration.event.type"));
	}

	private void _reloadConfiguration(String pid, int type) throws Exception {
		_reloadablePersistenceManager.reload(pid);

		Dictionary<String, ?> dictionary = _reloadablePersistenceManager.load(
			pid);

		try {
			ConfigurationThreadLocal.setLocalUpdate(true);

			Configuration[] configurations =
				_configurationAdmin.listConfigurations(
					StringBundler.concat(
						"(", Constants.SERVICE_PID, "=", pid, ")"));

			if (configurations == null) {
				return;
			}

			for (Configuration configuration : configurations) {
				Set<Configuration.ConfigurationAttribute>
					configurationAttributes = configuration.getAttributes();
				boolean readOnly = false;

				if (configurationAttributes.contains(
						Configuration.ConfigurationAttribute.READ_ONLY)) {

					configuration.removeAttributes(
						Configuration.ConfigurationAttribute.READ_ONLY);
					readOnly = true;
				}

				if (type == ConfigurationEvent.CM_DELETED) {
					configuration.delete();
				}
				else {
					if (dictionary == null) {
						configuration.update();
					}
					else {
						configuration.update(dictionary);
					}

					if (readOnly) {
						configuration.addAttributes(
							Configuration.ConfigurationAttribute.READ_ONLY);
					}
				}
			}
		}
		finally {
			ConfigurationThreadLocal.setLocalUpdate(false);
		}
	}

	@Reference
	private ConfigurationAdmin _configurationAdmin;

	@Reference(
		target = "(destination.name=" + ConfigurationClusterDestinationNames.CONFIGURATION + ")"
	)
	private Destination _destination;

	@Reference
	private ReloadablePersistenceManager _reloadablePersistenceManager;

}