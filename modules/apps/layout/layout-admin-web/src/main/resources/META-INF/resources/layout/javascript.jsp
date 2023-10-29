<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
Layout selLayout = layoutsAdminDisplayContext.getSelLayout();

UnicodeProperties layoutTypeSettingsUnicodeProperties = null;

if (selLayout != null) {
	layoutTypeSettingsUnicodeProperties = selLayout.getTypeSettingsProperties();
}
%>

<liferay-ui:error-marker
	key="<%= WebKeys.ERROR_SECTION %>"
	value="javascript"
/>

<aui:model-context bean="<%= selLayout %>" model="<%= Layout.class %>" />

<%
LayoutLookAndFeelDisplayContext layoutLookAndFeelDisplayContext = new LayoutLookAndFeelDisplayContext(request, layoutsAdminDisplayContext, liferayPortletResponse);
%>

<liferay-frontend:fieldset
	collapsed="<%= false %>"
	collapsible="<%= true %>"
	label="javascript-client-extensions"
>
	<react:component
		module="js/layout/look_and_feel/GlobalJSCETsConfiguration"
		props="<%= layoutLookAndFeelDisplayContext.getGlobalJSCETsConfigurationProps(Layout.class.getName(), selLayout.getPlid()) %>"
	/>
</liferay-frontend:fieldset>

<liferay-frontend:fieldset
	collapsed="<%= false %>"
	collapsible="<%= true %>"
	label="custom-javascript"
>
	<aui:input cssClass="propagatable-field" disabled="<%= layoutsAdminDisplayContext.isReadOnly() || selLayout.isLayoutPrototypeLinkActive() %>" label="javascript" name="TypeSettingsProperties--javascript--" placeholder="javascript" type="textarea" value='<%= layoutTypeSettingsUnicodeProperties.getProperty("javascript") %>' wrap="soft" wrapperCssClass="c-mb-0" />

	<p class="text-secondary">
		<liferay-ui:message key="this-javascript-code-is-executed-at-the-bottom-of-the-page" />
	</p>
</liferay-frontend:fieldset>