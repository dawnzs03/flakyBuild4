/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.app.service.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.test.util.BaseDLAppTestCase;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileShortcut;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Marco Galluzzi
 */
@RunWith(Arquillian.class)
public class DLAppServiceWhenCopyingAFileShortcutTest
	extends BaseDLAppTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		super.setUp();

		fileEntry = DLAppServiceTestUtil.addFileEntry(
			parentFolder.getGroupId(), parentFolder.getFolderId());

		newParentFolder = DLAppServiceUtil.addFolder(
			null, group.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "New Test Folder",
			RandomTestUtil.randomString(),
			ServiceContextTestUtil.getServiceContext(
				group.getGroupId(), TestPropsValues.getUserId()));

		targetParentFolder = DLAppServiceUtil.addFolder(
			null, targetGroup.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Target Test Folder",
			RandomTestUtil.randomString(),
			ServiceContextTestUtil.getServiceContext(
				targetGroup.getGroupId(), TestPropsValues.getUserId()));
	}

	@Test
	public void testShouldSucceedFromRootFolderToRootFolderInDifferentSite()
		throws Exception {

		_copy(group, targetGroup);
	}

	@Test
	public void testShouldSucceedFromRootFolderToSubfolder() throws Exception {
		_copy(group, parentFolder);
	}

	@Test
	public void testShouldSucceedFromRootFolderToSubfolderInDifferentSite()
		throws Exception {

		_copy(group, targetParentFolder);
	}

	@Test
	public void testShouldSucceedFromSubfolderToRootFolder() throws Exception {
		_copy(parentFolder, group);
	}

	@Test
	public void testShouldSucceedFromSubfolderToRootFolderInDifferentSite()
		throws Exception {

		_copy(parentFolder, targetGroup);
	}

	@Test
	public void testShouldSucceedFromSubfolderToSubfolder() throws Exception {
		_copy(parentFolder, newParentFolder);
	}

	@Test
	public void testShouldSucceedFromSubfolderToSubfolderInDifferentSite()
		throws Exception {

		_copy(parentFolder, targetParentFolder);
	}

	@Test
	public void testShouldSucceedIfDestinationIsSameRootFolder()
		throws Exception {

		_copy(group, group);
	}

	@Test
	public void testShouldSucceedIfDestinationIsSameSubfolder()
		throws Exception {

		_copy(parentFolder, parentFolder);
	}

	protected FileEntry fileEntry;
	protected Folder newParentFolder;
	protected Folder targetParentFolder;

	private void _copy(Folder sourceParentFolder, Folder targetParentFolder)
		throws Exception {

		_copy(
			sourceParentFolder.getGroupId(), sourceParentFolder.getFolderId(),
			targetParentFolder.getGroupId(), targetParentFolder.getFolderId());
	}

	private void _copy(Folder sourceParentFolder, Group targetGroup)
		throws Exception {

		_copy(
			sourceParentFolder.getGroupId(), sourceParentFolder.getFolderId(),
			targetGroup.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID);
	}

	private void _copy(Group sourceGroup, Folder targetParentFolder)
		throws Exception {

		_copy(
			sourceGroup.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
			targetParentFolder.getGroupId(), targetParentFolder.getFolderId());
	}

	private void _copy(Group sourceGroup, Group targetGroup) throws Exception {
		_copy(
			sourceGroup.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
			targetGroup.getGroupId(),
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID);
	}

	private void _copy(
			long sourceGroupId, long sourceFolderId, long targetGroupId,
			long targetFolderId)
		throws Exception {

		FileShortcut fileShortcut = DLAppServiceUtil.addFileShortcut(
			sourceGroupId, sourceFolderId, fileEntry.getFileEntryId(),
			ServiceContextTestUtil.getServiceContext(sourceGroupId));

		DLAppServiceUtil.copyFileShortcut(
			fileShortcut.getFileShortcutId(), targetFolderId, targetGroupId,
			ServiceContextTestUtil.getServiceContext(targetGroupId));
	}

}