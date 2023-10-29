/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.analytics.settings.web.internal.search;

import com.liferay.analytics.settings.web.internal.model.Field;
import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.SearchContainer;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

/**
 * @author Rachael Koestartyo
 */
public class FieldSearch extends SearchContainer<Field> {

	public static final String EMPTY_RESULTS_MESSAGE = "there-are-no-results";

	public static List<String> headerNames = new ArrayList<String>() {
		{
			add("attribute");
			add("category");
			add("data-type");
		}
	};

	public FieldSearch(
		PortletRequest portletRequest, int delta, PortletURL iteratorURL) {

		super(
			portletRequest, new DisplayTerms(portletRequest),
			new DisplayTerms(portletRequest), DEFAULT_CUR_PARAM, delta,
			iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);
	}

	public FieldSearch(PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_DELTA, iteratorURL);
	}

}