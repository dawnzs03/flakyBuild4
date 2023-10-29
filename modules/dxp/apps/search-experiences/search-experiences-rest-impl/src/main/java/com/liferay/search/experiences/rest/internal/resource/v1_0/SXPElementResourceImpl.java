/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.search.experiences.rest.internal.resource.v1_0;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterRegistry;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.LocalizedMapUtil;
import com.liferay.search.experiences.constants.SXPActionKeys;
import com.liferay.search.experiences.constants.SXPConstants;
import com.liferay.search.experiences.exception.DuplicateSXPElementExternalReferenceCodeException;
import com.liferay.search.experiences.rest.dto.v1_0.ElementDefinition;
import com.liferay.search.experiences.rest.dto.v1_0.FieldSet;
import com.liferay.search.experiences.rest.dto.v1_0.SXPElement;
import com.liferay.search.experiences.rest.dto.v1_0.UiConfiguration;
import com.liferay.search.experiences.rest.dto.v1_0.util.ElementDefinitionUtil;
import com.liferay.search.experiences.rest.dto.v1_0.util.SXPElementUtil;
import com.liferay.search.experiences.rest.internal.odata.entity.v1_0.SXPElementEntityModel;
import com.liferay.search.experiences.rest.internal.resource.v1_0.util.SearchUtil;
import com.liferay.search.experiences.rest.internal.resource.v1_0.util.TitleMapUtil;
import com.liferay.search.experiences.rest.resource.v1_0.SXPElementResource;
import com.liferay.search.experiences.service.SXPElementLocalService;
import com.liferay.search.experiences.service.SXPElementService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	enabled = false,
	properties = "OSGI-INF/liferay/rest/v1_0/sxp-element.properties",
	scope = ServiceScope.PROTOTYPE, service = SXPElementResource.class
)
public class SXPElementResourceImpl extends BaseSXPElementResourceImpl {

	@Override
	public void deleteSXPElement(Long sxpElementId) throws Exception {
		_sxpElementService.deleteSXPElement(sxpElementId);
	}

	@Override
	public EntityModel getEntityModel(MultivaluedMap multivaluedMap) {
		return _entityEntityModel;
	}

	@Override
	public SXPElement getSXPElement(Long sxpElementId) throws Exception {
		return _sxpElementDTOConverter.toDTO(
			new DefaultDTOConverterContext(
				contextAcceptLanguage.isAcceptAllLanguages(), new HashMap<>(),
				_dtoConverterRegistry, contextHttpServletRequest, sxpElementId,
				contextAcceptLanguage.getPreferredLocale(), contextUriInfo,
				contextUser),
			_sxpElementService.getSXPElement(sxpElementId));
	}

	@Override
	public SXPElement getSXPElementByExternalReferenceCode(
			String externalReferenceCode)
		throws Exception {

		com.liferay.search.experiences.model.SXPElement sxpElement =
			_sxpElementService.getSXPElementByExternalReferenceCode(
				externalReferenceCode, contextCompany.getCompanyId());

		return _sxpElementDTOConverter.toDTO(
			new DefaultDTOConverterContext(
				contextAcceptLanguage.isAcceptAllLanguages(), new HashMap<>(),
				_dtoConverterRegistry, contextHttpServletRequest,
				sxpElement.getSXPElementId(),
				contextAcceptLanguage.getPreferredLocale(), contextUriInfo,
				contextUser),
			sxpElement);
	}

	@Override
	public Response getSXPElementExport(Long sxpElementId) throws Exception {
		com.liferay.search.experiences.model.SXPElement sxpElement =
			_sxpElementService.getSXPElement(sxpElementId);

		return Response.ok(
		).encoding(
			"UTF-8"
		).entity(
			JSONUtil.put(
				"description_i18n",
				_jsonFactory.createJSONObject(
					_jsonFactory.looseSerialize(sxpElement.getDescriptionMap()))
			).put(
				"elementDefinition",
				_jsonFactory.createJSONObject(
					sxpElement.getElementDefinitionJSON())
			).put(
				"externalReferenceCode", sxpElement.getExternalReferenceCode()
			).put(
				"schemaVersion", sxpElement.getSchemaVersion()
			).put(
				"title_i18n",
				_jsonFactory.createJSONObject(
					_jsonFactory.looseSerialize(sxpElement.getTitleMap()))
			).put(
				"type", sxpElement.getType()
			)
		).header(
			"Content-Disposition",
			StringBundler.concat(
				"attachment; filename=\"",
				sxpElement.getTitle(
					contextAcceptLanguage.getPreferredLocale(), true),
				".json\"")
		).build();
	}

	@Override
	public Page<SXPElement> getSXPElementsPage(
			String search, Filter filter, Pagination pagination, Sort[] sorts)
		throws Exception {

		if (sorts == null) {
			sorts = new Sort[] {
				new Sort("modified_sortable", Sort.LONG_TYPE, true)
			};
		}

		return SearchUtil.search(
			Collections.emptyMap(),
			booleanQuery -> SearchUtil.processSXPBooleanQuery(
				contextAcceptLanguage, booleanQuery, search),
			filter,
			com.liferay.search.experiences.model.SXPElement.class.getName(),
			search, pagination,
			queryConfig -> queryConfig.setSelectedFieldNames(
				Field.ENTRY_CLASS_PK),
			searchContext -> {
				searchContext.setCompanyId(contextCompany.getCompanyId());

				if (!Validator.isBlank(search)) {
					searchContext.setKeywords("");
				}
			},
			sorts,
			document -> {
				long sxpElementId = GetterUtil.getLong(
					document.get(Field.ENTRY_CLASS_PK));

				SXPElement sxpElement = _sxpElementDTOConverter.toDTO(
					new DefaultDTOConverterContext(
						contextAcceptLanguage.isAcceptAllLanguages(),
						new HashMap<>(), _dtoConverterRegistry,
						contextHttpServletRequest,
						document.get(Field.ENTRY_CLASS_PK),
						contextAcceptLanguage.getPreferredLocale(),
						contextUriInfo, contextUser),
					_sxpElementService.getSXPElement(sxpElementId));

				String permissionName =
					com.liferay.search.experiences.model.SXPElement.class.
						getName();

				sxpElement.setActions(
					HashMapBuilder.put(
						"create",
						() -> addAction(
							SXPActionKeys.ADD_SXP_ELEMENT, "postSXPElement",
							SXPConstants.RESOURCE_NAME,
							contextCompany.getCompanyId())
					).put(
						"delete",
						() -> {
							if (sxpElement.getReadOnly()) {
								return null;
							}

							return addAction(
								ActionKeys.DELETE, "deleteSXPElement",
								permissionName, sxpElementId);
						}
					).put(
						"get",
						() -> addAction(
							ActionKeys.VIEW, "getSXPElement", permissionName,
							sxpElementId)
					).put(
						"update",
						() -> {
							if (sxpElement.getReadOnly()) {
								return null;
							}

							return addAction(
								ActionKeys.UPDATE, "putSXPElement",
								permissionName, sxpElementId);
						}
					).build());

				return sxpElement;
			});
	}

	@Override
	public SXPElement postSXPElement(SXPElement sxpElement) throws Exception {
		return _sxpElementDTOConverter.toDTO(
			new DefaultDTOConverterContext(
				contextAcceptLanguage.isAcceptAllLanguages(), new HashMap<>(),
				_dtoConverterRegistry, contextHttpServletRequest,
				sxpElement.getId(), contextAcceptLanguage.getPreferredLocale(),
				contextUriInfo, contextUser),
			_sxpElementService.addSXPElement(
				sxpElement.getExternalReferenceCode(),
				LocalizedMapUtil.getLocalizedMap(
					contextAcceptLanguage.getPreferredLocale(),
					sxpElement.getDescription(),
					sxpElement.getDescription_i18n()),
				_getElementDefinitionJSON(sxpElement), false,
				_getSchemaVersion(),
				LocalizedMapUtil.getLocalizedMap(
					contextAcceptLanguage.getPreferredLocale(),
					sxpElement.getTitle(), sxpElement.getTitle_i18n()),
				GetterUtil.getInteger(sxpElement.getType()),
				ServiceContextFactory.getInstance(contextHttpServletRequest)));
	}

	@Override
	public SXPElement postSXPElementCopy(Long sxpElementId) throws Exception {
		com.liferay.search.experiences.model.SXPElement sxpElement =
			_sxpElementService.getSXPElement(sxpElementId);

		return _sxpElementDTOConverter.toDTO(
			new DefaultDTOConverterContext(
				contextAcceptLanguage.isAcceptAllLanguages(), new HashMap<>(),
				_dtoConverterRegistry, contextHttpServletRequest,
				sxpElement.getSXPElementId(),
				contextAcceptLanguage.getPreferredLocale(), contextUriInfo,
				contextUser),
			_sxpElementService.addSXPElement(
				null, sxpElement.getDescriptionMap(),
				sxpElement.getElementDefinitionJSON(), false,
				sxpElement.getSchemaVersion(),
				TitleMapUtil.copy(sxpElement.getTitleMap()),
				sxpElement.getType(),
				ServiceContextFactory.getInstance(contextHttpServletRequest)));
	}

	@Override
	public SXPElement postSXPElementPreview(SXPElement sxpElement)
		throws Exception {

		sxpElement.setDescription(
			_getLocalization(sxpElement.getDescription_i18n()));
		sxpElement.setElementDefinition(
			_getLocalizedElementDefinition(sxpElement.getElementDefinition()));
		sxpElement.setTitle(_getLocalization(sxpElement.getTitle_i18n()));

		return sxpElement;
	}

	@Override
	public SXPElement postSXPElementValidate(String json) throws Exception {
		SXPElement sxpElement = SXPElementUtil.toSXPElement(json);

		_validateSXPElementExternalReferenceCode(sxpElement);

		return sxpElement;
	}

	@Override
	public SXPElement putSXPElement(Long sxpElementId, SXPElement sxpElement)
		throws Exception {

		com.liferay.search.experiences.model.SXPElement
			serviceBuilderSXPElement = _sxpElementService.fetchSXPElement(
				sxpElementId);

		return _putSXPElement(serviceBuilderSXPElement, sxpElement);
	}

	@Override
	public SXPElement putSXPElementByExternalReferenceCode(
			String externalReferenceCode, SXPElement sxpElement)
		throws Exception {

		com.liferay.search.experiences.model.SXPElement
			serviceBuilderSXPElement =
				_sxpElementService.fetchSXPElementByExternalReferenceCode(
					externalReferenceCode, contextCompany.getCompanyId());

		sxpElement.setExternalReferenceCode(externalReferenceCode);

		return _putSXPElement(serviceBuilderSXPElement, sxpElement);
	}

	private String _getElementDefinitionJSON(SXPElement sxpElement) {
		if (sxpElement.getElementDefinition() == null) {
			return null;
		}

		return String.valueOf(
			ElementDefinitionUtil.unpack(sxpElement.getElementDefinition()));
	}

	private String _getLocalization(Map<String, String> localizationMap) {
		return _language.get(
			contextHttpServletRequest,
			localizationMap.get(
				contextAcceptLanguage.getPreferredLanguageId()));
	}

	private ElementDefinition _getLocalizedElementDefinition(
		ElementDefinition elementDefinition) {

		try {
			UiConfiguration uiConfiguration =
				elementDefinition.getUiConfiguration();

			if (uiConfiguration == null) {
				return elementDefinition;
			}

			FieldSet[] fieldSets = uiConfiguration.getFieldSets();

			if (fieldSets == null) {
				return elementDefinition;
			}

			for (FieldSet fieldSet : fieldSets) {
				com.liferay.search.experiences.rest.dto.v1_0.Field[] fields =
					fieldSet.getFields();

				for (com.liferay.search.experiences.rest.dto.v1_0.Field field :
						fields) {

					if (!Validator.isBlank(field.getHelpText())) {
						field.setHelpTextLocalized(
							_language.get(
								contextHttpServletRequest,
								field.getHelpText()));
					}

					if (!Validator.isBlank(field.getLabel())) {
						field.setLabelLocalized(
							_language.get(
								contextHttpServletRequest, field.getLabel()));
					}
				}
			}

			return elementDefinition;
		}
		catch (Exception exception) {
			if (_log.isWarnEnabled()) {
				_log.warn(exception);
			}

			return null;
		}
	}

	private String _getSchemaVersion() {
		return "1.0";
	}

	private SXPElement _putSXPElement(
			com.liferay.search.experiences.model.SXPElement
				serviceBuilderSXPElement,
			SXPElement sxpElement)
		throws Exception {

		if (serviceBuilderSXPElement == null) {
			return postSXPElement(sxpElement);
		}

		if (!serviceBuilderSXPElement.getReadOnly()) {
			return _updateSXPElement(
				serviceBuilderSXPElement.getSXPElementId(), sxpElement);
		}

		return getSXPElement(serviceBuilderSXPElement.getSXPElementId());
	}

	private SXPElement _updateSXPElement(
			Long sxpElementId, SXPElement sxpElement)
		throws Exception {

		return _sxpElementDTOConverter.toDTO(
			new DefaultDTOConverterContext(
				contextAcceptLanguage.isAcceptAllLanguages(), new HashMap<>(),
				_dtoConverterRegistry, contextHttpServletRequest,
				sxpElement.getId(), contextAcceptLanguage.getPreferredLocale(),
				contextUriInfo, contextUser),
			_sxpElementService.updateSXPElement(
				sxpElementId,
				LocalizedMapUtil.getLocalizedMap(
					contextAcceptLanguage.getPreferredLocale(),
					sxpElement.getDescription(),
					sxpElement.getDescription_i18n()),
				_getElementDefinitionJSON(sxpElement), _getSchemaVersion(),
				GetterUtil.getBoolean(sxpElement.getHidden()),
				LocalizedMapUtil.getLocalizedMap(
					contextAcceptLanguage.getPreferredLocale(),
					sxpElement.getTitle(), sxpElement.getTitle_i18n()),
				ServiceContextFactory.getInstance(contextHttpServletRequest)));
	}

	private void _validateSXPElementExternalReferenceCode(SXPElement sxpElement)
		throws Exception {

		if (Validator.isBlank(sxpElement.getExternalReferenceCode())) {
			return;
		}

		com.liferay.search.experiences.model.SXPElement
			serviceBuilderSXPElement =
				_sxpElementLocalService.fetchSXPElementByExternalReferenceCode(
					sxpElement.getExternalReferenceCode(),
					contextCompany.getCompanyId());

		if ((serviceBuilderSXPElement != null) &&
			!Objects.equals(
				serviceBuilderSXPElement.getSXPElementId(),
				sxpElement.getId())) {

			throw new DuplicateSXPElementExternalReferenceCodeException();
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SXPElementResourceImpl.class);

	@Reference
	private DTOConverterRegistry _dtoConverterRegistry;

	private final SXPElementEntityModel _entityEntityModel =
		new SXPElementEntityModel();

	@Reference
	private JSONFactory _jsonFactory;

	@Reference
	private Language _language;

	@Reference(
		target = "(component.name=com.liferay.search.experiences.rest.internal.dto.v1_0.converter.SXPElementDTOConverter)"
	)
	private DTOConverter
		<com.liferay.search.experiences.model.SXPElement, SXPElement>
			_sxpElementDTOConverter;

	@Reference
	private SXPElementLocalService _sxpElementLocalService;

	@Reference
	private SXPElementService _sxpElementService;

}