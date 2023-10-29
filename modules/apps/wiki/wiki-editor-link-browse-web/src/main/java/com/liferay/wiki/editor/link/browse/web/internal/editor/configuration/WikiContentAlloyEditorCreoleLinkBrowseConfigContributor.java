/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.wiki.editor.link.browse.web.internal.editor.configuration;

import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.wiki.constants.WikiPortletKeys;
import com.liferay.wiki.item.selector.WikiPageTitleItemSelectorReturnType;

import org.osgi.service.component.annotations.Component;

/**
 * @author Roberto Díaz
 */
@Component(
	property = {
		"editor.config.key=contentEditor", "editor.name=alloyeditor_creole",
		"javax.portlet.name=" + WikiPortletKeys.WIKI,
		"javax.portlet.name=" + WikiPortletKeys.WIKI_ADMIN,
		"javax.portlet.name=" + WikiPortletKeys.WIKI_DISPLAY,
		"service.ranking:Integer=1000"
	},
	service = EditorConfigContributor.class
)
public class WikiContentAlloyEditorCreoleLinkBrowseConfigContributor
	extends BaseWikiContentAlloyEditorLinkBrowseConfigContributor {

	@Override
	protected ItemSelectorReturnType getItemSelectorReturnType() {
		return new WikiPageTitleItemSelectorReturnType();
	}

}