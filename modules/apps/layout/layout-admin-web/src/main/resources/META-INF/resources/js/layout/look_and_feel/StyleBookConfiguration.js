/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {ClayButtonWithIcon} from '@clayui/button';
import ClayForm, {ClayInput} from '@clayui/form';
import {openSelectionModal} from 'frontend-js-web';
import React, {useState} from 'react';

export default function StyleBookConfiguration({
	changeStyleBookURL,
	isReadOnly,
	portletNamespace,
	styleBookEntryId: initialStyleBookEntryId,
	styleBookEntryName: initialStyleBookEntryName,
}) {
	const [styleBookEntry, setStyleBookEntry] = useState({
		name: initialStyleBookEntryName,
		styleBookEntryId: initialStyleBookEntryId,
	});

	const handleChangeStyleBookClick = () => {
		if (isReadOnly) {
			return;
		}

		openSelectionModal({
			iframeBodyCssClass: '',
			onSelect(selectedItem) {
				if (selectedItem) {
					const itemValue = JSON.parse(selectedItem.value);

					setStyleBookEntry({
						name: itemValue.name,
						styleBookEntryId: itemValue.styleBookEntryId,
					});
				}
			},
			selectEventName: `${portletNamespace}selectStyleBook`,
			title: Liferay.Language.get('select-style-book'),
			url: changeStyleBookURL,
		});
	};

	return (
		<>
			<input
				name={`${portletNamespace}styleBookEntryId`}
				type="hidden"
				value={styleBookEntry.styleBookEntryId}
			/>

			<label htmlFor={`${portletNamespace}styleBookEntry`}>
				{Liferay.Language.get('style-book')}
			</label>

			<div className="d-flex">
				<ClayForm.Group className="c-mb-0 flex-grow-1">
					<ClayInput
						id={`${portletNamespace}styleBookEntry`}
						onClick={handleChangeStyleBookClick}
						readOnly
						value={styleBookEntry.name}
					/>
				</ClayForm.Group>

				<ClayButtonWithIcon
					aria-label={Liferay.Language.get('change-style-book')}
					className="c-ml-2"
					disabled={isReadOnly}
					displayType="secondary"
					onClick={handleChangeStyleBookClick}
					symbol="change"
				/>
			</div>
		</>
	);
}
