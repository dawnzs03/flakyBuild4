/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.portlet.action;

import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContextProvider;
import com.liferay.dynamic.data.mapping.util.DDMFormValuesToMapConverter;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.util.Portal;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Iván Zaera
 */
@Component(
	property = {
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY,
		"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY_ADMIN,
		"javax.portlet.name=" + DLPortletKeys.MEDIA_GALLERY_DISPLAY,
		"mvc.command.name=/document_library/edit_file_entry"
	},
	service = MVCRenderCommand.class
)
public class EditFileEntryMVCRenderCommand
	extends BaseFileEntryMVCRenderCommand {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		renderRequest.setAttribute(
			DDMFormValuesToMapConverter.class.getName(),
			_ddmFormValuesToMapConverter);
		renderRequest.setAttribute(
			DLAdminDisplayContext.class.getName(),
			_dlAdminDisplayContextProvider.getDLAdminDisplayContext(
				_portal.getHttpServletRequest(renderRequest),
				_portal.getHttpServletResponse(renderResponse)));

		return super.render(renderRequest, renderResponse);
	}

	@Override
	protected void checkPermissions(
			PermissionChecker permissionChecker, FileEntry fileEntry)
		throws PortalException {

		_fileEntryModelResourcePermission.check(
			permissionChecker, fileEntry, ActionKeys.UPDATE);
	}

	@Override
	protected String getPath() {
		return "/document_library/edit_file_entry.jsp";
	}

	@Reference
	private DDMFormValuesToMapConverter _ddmFormValuesToMapConverter;

	@Reference
	private DLAdminDisplayContextProvider _dlAdminDisplayContextProvider;

	@Reference(
		target = "(model.class.name=com.liferay.portal.kernel.repository.model.FileEntry)"
	)
	private volatile ModelResourcePermission<FileEntry>
		_fileEntryModelResourcePermission;

	@Reference
	private Portal _portal;

}