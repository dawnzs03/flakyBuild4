<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/clay" prefix="clay" %><%@
taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.account.constants.AccountConstants" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPDefinitionItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPDefinitionItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPInstanceItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPInstanceItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPOptionItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPOptionItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPSpecificationOptionItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CPSpecificationOptionItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CommerceChannelItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.CommerceChannelsItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.LayoutPageTemplateEntryItemSelectorViewDisplayContext" %><%@
page import="com.liferay.commerce.product.item.selector.web.internal.display.context.LayoutPageTemplateEntryItemSelectorViewManagementToolbarDisplayContext" %><%@
page import="com.liferay.commerce.product.model.CPDefinition" %><%@
page import="com.liferay.commerce.product.model.CPInstance" %><%@
page import="com.liferay.commerce.product.model.CPOption" %><%@
page import="com.liferay.commerce.product.model.CPSpecificationOption" %><%@
page import="com.liferay.commerce.product.model.CommerceChannel" %><%@
page import="com.liferay.commerce.product.type.CPType" %><%@
page import="com.liferay.layout.page.template.model.LayoutPageTemplateEntry" %><%@
page import="com.liferay.portal.kernel.dao.search.SearchContainer" %><%@
page import="com.liferay.portal.kernel.util.HashMapBuilder" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.Validator" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<portlet:defineObjects />