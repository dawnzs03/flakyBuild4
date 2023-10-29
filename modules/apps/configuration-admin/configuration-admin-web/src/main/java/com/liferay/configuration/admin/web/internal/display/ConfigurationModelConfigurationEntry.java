/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.configuration.admin.web.internal.display;

import com.liferay.configuration.admin.web.internal.model.ConfigurationModel;
import com.liferay.configuration.admin.web.internal.util.ResourceBundleLoaderProvider;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoader;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Jorge Ferrer
 */
public class ConfigurationModelConfigurationEntry
	implements ConfigurationEntry {

	public ConfigurationModelConfigurationEntry(
		ConfigurationModel configurationModel, Locale locale,
		ResourceBundleLoaderProvider resourceBundleLoaderProvider) {

		_configurationModel = configurationModel;
		_locale = locale;
		_resourceBundleLoaderProvider = resourceBundleLoaderProvider;
	}

	@Override
	public boolean equals(Object object) {
		ConfigurationEntry configurationEntry = (ConfigurationEntry)object;

		return Objects.equals(getKey(), configurationEntry.getKey());
	}

	@Override
	public String getCategory() {
		return _configurationModel.getCategory();
	}

	public ConfigurationModel getConfigurationModel() {
		return _configurationModel;
	}

	@Override
	public String getEditURL(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		PortletURL portletURL = PortletURLBuilder.createRenderURL(
			renderResponse
		).setParameter(
			"factoryPid", _configurationModel.getFactoryPid()
		).buildPortletURL();

		if (_configurationModel.isFactory()) {
			portletURL.setParameter(
				"mvcRenderCommandName",
				"/configuration_admin/view_factory_instances");
		}
		else {
			portletURL.setParameter(
				"mvcRenderCommandName",
				"/configuration_admin/edit_configuration");
			portletURL.setParameter("pid", _configurationModel.getID());
		}

		return portletURL.toString();
	}

	@Override
	public String getKey() {
		return _configurationModel.getID();
	}

	@Override
	public String getName() {
		ResourceBundleLoader curResourceBundleLoader =
			_resourceBundleLoaderProvider.getResourceBundleLoader(
				_configurationModel.getBundleSymbolicName());

		ResourceBundle curComponentResourceBundle =
			curResourceBundleLoader.loadResourceBundle(_locale);

		String curConfigurationModelName;

		if (curComponentResourceBundle != null) {
			curConfigurationModelName = LanguageUtil.get(
				curComponentResourceBundle, _configurationModel.getName());
		}
		else {
			curConfigurationModelName = _configurationModel.getName();
		}

		return curConfigurationModelName;
	}

	@Override
	public String getScope() {
		return _configurationModel.getScope();
	}

	@Override
	public int hashCode() {
		return Objects.hash(_configurationModel);
	}

	private final ConfigurationModel _configurationModel;
	private final Locale _locale;
	private final ResourceBundleLoaderProvider _resourceBundleLoaderProvider;

}