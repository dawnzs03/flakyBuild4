/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.struts.model;

import com.liferay.portal.struts.Action;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shuyang Zhou
 */
public class ActionMapping {

	public ActionMapping(
		ModuleConfig moduleConfig, String forward, String path, Action action) {

		_moduleConfig = moduleConfig;
		_forward = forward;
		_path = path;
		_action = action;
	}

	public void addActionForward(ActionForward actionForward) {
		_actionForwards.put(actionForward.getName(), actionForward);
	}

	public Action getAction() {
		return _action;
	}

	public ActionForward getActionForward(String name) {
		ActionForward actionForward = _actionForwards.get(name);

		if (actionForward != null) {
			return actionForward;
		}

		return _moduleConfig.getActionForward(name);
	}

	public String getForward() {
		return _forward;
	}

	public String getPath() {
		return _path;
	}

	private final Action _action;
	private final Map<String, ActionForward> _actionForwards = new HashMap<>();
	private final String _forward;
	private final ModuleConfig _moduleConfig;
	private final String _path;

}