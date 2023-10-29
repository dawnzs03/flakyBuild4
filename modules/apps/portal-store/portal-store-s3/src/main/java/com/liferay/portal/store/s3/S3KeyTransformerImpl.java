/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.store.s3;

import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;

import org.osgi.service.component.annotations.Component;

/**
 * @author Edward C. Han
 */
@Component(service = S3KeyTransformer.class)
public class S3KeyTransformerImpl implements S3KeyTransformer {

	@Override
	public String getDirectoryKey(
		long companyId, long repositoryId, String folderName) {

		return getFileKey(companyId, repositoryId, folderName);
	}

	@Override
	public String getFileKey(
		long companyId, long repositoryId, String fileName) {

		return StringBundler.concat(
			companyId, StringPool.SLASH, repositoryId,
			getNormalizedFileName(fileName));
	}

	@Override
	public String getFileName(String key) {

		// Convert /${companyId}/${repositoryId}/${dirName}/${fileName}
		// /${versionLabel} to ${dirName}/${fileName}

		int x = key.indexOf(CharPool.SLASH);

		x = key.indexOf(CharPool.SLASH, x + 1);

		int y = key.lastIndexOf(CharPool.SLASH);

		return key.substring(x + 1, y);
	}

	@Override
	public String getFileVersionKey(
		long companyId, long repositoryId, String fileName,
		String versionLabel) {

		return StringBundler.concat(
			companyId, StringPool.SLASH, repositoryId,
			getNormalizedFileName(fileName), StringPool.SLASH, versionLabel);
	}

	@Override
	public String getNormalizedFileName(String fileName) {
		String normalizedFileName = fileName;

		if (!fileName.startsWith(StringPool.SLASH)) {
			normalizedFileName = StringPool.SLASH + normalizedFileName;
		}

		if (fileName.endsWith(StringPool.SLASH)) {
			normalizedFileName = normalizedFileName.substring(
				0, normalizedFileName.length() - 1);
		}

		return normalizedFileName;
	}

	@Override
	public String getRepositoryKey(long companyId, long repositoryId) {
		return companyId + StringPool.SLASH + repositoryId;
	}

	@Override
	public String moveKey(String key, String oldPrefix, String newPrefix) {
		String name = key.substring(oldPrefix.length());

		return newPrefix.concat(name);
	}

}