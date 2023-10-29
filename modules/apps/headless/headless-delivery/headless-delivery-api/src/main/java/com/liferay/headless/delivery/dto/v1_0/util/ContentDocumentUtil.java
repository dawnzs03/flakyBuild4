/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.dto.v1_0.util;

import com.liferay.document.library.util.DLURLHelper;
import com.liferay.headless.delivery.dto.v1_0.ContentDocument;
import com.liferay.portal.kernel.repository.model.FileEntry;

import javax.ws.rs.core.UriInfo;

/**
 * @author Javier Gamarra
 */
public class ContentDocumentUtil {

	public static ContentDocument toContentDocument(
			DLURLHelper dlURLHelper, String fieldName, FileEntry fileEntry,
			UriInfo uriInfo)
		throws Exception {

		return new ContentDocument() {
			{
				contentType = "Document";
				contentUrl = dlURLHelper.getPreviewURL(
					fileEntry, fileEntry.getFileVersion(), null, "", false,
					false);
				contentValue = ContentValueUtil.toContentValue(
					fieldName + ".contentValue", fileEntry::getContentStream,
					uriInfo);
				description = fileEntry.getDescription();
				encodingFormat = fileEntry.getMimeType();
				fileExtension = fileEntry.getExtension();
				id = fileEntry.getFileEntryId();
				sizeInBytes = fileEntry.getSize();
				title = fileEntry.getTitle();
			}
		};
	}

}