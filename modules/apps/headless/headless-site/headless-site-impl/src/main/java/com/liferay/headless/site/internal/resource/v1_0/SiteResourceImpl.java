/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.site.internal.resource.v1_0;

import com.liferay.headless.site.dto.v1_0.Site;
import com.liferay.headless.site.resource.v1_0.SiteResource;
import com.liferay.portal.events.ServicePreAction;
import com.liferay.portal.events.ThemeServicePreAction;
import com.liferay.portal.kernel.change.tracking.CTAware;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.LayoutSetPrototype;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.GroupService;
import com.liferay.portal.kernel.service.LayoutSetPrototypeLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.permission.GroupPermission;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.liveusers.LiveUsers;
import com.liferay.portal.security.permission.PermissionCacheUtil;
import com.liferay.portal.vulcan.multipart.MultipartBody;
import com.liferay.site.initializer.SiteInitializer;
import com.liferay.site.initializer.SiteInitializerFactory;
import com.liferay.site.initializer.SiteInitializerRegistry;
import com.liferay.sites.kernel.util.Sites;

import java.io.File;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Rubén Pulido
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/site.properties",
	scope = ServiceScope.PROTOTYPE, service = SiteResource.class
)
@CTAware
public class SiteResourceImpl extends BaseSiteResourceImpl {

	@Override
	public Site postSite(Site site) throws Exception {
		try {
			Group group = _addGroup(site.getExternalReferenceCode(), site);

			return new Site() {
				{
					externalReferenceCode = group.getExternalReferenceCode();
					friendlyUrlPath = group.getFriendlyURL();
					id = group.getGroupId();
					key = group.getGroupKey();
					name = group.getName(LocaleUtil.getDefault());
				}
			};
		}
		catch (Throwable throwable) {
			throw new Exception(throwable);
		}
	}

	@Override
	public Site putSiteByExternalReferenceCode(
			String externalReferenceCode, MultipartBody multipartBody)
		throws Exception {

		Group group = _groupLocalService.fetchGroupByExternalReferenceCode(
			externalReferenceCode, contextCompany.getCompanyId());

		if (group == null) {
			group = _addGroup(
				externalReferenceCode,
				multipartBody.getValueAsInstance("site", Site.class));
		}
		else {
			if (!group.isSite()) {
				throw new IllegalArgumentException(
					"No site exists with external reference code " +
						externalReferenceCode);
			}

			_groupPermission.check(
				PermissionThreadLocal.getPermissionChecker(), group,
				ActionKeys.UPDATE);
		}

		File tempFile = FileUtil.createTempFile(
			multipartBody.getBinaryFileAsBytes("file"));
		File tempFolder = FileUtil.createTempFolder();

		FileUtil.unzip(tempFile, tempFolder);

		tempFile.delete();

		try {
			SiteInitializer siteInitializer = _siteInitializerFactory.create(
				new File(tempFolder, "site-initializer"),
				group.getName(LocaleUtil.getDefault()));

			siteInitializer.initialize(group.getGroupId());
		}
		finally {
			tempFolder.delete();
		}

		Group finalGroup = group;

		return new Site() {
			{
				externalReferenceCode = finalGroup.getExternalReferenceCode();
				friendlyUrlPath = finalGroup.getFriendlyURL();
				id = finalGroup.getGroupId();
				key = finalGroup.getGroupKey();
				name = finalGroup.getName(LocaleUtil.getDefault());
			}
		};
	}

	private Group _addGroup(String externalReferenceCode, Site site)
		throws Exception {

		if (Validator.isNull(site.getTemplateKey()) &&
			Validator.isNotNull(site.getTemplateType())) {

			throw new IllegalArgumentException(
				"Template key cannot be empty if template type is specified");
		}

		if (Validator.isNotNull(site.getTemplateKey()) &&
			Validator.isNull(site.getTemplateType())) {

			throw new IllegalArgumentException(
				"Template type cannot be empty if template key is specified");
		}

		if (Objects.equals(
				Site.TemplateType.SITE_INITIALIZER, site.getTemplateType())) {

			SiteInitializer siteInitializer =
				_siteInitializerRegistry.getSiteInitializer(
					site.getTemplateKey());

			if (siteInitializer == null) {
				throw new IllegalArgumentException(
					"No site initializer was found for site template key " +
						site.getTemplateKey());
			}

			if (!siteInitializer.isActive(contextCompany.getCompanyId())) {
				throw new IllegalArgumentException(
					"Site initializer with site template key " +
						site.getTemplateKey() + " is inactive");
			}
		}
		else if (Objects.equals(
					Site.TemplateType.SITE_TEMPLATE, site.getTemplateType())) {

			LayoutSetPrototype layoutSetPrototype =
				_layoutSetPrototypeLocalService.fetchLayoutSetPrototype(
					GetterUtil.getLongStrict(site.getTemplateKey()));

			if (layoutSetPrototype == null) {
				throw new IllegalArgumentException(
					"No site template was found for site template key " +
						site.getTemplateKey());
			}

			if (!layoutSetPrototype.isActive()) {
				throw new IllegalArgumentException(
					"Site template with site template key " +
						site.getTemplateKey() + " is inactive");
			}
		}

		_initThemeDisplay();

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			contextHttpServletRequest);

		ServiceContextThreadLocal.pushServiceContext(serviceContext);

		try {
			return _addGroup(externalReferenceCode, site, serviceContext);
		}
		catch (Exception exception) {

			// LPS-169057

			PermissionCacheUtil.clearCache(contextUser.getUserId());

			throw exception;
		}
		finally {
			ServiceContextThreadLocal.popServiceContext();
		}
	}

	private Group _addGroup(
			String externalReferenceCode, Site site,
			ServiceContext serviceContext)
		throws Exception {

		long parentGroupId = GroupConstants.DEFAULT_PARENT_GROUP_ID;

		if (Validator.isNotNull(site.getParentSiteKey())) {
			Group parentGroup = _groupLocalService.getGroup(
				contextCompany.getCompanyId(), site.getParentSiteKey());

			parentGroupId = parentGroup.getGroupId();
		}

		Map<Locale, String> nameMap = new HashMap<>();

		if (Validator.isNotNull(site.getName())) {
			nameMap.put(LocaleUtil.getDefault(), site.getName());
		}

		int type = GroupConstants.TYPE_SITE_OPEN;

		Site.MembershipType membershipType = site.getMembershipType();

		if (membershipType != null) {
			if (membershipType.equals(Site.MembershipType.PRIVATE)) {
				type = GroupConstants.TYPE_SITE_PRIVATE;
			}
			else if (membershipType.equals(Site.MembershipType.RESTRICTED)) {
				type = GroupConstants.TYPE_SITE_RESTRICTED;
			}
		}

		Group group = _groupService.addOrUpdateGroup(
			externalReferenceCode, parentGroupId,
			GroupConstants.DEFAULT_LIVE_GROUP_ID, nameMap, null, type, true,
			GroupConstants.DEFAULT_MEMBERSHIP_RESTRICTION, null, true, false,
			true, serviceContext);

		LiveUsers.joinGroup(
			contextCompany.getCompanyId(), group.getGroupId(),
			contextUser.getUserId());

		if (Objects.equals(
				Site.TemplateType.SITE_TEMPLATE, site.getTemplateType())) {

			_sites.updateLayoutSetPrototypesLinks(
				group, GetterUtil.getLongStrict(site.getTemplateKey()), 0L,
				true, false);
		}
		else {
			String siteInitializerKey = "blank-site-initializer";

			if (Validator.isNotNull(site.getTemplateKey())) {
				siteInitializerKey = site.getTemplateKey();
			}

			SiteInitializer siteInitializer =
				_siteInitializerRegistry.getSiteInitializer(siteInitializerKey);

			siteInitializer.initialize(group.getGroupId());
		}

		return group;
	}

	private void _initThemeDisplay() throws Exception {
		ThemeDisplay themeDisplay =
			(ThemeDisplay)contextHttpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		if (themeDisplay != null) {
			return;
		}

		ServicePreAction servicePreAction = new ServicePreAction();

		servicePreAction.servicePre(
			contextHttpServletRequest, contextHttpServletResponse, false);

		ThemeServicePreAction themeServicePreAction =
			new ThemeServicePreAction();

		themeServicePreAction.run(
			contextHttpServletRequest, contextHttpServletResponse);
	}

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private GroupPermission _groupPermission;

	@Reference
	private GroupService _groupService;

	@Reference
	private LayoutSetPrototypeLocalService _layoutSetPrototypeLocalService;

	@Reference
	private SiteInitializerFactory _siteInitializerFactory;

	@Reference
	private SiteInitializerRegistry _siteInitializerRegistry;

	@Reference
	private Sites _sites;

}