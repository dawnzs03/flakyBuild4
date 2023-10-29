/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.vulcan.internal.graphql.data.processor;

import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.filter.ExpressionConvert;
import com.liferay.portal.odata.filter.FilterParserProvider;
import com.liferay.portal.odata.sort.SortParserProvider;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.aggregation.Aggregation;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;
import com.liferay.portal.vulcan.graphql.dto.GraphQLDTOContributor;
import com.liferay.portal.vulcan.graphql.dto.GraphQLDTOProperty;
import com.liferay.portal.vulcan.internal.accept.language.AcceptLanguageImpl;
import com.liferay.portal.vulcan.internal.jaxrs.context.provider.AggregationContextProvider;
import com.liferay.portal.vulcan.internal.jaxrs.context.provider.FilterContextProvider;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SortUtil;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Correa
 */
@Component(service = GraphQLDTOContributorDataFetchingProcessor.class)
public class GraphQLDTOContributorDataFetchingProcessor {

	public Object create(
			Object dto, GraphQLDTOContributor graphQLDTOContributor,
			HttpServletRequest httpServletRequest, String scopeKey)
		throws Exception {

		return graphQLDTOContributor.createDTO(
			dto,
			_getDTOConverterContext(
				httpServletRequest,
				HashMapBuilder.<String, Serializable>put(
					"scopeKey", scopeKey
				).build()));
	}

	public boolean delete(GraphQLDTOContributor graphQLDTOContributor, long id)
		throws Exception {

		return graphQLDTOContributor.deleteDTO(id);
	}

	public Object get(
			GraphQLDTOContributor graphQLDTOContributor,
			HttpServletRequest httpServletRequest, long id)
		throws Exception {

		return graphQLDTOContributor.getDTO(
			_getDTOConverterContext(httpServletRequest, null), id);
	}

	public Object getRelationship(
			GraphQLDTOContributor graphQLDTOContributor,
			GraphQLDTOProperty graphQLDTOProperty,
			HttpServletRequest httpServletRequest, long id)
		throws Exception {

		return graphQLDTOContributor.getRelationshipValue(
			_getDTOConverterContext(httpServletRequest, null), id,
			graphQLDTOProperty.getTypeClass(), graphQLDTOProperty.getName());
	}

	public Page<Object> list(
			List<String> aggregations, String filterString,
			GraphQLDTOContributor graphQLDTOContributor,
			HttpServletRequest httpServletRequest, int page, int pageSize,
			String scopeKey, String search, String sortsString)
		throws Exception {

		Aggregation aggregation = null;

		AcceptLanguage acceptLanguage = new AcceptLanguageImpl(
			httpServletRequest, _language, _portal);

		if (aggregations != null) {
			aggregation = _getAggregation(
				acceptLanguage, aggregations,
				graphQLDTOContributor.getEntityModel());
		}

		return graphQLDTOContributor.getDTOs(
			aggregation,
			_getDTOConverterContext(
				httpServletRequest,
				HashMapBuilder.<String, Serializable>put(
					"companyId", CompanyThreadLocal.getCompanyId()
				).put(
					"filter", filterString
				).put(
					"scopeKey", scopeKey
				).build()),
			_getFilter(
				acceptLanguage, graphQLDTOContributor.getEntityModel(),
				filterString),
			Pagination.of(page, pageSize), search,
			SortUtil.getSorts(
				acceptLanguage, graphQLDTOContributor.getEntityModel(),
				_sortParserProvider.provide(
					graphQLDTOContributor.getEntityModel()),
				sortsString));
	}

	public Object update(
			Object dto, GraphQLDTOContributor graphQLDTOContributor,
			HttpServletRequest httpServletRequest, long id)
		throws Exception {

		return graphQLDTOContributor.updateDTO(
			dto, _getDTOConverterContext(httpServletRequest, null), id);
	}

	private Aggregation _getAggregation(
		AcceptLanguage acceptLanguage, List<String> aggregationStrings,
		EntityModel entityModel) {

		if (aggregationStrings == null) {
			return null;
		}

		AggregationContextProvider aggregationContextProvider =
			new AggregationContextProvider(_language, _portal);

		return aggregationContextProvider.createContext(
			acceptLanguage, aggregationStrings.toArray(new String[0]),
			entityModel);
	}

	private DTOConverterContext _getDTOConverterContext(
			HttpServletRequest httpServletRequest,
			Map<String, Serializable> attributes)
		throws Exception {

		AcceptLanguage acceptLanguage = new AcceptLanguageImpl(
			httpServletRequest, _language, _portal);

		DefaultDTOConverterContext defaultDTOConverterContext =
			new DefaultDTOConverterContext(
				acceptLanguage.isAcceptAllLanguages(), null,
				_dtoConverterRegistry, null,
				acceptLanguage.getPreferredLocale(), null,
				_portal.getUser(httpServletRequest));

		if (attributes != null) {
			defaultDTOConverterContext.setAttributes(attributes);
		}

		return defaultDTOConverterContext;
	}

	private Filter _getFilter(
			AcceptLanguage acceptLanguage, EntityModel entityModel,
			String filterString)
		throws Exception {

		FilterContextProvider filterContextProvider = new FilterContextProvider(
			_expressionConvert, _filterParserProvider, _language, _portal);

		return filterContextProvider.createContext(
			acceptLanguage, entityModel, filterString);
	}

	@Reference
	private DTOConverterRegistry _dtoConverterRegistry;

	@Reference(
		target = "(result.class.name=com.liferay.portal.kernel.search.filter.Filter)"
	)
	private ExpressionConvert<Filter> _expressionConvert;

	@Reference
	private FilterParserProvider _filterParserProvider;

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

	@Reference
	private SortParserProvider _sortParserProvider;

}