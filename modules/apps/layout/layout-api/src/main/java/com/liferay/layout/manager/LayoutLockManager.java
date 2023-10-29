/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.layout.manager;

import com.liferay.layout.constants.LockedLayoutType;
import com.liferay.layout.model.LockedLayout;
import com.liferay.layout.model.LockedLayoutOrder;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;

import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lourdes Fernández Besada
 */
public interface LayoutLockManager {

	public String getLayoutType(long classPK, Locale locale, String type);

	public void getLock(ActionRequest actionRequest) throws PortalException;

	public List<LockedLayout> getLockedLayouts(
		long companyId, long groupId, LockedLayoutOrder lockedLayoutOrder,
		LockedLayoutType lockedLayoutType);

	public String getLockedLayoutURL(ActionRequest actionRequest);

	public String getLockedLayoutURL(HttpServletRequest httpServletRequest);

	public String getUnlockDraftLayoutURL(
			LiferayPortletResponse liferayPortletResponse,
			PortletURLBuilder.UnsafeSupplier<Object, Exception>
				redirectUnsafeSupplier)
		throws Exception;

	public void unlock(Layout layout, long userId);

	public void unlockLayouts(long companyId, long timeWithoutAutosave);

	public void unlockLayoutsByUserId(long companyId, long userId);

}