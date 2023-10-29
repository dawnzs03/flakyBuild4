/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.blogs.demo.data.creator.internal;

import com.liferay.blogs.demo.data.creator.BlogsEntryDemoDataCreator;
import com.liferay.blogs.exception.NoSuchEntryException;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryLocalService;
import com.liferay.document.library.demo.data.creator.FileEntryDemoDataCreator;
import com.liferay.document.library.demo.data.creator.RootFolderDemoDataCreator;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.taglib.ui.ImageSelector;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.osgi.service.component.annotations.Reference;

/**
 * @author Alejandro Hernández
 */
public abstract class BaseBlogsEntryDemoDataCreator
	implements BlogsEntryDemoDataCreator {

	public BlogsEntry createBlogsEntry(
			long userId, long groupId, String title, String subtitle,
			String content)
		throws IOException, PortalException {

		ServiceContext serviceContext = new ServiceContext();

		serviceContext.setAddGroupPermissions(true);
		serviceContext.setAddGuestPermissions(true);
		serviceContext.setScopeGroupId(groupId);

		ImageSelector imageSelector = new ImageSelector(
			_getRandomImageBytes(userId, groupId),
			StringUtil.randomString() + ".jpeg", "image/jpeg",
			StringPool.BLANK);

		BlogsEntry blogsEntry = blogsEntryLocalService.addEntry(
			userId, title, subtitle, null, content, _getRandomDate(), false,
			false, null, null, imageSelector, null, serviceContext);

		entryIds.add(blogsEntry.getEntryId());

		return blogsEntry;
	}

	@Override
	public void delete() throws PortalException {
		for (long entryId : entryIds) {
			try {
				blogsEntryLocalService.deleteEntry(entryId);
			}
			catch (NoSuchEntryException noSuchEntryException) {
				if (_log.isWarnEnabled()) {
					_log.warn(noSuchEntryException);
				}
			}

			entryIds.remove(entryId);
		}

		fileEntryDemoDataCreator.delete();
		rootFolderDemoDataCreator.delete();
	}

	@Reference
	protected BlogsEntryLocalService blogsEntryLocalService;

	protected final List<Long> entryIds = new CopyOnWriteArrayList<>();

	@Reference
	protected FileEntryDemoDataCreator fileEntryDemoDataCreator;

	@Reference
	protected RootFolderDemoDataCreator rootFolderDemoDataCreator;

	private Date _getRandomDate() {
		Calendar calendar = CalendarFactoryUtil.getCalendar();

		calendar.set(2000, Calendar.JANUARY, 1);

		long start = calendar.getTimeInMillis();

		Date date = new Date();

		long end = date.getTime();

		ThreadLocalRandom current = ThreadLocalRandom.current();

		return new Date(current.nextLong(start, end));
	}

	private byte[] _getRandomImageBytes(long userId, long groupId)
		throws IOException, PortalException {

		if (_blogsEntryImagesFolder == null) {
			_blogsEntryImagesFolder = rootFolderDemoDataCreator.create(
				userId, groupId, "Blogs Images");
		}

		FileEntry fileEntry = fileEntryDemoDataCreator.create(
			userId, _blogsEntryImagesFolder.getFolderId());

		FileVersion fileVersion = fileEntry.getFileVersion();

		return FileUtil.getBytes(fileVersion.getContentStream(false));
	}

	private static final Log _log = LogFactoryUtil.getLog(
		BaseBlogsEntryDemoDataCreator.class);

	private Folder _blogsEntryImagesFolder;

}