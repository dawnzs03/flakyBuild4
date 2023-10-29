/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.osb.faro.web.internal.spi.bearer.token.provider;

import com.liferay.oauth2.provider.rest.spi.bearer.token.provider.BearerTokenProvider;
import com.liferay.osb.faro.web.internal.util.AccessTokenExpiresInUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.io.BigEndianCodec;
import com.liferay.portal.kernel.security.SecureRandomUtil;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ivica Cardic
 */
@Component(
	property = {"name=default", "service.ranking:Integer=100"},
	service = BearerTokenProvider.class
)
public class AnalyticsCloudBearerTokenProvider implements BearerTokenProvider {

	@Override
	public boolean isValid(AccessToken accessToken) {
		return isValid(accessToken.getExpiresIn(), accessToken.getIssuedAt());
	}

	@Override
	public void onBeforeCreate(AccessToken accessToken) {
		accessToken.setExpiresIn(AccessTokenExpiresInUtil.getExpiresIn());
		accessToken.setTokenKey(generateTokenKey(32));
	}

	protected String generateTokenKey(int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Token key size is less than 0");
		}

		int count = (int)Math.ceil((double)size / 8);

		byte[] buffer = new byte[count * 8];

		for (int i = 0; i < count; i++) {
			BigEndianCodec.putLong(buffer, i * 8, SecureRandomUtil.nextLong());
		}

		StringBundler sb = new StringBundler(size);

		for (int i = 0; i < size; i++) {
			sb.append(Integer.toHexString(0xFF & buffer[i]));
		}

		return sb.toString();
	}

	protected boolean isValid(long expiresIn, long issuedAt) {
		long expiresInMillis = expiresIn * 1000;

		if (expiresInMillis < 0) {
			return false;
		}

		long issuedAtMillis = issuedAt * 1000;

		if ((issuedAtMillis > System.currentTimeMillis()) ||
			((issuedAtMillis + expiresInMillis) < System.currentTimeMillis())) {

			return false;
		}

		return true;
	}

}