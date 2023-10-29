/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {ADD_FRAGMENT_ENTRY_LINKS} from './types';

import type {LayoutData} from '../../types/LayoutData';
import type {EditableType} from '../config/constants/editableTypes';
import type {FragmentEntryType} from '../config/constants/fragmentEntryTypes';
import type {FragmentEntryLinkComment} from './addFragmentEntryLinkComment';

export interface FragmentEntryLink<
	EditableId extends string = string,
	ConfigurationFieldId extends string = string
> {
	collectionContent?: Record<string, string>;
	comments: FragmentEntryLinkComment[];
	configuration: Record<string, unknown>;
	content: string;
	cssClass: string;
	defaultConfigurationValues: {
		[key in ConfigurationFieldId]: string;
	};
	editableTypes: {
		[key in EditableId]: EditableType;
	};
	editableValues: {
		'com.liferay.fragment.entry.processor.background.image.BackgroundImageFragmentEntryProcessor': {
			[key in EditableId]: unknown;
		};
		'com.liferay.fragment.entry.processor.editable.EditableFragmentEntryProcessor': {
			[key in EditableId]: unknown;
		};
		'com.liferay.fragment.entry.processor.freemarker.FreeMarkerFragmentEntryProcessor': {
			[key in ConfigurationFieldId]: unknown;
		};
	};
	fragmentEntryId: string;
	fragmentEntryKey: string;
	fragmentEntryLinkId: string;
	fragmentEntryType: FragmentEntryType;
	groupId: string;
	icon: string;
	masterLayout?: boolean;
	name: string;
	removed: boolean;
	segmentsExperienceId: string;
}

export type FragmentEntryLinkMap = Record<
	FragmentEntryLink['fragmentEntryId'],
	FragmentEntryLink
>;

export default function addFragmentEntryLinks({
	addedItemId,
	fragmentEntryLinks,
	layoutData,
}: {
	addedItemId: string;
	fragmentEntryLinks: FragmentEntryLink[];
	layoutData: LayoutData;
}) {
	return {
		fragmentEntryLinks,
		itemId: addedItemId,
		layoutData,
		type: ADD_FRAGMENT_ENTRY_LINKS,
	} as const;
}
