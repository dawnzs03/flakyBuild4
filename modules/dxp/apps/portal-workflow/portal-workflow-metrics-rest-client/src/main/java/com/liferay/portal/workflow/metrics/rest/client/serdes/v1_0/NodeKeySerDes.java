/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.workflow.metrics.rest.client.serdes.v1_0;

import com.liferay.portal.workflow.metrics.rest.client.dto.v1_0.NodeKey;
import com.liferay.portal.workflow.metrics.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Rafael Praxedes
 * @generated
 */
@Generated("")
public class NodeKeySerDes {

	public static NodeKey toDTO(String json) {
		NodeKeyJSONParser nodeKeyJSONParser = new NodeKeyJSONParser();

		return nodeKeyJSONParser.parseToDTO(json);
	}

	public static NodeKey[] toDTOs(String json) {
		NodeKeyJSONParser nodeKeyJSONParser = new NodeKeyJSONParser();

		return nodeKeyJSONParser.parseToDTOs(json);
	}

	public static String toJSON(NodeKey nodeKey) {
		if (nodeKey == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (nodeKey.getExecutionType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"executionType\": ");

			sb.append("\"");

			sb.append(_escape(nodeKey.getExecutionType()));

			sb.append("\"");
		}

		if (nodeKey.getId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"id\": ");

			sb.append("\"");

			sb.append(_escape(nodeKey.getId()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		NodeKeyJSONParser nodeKeyJSONParser = new NodeKeyJSONParser();

		return nodeKeyJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(NodeKey nodeKey) {
		if (nodeKey == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (nodeKey.getExecutionType() == null) {
			map.put("executionType", null);
		}
		else {
			map.put(
				"executionType", String.valueOf(nodeKey.getExecutionType()));
		}

		if (nodeKey.getId() == null) {
			map.put("id", null);
		}
		else {
			map.put("id", String.valueOf(nodeKey.getId()));
		}

		return map;
	}

	public static class NodeKeyJSONParser extends BaseJSONParser<NodeKey> {

		@Override
		protected NodeKey createDTO() {
			return new NodeKey();
		}

		@Override
		protected NodeKey[] createDTOArray(int size) {
			return new NodeKey[size];
		}

		@Override
		protected void setField(
			NodeKey nodeKey, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "executionType")) {
				if (jsonParserFieldValue != null) {
					nodeKey.setExecutionType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					nodeKey.setId((String)jsonParserFieldValue);
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