/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.message.boards.web.internal.upload;

import org.osgi.service.component.annotations.Component;

/**
 * @author Ambrín Chaudhary
 */
@Component(service = TempImageMBUploadFileEntryHandler.class)
public class TempImageMBUploadFileEntryHandler
	extends BaseMBUploadFileEntryHandler {

	@Override
	protected String getParameterName() {
		return "imageSelectorFileName";
	}

}