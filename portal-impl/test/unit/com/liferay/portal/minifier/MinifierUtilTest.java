/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.minifier;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.module.util.SystemBundleUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.ProxyFactory;
import com.liferay.portal.test.rule.LiferayUnitTestRule;
import com.liferay.portal.util.PropsUtil;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Iván Zaera Avellón
 */
public class MinifierUtilTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@Before
	public void setUp() {
		_minifierEnabled = GetterUtil.getBoolean(
			PropsUtil.get(PropsKeys.MINIFIER_ENABLED));

		PropsUtil.set(PropsKeys.MINIFIER_ENABLED, "true");

		BundleContext bundleContext = SystemBundleUtil.getBundleContext();

		_serviceRegistration = bundleContext.registerService(
			JavaScriptMinifier.class,
			ProxyFactory.newDummyInstance(JavaScriptMinifier.class), null);
	}

	@After
	public void tearDown() {
		_serviceRegistration.unregister();

		PropsUtil.set(
			PropsKeys.MINIFIER_ENABLED, String.valueOf(_minifierEnabled));
	}

	@Test
	public void testProcessMinifiedCssWithDataImageUrl() {
		String minifiedCss = MinifierUtil.minifyCss(
			StringBundler.concat(
				"background-image: url(\"data:image/svg+xml;charset=utf8,%3C",
				"svg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 ",
				"8'%3E%3Ccircle r='3' fill='%23FFF'/%3E%3C/svg%3E\");"));

		Assert.assertEquals(
			StringBundler.concat(
				"background-image:url(\"data:image/svg+xml;charset=utf8,%3C",
				"svg xmlns='http://www.w3.org/2000/svg' viewBox='-4 -4 8 ",
				"8'%3E%3Ccircle r='3' fill='%23FFF'/%3E%3C/svg%3E\");"),
			minifiedCss);
	}

	@Test
	public void testProcessMinifiedCssWithMultipleOps() {
		String minifiedCss = MinifierUtil.minifyCss(
			"margin: calc(10px + 50% * 2 / 3);");

		Assert.assertEquals("margin:calc(10px + 50% * 2 / 3);", minifiedCss);
	}

	@Test
	public void testProcessMinifiedCssWithNegativeNumbers() {
		String minifiedCss = MinifierUtil.minifyCss(
			"left: calc(-1px + -1px - -1px * -1px / -1px - 1px);");

		Assert.assertEquals(
			"left:calc(-1px + -1px - -1px * -1px / -1px - 1px);", minifiedCss);
	}

	@Test
	public void testProcessMinifiedCssWithParentheses() {
		String minifiedCss = MinifierUtil.minifyCss(
			"left: calc((10px + 50%) * 2 + 20px);");

		Assert.assertEquals("left:calc((10px + 50%) * 2 + 20px);", minifiedCss);
	}

	@Test
	public void testProcessMinifiedCssWithSimpleOps() {
		String minifiedCss = MinifierUtil.minifyCss(
			"margin: calc(50% - 10px) calc(50% - 10px) calc(1 * 50%) " +
				"calc(10px / 2);");

		Assert.assertEquals(
			"margin:calc(50% - 10px) calc(50% - 10px) calc(1 * 50%) " +
				"calc(10px / 2);",
			minifiedCss);
	}

	private static boolean _minifierEnabled;

	private ServiceRegistration<?> _serviceRegistration;

}