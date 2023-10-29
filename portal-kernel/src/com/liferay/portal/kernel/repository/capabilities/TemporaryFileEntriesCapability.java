/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.repository.capabilities;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;

import java.io.InputStream;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Iván Zaera
 */
@ProviderType
public interface TemporaryFileEntriesCapability extends Capability {

	public FileEntry addTemporaryFileEntry(
			TemporaryFileEntriesScope temporaryFileEntriesScope,
			String fileName, String mimeType, InputStream inputStream)
		throws PortalException;

	public void deleteExpiredTemporaryFileEntries() throws PortalException;

	public void deleteTemporaryFileEntry(
			TemporaryFileEntriesScope temporaryFileEntriesScope,
			String fileName)
		throws PortalException;

	public List<FileEntry> getTemporaryFileEntries(
			TemporaryFileEntriesScope temporaryFileEntriesScope)
		throws PortalException;

	public long getTemporaryFileEntriesTimeout();

	public FileEntry getTemporaryFileEntry(
			TemporaryFileEntriesScope temporaryFileEntriesScope,
			String fileName)
		throws PortalException;

	public void setTemporaryFileEntriesTimeout(
		long temporaryFileEntriesTimeout);

}