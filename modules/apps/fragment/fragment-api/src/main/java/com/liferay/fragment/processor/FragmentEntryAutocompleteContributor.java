/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.fragment.processor;

import com.liferay.portal.kernel.json.JSONArray;

/**
 * @author Eudaldo Alonso
 */
public interface FragmentEntryAutocompleteContributor {

	public JSONArray getAvailableTagsJSONArray();

}