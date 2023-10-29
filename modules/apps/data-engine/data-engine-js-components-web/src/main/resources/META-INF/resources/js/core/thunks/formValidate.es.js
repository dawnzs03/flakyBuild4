/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {evaluate} from '../../utils/evaluation.es';
import {PagesVisitor} from '../../utils/visitors.es';
import {EVENT_TYPES} from '../actions/eventTypes.es';

export default function formValidate({
	activePage,
	defaultLanguageId,
	editingLanguageId,
	formId,
	groupId,
	pages,
	portletNamespace,
	rules,
	viewMode,
}) {
	return (dispatch) => {
		return evaluate(null, {
			defaultLanguageId,
			editingLanguageId,
			formId,
			groupId,
			pages,
			portletNamespace,
			rules,
			viewMode,
		}).then((evaluatedPages) => {
			let validForm = true;
			const visitor = new PagesVisitor(evaluatedPages);

			visitor.mapFields(
				({valid}) => {
					if (!valid) {
						validForm = false;
					}
				},
				true,
				true
			);

			if (!validForm) {
				dispatch({
					payload: {
						newPages: evaluatedPages,
						pageIndex: activePage,
					},
					type: EVENT_TYPES.PAGE.VALIDATION_FAILED,
				});
			}

			return Promise.resolve(validForm);
		});
	};
}
