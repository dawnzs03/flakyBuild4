/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.web.internal.layout.prototype;

import com.liferay.osgi.util.service.Snapshot;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutPrototype;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.LayoutPrototypeLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.Localization;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.language.LanguageResources;
import com.liferay.portal.search.web.layout.prototype.SearchLayoutPrototypeCustomizer;

import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Adam Brandizzi
 * @author André de Oliveira
 * @author Lino Alves
 */
@Component(service = SearchLayoutFactory.class)
public class SearchLayoutFactoryImpl implements SearchLayoutFactory {

	@Override
	public void createSearchLayout(Group group) {
		if (!_shouldCreateSearchLayout(group)) {
			return;
		}

		LayoutPrototype layoutPrototype = _findSearchLayoutPrototype(
			group.getCompanyId());

		if (layoutPrototype != null) {
			createSearchLayout(group, layoutPrototype);
		}
	}

	@Override
	public Layout createSearchLayoutPrototype(long companyId) {
		try {
			return createSearchLayoutPrototype(
				companyId, userLocalService.getGuestUserId(companyId));
		}
		catch (RuntimeException runtimeException) {
			throw runtimeException;
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected void createSearchLayout(
		Group group, LayoutPrototype layoutPrototype) {

		try {
			Layout baseLayout = layoutPrototype.getLayout();

			createSearchLayout(group, layoutPrototype, baseLayout);
		}
		catch (RuntimeException runtimeException) {
			throw runtimeException;
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected void createSearchLayout(
			Group group, LayoutPrototype layoutPrototype, Layout baseLayout)
		throws Exception {

		ServiceContext serviceContext = new ServiceContext();

		serviceContext.setAttribute(
			"layoutPrototypeLinkEnabled", Boolean.FALSE);
		serviceContext.setAttribute(
			"layoutPrototypeUuid", layoutPrototype.getUuid());
		serviceContext.setUserId(group.getCreatorUserId());

		layoutLocalService.addLayout(
			group.getCreatorUserId(), group.getGroupId(), false,
			LayoutConstants.DEFAULT_PARENT_LAYOUT_ID,
			layoutPrototype.getNameMap(), baseLayout.getTitleMap(),
			layoutPrototype.getDescriptionMap(), baseLayout.getKeywordsMap(),
			baseLayout.getRobotsMap(), LayoutConstants.TYPE_PORTLET,
			baseLayout.getTypeSettings(), baseLayout.isPrivateLayout(),
			_getFriendlyURLMap(), serviceContext);

		UnicodeProperties unicodeProperties = group.getTypeSettingsProperties();

		unicodeProperties.put("searchLayoutCreated", "true");

		group.setTypeSettingsProperties(unicodeProperties);

		groupLocalService.updateGroup(group);

		if (_log.isInfoEnabled()) {
			_log.info("Search Page created");
		}
	}

	protected Layout createSearchLayoutPrototype(
			long companyId, long guestUserId)
		throws Exception {

		for (LayoutPrototype layoutPrototype :
				layoutPrototypeLocalService.search(
					companyId, null, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			Locale defaultLocale = LocaleUtil.fromLanguageId(
				_localization.getDefaultLanguageId(layoutPrototype.getName()));

			String name = LanguageResources.getMessage(
				defaultLocale, "layout-prototype-search-title");

			if ((name == null) ||
				name.equals(layoutPrototype.getName(defaultLocale))) {

				return null;
			}
		}

		LayoutPrototype layoutPrototype =
			layoutPrototypeLocalService.addLayoutPrototype(
				guestUserId, companyId, _getSearchTitleLocalizationMap(),
				_getSearchDescriptionLocalizationMap(), true,
				new ServiceContext());

		Layout layout = layoutPrototype.getLayout();

		LayoutTypePortlet layoutTypePortlet =
			(LayoutTypePortlet)layout.getLayoutType();

		layoutTypePortlet.setLayoutTemplateId(0, getLayoutTemplateId(), false);

		customize(layout);

		if (_log.isInfoEnabled()) {
			_log.info("Search Page Template created");
		}

		return layout;
	}

	protected void customize(Layout layout) throws Exception {
		SearchLayoutPrototypeCustomizer searchLayoutPrototypeCustomizer =
			_getSearchLayoutPrototypeCustomizer();

		searchLayoutPrototypeCustomizer.customize(layout);
	}

	protected String getLayoutTemplateId() {
		SearchLayoutPrototypeCustomizer searchLayoutPrototypeCustomizer =
			_getSearchLayoutPrototypeCustomizer();

		return searchLayoutPrototypeCustomizer.getLayoutTemplateId();
	}

	@Reference
	protected GroupLocalService groupLocalService;

	@Reference
	protected LayoutLocalService layoutLocalService;

	@Reference
	protected LayoutPrototypeLocalService layoutPrototypeLocalService;

	@Reference
	protected UserLocalService userLocalService;

	private LayoutPrototype _findSearchLayoutPrototype(long companyId) {
		Map<Locale, String> searchTitleLocalizationMap =
			_getSearchTitleLocalizationMap();

		for (LayoutPrototype layoutPrototype :
				layoutPrototypeLocalService.getLayoutPrototypes(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS)) {

			if (_isSearchLayoutPrototype(
					layoutPrototype, companyId, searchTitleLocalizationMap)) {

				return layoutPrototype;
			}
		}

		return null;
	}

	private Map<Locale, String> _getFriendlyURLMap() {
		return _localization.getLocalizationMap("/search");
	}

	private Map<Locale, String> _getLocalizationMap(String key) {
		return ResourceBundleUtil.getLocalizationMap(
			LanguageResources.PORTAL_RESOURCE_BUNDLE_LOADER, key);
	}

	private Map<Locale, String> _getSearchDescriptionLocalizationMap() {
		return _getLocalizationMap("layout-prototype-search-description");
	}

	private SearchLayoutPrototypeCustomizer
		_getSearchLayoutPrototypeCustomizer() {

		SearchLayoutPrototypeCustomizer searchLayoutPrototypeCustomizer =
			_searchLayoutPrototypeCustomizerSnapshot.get();

		if (searchLayoutPrototypeCustomizer != null) {
			return searchLayoutPrototypeCustomizer;
		}

		return _defaultSearchLayoutPrototypeCustomizer;
	}

	private Map<Locale, String> _getSearchTitleLocalizationMap() {
		return _getLocalizationMap("layout-prototype-search-title");
	}

	private boolean _hasSearchLayout(Group group) {
		Layout layout = layoutLocalService.fetchLayoutByFriendlyURL(
			group.getGroupId(), false, "/search");

		if (layout != null) {
			return true;
		}

		return false;
	}

	private boolean _isSearchLayoutPrototype(
		LayoutPrototype layoutPrototype, long companyId,
		Map<Locale, String> searchTitleLocalizationMap) {

		if ((layoutPrototype.getCompanyId() == companyId) &&
			searchTitleLocalizationMap.equals(layoutPrototype.getNameMap())) {

			return true;
		}

		return false;
	}

	private boolean _shouldCreateSearchLayout(Group group) {
		if (_hasSearchLayout(group)) {
			return false;
		}

		UnicodeProperties unicodeProperties = group.getTypeSettingsProperties();

		if (unicodeProperties.get("searchLayoutCreated") != null) {
			return false;
		}

		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SearchLayoutFactoryImpl.class);

	private static final Snapshot<SearchLayoutPrototypeCustomizer>
		_searchLayoutPrototypeCustomizerSnapshot = new Snapshot<>(
			SearchLayoutFactoryImpl.class,
			SearchLayoutPrototypeCustomizer.class, null, true);

	private final SearchLayoutPrototypeCustomizer
		_defaultSearchLayoutPrototypeCustomizer =
			new DefaultSearchLayoutPrototypeCustomizer();

	@Reference
	private Localization _localization;

}