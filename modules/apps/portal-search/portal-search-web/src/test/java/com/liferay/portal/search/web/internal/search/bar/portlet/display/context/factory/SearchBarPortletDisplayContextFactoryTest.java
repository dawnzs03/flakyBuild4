/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.search.web.internal.search.bar.portlet.display.context.factory;

import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.module.configuration.ConfigurationProviderUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.search.capabilities.SearchCapabilities;
import com.liferay.portal.search.rest.configuration.SearchSuggestionsCompanyConfiguration;
import com.liferay.portal.search.searcher.SearchRequest;
import com.liferay.portal.search.searcher.SearchResponse;
import com.liferay.portal.search.web.internal.portlet.preferences.PortletPreferencesLookup;
import com.liferay.portal.search.web.internal.search.bar.portlet.SearchBarPortletPreferences;
import com.liferay.portal.search.web.internal.search.bar.portlet.configuration.SearchBarPortletInstanceConfiguration;
import com.liferay.portal.search.web.internal.search.bar.portlet.display.context.SearchBarPortletDisplayContext;
import com.liferay.portal.search.web.internal.search.bar.portlet.helper.SearchBarPrecedenceHelper;
import com.liferay.portal.search.web.portlet.shared.search.PortletSharedSearchRequest;
import com.liferay.portal.search.web.portlet.shared.search.PortletSharedSearchResponse;
import com.liferay.portal.test.rule.LiferayUnitTestRule;
import com.liferay.portlet.PortletPreferencesImpl;

import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;

import javax.servlet.http.HttpServletRequest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

/**
 * @author Adam Brandizzi
 */
public class SearchBarPortletDisplayContextFactoryTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@BeforeClass
	public static void setUpClass() {
		_configurationProviderUtilMockedStatic = Mockito.mockStatic(
			ConfigurationProviderUtil.class);
	}

	@AfterClass
	public static void tearDownClass() {
		_configurationProviderUtilMockedStatic.close();
	}

	@Before
	public void setUp() throws ConfigurationException {
		_setUpLanguageUtil();
		_setUpPortal();
		_setUpThemeDisplay();
	}

	@Test
	public void testDestinationBlank() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(StringPool.BLANK);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertFalse(
			searchBarPortletDisplayContext.isDestinationUnreachable());
	}

	@Test
	public void testDestinationNull() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(null);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertFalse(
			searchBarPortletDisplayContext.isDestinationUnreachable());
	}

	@Test
	public void testDestinationUnreachable() throws Exception {
		String destination = RandomTestUtil.randomString();

		_whenLayoutLocalServiceFetchLayoutByFriendlyURL(destination, null);

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(destination);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertTrue(
			searchBarPortletDisplayContext.isDestinationUnreachable());
	}

	@Test
	public void testDestinationWithLeadingSlash() throws Exception {
		String destination = RandomTestUtil.randomString();

		Layout layout = Mockito.mock(Layout.class);

		_whenLayoutLocalServiceFetchLayoutByFriendlyURL(destination, layout);

		String layoutFriendlyURL = RandomTestUtil.randomString();

		_whenPortalGetLayoutFriendlyURL(layout, layoutFriendlyURL);

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					StringPool.SLASH.concat(destination));

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertEquals(
			layoutFriendlyURL, searchBarPortletDisplayContext.getSearchURL());

		Assert.assertFalse(
			searchBarPortletDisplayContext.isDestinationUnreachable());
	}

	@Test
	public void testDestinationWithoutLeadingSlash() throws Exception {
		String destination = RandomTestUtil.randomString();

		Layout layout = Mockito.mock(Layout.class);

		_whenLayoutLocalServiceFetchLayoutByFriendlyURL(destination, layout);

		String layoutFriendlyURL = RandomTestUtil.randomString();

		_whenPortalGetLayoutFriendlyURL(layout, layoutFriendlyURL);

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(destination);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertEquals(
			layoutFriendlyURL, searchBarPortletDisplayContext.getSearchURL());

		Assert.assertFalse(
			searchBarPortletDisplayContext.isDestinationUnreachable());
	}

	@Test
	public void testSamePageNoDestination() throws Exception {
		Mockito.doReturn(
			"http://example.com/web/guest/home?param=arg"
		).when(
			_themeDisplay
		).getURLCurrent();

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(null);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertFalse(
			searchBarPortletDisplayContext.isDestinationUnreachable());

		Assert.assertEquals(
			"/web/guest/home", searchBarPortletDisplayContext.getSearchURL());
	}

	@Test
	public void testScopeParameterName() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(null, "sp", null);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertEquals(
			"sp", searchBarPortletDisplayContext.getScopeParameterName());
	}

	@Test
	public void testScopeParameterNameDefault() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(null, null, null);

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertEquals(
			_DEFAULT_SCOPE_PARAMETER_NAME,
			searchBarPortletDisplayContext.getScopeParameterName());
	}

	@Test
	public void testSearchScopePreferenceDefault() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(null, null, null);

		_assertScope(searchBarPortletDisplayContextFactory, false, true, false);
	}

	@Test
	public void testSearchScopePreferenceEverything() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"everything", null, null);

		_assertScope(searchBarPortletDisplayContextFactory, false, false, true);
	}

	@Test
	public void testSearchScopePreferenceLetTheUserChooseEverything()
		throws Exception {

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"let-the-user-choose", null, "everything");

		_assertScope(searchBarPortletDisplayContextFactory, true, false, true);
	}

	@Test
	public void testSearchScopePreferenceLetTheUserChooseInvalidScopeParam()
		throws Exception {

		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage(
			"The string invalid-scope does not correspond to a valid search " +
				"scope");

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"let-the-user-choose", null, "invalid-scope");

		_assertScope(searchBarPortletDisplayContextFactory, true, false, false);
	}

	@Test
	public void testSearchScopePreferenceLetTheUserChooseNoScopeParam()
		throws Exception {

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"let-the-user-choose", null, null);

		_assertScope(searchBarPortletDisplayContextFactory, true, false, false);
	}

	@Test
	public void testSearchScopePreferenceLetTheUserChooseThisSite()
		throws Exception {

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"let-the-user-choose", null, "this-site");

		_assertScope(searchBarPortletDisplayContextFactory, true, true, false);
	}

	@Test
	public void testSearchScopePreferenceThisSite() throws Exception {
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				_createSearchBarPortletDisplayContextFactory(
					"this-site", null, null);

		_assertScope(searchBarPortletDisplayContextFactory, false, true, false);
	}

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	protected HttpServletRequest getHttpServletRequest() {
		HttpServletRequest httpServletRequest = Mockito.mock(
			HttpServletRequest.class);

		Mockito.when(
			(ThemeDisplay)httpServletRequest.getAttribute(WebKeys.THEME_DISPLAY)
		).thenReturn(
			_themeDisplay
		);

		return httpServletRequest;
	}

	protected String getPath(String url) {
		if (Validator.isNull(url)) {
			return url;
		}

		if (url.startsWith(Http.HTTP)) {
			int pos = url.indexOf(
				CharPool.SLASH, Http.HTTPS_WITH_SLASH.length());

			url = url.substring(pos);
		}

		int pos = url.indexOf(CharPool.QUESTION);

		if (pos == -1) {
			return url;
		}

		return url.substring(0, pos);
	}

	private void _assertScope(
		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory,
		boolean expectedLetTheUserChoose, boolean expectedSelectedCurrentSite,
		boolean expectedSelectedEverything) {

		SearchBarPortletDisplayContext searchBarPortletDisplayContext =
			searchBarPortletDisplayContextFactory.create(
				_portletPreferencesLookup, _portletSharedSearchRequest,
				_searchBarPrecedenceHelper, _searchCapabilities);

		Assert.assertEquals(
			expectedLetTheUserChoose,
			searchBarPortletDisplayContext.isLetTheUserChooseTheSearchScope());
		Assert.assertEquals(
			expectedSelectedCurrentSite,
			searchBarPortletDisplayContext.isSelectedCurrentSiteSearchScope());
		Assert.assertEquals(
			expectedSelectedEverything,
			searchBarPortletDisplayContext.isSelectedEverythingSearchScope());
	}

	private LiferayPortletRequest _createLiferayPortletRequest() {
		LiferayPortletRequest liferayPortletRequest = Mockito.mock(
			LiferayPortletRequest.class);

		Mockito.doReturn(
			getHttpServletRequest()
		).when(
			liferayPortletRequest
		).getHttpServletRequest();

		return liferayPortletRequest;
	}

	private SearchBarPortletDisplayContextFactory
			_createSearchBarPortletDisplayContextFactory(String destination)
		throws Exception {

		return _createSearchBarPortletDisplayContextFactory(
			destination, null, null, null);
	}

	private SearchBarPortletDisplayContextFactory
			_createSearchBarPortletDisplayContextFactory(
				String scope, String scopeParameterName,
				String scopeParameterValue)
		throws Exception {

		return _createSearchBarPortletDisplayContextFactory(
			null, scope, scopeParameterName, scopeParameterValue);
	}

	private SearchBarPortletDisplayContextFactory
			_createSearchBarPortletDisplayContextFactory(
				String destination, String scope, String scopeParameterName,
				String scopeParameterValue)
		throws Exception {

		RenderRequest renderRequest = Mockito.mock(RenderRequest.class);

		Mockito.when(
			renderRequest.getAttribute(WebKeys.THEME_DISPLAY)
		).thenReturn(
			_themeDisplay
		);

		SearchBarPortletDisplayContextFactory
			searchBarPortletDisplayContextFactory =
				new SearchBarPortletDisplayContextFactory(
					_layoutLocalService, _portal, renderRequest);

		PortletPreferences portletPreferences = new PortletPreferencesImpl();

		portletPreferences.setValue(
			SearchBarPortletPreferences.PREFERENCE_KEY_DESTINATION,
			destination);
		portletPreferences.setValue(
			SearchBarPortletPreferences.PREFERENCE_KEY_SEARCH_SCOPE, scope);

		if (scopeParameterName != null) {
			portletPreferences.setValue(
				SearchBarPortletPreferences.PREFERENCE_KEY_SCOPE_PARAMETER_NAME,
				scopeParameterName);
		}
		else {
			scopeParameterName = _DEFAULT_SCOPE_PARAMETER_NAME;
		}

		if (scopeParameterValue != null) {
			portletPreferences.setValue(
				scopeParameterName, scopeParameterValue);
		}

		Mockito.when(
			renderRequest.getPreferences()
		).thenReturn(
			portletPreferences
		);

		PortletSharedSearchResponse portletSharedSearchResponse = Mockito.mock(
			PortletSharedSearchResponse.class);

		Mockito.when(
			_portletSharedSearchRequest.search(renderRequest)
		).thenReturn(
			portletSharedSearchResponse
		);

		Mockito.when(
			_searchBarPortletInstanceConfiguration.destination()
		).thenReturn(
			destination
		);

		Mockito.when(
			_searchBarPrecedenceHelper.findHeaderSearchBarPortlet(_themeDisplay)
		).thenReturn(
			null
		);

		Mockito.when(
			portletSharedSearchResponse.getParameter(
				Mockito.eq(scopeParameterName), Mockito.any())
		).thenReturn(
			scopeParameterValue
		);

		SearchResponse searchResponse = Mockito.mock(SearchResponse.class);

		Mockito.when(
			portletSharedSearchResponse.getFederatedSearchResponse(
				Mockito.any())
		).thenReturn(
			searchResponse
		);

		Mockito.when(
			searchResponse.getRequest()
		).thenReturn(
			Mockito.mock(SearchRequest.class)
		);

		Mockito.when(
			portletSharedSearchResponse.getSearchResponse()
		).thenReturn(
			searchResponse
		);

		searchBarPortletDisplayContextFactory = Mockito.spy(
			searchBarPortletDisplayContextFactory);

		Mockito.doReturn(
			_searchSuggestionsCompanyConfiguration
		).when(
			searchBarPortletDisplayContextFactory
		).getSearchSuggestionsCompanyConfiguration(
			0
		);

		return searchBarPortletDisplayContextFactory;
	}

	private void _setUpLanguageUtil() {
		LanguageUtil languageUtil = new LanguageUtil();

		languageUtil.setLanguage(Mockito.mock(Language.class));
	}

	private void _setUpPortal() {
		Mockito.doReturn(
			_createLiferayPortletRequest()
		).when(
			_portal
		).getLiferayPortletRequest(
			Mockito.any()
		);
	}

	private void _setUpThemeDisplay() throws ConfigurationException {
		Mockito.when(
			_themeDisplay.getScopeGroup()
		).thenReturn(
			_group
		);

		Mockito.when(
			_portletDisplay.getPortletResource()
		).thenReturn(
			"test"
		);

		Mockito.when(
			_portletDisplay.getThemeDisplay()
		).thenReturn(
			_themeDisplay
		);

		Mockito.when(
			_themeDisplay.getPortletDisplay()
		).thenReturn(
			_portletDisplay
		);

		_configurationProviderUtilMockedStatic.when(
			() -> ConfigurationProviderUtil.getPortletInstanceConfiguration(
				Mockito.any(), Mockito.any())
		).thenReturn(
			_searchBarPortletInstanceConfiguration
		);
	}

	private void _whenLayoutLocalServiceFetchLayoutByFriendlyURL(
		String friendlyURL, Layout layout) {

		if (!StringUtil.startsWith(friendlyURL, CharPool.SLASH)) {
			friendlyURL = StringPool.SLASH.concat(friendlyURL);
		}

		Mockito.doReturn(
			layout
		).when(
			_layoutLocalService
		).fetchLayoutByFriendlyURL(
			Mockito.anyLong(), Mockito.anyBoolean(), Mockito.eq(friendlyURL)
		);
	}

	private void _whenPortalGetLayoutFriendlyURL(
			Layout layout, String layoutFriendlyURL)
		throws Exception {

		Mockito.doReturn(
			layoutFriendlyURL
		).when(
			_portal
		).getLayoutFriendlyURL(
			Mockito.eq(layout), Mockito.any()
		);
	}

	private static final String _DEFAULT_SCOPE_PARAMETER_NAME = "scope";

	private static MockedStatic<ConfigurationProviderUtil>
		_configurationProviderUtilMockedStatic;

	private final Group _group = Mockito.mock(Group.class);
	private final LayoutLocalService _layoutLocalService = Mockito.mock(
		LayoutLocalService.class);
	private final Portal _portal = Mockito.mock(Portal.class);
	private final PortletDisplay _portletDisplay = Mockito.mock(
		PortletDisplay.class);
	private final PortletPreferencesLookup _portletPreferencesLookup =
		Mockito.mock(PortletPreferencesLookup.class);
	private final PortletSharedSearchRequest _portletSharedSearchRequest =
		Mockito.mock(PortletSharedSearchRequest.class);
	private final SearchBarPortletInstanceConfiguration
		_searchBarPortletInstanceConfiguration = Mockito.mock(
			SearchBarPortletInstanceConfiguration.class);
	private final SearchBarPrecedenceHelper _searchBarPrecedenceHelper =
		Mockito.mock(SearchBarPrecedenceHelper.class);
	private final SearchCapabilities _searchCapabilities = Mockito.mock(
		SearchCapabilities.class);
	private final SearchSuggestionsCompanyConfiguration
		_searchSuggestionsCompanyConfiguration = Mockito.mock(
			SearchSuggestionsCompanyConfiguration.class);
	private final ThemeDisplay _themeDisplay = Mockito.mock(ThemeDisplay.class);

}