/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.segments.context.vocabulary.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Raymond Augé
 */
@ExtendedObjectClassDefinition(
	category = "segments", factoryInstanceLabelAttribute = "entityFieldName"
)
@Meta.OCD(
	description = "segments-context-vocabulary-configuration-description",
	factory = true,
	id = "com.liferay.segments.context.vocabulary.internal.configuration.SegmentsContextVocabularyConfiguration",
	localization = "content/Language",
	name = "segments-context-vocabulary-configuration-name"
)
public interface SegmentsContextVocabularyConfiguration {

	@Meta.AD(
		name = "segments-context-vocabulary-configuration-entity-field-name"
	)
	public String entityFieldName();

	@Meta.AD(
		name = "segments-context-vocabulary-configuration-asset-vocabulary-name"
	)
	public String assetVocabularyName();

}