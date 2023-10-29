<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
boolean showStagingConfiguration = ParamUtil.getBoolean(request, "showStagingConfiguration");
%>

<c:choose>
	<c:when test="<%= !GroupPermissionUtil.contains(permissionChecker, group, ActionKeys.VIEW_STAGING) %>">
		<div class="alert alert-info">
			<liferay-ui:message key="you-do-not-have-permission-to-access-the-requested-resource" />
		</div>
	</c:when>
	<c:when test="<%= showStagingConfiguration || (PropsValues.STAGING_LIVE_GROUP_REMOTE_STAGING_ENABLED && !group.isStaged()) || (!group.isStaged() && !group.hasLocalOrRemoteStagingGroup()) %>">

		<%
		if (group.isStaged() || group.hasLocalOrRemoteStagingGroup()) {
			portletDisplay.setShowBackIcon(true);

			portletDisplay.setURLBack(
				PortletURLBuilder.create(
					PortalUtil.getControlPanelPortletURL(request, StagingProcessesPortletKeys.STAGING_PROCESSES, PortletRequest.RENDER_PHASE)
				).setMVCPath(
					"/view.jsp"
				).buildString());
		}
		%>

		<liferay-portlet:runtime
			portletName="<%= StagingConfigurationPortletKeys.STAGING_CONFIGURATION %>"
		/>
	</c:when>
	<c:otherwise>
		<liferay-util:include page="/navigation.jsp" servletContext="<%= application %>" />
	</c:otherwise>
</c:choose>