/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.content.page.editor.web.internal.portlet.action;

import com.liferay.fragment.service.FragmentEntryLinkLocalService;
import com.liferay.layout.content.page.editor.constants.ContentPageEditorPortletKeys;
import com.liferay.layout.content.page.editor.web.internal.util.ContentManager;
import com.liferay.layout.content.page.editor.web.internal.util.layout.structure.LayoutStructureUtil;
import com.liferay.layout.util.structure.LayoutStructure;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Eudaldo Alonso
 */
@Component(
	property = {
		"javax.portlet.name=" + ContentPageEditorPortletKeys.CONTENT_PAGE_EDITOR_PORTLET,
		"mvc.command.name=/layout_content_page_editor/update_row_columns"
	},
	service = MVCActionCommand.class
)
public class UpdateRowColumnsMVCActionCommand
	extends BaseContentPageEditorTransactionalMVCActionCommand {

	@Override
	protected JSONObject doTransactionalCommand(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long segmentsExperienceId = ParamUtil.getLong(
			actionRequest, "segmentsExperienceId");
		String itemId = ParamUtil.getString(actionRequest, "itemId");
		int numberOfColumns = ParamUtil.getInteger(
			actionRequest, "numberOfColumns");

		LayoutStructureUtil.updateLayoutPageTemplateData(
			themeDisplay.getScopeGroupId(), segmentsExperienceId,
			themeDisplay.getPlid(),
			layoutStructure ->
				layoutStructure.updateRowColumnsLayoutStructureItem(
					itemId, numberOfColumns));

		return JSONUtil.put(
			"layoutData",
			() -> {
				LayoutStructure layoutStructure =
					LayoutStructureUtil.getLayoutStructure(
						themeDisplay.getScopeGroupId(), themeDisplay.getPlid(),
						segmentsExperienceId);

				return layoutStructure.toJSONObject();
			}
		).put(
			"pageContents",
			_contentManager.getPageContentsJSONArray(
				_portal.getHttpServletRequest(actionRequest),
				_portal.getHttpServletResponse(actionResponse),
				themeDisplay.getPlid(), segmentsExperienceId)
		);
	}

	@Reference
	private ContentManager _contentManager;

	@Reference
	private FragmentEntryLinkLocalService _fragmentEntryLinkLocalService;

	@Reference
	private Portal _portal;

}