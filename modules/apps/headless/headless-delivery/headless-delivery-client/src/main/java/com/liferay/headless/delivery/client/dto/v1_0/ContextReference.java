/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.delivery.client.dto.v1_0;

import com.liferay.headless.delivery.client.function.UnsafeSupplier;
import com.liferay.headless.delivery.client.serdes.v1_0.ContextReferenceSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContextReference implements Cloneable, Serializable {

	public static ContextReference toDTO(String json) {
		return ContextReferenceSerDes.toDTO(json);
	}

	public ContextSource getContextSource() {
		return contextSource;
	}

	public String getContextSourceAsString() {
		if (contextSource == null) {
			return null;
		}

		return contextSource.toString();
	}

	public void setContextSource(ContextSource contextSource) {
		this.contextSource = contextSource;
	}

	public void setContextSource(
		UnsafeSupplier<ContextSource, Exception> contextSourceUnsafeSupplier) {

		try {
			contextSource = contextSourceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ContextSource contextSource;

	@Override
	public ContextReference clone() throws CloneNotSupportedException {
		return (ContextReference)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContextReference)) {
			return false;
		}

		ContextReference contextReference = (ContextReference)object;

		return Objects.equals(toString(), contextReference.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ContextReferenceSerDes.toJSON(this);
	}

	public static enum ContextSource {

		COLLECTION_ITEM("CollectionItem"), DISPLAY_PAGE_ITEM("DisplayPageItem");

		public static ContextSource create(String value) {
			for (ContextSource contextSource : values()) {
				if (Objects.equals(contextSource.getValue(), value) ||
					Objects.equals(contextSource.name(), value)) {

					return contextSource;
				}
			}

			return null;
		}

		public String getValue() {
			return _value;
		}

		@Override
		public String toString() {
			return _value;
		}

		private ContextSource(String value) {
			_value = value;
		}

		private final String _value;

	}

}