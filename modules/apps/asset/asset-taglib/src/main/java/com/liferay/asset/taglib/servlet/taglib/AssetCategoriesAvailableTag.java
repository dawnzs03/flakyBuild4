/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.asset.taglib.servlet.taglib;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.service.AssetCategoryServiceUtil;
import com.liferay.taglib.TagSupport;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;

/**
 * @author Sergio González
 */
public class AssetCategoriesAvailableTag<R> extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		try {
			_assetCategories = AssetCategoryServiceUtil.getCategories(
				_className, _classPK);

			if (!_assetCategories.isEmpty()) {
				return EVAL_BODY_INCLUDE;
			}

			return SKIP_BODY;
		}
		catch (Exception exception) {
			throw new JspException(exception);
		}
		finally {
			_className = null;
			_classPK = 0;
		}
	}

	public List<AssetCategory> getAssetCategories() {
		return _assetCategories;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	private List<AssetCategory> _assetCategories = new ArrayList<>();
	private String _className;
	private long _classPK;

}