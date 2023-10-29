/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayButton from '@clayui/button';
import {ClayInput} from '@clayui/form';
import React from 'react';

export default function AskQuestionButton({navigateToNewQuestion}) {
	return (
		<ClayInput.GroupItem shrink>
			<ClayButton
				className="d-none d-sm-block text-nowrap"
				displayType="primary"
				onClick={navigateToNewQuestion}
			>
				{Liferay.Language.get('ask-question')}
			</ClayButton>
		</ClayInput.GroupItem>
	);
}
