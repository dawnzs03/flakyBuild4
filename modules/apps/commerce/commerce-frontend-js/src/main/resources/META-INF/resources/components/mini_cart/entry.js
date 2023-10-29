/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import launcher from '../../utilities/launcher';
import MiniCart from './MiniCart';

export default function entry(...data) {
	return launcher(MiniCart, ...data);
}
