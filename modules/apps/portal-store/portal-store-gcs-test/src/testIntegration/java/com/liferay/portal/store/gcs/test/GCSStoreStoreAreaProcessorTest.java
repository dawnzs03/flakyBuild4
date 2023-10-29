/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.store.gcs.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.document.library.kernel.store.Store;
import com.liferay.document.library.kernel.store.StoreArea;
import com.liferay.document.library.kernel.store.StoreAreaProcessor;
import com.liferay.petra.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.test.util.ConfigurationTestUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.AssumeTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.CompanyTestUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.HashMapDictionaryBuilder;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.test.rule.FeatureFlags;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.time.Duration;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

/**
 * @author Adolfo Pérez
 */
@FeatureFlags("LPS-174816")
@RunWith(Arquillian.class)
public class GCSStoreStoreAreaProcessorTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new AssumeTestRule("assume"), new LiferayIntegrationTestRule());

	public static void assume() {
		String gcsStoreClassName = "com.liferay.portal.store.gcs.GCSStore";
		String dlStoreImpl = PropsUtil.get(PropsKeys.DL_STORE_IMPL);

		Assume.assumeTrue(
			StringBundler.concat(
				"Property \"", PropsKeys.DL_STORE_IMPL, "\" is not set to \"",
				gcsStoreClassName, "\""),
			dlStoreImpl.equals(gcsStoreClassName));
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		_company = CompanyTestUtil.addCompany();

		_configuration = _configurationAdmin.getConfiguration(
			"com.liferay.portal.store.gcs.configuration.GCSStoreConfiguration",
			StringPool.QUESTION);

		ConfigurationTestUtil.saveConfiguration(
			_configuration,
			HashMapDictionaryBuilder.<String, Object>put(
				"aes256Key", ""
			).put(
				"bucketName", "test"
			).put(
				"initialRetryDelay", "400"
			).put(
				"initialRPCTimeout", "120000"
			).put(
				"maxRetryAttempts", "5"
			).put(
				"maxRetryDelay", "10000"
			).put(
				"maxRPCTimeout", "600000"
			).put(
				"retryDelayMultiplier", "1.5"
			).put(
				"retryJitter", "false"
			).put(
				"rpcTimeoutMultiplier", "1.0"
			).put(
				"serviceAccountKey", ""
			).build());
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		_companyLocalService.deleteCompany(_company);

		ConfigurationTestUtil.deleteConfiguration(_configuration);
	}

	@Before
	public void setUp() throws Exception {
		_group = GroupTestUtil.addGroupToCompany(_company.getCompanyId());
	}

	@Test
	public void testCleanUpDeletedStoreAreaKeepsRecentFiles() throws Exception {
		StoreArea.withStoreArea(
			StoreArea.DELETED,
			() -> {
				String fileName = StringUtil.randomString();

				_store.addFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT,
					new UnsyncByteArrayInputStream(new byte[0]));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				storeAreaProcessor.cleanUpDeletedStoreArea(
					_company.getCompanyId(), 1, name -> true, StringPool.BLANK,
					Duration.ofDays(1));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));
			});
	}

	@Test
	public void testCleanUpDeletedStoreAreaRemovesFilesIncrementally()
		throws Exception {

		StoreArea.withStoreArea(
			StoreArea.DELETED,
			() -> {
				for (String fileName : RandomTestUtil.randomStrings(4)) {
					_store.addFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT,
						new UnsyncByteArrayInputStream(new byte[0]));
				}

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				int runCount = 0;

				String startOffset = StringPool.BLANK;

				do {
					startOffset = storeAreaProcessor.cleanUpDeletedStoreArea(
						_company.getCompanyId(), 1, name -> true, startOffset,
						Duration.ofDays(-1));

					runCount++;
				}
				while (Validator.isNotNull(startOffset));

				Assert.assertTrue(runCount > 1);

				String[] fileNames = _store.getFileNames(
					_company.getCompanyId(), _group.getGroupId(),
					StringPool.BLANK);

				Assert.assertEquals(
					Arrays.toString(fileNames), 0, fileNames.length);
			});
	}

	@Test
	public void testCleanUpDeletedStoreAreaRemovesOldFiles() throws Exception {
		StoreArea.withStoreArea(
			StoreArea.DELETED,
			() -> {
				String fileName = StringUtil.randomString();

				_store.addFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT,
					new UnsyncByteArrayInputStream(new byte[0]));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				storeAreaProcessor.cleanUpDeletedStoreArea(
					_company.getCompanyId(), 1, name -> true, StringPool.BLANK,
					Duration.ofDays(-1));

				Assert.assertFalse(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));
			});
	}

	@Test
	public void testCleanUpNewStoreAreaKeepsRecentFiles() throws Exception {
		StoreArea.withStoreArea(
			StoreArea.NEW,
			() -> {
				String fileName = StringUtil.randomString();

				_store.addFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT,
					new UnsyncByteArrayInputStream(new byte[0]));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				storeAreaProcessor.cleanUpNewStoreArea(
					_company.getCompanyId(), 1, name -> false, StringPool.BLANK,
					Duration.ofDays(1));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));
			});
	}

	@Test
	public void testCleanUpNewStoreAreaMovesFilesIncrementally()
		throws Exception {

		StoreArea.withStoreArea(
			StoreArea.NEW,
			() -> {
				for (String fileName : RandomTestUtil.randomStrings(4)) {
					_store.addFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT,
						new UnsyncByteArrayInputStream(new byte[0]));
				}

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				int runCount = 0;

				String startOffset = StringPool.BLANK;

				do {
					startOffset = storeAreaProcessor.cleanUpNewStoreArea(
						_company.getCompanyId(), 1, name -> false, startOffset,
						Duration.ofDays(-1));

					runCount++;
				}
				while (Validator.isNotNull(startOffset));

				Assert.assertTrue(runCount > 1);

				String[] fileNames = _store.getFileNames(
					_company.getCompanyId(), _group.getGroupId(),
					StringPool.BLANK);

				Assert.assertEquals(
					Arrays.toString(fileNames), 0, fileNames.length);
			});

		StoreArea.withStoreArea(
			StoreArea.LIVE,
			() -> {
				String[] fileNames = _store.getFileNames(
					_company.getCompanyId(), _group.getGroupId(),
					StringPool.BLANK);

				Assert.assertEquals(
					Arrays.toString(fileNames), 4, fileNames.length);
			});
	}

	@Test
	public void testCleanUpNewStoreAreaMovesOldFiles() throws Exception {
		String fileName = StringUtil.randomString();

		StoreArea.withStoreArea(
			StoreArea.NEW,
			() -> {
				_store.addFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT,
					new UnsyncByteArrayInputStream(new byte[0]));

				Assert.assertTrue(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));

				StoreAreaProcessor storeAreaProcessor =
					(StoreAreaProcessor)_store;

				storeAreaProcessor.cleanUpNewStoreArea(
					_company.getCompanyId(), 1, name -> false, StringPool.BLANK,
					Duration.ofDays(-1));

				Assert.assertFalse(
					_store.hasFile(
						_company.getCompanyId(), _group.getGroupId(), fileName,
						Store.VERSION_DEFAULT));
			});

		StoreArea.withStoreArea(
			StoreArea.LIVE,
			() -> Assert.assertTrue(
				_store.hasFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT)));
	}

	@Test
	public void testCopy() throws Exception {
		String fileName = StringUtil.randomString();

		_store.addFile(
			_company.getCompanyId(), _group.getGroupId(), fileName,
			Store.VERSION_DEFAULT, new UnsyncByteArrayInputStream(new byte[0]));

		StoreArea.withStoreArea(
			StoreArea.LIVE,
			() -> Assert.assertTrue(
				_store.hasFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT)));

		StoreArea.withStoreArea(
			StoreArea.DELETED,
			() -> Assert.assertFalse(
				_store.hasFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT)));

		StoreAreaProcessor storeAreaProcessor = (StoreAreaProcessor)_store;

		boolean copied = storeAreaProcessor.copy(
			StoreArea.LIVE.getPath(
				_company.getCompanyId(), _group.getGroupId(), fileName,
				Store.VERSION_DEFAULT),
			StoreArea.DELETED.getPath(
				_company.getCompanyId(), _group.getGroupId(), fileName,
				Store.VERSION_DEFAULT));

		Assert.assertTrue(copied);

		StoreArea.withStoreArea(
			StoreArea.DELETED,
			() -> Assert.assertTrue(
				_store.hasFile(
					_company.getCompanyId(), _group.getGroupId(), fileName,
					Store.VERSION_DEFAULT)));
	}

	@Test
	public void testCopyNonexistentFile() throws Exception {
		StoreAreaProcessor storeAreaProcessor = (StoreAreaProcessor)_store;

		Assert.assertFalse(
			storeAreaProcessor.copy(
				StoreArea.LIVE.getPath(
					_company.getCompanyId(), _group.getGroupId(),
					StringUtil.randomString(), Store.VERSION_DEFAULT),
				StoreArea.LIVE.getPath(
					_company.getCompanyId(), _group.getGroupId(),
					StringUtil.randomString(), Store.VERSION_DEFAULT)));
	}

	private static Company _company;

	@Inject
	private static CompanyLocalService _companyLocalService;

	private static Configuration _configuration;

	@Inject
	private static ConfigurationAdmin _configurationAdmin;

	@DeleteAfterTestRun
	private Group _group;

	@Inject(
		filter = "store.type=com.liferay.portal.store.gcs.GCSStore",
		type = Store.class
	)
	private Store _store;

}