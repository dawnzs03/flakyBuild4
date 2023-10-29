/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.data.cleanup.internal.upgrade;

/**
 * @author Adolfo Pérez
 */
public class InvitationUpgradeProcess extends BaseUpgradeProcess {

	@Override
	protected void doUpgrade() throws Exception {
		removePortletData(
			new String[] {"com.liferay.invitation.web"}, new String[] {"100"},
			new String[] {
				"com_liferay_invitation_web_portlet_InvitationPortlet"
			});
	}

}