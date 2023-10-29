/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.yaml.openapi;

/**
 * @author Peter Shin
 */
public class Parameter {

	public String getExample() {
		return _example;
	}

	public String getIn() {
		return _in;
	}

	public String getName() {
		return _name;
	}

	public String getReference() {
		return _reference;
	}

	public Schema getSchema() {
		return _schema;
	}

	public boolean isRequired() {
		return _required;
	}

	public void setExample(String example) {
		_example = example;
	}

	public void setIn(String in) {
		_in = in;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setReference(String reference) {
		_reference = reference;
	}

	public void setRequired(boolean required) {
		_required = required;
	}

	public void setSchema(Schema schema) {
		_schema = schema;
	}

	private String _example;
	private String _in;
	private String _name;
	private String _reference;
	private boolean _required;
	private Schema _schema;

}