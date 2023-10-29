/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayButton from '@clayui/button';
import ClayIcon from '@clayui/icon';
import ClayTable from '@clayui/table';

import './PurchasedAppsDashboardTableRow.scss';

import DropDown from '@clayui/drop-down/lib/DropDown';
import classNames from 'classnames';

import {PurchasedAppProps} from '../../pages/PurchasedAppsDashboardPage/PurchasedAppsDashboardPage';
import {showAppImage} from '../../utils/util';

interface PurchasedAppsDashboardTableRowProps {
	item: PurchasedAppProps;
}

export function PurchasedAppsDashboardTableRow({
	item,
}: PurchasedAppsDashboardTableRowProps) {
	const {
		name,
		orderId,
		project,
		provisioning,
		purchasedBy,
		purchasedDate,
		thumbnail,
		type,
		version,
	} = item;

	return (
		<ClayTable.Row>
			<ClayTable.Cell>
				<div className="dashboard-table-row-name-container">
					<div>
						<img
							alt="App Image"
							className="dashboard-table-row-name-logo"
							src={showAppImage(thumbnail)}
						/>
					</div>

					<div>
						<span className="dashboard-table-row-name-text">
							{name}
						</span>

						{version ? (
							<>
								<br></br>
								<span className="dashboard-table-row-name-version">
									{version}
								</span>
							</>
						) : (
							<></>
						)}
					</div>
				</div>
			</ClayTable.Cell>

			<ClayTable.Cell>
				<div className="dashboard-table-row-purchased-container">
					<span className="dashboard-table-row-text">
						{purchasedBy}
					</span>
				</div>

				<span className="dashboard-table-row-purchased-date">
					{purchasedDate}
				</span>
			</ClayTable.Cell>

			<ClayTable.Cell>
				<div className="dashboard-table-row-type">
					<span>{type}</span>
				</div>
			</ClayTable.Cell>

			<ClayTable.Cell>
				<div className="dashboard-table-row-order-id-container">
					<span className="dashboard-table-row-order-id-text">
						{orderId}
					</span>
				</div>
			</ClayTable.Cell>

			{project ? (
				<ClayTable.Cell>
					<span className="dashboard-table-row-text">{project}</span>
				</ClayTable.Cell>
			) : (
				<></>
			)}

			<ClayTable.Cell>
				<div className="dashboard-table-row-provisioning-container">
					<ClayIcon
						className={classNames(
							'dashboard-table-row-provisioning-icon',
							{
								'dashboard-table-row-provisioning-icon-completed':
									provisioning === 'Completed',
								'dashboard-table-row-provisioning-icon-pending':
									provisioning === 'Pending',
								'dashboard-table-row-provisioning-icon-processing':
									provisioning === 'Processing',
							}
						)}
						symbol="circle"
					/>

					<span className="dashboard-table-row-provisioning-text">
						{provisioning}
					</span>
				</div>
			</ClayTable.Cell>

			<ClayTable.Cell>
				<DropDown
					trigger={
						<ClayButton displayType="secondary">
							Manage
							<ClayIcon symbol="caret-bottom" />
						</ClayButton>
					}
				>
					<DropDown.ItemList>
						<DropDown.Item
							onClick={() => {
								window.location.href =
									'https://console.marketplacedemo.liferay.sh/projects';
							}}
						>
							Access Console
						</DropDown.Item>
					</DropDown.ItemList>
				</DropDown>
			</ClayTable.Cell>
		</ClayTable.Row>
	);
}
