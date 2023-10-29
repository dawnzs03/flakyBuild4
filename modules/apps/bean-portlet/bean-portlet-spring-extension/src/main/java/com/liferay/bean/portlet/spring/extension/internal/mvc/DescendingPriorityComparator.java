/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bean.portlet.spring.extension.internal.mvc;

import java.util.Comparator;

import javax.annotation.Priority;

/**
 * @author Neil Griffin
 */
public class DescendingPriorityComparator<T> implements Comparator<Object> {

	public DescendingPriorityComparator() {
		this(0);
	}

	public DescendingPriorityComparator(int defaultPriority) {
		_defaultPriority = defaultPriority;
	}

	@Override
	public int compare(Object object1, Object object2) {
		Class<?> class1 = object1.getClass();

		Priority priority1 = class1.getAnnotation(Priority.class);

		Class<?> class2 = object2.getClass();

		Priority priority2 = class2.getAnnotation(Priority.class);

		if ((priority1 == null) && (priority2 == null)) {
			return 0;
		}
		else if (priority1 == null) {
			return Integer.compare(priority2.value(), _defaultPriority);
		}
		else if (priority2 == null) {
			return Integer.compare(_defaultPriority, priority1.value());
		}

		return Integer.compare(priority1.value(), priority2.value());
	}

	private int _defaultPriority;

}