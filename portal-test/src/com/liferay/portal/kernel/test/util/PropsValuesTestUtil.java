/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.test.util;

import com.liferay.petra.lang.SafeCloseable;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;

/**
 * @author Shuyang Zhou
 */
public class PropsValuesTestUtil {

	public static SafeCloseable swapWithSafeCloseable(
		String propsKeysFieldName, Object value) {

		String propsKeysName = ReflectionTestUtil.getFieldValue(
			PropsKeys.class, propsKeysFieldName);

		String originalPropsValue = PropsUtil.get(propsKeysName);

		PropsUtil.set(propsKeysName, String.valueOf(value));

		Object originalValue = ReflectionTestUtil.getAndSetFieldValue(
			PropsValues.class, propsKeysFieldName, value);

		return () -> {
			PropsUtil.set(propsKeysName, originalPropsValue);

			ReflectionTestUtil.setFieldValue(
				PropsValues.class, propsKeysFieldName, originalValue);
		};
	}

}