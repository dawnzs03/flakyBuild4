/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.internal.upgrade.registry;

import com.liferay.object.internal.upgrade.v1_2_0.util.ObjectViewColumnTable;
import com.liferay.object.internal.upgrade.v1_2_0.util.ObjectViewTable;
import com.liferay.object.internal.upgrade.v2_1_0.ObjectFieldBusinessTypeUpgradeProcess;
import com.liferay.object.internal.upgrade.v2_2_0.util.ObjectValidationRuleTable;
import com.liferay.object.internal.upgrade.v2_3_0.util.ObjectFieldSettingTable;
import com.liferay.object.internal.upgrade.v2_4_0.util.ObjectViewSortColumnTable;
import com.liferay.object.internal.upgrade.v3_17_0.util.ObjectStateFlowTable;
import com.liferay.object.internal.upgrade.v3_17_0.util.ObjectStateTable;
import com.liferay.object.internal.upgrade.v3_17_0.util.ObjectStateTransitionTable;
import com.liferay.object.internal.upgrade.v3_19_0.util.ObjectFilterTable;
import com.liferay.object.internal.upgrade.v3_22_0.ObjectFieldUpgradeProcess;
import com.liferay.object.internal.upgrade.v3_24_0.ObjectFieldSettingUpgradeProcess;
import com.liferay.object.internal.upgrade.v3_27_0.ObjectActionUpgradeProcess;
import com.liferay.object.internal.upgrade.v3_3_0.util.ObjectViewFilterColumnTable;
import com.liferay.object.internal.upgrade.v3_9_0.ObjectLayoutBoxUpgradeProcess;
import com.liferay.object.internal.upgrade.v6_0_0.util.ObjectValidationRuleSettingTable;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.ResourceLocalService;
import com.liferay.portal.kernel.upgrade.BaseExternalReferenceCodeUpgradeProcess;
import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.kernel.upgrade.UpgradeProcessFactory;
import com.liferay.portal.kernel.uuid.PortalUUID;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marco Leo
 */
@Component(service = UpgradeStepRegistrator.class)
public class ObjectServiceUpgradeStepRegistrator
	implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		registry.register(
			"1.0.0", "1.1.0",
			UpgradeProcessFactory.addColumns(
				"ObjectDefinition", "portlet BOOLEAN"));

		registry.register(
			"1.1.0", "1.2.0", ObjectViewTable.create(),
			ObjectViewColumnTable.create());

		registry.register(
			"1.2.0", "2.0.0",
			UpgradeProcessFactory.addColumns(
				"ObjectField", "businessType VARCHAR(75) null"),
			UpgradeProcessFactory.alterColumnName(
				"ObjectField", "type_", "dbType VARCHAR(75) null"));

		registry.register(
			"2.0.0", "2.1.0", new ObjectFieldBusinessTypeUpgradeProcess());

		registry.register("2.1.0", "2.2.0", ObjectValidationRuleTable.create());

		registry.register("2.2.0", "2.3.0", ObjectFieldSettingTable.create());

		registry.register("2.3.0", "2.4.0", ObjectViewSortColumnTable.create());

		registry.register(
			"2.4.0", "2.5.0",
			UpgradeProcessFactory.addColumns(
				"ObjectViewColumn", "label STRING null"));

		registry.register(
			"2.5.0", "3.0.0",
			UpgradeProcessFactory.dropColumns(
				"ObjectFieldSetting", "required"));

		registry.register(
			"3.0.0", "3.1.0",
			new com.liferay.object.internal.upgrade.v3_1_0.
				ObjectFieldBusinessTypeUpgradeProcess());

		registry.register(
			"3.1.0", "3.2.0",
			UpgradeProcessFactory.addColumns(
				"ObjectValidationRule", "name STRING null"));

		registry.register(
			"3.2.0", "3.3.0", ObjectViewFilterColumnTable.create());

		registry.register(
			"3.3.0", "3.4.0",
			UpgradeProcessFactory.addColumns(
				"ObjectAction", "description VARCHAR(75) null"));

		registry.register(
			"3.4.0", "3.5.0",
			new com.liferay.object.internal.upgrade.v3_5_0.
				ObjectDefinitionUpgradeProcess());

		registry.register(
			"3.5.0", "3.6.0",
			new com.liferay.object.internal.upgrade.v3_6_0.
				ObjectFieldUpgradeProcess());

		registry.register(
			"3.6.0", "3.7.0",
			UpgradeProcessFactory.addColumns(
				"ObjectAction", "conditionExpression TEXT null"));

		registry.register("3.7.0", "3.8.0", new DummyUpgradeStep());

		registry.register(
			"3.8.0", "3.9.0", new ObjectLayoutBoxUpgradeProcess(),
			new com.liferay.object.internal.upgrade.v3_9_0.
				ObjectViewColumnUpgradeProcess());

		registry.register(
			"3.9.0", "3.10.0",
			UpgradeProcessFactory.addColumns(
				"ObjectDefinition", "accountERObjectFieldId LONG",
				"accountEntryRestricted BOOLEAN"));

		registry.register(
			"3.10.0", "3.11.0",
			UpgradeProcessFactory.addColumns("ObjectAction", "status INTEGER"));

		registry.register(
			"3.11.0", "3.12.0",
			new com.liferay.object.internal.upgrade.v3_13_0.
				ObjectDefinitionUpgradeProcess());

		registry.register(
			"3.12.0", "3.13.0",
			new BaseExternalReferenceCodeUpgradeProcess() {

				@Override
				protected String[][] getTableAndPrimaryKeyColumnNames() {
					return new String[][] {
						{"ObjectEntry", "objectEntryId"},
						{"ObjectField", "objectFieldId"}
					};
				}

			});

		registry.register(
			"3.13.0", "3.14.0",
			UpgradeProcessFactory.addColumns(
				"ObjectField", "defaultValue VARCHAR(75)"));

		registry.register(
			"3.14.0", "3.15.0",
			UpgradeProcessFactory.addColumns(
				"ObjectRelationship", "parameterObjectFieldId LONG"));

		registry.register(
			"3.15.0", "3.16.0",
			UpgradeProcessFactory.addColumns("ObjectField", "state_ BOOLEAN"));

		registry.register(
			"3.16.0", "3.17.0", ObjectStateFlowTable.create(),
			ObjectStateTable.create(), ObjectStateTransitionTable.create());

		registry.register(
			"3.17.0", "3.18.0",
			new com.liferay.object.internal.upgrade.v3_18_0.
				ObjectFieldUpgradeProcess(_portalUUID));

		registry.register("3.18.0", "3.19.0", ObjectFilterTable.create());

		registry.register(
			"3.19.0", "3.19.1",
			UpgradeProcessFactory.alterColumnType(
				"ObjectFieldSetting", "value", "VARCHAR(255) null"));

		registry.register(
			"3.19.1", "3.19.2",
			new com.liferay.object.internal.upgrade.v3_19_2.
				ObjectFieldUpgradeProcess());

		registry.register(
			"3.19.2", "3.19.3",
			new com.liferay.object.internal.upgrade.v3_19_3.
				ObjectFieldUpgradeProcess());

		registry.register(
			"3.19.3", "3.20.0",
			UpgradeProcessFactory.alterColumnType(
				"ObjectViewFilterColumn", "json", "TEXT"));

		registry.register(
			"3.20.0", "3.21.0",
			new com.liferay.object.internal.upgrade.v3_21_0.
				ObjectDefinitionUpgradeProcess());

		registry.register(
			"3.21.0", "3.22.0", new ObjectFieldUpgradeProcess(_portalUUID));

		registry.register(
			"3.22.0", "3.23.0",
			new BaseExternalReferenceCodeUpgradeProcess() {

				@Override
				protected String[][] getTableAndPrimaryKeyColumnNames() {
					return new String[][] {
						{"ObjectDefinition", "objectDefinitionId"}
					};
				}

			});

		registry.register(
			"3.23.0", "3.23.1",
			new com.liferay.object.internal.upgrade.v3_23_1.
				ObjectFieldUpgradeProcess());

		registry.register(
			"3.23.1", "3.24.0",
			new ObjectFieldSettingUpgradeProcess(_portalUUID));

		registry.register(
			"3.24.0", "3.25.0",
			UpgradeProcessFactory.addColumns(
				"ObjectDefinition", "enableObjectEntryHistory BOOLEAN"));

		registry.register(
			"3.25.0", "3.26.0",
			new com.liferay.object.internal.upgrade.v3_26_0.
				ObjectFieldSettingUpgradeProcess(_portalUUID));

		registry.register(
			"3.26.0", "3.26.1",
			UpgradeProcessFactory.alterColumnType(
				"ObjectDefinition", "className", "VARCHAR(255) null"));

		registry.register("3.26.1", "3.27.0", new ObjectActionUpgradeProcess());

		registry.register(
			"3.27.0", "3.27.1",
			new com.liferay.object.internal.upgrade.v3_27_1.
				ObjectFieldSettingUpgradeProcess());

		registry.register(
			"3.27.1", "3.28.0",
			new BaseExternalReferenceCodeUpgradeProcess() {

				@Override
				protected String[][] getTableAndPrimaryKeyColumnNames() {
					return new String[][] {{"ObjectAction", "objectActionId"}};
				}

			});

		registry.register(
			"3.28.0", "4.0.0",
			UpgradeProcessFactory.alterColumnType(
				"ObjectAction", "description", "VARCHAR(75) null"),
			UpgradeProcessFactory.alterColumnType(
				"ObjectValidationRule", "script", "TEXT null"));

		registry.register(
			"4.0.0", "4.1.0",
			new com.liferay.object.internal.upgrade.v4_1_0.
				ObjectDefinitionUpgradeProcess());

		registry.register(
			"4.1.0", "4.1.1",
			new com.liferay.object.internal.upgrade.v4_1_1.
				ObjectViewUpgradeProcess());

		registry.register(
			"4.1.1", "5.0.0",
			new com.liferay.object.internal.upgrade.v5_0_0.
				ObjectFieldSettingUpgradeProcess(_portalUUID));

		registry.register(
			"5.0.0", "5.1.0",
			new com.liferay.object.internal.upgrade.v5_1_0.
				ObjectDefinitionUpgradeProcess());

		registry.register(
			"5.1.0", "5.1.1",
			new com.liferay.object.internal.upgrade.v5_1_1.
				ObjectFieldUpgradeProcess());

		registry.register(
			"5.1.1", "5.2.0",
			new com.liferay.object.internal.upgrade.v5_2_0.
				ObjectRelationshipUpgradeProcess());

		registry.register(
			"5.2.0", "5.3.0",
			new com.liferay.object.internal.upgrade.v5_3_0.
				ObjectFieldUpgradeProcess());

		registry.register(
			"5.3.0", "5.3.1",
			new com.liferay.object.internal.upgrade.v5_3_1.
				SchemaUpgradeProcess());

		registry.register(
			"5.3.1", "6.0.0",
			new com.liferay.object.internal.upgrade.v6_0_0.
				ObjectValidationRuleUpgradeProcess(),
			ObjectValidationRuleSettingTable.create());

		registry.register(
			"6.0.0", "7.0.0",
			new com.liferay.object.internal.upgrade.v7_0_0.
				ObjectDefinitionUpgradeProcess(
					_companyLocalService, _portalUUID, _resourceLocalService));

		registry.register(
			"7.0.0", "7.1.0",
			new com.liferay.object.internal.upgrade.v7_1_0.
				SchemaUpgradeProcess());

		registry.register(
			"7.1.0", "7.1.1",
			UpgradeProcessFactory.alterColumnType(
				"ObjectAction", "objectActionExecutorKey", "VARCHAR(255) null"),
			UpgradeProcessFactory.alterColumnType(
				"ObjectDefinition", "storageType", "VARCHAR(255) null"),
			UpgradeProcessFactory.alterColumnType(
				"ObjectValidationRule", "engine", "VARCHAR(255) null"));

		registry.register(
			"7.1.1", "8.0.0",
			new com.liferay.object.internal.upgrade.v8_0_0.
				ObjectFolderItemUpgradeProcess(_portalUUID));

		registry.register(
			"8.0.0", "8.1.0",
			UpgradeProcessFactory.addColumns(
				"ObjectDefinition", "enableObjectEntryDraft BOOLEAN"));

		registry.register(
			"8.1.0", "8.2.0",
			new com.liferay.object.internal.upgrade.v8_2_0.
				ObjectValidationRuleSettingsUpgradeProcess());

		registry.register(
			"8.2.0", "8.3.0",
			new com.liferay.object.internal.upgrade.v8_3_0.
				ObjectValidationRuleUpgradeProcess());
	}

	@Reference
	private CompanyLocalService _companyLocalService;

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private ResourceLocalService _resourceLocalService;

}