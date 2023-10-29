/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.remote.cors.client.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.remote.cors.configuration.WebContextCORSConfiguration;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import javax.ws.rs.HttpMethod;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Marta Medio
 */
@RunWith(Arquillian.class)
public class WebContextConfigurationCORSClientTest
	extends BaseCORSClientTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() {
		registerJaxRsApplication(
			new CORSTestApplication(), "cors",
			HashMapDictionaryBuilder.<String, Object>put(
				"osgi.jaxrs.name", "test-cors"
			).build());

		createFactoryConfiguration(
			WebContextCORSConfiguration.class.getName(),
			HashMapDictionaryBuilder.<String, Object>put(
				"servlet.context.helper.select.filter",
				"(osgi.jaxrs.name=test-cors)"
			).build());
	}

	@Test
	public void testApplicationCORSForGuestUser() throws Exception {
		assertJaxRSUrl("/cors/cors-app", HttpMethod.OPTIONS, false, true);
		assertJaxRSUrl("/cors/cors-app", HttpMethod.GET, false, true);
	}

	@Test
	public void testApplicationCORSWithoutOAuth2() throws Exception {
		assertJaxRSUrl("/cors/cors-app", HttpMethod.OPTIONS, true, true);
		assertJaxRSUrl("/cors/cors-app", HttpMethod.GET, true, false);
	}

}