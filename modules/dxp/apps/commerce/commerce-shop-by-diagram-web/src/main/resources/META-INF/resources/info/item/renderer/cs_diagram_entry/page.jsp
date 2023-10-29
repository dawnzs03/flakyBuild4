<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/info/item/renderer/cs_diagram_entry/init.jsp" %>

<div class="autofit-col autofit-col-expand">
	<aui:a href="<%= cpDefinition.getURL(LanguageUtil.getLanguageId(locale)) %>">
		<%= cpDefinition.getName() %>
	</aui:a>
</div>