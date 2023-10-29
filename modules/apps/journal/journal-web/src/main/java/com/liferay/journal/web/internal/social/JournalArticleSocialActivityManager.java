/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.journal.web.internal.social;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.social.BaseSocialActivityManager;
import com.liferay.portal.kernel.social.SocialActivityManager;
import com.liferay.social.kernel.service.SocialActivityLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Adolfo Pérez
 */
@Component(
	property = "model.class.name=com.liferay.journal.model.JournalArticle",
	service = SocialActivityManager.class
)
public class JournalArticleSocialActivityManager
	extends BaseSocialActivityManager<JournalArticle> {

	@Override
	protected long getPrimaryKey(JournalArticle journalArticle) {
		return journalArticle.getResourcePrimKey();
	}

	@Override
	protected SocialActivityLocalService getSocialActivityLocalService() {
		return _socialActivityLocalService;
	}

	@Reference
	private SocialActivityLocalService _socialActivityLocalService;

}