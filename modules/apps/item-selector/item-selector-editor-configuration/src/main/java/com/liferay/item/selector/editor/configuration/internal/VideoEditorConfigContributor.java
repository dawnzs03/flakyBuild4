/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.item.selector.editor.configuration.internal;

import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorCriterion;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.VideoEmbeddableHTMLItemSelectorReturnType;
import com.liferay.item.selector.criteria.url.criterion.URLItemSelectorCriterion;
import com.liferay.item.selector.criteria.video.criterion.VideoItemSelectorCriterion;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Lancha
 */
@Component(service = EditorConfigContributor.class)
public class VideoEditorConfigContributor extends BaseEditorConfigContributor {

	@Override
	public void populateConfigJSONObject(
		JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
		ThemeDisplay themeDisplay,
		RequestBackedPortletURLFactory requestBackedPortletURLFactory) {

		List<ItemSelectorCriterion> itemSelectorCriteria = new ArrayList<>();

		boolean allowBrowseDocuments = GetterUtil.getBoolean(
			inputEditorTaglibAttributes.get(
				"liferay-ui:input-editor:allowBrowseDocuments"),
			true);

		if (allowBrowseDocuments) {
			itemSelectorCriteria.add(new VideoItemSelectorCriterion());
		}

		itemSelectorCriteria.add(new URLItemSelectorCriterion());

		PortletURL itemSelectorURL = getItemSelectorPortletURL(
			inputEditorTaglibAttributes, requestBackedPortletURLFactory,
			itemSelectorCriteria.toArray(new ItemSelectorCriterion[0]));

		if (itemSelectorURL != null) {
			jsonObject.put(
				"filebrowserVideoBrowseLinkUrl", itemSelectorURL.toString()
			).put(
				"filebrowserVideoBrowseUrl", itemSelectorURL.toString()
			);
		}
	}

	@Override
	protected List<ItemSelectorReturnType> getDesiredItemSelectorReturnTypes() {
		return Arrays.asList(new VideoEmbeddableHTMLItemSelectorReturnType());
	}

	@Override
	protected ItemSelector getItemSelector() {
		return _itemSelector;
	}

	@Reference
	private ItemSelector _itemSelector;

}