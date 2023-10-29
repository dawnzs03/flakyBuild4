/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.security.ldap.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Michael C. Han
 */
@ExtendedObjectClassDefinition(
	category = "ldap", scope = ExtendedObjectClassDefinition.Scope.COMPANY
)
@Meta.OCD(
	id = "com.liferay.portal.security.ldap.configuration.SystemLDAPConfiguration",
	localization = "content/Language", name = "system-ldap-configuration-name"
)
public interface SystemLDAPConfiguration extends CompanyScopedConfiguration {

	@Meta.AD(deflt = "0", name = "company-id", required = false)
	@Override
	public long companyId();

	@Meta.AD(
		deflt = "com.sun.jndi.ldap.LdapCtxFactory", name = "factory-initial",
		required = false
	)
	public String factoryInitial();

	@Meta.AD(
		deflt = "follow", name = "referral",
		optionLabels = {"follow", "ignore", "throws"},
		optionValues = {"follow", "ignore", "throws"}, required = false
	)
	public String referral();

	@Meta.AD(
		deflt = "1000", description = "page-size-help", name = "page-size",
		required = false
	)
	public int pageSize();

	@Meta.AD(
		deflt = "1000", description = "range-size-help", name = "range-size",
		required = false
	)
	public int rangeSize();

	@Meta.AD(
		deflt = "com.sun.jndi.ldap.connect.pool=true|com.sun.jndi.ldap.connect.timeout=500|com.sun.jndi.ldap.read.timeout=15000",
		name = "connection-properties", required = false
	)
	public String[] connectionProperties();

	@Meta.AD(
		deflt = "age", name = "error-password-age-keywords", required = false
	)
	public String[] errorPasswordAgeKeywords();

	@Meta.AD(
		deflt = "expired", name = "error-password-expired-keywords",
		required = false
	)
	public String[] errorPasswordExpiredKeywords();

	@Meta.AD(
		deflt = "history", name = "error-password-history-keywords",
		required = false
	)
	public String[] errorPasswordHistoryKeywords();

	@Meta.AD(
		deflt = "not allowed to change",
		name = "error-password-not-changeable-keywords", required = false
	)
	public String[] errorPasswordNotChangeableKeywords();

	@Meta.AD(
		deflt = "syntax", name = "error-password-syntax-keywords",
		required = false
	)
	public String[] errorPasswordSyntaxKeywords();

	@Meta.AD(
		deflt = "trivial", name = "error-password-trivial-text-keywords",
		required = false
	)
	public String[] errorPasswordTrivialTextKeywords();

	@Meta.AD(
		deflt = "retry limit", name = "error-user-lockout-keywords",
		required = false
	)
	public String[] errorUserLockoutKeywords();

}