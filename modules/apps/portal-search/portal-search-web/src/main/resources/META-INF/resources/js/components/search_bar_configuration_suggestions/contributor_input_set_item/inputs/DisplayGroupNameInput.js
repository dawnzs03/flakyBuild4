/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {ClayInput} from '@clayui/form';
import ClayIcon from '@clayui/icon';
import {ClayTooltipProvider} from '@clayui/tooltip';
import getCN from 'classnames';
import React from 'react';

function DisplayGroupNameInput({onBlur, onChange, touched, value}) {
	return (
		<ClayInput.GroupItem
			className={getCN({
				'has-error': !value && touched,
			})}
		>
			<label>
				{Liferay.Language.get('display-group-name')}

				<span className="reference-mark">
					<ClayIcon symbol="asterisk" />
				</span>

				<ClayTooltipProvider>
					<span
						className="c-ml-2"
						data-tooltip-align="top"
						title={Liferay.Language.get('display-group-name-help')}
					>
						<ClayIcon symbol="question-circle-full" />
					</span>
				</ClayTooltipProvider>
			</label>

			<ClayInput
				onBlur={onBlur}
				onChange={onChange}
				required
				type="text"
				value={value || ''}
			/>
		</ClayInput.GroupItem>
	);
}

export default DisplayGroupNameInput;
