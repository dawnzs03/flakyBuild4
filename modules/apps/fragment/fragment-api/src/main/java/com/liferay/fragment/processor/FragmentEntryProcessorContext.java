/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.fragment.processor;

import com.liferay.info.form.InfoForm;
import com.liferay.info.item.InfoItemReference;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Pavel Savinov
 */
@ProviderType
public interface FragmentEntryProcessorContext {

	public InfoItemReference getContextInfoItemReference();

	public String getFragmentElementId();

	public HttpServletRequest getHttpServletRequest();

	public HttpServletResponse getHttpServletResponse();

	public InfoForm getInfoForm();

	public Locale getLocale();

	public String getMode();

	public long getPreviewClassNameId();

	public long getPreviewClassPK();

	public int getPreviewType();

	public String getPreviewVersion();

	public long[] getSegmentsEntryIds();

	public boolean isEditMode();

	public boolean isIndexMode();

	public boolean isViewMode();

}