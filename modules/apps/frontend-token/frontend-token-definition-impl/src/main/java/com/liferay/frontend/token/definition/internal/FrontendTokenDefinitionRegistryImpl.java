/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.frontend.token.definition.internal;

import com.liferay.frontend.token.definition.FrontendTokenDefinition;
import com.liferay.frontend.token.definition.FrontendTokenDefinitionRegistry;
import com.liferay.petra.concurrent.DCLSingleton;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PortletConstants;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoader;
import com.liferay.portal.kernel.resource.bundle.ResourceBundleLoaderUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.util.Dictionary;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

/**
 * @author Iván Zaera
 */
@Component(service = FrontendTokenDefinitionRegistry.class)
public class FrontendTokenDefinitionRegistryImpl
	implements FrontendTokenDefinitionRegistry {

	@Override
	public FrontendTokenDefinition getFrontendTokenDefinition(String themeId) {
		Map<String, FrontendTokenDefinitionImpl>
			themeIdFrontendTokenDefinitionImpls =
				_themeIdFrontendTokenDefinitionImplsDCLSingleton.getSingleton(
					() -> {
						_bundleTracker.open();

						return _themeIdFrontendTokenDefinitionImpls;
					});

		return themeIdFrontendTokenDefinitionImpls.get(themeId);
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_bundleTracker = new BundleTracker<>(
			bundleContext, Bundle.ACTIVE, _bundleTrackerCustomizer);
	}

	@Deactivate
	protected void deactivate() {
		_bundleTracker.close();
	}

	protected FrontendTokenDefinitionImpl getFrontendTokenDefinitionImpl(
		Bundle bundle) {

		String json = _getFrontendTokenDefinitionJSON(bundle);

		if (json == null) {
			return null;
		}

		String themeId = getThemeId(bundle);

		try {
			ResourceBundleLoader resourceBundleLoader =
				ResourceBundleLoaderUtil.
					getResourceBundleLoaderByBundleSymbolicName(
						bundle.getSymbolicName());

			if (resourceBundleLoader == null) {
				resourceBundleLoader =
					ResourceBundleLoaderUtil.getPortalResourceBundleLoader();
			}

			return new FrontendTokenDefinitionImpl(
				jsonFactory.createJSONObject(json), jsonFactory,
				resourceBundleLoader, themeId);
		}
		catch (JSONException | RuntimeException exception) {
			_log.error(
				"Unable to parse frontend token definitions for theme " +
					themeId,
				exception);
		}

		return null;
	}

	protected String getServletContextName(Bundle bundle) {
		Dictionary<String, String> headers = bundle.getHeaders(
			StringPool.BLANK);

		String webContextPath = headers.get("Web-ContextPath");

		if (webContextPath == null) {
			return null;
		}

		if (webContextPath.startsWith(StringPool.SLASH)) {
			webContextPath = webContextPath.substring(1);
		}

		return webContextPath;
	}

	protected String getThemeId(Bundle bundle) {
		URL url = bundle.getEntry("WEB-INF/liferay-look-and-feel.xml");

		if (url == null) {
			return null;
		}

		try (InputStream inputStream = url.openStream()) {
			String xml = StringUtil.read(inputStream);

			xml = xml.replaceAll(StringPool.NEW_LINE, StringPool.SPACE);

			Matcher matcher = _themeIdPattern.matcher(xml);

			if (!matcher.matches()) {
				return null;
			}

			String themeId = matcher.group(1);

			String servletContextName = getServletContextName(bundle);

			if (servletContextName != null) {
				themeId =
					themeId + PortletConstants.WAR_SEPARATOR +
						servletContextName;
			}

			return portal.getJsSafePortletId(themeId);
		}
		catch (IOException ioException) {
			throw new RuntimeException(
				"Unable to read WEB-INF/liferay-look-and-feel.xml",
				ioException);
		}
	}

	@Reference
	protected JSONFactory jsonFactory;

	@Reference
	protected Portal portal;

	private String _getFrontendTokenDefinitionJSON(Bundle bundle) {
		URL url = bundle.getEntry("WEB-INF/frontend-token-definition.json");

		if (url == null) {
			return null;
		}

		try (InputStream inputStream = url.openStream()) {
			return StringUtil.read(inputStream);
		}
		catch (IOException ioException) {
			throw new RuntimeException(
				"Unable to read WEB-INF/frontend-token-definition.json",
				ioException);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		FrontendTokenDefinitionRegistryImpl.class);

	private static final Pattern _themeIdPattern = Pattern.compile(
		".*<theme id=\"([^\"]*)\"[^>]*>.*");

	private BundleTracker<FrontendTokenDefinitionImpl> _bundleTracker;

	private final BundleTrackerCustomizer<FrontendTokenDefinitionImpl>
		_bundleTrackerCustomizer =
			new BundleTrackerCustomizer<FrontendTokenDefinitionImpl>() {

				@Override
				public FrontendTokenDefinitionImpl addingBundle(
					Bundle bundle, BundleEvent bundleEvent) {

					FrontendTokenDefinitionImpl frontendTokenDefinitionImpl =
						getFrontendTokenDefinitionImpl(bundle);

					if ((frontendTokenDefinitionImpl != null) &&
						(frontendTokenDefinitionImpl.getThemeId() != null)) {

						_themeIdFrontendTokenDefinitionImpls.put(
							frontendTokenDefinitionImpl.getThemeId(),
							frontendTokenDefinitionImpl);

						return frontendTokenDefinitionImpl;
					}

					return null;
				}

				@Override
				public void modifiedBundle(
					Bundle bundle, BundleEvent bundleEvent,
					FrontendTokenDefinitionImpl frontendTokenDefinitionImpl) {
				}

				@Override
				public void removedBundle(
					Bundle bundle, BundleEvent bundleEvent,
					FrontendTokenDefinitionImpl frontendTokenDefinitionImpl) {

					_themeIdFrontendTokenDefinitionImpls.remove(
						frontendTokenDefinitionImpl.getThemeId());
				}

			};

	private final Map<String, FrontendTokenDefinitionImpl>
		_themeIdFrontendTokenDefinitionImpls = new ConcurrentHashMap<>();
	private final DCLSingleton<Map<String, FrontendTokenDefinitionImpl>>
		_themeIdFrontendTokenDefinitionImplsDCLSingleton = new DCLSingleton<>();

}