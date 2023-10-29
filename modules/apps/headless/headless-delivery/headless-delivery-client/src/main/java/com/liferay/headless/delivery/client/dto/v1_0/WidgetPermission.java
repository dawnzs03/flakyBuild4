/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.client.dto.v1_0;

import com.liferay.headless.delivery.client.function.UnsafeSupplier;
import com.liferay.headless.delivery.client.serdes.v1_0.WidgetPermissionSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WidgetPermission implements Cloneable, Serializable {

	public static WidgetPermission toDTO(String json) {
		return WidgetPermissionSerDes.toDTO(json);
	}

	public String[] getActionKeys() {
		return actionKeys;
	}

	public void setActionKeys(String[] actionKeys) {
		this.actionKeys = actionKeys;
	}

	public void setActionKeys(
		UnsafeSupplier<String[], Exception> actionKeysUnsafeSupplier) {

		try {
			actionKeys = actionKeysUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String[] actionKeys;

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public void setRoleKey(
		UnsafeSupplier<String, Exception> roleKeyUnsafeSupplier) {

		try {
			roleKey = roleKeyUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String roleKey;

	@Override
	public WidgetPermission clone() throws CloneNotSupportedException {
		return (WidgetPermission)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WidgetPermission)) {
			return false;
		}

		WidgetPermission widgetPermission = (WidgetPermission)object;

		return Objects.equals(toString(), widgetPermission.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return WidgetPermissionSerDes.toJSON(this);
	}

}