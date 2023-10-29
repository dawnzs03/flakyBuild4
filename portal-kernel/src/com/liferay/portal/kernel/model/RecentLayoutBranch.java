/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RecentLayoutBranch service. Represents a row in the &quot;RecentLayoutBranch&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RecentLayoutBranchModel
 * @generated
 */
@ImplementationClassName("com.liferay.portal.model.impl.RecentLayoutBranchImpl")
@ProviderType
public interface RecentLayoutBranch
	extends PersistedModel, RecentLayoutBranchModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.portal.model.impl.RecentLayoutBranchImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RecentLayoutBranch, Long>
		RECENT_LAYOUT_BRANCH_ID_ACCESSOR =
			new Accessor<RecentLayoutBranch, Long>() {

				@Override
				public Long get(RecentLayoutBranch recentLayoutBranch) {
					return recentLayoutBranch.getRecentLayoutBranchId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<RecentLayoutBranch> getTypeClass() {
					return RecentLayoutBranch.class;
				}

			};

}