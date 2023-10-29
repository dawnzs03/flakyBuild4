/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.model;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.util.Locale;

/**
 * Contains constants used by roles, including the names of the default roles
 * and the role types.
 *
 * @author     Brian Wing Shun Chan
 * @deprecated As of Mueller (7.2.x), replaced by {@link
 *             com.liferay.portal.kernel.model.role.RoleConstants}
 */
@Deprecated
public class RoleConstants {

	public static final String ADMINISTRATOR = "Administrator";

	public static final String GUEST = "Guest";

	public static final String NAME_INVALID_CHARACTERS =
		StringPool.COMMA + StringPool.SPACE + StringPool.STAR;

	public static final String NAME_LABEL = "role-name";

	public static final String NAME_RESERVED_WORDS = StringPool.NULL;

	public static final String ORGANIZATION_ADMINISTRATOR =
		"Organization Administrator";

	public static final String ORGANIZATION_OWNER = "Organization Owner";

	public static final String ORGANIZATION_USER = "Organization User";

	public static final String OWNER = "Owner";

	public static final String PLACEHOLDER_DEFAULT_GROUP_ROLE =
		"PLACEHOLDER_DEFAULT_GROUP_ROLE";

	public static final String PORTAL_CONTENT_REVIEWER =
		"Portal Content Reviewer";

	public static final String POWER_USER = "Power User";

	public static final String SITE_ADMINISTRATOR = "Site Administrator";

	public static final String SITE_CONTENT_REVIEWER = "Site Content Reviewer";

	public static final String SITE_MEMBER = "Site Member";

	public static final String SITE_OWNER = "Site Owner";

	public static final String[] SYSTEM_ORGANIZATION_ROLES = {
		ORGANIZATION_ADMINISTRATOR, ORGANIZATION_OWNER, ORGANIZATION_USER
	};

	public static final String[] SYSTEM_ROLES = {
		ADMINISTRATOR, GUEST, OWNER, POWER_USER, RoleConstants.USER
	};

	public static final String[] SYSTEM_SITE_ROLES = {
		SITE_ADMINISTRATOR, SITE_MEMBER, SITE_OWNER
	};

	public static final int TYPE_ORGANIZATION = 3;

	public static final String TYPE_ORGANIZATION_LABEL = "organization";

	public static final int TYPE_PROVIDER = 4;

	public static final int TYPE_REGULAR = 1;

	public static final String TYPE_REGULAR_LABEL = "regular";

	public static final int TYPE_SITE = 2;

	public static final String TYPE_SITE_LABEL = "site";

	public static final int[] TYPES_ORGANIZATION_AND_REGULAR = {
		TYPE_REGULAR, TYPE_ORGANIZATION
	};

	public static final int[] TYPES_ORGANIZATION_AND_REGULAR_AND_SITE = {
		TYPE_REGULAR, TYPE_ORGANIZATION, TYPE_SITE
	};

	public static final int[] TYPES_REGULAR = {TYPE_REGULAR};

	public static final int[] TYPES_REGULAR_AND_SITE = {
		TYPE_REGULAR, TYPE_SITE
	};

	public static final String USER = "User";

	public static String getNameGeneralRestrictions(
		Locale locale, boolean allowNumeric) {

		String nameGeneralRestrictions = StringUtil.toLowerCase(
			LanguageUtil.get(locale, "blank"));

		if (!allowNumeric) {
			nameGeneralRestrictions +=
				StringPool.COMMA_AND_SPACE +
					StringUtil.toLowerCase(LanguageUtil.get(locale, "numeric"));
		}

		return nameGeneralRestrictions;
	}

	public static String getTypeLabel(int type) {
		if (type == TYPE_ORGANIZATION) {
			return TYPE_ORGANIZATION_LABEL;
		}
		else if (type == TYPE_SITE) {
			return TYPE_SITE_LABEL;
		}

		return TYPE_REGULAR_LABEL;
	}

}