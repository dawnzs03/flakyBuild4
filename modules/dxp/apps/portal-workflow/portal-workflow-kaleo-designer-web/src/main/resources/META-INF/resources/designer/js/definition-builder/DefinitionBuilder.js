/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import React, {useState} from 'react';
import {ReactFlowProvider} from 'react-flow-renderer';

import '../../css/definition-builder/main.scss';
import {DefinitionBuilderContextProvider} from './DefinitionBuilderContext';
import DiagramBuilder from './diagram-builder/DiagramBuilder';
import {defaultNodes} from './diagram-builder/components/nodes/utils';
import UpperToolbar from './shared/components/toolbar/UpperToolbar';
import SourceBuilder from './source-builder/SourceBuilder';

export default function DefinitionBuilder(props) {
	const [accountEntryId, setAccountEntryId] = useState(props.accountEntryId);
	const [active, setActive] = useState(true);
	const [alertMessage, setAlertMessage] = useState('');
	const [alertType, setAlertType] = useState(null);
	const [blockingErrors, setBlockingErrors] = useState({errorType: ''});
	const [currentEditor, setCurrentEditor] = useState(null);
	const [definitionDescription, setDefinitionDescription] = useState('');
	const [definitionInfo, setDefinitionInfo] = useState(null);
	const [definitionName, setDefinitionName] = useState(props.definitionName);
	const [definitionTitle, setDefinitionTitle] = useState(props.title);
	const [
		definitionTitleTranslations,
		setDefinitionTitleTranslations,
	] = useState(props.translations);
	const [deserialize, setDeserialize] = useState(false);
	const [elements, setElements] = useState(defaultNodes);
	const [selectedLanguageId, setSelectedLanguageId] = useState('');
	const [showDefinitionInfo, setShowDefinitionInfo] = useState(false);
	const [showInvalidContentMessage, setShowInvalidContentMessage] = useState(
		false
	);
	const [sourceView, setSourceView] = useState(false);
	const [showAlert, setShowAlert] = useState(false);
	const [version, setVersion] = useState(parseInt(props.version, 10));

	const contextProps = {
		accountEntryId,
		active,
		alertMessage,
		alertType,
		blockingErrors,
		currentEditor,
		definitionDescription,
		definitionInfo,
		definitionName,
		definitionTitle,
		definitionTitleTranslations,
		deserialize,
		elements,
		functionActionExecutors: props.functionActionExecutors,
		selectedLanguageId,
		setAccountEntryId,
		setActive,
		setAlertMessage,
		setAlertType,
		setBlockingErrors,
		setCurrentEditor,
		setDefinitionDescription,
		setDefinitionInfo,
		setDefinitionName,
		setDefinitionTitle,
		setDefinitionTitleTranslations,
		setDeserialize,
		setElements,
		setSelectedLanguageId,
		setShowAlert,
		setShowDefinitionInfo,
		setShowInvalidContentMessage,
		setSourceView,
		setVersion,
		showAlert,
		showDefinitionInfo,
		showInvalidContentMessage,
		sourceView,
		statuses: props.statuses,
		version,
	};

	return (
		<DefinitionBuilderContextProvider {...contextProps}>
			<div className="definition-builder-app">
				<ReactFlowProvider>
					<UpperToolbar {...props} />

					{sourceView ? <SourceBuilder /> : <DiagramBuilder />}
				</ReactFlowProvider>
			</div>
		</DefinitionBuilderContextProvider>
	);
}
