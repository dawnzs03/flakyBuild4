<%--
/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://liferay.com/tld/react" prefix="react" %>

<%@ page import="com.liferay.fragment.collection.filter.tags.display.context.FragmentCollectionFilterTagsDisplayContext" %>

<%
FragmentCollectionFilterTagsDisplayContext fragmentCollectionFilterTagsDisplayContext = (FragmentCollectionFilterTagsDisplayContext)request.getAttribute(FragmentCollectionFilterTagsDisplayContext.class.getName());
%>