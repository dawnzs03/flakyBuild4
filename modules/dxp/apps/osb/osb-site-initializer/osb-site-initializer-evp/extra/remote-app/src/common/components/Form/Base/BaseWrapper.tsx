/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayForm from '@clayui/form';
import classNames from 'classnames';
import {ReactNode} from 'react';

import InputWarning from '../../Form/Base/BaseWarning';

type BaseWrapperProps = {
	children: ReactNode;
	description?: string;
	error?: string;
	id?: string;
	label?: string;
	required?: boolean;
};

const BaseWrapper: React.FC<BaseWrapperProps> = ({
	children,
	description,
	error,
	id,
	label,
	required,
}) => {
	return (
		<ClayForm.Group
			className={classNames({
				'has-error': error,
			})}
		>
			{label && (
				<label
					className={classNames(
						'font-weight-bold mb-1 mx-0 text-paragraph',
						{required}
					)}
					htmlFor={id}
				>
					{label}
				</label>
			)}

			{children}

			{description && (
				<small className="form-text text-muted" id="Help">
					{description}
				</small>
			)}

			{error && <InputWarning>{error}</InputWarning>}
		</ClayForm.Group>
	);
};

export default BaseWrapper;
