/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {IFrontendDataSetProps} from '@liferay/frontend-data-set-web';

import {baseFDSProps} from './baseFDSProps';
import {itemMethodRenderer, itemPathRenderer} from './fdsRenderers';

export function getAPIEndpointsFDSProps(
	urlPath: string,
	portletId: string
): IFrontendDataSetProps {
	return {
		...baseFDSProps,
		apiURL: urlPath,
		customDataRenderers: {
			itemMethodRenderer,
			itemPathRenderer,
		},
		emptyState: {
			description: '',
			image: '/states/empty_state.gif',
			title: Liferay.Language.get('no-api-endpoint-found'),
		},
		id: portletId,
		itemsActions: [
			{
				data: {
					id: 'editAPIEndpoint',
				},
				icon: 'pencil',
				label: Liferay.Language.get('edit'),
			},
			...(window.isSecureContext
				? [
						{
							icon: 'copy',
							id: 'copyEndpointURL',
							label: Liferay.Language.get('copy-url'),
						},
				  ]
				: []),
			{
				icon: 'trash',
				id: 'deleteAPIEndpoint',
				label: Liferay.Language.get('delete'),
			},
		],
		views: [
			{
				contentRenderer: 'table',
				label: 'Table',
				name: 'table',
				schema: {
					fields: [
						{
							contentRenderer: 'itemMethodRenderer',
							fieldName: 'httpMethod',
							label: Liferay.Language.get('method'),
							localizeLabel: true,
						},
						{
							actionId: 'editAPIEndpoint',
							contentRenderer: 'itemPathRenderer',
							expand: false,
							fieldName: 'path',
							label: Liferay.Language.get('path'),
							localizeLabel: true,
						},
						{
							fieldName: 'description',
							label: Liferay.Language.get('description'),
							localizeLabel: true,
							truncate: true,
						},
						{
							contentRenderer: 'dateTime',
							fieldName: 'dateModified',
							label: Liferay.Language.get('last-updated'),
							localizeLabel: true,
							sortable: true,
						},
					],
				},
				thumbnail: 'table',
			},
		],
	};
}
