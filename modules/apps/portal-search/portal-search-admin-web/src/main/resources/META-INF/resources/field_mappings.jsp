<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://liferay.com/tld/react" prefix="react" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@ page import="com.liferay.portal.search.admin.web.internal.constants.SearchAdminWebKeys" %><%@
page import="com.liferay.portal.search.admin.web.internal.display.context.FieldMappingsDisplayContext" %>

<liferay-theme:defineObjects />

<%
FieldMappingsDisplayContext fieldMappingsDisplayContext = (FieldMappingsDisplayContext)request.getAttribute(SearchAdminWebKeys.FIELD_MAPPINGS_DISPLAY_CONTEXT);
%>

<div>
	<react:component
		module="js/FieldMappings.es"
		props="<%= fieldMappingsDisplayContext.getData() %>"
	/>
</div>