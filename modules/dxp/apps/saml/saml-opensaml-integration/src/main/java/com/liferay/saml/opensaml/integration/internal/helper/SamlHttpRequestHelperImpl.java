/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.saml.opensaml.integration.internal.helper;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.HttpComponentsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.saml.helper.SamlHttpRequestHelper;
import com.liferay.saml.opensaml.integration.internal.metadata.MetadataManager;
import com.liferay.saml.opensaml.integration.internal.util.OpenSamlUtil;
import com.liferay.saml.runtime.SamlException;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Gabriel Santos
 */
@Component(service = SamlHttpRequestHelper.class)
public class SamlHttpRequestHelperImpl implements SamlHttpRequestHelper {

	@Override
	public String getEntityDescriptorString(
			HttpServletRequest httpServletRequest)
		throws SamlException {

		try {
			return OpenSamlUtil.marshall(
				_metadataManager.getEntityDescriptor(httpServletRequest));
		}
		catch (Exception exception) {
			throw new SamlException(exception);
		}
	}

	@Override
	public String getRequestPath(HttpServletRequest httpServletRequest) {
		String requestURI = httpServletRequest.getRequestURI();

		String contextPath = httpServletRequest.getContextPath();

		if (Validator.isNotNull(contextPath) &&
			!contextPath.equals(StringPool.SLASH)) {

			requestURI = requestURI.substring(contextPath.length());
		}

		return HttpComponentsUtil.removePathParameters(requestURI);
	}

	@Reference
	private MetadataManager _metadataManager;

}