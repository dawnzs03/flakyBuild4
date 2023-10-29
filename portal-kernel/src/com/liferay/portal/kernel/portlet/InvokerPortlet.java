/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.portlet;

import javax.portlet.EventPortlet;
import javax.portlet.HeaderPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.ResourceServingPortlet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Michael Young
 * @author Neil Griffin
 */
@ProviderType
public interface InvokerPortlet
	extends EventPortlet, HeaderPortlet, Portlet, ResourceServingPortlet {

	public static final String INIT_INVOKER_PORTLET_NAME =
		"com.liferay.portal.invokerPortletName";

	public Integer getExpCache();

	public Portlet getPortlet();

	public ClassLoader getPortletClassLoader();

	public PortletConfig getPortletConfig();

	public PortletContext getPortletContext();

	public Portlet getPortletInstance();

	public boolean isCheckAuthToken();

	public boolean isFacesPortlet();

	public boolean isHeaderPortlet();

	public void setPortletFilters() throws PortletException;

}