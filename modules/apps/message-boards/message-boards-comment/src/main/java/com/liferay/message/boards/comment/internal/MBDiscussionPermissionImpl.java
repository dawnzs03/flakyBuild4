/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.message.boards.comment.internal;

import com.liferay.message.boards.model.MBMessage;
import com.liferay.message.boards.service.MBBanLocalService;
import com.liferay.message.boards.service.MBMessageLocalService;
import com.liferay.portal.kernel.comment.BaseDiscussionPermission;
import com.liferay.portal.kernel.comment.Comment;
import com.liferay.portal.kernel.comment.DiscussionPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.workflow.WorkflowInstance;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;
import com.liferay.portal.util.PropsValues;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Adolfo Pérez
 * @author Sergio González
 */
@Component(service = DiscussionPermission.class)
public class MBDiscussionPermissionImpl extends BaseDiscussionPermission {

	@Override
	public boolean hasAddPermission(
		PermissionChecker permissionChecker, long companyId, long groupId,
		String className, long classPK) {

		return hasPermission(
			permissionChecker, companyId, groupId, className, classPK,
			ActionKeys.ADD_DISCUSSION);
	}

	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, Comment comment,
			String actionId)
		throws PortalException {

		if (comment instanceof MBCommentImpl) {
			MBCommentImpl mbCommentImpl = (MBCommentImpl)comment;

			MBMessage mbMessage = mbCommentImpl.getMessage();

			return _hasPermission(permissionChecker, mbMessage, actionId);
		}

		return hasPermission(
			permissionChecker, comment.getCommentId(), actionId);
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, long companyId, long groupId,
		String className, long classPK, String actionId) {

		if (_mbBanLocalService.hasBan(groupId, permissionChecker.getUserId())) {
			return false;
		}

		List<String> resourceActions = ResourceActionsUtil.getResourceActions(
			className);

		if (!resourceActions.contains(actionId)) {
			return true;
		}

		Boolean hasPermission = ModelResourcePermissionUtil.contains(
			permissionChecker, groupId, className, classPK, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		return permissionChecker.hasPermission(
			groupId, className, classPK, actionId);
	}

	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, long commentId,
			String actionId)
		throws PortalException {

		return _hasPermission(
			permissionChecker, _mbMessageLocalService.getMessage(commentId),
			actionId);
	}

	@Override
	public boolean hasSubscribePermission(
		PermissionChecker permissionChecker, long companyId, long groupId,
		String className, long classPK) {

		return hasViewPermission(
			permissionChecker, companyId, groupId, className, classPK);
	}

	@Override
	public boolean hasViewPermission(
		PermissionChecker permissionChecker, long companyId, long groupId,
		String className, long classPK) {

		return hasPermission(
			permissionChecker, companyId, groupId, className, classPK,
			ActionKeys.VIEW);
	}

	private boolean _hasPermission(
		PermissionChecker permissionChecker, MBMessage message,
		String actionId) {

		String className = message.getClassName();

		if (className.equals(WorkflowInstance.class.getName())) {
			return permissionChecker.hasPermission(
				message.getGroupId(), PortletKeys.WORKFLOW_DEFINITION,
				message.getGroupId(), ActionKeys.VIEW);
		}

		if (PropsValues.DISCUSSION_COMMENTS_ALWAYS_EDITABLE_BY_OWNER &&
			(permissionChecker.getUserId() == message.getUserId())) {

			return true;
		}

		if (message.isPending()) {
			Boolean hasPermission = _workflowPermission.hasPermission(
				permissionChecker, message.getGroupId(),
				message.getWorkflowClassName(), message.getMessageId(),
				actionId);

			if (hasPermission != null) {
				return hasPermission.booleanValue();
			}
		}

		return hasPermission(
			permissionChecker, message.getCompanyId(), message.getGroupId(),
			className, message.getClassPK(), actionId);
	}

	@Reference
	private MBBanLocalService _mbBanLocalService;

	@Reference
	private MBMessageLocalService _mbMessageLocalService;

	@Reference
	private WorkflowPermission _workflowPermission;

}