/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.admin.shipment.client.function;

import javax.annotation.Generated;

/**
 * @author Andrea Sbarra
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}