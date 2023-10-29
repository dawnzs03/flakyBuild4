/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {StyleErrorsContextProvider} from '@liferay/layout-js-components-web';
import React from 'react';

import LayoutPreview from './LayoutPreview';
import Sidebar from './Sidebar';
import Toolbar from './Toolbar';
import {config, initializeConfig} from './config';
import {DRAFT_STATUS} from './constants/draftStatusConstants';
import {LAYOUT_TYPES} from './constants/layoutTypes';
import {LayoutContextProvider} from './contexts/LayoutContext';
import {StyleBookEditorContextProvider} from './contexts/StyleBookEditorContext';
import {useCloseProductMenu} from './useCloseProductMenu';

const StyleBookEditor = React.memo(() => {
	useCloseProductMenu();

	return (
		<div className="cadmin d-flex flex-wrap style-book-editor">
			<StyleErrorsContextProvider>
				<LayoutContextProvider
					initialState={{
						previewLayout: getMostRecentLayout(
							config.previewOptions
						),
						previewLayoutType: config.previewOptions.find((type) =>
							type.data.recentLayouts.find(
								(layout) =>
									layout ===
									getMostRecentLayout(config.previewOptions)
							)
						)?.type,
					}}
				>
					<Toolbar />

					<LayoutPreview />
				</LayoutContextProvider>

				<Sidebar />
			</StyleErrorsContextProvider>
		</div>
	);
});

export default function ({
	fragmentCollectionPreviewURL = '',
	frontendTokenDefinition = [],
	frontendTokensValues = {},
	isPrivateLayoutsEnabled,
	namespace,
	previewOptions,
	publishURL,
	redirectURL,
	saveDraftURL,
	styleBookEntryId,
	themeName,
} = {}) {
	initializeConfig({
		fragmentCollectionPreviewURL,
		frontendTokenDefinition,
		frontendTokens: getFrontendTokens(frontendTokenDefinition),
		isPrivateLayoutsEnabled,
		namespace,
		previewOptions,
		publishURL,
		redirectURL,
		saveDraftURL,
		styleBookEntryId,
		themeName,
	});

	return (
		<StyleBookEditorContextProvider
			initialState={{
				draftStatus: DRAFT_STATUS.notSaved,
				frontendTokensValues,
				redoHistory: [],
				undoHistory: [],
			}}
		>
			<StyleBookEditor />
		</StyleBookEditorContextProvider>
	);
}

function getMostRecentLayout(previewOptions) {
	const types = [
		LAYOUT_TYPES.page,
		LAYOUT_TYPES.master,
		LAYOUT_TYPES.pageTemplate,
		LAYOUT_TYPES.displayPageTemplate,
		LAYOUT_TYPES.fragmentCollection,
	];

	for (let i = 0; i < types.length; i++) {
		const layouts = previewOptions.find(
			(option) => option.type === types[i]
		).data.recentLayouts;

		if (layouts.length) {
			return layouts[0];
		}
	}

	return null;
}

const getFrontendTokens = ({frontendTokenCategories}) => {
	let tokens = {};

	if (!frontendTokenCategories) {
		return tokens;
	}

	for (const category of frontendTokenCategories) {
		for (const tokenSet of category.frontendTokenSets) {
			for (const token of tokenSet.frontendTokens) {
				tokens = {
					...tokens,
					[token.name]: {
						...token,
						tokenCategoryLabel: category.label,
						tokenSetLabel: tokenSet.label,
						value: token.defaultValue,
					},
				};
			}
		}
	}

	return tokens;
};
