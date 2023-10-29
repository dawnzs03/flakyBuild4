/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {ClayButtonWithIcon} from '@clayui/button';
import ClayDropDown from '@clayui/drop-down';
import React, {MouseEventHandler, useState} from 'react';

import {useLayoutContext} from '../objectLayoutContext';

interface HeaderDropdownProps {
	addCategorization?: MouseEventHandler;
	deleteElement: MouseEventHandler;
	disabled?: boolean;
}

export function HeaderDropdown({
	addCategorization,
	deleteElement,
	disabled,
}: HeaderDropdownProps) {
	const [active, setActive] = useState<boolean>(false);
	const [
		{
			enableCategorization,
			isViewOnly,
			objectLayout: {objectLayoutTabs},
		},
	] = useLayoutContext();

	const handleOnClick = (handler: Function) => {
		handler();
		setActive(false);
	};
	const isThereFramework = (framework: string): boolean => {
		for (const tab of objectLayoutTabs) {
			if (tab.objectLayoutBoxes.some((box) => box.type === framework)) {
				return true;
			}
		}

		return false;
	};

	return (
		<ClayDropDown
			active={active}
			onActiveChange={setActive}
			trigger={
				<ClayButtonWithIcon
					aria-label={Liferay.Language.get('more-actions')}
					disabled={disabled}
					displayType="unstyled"
					symbol="ellipsis-v"
				/>
			}
		>
			<ClayDropDown.ItemList>
				{addCategorization && (
					<ClayDropDown.Item
						disabled={
							isThereFramework('categorization') ||
							!enableCategorization
						}
						onClick={() => handleOnClick(addCategorization)}
					>
						{Liferay.Language.get('add-categorization')}
					</ClayDropDown.Item>
				)}

				<ClayDropDown.Item
					disabled={isViewOnly}
					onClick={() => handleOnClick(deleteElement)}
				>
					{Liferay.Language.get('delete')}
				</ClayDropDown.Item>
			</ClayDropDown.ItemList>
		</ClayDropDown>
	);
}
