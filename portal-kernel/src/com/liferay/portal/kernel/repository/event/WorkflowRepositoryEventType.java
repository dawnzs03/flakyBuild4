/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.repository.event;

/**
 * @author Adolfo Pérez
 */
public interface WorkflowRepositoryEventType extends RepositoryEventType {

	public interface Add extends WorkflowRepositoryEventType {
	}

	public interface Update extends WorkflowRepositoryEventType {
	}

}