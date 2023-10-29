/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {isNullOrUndefined} from '@liferay/layout-js-components-web';

import {getEditableLinkValue} from '../utils/getEditableLinkValue';
import getAlloyEditorProcessor from './getAlloyEditorProcessor';
import {getLinkableEditableEditorWrapper} from './getLinkableEditableEditorWrapper';

export default getAlloyEditorProcessor(
	'text',
	getLinkableEditableEditorWrapper,
	(element, value, editableConfig = {}, languageId) => {
		const link = getEditableLinkValue(editableConfig, languageId);

		if (link.href) {
			let anchor =
				element instanceof HTMLAnchorElement
					? element
					: element.querySelector('a');

			if (!anchor) {
				anchor = document.createElement('a');
			}

			anchor.href = `${editableConfig.prefix || ''}${link.href}`;
			anchor.rel = link.rel;
			anchor.target = link.target || '';
			anchor.innerHTML = value;

			if (!element.contains(anchor)) {
				element.innerHTML = anchor.outerHTML;
			}
		}
		else if (!isNullOrUndefined(value)) {
			element.innerHTML = value;
		}
	}
);
