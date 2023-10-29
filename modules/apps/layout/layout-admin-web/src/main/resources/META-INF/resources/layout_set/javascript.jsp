<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
LayoutSet selLayoutSet = layoutsAdminDisplayContext.getSelLayoutSet();

LayoutLookAndFeelDisplayContext layoutLookAndFeelDisplayContext = new LayoutLookAndFeelDisplayContext(request, layoutsAdminDisplayContext, liferayPortletResponse);
%>

<liferay-frontend:fieldset
	collapsed="<%= false %>"
	collapsible="<%= true %>"
	label="javascript-client-extensions"
>
	<react:component
		module="js/layout/look_and_feel/GlobalJSCETsConfiguration"
		props="<%= layoutLookAndFeelDisplayContext.getGlobalJSCETsConfigurationProps(LayoutSet.class.getName(), selLayoutSet.getLayoutSetId()) %>"
	/>
</liferay-frontend:fieldset>

<%
UnicodeProperties layoutSetTypeSettingsUnicodeProperties = selLayoutSet.getSettingsProperties();
%>

<liferay-frontend:fieldset
	collapsed="<%= false %>"
	collapsible="<%= true %>"
	label="custom-javascript"
>
	<aui:input label="javascript" name="TypeSettingsProperties--javascript--" placeholder="javascript" type="textarea" value='<%= layoutSetTypeSettingsUnicodeProperties.getProperty("javascript") %>' wrap="soft" wrapperCssClass="c-mb-0 c-mt-4" />

	<p class="text-secondary">
		<liferay-ui:message key="paste-javascript-code-that-is-executed-at-the-bottom-of-every-page" />
	</p>
</liferay-frontend:fieldset>