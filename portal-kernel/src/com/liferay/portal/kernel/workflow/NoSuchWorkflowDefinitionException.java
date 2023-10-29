/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.workflow;

/**
 * @author Michael Cavalcanti
 */
public class NoSuchWorkflowDefinitionException extends WorkflowException {

	public NoSuchWorkflowDefinitionException() {
	}

	public NoSuchWorkflowDefinitionException(String msg) {
		super(msg);
	}

	public NoSuchWorkflowDefinitionException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchWorkflowDefinitionException(Throwable throwable) {
		super(throwable);
	}

}