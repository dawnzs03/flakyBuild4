/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.content.client.serdes.v1_0;

import com.liferay.headless.admin.content.client.dto.v1_0.MasterPage;
import com.liferay.headless.admin.content.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MasterPageSerDes {

	public static MasterPage toDTO(String json) {
		MasterPageJSONParser masterPageJSONParser = new MasterPageJSONParser();

		return masterPageJSONParser.parseToDTO(json);
	}

	public static MasterPage[] toDTOs(String json) {
		MasterPageJSONParser masterPageJSONParser = new MasterPageJSONParser();

		return masterPageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(MasterPage masterPage) {
		if (masterPage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (masterPage.getKey() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"key\": ");

			sb.append("\"");

			sb.append(_escape(masterPage.getKey()));

			sb.append("\"");
		}

		if (masterPage.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(masterPage.getName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		MasterPageJSONParser masterPageJSONParser = new MasterPageJSONParser();

		return masterPageJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(MasterPage masterPage) {
		if (masterPage == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (masterPage.getKey() == null) {
			map.put("key", null);
		}
		else {
			map.put("key", String.valueOf(masterPage.getKey()));
		}

		if (masterPage.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(masterPage.getName()));
		}

		return map;
	}

	public static class MasterPageJSONParser
		extends BaseJSONParser<MasterPage> {

		@Override
		protected MasterPage createDTO() {
			return new MasterPage();
		}

		@Override
		protected MasterPage[] createDTOArray(int size) {
			return new MasterPage[size];
		}

		@Override
		protected void setField(
			MasterPage masterPage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "key")) {
				if (jsonParserFieldValue != null) {
					masterPage.setKey((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					masterPage.setName((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}