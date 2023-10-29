/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.demo.data.creator.internal;

import com.liferay.document.library.demo.data.creator.FileEntryDemoDataCreator;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.RandomUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.FileUtil;

import java.io.IOException;
import java.io.InputStream;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alejandro Hernández
 */
@Component(
	property = {"source=unsplash", "type=image"},
	service = FileEntryDemoDataCreator.class
)
public class UnsplashFileEntryDemoDataCreatorImpl
	implements FileEntryDemoDataCreator {

	@Override
	public FileEntry create(long userId, long folderId)
		throws IOException, PortalException {

		String sourceFileName = String.valueOf(UUID.randomUUID()) + ".jpeg";

		return create(userId, folderId, sourceFileName);
	}

	@Override
	public FileEntry create(long userId, long folderId, String name)
		throws IOException, PortalException {

		Folder folder = _dlAppLocalService.getFolder(folderId);

		FileEntry fileEntry = _dlAppLocalService.addFileEntry(
			null, userId, folder.getGroupId(), folderId, name, "image/jpeg",
			_getBytes(), null, null, new ServiceContext());

		_fileEntryIds.add(fileEntry.getFileEntryId());

		return fileEntry;
	}

	@Override
	public void delete() throws PortalException {
		for (long fileEntryId : _fileEntryIds) {
			try {
				_dlAppLocalService.deleteFileEntry(fileEntryId);
			}
			catch (NoSuchFileEntryException noSuchFileEntryException) {
				if (_log.isWarnEnabled()) {
					_log.warn(noSuchFileEntryException);
				}
			}

			_fileEntryIds.remove(fileEntryId);
		}
	}

	private byte[] _getBytes() throws IOException, PortalException {
		URL url = _getNextUrl();

		try (InputStream inputStream = url.openStream()) {
			return FileUtil.getBytes(inputStream);
		}
		catch (IOException ioException) {
			if (_log.isWarnEnabled()) {
				_log.warn(ioException);
			}

			String fileName = String.format(
				"dependencies/%d.jpg", RandomUtil.nextInt(5));

			try {
				return FileUtil.getBytes(getClass(), fileName);
			}
			catch (Exception exception) {
				throw new PortalException(exception);
			}
		}
	}

	private URL _getNextUrl() throws MalformedURLException {
		_categoryIndex++;

		if (_categoryIndex == _categories.size()) {
			_categoryIndex = 0;
		}

		String urlString = String.format(
			"https://source.unsplash.com/category/%s/1920x1080",
			_categories.get(_categoryIndex));

		return new URL(urlString);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		UnsplashFileEntryDemoDataCreatorImpl.class);

	private static final List<String> _categories = Arrays.asList(
		"buildings", "food", "nature", "people", "technology", "objects");

	private volatile int _categoryIndex = -1;

	@Reference
	private DLAppLocalService _dlAppLocalService;

	private final List<Long> _fileEntryIds = new CopyOnWriteArrayList<>();

}