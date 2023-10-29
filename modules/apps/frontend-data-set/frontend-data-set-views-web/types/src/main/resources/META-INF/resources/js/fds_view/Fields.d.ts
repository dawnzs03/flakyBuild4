/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

/// <reference types="react" />

import {IFDSViewSectionInterface} from '../FDSView';
import '../../css/Fields.scss';
declare const Fields: ({
	fdsClientExtensionCellRenderers,
	fdsView,
	fdsViewsURL,
	namespace,
	saveFDSFieldsURL,
}: IFDSViewSectionInterface) => JSX.Element;
export default Fields;
