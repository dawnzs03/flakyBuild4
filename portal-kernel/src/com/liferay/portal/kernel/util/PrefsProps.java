/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.util;

import java.util.Properties;

import javax.portlet.PortletPreferences;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public interface PrefsProps {

	public boolean getBoolean(long companyId, String name);

	public boolean getBoolean(
		long companyId, String name, boolean defaultValue);

	public boolean getBoolean(PortletPreferences preferences, String name);

	public boolean getBoolean(
		PortletPreferences preferences, String name, boolean defaultValue);

	public boolean getBoolean(String name);

	public boolean getBoolean(String name, boolean defaultValue);

	public String getContent(long companyId, String name);

	public String getContent(PortletPreferences preferences, String name);

	public String getContent(String name);

	public double getDouble(long companyId, String name);

	public double getDouble(long companyId, String name, double defaultValue);

	public double getDouble(PortletPreferences preferences, String name);

	public double getDouble(
		PortletPreferences preferences, String name, double defaultValue);

	public double getDouble(String name);

	public double getDouble(String name, double defaultValue);

	public int getInteger(long companyId, String name);

	public int getInteger(long companyId, String name, int defaultValue);

	public int getInteger(PortletPreferences preferences, String name);

	public int getInteger(
		PortletPreferences preferences, String name, int defaultValue);

	public int getInteger(String name);

	public int getInteger(String name, int defaultValue);

	public long getLong(long companyId, String name);

	public long getLong(long companyId, String name, long defaultValue);

	public long getLong(PortletPreferences preferences, String name);

	public long getLong(
		PortletPreferences preferences, String name, long defaultValue);

	public long getLong(String name);

	public long getLong(String name, long defaultValue);

	public PortletPreferences getPreferences();

	public PortletPreferences getPreferences(long companyId);

	public Properties getProperties(
		PortletPreferences preferences, String prefix, boolean removePrefix);

	public Properties getProperties(String prefix, boolean removePrefix);

	public short getShort(long companyId, String name);

	public short getShort(long companyId, String name, short defaultValue);

	public short getShort(PortletPreferences preferences, String name);

	public short getShort(
		PortletPreferences preferences, String name, short defaultValue);

	public short getShort(String name);

	public short getShort(String name, short defaultValue);

	public String getString(long companyId, String name);

	public String getString(long companyId, String name, String defaultValue);

	public String getString(PortletPreferences preferences, String name);

	public String getString(
		PortletPreferences preferences, String name, boolean defaultValue);

	public String getString(
		PortletPreferences preferences, String name, double defaultValue);

	public String getString(
		PortletPreferences preferences, String name, int defaultValue);

	public String getString(
		PortletPreferences preferences, String name, long defaultValue);

	public String getString(
		PortletPreferences preferences, String name, short defaultValue);

	public String getString(
		PortletPreferences preferences, String name, String defaultValue);

	public String getString(String name);

	public String getString(String name, String defaultValue);

	public String[] getStringArray(
		long companyId, String name, String delimiter);

	public String[] getStringArray(
		long companyId, String name, String delimiter, String[] defaultValue);

	public String[] getStringArray(
		PortletPreferences preferences, String name, String delimiter);

	public String[] getStringArray(
		PortletPreferences preferences, String name, String delimiter,
		String[] defaultValue);

	public String[] getStringArray(String name, String delimiter);

	public String[] getStringArray(
		String name, String delimiter, String[] defaultValue);

	public String getStringFromNames(long companyId, String... names);

}