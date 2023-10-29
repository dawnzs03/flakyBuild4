/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.oauth2.provider.util;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.io.BigEndianCodec;
import com.liferay.portal.kernel.security.SecureRandomUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tomas Polesovsky
 */
public class OAuth2SecureRandomGenerator {

	public static String generateClientId() {
		Matcher matcher = _baseIdPattern.matcher(generateSecureRandomString());

		return matcher.replaceFirst("id-$1-$2-$3-$4-$5");
	}

	public static String generateClientSecret() {
		Matcher matcher = _baseIdPattern.matcher(generateSecureRandomString());

		return matcher.replaceFirst("secret-$1-$2-$3-$4-$5");
	}

	protected static String generateSecureRandomString() {
		int size = 16;

		StringBundler sb = new StringBundler(size);

		int count = (int)Math.ceil((double)size / 8);

		byte[] buffer = new byte[count * 8];

		for (int i = 0; i < count; i++) {
			BigEndianCodec.putLong(buffer, i * 8, SecureRandomUtil.nextLong());
		}

		for (int i = 0; i < size; i++) {
			sb.append(Integer.toHexString(0xFF & buffer[i]));
		}

		return sb.toString();
	}

	private static final Pattern _baseIdPattern = Pattern.compile(
		"(.{8})(.{4})(.{4})(.{4})(.*)");

}