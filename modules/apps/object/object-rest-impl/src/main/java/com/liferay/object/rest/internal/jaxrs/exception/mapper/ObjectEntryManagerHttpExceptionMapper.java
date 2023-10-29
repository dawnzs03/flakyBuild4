/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.rest.internal.jaxrs.exception.mapper;

import com.liferay.object.rest.manager.exception.ObjectEntryManagerHttpException;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.BaseExceptionMapper;
import com.liferay.portal.vulcan.jaxrs.exception.mapper.Problem;

import javax.ws.rs.ext.Provider;

/**
 * @author Guilherme Camacho
 */
@Provider
public class ObjectEntryManagerHttpExceptionMapper
	extends BaseExceptionMapper<ObjectEntryManagerHttpException> {

	@Override
	protected Problem getProblem(
		ObjectEntryManagerHttpException objectEntryManagerHttpException) {

		return new Problem(objectEntryManagerHttpException);
	}

}