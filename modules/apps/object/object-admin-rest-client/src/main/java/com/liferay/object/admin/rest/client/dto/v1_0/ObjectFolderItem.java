/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.admin.rest.client.dto.v1_0;

import com.liferay.object.admin.rest.client.function.UnsafeSupplier;
import com.liferay.object.admin.rest.client.serdes.v1_0.ObjectFolderItemSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ObjectFolderItem implements Cloneable, Serializable {

	public static ObjectFolderItem toDTO(String json) {
		return ObjectFolderItemSerDes.toDTO(json);
	}

	public Boolean getLinkedObjectDefinition() {
		return linkedObjectDefinition;
	}

	public void setLinkedObjectDefinition(Boolean linkedObjectDefinition) {
		this.linkedObjectDefinition = linkedObjectDefinition;
	}

	public void setLinkedObjectDefinition(
		UnsafeSupplier<Boolean, Exception>
			linkedObjectDefinitionUnsafeSupplier) {

		try {
			linkedObjectDefinition = linkedObjectDefinitionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean linkedObjectDefinition;

	public String getObjectDefinitionExternalReferenceCode() {
		return objectDefinitionExternalReferenceCode;
	}

	public void setObjectDefinitionExternalReferenceCode(
		String objectDefinitionExternalReferenceCode) {

		this.objectDefinitionExternalReferenceCode =
			objectDefinitionExternalReferenceCode;
	}

	public void setObjectDefinitionExternalReferenceCode(
		UnsafeSupplier<String, Exception>
			objectDefinitionExternalReferenceCodeUnsafeSupplier) {

		try {
			objectDefinitionExternalReferenceCode =
				objectDefinitionExternalReferenceCodeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String objectDefinitionExternalReferenceCode;

	public Integer getPositionX() {
		return positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	public void setPositionX(
		UnsafeSupplier<Integer, Exception> positionXUnsafeSupplier) {

		try {
			positionX = positionXUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer positionX;

	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	public void setPositionY(
		UnsafeSupplier<Integer, Exception> positionYUnsafeSupplier) {

		try {
			positionY = positionYUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer positionY;

	@Override
	public ObjectFolderItem clone() throws CloneNotSupportedException {
		return (ObjectFolderItem)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ObjectFolderItem)) {
			return false;
		}

		ObjectFolderItem objectFolderItem = (ObjectFolderItem)object;

		return Objects.equals(toString(), objectFolderItem.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ObjectFolderItemSerDes.toJSON(this);
	}

}