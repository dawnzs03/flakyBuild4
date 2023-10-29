/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.fragment.collection.contributor.inputs;

import com.liferay.fragment.contributor.BaseFragmentCollectionContributor;
import com.liferay.fragment.contributor.FragmentCollectionContributor;
import com.liferay.fragment.model.FragmentEntry;
import com.liferay.portal.kernel.feature.flag.FeatureFlagManager;
import com.liferay.portal.kernel.util.ListUtil;

import java.util.List;
import java.util.Objects;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Pablo Molina
 */
@Component(
	property = "fragment.collection.key=INPUTS",
	service = FragmentCollectionContributor.class
)
public class InputsFragmentCollectionContributor
	extends BaseFragmentCollectionContributor {

	@Override
	public String getFragmentCollectionKey() {
		return "INPUTS";
	}

	@Override
	public List<FragmentEntry> getFragmentEntries() {
		return _filter(super.getFragmentEntries());
	}

	@Override
	public List<FragmentEntry> getFragmentEntries(int type) {
		return _filter(super.getFragmentEntries(type));
	}

	@Override
	public ServletContext getServletContext() {
		return _servletContext;
	}

	private List<FragmentEntry> _filter(List<FragmentEntry> fragmentEntries) {
		if (_featureFlagManager.isEnabled("LPS-183727")) {
			return fragmentEntries;
		}

		return ListUtil.filter(
			fragmentEntries,
			fragmentEntry -> !Objects.equals(
				fragmentEntry.getFragmentEntryKey(), "INPUTS-date-time-input"));
	}

	@Reference
	private FeatureFlagManager _featureFlagManager;

	@Reference(
		target = "(osgi.web.symbolicname=com.liferay.fragment.collection.contributor.inputs)"
	)
	private ServletContext _servletContext;

}