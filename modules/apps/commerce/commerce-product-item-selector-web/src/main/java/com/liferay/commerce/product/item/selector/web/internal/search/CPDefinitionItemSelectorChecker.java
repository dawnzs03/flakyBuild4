/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.item.selector.web.internal.search;

import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.util.SetUtil;

import java.util.Set;

import javax.portlet.RenderResponse;

/**
 * @author Alessio Antonio Rendina
 */
public class CPDefinitionItemSelectorChecker extends EmptyOnClickRowChecker {

	public CPDefinitionItemSelectorChecker(
		RenderResponse renderResponse, long[] checkedCPDefinitionIds,
		long disabledCPDefinitionId) {

		super(renderResponse);

		_checkedCPDefinitionIds = SetUtil.fromArray(checkedCPDefinitionIds);
		_disabledCPDefinitionId = disabledCPDefinitionId;
	}

	@Override
	public boolean isChecked(Object object) {
		CPDefinition cpDefinition = (CPDefinition)object;

		return _checkedCPDefinitionIds.contains(
			cpDefinition.getCPDefinitionId());
	}

	@Override
	public boolean isDisabled(Object object) {
		CPDefinition cpDefinition = (CPDefinition)object;

		boolean cpDefinitionDisabled = false;

		if (_disabledCPDefinitionId == cpDefinition.getCPDefinitionId()) {
			cpDefinitionDisabled = true;
		}

		if (isChecked(object) || cpDefinitionDisabled) {
			return true;
		}

		return false;
	}

	private final Set<Long> _checkedCPDefinitionIds;
	private final Long _disabledCPDefinitionId;

}