/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.model;

import com.liferay.asset.kernel.util.NotifiedAssetEntryThreadLocal;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutRevision;
import com.liferay.portal.kernel.model.LayoutSetPrototype;
import com.liferay.portal.kernel.model.PortletPreferences;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetPrototypeLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.LayoutRevisionUtil;
import com.liferay.portal.kernel.service.persistence.LayoutUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.servlet.filters.cache.CacheUtil;

import java.util.Date;

/**
 * @author Alexander Chow
 * @author Raymond Augé
 */
public class PortletPreferencesModelListener
	extends BaseModelListener<PortletPreferences> {

	@Override
	public void onAfterRemove(PortletPreferences portletPreferences) {
		clearCache(portletPreferences);
	}

	@Override
	public void onAfterUpdate(
		PortletPreferences originalPortletPreferences,
		PortletPreferences portletPreferences) {

		clearCache(portletPreferences);

		updateLayout(portletPreferences);
	}

	protected void clearCache(PortletPreferences portletPreferences) {
		if (portletPreferences == null) {
			return;
		}

		try {
			long companyId = 0;

			Layout layout = LayoutUtil.fetchByPrimaryKey(
				portletPreferences.getPlid());

			if ((layout != null) && !layout.isPrivateLayout()) {
				companyId = layout.getCompanyId();
			}
			else {
				LayoutRevision layoutRevision =
					LayoutRevisionUtil.fetchByPrimaryKey(
						portletPreferences.getPlid());

				if ((layoutRevision != null) &&
					!layoutRevision.isPrivateLayout()) {

					companyId = layoutRevision.getCompanyId();
				}
			}

			if (companyId > 0) {
				CacheUtil.clearCache(companyId);
			}
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}

			CacheUtil.clearCache();
		}
	}

	protected void updateLayout(PortletPreferences portletPreferences) {
		try {
			if ((portletPreferences.getOwnerType() ==
					PortletKeys.PREFS_OWNER_TYPE_GROUP) &&
				(portletPreferences.getOwnerId() > 0)) {

				Group group = GroupLocalServiceUtil.fetchGroup(
					portletPreferences.getOwnerId());

				if (group == null) {
					return;
				}

				String className = group.getClassName();

				if (!className.equals(LayoutSetPrototype.class.getName())) {
					return;
				}

				LayoutSetPrototype layoutSetPrototype =
					LayoutSetPrototypeLocalServiceUtil.fetchLayoutSetPrototype(
						group.getClassPK());

				if (layoutSetPrototype == null) {
					return;
				}

				layoutSetPrototype.setModifiedDate(new Date());

				LayoutSetPrototypeLocalServiceUtil.updateLayoutSetPrototype(
					layoutSetPrototype);
			}
			else if ((portletPreferences.getOwnerType() ==
						PortletKeys.PREFS_OWNER_TYPE_LAYOUT) &&
					 (portletPreferences.getPlid() > 0)) {

				Layout layout = LayoutLocalServiceUtil.fetchLayout(
					portletPreferences.getPlid());

				if ((layout == null) ||
					NotifiedAssetEntryThreadLocal.
						isNotifiedAssetEntryIdsModified()) {

					return;
				}

				if (layout.isDraftLayout()) {
					ServiceContext serviceContext =
						ServiceContextThreadLocal.getServiceContext();

					LayoutLocalServiceUtil.updateStatus(
						serviceContext.getUserId(), layout.getPlid(),
						WorkflowConstants.STATUS_DRAFT, serviceContext);
				}
				else {
					layout.setModifiedDate(new Date());

					LayoutLocalServiceUtil.updateLayout(
						layout.getGroupId(), layout.isPrivateLayout(),
						layout.getLayoutId(), layout.getTypeSettings());
				}
			}
		}
		catch (Exception exception) {
			_log.error(
				"Unable to update the layout's modified date", exception);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PortletPreferencesModelListener.class);

}