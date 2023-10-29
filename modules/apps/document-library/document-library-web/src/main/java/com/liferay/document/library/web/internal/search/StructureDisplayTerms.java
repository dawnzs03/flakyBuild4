/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.document.library.web.internal.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletRequest;

/**
 * @author Eduardo Lundgren
 */
public class StructureDisplayTerms extends DisplayTerms {

	public static final String DESCRIPTION = "description";

	public static final String NAME = "name";

	public static final String SEARCH_RESTRICTION = "searchRestriction";

	public static final String STORAGE_TYPE = "storageType";

	public StructureDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		description = ParamUtil.getString(portletRequest, DESCRIPTION);
		name = ParamUtil.getString(portletRequest, NAME);
		searchRestriction = ParamUtil.getBoolean(
			portletRequest, SEARCH_RESTRICTION);
		storageType = ParamUtil.getString(portletRequest, STORAGE_TYPE);
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getStorageType() {
		return storageType;
	}

	public Boolean isSearchRestriction() {
		return searchRestriction;
	}

	protected String description;
	protected String name;
	protected Boolean searchRestriction;
	protected String storageType;

}