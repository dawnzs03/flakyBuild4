/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

const Liferay = {
	Language: {
		available: {
			ar_SA: 'Arabic (Saudi Arabia)',
			ca_ES: 'Catalan (Spain)',
			de_DE: 'German (Germany)',
			en_US: 'English (United States)',
			es_ES: 'Spanish (Spain)',
			fi_FI: 'Finnish (Finland)',
			fr_FR: 'French (France)',
			hu_HU: 'Hungarian (Hungary)',
			ja_JP: 'Japanese (Japan)',
			nl_NL: 'Dutch (Netherlands)',
			pt_BR: 'Portuguese (Brazil)',
			sv_SE: 'Swedish (Sweden)',
			zh_CN: 'Chinese (China)',
		},
		get: (key) => {
			let counter = 0;

			return key.replace(new RegExp('(^x-)|(-x-)|(-x$)', 'gm'), (match) =>
				match.replace('x', `{${counter++}}`)
			);
		},
	},
	ThemeDisplay: {
		getBCP47LanguageId: () => 'en-US',
		getCanonicalURL: () => '/',
		getDefaultLanguageId: () => 'en_US',
		getDoAsUserIdEncoded: () => '',
		getLanguageId: () => 'it_IT',
		getPathContext: () => '',
		getPathThemeImages: () => '/assets',
		getPortalURL: () => window.location.origin,
		getScopeGroupId: () => '123',
	},
	Util: {
		sub: (key, ...values) => {
			return values.reduce(
				(acc, value, i) => acc.replace(new RegExp(`{[${i}]}`), value),
				key
			);
		},
	},
	component: () => {},
	detach: (name, fn) => {
		window.removeEventListener(name, fn);
	},
	fire: (name, payload) => {
		const event = document.createEvent('CustomEvent');
		event.initCustomEvent(name);
		if (payload) {
			Object.keys(payload).forEach((key) => {
				event[key] = payload[key];
			});
		}
		window.dispatchEvent(event);
	},
	on: (name, fn) => {
		window.addEventListener(name, fn);
	},
	staticEnvTestUtils: {
		print: (message, type) => ({message, type}),
	},
};

window.defaultFetch = fetch;

window.fetch = (resource, {headers, ...init}) => {
	headers = new Headers({
		'Accept': 'application/json',
		'Authorization': `Basic ${window.btoa('test@liferay.com:test')}`,
		'Content-Type': 'application/json',
	});

	// eslint-disable-next-line @liferay/portal/no-global-fetch
	return window.defaultFetch(resource, {
		...init,
		headers,
	});
};

window.Liferay = Liferay;
window.themeDisplay = Liferay.ThemeDisplay;
