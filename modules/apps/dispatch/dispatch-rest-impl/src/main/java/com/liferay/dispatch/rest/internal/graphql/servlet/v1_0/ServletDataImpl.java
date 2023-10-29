/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dispatch.rest.internal.graphql.servlet.v1_0;

import com.liferay.dispatch.rest.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.dispatch.rest.internal.graphql.query.v1_0.Query;
import com.liferay.dispatch.rest.internal.resource.v1_0.DispatchTriggerResourceImpl;
import com.liferay.dispatch.rest.resource.v1_0.DispatchTriggerResource;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Nilton Vieira
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setDispatchTriggerResourceComponentServiceObjects(
			_dispatchTriggerResourceComponentServiceObjects);

		Query.setDispatchTriggerResourceComponentServiceObjects(
			_dispatchTriggerResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "Liferay.Dispatch.REST";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/dispatch-rest-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#createDispatchTriggersPageExportBatch",
						new ObjectValuePair<>(
							DispatchTriggerResourceImpl.class,
							"postDispatchTriggersPageExportBatch"));
					put(
						"mutation#createDispatchTrigger",
						new ObjectValuePair<>(
							DispatchTriggerResourceImpl.class,
							"postDispatchTrigger"));
					put(
						"mutation#createDispatchTriggerBatch",
						new ObjectValuePair<>(
							DispatchTriggerResourceImpl.class,
							"postDispatchTriggerBatch"));
					put(
						"mutation#createDispatchTriggerRun",
						new ObjectValuePair<>(
							DispatchTriggerResourceImpl.class,
							"postDispatchTriggerRun"));

					put(
						"query#dispatchTriggers",
						new ObjectValuePair<>(
							DispatchTriggerResourceImpl.class,
							"getDispatchTriggersPage"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<DispatchTriggerResource>
		_dispatchTriggerResourceComponentServiceObjects;

}