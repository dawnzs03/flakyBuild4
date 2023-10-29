/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

interface IHTMLElementBuilder {
	(args: any): HTMLElement;
}

export interface IClientExtensionRenderer {
	erc?: string;
	htmlElementBuilder?: IHTMLElementBuilder;
	name?: string;
	type: 'clientExtension';
	url?: string;
}

export interface IInternalRenderer {
	component: React.ComponentType<any>;
	label?: string;
	name?: string;
	type: 'internal';
	url?: string;
}

export type TRenderer = IClientExtensionRenderer | IInternalRenderer;
