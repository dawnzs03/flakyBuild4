/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.channel.internal.odata.entity.v1_0;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.entity.IdEntityField;
import com.liferay.portal.odata.entity.StringEntityField;

import java.util.Map;

/**
 * @author Andrea Sbarra
 */
public class ChannelEntityModel implements EntityModel {

	public ChannelEntityModel() {
		_entityFieldsMap = EntityModel.toEntityFieldsMap(
			new IdEntityField(
				"siteGroupId", locale -> Field.SCOPE_GROUP_ID, String::valueOf),
			new StringEntityField(
				"name", locale -> Field.getSortableFieldName("name")));
	}

	@Override
	public Map<String, EntityField> getEntityFieldsMap() {
		return _entityFieldsMap;
	}

	private final Map<String, EntityField> _entityFieldsMap;

}