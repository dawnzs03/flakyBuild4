/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.journal.web.internal.portlet.action;

import com.liferay.journal.constants.JournalPortletKeys;
import com.liferay.journal.constants.JournalWebKeys;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalFolder;
import com.liferay.journal.service.JournalArticleService;
import com.liferay.journal.service.JournalFolderService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Jürgen Kappler
 */
@Component(
	property = {
		"javax.portlet.name=" + JournalPortletKeys.JOURNAL,
		"mvc.command.name=/journal/info_panel"
	},
	service = MVCResourceCommand.class
)
public class InfoPanelMVCResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		resourceRequest.setAttribute(
			JournalWebKeys.JOURNAL_ARTICLES, _getArticles(resourceRequest));
		resourceRequest.setAttribute(
			JournalWebKeys.JOURNAL_FOLDERS, _getFolders(resourceRequest));

		include(resourceRequest, resourceResponse, "/info_panel.jsp");
	}

	private List<JournalArticle> _getArticles(ResourceRequest request)
		throws Exception {

		long groupId = ParamUtil.getLong(request, "groupId");

		String[] articleIds = ParamUtil.getStringValues(
			request, "rowIdsJournalArticle");

		List<JournalArticle> articles = new ArrayList<>();

		for (String articleId : articleIds) {
			articles.add(_journalArticleService.getArticle(groupId, articleId));
		}

		return articles;
	}

	private List<JournalFolder> _getFolders(ResourceRequest request)
		throws Exception {

		long[] folderIds = ParamUtil.getLongValues(
			request, "rowIdsJournalFolder");

		List<JournalFolder> folders = new ArrayList<>();

		for (long folderId : folderIds) {
			folders.add(_journalFolderService.getFolder(folderId));
		}

		return folders;
	}

	@Reference
	private JournalArticleService _journalArticleService;

	@Reference
	private JournalFolderService _journalFolderService;

}