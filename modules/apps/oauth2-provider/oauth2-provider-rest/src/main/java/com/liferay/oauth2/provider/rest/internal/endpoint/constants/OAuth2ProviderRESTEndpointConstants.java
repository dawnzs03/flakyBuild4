/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.rest.internal.endpoint.constants;

/**
 * @author Tomas Polesovsky
 */
public class OAuth2ProviderRESTEndpointConstants {

	/**
	 * Embraces CXF OAuthConstants naming + RFC grant_type value formats.
	 */
	public static final String AUTHORIZATION_CODE_PKCE_GRANT =
		"authorization_code_pkce";

	public static final String COOKIE_NAME_REMEMBER_DEVICE_PREFIX =
		"OAUTH2_REMEMBER_DEVICE_";

	public static final String PROPERTY_KEY_CLIENT_FEATURE_PREFIX = "feature.";

	public static final String PROPERTY_KEY_CLIENT_FEATURE_TOKEN_INTROSPECTION =
		"token.introspection";

	public static final String PROPERTY_KEY_CLIENT_FEATURES = "features";

	public static final String PROPERTY_KEY_CLIENT_JWKS = "jwks";

	public static final String PROPERTY_KEY_CLIENT_REMEMBER_DEVICE =
		"remember.device";

	public static final String PROPERTY_KEY_CLIENT_REMOTE_ADDR =
		"client.remote.addr";

	public static final String PROPERTY_KEY_CLIENT_REMOTE_HOST =
		"client.remote.host";

	public static final String PROPERTY_KEY_CLIENT_TRUSTED_APPLICATION =
		"trusted.application";

	public static final String PROPERTY_KEY_COMPANY_ID = "company.id";

	public static final String PROPERTY_KEY_REMEMBER_DEVICE =
		"oauth2.remember.device";

}