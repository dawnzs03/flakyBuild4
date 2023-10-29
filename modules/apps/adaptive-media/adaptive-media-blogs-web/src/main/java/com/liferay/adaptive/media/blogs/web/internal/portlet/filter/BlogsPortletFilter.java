/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.adaptive.media.blogs.web.internal.portlet.filter;

import com.liferay.adaptive.media.content.transformer.ContentTransformerHandler;
import com.liferay.adaptive.media.content.transformer.constants.ContentTransformerContentTypes;
import com.liferay.blogs.constants.BlogsPortletKeys;
import com.liferay.petra.io.unsync.UnsyncStringWriter;
import com.liferay.portal.kernel.io.WriterOutputStream;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.servlet.BufferCacheServletResponse;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.UnsyncPrintWriterPool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;
import javax.portlet.filter.RenderResponseWrapper;

import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alejandro Tardín
 */
@Component(
	property = "javax.portlet.name=" + BlogsPortletKeys.BLOGS,
	service = PortletFilter.class
)
public class BlogsPortletFilter implements RenderFilter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(
			RenderRequest renderRequest, RenderResponse renderResponse,
			FilterChain filterChain)
		throws IOException, PortletException {

		String mvcRenderCommandName = ParamUtil.getString(
			renderRequest, "mvcRenderCommandName");

		if (!mvcRenderCommandName.equals("/blogs/view_entry")) {
			filterChain.doFilter(renderRequest, renderResponse);

			return;
		}

		if (renderResponse instanceof LiferayPortletResponse) {
			_processLiferayPortletResponse(
				renderRequest, renderResponse, filterChain);

			return;
		}

		UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();

		RenderResponseWrapper renderResponseWrapper = new RenderResponseWrapper(
			renderResponse) {

			@Override
			public OutputStream getPortletOutputStream() throws IOException {
				if (_calledGetWriter) {
					throw new IllegalStateException(
						"Unable to obtain OutputStream because Writer is " +
							"already in use");
				}

				if (_outputStream != null) {
					return _outputStream;
				}

				_outputStream = new WriterOutputStream(unsyncStringWriter);

				_calledGetOutputStream = true;

				return _outputStream;
			}

			@Override
			public PrintWriter getWriter() throws IOException {
				if (_calledGetOutputStream) {
					throw new IllegalStateException(
						"Unable to obtain Writer because OutputStream is " +
							"already in use");
				}

				if (_printWriter != null) {
					return _printWriter;
				}

				_printWriter = UnsyncPrintWriterPool.borrow(unsyncStringWriter);

				_calledGetWriter = true;

				return _printWriter;
			}

			private boolean _calledGetOutputStream;
			private boolean _calledGetWriter;
			private OutputStream _outputStream;
			private PrintWriter _printWriter;

		};

		filterChain.doFilter(renderRequest, renderResponseWrapper);

		PrintWriter printWriter = renderResponse.getWriter();

		printWriter.write(
			_contentTransformerHandler.transform(
				ContentTransformerContentTypes.HTML,
				unsyncStringWriter.toString()));
	}

	@Override
	public void init(FilterConfig filterConfig) {
	}

	private void _processLiferayPortletResponse(
			RenderRequest renderRequest, RenderResponse renderResponse,
			FilterChain filterChain)
		throws IOException, PortletException {

		filterChain.doFilter(renderRequest, renderResponse);

		HttpServletResponse httpServletResponse =
			_portal.getHttpServletResponse(renderResponse);

		BufferCacheServletResponse bufferCacheServletResponse =
			(BufferCacheServletResponse)httpServletResponse;

		ServletResponseUtil.write(
			httpServletResponse,
			_contentTransformerHandler.transform(
				ContentTransformerContentTypes.HTML,
				bufferCacheServletResponse.getString()));
	}

	@Reference
	private ContentTransformerHandler _contentTransformerHandler;

	@Reference
	private Portal _portal;

}