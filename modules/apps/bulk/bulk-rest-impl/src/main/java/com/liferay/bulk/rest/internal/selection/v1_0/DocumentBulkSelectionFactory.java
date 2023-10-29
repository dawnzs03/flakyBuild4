/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.bulk.rest.internal.selection.v1_0;

import com.liferay.bulk.rest.dto.v1_0.DocumentBulkSelection;
import com.liferay.bulk.rest.dto.v1_0.SelectionScope;
import com.liferay.bulk.selection.BulkSelection;
import com.liferay.bulk.selection.BulkSelectionFactory;
import com.liferay.bulk.selection.BulkSelectionFactoryRegistry;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.portal.kernel.util.HashMapBuilder;

import java.util.Collections;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Javier Gamarra
 */
@Component(service = DocumentBulkSelectionFactory.class)
public class DocumentBulkSelectionFactory {

	public BulkSelection<?> create(
		DocumentBulkSelection documentBulkSelection) {

		BulkSelectionFactory<Object> bulkSelectionFactory =
			_bulkSelectionFactoryRegistry.getBulkSelectionFactory(
				DLFileEntry.class.getName());

		return bulkSelectionFactory.create(
			_getParameterMap(
				documentBulkSelection.getDocumentIds(),
				documentBulkSelection.getSelectionScope()));
	}

	private Map<String, String[]> _getParameterMap(
		String[] rowIdsFileEntry, SelectionScope selectionScope) {

		if (selectionScope.getRepositoryId() == 0) {
			return Collections.singletonMap("rowIdsFileEntry", rowIdsFileEntry);
		}

		return HashMapBuilder.put(
			"folderId",
			new String[] {String.valueOf(selectionScope.getFolderId())}
		).put(
			"repositoryId",
			new String[] {String.valueOf(selectionScope.getRepositoryId())}
		).put(
			"rowIdsFileEntry", rowIdsFileEntry
		).put(
			"selectAll",
			new String[] {Boolean.toString(selectionScope.getSelectAll())}
		).build();
	}

	@Reference
	private BulkSelectionFactoryRegistry _bulkSelectionFactoryRegistry;

}