/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.mapping.internal.form.builder.servlet.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * @author Pedro Queiroz
 */
@RunWith(Arquillian.class)
public class DDMFieldSettingsDDMFormContextServletTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void testThemeDisplayIsPresent()
		throws IOException, ServletException {

		MockHttpServletRequest mockHttpServletRequest =
			new MockHttpServletRequest();
		MockHttpServletResponse mockHttpServletResponse =
			new MockHttpServletResponse();

		mockHttpServletRequest.setAttribute(
			WebKeys.CURRENT_URL,
			"http://liferay.com/web/guest/dynamic-data-mapping-form-builder-" +
				"fieldset-definition");

		_ddmFieldSettingsDDMFormContextServlet.service(
			mockHttpServletRequest, mockHttpServletResponse);

		Assert.assertNotNull(
			mockHttpServletRequest.getAttribute(WebKeys.THEME_DISPLAY));
	}

	@Inject(
		filter = "osgi.http.whiteboard.servlet.name=com.liferay.dynamic.data.mapping.form.builder.internal.servlet.DDMFieldSettingsDDMFormContextServlet"
	)
	private Servlet _ddmFieldSettingsDDMFormContextServlet;

}