/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

interface Actions {
	delete: HTTPMethod;
	get: HTTPMethod;
	permissions: HTTPMethod;
	update: HTTPMethod;
}

interface AddObjectEntryDefinitions {
	externalReferenceCode: string;
	id: number;
	label: string;
	related?: boolean;
	system?: boolean;
}

type DefinitionAction = {
	href: string;
	method: string;
};

type DefinitionActions = {
	delete: DefinitionAction;
	get: DefinitionAction;
	permissions: DefinitionAction;
	update: DefinitionAction;
};

type ExcludesFilterOperator = {
	not: {
		in: string[] | number[];
	};
};

interface HTTPMethod {
	href: string;
	method: string;
}

interface IItem extends LabelValueObject {
	checked?: boolean;
}

type IncludesFilterOperator = {
	in: string[] | number[];
};

interface LabelNameObject {
	label: string;
	name: string;
}

interface LabelValueObject {
	label: string;
	value: string;
}

interface ListTypeDefinition {
	actions: Actions;
	externalReferenceCode: string;
	id: number;
	key: string;
	listTypeEntries: ListTypeEntry[];
	name: string;
	name_i18n: LocalizedValue<string>;
	system: boolean;
}

interface ListTypeEntry {
	externalReferenceCode: string;
	id: number;
	key: string;
	listTypeDefinitionId: number;
	name: string;
	name_i18n: LocalizedValue<string>;
}

type LocalizedValue<T> = Liferay.Language.LocalizedValue<T>;

interface ModelBuilderModals
	extends Omit<
		ViewObjectDefinitionsModals,
		| 'bindToRootObjectDefinition'
		| 'deletionNotAllowed'
		| 'unbindFromRootObjectDefinition'
	> {
	addObjectRelationship: boolean;
	editObjectDefinitionExternalReferenceCode: boolean;
	publishObjectDefinitions: boolean;
	redirectToEditObjectDefinitionDetails: boolean;
}

interface NameValueObject {
	name: string;
	value: string;
}

type NotificationTemplate = {
	attachmentObjectFieldIds: string[] | number[];
	bcc: string;
	body: LocalizedValue<string>;
	cc: string;
	description: string;
	externalReferenceCode: string;
	from: string;
	fromName: LocalizedValue<string>;
	id: number;
	name: string;
	objectDefinitionId: number | null;
	subject: LocalizedValue<string>;
	to: LocalizedValue<string>;
	type: 'email' | 'userNotification';
};

interface ObjectAction {
	active: boolean;
	conditionExpression?: string;
	description?: string;
	errorMessage: LocalizedValue<string>;
	id?: number;
	label: LocalizedValue<string>;
	name: string;
	objectActionExecutorKey: string;
	objectActionTriggerKey: string;
	objectDefinitionId?: number;
	objectDefinitionsRelationshipsURL: string;
	parameters: ObjectActionParameters;
	script?: string;
}

interface ObjectActionParameters {
	lineCount?: number;
	notificationTemplateExternalReferenceCode?: string;
	notificationTemplateId?: number;
	objectDefinitionExternalReferenceCode?: string;
	objectDefinitionId?: number;
	predefinedValues?: PredefinedValue[];
	relatedObjectEntries?: boolean;
	script?: string;
	secret?: string;
	system?: boolean;
	url?: string;
}

interface ObjectDefinition {
	accountEntryRestricted: boolean;
	accountEntryRestrictedObjectFieldId: string;
	accountEntryRestrictedObjectFieldName: string;
	actions: DefinitionActions;
	active: boolean;
	dateCreated: string;
	dateModified: string;
	dbTableName?: string;
	defaultLanguageId: Liferay.Language.Locale;
	enableCategorization: boolean;
	enableComments: boolean;
	enableLocalization: boolean;
	enableObjectEntryDraft: boolean;
	enableObjectEntryHistory: boolean;
	externalReferenceCode: string;
	id: number;
	label: LocalizedValue<string>;
	modifiable?: boolean;
	name: string;
	objectActions: [];
	objectFields: ObjectField[];
	objectFolderExternalReferenceCode: string;
	objectLayouts: [];
	objectRelationships: ObjectRelationship[];
	objectViews: [];
	panelCategoryKey: string;
	parameterRequired?: boolean;
	pluralLabel: LocalizedValue<string>;
	portlet: boolean;
	restContextPath: string;
	rootObjectDefinitionExternalReferenceCode: string;
	scope: string;
	status: {
		code: number;
		label: string;
		label_i18n: string;
	};
	storageType?: string;
	system: boolean;
	titleObjectFieldId: number | string;
	titleObjectFieldName: string;
}

interface ObjectDefinitionNodeData
	extends Omit<ObjectDefinition, 'objectFields'> {
	hasObjectDefinitionDeleteResourcePermission: boolean;
	hasObjectDefinitionManagePermissionsResourcePermission: boolean;
	hasObjectDefinitionUpdateResourcePermission: boolean;
	hasObjectDefinitionViewResourcePermission: boolean;
	hasSelfObjectRelationships: boolean;
	linkedObjectDefinition: boolean;
	objectFields: ObjectFieldNode[];
	selected: boolean;
}

interface ObjectEntry {
	creator: {
		additionalName: string;
		contentType: string;
		familyName: string;
		givenName: string;
		id: number;
		name: string;
	};
	dateCreated: string;
	dateModified: string;
	externalReferenceCode: string;
	id: number;
	name: string;
	status: {
		code: number;
		label: string;
		label_i18n: string;
	};
	[key: string]: string | number | unknown;
}

interface ObjectField {
	DBType: string;
	businessType: ObjectFieldBusinessType;
	defaultValue?: string;
	externalReferenceCode?: string;
	id: number;
	indexed: boolean;
	indexedAsKeyword: boolean;
	indexedLanguageId: Liferay.Language.Locale | null;
	label: LocalizedValue<string>;
	listTypeDefinitionExternalReferenceCode: string;
	listTypeDefinitionId?: number;
	localized: boolean;
	name: string;
	objectFieldSettings?: ObjectFieldSetting[];
	readOnly: ReadOnlyFieldValue;
	readOnlyConditionExpression: string;
	relationshipId?: number;
	relationshipType?: unknown;
	required: boolean;
	state: boolean;
	system?: boolean;
}

type ObjectFieldBusinessType =
	| 'Aggregation'
	| 'Attachment'
	| 'Date'
	| 'DateTime'
	| 'Decimal'
	| 'Encrypted'
	| 'Formula'
	| 'Integer'
	| 'LongInteger'
	| 'LongText'
	| 'MultiselectPicklist'
	| 'Picklist'
	| 'PrecisionDecimal'
	| 'Relationship'
	| 'RichText'
	| 'Text'
	| 'Workflow Status';

type ObjectFieldDateRangeFilterSettings = {
	[key: string]: string;
};

type ObjectFieldFilterSetting = {
	filterBy?: string;
	filterType?: string;
	json:
		| {
				[key: string]:
					| string
					| string[]
					| ObjectFieldDateRangeFilterSettings
					| undefined;
		  }
		| ExcludesFilterOperator
		| IncludesFilterOperator
		| string;
};

interface ObjectFieldNode extends Partial<ObjectField> {
	primaryKey: boolean;
	required: boolean;
	selected: boolean;
}

type ObjectFieldPicklistSetting = {
	id: number;
	objectStates: ObjectState[];
};

interface ObjectFieldSetting {
	name: ObjectFieldSettingName;
	objectFieldId?: number;
	value: ObjectFieldSettingValue;
}

type ObjectFieldSettingName =
	| 'acceptedFileExtensions'
	| 'defaultValue'
	| 'defaultValueType'
	| 'fileSource'
	| 'filters'
	| 'function'
	| 'maxLength'
	| 'maximumFileSize'
	| 'objectDefinition1ShortName'
	| 'objectFieldName'
	| 'objectRelationshipName'
	| 'output'
	| 'script'
	| 'showCounter'
	| 'showFilesInDocumentsAndMedia'
	| 'stateFlow'
	| 'storageDLFolderPath'
	| 'timeStorage'
	| 'uniqueValues'
	| 'uniqueValuesErrorMessage';

type ObjectFieldSettingValue =
	| LocalizedValue<string>
	| NameValueObject[]
	| ObjectFieldFilterSetting[]
	| ObjectFieldPicklistSetting
	| boolean
	| number
	| string;

interface ObjectFieldType {
	businessType: ObjectFieldBusinessType;
	dbType: string;
	description: string;
	label: string;
}

interface ObjectFieldView extends ObjectField {
	checked?: boolean;
	filtered?: boolean;
	hasFilter?: boolean;
	type?: string;
}

interface ObjectFolder {
	actions: Actions;
	dateCreated: string;
	dateModified: string;
	externalReferenceCode: string;
	id: number;
	label: LocalizedValue<string>;
	name: string;
	objectDefinitions?: ObjectDefinitionNodeData[];
	objectFolderItems: ObjectFolderItem[];
}

interface ObjectFolderItem {
	linkedObjectDefinition: boolean;
	objectDefinitionExternalReferenceCode: string;
	positionX: number;
	positionY: number;
}

interface ObjectRelationship {
	deletionType: string;
	edge: boolean;
	id: number;
	label: LocalizedValue<string>;
	name: string;
	objectDefinitionExternalReferenceCode1: string;
	objectDefinitionExternalReferenceCode2: string;
	objectDefinitionId1: number;
	objectDefinitionId2: number;
	readonly objectDefinitionName2: string;
	parameterObjectFieldName?: string;
	reverse: boolean;
	type: ObjectRelationshipType;
}

type ObjectRelationshipType = 'manyToMany' | 'oneToMany' | 'oneToOne';

interface ObjectState {
	key: string;
	objectStateTransitions: {key: string}[];
}

interface ObjectValidation {
	active: boolean;
	description?: string;
	engine: string;
	engineLabel: string;
	errorLabel: LocalizedValue<string>;
	id: number;
	lineCount?: number;
	name: LocalizedValue<string>;
	objectValidationRuleSettings?: {
		name: 'outputObjectFieldExternalReferenceCode';
		value: string;
	}[];
	outputType?: string;
	script: string;
	system?: boolean;
}

type ObjectValidationType = {
	label: string;
	name: string;
};

interface PredefinedValue {
	businessType: ObjectFieldBusinessType;
	inputAsValue: boolean;
	label: LocalizedValue<string>;
	name: string;
	value: string;
}

type ReadOnlyFieldValue = '' | 'conditional' | 'false' | 'true';

type TFilterOperators = {
	dateOperators: LabelValueObject[];
	numericOperators: LabelValueObject[];
	picklistOperators: LabelValueObject[];
};

interface ViewObjectDefinitionsModals {
	addObjectDefinition: boolean;
	addObjectFolder: boolean;
	bindToRootObjectDefinition: boolean;
	deleteObjectDefinition: boolean;
	deleteObjectFolder: boolean;
	deletionNotAllowed: boolean;
	editObjectFolder: boolean;
	moveObjectDefinition: boolean;
	unbindFromRootObjectDefinition: boolean;
}
