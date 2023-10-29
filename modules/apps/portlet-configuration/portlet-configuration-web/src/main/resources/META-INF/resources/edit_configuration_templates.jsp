<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
PortletConfigurationTemplatesDisplayContext portletConfigurationTemplatesDisplayContext = new PortletConfigurationTemplatesDisplayContext(request, renderRequest, renderResponse);
%>

<div class="cadmin portlet-configuration-edit-templates">
	<portlet:actionURL name="deleteArchivedSetups" var="deleteArchivedSetupsURL">
		<portlet:param name="mvcPath" value="/edit_configuration_templates.jsp" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
		<portlet:param name="portletConfiguration" value="<%= Boolean.TRUE.toString() %>" />
		<portlet:param name="portletResource" value="<%= portletResource %>" />
	</portlet:actionURL>

	<aui:form action="<%= deleteArchivedSetupsURL %>" name="fm">
		<div class="portlet-configuration-body-content">
			<clay:management-toolbar
				managementToolbarDisplayContext="<%= new PortletConfigurationTemplatesManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, portletConfigurationTemplatesDisplayContext) %>"
				propsTransformer="js/ManagementToolbarPropsTransformer"
			/>

			<clay:container-fluid>
				<liferay-ui:error exception="<%= NoSuchPortletItemException.class %>" message="the-setup-could-not-be-found" />

				<div class="button-holder text-center">
					<portlet:renderURL var="addConfigurationTemplateURL">
						<portlet:param name="mvcPath" value="/add_configuration_template.jsp" />
						<portlet:param name="redirect" value="<%= currentURL %>" />
						<portlet:param name="portletResource" value="<%= portletResource %>" />
					</portlet:renderURL>

					<clay:link
						displayType="secondary"
						href="<%= addConfigurationTemplateURL %>"
						label="save-current-configuration-as-template"
						type="button"
					/>
				</div>

				<liferay-ui:search-container
					id="archivedSettings"
					searchContainer="<%= portletConfigurationTemplatesDisplayContext.getArchivedSettingsSearchContainer() %>"
				>
					<liferay-ui:search-container-row
						className="com.liferay.portal.kernel.settings.ArchivedSettings"
						keyProperty="name"
						modelVar="archivedSettings"
					>
						<c:choose>
							<c:when test='<%= Objects.equals(portletConfigurationTemplatesDisplayContext.getDisplayStyle(), "descriptive") %>'>
								<liferay-ui:search-container-column-icon
									icon="archive"
								/>

								<liferay-ui:search-container-column-text
									colspan="<%= 2 %>"
								>
									<h6 class="text-default">
										<liferay-ui:message arguments="<%= new String[] {LanguageUtil.getTimeDescription(locale, System.currentTimeMillis() - archivedSettings.getModifiedDate().getTime(), true), HtmlUtil.escape(archivedSettings.getUserName())} %>" key="x-ago-by-x" translateArguments="<%= false %>" />
									</h6>

									<h5>
										<%= HtmlUtil.escape(archivedSettings.getName()) %>
									</h5>
								</liferay-ui:search-container-column-text>

								<liferay-ui:search-container-column-text>
									<clay:dropdown-actions
										aria-label='<%= LanguageUtil.get(request, "show-actions") %>'
										dropdownItems="<%= portletConfigurationTemplatesDisplayContext.getActionDropdownItems(archivedSettings) %>"
										propsTransformer="js/ArchivedSetuptsDropdownDefaultPropsTransformer"
									/>
								</liferay-ui:search-container-column-text>
							</c:when>
							<c:when test='<%= Objects.equals(portletConfigurationTemplatesDisplayContext.getDisplayStyle(), "icon") %>'>
								<liferay-ui:search-container-column-text>
									<clay:vertical-card
										verticalCard="<%= new ArchivedSettingsVerticalCard(archivedSettings, renderRequest, renderResponse) %>"
									/>
								</liferay-ui:search-container-column-text>
							</c:when>
							<c:when test='<%= Objects.equals(portletConfigurationTemplatesDisplayContext.getDisplayStyle(), "list") %>'>
								<liferay-ui:search-container-column-text
									name="name"
									truncate="<%= true %>"
								>
									<%= HtmlUtil.escape(archivedSettings.getName()) %>
								</liferay-ui:search-container-column-text>

								<liferay-ui:search-container-column-text
									name="user-name"
									truncate="<%= true %>"
								>
									<%= HtmlUtil.escape(archivedSettings.getUserName()) %>
								</liferay-ui:search-container-column-text>

								<liferay-ui:search-container-column-date
									name="modified-date"
									property="modifiedDate"
								/>

								<liferay-ui:search-container-column-text>
									<clay:dropdown-actions
										aria-label='<%= LanguageUtil.get(request, "show-actions") %>'
										dropdownItems="<%= portletConfigurationTemplatesDisplayContext.getActionDropdownItems(archivedSettings) %>"
										propsTransformer="js/ArchivedSetuptsDropdownDefaultPropsTransformer"
									/>
								</liferay-ui:search-container-column-text>
							</c:when>
						</c:choose>
					</liferay-ui:search-container-row>

					<liferay-ui:search-iterator
						displayStyle="<%= portletConfigurationTemplatesDisplayContext.getDisplayStyle() %>"
						markupView="lexicon"
					/>
				</liferay-ui:search-container>
			</clay:container-fluid>
		</div>
	</aui:form>
</div>