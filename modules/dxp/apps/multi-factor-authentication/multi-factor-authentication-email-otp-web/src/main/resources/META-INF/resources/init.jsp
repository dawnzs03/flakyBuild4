<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.multi.factor.authentication.email.otp.configuration.MFAEmailOTPConfiguration" %><%@
page import="com.liferay.multi.factor.authentication.email.otp.web.internal.constants.MFAEmailOTPPortletKeys" %><%@
page import="com.liferay.multi.factor.authentication.email.otp.web.internal.constants.MFAEmailOTPWebKeys" %><%@
page import="com.liferay.portal.configuration.module.configuration.ConfigurationProviderUtil" %><%@
page import="com.liferay.portal.kernel.util.GetterUtil" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<%
MFAEmailOTPConfiguration mfaEmailOTPConfiguration = ConfigurationProviderUtil.getCompanyConfiguration(MFAEmailOTPConfiguration.class, themeDisplay.getCompanyId());
%>