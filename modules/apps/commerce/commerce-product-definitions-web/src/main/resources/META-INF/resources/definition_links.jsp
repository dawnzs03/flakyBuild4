<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
CPDefinitionLinkDisplayContext cpDefinitionLinkDisplayContext = (CPDefinitionLinkDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

CPDefinition cpDefinition = cpDefinitionLinkDisplayContext.getCPDefinition();
long cpDefinitionId = cpDefinitionLinkDisplayContext.getCPDefinitionId();
%>

<c:if test="<%= CommerceCatalogPermission.contains(permissionChecker, cpDefinition, ActionKeys.VIEW) %>">
	<portlet:actionURL name="/cp_definitions/edit_cp_definition_link" var="addCPDefinitionLinkURL" />

	<aui:form action="<%= addCPDefinitionLinkURL %>" cssClass="hide" name="addCPDefinitionLinkFm">
		<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>" />
		<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
		<aui:input name="cpDefinitionId" type="hidden" value="<%= cpDefinitionId %>" />
		<aui:input name="cpDefinitionIds" type="hidden" value="" />
		<aui:input name="type" type="hidden" value="" />
	</aui:form>

	<div class="pt-4" id="<portlet:namespace />productDefinitionLinksContainer">
		<portlet:actionURL name="/cp_definitions/edit_cp_definition" var="editProductDefinitionLinksActionURL" />

		<aui:form action="<%= editProductDefinitionLinksActionURL %>" method="post" name="fm">
			<aui:input name="<%= Constants.CMD %>" type="hidden" />
			<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
			<aui:input name="cpDefinitionId" type="hidden" value="<%= cpDefinitionId %>" />
			<aui:input name="workflowAction" type="hidden" value="<%= WorkflowConstants.ACTION_SAVE_DRAFT %>" />

			<frontend-data-set:classic-display
				contextParams='<%=
					HashMapBuilder.<String, String>put(
						"cpDefinitionId", String.valueOf(cpDefinitionLinkDisplayContext.getCPDefinitionId())
					).build()
				%>'
				creationMenu="<%= cpDefinitionLinkDisplayContext.getCreationMenu() %>"
				dataProviderKey="<%= CommerceProductFDSNames.PRODUCT_LINKS %>"
				formName="fm"
				id="<%= CommerceProductFDSNames.PRODUCT_LINKS %>"
				itemsPerPage="<%= 10 %>"
				style="stacked"
			/>
		</aui:form>
	</div>

	<aui:script sandbox="<%= true %>">
		const eventHandlers = [];
		let eventHandler;

		<%
		for (String type : cpDefinitionLinkDisplayContext.getCPDefinitionLinkTypes()) {
		%>

			eventHandler = Liferay.on(
				'<portlet:namespace />addCommerceProductDefinitionLink<%= HtmlUtil.escapeJS(type) %>',
				() => {
					Liferay.Util.openSelectionModal({
						multiple: true,
						onSelect: (selectedItems) => {
							if (!selectedItems || !selectedItems.length) {
								return;
							}

							const cpDefinitionIdsInput = document.getElementById(
								'<portlet:namespace />cpDefinitionIds'
							);

							if (cpDefinitionIdsInput) {
								const values = selectedItems.map((item) => item.value);

								cpDefinitionIdsInput.value = values.join(',');
							}

							const typeInput = document.getElementById(
								'<portlet:namespace />type'
							);

							if (typeInput) {
								typeInput.value = '<%= HtmlUtil.escapeJS(type) %>';
							}

							const form = document.getElementById(
								'<portlet:namespace />addCPDefinitionLinkFm'
							);

							if (form) {
								submitForm(form);
							}
						},
						title:
							'<liferay-ui:message arguments="<%= HtmlUtil.escapeJS(cpDefinition.getName(languageId)) %>" key="add-new-product-to-x" />',
						url:
							'<%= cpDefinitionLinkDisplayContext.getItemSelectorUrl(type) %>',
					});
				}
			);

			eventHandlers.push(eventHandler);

		<%
		}
		%>

		Liferay.on('destroyPortlet', () => {
			eventHandlers.forEach((eventHandler) => {
				eventHandler.detach();
			});
		});
	</aui:script>
</c:if>