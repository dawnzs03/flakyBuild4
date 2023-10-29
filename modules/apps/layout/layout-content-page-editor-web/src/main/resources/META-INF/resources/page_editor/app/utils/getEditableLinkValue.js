/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {getEditableLocalizedValue} from './getEditableLocalizedValue';

export function getEditableLinkValue(editableValue, languageId) {
	return {
		...(typeof editableValue === 'object' && editableValue
			? editableValue
			: {}),

		href: getEditableLocalizedValue(editableValue?.href, languageId),
		rel: editableValue?.rel || '',
		target: editableValue?.target || '',
	};
}
