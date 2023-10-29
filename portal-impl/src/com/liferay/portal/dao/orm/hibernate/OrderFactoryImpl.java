/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.dao.orm.hibernate;

import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactory;

/**
 * @author Brian Wing Shun Chan
 */
public class OrderFactoryImpl implements OrderFactory {

	@Override
	public Order asc(String propertyName) {
		return new OrderImpl(org.hibernate.criterion.Order.asc(propertyName));
	}

	@Override
	public Order desc(String propertyName) {
		return new OrderImpl(org.hibernate.criterion.Order.desc(propertyName));
	}

}