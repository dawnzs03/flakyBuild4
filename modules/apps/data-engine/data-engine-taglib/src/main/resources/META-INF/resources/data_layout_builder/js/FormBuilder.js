/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayLayout from '@clayui/layout';
import {Context as ModalContext} from '@clayui/modal';
import classNames from 'classnames';
import {
	EVENT_TYPES as CORE_EVENT_TYPES,
	Pages,
	useConfig,
	useForm,
	useFormState,
} from 'data-engine-js-components-web';
import fieldDelete from 'data-engine-js-components-web/js/core/thunks/fieldDelete.es';
import React, {useContext, useEffect, useMemo, useState} from 'react';

import MultiPanelSidebar from './components/sidebar/MultiPanelSidebar.es';
import initializeSidebarConfig from './components/sidebar/initializeSidebarConfig.es';
import DragLayer from './drag-and-drop/DragLayer.es';
import {EVENT_TYPES} from './eventTypes';
import {getItem} from './utils/client.es';

export function FormBuilder() {
	const dispatch = useForm();
	const [{onClose}, modalDispatch] = useContext(ModalContext);
	const {
		focusedField,
		rules,
		sidebarPanels: initialSidebarPanels,
	} = useFormState();

	const {
		allowFieldSets,
		contentType,
		dataDefinitionId,
		groupId,
		portletNamespace,
	} = useConfig();

	const [{sidebarOpen, sidebarPanelId}, setSidebarState] = useState({
		sidebarOpen: true,
		sidebarPanelId: 'fields',
	});

	const {panels, sidebarPanels, sidebarVariant} = useMemo(
		() =>
			initializeSidebarConfig({
				portletNamespace,
				sidebarPanels: initialSidebarPanels,
			}),
		[initialSidebarPanels, portletNamespace]
	);

	/**
	 * Load fieldSets
	 */
	useEffect(() => {
		if (allowFieldSets && contentType) {
			let globalFieldSetsPromise = [];

			if (groupId) {
				globalFieldSetsPromise = getItem(
					`/o/data-engine/v2.0/sites/${groupId}/data-definitions/by-content-type/${contentType}?page=-1&pageSize=-1`
				);
			}

			const groupFieldSetsPromise =
				groupId === themeDisplay.getCompanyGroupId()
					? Promise.resolve({})
					: getItem(
							`/o/data-engine/v2.0/data-definitions/by-content-type/${contentType}?page=-1&pageSize=-1`
					  );

			const fetchFieldSets = async () => {
				try {
					const [
						{items: globalFieldSets = []},
						{items: groupFieldSets = []},
					] = await Promise.all([
						globalFieldSetsPromise,
						groupFieldSetsPromise,
					]);
					const fieldSets = [
						...globalFieldSets,
						...groupFieldSets,
					].filter(({id}) => id !== parseInt(dataDefinitionId, 10));

					dispatch({
						payload: {fieldSets},
						type: EVENT_TYPES.FIELD_SET.UPDATE_LIST,
					});
				}
				catch (error) {
					if (process.env.NODE_ENV === 'development') {
						console.warn(
							`[DataEngineFormBuilder] fetchFieldSets promise rejected: ${error}`
						);
					}
				}
			};

			fetchFieldSets();
		}
	}, [allowFieldSets, contentType, dataDefinitionId, dispatch, groupId]);

	/**
	 * Adjusts alert messages size according to sidebarOpen state
	 */
	useEffect(() => {
		const alerts = document.querySelector(
			'.data-engine-form-builder-messages'
		);

		if (alerts) {
			alerts.className = classNames('data-engine-form-builder-messages', {
				'data-engine-form-builder-messages--collapsed': sidebarOpen,
			});
		}
	}, [sidebarOpen]);

	/**
	 * Opens the sidebar whenever a field is focused
	 */
	useEffect(() => {
		const hasFocusedField = !!Object.keys(focusedField).length;

		if (hasFocusedField) {
			setSidebarState(({sidebarPanelId}) => ({
				sidebarOpen: true,
				sidebarPanelId,
			}));
		}
	}, [focusedField]);

	return (
		<div
			className={classNames(
				'data-engine-form-builder ddm-form-builder pb-5',
				{
					'ddm-form-builder--sidebar-open': sidebarOpen,
				}
			)}
		>
			<ClayLayout.Sheet>
				<div className="ddm-form-builder-wrapper">
					<div className="container ddm-form-builder">
						<DragLayer />

						<Pages
							editable={true}
							fieldActions={[
								{
									action: (payload) =>
										dispatch({
											payload,
											type:
												CORE_EVENT_TYPES.FIELD
													.DUPLICATE,
										}),
									label: Liferay.Language.get('duplicate'),
								},
								{
									action: (payload) =>
										dispatch(
											fieldDelete({
												action: {
													payload,
													type:
														CORE_EVENT_TYPES.FIELD
															.DELETE,
												},
												modalDispatch,
												onClose,
												rules,
											})
										),
									label: Liferay.Language.get('delete'),
								},
							]}
						/>

						<MultiPanelSidebar
							createPlugin={({
								panel,
								setSidebarState,
								sidebarOpen,
								sidebarPanelId,
							}) => ({
								dispatch,
								panel,
								setSidebarState,
								sidebarOpen,
								sidebarPanelId,
							})}
							currentPanelId={sidebarPanelId}
							onChange={setSidebarState}
							open={sidebarOpen}
							panels={panels}
							sidebarPanels={sidebarPanels}
							variant={sidebarVariant}
						/>
					</div>
				</div>
			</ClayLayout.Sheet>
		</div>
	);
}
