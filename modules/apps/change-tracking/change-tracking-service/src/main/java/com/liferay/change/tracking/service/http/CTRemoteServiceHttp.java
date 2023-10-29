/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.change.tracking.service.http;

import com.liferay.change.tracking.service.CTRemoteServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>CTRemoteServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CTRemoteServiceHttp {

	public static com.liferay.change.tracking.model.CTRemote addCTRemote(
			HttpPrincipal httpPrincipal, String name, String description,
			String url, String clientId, String clientSecret)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "addCTRemote",
				_addCTRemoteParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, name, description, url, clientId, clientSecret);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.change.tracking.model.CTRemote)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.change.tracking.model.CTRemote deleteCTRemote(
			HttpPrincipal httpPrincipal,
			com.liferay.change.tracking.model.CTRemote ctRemote)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "deleteCTRemote",
				_deleteCTRemoteParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, ctRemote);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.change.tracking.model.CTRemote)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.change.tracking.model.CTRemote deleteCTRemote(
			HttpPrincipal httpPrincipal, long ctRemoteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "deleteCTRemote",
				_deleteCTRemoteParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, ctRemoteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.change.tracking.model.CTRemote)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.change.tracking.model.CTRemote>
		getCTRemotes(
			HttpPrincipal httpPrincipal, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.change.tracking.model.CTRemote>
					orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "getCTRemotes",
				_getCTRemotesParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, keywords, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.change.tracking.model.CTRemote>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getCTRemotesCount(
		HttpPrincipal httpPrincipal, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "getCTRemotesCount",
				_getCTRemotesCountParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, keywords);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.change.tracking.model.CTRemote updateCTRemote(
			HttpPrincipal httpPrincipal, long ctRemoteId, String name,
			String description, String url, String clientId,
			String clientSecret)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CTRemoteServiceUtil.class, "updateCTRemote",
				_updateCTRemoteParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, ctRemoteId, name, description, url, clientId,
				clientSecret);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.change.tracking.model.CTRemote)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CTRemoteServiceHttp.class);

	private static final Class<?>[] _addCTRemoteParameterTypes0 = new Class[] {
		String.class, String.class, String.class, String.class, String.class
	};
	private static final Class<?>[] _deleteCTRemoteParameterTypes1 =
		new Class[] {com.liferay.change.tracking.model.CTRemote.class};
	private static final Class<?>[] _deleteCTRemoteParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getCTRemotesParameterTypes3 = new Class[] {
		String.class, int.class, int.class,
		com.liferay.portal.kernel.util.OrderByComparator.class
	};
	private static final Class<?>[] _getCTRemotesCountParameterTypes4 =
		new Class[] {String.class};
	private static final Class<?>[] _updateCTRemoteParameterTypes5 =
		new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			String.class
		};

}