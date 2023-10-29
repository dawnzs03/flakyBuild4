<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<liferay-util:html-top
	outputKey="document_library_video_css"
>
	<link href="<%= PortalUtil.getStaticResourceURL(request, PortalUtil.getPathProxy() + application.getContextPath() + "/css/main.css") %>" rel="stylesheet" type="text/css" />
	<link href="<%= PortalUtil.getStaticResourceURL(request, PortalUtil.getPathModule() + "/document-library-preview-css/css/main.css") %>" rel="stylesheet" />
</liferay-util:html-top>

<div class="preview-file video-preview video-preview-framed">
	<div class="video-preview-aspect-ratio">

		<%
		DLVideoRenderer dlVideoRenderer = (DLVideoRenderer)request.getAttribute(DLVideoRenderer.class.getName());

		FileVersion fileVersion = (FileVersion)request.getAttribute(FileVersion.class.getName());
		%>

		<%= dlVideoRenderer.renderHTML(fileVersion, request) %>
	</div>
</div>