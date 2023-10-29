<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/application-list" prefix="liferay-application-list" %><%@
taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/clay" prefix="clay" %><%@
taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.application.list.PanelApp" %><%@
page import="com.liferay.application.list.PanelAppRegistry" %><%@
page import="com.liferay.application.list.PanelCategory" %><%@
page import="com.liferay.application.list.PanelCategoryRegistry" %><%@
page import="com.liferay.application.list.constants.ApplicationListWebKeys" %><%@
page import="com.liferay.application.list.display.context.logic.PanelCategoryHelper" %><%@
page import="com.liferay.application.list.taglib.display.context.logic.PanelAppContentHelper" %><%@
page import="com.liferay.application.list.taglib.internal.display.context.ContentPanelCategoryDisplayContext" %><%@
page import="com.liferay.application.list.taglib.internal.util.PanelAppUtil" %><%@
page import="com.liferay.application.list.taglib.internal.util.PanelCategoryUtil" %><%@
page import="com.liferay.petra.string.StringPool" %><%@
page import="com.liferay.portal.kernel.model.Group" %><%@
page import="com.liferay.portal.kernel.model.Layout" %><%@
page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.util.HashMapBuilder" %><%@
page import="com.liferay.portal.kernel.util.Validator" %><%@
page import="com.liferay.taglib.servlet.PipingServletResponseFactory" %>

<%@ page import="java.util.List" %>

<liferay-theme:defineObjects />