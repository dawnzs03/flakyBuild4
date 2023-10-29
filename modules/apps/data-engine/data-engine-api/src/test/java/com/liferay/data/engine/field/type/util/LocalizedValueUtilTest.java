/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.data.engine.field.type.util;

import com.liferay.dynamic.data.mapping.model.LocalizedValue;
import com.liferay.portal.json.JSONFactoryImpl;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.test.rule.LiferayUnitTestRule;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.mockito.Mockito;

import org.skyscreamer.jsonassert.JSONAssert;

/**
 * @author Mateus Santana
 */
public class LocalizedValueUtilTest {

	@ClassRule
	@Rule
	public static final LiferayUnitTestRule liferayUnitTestRule =
		LiferayUnitTestRule.INSTANCE;

	@BeforeClass
	public static void setUpClass() {
		_setUpJSONFactoryUtil();
		_setUpLanguageUtil();
	}

	@Test
	public void testToLocaleStringMapEmptyKeyValue() {
		Map<Locale, String> map = LocalizedValueUtil.toLocaleStringMap(
			HashMapBuilder.<String, Object>put(
				"", ""
			).build());

		Assert.assertEquals("", map.get(LocaleUtil.US));
	}

	@Test
	public void testToLocaleStringMapEmptyMap() {
		Assert.assertEquals(
			Collections.emptyMap(),
			LocalizedValueUtil.toLocaleStringMap(new HashMap<>()));
	}

	@Test
	public void testToLocaleStringMapValidMap() {
		Map<Locale, String> map = LocalizedValueUtil.toLocaleStringMap(
			HashMapBuilder.<String, Object>put(
				"en_US", "en_US"
			).build());

		Assert.assertEquals("en_US", map.get(LocaleUtil.US));
	}

	@Test
	public void testToLocalizedValueEmptyMap() {
		Assert.assertEquals(
			new LocalizedValue(LocaleUtil.US),
			LocalizedValueUtil.toLocalizedValue(new HashMap<>()));
	}

	@Test
	public void testToLocalizedValueNullValue() {
		Assert.assertNull(LocalizedValueUtil.toLocalizedValue(null));
	}

	@Test
	public void testToLocalizedValuesMapNullLocalizedValue() {
		Assert.assertEquals(
			Collections.emptyMap(),
			LocalizedValueUtil.toLocalizedValuesMap(null));
	}

	@Test
	public void testToLocalizedValuesMapWithJSONArrayValues() throws Exception {
		Map<String, Object> map = LocalizedValueUtil.toLocalizedValuesMap(
			new LocalizedValue() {
				{
					addString(LocaleUtil.US, "[\"eng\"]");
					addString(LocaleUtil.BRAZIL, "[\"por\"]");
				}
			});

		JSONAssert.assertEquals(
			JSONUtil.put(
				"eng"
			).toString(),
			String.valueOf(map.get("en_US")), false);
	}

	@Test
	public void testToLocalizedValuesMapWithJSONObjectValues()
		throws Exception {

		Map<String, Object> map = LocalizedValueUtil.toLocalizedValuesMap(
			new LocalizedValue() {
				{
					addString(LocaleUtil.US, "{\"language\": \"eng\"}");
					addString(LocaleUtil.BRAZIL, "{\"language\": \"por\"}");
				}
			});

		JSONAssert.assertEquals(
			JSONUtil.put(
				"language", "eng"
			).toString(),
			String.valueOf(map.get("en_US")), false);
	}

	@Test
	public void testToLocalizedValuesMapWithStringValues() {
		Map<String, Object> map = LocalizedValueUtil.toLocalizedValuesMap(
			new LocalizedValue() {
				{
					addString(LocaleUtil.US, "en_US");
					addString(LocaleUtil.BRAZIL, "pt_BR");
				}
			});

		Assert.assertEquals("en_US", map.get("en_US"));
	}

	@Test
	public void testToLocalizedValueValidMap() {
		LocalizedValue localizedValue = LocalizedValueUtil.toLocalizedValue(
			HashMapBuilder.<String, Object>put(
				"en_US", "en_US"
			).build());

		Assert.assertEquals("en_US", localizedValue.getString(LocaleUtil.US));
	}

	@Test
	public void testToStringObjectMap() {
		Assert.assertEquals(
			HashMapBuilder.<String, Object>put(
				"en_US", "en_US"
			).build(),
			LocalizedValueUtil.toStringObjectMap(
				HashMapBuilder.put(
					LocaleUtil.US, "en_US"
				).build()));
	}

	private static void _setUpJSONFactoryUtil() {
		JSONFactoryUtil jsonFactoryUtil = new JSONFactoryUtil();

		jsonFactoryUtil.setJSONFactory(new JSONFactoryImpl());
	}

	private static void _setUpLanguageUtil() {
		LanguageUtil languageUtil = new LanguageUtil();

		Language language = Mockito.mock(Language.class);

		Mockito.when(
			language.isAvailableLocale(LocaleUtil.BRAZIL)
		).thenReturn(
			true
		);

		Mockito.when(
			language.isAvailableLocale(LocaleUtil.US)
		).thenReturn(
			true
		);

		Mockito.when(
			language.getLanguageId(LocaleUtil.BRAZIL)
		).thenReturn(
			"pt_BR"
		);

		Mockito.when(
			language.getLanguageId(LocaleUtil.US)
		).thenReturn(
			"en_US"
		);

		languageUtil.setLanguage(language);
	}

}