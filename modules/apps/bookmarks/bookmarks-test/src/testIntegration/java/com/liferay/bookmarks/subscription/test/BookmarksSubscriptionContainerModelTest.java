/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bookmarks.subscription.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.bookmarks.model.BookmarksEntry;
import com.liferay.bookmarks.model.BookmarksFolder;
import com.liferay.bookmarks.service.BookmarksEntryLocalServiceUtil;
import com.liferay.bookmarks.service.BookmarksFolderLocalServiceUtil;
import com.liferay.bookmarks.test.util.BookmarksTestUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.ServiceContextTestUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.SynchronousMailTestRule;
import com.liferay.subscription.test.util.BaseSubscriptionContainerModelTestCase;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * @author Roberto Díaz
 */
@RunWith(Arquillian.class)
public class BookmarksSubscriptionContainerModelTest
	extends BaseSubscriptionContainerModelTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), SynchronousMailTestRule.INSTANCE);

	@Override
	protected long addBaseModel(long userId, long containerModelId)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				group.getGroupId(), userId);

		BookmarksTestUtil.populateNotificationsServiceContext(
			serviceContext, Constants.ADD);

		BookmarksEntry entry = BookmarksEntryLocalServiceUtil.addEntry(
			userId, group.getGroupId(), containerModelId,
			RandomTestUtil.randomString(), "http://www.liferay.com",
			RandomTestUtil.randomString(), serviceContext);

		return entry.getEntryId();
	}

	@Override
	protected long addContainerModel(long userId, long containerModelId)
		throws Exception {

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				group.getGroupId(), userId);

		BookmarksFolder folder = BookmarksFolderLocalServiceUtil.addFolder(
			userId, containerModelId, RandomTestUtil.randomString(),
			RandomTestUtil.randomString(), serviceContext);

		return folder.getFolderId();
	}

	@Override
	protected void addSubscriptionContainerModel(long containerModelId)
		throws Exception {

		BookmarksFolderLocalServiceUtil.subscribeFolder(
			user.getUserId(), group.getGroupId(), containerModelId);
	}

	@Override
	protected void updateBaseModel(long userId, long baseModelId)
		throws Exception {

		BookmarksEntry entry = BookmarksEntryLocalServiceUtil.getEntry(
			baseModelId);

		ServiceContext serviceContext =
			ServiceContextTestUtil.getServiceContext(
				group.getGroupId(), userId);

		BookmarksTestUtil.populateNotificationsServiceContext(
			serviceContext, Constants.UPDATE);

		BookmarksEntryLocalServiceUtil.updateEntry(
			userId, entry.getEntryId(), entry.getGroupId(), entry.getFolderId(),
			RandomTestUtil.randomString(), entry.getUrl(),
			entry.getDescription(), serviceContext);
	}

}