/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.web.internal.search.bar.portlet.action;

import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.search.capabilities.SearchCapabilities;
import com.liferay.portal.search.rest.configuration.SearchSuggestionsCompanyConfiguration;
import com.liferay.portal.search.web.constants.SearchBarPortletKeys;
import com.liferay.portal.search.web.internal.search.bar.portlet.configuration.SearchBarPortletInstanceConfiguration;
import com.liferay.portal.search.web.internal.search.bar.portlet.display.context.SearchBarPortletDisplayContext;
import com.liferay.portal.search.web.internal.search.bar.portlet.helper.SearchBarPrecedenceHelper;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author André de Oliveira
 */
@Component(
	property = "javax.portlet.name=" + SearchBarPortletKeys.SEARCH_BAR,
	service = ConfigurationAction.class
)
public class SearchBarConfigurationAction extends DefaultConfigurationAction {

	@Override
	public String getJspPath(HttpServletRequest httpServletRequest) {
		ThemeDisplay themeDisplay =
			(ThemeDisplay)httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			new SearchBarPortletDisplayContext();

		SearchBarPortletInstanceConfiguration
			searchBarPortletInstanceConfiguration =
				_getSearchBarPortletInstanceConfiguration(themeDisplay);

		long displayStyleGroupId =
			searchBarPortletInstanceConfiguration.displayStyleGroupId();

		if (displayStyleGroupId <= 0) {
			displayStyleGroupId = themeDisplay.getScopeGroupId();
		}

		searchBarPortletDisplayContext.setDisplayStyleGroupId(
			displayStyleGroupId);
		searchBarPortletDisplayContext.setDisplayWarningIgnoredConfiguration(
			searchBarPrecedenceHelper.isDisplayWarningIgnoredConfiguration(
				themeDisplay, true));
		searchBarPortletDisplayContext.setSearchBarPortletInstanceConfiguration(
			searchBarPortletInstanceConfiguration);
		searchBarPortletDisplayContext.setSearchExperiencesSupported(
			searchCapabilities.isSearchExperiencesSupported());

		SearchSuggestionsCompanyConfiguration
			searchSuggestionsCompanyConfiguration =
				_getSearchSuggestionsCompanyConfiguration(
					themeDisplay.getCompanyId());

		searchBarPortletDisplayContext.setSuggestionsEndpointEnabled(
			searchSuggestionsCompanyConfiguration.enableSuggestionsEndpoint());

		httpServletRequest.setAttribute(
			WebKeys.PORTLET_DISPLAY_CONTEXT, searchBarPortletDisplayContext);

		return "/search/bar/configuration.jsp";
	}

	@Reference
	protected ConfigurationProvider configurationProvider;

	@Reference
	protected SearchBarPrecedenceHelper searchBarPrecedenceHelper;

	@Reference
	protected SearchCapabilities searchCapabilities;

	private SearchBarPortletInstanceConfiguration
		_getSearchBarPortletInstanceConfiguration(ThemeDisplay themeDisplay) {

		try {
			return configurationProvider.getPortletInstanceConfiguration(
				SearchBarPortletInstanceConfiguration.class, themeDisplay);
		}
		catch (ConfigurationException configurationException) {
			throw new RuntimeException(configurationException);
		}
	}

	private SearchSuggestionsCompanyConfiguration
		_getSearchSuggestionsCompanyConfiguration(long companyId) {

		try {
			return configurationProvider.getCompanyConfiguration(
				SearchSuggestionsCompanyConfiguration.class, companyId);
		}
		catch (ConfigurationException configurationException) {
			throw new RuntimeException(configurationException);
		}
	}

}