<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
AssetListManagementToolbarDisplayContext assetListManagementToolbarDisplayContext = new AssetListManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, assetListDisplayContext);
%>

<clay:navigation-bar
	inverted="<%= true %>"
	navigationItems='<%= assetListDisplayContext.getNavigationItems("collections") %>'
/>

<clay:management-toolbar
	managementToolbarDisplayContext="<%= assetListManagementToolbarDisplayContext %>"
	propsTransformer="js/ManagementToolbarPropsTransformer"
/>

<portlet:actionURL name="/asset_list/delete_asset_list_entries" var="deleteAssetListEntryURL">
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>

<aui:form action="<%= deleteAssetListEntryURL %>" cssClass="container-fluid container-fluid-max-xl" name="fm">
	<liferay-site-navigation:breadcrumb
		breadcrumbEntries="<%= BreadcrumbEntriesUtil.getBreadcrumbEntries(request, true, false, false, true, true) %>"
	/>

	<c:choose>
		<c:when test="<%= assetListDisplayContext.getAssetListEntriesCount() > 0 %>">
			<liferay-ui:search-container
				id="assetListEntries"
				searchContainer="<%= assetListDisplayContext.getAssetListEntriesSearchContainer() %>"
			>
				<liferay-ui:search-container-row
					className="com.liferay.asset.list.model.AssetListEntry"
					keyProperty="assetListEntryId"
					modelVar="assetListEntry"
				>

					<%
					row.setData(
						HashMapBuilder.<String, Object>put(
							"actions", assetListManagementToolbarDisplayContext.getAvailableActions(assetListEntry)
						).build());

					int assetListEntrySegmentsEntryRelsCount = assetListDisplayContext.getAssetListEntrySegmentsEntryRelsCount(assetListEntry);
					Date createDate = assetListEntry.getCreateDate();
					%>

					<c:choose>
						<c:when test='<%= Objects.equals(assetListDisplayContext.getDisplayStyle(), "descriptive") %>'>
							<liferay-ui:search-container-column-text>
								<div class="lfr-portal-tooltip sticker sticker-secondary" title="<%= assetListDisplayContext.getAssetListEntryTypeLabel(assetListEntry) %>">
									<clay:icon
										cssClass="mr-2 text-secondary"
										symbol='<%= (assetListEntry.getType() == AssetListEntryTypeConstants.TYPE_DYNAMIC) ? "bolt" : "list" %>'
									/>
								</div>
							</liferay-ui:search-container-column-text>

							<liferay-ui:search-container-column-text
								colspan="<%= 2 %>"
							>
								<h5>
									<aui:a href="<%= assetListDisplayContext.getEditURL(assetListEntry) %>">
										<strong><%= HtmlUtil.escape(assetListEntry.getTitle()) %></strong>
									</aui:a>
								</h5>

								<h6 class="text-default">
									<%= assetListDisplayContext.getAssetEntrySubtypeLabel(assetListEntry) %>
								</h6>

								<h6 class="text-default">
									<liferay-ui:message arguments="<%= assetListDisplayContext.getAssetListEntryUsageCount(assetListEntry) %>" key="x-usages" translateArguments="<%= false %>" />
								</h6>

								<c:choose>
									<c:when test="<%= assetListEntrySegmentsEntryRelsCount > 0 %>">
										<clay:label
											cssClass="mr-auto"
											displayType="info"
											label='<%= LanguageUtil.format(locale, "x-variations", new String[] {String.valueOf(assetListEntrySegmentsEntryRelsCount)}) %>'
										/>
									</c:when>
									<c:otherwise>
										<clay:label
											cssClass="mr-auto"
											label="no-variations"
										/>
									</c:otherwise>
								</c:choose>
							</liferay-ui:search-container-column-text>

							<liferay-ui:search-container-column-text>
								<clay:dropdown-actions
									aria-label='<%= LanguageUtil.get(request, "show-actions") %>'
									dropdownItems="<%= assetListDisplayContext.getActionDropdownItems(assetListEntry) %>"
									propsTransformer="js/AssetEntryListDropdownDefaultPropsTransformer"
								/>
							</liferay-ui:search-container-column-text>
						</c:when>
						<c:when test='<%= Objects.equals(assetListDisplayContext.getDisplayStyle(), "icon") %>'>
							<liferay-ui:search-container-column-text>
								<clay:vertical-card
									propsTransformer="js/AssetEntryListDropdownDefaultPropsTransformer"
									verticalCard="<%= new AssetListEntryVerticalCard(assetListDisplayContext, assetListEntry, renderRequest, searchContainer.getRowChecker()) %>"
								/>
							</liferay-ui:search-container-column-text>
						</c:when>
						<c:otherwise>
							<liferay-ui:search-container-column-text
								cssClass="table-cell-expand text-truncate"
								name="name"
							>
								<span class="lfr-portal-tooltip" title="<%= assetListDisplayContext.getAssetListEntryTypeLabel(assetListEntry) %>">
									<clay:icon
										cssClass="mr-2 text-secondary"
										symbol='<%= (assetListEntry.getType() == AssetListEntryTypeConstants.TYPE_DYNAMIC) ? "bolt" : "list" %>'
									/>
								</span>

								<aui:a href="<%= assetListDisplayContext.getEditURL(assetListEntry) %>">
									<%= HtmlUtil.escape(assetListEntry.getTitle()) %>
								</aui:a>
							</liferay-ui:search-container-column-text>

							<liferay-ui:search-container-column-text
								cssClass="text-truncate"
								name="type"
							>
								<liferay-ui:message key="<%= HtmlUtil.escape(assetListEntry.getTypeLabel()) %>" />
							</liferay-ui:search-container-column-text>

							<liferay-ui:search-container-column-text
								cssClass="table-cell-expand text-truncate"
								name="item-type"
								value="<%= assetListDisplayContext.getAssetEntryTypeLabel(assetListEntry) %>"
							/>

							<liferay-ui:search-container-column-text
								cssClass="table-cell-expand text-truncate"
								name="subtype"
								value="<%= assetListDisplayContext.getClassTypeLabel(assetListEntry) %>"
							/>

							<liferay-ui:search-container-column-text
								cssClass="text-truncate"
								name="variations"
								value="<%= String.valueOf(assetListEntrySegmentsEntryRelsCount) %>"
							/>

							<liferay-ui:search-container-column-text
								cssClass="text-truncate"
								name="usages"
								value="<%= String.valueOf(assetListDisplayContext.getAssetListEntryUsageCount(assetListEntry)) %>"
							/>

							<liferay-ui:search-container-column-text
								cssClass="table-cell-expand text-truncate"
								name="modified"
							>
								<liferay-ui:message arguments="<%= LanguageUtil.getTimeDescription(request, System.currentTimeMillis() - createDate.getTime(), true) %>" key="x-ago" translateArguments="<%= false %>" />
							</liferay-ui:search-container-column-text>

							<liferay-ui:search-container-column-text>
								<clay:dropdown-actions
									aria-label='<%= LanguageUtil.get(request, "show-actions") %>'
									dropdownItems="<%= assetListDisplayContext.getActionDropdownItems(assetListEntry) %>"
									propsTransformer="js/AssetEntryListDropdownDefaultPropsTransformer"
								/>
							</liferay-ui:search-container-column-text>
						</c:otherwise>
					</c:choose>
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator
					displayStyle="<%= assetListDisplayContext.getDisplayStyle() %>"
					markupView="lexicon"
				/>
			</liferay-ui:search-container>
		</c:when>
		<c:otherwise>
			<liferay-frontend:empty-result-message
				actionDropdownItems="<%= assetListDisplayContext.isShowAddAssetListEntryAction() ? assetListDisplayContext.getAddAssetListEntryDropdownItems() : null %>"
				buttonCssClass="secondary"
				description="<%= assetListDisplayContext.getEmptyResultMessageDescription() %>"
				elementType='<%= LanguageUtil.get(request, "collections") %>'
				propsTransformer="js/EmptyResultMessagePropsTransformer"
				propsTransformerServletContext="<%= application %>"
			/>
		</c:otherwise>
	</c:choose>
</aui:form>