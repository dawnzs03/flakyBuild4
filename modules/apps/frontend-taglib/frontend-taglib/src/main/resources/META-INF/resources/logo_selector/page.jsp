<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/logo_selector/init.jsp" %>

<%
String defaultLogoURL = (String)request.getAttribute("liferay-frontend:logo-selector:defaultLogoURL");
String description = (String)request.getAttribute("liferay-frontend:logo-selector:description");
boolean disabled = (boolean)request.getAttribute("liferay-frontend:logo-selector:disabled");
String label = (String)request.getAttribute("liferay-frontend:logo-selector:label");
String logoURL = (String)request.getAttribute("liferay-frontend:logo-selector:logoURL");
String selectLogoURL = (String)request.getAttribute("liferay-frontend:logo-selector:selectLogoURL");
%>

<liferay-util:html-top>
	<link href="<%= PortalUtil.getStaticResourceURL(request, PortalUtil.getPathProxy() + application.getContextPath() + "/css/logo_selector.css") %>" rel="stylesheet" type="text/css" />
</liferay-util:html-top>

<div>
	<react:component
		module="logo_selector/LogoSelector"
		props='<%=
			HashMapBuilder.<String, Object>put(
				"defaultLogoURL", defaultLogoURL
			).put(
				"description", description
			).put(
				"disabled", disabled
			).put(
				"label", label
			).put(
				"logoURL", logoURL
			).put(
				"selectLogoURL", selectLogoURL
			).build()
		%>'
	/>
</div>