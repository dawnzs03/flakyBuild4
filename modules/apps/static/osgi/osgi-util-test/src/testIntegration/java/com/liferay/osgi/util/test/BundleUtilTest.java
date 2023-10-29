/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.osgi.util.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.osgi.util.BundleUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.io.IOException;

import java.net.URL;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * @author Carlos Sierra Andrés
 */
@RunWith(Arquillian.class)
public class BundleUtilTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() {
		_bundle = FrameworkUtil.getBundle(BundleUtilTest.class);
	}

	@Test
	public void testGetResourceInBundleOrFragments() throws IOException {
		URL url = BundleUtil.getResourceInBundleOrFragments(
			_bundle, "/bundle-util/file.properties");

		Properties properties = new Properties();

		properties.load(url.openStream());

		Assert.assertEquals("aValue", properties.getProperty("aKey"));
	}

	@Test
	public void testGetResourceInBundleOrFragmentsWhenDir() {
		URL url = BundleUtil.getResourceInBundleOrFragments(
			_bundle, "/bundle-util");

		Assert.assertNotNull(url);
	}

	@Test
	public void testGetResourceInBundleOrFragmentsWhenInRoot()
		throws IOException {

		URL url = BundleUtil.getResourceInBundleOrFragments(
			_bundle, "/fileInRoot.properties");

		Properties properties = new Properties();

		properties.load(url.openStream());

		Assert.assertEquals("aRootValue", properties.getProperty("aRootKey"));
	}

	@Test
	public void testGetResourceInBundleOrFragmentsWhenMissing() {
		URL url = BundleUtil.getResourceInBundleOrFragments(
			_bundle, "/fileMissing.properties");

		Assert.assertNull(url);
	}

	@Test
	public void testGetResourceInBundleOrFragmentsWhenRoot() {
		URL url = BundleUtil.getResourceInBundleOrFragments(_bundle, "/");

		Assert.assertNotNull(url);
	}

	private Bundle _bundle;

}