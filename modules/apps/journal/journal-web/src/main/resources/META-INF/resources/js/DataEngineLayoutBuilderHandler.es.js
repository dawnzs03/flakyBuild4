/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {openToast, postForm, sub} from 'frontend-js-web';

import openStructureKeyChangesModal from './modals/openStructureKeyChangesModal';

const isElementInnerSelector = (element, ...selectors) =>
	!selectors.some((selector) => element.closest(selector));

export default function DataEngineLayoutBuilderHandler({
	namespace,
	originalStructureKey,
	showStructureKeyChangesWarning,
}) {
	const form = document.getElementById(`${namespace}fm`);

	// Clean the input if the language is not considered translated when
	// submitting the form

	const clearNameInputIfNeeded = (defaultLanguageId) => {
		const inputComponent = Liferay.component(`${namespace}name`);

		if (inputComponent) {
			const selectedLanguageId = document.getElementById(
				`${namespace}languageId`
			).value;
			const translatedLanguages = inputComponent.get(
				'translatedLanguages'
			);

			if (
				!translatedLanguages.has(selectedLanguageId) &&
				selectedLanguageId !== defaultLanguageId
			) {
				inputComponent.updateInput('');

				const form = Liferay.Form.get(`${namespace}fm`);

				if (form) {
					form.removeRule(`${namespace}name`, 'required');
				}
			}
		}
	};

	const getDataLayoutBuilder = () => {
		return Liferay.componentReady(`${namespace}dataLayoutBuilder`);
	};

	const getInputLocalizedValues = (fieldName) => {
		const inputLocalized = Liferay.component(`${namespace}${fieldName}`);
		const localizedValues = {};

		if (inputLocalized) {
			const translatedLanguages = inputLocalized
				.get('translatedLanguages')
				.values();

			translatedLanguages.forEach((languageId) => {
				localizedValues[languageId] = inputLocalized.getValue(
					languageId
				);
			});
		}

		return localizedValues;
	};

	const saveDataEngineStructure = async () => {
		const dataLayoutBuilder = await getDataLayoutBuilder();
		const {dataDefinition, dataLayout} = dataLayoutBuilder.current.state;
		const {defaultLanguageId} = dataDefinition;

		const nameInput = document.getElementById(`${namespace}name`);
		const name = getInputLocalizedValues('name');
		const description = getInputLocalizedValues('description');

		if (!nameInput.value && !name[defaultLanguageId]) {
			openToast({
				message: sub(
					Liferay.Language.get(
						'please-enter-a-valid-title-for-the-default-language-x'
					),
					defaultLanguageId.replaceAll('_', '-')
				),
				title: Liferay.Language.get('error'),
				type: 'danger',
			});

			nameInput.focus();

			return;
		}

		const structureKeyInput = document.getElementById(
			`${namespace}structureKey`
		);

		if (
			showStructureKeyChangesWarning &&
			structureKeyInput.value !== originalStructureKey
		) {
			openStructureKeyChangesModal({
				onSave: () => {
					clearNameInputIfNeeded(defaultLanguageId);

					postForm(form, {
						data: {
							dataDefinition: JSON.stringify({
								...dataDefinition.serialize(),
								description,
								name,
							}),
							dataLayout: JSON.stringify({
								...dataLayout.serialize(),
								description,
								name,
							}),
						},
					});
				},
			});

			return;
		}

		clearNameInputIfNeeded(defaultLanguageId);

		postForm(form, {
			data: {
				dataDefinition: JSON.stringify({
					...dataDefinition.serialize(),
					description,
					name,
				}),
				dataLayout: JSON.stringify({
					...dataLayout.serialize(),
					description,
					name,
				}),
			},
		});
	};

	form.addEventListener('submit', saveDataEngineStructure);

	// Deselect field when clicking outside the form builder

	const detectClickOutside = async ({target}) => {
		if (
			isElementInnerSelector(
				target,
				'.cke_dialog',
				'.ddm-form-builder-wrapper',
				'.input-localized-content',
				'.lfr-icon-menu-open',
				'.multi-panel-sidebar'
			)
		) {
			const dataLayoutBuilder = await getDataLayoutBuilder();

			dataLayoutBuilder.current.dispatch({
				submitButtonId: `${namespace}submitButton`,
				type: 'sidebar_field_blur',
			});
		}
	};

	window.addEventListener('mousedown', detectClickOutside, true);

	// Update editing language id in the data engine side

	const updateEditingLanguageId = async (event) => {
		const editingLanguageId = event.item.getAttribute('data-value');
		const dataLayoutBuilder = await getDataLayoutBuilder();

		dataLayoutBuilder.current.dispatch({
			payload: {languageId: editingLanguageId},
			type: 'language_add',
		});

		dataLayoutBuilder.current.dispatch({
			payload: {editingLanguageId},
			type: 'language_change',
		});
	};

	Liferay.after('inputLocalized:localeChanged', updateEditingLanguageId);

	return {
		dispose() {
			form.removeEventListener('submit', saveDataEngineStructure);
			window.removeEventListener('mousedown', detectClickOutside, true);
		},
	};
}
