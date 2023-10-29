<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<react:component
	module="js/FDSEntries"
	props='<%=
		HashMapBuilder.<String, Object>put(
			"fdsViewsURL", fdsViewsDisplayContext.getFDSViewsURL()
		).put(
			"namespace", liferayPortletResponse.getNamespace()
		).put(
			"permissionsURL", fdsViewsDisplayContext.getFDSEntryPermissionsURL()
		).put(
			"restApplications", fdsViewsDisplayContext.getRESTApplicationsJSONArray()
		).build()
	%>'
/>