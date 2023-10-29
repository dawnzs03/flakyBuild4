/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.blogs.internal.model.listener;

import com.liferay.blogs.service.BlogsEntryLocalService;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marcell Gyöpös
 */
@Component(service = ModelListener.class)
public class UserGroupModelListener extends BaseModelListener<UserGroup> {

	@Override
	public void onAfterRemoveAssociation(
			Object userGroupId, String associationClassName,
			Object associationClassPK)
		throws ModelListenerException {

		try {
			if (associationClassName.equals(User.class.getName())) {
				_unsubscribeUserFromUserGroupGroups(
					(long)associationClassPK, (long)userGroupId);
			}
		}
		catch (PortalException portalException) {
			throw new ModelListenerException(portalException);
		}

		try {
			if (associationClassName.equals(Group.class.getName())) {
				_unsubscribeUserGroupUsersFromGroup(
					(long)associationClassPK, (long)userGroupId);
			}
		}
		catch (PortalException portalException) {
			throw new ModelListenerException(portalException);
		}
	}

	private void _unsubscribeUserFromUserGroupGroups(
			long userId, long userGroupId)
		throws PortalException {

		List<Long> groupIds = ListUtil.toList(
			_groupLocalService.getUserGroups(userId, true), Group::getGroupId);

		for (long groupId :
				_userGroupLocalService.getGroupPrimaryKeys(userGroupId)) {

			if (!groupIds.contains(Long.valueOf(groupId))) {
				_blogsEntryLocalService.unsubscribe(userId, groupId);
			}
		}
	}

	private void _unsubscribeUserGroupUsersFromGroup(
			long groupId, long userGroupId)
		throws PortalException {

		for (long userId :
				_userGroupLocalService.getUserPrimaryKeys(userGroupId)) {

			if (!_groupLocalService.hasUserGroup(userId, groupId)) {
				_blogsEntryLocalService.unsubscribe(userId, groupId);
			}
		}
	}

	@Reference
	private BlogsEntryLocalService _blogsEntryLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private UserGroupLocalService _userGroupLocalService;

}