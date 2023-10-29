/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.osb.testray.rest.client.function;

import javax.annotation.Generated;

/**
 * @author José Abelenda
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}