/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {
	COOKIE_TYPES,
	getCookie as getCookieUtil,
	setCookie as setCookieUtil,
} from 'frontend-js-web';

export const userConfigCookieName = 'USER_CONSENT_CONFIGURED';

export function acceptAllCookies(
	optionalConsentCookieTypeNames,
	requiredConsentCookieTypeNames
) {
	optionalConsentCookieTypeNames.forEach((optionalConsentCookieTypeName) => {
		setCookie(optionalConsentCookieTypeName, 'true');
	});

	requiredConsentCookieTypeNames.forEach((requiredConsentCookieTypeName) => {
		setCookie(requiredConsentCookieTypeName, 'true');
	});
}

export function declineAllCookies(
	optionalConsentCookieTypeNames,
	requiredConsentCookieTypeNames
) {
	optionalConsentCookieTypeNames.forEach((optionalConsentCookieTypeName) => {
		setCookie(optionalConsentCookieTypeName, 'false');
	});

	requiredConsentCookieTypeNames.forEach((requiredConsentCookieTypeName) => {
		setCookie(requiredConsentCookieTypeName, 'true');
	});
}

export function getCookie(name) {
	return getCookieUtil(name, COOKIE_TYPES.NECESSARY);
}

export function setCookie(name, value) {
	setCookieUtil(name, value, COOKIE_TYPES.NECESSARY);
}

export function setUserConfigCookie() {
	setCookie(userConfigCookieName, 'true');
}
