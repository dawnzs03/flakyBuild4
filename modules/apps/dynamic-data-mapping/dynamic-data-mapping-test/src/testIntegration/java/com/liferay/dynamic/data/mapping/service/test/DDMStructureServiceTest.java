/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.mapping.service.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.dynamic.data.mapping.constants.DDMStructureConstants;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMStructureService;
import com.liferay.dynamic.data.mapping.service.persistence.DDMStructureUtil;
import com.liferay.dynamic.data.mapping.storage.StorageType;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.TestPropsValues;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.search.test.util.SearchTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Rafael Praxedes
 */
@RunWith(Arquillian.class)
public class DDMStructureServiceTest extends BaseDDMServiceTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(),
			new TransactionalTestRule(
				Propagation.SUPPORTS,
				"com.liferay.dynamic.data.mapping.service"));

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();

		_classNameId = PortalUtil.getClassNameId(DDL_RECORD_SET_CLASS_NAME);
		_group = GroupTestUtil.addGroup();
		_siteAdminUser = UserTestUtil.addGroupAdminUser(group);

		setUpPermissionThreadLocal();
		setUpPrincipalThreadLocal();
	}

	@After
	public void tearDown() throws Exception {
		PermissionThreadLocal.setPermissionChecker(_originalPermissionChecker);

		PrincipalThreadLocal.setName(_originalName);
	}

	@Test
	public void testGetStructures() throws Exception {
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));

		List<DDMStructure> structures = _ddmStructureService.getStructures(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), _group.getGroupId()}, _classNameId,
			WorkflowConstants.STATUS_ANY);

		Assert.assertEquals(structures.toString(), 3, structures.size());
	}

	@Test
	public void testGetStructuresCountWithoutUserPermission() throws Exception {
		addStructure(group, _classNameId, StringUtil.randomString());
		addStructure(group, _classNameId, StringUtil.randomString());
		addStructure(group, _classNameId, StringUtil.randomString());

		Assert.assertEquals(
			3,
			_ddmStructureService.getStructuresCount(
				group.getCompanyId(), new long[] {group.getGroupId()},
				_classNameId));

		User user = UserTestUtil.addUser();

		PermissionChecker originalPermissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(user));

			Assert.assertEquals(
				0,
				_ddmStructureService.getStructuresCount(
					group.getCompanyId(), new long[] {group.getGroupId()},
					_classNameId));
		}
		finally {
			PermissionThreadLocal.setPermissionChecker(
				originalPermissionChecker);

			_userLocalService.deleteUser(user);
		}
	}

	@Test
	public void testGetStructuresCountWithoutUserPermissionAndWithKeywords()
		throws Exception {

		addStructure(group, _classNameId, "Basic Structure");
		addStructure(group, _classNameId, "Blank Structure");
		addStructure(group, _classNameId, "Sample Structure");

		Assert.assertEquals(
			3,
			_ddmStructureService.getStructuresCount(
				group.getCompanyId(), new long[] {group.getGroupId()},
				_classNameId, "Structure", WorkflowConstants.STATUS_ANY));

		User user = UserTestUtil.addUser();

		PermissionChecker originalPermissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(user));

			Assert.assertEquals(
				0,
				_ddmStructureService.getStructuresCount(
					group.getCompanyId(), new long[] {group.getGroupId()},
					_classNameId, "Structure", WorkflowConstants.STATUS_ANY));
		}
		finally {
			PermissionThreadLocal.setPermissionChecker(
				originalPermissionChecker);

			_userLocalService.deleteUser(user);
		}
	}

	@Test
	public void testGetStructuresWithoutUserPermission() throws Exception {
		addStructure(group, _classNameId, StringUtil.randomString());
		addStructure(group, _classNameId, StringUtil.randomString());
		addStructure(group, _classNameId, StringUtil.randomString());

		List<DDMStructure> ddmStructures = _ddmStructureService.getStructures(
			group.getCompanyId(), new long[] {group.getGroupId()}, _classNameId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

		Assert.assertEquals(ddmStructures.toString(), 3, ddmStructures.size());

		User user = UserTestUtil.addUser();

		PermissionChecker originalPermissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(user));

			ddmStructures = _ddmStructureService.getStructures(
				group.getCompanyId(), new long[] {group.getGroupId()},
				_classNameId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

			Assert.assertEquals(
				ddmStructures.toString(), 0, ddmStructures.size());
		}
		finally {
			PermissionThreadLocal.setPermissionChecker(
				originalPermissionChecker);

			_userLocalService.deleteUser(user);
		}
	}

	@Test
	public void testGetStructuresWithoutUserPermissionAndWithKeywords()
		throws Exception {

		addStructure(group, _classNameId, "Basic Structure");
		addStructure(group, _classNameId, "Blank Structure");
		addStructure(group, _classNameId, "Sample Structure");

		List<DDMStructure> ddmStructures = _ddmStructureService.getStructures(
			group.getCompanyId(), new long[] {group.getGroupId()}, _classNameId,
			"Structure", WorkflowConstants.STATUS_ANY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(ddmStructures.toString(), 3, ddmStructures.size());

		User user = UserTestUtil.addUser();

		PermissionChecker originalPermissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(user));

			ddmStructures = _ddmStructureService.getStructures(
				group.getCompanyId(), new long[] {group.getGroupId()},
				_classNameId, "Structure", WorkflowConstants.STATUS_ANY,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

			Assert.assertEquals(
				ddmStructures.toString(), 0, ddmStructures.size());
		}
		finally {
			PermissionThreadLocal.setPermissionChecker(
				originalPermissionChecker);

			_userLocalService.deleteUser(user);
		}
	}

	@Test
	@Transactional
	public void testGetStructuresWithSiteAdminPermission() throws Throwable {
		DDMStructure structure1 = addStructure(
			_classNameId, StringUtil.randomString());
		DDMStructure structure2 = addStructure(
			_classNameId, StringUtil.randomString());

		_ddmStructures.add(structure1);
		_ddmStructures.add(structure2);

		long[] groupIds = {group.getGroupId(), _group.getGroupId()};

		User siteAdminUser = UserTestUtil.addGroupAdminUser(group);

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(siteAdminUser));

			List<DDMStructure> structures =
				DDMStructureUtil.filterFindByGroupId(groupIds);

			Assert.assertEquals(structures.toString(), 2, structures.size());
			Assert.assertEquals(structure1, structures.get(0));
			Assert.assertEquals(structure2, structures.get(1));
		}
		finally {
			_userLocalService.deleteUser(siteAdminUser);
		}

		siteAdminUser = UserTestUtil.addGroupAdminUser(_group);

		try {
			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(siteAdminUser));

			List<DDMStructure> structures =
				DDMStructureUtil.filterFindByGroupId(groupIds);

			Assert.assertEquals(structures.toString(), 0, structures.size());
		}
		finally {
			_userLocalService.deleteUser(siteAdminUser);
		}
	}

	@Test
	public void testSearch() throws Exception {
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));

		List<DDMStructure> structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), _group.getGroupId()}, _classNameId,
			StringPool.BLANK, WorkflowConstants.STATUS_ANY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 3, structures.size());
	}

	@Test
	public void testSearchByNameAndDescription() throws Exception {
		String name = StringUtil.randomString();
		String description = StringUtil.randomString();

		List<DDMStructure> expectedStructures = new ArrayList<>(3);

		expectedStructures.add(addStructure(_classNameId, name, description));
		expectedStructures.add(
			addStructure(_classNameId, name, StringUtil.randomString()));
		expectedStructures.add(
			addStructure(_classNameId, StringUtil.randomString(), description));

		_ddmStructures.addAll(expectedStructures);

		List<DDMStructure> structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), _group.getGroupId()}, _classNameId,
			name, description, StorageType.DEFAULT.getValue(),
			DDMStructureConstants.TYPE_DEFAULT, WorkflowConstants.STATUS_ANY,
			true, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 3, structures.size());

		for (DDMStructure ddmStructure : expectedStructures) {
			Assert.assertTrue(structures.contains(ddmStructure));
		}
	}

	@Test
	public void testSearchByType() throws Exception {
		_ddmStructures.add(
			addStructure(
				0, _classNameId, null, StringUtil.randomString(),
				StringPool.BLANK, read("test-structure.xsd"),
				StorageType.DEFAULT.getValue(),
				DDMStructureConstants.TYPE_DEFAULT,
				WorkflowConstants.STATUS_APPROVED));

		_ddmStructures.add(
			addStructure(
				0, _classNameId, null, StringUtil.randomString(),
				StringPool.BLANK, read("test-structure.xsd"),
				StorageType.DEFAULT.getValue(),
				DDMStructureConstants.TYPE_FRAGMENT,
				WorkflowConstants.STATUS_APPROVED));

		List<DDMStructure> structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(), new long[] {group.getGroupId()},
			_classNameId, null, null, null, DDMStructureConstants.TYPE_DEFAULT,
			WorkflowConstants.STATUS_APPROVED, true, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 1, structures.size());

		structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(), new long[] {group.getGroupId()},
			_classNameId, null, null, null, DDMStructureConstants.TYPE_FRAGMENT,
			WorkflowConstants.STATUS_APPROVED, true, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 1, structures.size());
	}

	@Test
	public void testSearchCount() throws Exception {
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));

		int count = _ddmStructureService.searchCount(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), _group.getGroupId()}, _classNameId,
			StringPool.BLANK, WorkflowConstants.STATUS_ANY);

		Assert.assertEquals(3, count);
	}

	@Test
	public void testSearchCountByNameAndDescription() throws Exception {
		String name = StringUtil.randomString();
		String description = StringUtil.randomString();

		_ddmStructures.add(addStructure(_classNameId, name, description));

		_ddmStructures.add(
			addStructure(_classNameId, name, StringUtil.randomString()));
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString(), description));

		int count = _ddmStructureService.searchCount(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), _group.getGroupId()}, _classNameId,
			name, description, StorageType.DEFAULT.getValue(),
			DDMStructureConstants.TYPE_DEFAULT, WorkflowConstants.STATUS_ANY,
			true);

		Assert.assertEquals(3, count);
	}

	@Test
	public void testSearchCountByType() throws Exception {
		int initialCount = _ddmStructureService.searchCount(
			TestPropsValues.getCompanyId(), new long[] {group.getGroupId()},
			_classNameId, null, null, null, DDMStructureConstants.TYPE_FRAGMENT,
			WorkflowConstants.STATUS_ANY, true);

		_ddmStructures.add(
			addStructure(
				0, _classNameId, null, StringUtil.randomString(),
				StringPool.BLANK, read("test-structure.xsd"),
				StorageType.DEFAULT.getValue(),
				DDMStructureConstants.TYPE_FRAGMENT,
				WorkflowConstants.STATUS_APPROVED));

		int count = _ddmStructureService.searchCount(
			TestPropsValues.getCompanyId(), new long[] {group.getGroupId()},
			_classNameId, null, null, null, DDMStructureConstants.TYPE_FRAGMENT,
			WorkflowConstants.STATUS_ANY, true);

		Assert.assertEquals(initialCount + 1, count);
	}

	@Test
	public void testSearchWithSiteAdminPermission() throws Exception {
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));

		DDMStructure structure = addStructure(
			_classNameId, StringUtil.randomString());

		_ddmStructures.add(structure);

		List<DDMStructure> structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(),
			new long[] {group.getGroupId(), group.getGroupId()}, _classNameId,
			StringPool.BLANK, WorkflowConstants.STATUS_ANY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 2, structures.size());
	}

	@Test
	public void testSearchWithSiteMemberPermission() throws Exception {
		_ddmStructures.add(
			addStructure(_classNameId, StringUtil.randomString()));

		DDMStructure structure = addStructure(
			_classNameId, StringUtil.randomString());

		_ddmStructures.add(structure);

		long[] groupIds = {group.getGroupId(), group.getGroupId()};

		User siteMemberUser = UserTestUtil.addGroupUser(
			group, RoleConstants.SITE_MEMBER);

		PermissionThreadLocal.setPermissionChecker(
			PermissionCheckerFactoryUtil.create(siteMemberUser));

		List<DDMStructure> structures = _ddmStructureService.search(
			TestPropsValues.getCompanyId(), groupIds, _classNameId,
			StringPool.BLANK, WorkflowConstants.STATUS_ANY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);

		Assert.assertEquals(structures.toString(), 0, structures.size());
	}

	@Rule
	public SearchTestRule searchTestRule = new SearchTestRule();

	protected void setUpPermissionThreadLocal() throws Exception {
		_originalPermissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		PermissionThreadLocal.setPermissionChecker(
			PermissionCheckerFactoryUtil.create(_siteAdminUser));
	}

	protected void setUpPrincipalThreadLocal() throws Exception {
		_originalName = PrincipalThreadLocal.getName();

		PrincipalThreadLocal.setName(_siteAdminUser.getUserId());
	}

	private static long _classNameId;

	@DeleteAfterTestRun
	private final List<DDMStructure> _ddmStructures = new ArrayList<>();

	@Inject
	private DDMStructureService _ddmStructureService;

	@DeleteAfterTestRun
	private Group _group;

	private String _originalName;
	private PermissionChecker _originalPermissionChecker;

	@DeleteAfterTestRun
	private User _siteAdminUser;

	@Inject
	private UserLocalService _userLocalService;

}