/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.jaxrs.context.provider.test.util;

import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.entity.StringEntityField;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import java.util.Collections;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.core.MultivaluedMap;

/**
 * @author Cristina González
 */
public class MockResource implements EntityModelResource {

	public static final String METHOD_NAME = "mockGet";

	@Override
	public EntityModel getEntityModel(MultivaluedMap<?, ?> multivaluedMap) {
		return _ENTITY_MODEL;
	}

	@GET
	public String mockGet(String string) {
		return "";
	}

	private static final EntityModel _ENTITY_MODEL = new EntityModel() {

		@Override
		public Map<String, EntityField> getEntityFieldsMap() {
			return Collections.singletonMap(
				"title",
				new StringEntityField("title", locale -> "internalTitle"));
		}

		@Override
		public String getName() {
			return "Example";
		}

	};

}