/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.internal.dto.v1_0.converter;

import com.liferay.account.constants.AccountConstants;
import com.liferay.account.model.AccountEntry;
import com.liferay.account.model.AccountEntryUserRel;
import com.liferay.account.model.AccountRole;
import com.liferay.account.service.AccountEntryLocalService;
import com.liferay.account.service.AccountEntryUserRelLocalService;
import com.liferay.account.service.AccountRoleLocalService;
import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.service.AssetTagLocalService;
import com.liferay.headless.admin.user.dto.v1_0.Account;
import com.liferay.headless.admin.user.dto.v1_0.AccountBrief;
import com.liferay.headless.admin.user.dto.v1_0.EmailAddress;
import com.liferay.headless.admin.user.dto.v1_0.OrganizationBrief;
import com.liferay.headless.admin.user.dto.v1_0.Phone;
import com.liferay.headless.admin.user.dto.v1_0.PostalAddress;
import com.liferay.headless.admin.user.dto.v1_0.RoleBrief;
import com.liferay.headless.admin.user.dto.v1_0.SiteBrief;
import com.liferay.headless.admin.user.dto.v1_0.UserAccount;
import com.liferay.headless.admin.user.dto.v1_0.UserAccountContactInformation;
import com.liferay.headless.admin.user.dto.v1_0.UserGroupBrief;
import com.liferay.headless.admin.user.dto.v1_0.WebUrl;
import com.liferay.headless.admin.user.internal.dto.v1_0.converter.constants.DTOConverterConstants;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.CustomFieldsUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.EmailAddressUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.PhoneUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.PostalAddressUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.ServiceBuilderListTypeUtil;
import com.liferay.headless.admin.user.internal.dto.v1_0.util.WebUrlUtil;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.security.permission.UserBag;
import com.liferay.portal.kernel.security.permission.UserBagFactory;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;

import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Drew Brokke
 */
@Component(
	property = {
		"application.name=Liferay.Headless.Admin.User",
		"dto.class.name=com.liferay.portal.kernel.model.User", "version=v1.0"
	},
	service = DTOConverter.class
)
public class UserResourceDTOConverter
	implements DTOConverter<User, UserAccount> {

	@Override
	public String getContentType() {
		return Account.class.getSimpleName();
	}

	@Override
	public User getObject(String externalReferenceCode) throws Exception {
		User user = _userLocalService.fetchUserByExternalReferenceCode(
			externalReferenceCode, CompanyThreadLocal.getCompanyId());

		if (user == null) {
			user = _userLocalService.getUser(
				GetterUtil.getLong(externalReferenceCode));
		}

		return user;
	}

	@Override
	public UserAccount toDTO(DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (user == null) {
			return null;
		}

		Contact contact = user.getContact();

		return new UserAccount() {
			{
				accountBriefs = TransformUtil.transformToArray(
					_accountEntryUserRelService.
						getAccountEntryUserRelsByAccountUserId(
							user.getUserId()),
					accountEntryUserRel -> _toAccountBrief(
						accountEntryUserRel, dtoConverterContext, user),
					AccountBrief.class);
				actions = dtoConverterContext.getActions();
				additionalName = user.getMiddleName();
				alternateName = user.getScreenName();
				birthDate = user.getBirthday();
				customFields = CustomFieldsUtil.toCustomFields(
					dtoConverterContext.isAcceptAllLanguages(),
					User.class.getName(), user.getUserId(), user.getCompanyId(),
					dtoConverterContext.getLocale());
				dateCreated = user.getCreateDate();
				dateModified = user.getModifiedDate();
				emailAddress = user.getEmailAddress();
				externalReferenceCode = user.getExternalReferenceCode();
				familyName = user.getLastName();
				givenName = user.getFirstName();
				honorificPrefix =
					ServiceBuilderListTypeUtil.getServiceBuilderListTypeMessage(
						contact.getPrefixListTypeId(),
						dtoConverterContext.getLocale());
				honorificSuffix =
					ServiceBuilderListTypeUtil.getServiceBuilderListTypeMessage(
						contact.getSuffixListTypeId(),
						dtoConverterContext.getLocale());
				id = user.getUserId();
				jobTitle = user.getJobTitle();
				keywords = ListUtil.toArray(
					_assetTagLocalService.getTags(
						User.class.getName(), user.getUserId()),
					AssetTag.NAME_ACCESSOR);
				lastLoginDate = user.getLastLoginDate();
				name = user.getFullName();
				organizationBriefs = TransformUtil.transformToArray(
					user.getOrganizations(),
					organization -> _toOrganizationBrief(
						dtoConverterContext, organization, user),
					OrganizationBrief.class);
				siteBriefs = TransformUtil.transformToArray(
					_groupLocalService.getUserSitesGroups(user.getUserId()),
					group -> _toSiteBrief(dtoConverterContext, group, user),
					SiteBrief.class);
				userAccountContactInformation =
					new UserAccountContactInformation() {
						{
							emailAddresses = TransformUtil.transformToArray(
								user.getEmailAddresses(),
								EmailAddressUtil::toEmailAddress,
								EmailAddress.class);
							facebook = contact.getFacebookSn();
							jabber = contact.getJabberSn();
							postalAddresses = TransformUtil.transformToArray(
								user.getAddresses(),
								address -> PostalAddressUtil.toPostalAddress(
									dtoConverterContext.isAcceptAllLanguages(),
									address, user.getCompanyId(),
									dtoConverterContext.getLocale()),
								PostalAddress.class);
							skype = contact.getSkypeSn();
							sms = contact.getSmsSn();
							telephones = TransformUtil.transformToArray(
								user.getPhones(), PhoneUtil::toPhone,
								Phone.class);
							twitter = contact.getTwitterSn();
							webUrls = TransformUtil.transformToArray(
								user.getWebsites(), WebUrlUtil::toWebUrl,
								WebUrl.class);
						}
					};
				userGroupBriefs = TransformUtil.transformToArray(
					_userGroupLocalService.getUserUserGroups(user.getUserId()),
					userGroup -> _toUserGroupBrief(userGroup),
					UserGroupBrief.class);

				setDashboardURL(
					() -> {
						Group group = user.getGroup();

						if (group == null) {
							return null;
						}

						return group.getDisplayURL(
							_getThemeDisplay(group), true);
					});
				setImage(
					() -> {
						if (user.getPortraitId() == 0) {
							return null;
						}

						ThemeDisplay themeDisplay = new ThemeDisplay() {
							{
								setPathImage(_portal.getPathImage());
							}
						};

						return user.getPortraitURL(themeDisplay);
					});
				setProfileURL(
					() -> {
						Group group = user.getGroup();

						if (group == null) {
							return null;
						}

						return group.getDisplayURL(_getThemeDisplay(group));
					});
				setRoleBriefs(
					() -> {
						UserBag userBag = _userBagFactory.create(
							user.getUserId());

						return _toRoleBriefs(
							dtoConverterContext, userBag.getRoles());
					});
			}
		};
	}

	private ThemeDisplay _getThemeDisplay(Group group) {
		return new ThemeDisplay() {
			{
				setPortalURL(StringPool.BLANK);

				if (group != null) {
					setSiteGroupId(group.getGroupId());
				}
			}
		};
	}

	private AccountBrief _toAccountBrief(
			AccountEntryUserRel accountEntryUserRel,
			DTOConverterContext dtoConverterContext, User user)
		throws Exception {

		if (accountEntryUserRel.getAccountEntryId() ==
				AccountConstants.ACCOUNT_ENTRY_ID_DEFAULT) {

			return null;
		}

		AccountEntry accountEntry = _accountEntryLocalService.getAccountEntry(
			accountEntryUserRel.getAccountEntryId());

		return new AccountBrief() {
			{
				externalReferenceCode = accountEntry.getExternalReferenceCode();
				id = accountEntry.getAccountEntryId();
				name = accountEntry.getName();
				roleBriefs = TransformUtil.transformToArray(
					_accountRoleLocalService.getAccountRoles(
						accountEntry.getAccountEntryId(), user.getUserId()),
					accountRole -> _toRoleBrief(
						accountRole, dtoConverterContext),
					RoleBrief.class);
			}
		};
	}

	private OrganizationBrief _toOrganizationBrief(
			DTOConverterContext dtoConverterContext, Organization organization,
			User user)
		throws Exception {

		return new OrganizationBrief() {
			{
				id = organization.getOrganizationId();
				name = organization.getName();
				roleBriefs = _toRoleBriefs(
					dtoConverterContext,
					_roleLocalService.getUserGroupRoles(
						user.getUserId(), organization.getGroupId()));
			}
		};
	}

	private RoleBrief _toRoleBrief(
			AccountRole accountRole, DTOConverterContext dtoConverterContext)
		throws Exception {

		Role role = accountRole.getRole();

		return new RoleBrief() {
			{
				id = accountRole.getAccountRoleId();
				name = accountRole.getRoleName();
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					role.getTitleMap());
			}
		};
	}

	private RoleBrief _toRoleBrief(
		DTOConverterContext dtoConverterContext, Role role) {

		return new RoleBrief() {
			{
				id = role.getRoleId();
				name = role.getTitle(dtoConverterContext.getLocale());
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					role.getTitleMap());
			}
		};
	}

	private RoleBrief[] _toRoleBriefs(
			DTOConverterContext dtoConverterContext, Collection<Role> roles)
		throws Exception {

		return TransformUtil.transformToArray(
			roles,
			role -> {
				if (!_roleModelResourcePermission.contains(
						PermissionThreadLocal.getPermissionChecker(), role,
						ActionKeys.VIEW)) {

					return null;
				}

				return _toRoleBrief(dtoConverterContext, role);
			},
			RoleBrief.class);
	}

	private SiteBrief _toSiteBrief(
			DTOConverterContext dtoConverterContext, Group group, User user)
		throws Exception {

		return new SiteBrief() {
			{
				descriptiveName = group.getDescriptiveName(
					dtoConverterContext.getLocale());
				descriptiveName_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					group.getDescriptiveNameMap());
				id = group.getGroupId();
				name = group.getName(dtoConverterContext.getLocale());
				name_i18n = LocalizedMapUtil.getI18nMap(
					dtoConverterContext.isAcceptAllLanguages(),
					group.getNameMap());
				roleBriefs = _toRoleBriefs(
					dtoConverterContext,
					_roleLocalService.getUserGroupRoles(
						user.getUserId(), group.getGroupId()));
			}
		};
	}

	private UserGroupBrief _toUserGroupBrief(UserGroup userGroup)
		throws Exception {

		return new UserGroupBrief() {
			{
				description = userGroup.getDescription();
				id = userGroup.getGroupId();
				name = userGroup.getName();
			}
		};
	}

	@Reference
	private AccountEntryLocalService _accountEntryLocalService;

	@Reference
	private AccountEntryUserRelLocalService _accountEntryUserRelService;

	@Reference
	private AccountRoleLocalService _accountRoleLocalService;

	@Reference
	private AssetTagLocalService _assetTagLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private RoleLocalService _roleLocalService;

	@Reference(
		target = "(model.class.name=com.liferay.portal.kernel.model.Role)"
	)
	private ModelResourcePermission<Role> _roleModelResourcePermission;

	@Reference
	private UserBagFactory _userBagFactory;

	@Reference
	private UserGroupLocalService _userGroupLocalService;

	@Reference(target = DTOConverterConstants.USER_GROUP_RESOURCE_DTO_CONVERTER)
	private DTOConverter
		<UserGroup, com.liferay.headless.admin.user.dto.v1_0.UserGroup>
			_userGroupResourceDTOConverter;

	@Reference
	private UserLocalService _userLocalService;

}