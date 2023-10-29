/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.headless.admin.user.resource.v1_0;

import com.liferay.headless.admin.user.dto.v1_0.AccountGroup;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourceActionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.odata.filter.ExpressionConvert;
import com.liferay.portal.odata.filter.FilterParserProvider;
import com.liferay.portal.odata.sort.SortParserProvider;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineExportTaskResource;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-admin-user/v1.0
 *
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@ProviderType
public interface AccountGroupResource {

	public Page<AccountGroup> getAccountGroupsPage(
			String search, Filter filter, Pagination pagination, Sort[] sorts)
		throws Exception;

	public Response postAccountGroupsPageExportBatch(
			String search, Filter filter, Sort[] sorts, String callbackURL,
			String contentType, String fieldNames)
		throws Exception;

	public AccountGroup postAccountGroup(AccountGroup accountGroup)
		throws Exception;

	public Response postAccountGroupBatch(String callbackURL, Object object)
		throws Exception;

	public void
			deleteAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(
				String accountExternalReferenceCode,
				String externalReferenceCode)
		throws Exception;

	public void
			postAccountGroupByExternalReferenceCodeAccountByExternalReferenceCode(
				String accountExternalReferenceCode,
				String externalReferenceCode)
		throws Exception;

	public void deleteAccountGroupByExternalReferenceCode(
			String externalReferenceCode)
		throws Exception;

	public AccountGroup getAccountGroupByExternalReferenceCode(
			String externalReferenceCode)
		throws Exception;

	public AccountGroup patchAccountGroupByExternalReferenceCode(
			String externalReferenceCode, AccountGroup accountGroup)
		throws Exception;

	public AccountGroup putAccountGroupByExternalReferenceCode(
			String externalReferenceCode, AccountGroup accountGroup)
		throws Exception;

	public void deleteAccountGroup(Long accountGroupId) throws Exception;

	public Response deleteAccountGroupBatch(String callbackURL, Object object)
		throws Exception;

	public AccountGroup getAccountGroup(Long accountGroupId) throws Exception;

	public AccountGroup patchAccountGroup(
			Long accountGroupId, AccountGroup accountGroup)
		throws Exception;

	public AccountGroup putAccountGroup(
			Long accountGroupId, AccountGroup accountGroup)
		throws Exception;

	public Response putAccountGroupBatch(String callbackURL, Object object)
		throws Exception;

	public Page<AccountGroup>
			getAccountByExternalReferenceCodeAccountExternalReferenceCodeAccountGroupsPage(
				String accountExternalReferenceCode, Pagination pagination)
		throws Exception;

	public Page<AccountGroup> getAccountAccountGroupsPage(
			Long accountId, Pagination pagination)
		throws Exception;

	public Response postAccountAccountGroupsPageExportBatch(
			Long accountId, String callbackURL, String contentType,
			String fieldNames)
		throws Exception;

	public default void setContextAcceptLanguage(
		AcceptLanguage contextAcceptLanguage) {
	}

	public void setContextCompany(
		com.liferay.portal.kernel.model.Company contextCompany);

	public default void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {
	}

	public default void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {
	}

	public default void setContextUriInfo(UriInfo contextUriInfo) {
	}

	public void setContextUser(
		com.liferay.portal.kernel.model.User contextUser);

	public void setExpressionConvert(
		ExpressionConvert<Filter> expressionConvert);

	public void setFilterParserProvider(
		FilterParserProvider filterParserProvider);

	public void setGroupLocalService(GroupLocalService groupLocalService);

	public void setResourceActionLocalService(
		ResourceActionLocalService resourceActionLocalService);

	public void setResourcePermissionLocalService(
		ResourcePermissionLocalService resourcePermissionLocalService);

	public void setRoleLocalService(RoleLocalService roleLocalService);

	public void setSortParserProvider(SortParserProvider sortParserProvider);

	public void setVulcanBatchEngineExportTaskResource(
		VulcanBatchEngineExportTaskResource
			vulcanBatchEngineExportTaskResource);

	public void setVulcanBatchEngineImportTaskResource(
		VulcanBatchEngineImportTaskResource
			vulcanBatchEngineImportTaskResource);

	public default Filter toFilter(String filterString) {
		return toFilter(
			filterString, Collections.<String, List<String>>emptyMap());
	}

	public default Filter toFilter(
		String filterString, Map<String, List<String>> multivaluedMap) {

		return null;
	}

	public default Sort[] toSorts(String sortsString) {
		return new Sort[0];
	}

	@ProviderType
	public interface Builder {

		public AccountGroupResource build();

		public Builder checkPermissions(boolean checkPermissions);

		public Builder httpServletRequest(
			HttpServletRequest httpServletRequest);

		public Builder httpServletResponse(
			HttpServletResponse httpServletResponse);

		public Builder preferredLocale(Locale preferredLocale);

		public Builder uriInfo(UriInfo uriInfo);

		public Builder user(com.liferay.portal.kernel.model.User user);

	}

	@ProviderType
	public interface Factory {

		public Builder create();

	}

}