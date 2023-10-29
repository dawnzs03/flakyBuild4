<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/unsubscribe/init.jsp" %>

<liferay-ui:header
	title="error"
/>

<liferay-ui:error exception="<%= NoSuchTicketException.class %>" message="the-link-is-no-longer-valid" />

<liferay-ui:error-principal />