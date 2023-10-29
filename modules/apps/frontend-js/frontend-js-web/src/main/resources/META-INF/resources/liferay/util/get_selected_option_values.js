/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

export default function getSelectedOptionValues(select, delimiter = ',') {
	const optionsArray = Array.from(select.getElementsByTagName('option'));

	return optionsArray
		.reduce((previous, item) => {
			const {value} = item;

			if (value) {
				previous.push(value);
			}

			return previous;
		}, [])
		.join(delimiter);
}
