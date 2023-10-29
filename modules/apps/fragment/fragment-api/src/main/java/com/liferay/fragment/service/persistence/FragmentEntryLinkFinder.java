/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.fragment.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface FragmentEntryLinkFinder {

	public java.util.List<com.liferay.fragment.model.FragmentEntryLink>
		findByG_F(
			long groupId, long fragmentEntryId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.fragment.model.FragmentEntryLink>
					orderByComparator);

	public java.util.List<com.liferay.fragment.model.FragmentEntryLink>
		findByG_F_P_L(
			long groupId, long fragmentEntryId, int layoutPageTemplateEntryType,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.fragment.model.FragmentEntryLink>
					orderByComparator);

}