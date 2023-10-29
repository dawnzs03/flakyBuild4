/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.web.internal.object.entries.portlet.action;

import com.liferay.object.exception.ObjectEntryValuesException;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * @author Marco Leo
 */
public class EditObjectEntryRelatedModelMVCActionCommand
	extends BaseMVCActionCommand {

	public EditObjectEntryRelatedModelMVCActionCommand(
		ObjectDefinitionLocalService objectDefinitionLocalService,
		ObjectRelationshipLocalService objectRelationshipLocalService,
		Portal portal) {

		_objectDefinitionLocalService = objectDefinitionLocalService;
		_objectRelationshipLocalService = objectRelationshipLocalService;
		_portal = portal;
	}

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

		if (cmd.equals(Constants.ASSIGN)) {
			_addObjectRelationshipMappingTableValues(
				actionRequest, actionResponse);
		}
	}

	private void _addObjectRelationshipMappingTableValues(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		try {
			long objectRelationshipId = ParamUtil.getLong(
				actionRequest, "objectRelationshipId");

			long objectEntryId = ParamUtil.getLong(
				actionRequest, "objectEntryId");
			long objectRelationshipPrimaryKey2 = ParamUtil.getLong(
				actionRequest, "objectRelationshipPrimaryKey2");

			ObjectRelationship objectRelationship =
				_objectRelationshipLocalService.getObjectRelationship(
					objectRelationshipId);

			ObjectDefinition objectDefinition =
				_objectDefinitionLocalService.getObjectDefinition(
					objectRelationship.getObjectDefinitionId2());

			_objectRelationshipLocalService.
				addObjectRelationshipMappingTableValues(
					_portal.getUserId(actionRequest), objectRelationshipId,
					objectEntryId, objectRelationshipPrimaryKey2,
					ServiceContextFactory.getInstance(
						objectDefinition.getClassName(), actionRequest));
		}
		catch (Exception exception) {
			if (exception instanceof ObjectEntryValuesException) {
				SessionErrors.add(actionRequest, exception.getClass());

				String redirect = ParamUtil.getString(
					actionRequest, "redirect");

				sendRedirect(actionRequest, actionResponse, redirect);
			}
			else {
				throw exception;
			}
		}
	}

	private final ObjectDefinitionLocalService _objectDefinitionLocalService;
	private final ObjectRelationshipLocalService
		_objectRelationshipLocalService;
	private final Portal _portal;

}