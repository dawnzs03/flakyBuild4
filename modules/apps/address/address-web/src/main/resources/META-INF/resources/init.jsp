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

<%@ page import="com.liferay.address.web.internal.constants.CountryScreenNavigationConstants" %><%@
page import="com.liferay.address.web.internal.dao.search.CountrySearchContainerFactory" %><%@
page import="com.liferay.address.web.internal.dao.search.RegionSearchContainerFactory" %><%@
page import="com.liferay.address.web.internal.display.context.CountriesManagementAdminManagementToolbarDisplayContext" %><%@
page import="com.liferay.address.web.internal.display.context.RegionsManagementToolbarDisplayContext" %><%@
page import="com.liferay.petra.string.StringPool" %><%@
page import="com.liferay.portal.kernel.dao.search.ResultRow" %><%@
page import="com.liferay.portal.kernel.dao.search.SearchContainer" %><%@
page import="com.liferay.portal.kernel.exception.CountryA2Exception" %><%@
page import="com.liferay.portal.kernel.exception.CountryA3Exception" %><%@
page import="com.liferay.portal.kernel.exception.CountryNameException" %><%@
page import="com.liferay.portal.kernel.exception.CountryNumberException" %><%@
page import="com.liferay.portal.kernel.exception.CountryTitleException" %><%@
page import="com.liferay.portal.kernel.exception.DuplicateCountryException" %><%@
page import="com.liferay.portal.kernel.exception.DuplicateRegionException" %><%@
page import="com.liferay.portal.kernel.exception.NoSuchCountryException" %><%@
page import="com.liferay.portal.kernel.exception.NoSuchRegionException" %><%@
page import="com.liferay.portal.kernel.exception.RegionCodeException" %><%@
page import="com.liferay.portal.kernel.exception.RegionNameException" %><%@
page import="com.liferay.portal.kernel.language.LanguageUtil" %><%@
page import="com.liferay.portal.kernel.model.Country" %><%@
page import="com.liferay.portal.kernel.model.CountryLocalization" %><%@
page import="com.liferay.portal.kernel.model.ModelHintsUtil" %><%@
page import="com.liferay.portal.kernel.model.Region" %><%@
page import="com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder" %><%@
page import="com.liferay.portal.kernel.security.permission.ActionKeys" %><%@
page import="com.liferay.portal.kernel.service.CountryLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.CountryServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.RegionLocalServiceUtil" %><%@
page import="com.liferay.portal.kernel.service.permission.PortalPermissionUtil" %><%@
page import="com.liferay.portal.kernel.util.Constants" %><%@
page import="com.liferay.portal.kernel.util.HashMapBuilder" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.LocaleUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.StringUtil" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %>

<%@ page import="java.util.ArrayList" %><%@
page import="java.util.List" %>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<portlet:defineObjects />