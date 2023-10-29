/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.webdav.methods;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.webdav.Resource;
import com.liferay.portal.kernel.webdav.WebDAVException;
import com.liferay.portal.kernel.webdav.WebDAVRequest;
import com.liferay.portal.kernel.webdav.WebDAVStorage;
import com.liferay.portal.kernel.webdav.WebDAVUtil;
import com.liferay.portal.kernel.webdav.methods.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 * @author Alexander Chow
 */
public class MoveMethodImpl implements Method {

	@Override
	public int process(WebDAVRequest webDAVRequest) throws WebDAVException {
		WebDAVStorage storage = webDAVRequest.getWebDAVStorage();
		HttpServletRequest httpServletRequest =
			webDAVRequest.getHttpServletRequest();

		String destination = WebDAVUtil.getDestination(
			httpServletRequest, storage.getRootPath());

		StringBundler sb = null;

		if (_log.isInfoEnabled()) {
			sb = new StringBundler(4);

			sb.append("Destination is ");
			sb.append(destination);
		}

		if (!destination.equals(webDAVRequest.getPath()) &&
			(WebDAVUtil.getGroupId(webDAVRequest.getCompanyId(), destination) ==
				webDAVRequest.getGroupId())) {

			Resource resource = storage.getResource(webDAVRequest);

			if (resource == null) {
				return HttpServletResponse.SC_NOT_FOUND;
			}

			boolean overwrite = WebDAVUtil.isOverwrite(httpServletRequest);

			if (_log.isInfoEnabled()) {
				sb.append(", overwrite is ");
				sb.append(overwrite);

				_log.info(sb.toString());
			}

			if (resource.isCollection()) {
				return storage.moveCollectionResource(
					webDAVRequest, resource, destination, overwrite);
			}

			return storage.moveSimpleResource(
				webDAVRequest, resource, destination, overwrite);
		}

		return HttpServletResponse.SC_FORBIDDEN;
	}

	private static final Log _log = LogFactoryUtil.getLog(MoveMethodImpl.class);

}