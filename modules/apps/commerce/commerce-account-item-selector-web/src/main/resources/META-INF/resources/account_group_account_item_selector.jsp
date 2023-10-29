<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
CommerceAccountGroupAccountItemSelectorViewDisplayContext commerceAccountGroupAccountItemSelectorViewDisplayContext = (CommerceAccountGroupAccountItemSelectorViewDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

String itemSelectedEventName = commerceAccountGroupAccountItemSelectorViewDisplayContext.getItemSelectedEventName();
%>

<clay:management-toolbar
	managementToolbarDisplayContext="<%= new CommerceAccountGroupAccountItemSelectorViewManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, commerceAccountGroupAccountItemSelectorViewDisplayContext.getSearchContainer()) %>"
/>

<div class="container-fluid container-fluid-max-xl" id="<portlet:namespace />commerceAccountSelectorWrapper">
	<liferay-ui:search-container
		id="accountEntry"
		searchContainer="<%= commerceAccountGroupAccountItemSelectorViewDisplayContext.getSearchContainer() %>"
	>
		<liferay-ui:search-container-row
			className="com.liferay.account.model.AccountEntry"
			cssClass="commerce-account-row"
			keyProperty="accountEntryId"
			modelVar="accountEntry"
		>

			<%
			row.setData(
				HashMapBuilder.<String, Object>put(
					"commerce-account-id", accountEntry.getAccountEntryId()
				).put(
					"name", accountEntry.getName()
				).build());
			%>

			<liferay-ui:search-container-column-text
				cssClass="table-cell-expand"
				property="name"
			/>

			<liferay-ui:search-container-column-text
				cssClass="table-cell-expand"
				property="active"
			/>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</div>

<aui:script use="liferay-search-container">
	var searchContainer = Liferay.SearchContainer.get(
		'<portlet:namespace />accountEntries'
	);

	searchContainer.on('rowToggled', (event) => {
		var allSelectedElements = event.elements.allSelectedElements;
		var arr = [];

		allSelectedElements.each(function () {
			var row = this.ancestor('tr');

			var data = row.getDOM().dataset;

			arr.push({accountEntryId: data.accountEntryId, name: data.name});
		});

		Liferay.Util.getOpener().Liferay.fire(
			'<%= HtmlUtil.escapeJS(itemSelectedEventName) %>',
			{
				data: arr,
			}
		);
	});
</aui:script>