<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
FDSSampleDisplayContext fdsSampleDisplayContext = (FDSSampleDisplayContext)request.getAttribute(FDSSampleWebKeys.FDS_SAMPLE_DISPLAY_CONTEXT);
%>

<frontend-data-set:headless-display
	additionalProps='<%=
		HashMapBuilder.<String, Object>put(
			"greeting", "Hello"
		).build()
	%>'
	apiURL="<%= fdsSampleDisplayContext.getAPIURL() %>"
	bulkActionDropdownItems="<%= fdsSampleDisplayContext.getBulkActionDropdownItems() %>"
	customViewsEnabled="<%= true %>"
	fdsActionDropdownItems="<%= fdsSampleDisplayContext.getFDSActionDropdownItems() %>"
	formId="fm"
	id="<%= FDSSampleFDSNames.CUSTOMIZED %>"
	itemsPerPage="<%= 10 %>"
	propsTransformer="{SampleFDSPropsTransformer} from frontend-data-set-sample-web"
	selectedItemsKey="id"
	selectionType="multiple"
	style="fluid"
/>