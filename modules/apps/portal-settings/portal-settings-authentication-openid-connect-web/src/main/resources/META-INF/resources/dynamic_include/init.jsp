<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@ page import="com.liferay.portal.configuration.module.configuration.ConfigurationProviderUtil" %><%@
page import="com.liferay.portal.kernel.settings.CompanyServiceSettingsLocator" %><%@
page import="com.liferay.portal.kernel.settings.ParameterMapSettingsLocator" %><%@
page import="com.liferay.portal.kernel.util.PortalUtil" %><%@
page import="com.liferay.portal.security.sso.openid.connect.configuration.OpenIdConnectConfiguration" %><%@
page import="com.liferay.portal.security.sso.openid.connect.constants.OpenIdConnectConstants" %><%@
page import="com.liferay.portal.settings.authentication.openid.connect.web.internal.constants.PortalSettingsOpenIdConnectConstants" %>

<%@ page import="javax.portlet.ActionRequest" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />