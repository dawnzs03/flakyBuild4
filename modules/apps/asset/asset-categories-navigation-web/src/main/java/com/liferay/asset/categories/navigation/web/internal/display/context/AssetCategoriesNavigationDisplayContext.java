/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.categories.navigation.web.internal.display.context;

import com.liferay.asset.categories.navigation.web.internal.configuration.AssetCategoriesNavigationPortletInstanceConfiguration;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.model.AssetVocabularyConstants;
import com.liferay.asset.kernel.service.AssetVocabularyServiceUtil;
import com.liferay.depot.util.SiteConnectedGroupGroupProviderUtil;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.portal.configuration.module.configuration.ConfigurationProviderUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.KeyValuePairComparator;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eudaldo Alonso
 */
public class AssetCategoriesNavigationDisplayContext {

	public AssetCategoriesNavigationDisplayContext(
			HttpServletRequest httpServletRequest)
		throws ConfigurationException {

		_httpServletRequest = httpServletRequest;

		_assetCategoriesNavigationPortletInstanceConfiguration =
			ConfigurationProviderUtil.getPortletInstanceConfiguration(
				AssetCategoriesNavigationPortletInstanceConfiguration.class,
				(ThemeDisplay)httpServletRequest.getAttribute(
					WebKeys.THEME_DISPLAY));
	}

	public AssetCategoriesNavigationPortletInstanceConfiguration
		getAssetCategoriesNavigationPortletInstanceConfiguration() {

		return _assetCategoriesNavigationPortletInstanceConfiguration;
	}

	public List<AssetVocabulary> getAssetVocabularies() {
		if (_assetVocabularies != null) {
			return _assetVocabularies;
		}

		ThemeDisplay themeDisplay =
			(ThemeDisplay)_httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		long[] groupIds = new long[0];

		try {
			groupIds =
				SiteConnectedGroupGroupProviderUtil.
					getCurrentAndAncestorSiteAndDepotGroupIds(
						themeDisplay.getScopeGroupId());
		}
		catch (PortalException portalException) {
			groupIds = new long[] {themeDisplay.getScopeGroupId()};

			_log.error(portalException);
		}

		_assetVocabularies = AssetVocabularyServiceUtil.getGroupVocabularies(
			groupIds,
			new int[] {AssetVocabularyConstants.VISIBILITY_TYPE_PUBLIC});

		return _assetVocabularies;
	}

	public long[] getAssetVocabularyIds() {
		if (_assetVocabularyIds != null) {
			return _assetVocabularyIds;
		}

		_assetVocabularyIds = TransformUtil.transformToLongArray(
			getDDMTemplateAssetVocabularies(),
			AssetVocabulary::getVocabularyId);

		return _assetVocabularyIds;
	}

	public long[] getAvailableAssetVocabularyIds() {
		if (_availableAssetVocabularyIds != null) {
			return _availableAssetVocabularyIds;
		}

		_availableAssetVocabularyIds = TransformUtil.transformToLongArray(
			getAssetVocabularies(), AssetVocabulary::getVocabularyId);

		return _availableAssetVocabularyIds;
	}

	public List<KeyValuePair> getAvailableVocabularyNames() {
		List<AssetVocabulary> ddmTemplateAssetVocabularies =
			getDDMTemplateAssetVocabularies();

		List<KeyValuePair> vocabularyNames = TransformUtil.transform(
			getAssetVocabularies(),
			assetVocabulary -> {
				if (ddmTemplateAssetVocabularies.contains(assetVocabulary)) {
					return null;
				}

				return _toKeyValuePair(assetVocabulary);
			});

		vocabularyNames.sort(new KeyValuePairComparator(false, true));

		return vocabularyNames;
	}

	public List<KeyValuePair> getCurrentVocabularyNames() {
		return TransformUtil.transform(
			getDDMTemplateAssetVocabularies(),
			assetVocabulary -> _toKeyValuePair(assetVocabulary));
	}

	public List<AssetVocabulary> getDDMTemplateAssetVocabularies() {
		if (_ddmTemplateAssetVocabularies != null) {
			return _ddmTemplateAssetVocabularies;
		}

		String[] assetVocabularyIds =
			_assetCategoriesNavigationPortletInstanceConfiguration.
				assetVocabularyIds();

		if (_assetCategoriesNavigationPortletInstanceConfiguration.
				allAssetVocabularies() ||
			(assetVocabularyIds == null)) {

			_ddmTemplateAssetVocabularies = getAssetVocabularies();
		}
		else {
			_ddmTemplateAssetVocabularies = TransformUtil.transformToList(
				StringUtil.split(StringUtil.merge(assetVocabularyIds), 0L),
				assetVocabularyId -> {
					try {
						return AssetVocabularyServiceUtil.fetchVocabulary(
							assetVocabularyId);
					}
					catch (PrincipalException principalException) {
						if (_log.isWarnEnabled()) {
							_log.warn(
								"User does not have permission to access " +
									"asset vocabulary " + assetVocabularyId,
								principalException);
						}
					}

					return null;
				});
		}

		return _ddmTemplateAssetVocabularies;
	}

	public long getDisplayStyleGroupId() {
		if (_displayStyleGroupId != 0) {
			return _displayStyleGroupId;
		}

		_displayStyleGroupId =
			_assetCategoriesNavigationPortletInstanceConfiguration.
				displayStyleGroupId();

		if (_displayStyleGroupId <= 0) {
			ThemeDisplay themeDisplay =
				(ThemeDisplay)_httpServletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			_displayStyleGroupId = themeDisplay.getScopeGroupId();
		}

		return _displayStyleGroupId;
	}

	private String _getTitle(AssetVocabulary assetVocabulary) {
		ThemeDisplay themeDisplay =
			(ThemeDisplay)_httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		String title = HtmlUtil.escape(
			assetVocabulary.getTitle(themeDisplay.getLanguageId()));

		if (assetVocabulary.getGroupId() == themeDisplay.getCompanyGroupId()) {
			title +=
				" (" + LanguageUtil.get(_httpServletRequest, "global") + ")";
		}

		return title;
	}

	private KeyValuePair _toKeyValuePair(AssetVocabulary assetVocabulary) {
		return new KeyValuePair(
			String.valueOf(assetVocabulary.getVocabularyId()),
			_getTitle(assetVocabulary));
	}

	private static final Log _log = LogFactoryUtil.getLog(
		AssetCategoriesNavigationDisplayContext.class);

	private final AssetCategoriesNavigationPortletInstanceConfiguration
		_assetCategoriesNavigationPortletInstanceConfiguration;
	private List<AssetVocabulary> _assetVocabularies;
	private long[] _assetVocabularyIds;
	private long[] _availableAssetVocabularyIds;
	private List<AssetVocabulary> _ddmTemplateAssetVocabularies;
	private long _displayStyleGroupId;
	private final HttpServletRequest _httpServletRequest;

}