/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.commerce.machine.learning.client.dto.v1_0;

import com.liferay.headless.commerce.machine.learning.client.function.UnsafeSupplier;
import com.liferay.headless.commerce.machine.learning.client.serdes.v1_0.SkuForecastSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Riccardo Ferrari
 * @generated
 */
@Generated("")
public class SkuForecast implements Cloneable, Serializable {

	public static SkuForecast toDTO(String json) {
		return SkuForecastSerDes.toDTO(json);
	}

	public Float getActual() {
		return actual;
	}

	public void setActual(Float actual) {
		this.actual = actual;
	}

	public void setActual(
		UnsafeSupplier<Float, Exception> actualUnsafeSupplier) {

		try {
			actual = actualUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Float actual;

	public Float getForecast() {
		return forecast;
	}

	public void setForecast(Float forecast) {
		this.forecast = forecast;
	}

	public void setForecast(
		UnsafeSupplier<Float, Exception> forecastUnsafeSupplier) {

		try {
			forecast = forecastUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Float forecast;

	public Float getForecastLowerBound() {
		return forecastLowerBound;
	}

	public void setForecastLowerBound(Float forecastLowerBound) {
		this.forecastLowerBound = forecastLowerBound;
	}

	public void setForecastLowerBound(
		UnsafeSupplier<Float, Exception> forecastLowerBoundUnsafeSupplier) {

		try {
			forecastLowerBound = forecastLowerBoundUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Float forecastLowerBound;

	public Float getForecastUpperBound() {
		return forecastUpperBound;
	}

	public void setForecastUpperBound(Float forecastUpperBound) {
		this.forecastUpperBound = forecastUpperBound;
	}

	public void setForecastUpperBound(
		UnsafeSupplier<Float, Exception> forecastUpperBoundUnsafeSupplier) {

		try {
			forecastUpperBound = forecastUpperBoundUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Float forecastUpperBound;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setSku(UnsafeSupplier<String, Exception> skuUnsafeSupplier) {
		try {
			sku = skuUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String sku;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setTimestamp(
		UnsafeSupplier<Date, Exception> timestampUnsafeSupplier) {

		try {
			timestamp = timestampUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date timestamp;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public void setUnit(UnsafeSupplier<String, Exception> unitUnsafeSupplier) {
		try {
			unit = unitUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String unit;

	@Override
	public SkuForecast clone() throws CloneNotSupportedException {
		return (SkuForecast)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SkuForecast)) {
			return false;
		}

		SkuForecast skuForecast = (SkuForecast)object;

		return Objects.equals(toString(), skuForecast.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return SkuForecastSerDes.toJSON(this);
	}

}