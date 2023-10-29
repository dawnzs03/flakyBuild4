/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.frontend.taglib.servlet.taglib;

import com.liferay.commerce.frontend.taglib.internal.servlet.ServletContextUtil;
import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.service.CPDefinitionLocalServiceUtil;
import com.liferay.info.item.renderer.InfoItemRenderer;
import com.liferay.info.item.renderer.InfoItemRendererRegistry;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

/**
 * @author Alessio Antonio Rendina
 */
public class OptionSelectorTag extends IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		try {
			InfoItemRenderer<CPDefinition> infoItemRenderer =
				(InfoItemRenderer<CPDefinition>)
					_infoItemRendererRegistry.getInfoItemRenderer(
						"cpDefinition-option-selector");

			infoItemRenderer.render(
				CPDefinitionLocalServiceUtil.getCPDefinition(_cpDefinitionId),
				(HttpServletRequest)pageContext.getRequest(),
				PipingServletResponseFactory.createPipingServletResponse(
					pageContext));
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception);
			}

			return SKIP_BODY;
		}

		return SKIP_BODY;
	}

	public long getCPDefinitionId() {
		return _cpDefinitionId;
	}

	public String getNamespace() {
		return _namespace;
	}

	public void setCPDefinitionId(long cpDefinitionId) {
		_cpDefinitionId = cpDefinitionId;
	}

	public void setNamespace(String namespace) {
		_namespace = namespace;
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		super.setPageContext(pageContext);

		setServletContext(ServletContextUtil.getServletContext());

		_infoItemRendererRegistry =
			ServletContextUtil.getInfoItemRendererRegistry();
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_cpDefinitionId = 0;
		_infoItemRendererRegistry = null;
		_namespace = StringPool.BLANK;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		OptionSelectorTag.class);

	private long _cpDefinitionId;
	private InfoItemRendererRegistry _infoItemRendererRegistry;
	private String _namespace = StringPool.BLANK;

}