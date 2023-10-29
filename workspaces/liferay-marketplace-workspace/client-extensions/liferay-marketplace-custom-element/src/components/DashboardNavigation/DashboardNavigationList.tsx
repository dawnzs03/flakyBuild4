/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import classNames from 'classnames';

import './DashboardNavigationList.scss';
import {AppProps} from '../DashboardTable/DashboardTable';
import {DashboardListItems} from './DashboardNavigation';
import {DashboardNavigationListItem} from './DashboardNavigationListItem';

interface DashboardNavigationListProps {
	dashboardNavigationItems: DashboardListItems[];
	navigationItemMock: DashboardListItems;
	navigationItemsMock: DashboardListItems[];
	onSelectAppChange?: (value: AppProps | undefined) => void;
	setDashboardNavigationItems: (values: DashboardListItems[]) => void;
}

export function DashboardNavigationList({
	dashboardNavigationItems,
	navigationItemMock,
	navigationItemsMock,
	onSelectAppChange,
	setDashboardNavigationItems,
}: DashboardNavigationListProps) {
	const {
		itemIcon,
		itemName,
		itemSelected,
		itemTitle,
		items,
	} = navigationItemMock;

	return (
		<>
			<div
				className={classNames('dashboard-navigation-body-list', {
					'dashboard-navigation-body-list-selected': itemSelected,
				})}
				onClick={() => {
					const newItems = navigationItemsMock.map(
						(navigationItem) => {
							if (navigationItem.itemName === itemName) {
								return {
									...navigationItem,
									itemSelected: true,
								};
							}

							if (navigationItem.itemName === 'apps') {
								const newAppNavigationItems = navigationItem.items?.map(
									(item) => {
										return {
											...item,
											selected: false,
										};
									}
								);

								const newNavigationItem = {
									...navigationItem,
									items: newAppNavigationItems,
								};

								return {
									...newNavigationItem,
									itemSelected: false,
								};
							}

							return {
								...navigationItem,
								itemSelected: false,
							};
						}
					);

					if (onSelectAppChange) {
						onSelectAppChange(undefined);
					}

					setDashboardNavigationItems(newItems);
				}}
			>
				<img
					alt="Apps icon"
					className={classNames(
						'dashboard-navigation-body-list-icon',
						{
							'dashboard-navigation-body-list-icon-selected': itemSelected,
						}
					)}
					src={itemIcon}
				/>

				<span
					className={classNames(
						'dashboard-navigation-body-list-text',
						{
							'dashboard-navigation-body-list-text-selected': itemSelected,
						}
					)}
				>
					{itemTitle}
				</span>
			</div>

			{itemSelected &&
				items?.map((item) => (
					<DashboardNavigationListItem
						dashboardNavigationItems={dashboardNavigationItems}
						item={item}
						items={items}
						key={item.name}
						listName={itemName}
						onSelectAppChange={onSelectAppChange}
						setDashboardNavigationItems={
							setDashboardNavigationItems
						}
					/>
				))}
		</>
	);
}
