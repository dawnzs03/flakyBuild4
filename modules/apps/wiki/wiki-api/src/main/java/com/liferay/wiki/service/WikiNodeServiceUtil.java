/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.wiki.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.wiki.model.WikiNode;

import java.io.InputStream;

import java.util.List;
import java.util.Map;

/**
 * Provides the remote service utility for WikiNode. This utility wraps
 * <code>com.liferay.wiki.service.impl.WikiNodeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see WikiNodeService
 * @generated
 */
public class WikiNodeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.wiki.service.impl.WikiNodeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @deprecated As of Cavanaugh (7.4.x), replaced by {@link #addNode(String,
	 String, String, ServiceContext)}
	 */
	@Deprecated
	public static WikiNode addNode(
			String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addNode(name, description, serviceContext);
	}

	public static WikiNode addNode(
			String externalReferenceCode, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addNode(
			externalReferenceCode, name, description, serviceContext);
	}

	public static void deleteNode(long nodeId) throws PortalException {
		getService().deleteNode(nodeId);
	}

	public static WikiNode getNode(long nodeId) throws PortalException {
		return getService().getNode(nodeId);
	}

	public static WikiNode getNode(long groupId, String name)
		throws PortalException {

		return getService().getNode(groupId, name);
	}

	public static List<WikiNode> getNodes(long groupId) throws PortalException {
		return getService().getNodes(groupId);
	}

	public static List<WikiNode> getNodes(long groupId, int status)
		throws PortalException {

		return getService().getNodes(groupId, status);
	}

	public static List<WikiNode> getNodes(long groupId, int start, int end) {
		return getService().getNodes(groupId, start, end);
	}

	public static List<WikiNode> getNodes(
		long groupId, int status, int start, int end) {

		return getService().getNodes(groupId, status, start, end);
	}

	public static List<WikiNode> getNodes(
		long groupId, int status, int start, int end,
		OrderByComparator<WikiNode> orderByComparator) {

		return getService().getNodes(
			groupId, status, start, end, orderByComparator);
	}

	public static int getNodesCount(long groupId) {
		return getService().getNodesCount(groupId);
	}

	public static int getNodesCount(long groupId, int status) {
		return getService().getNodesCount(groupId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static WikiNode getWikiNodeByExternalReferenceCode(
			long groupId, String externalReferenceCode)
		throws PortalException {

		return getService().getWikiNodeByExternalReferenceCode(
			groupId, externalReferenceCode);
	}

	public static void importPages(
			long nodeId, InputStream[] inputStreams,
			Map<String, String[]> options)
		throws PortalException {

		getService().importPages(nodeId, inputStreams, options);
	}

	public static WikiNode moveNodeToTrash(long nodeId) throws PortalException {
		return getService().moveNodeToTrash(nodeId);
	}

	public static void restoreNodeFromTrash(long nodeId)
		throws PortalException {

		getService().restoreNodeFromTrash(nodeId);
	}

	public static void subscribeNode(long nodeId) throws PortalException {
		getService().subscribeNode(nodeId);
	}

	public static void unsubscribeNode(long nodeId) throws PortalException {
		getService().unsubscribeNode(nodeId);
	}

	public static WikiNode updateNode(
			long nodeId, String name, String description,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateNode(
			nodeId, name, description, serviceContext);
	}

	public static WikiNodeService getService() {
		return _service;
	}

	public static void setService(WikiNodeService service) {
		_service = service;
	}

	private static volatile WikiNodeService _service;

}