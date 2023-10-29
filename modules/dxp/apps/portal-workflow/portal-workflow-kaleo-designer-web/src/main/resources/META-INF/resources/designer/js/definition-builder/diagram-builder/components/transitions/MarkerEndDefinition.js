/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import React from 'react';

const markerEndId = 'arrowclosed';

export default function MarkerEndDefinition({color}) {
	return (
		<defs>
			<marker
				className="react-flow__arrowhead"
				id={markerEndId}
				markerHeight="8"
				markerWidth="20"
				orient="auto"
				refX="0"
				refY="0"
				viewBox="-5 -5 10 10"
			>
				<polyline
					fill={color}
					points="-4,-3 0,0 -4,3 -4,-3"
					stroke={color}
					strokeLinecap="round"
					strokeLinejoin="round"
					strokeWidth="1"
				/>
			</marker>
		</defs>
	);
}

export {markerEndId};
