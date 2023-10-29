/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.action.util;

import com.liferay.dynamic.data.mapping.expression.CreateExpressionRequest;
import com.liferay.dynamic.data.mapping.expression.DDMExpression;
import com.liferay.dynamic.data.mapping.expression.DDMExpressionFactory;
import com.liferay.object.field.setting.util.ObjectFieldSettingUtil;
import com.liferay.object.internal.dynamic.data.mapping.expression.ObjectEntryDDMExpressionParameterAccessor;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectField;
import com.liferay.object.service.ObjectFieldLocalServiceUtil;
import com.liferay.object.service.ObjectFieldSettingLocalServiceUtil;
import com.liferay.object.system.JaxRsApplicationDescriptor;
import com.liferay.object.system.SystemObjectDefinitionManager;
import com.liferay.object.system.SystemObjectDefinitionManagerRegistry;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Carolina Barbosa
 */
public class ObjectEntryVariablesUtil {

	public static Map<String, Object> getValues(
			DDMExpressionFactory ddmExpressionFactory,
			UnicodeProperties parametersUnicodeProperties,
			Map<String, Object> variables)
		throws Exception {

		Map<String, Object> values = new HashMap<>();

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray(
			parametersUnicodeProperties.get("predefinedValues"));

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);

			Object value = jsonObject.get("value");

			if (Validator.isNull(value)) {
				continue;
			}

			if (!jsonObject.getBoolean("inputAsValue")) {
				DDMExpression<Serializable> ddmExpression =
					ddmExpressionFactory.createExpression(
						CreateExpressionRequest.Builder.newBuilder(
							value.toString()
						).withDDMExpressionParameterAccessor(
							new ObjectEntryDDMExpressionParameterAccessor(
								(Map<String, Object>)variables.get(
									"originalBaseModel"))
						).build());

				ddmExpression.setVariables(
					(Map<String, Object>)variables.get("baseModel"));

				value = ddmExpression.evaluate();
			}

			values.put(jsonObject.getString("name"), value);
		}

		return values;
	}

	public static Map<String, Object> getVariables(
		DTOConverterRegistry dtoConverterRegistry,
		ObjectDefinition objectDefinition, JSONObject payloadJSONObject,
		SystemObjectDefinitionManagerRegistry
			systemObjectDefinitionManagerRegistry) {

		Map<String, Object> currentVariables = _getVariables(
			dtoConverterRegistry, objectDefinition, false, payloadJSONObject,
			systemObjectDefinitionManagerRegistry);

		return HashMapBuilder.<String, Object>put(
			"baseModel", currentVariables
		).put(
			"entryDTO", currentVariables.get("entryDTO")
		).put(
			"originalBaseModel",
			() -> {
				String suffix = _getSuffix(
					objectDefinition, systemObjectDefinitionManagerRegistry);

				if (payloadJSONObject.has("original" + suffix)) {
					return _getVariables(
						dtoConverterRegistry, objectDefinition, true,
						payloadJSONObject,
						systemObjectDefinitionManagerRegistry);
				}

				return _getDefaultVariables(
					objectDefinition,
					Collections.unmodifiableSet(currentVariables.keySet()));
			}
		).build();
	}

	private static String _getContentType(
		DTOConverterRegistry dtoConverterRegistry,
		ObjectDefinition objectDefinition,
		SystemObjectDefinitionManagerRegistry
			systemObjectDefinitionManagerRegistry) {

		SystemObjectDefinitionManager systemObjectDefinitionManager =
			systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager(objectDefinition.getName());

		JaxRsApplicationDescriptor jaxRsApplicationDescriptor =
			systemObjectDefinitionManager.getJaxRsApplicationDescriptor();

		DTOConverter<?, ?> dtoConverter = dtoConverterRegistry.getDTOConverter(
			jaxRsApplicationDescriptor.getApplicationName(),
			objectDefinition.getClassName(),
			jaxRsApplicationDescriptor.getVersion());

		if (dtoConverter == null) {
			Class<?> modelClass = systemObjectDefinitionManager.getModelClass();

			return modelClass.getSimpleName();
		}

		return dtoConverter.getContentType();
	}

	private static Map<String, Object> _getDefaultVariables(
		ObjectDefinition objectDefinition, Set<String> keys) {

		Map<String, Object> defaultVariables = new HashMap<>();

		for (ObjectField objectField :
				ObjectFieldLocalServiceUtil.getObjectFields(
					objectDefinition.getObjectDefinitionId())) {

			String defaultValue =
				ObjectFieldSettingUtil.getDefaultValueAsString(
					null, objectField.getObjectFieldId(),
					ObjectFieldSettingLocalServiceUtil.getService(), null);

			if (Validator.isNotNull(defaultValue) &&
				keys.contains(objectField.getName())) {

				defaultVariables.put(objectField.getName(), defaultValue);
			}
		}

		return defaultVariables;
	}

	private static String _getSuffix(
		ObjectDefinition objectDefinition,
		SystemObjectDefinitionManagerRegistry
			systemObjectDefinitionManagerRegistry) {

		if (!objectDefinition.isUnmodifiableSystemObject()) {
			return "ObjectEntry";
		}

		SystemObjectDefinitionManager systemObjectDefinitionManager =
			systemObjectDefinitionManagerRegistry.
				getSystemObjectDefinitionManager(objectDefinition.getName());

		Class<?> modelClass = systemObjectDefinitionManager.getModelClass();

		return modelClass.getSimpleName();
	}

	private static Map<String, Object> _getVariables(
		DTOConverterRegistry dtoConverterRegistry,
		ObjectDefinition objectDefinition, boolean oldValues,
		JSONObject payloadJSONObject,
		SystemObjectDefinitionManagerRegistry
			systemObjectDefinitionManagerRegistry) {

		String userId = payloadJSONObject.getString("userId");

		Map<String, Object> allowedVariables =
			HashMapBuilder.<String, Object>put(
				"creator",
				() -> {
					if (objectDefinition.isUnmodifiableSystemObject()) {
						return userId;
					}

					return MapUtil.getString(
						(Map<String, Object>)payloadJSONObject.get(
							"objectEntry"),
						"userId");
				}
			).put(
				"currentUserId", userId
			).build();

		Map<String, Object> variables = new HashMap<>();

		if (objectDefinition.isUnmodifiableSystemObject()) {
			SystemObjectDefinitionManager systemObjectDefinitionManager =
				systemObjectDefinitionManagerRegistry.
					getSystemObjectDefinitionManager(
						objectDefinition.getName());

			variables = systemObjectDefinitionManager.getVariables(
				_getContentType(
					dtoConverterRegistry, objectDefinition,
					systemObjectDefinitionManagerRegistry),
				objectDefinition, oldValues, payloadJSONObject);

			if (variables == null) {
				return payloadJSONObject.toMap();
			}
		}
		else {
			if (oldValues) {
				variables.putAll(
					(Map<String, Object>)payloadJSONObject.get(
						"originalObjectEntry"));
			}
			else {
				variables.putAll(
					(Map<String, Object>)payloadJSONObject.get("objectEntry"));
			}

			variables.putAll((Map<String, Object>)variables.get("values"));

			variables.remove("values");

			allowedVariables.put(
				"entryDTO",
				payloadJSONObject.get(
					"objectEntryDTO" + objectDefinition.getShortName()));

			Object objectEntryId = variables.get("objectEntryId");

			if (objectEntryId != null) {
				allowedVariables.put("id", objectEntryId);
			}
		}

		variables.remove("creator");

		List<ObjectField> objectFields =
			ObjectFieldLocalServiceUtil.getObjectFields(
				objectDefinition.getObjectDefinitionId());

		for (ObjectField objectField : objectFields) {
			if (!allowedVariables.containsKey(objectField.getName())) {
				allowedVariables.put(
					objectField.getName(),
					variables.get(objectField.getName()));
			}
		}

		return allowedVariables;
	}

}