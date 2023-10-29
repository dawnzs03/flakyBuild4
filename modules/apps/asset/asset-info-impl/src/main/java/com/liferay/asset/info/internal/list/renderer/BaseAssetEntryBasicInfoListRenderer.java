/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.info.internal.list.renderer;

import com.liferay.asset.info.internal.item.renderer.AssetEntryTitleInfoItemRenderer;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.info.item.renderer.InfoItemRenderer;
import com.liferay.info.item.renderer.InfoItemRendererRegistry;
import com.liferay.info.list.renderer.DefaultInfoListRendererContext;
import com.liferay.info.list.renderer.InfoListRendererContext;
import com.liferay.info.taglib.list.renderer.BasicInfoListRenderer;
import com.liferay.info.taglib.servlet.taglib.InfoListBasicListTag;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Reference;

/**
 * @author Pavel Savinov
 */
public abstract class BaseAssetEntryBasicInfoListRenderer
	implements BasicInfoListRenderer<AssetEntry> {

	@Override
	public List<InfoItemRenderer<?>> getAvailableInfoItemRenderers() {
		return infoItemRendererRegistry.getInfoItemRenderers(
			AssetEntry.class.getName());
	}

	@Override
	public void render(
		List<AssetEntry> assetEntries, HttpServletRequest httpServletRequest,
		HttpServletResponse httpServletResponse) {

		render(
			assetEntries,
			new DefaultInfoListRendererContext(
				httpServletRequest, httpServletResponse));
	}

	@Override
	public void render(
		List<AssetEntry> assetEntries,
		InfoListRendererContext infoListRendererContext) {

		InfoListBasicListTag infoListBasicListTag = new InfoListBasicListTag();

		infoListBasicListTag.setInfoListObjects(assetEntries);

		String listItemRendererKey =
			infoListRendererContext.getListItemRendererKey();

		if (Validator.isNotNull(listItemRendererKey)) {
			infoListBasicListTag.setItemRendererKey(listItemRendererKey);
		}
		else {
			infoListBasicListTag.setItemRendererKey(
				AssetEntryTitleInfoItemRenderer.class.getName());
		}

		infoListBasicListTag.setListStyleKey(getListStyle());

		String templateKey = infoListRendererContext.getTemplateKey();

		if (Validator.isNotNull(templateKey)) {
			infoListBasicListTag.setTemplateKey(templateKey);
		}

		try {
			infoListBasicListTag.doTag(
				infoListRendererContext.getHttpServletRequest(),
				infoListRendererContext.getHttpServletResponse());
		}
		catch (Exception exception) {
			_log.error("Unable to render journal articles list", exception);
		}
	}

	@Reference
	protected InfoItemRendererRegistry infoItemRendererRegistry;

	private static final Log _log = LogFactoryUtil.getLog(
		BaseAssetEntryBasicInfoListRenderer.class);

}