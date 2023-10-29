/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

type Locale = Liferay.Language.Locale;
type LocalizedValue<T> = Liferay.Language.LocalizedValue<T>;

interface LabelValueObject {
	label: string;
	value: string;
}

type editorTypeOptions = 'freemarker' | 'richText';

type EmailRecipients = {
	bcc: string;
	cc: string;
	from: string;
	fromName: LocalizedValue<string>;
	singleRecipient: boolean;
	to: LocalizedValue<string>;
};

type UserNotificationRecipients = {
	[key in 'term' | 'userScreenName' | 'roleName']?: string;
};
interface NotificationTemplate {
	attachmentObjectFieldIds: string[] | number[];
	body: LocalizedValue<string>;
	description: string;
	editorType: editorTypeOptions;
	externalReferenceCode: string;
	name: string;
	objectDefinitionExternalReferenceCode: string;
	objectDefinitionId: number | null;
	recipientType: string;
	recipients:
		| Partial<EmailRecipients>[]
		| Partial<UserNotificationRecipients>[]
		| [];
	subject: LocalizedValue<string>;
	type: string;
}

interface ObjectField {
	DBType: string;
	businessType: ObjectFieldBusinessType;
	defaultValue: number;
	id?: number;
	indexed: boolean;
	indexedAsKeyword: boolean;
	indexedLanguageId: Locale | null;
	label: LocalizedValue<string>;
	listTypeDefinitionId: number;
	name?: string;
	objectFieldSettings?: ObjectFieldSetting[];
	relationshipType?: unknown;
	required: boolean;
	state: boolean;
}

interface ObjectDefinition {
	active: boolean;
	dateCreated: string;
	dateModified: string;
	defaultLanguageId: Locale;
	externalReferenceCode: string;
	id: number;
	label: LocalizedValue<string>;
	name: string;
	objectActions: [];
	objectFields: ObjectField[];
	objectLayouts: [];
	objectViews: [];
	panelCategoryKey: string;
	pluralLabel: LocalizedValue<string>;
	portlet: boolean;
	scope: string;
	status: {
		code: number;
		label: string;
		label_i18n: string;
	};
	system: boolean;
	titleObjectFieldId: number;
}

type ObjectFieldBusinessType = 'Attachment' | 'LongText' | 'Picklist' | 'Text';
interface ObjectFieldType {
	businessType: ObjectFieldBusinessType;
	dbType: string;
	description: string;
	label: string;
}

interface ObjectFieldSetting {
	name: ObjectFieldSettingName;
	value: string | number | boolean;
}

type ObjectFieldSettingName =
	| 'acceptedFileExtensions'
	| 'fileSource'
	| 'maximumFileSize'
	| 'maxLength'
	| 'showCounter'
	| 'showFilesInDocumentsAndMedia'
	| 'storageDLFolderPath';
