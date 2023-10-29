/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.store.file.system.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Manuel de la Peña
 */
@ExtendedObjectClassDefinition(
	category = "file-storage", liferayLearnMessageKey = "simple",
	liferayLearnMessageResource = "portal-store-file-system"
)
@Meta.OCD(
	id = "com.liferay.portal.store.file.system.configuration.FileSystemStoreConfiguration",
	localization = "content/Language",
	name = "file-system-store-configuration-name"
)
public interface FileSystemStoreConfiguration {

	@Meta.AD(
		deflt = "data/document_library",
		description = "file-system-store-configuration-root-dir-description",
		name = "root-dir", required = false
	)
	public String rootDir();

}