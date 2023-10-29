/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.antivirus.async.store.event;

/**
 * @author Raymond Augé
 */
public enum AntivirusAsyncEvent {

	MISSING, PREPARE, PROCESSING_ERROR, SIZE_EXCEEDED, SUCCESS, VIRUS_FOUND

}