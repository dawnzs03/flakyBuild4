<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ include file="/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

String specificationNavbarItemKey = ParamUtil.getString(request, "specificationNavbarItemKey", "specification-groups");

CPOptionCategory cpOptionCategory = (CPOptionCategory)request.getAttribute(CPWebKeys.CP_OPTION_CATEGORY);

long cpOptionCategoryId = BeanParamUtil.getLong(cpOptionCategory, request, "CPOptionCategoryId");

renderResponse.setTitle(LanguageUtil.get(request, "specifications"));

portletDisplay.setShowBackIcon(true);

if (Validator.isNull(redirect)) {
	portletDisplay.setURLBack(String.valueOf(renderResponse.createRenderURL()));
}
else {
	portletDisplay.setURLBack(redirect);
}
%>

<%@ include file="/navbar_specifications.jspf" %>

<portlet:actionURL name="/cp_specification_options/edit_cp_option_category" var="editProductOptionCategoryActionURL" />

<aui:form action="<%= editProductOptionCategoryActionURL %>" cssClass="container-fluid container-fluid-max-xl" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (cpOptionCategory == null) ? Constants.ADD : Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
	<aui:input name="cpOptionCategoryId" type="hidden" value="<%= String.valueOf(cpOptionCategoryId) %>" />

	<div class="lfr-form-content">
		<liferay-frontend:form-navigator
			backURL="<%= redirect %>"
			formModelBean="<%= cpOptionCategory %>"
			id="<%= CPOptionCategoryFormNavigatorConstants.FORM_NAVIGATOR_ID_COMMERCE_PRODUCT_OPTION_CATEGORY %>"
		/>
	</div>
</aui:form>