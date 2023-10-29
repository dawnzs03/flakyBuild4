/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.object.web.internal.object.entries.display.context;

import com.liferay.dynamic.data.mapping.expression.CreateExpressionRequest;
import com.liferay.dynamic.data.mapping.expression.DDMExpression;
import com.liferay.dynamic.data.mapping.expression.DDMExpressionException;
import com.liferay.dynamic.data.mapping.expression.DDMExpressionFactory;
import com.liferay.dynamic.data.mapping.form.field.type.constants.DDMFormFieldTypeConstants;
import com.liferay.dynamic.data.mapping.form.renderer.DDMFormRenderer;
import com.liferay.dynamic.data.mapping.form.renderer.DDMFormRenderingContext;
import com.liferay.dynamic.data.mapping.model.DDMForm;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormFieldValidation;
import com.liferay.dynamic.data.mapping.model.DDMFormFieldValidationExpression;
import com.liferay.dynamic.data.mapping.model.DDMFormLayout;
import com.liferay.dynamic.data.mapping.model.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.model.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.model.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.model.LocalizedValue;
import com.liferay.dynamic.data.mapping.model.UnlocalizedValue;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.dynamic.data.mapping.util.NumericDDMFormFieldUtil;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.CreationMenu;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItem;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemBuilder;
import com.liferay.headless.delivery.dto.v1_0.Creator;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.InfoItemItemSelectorReturnType;
import com.liferay.item.selector.criteria.info.item.criterion.InfoItemItemSelectorCriterion;
import com.liferay.object.constants.ObjectActionKeys;
import com.liferay.object.constants.ObjectDefinitionConstants;
import com.liferay.object.constants.ObjectFieldConstants;
import com.liferay.object.constants.ObjectFieldSettingConstants;
import com.liferay.object.constants.ObjectRelationshipConstants;
import com.liferay.object.constants.ObjectWebKeys;
import com.liferay.object.display.context.ObjectEntryDisplayContext;
import com.liferay.object.dynamic.data.mapping.expression.ObjectEntryDDMExpressionFieldAccessor;
import com.liferay.object.exception.NoSuchObjectLayoutException;
import com.liferay.object.exception.NoSuchObjectRelationshipException;
import com.liferay.object.field.business.type.ObjectFieldBusinessType;
import com.liferay.object.field.business.type.ObjectFieldBusinessTypeRegistry;
import com.liferay.object.field.render.ObjectFieldRenderingContext;
import com.liferay.object.field.setting.util.ObjectFieldSettingUtil;
import com.liferay.object.model.ObjectDefinition;
import com.liferay.object.model.ObjectField;
import com.liferay.object.model.ObjectLayout;
import com.liferay.object.model.ObjectLayoutBox;
import com.liferay.object.model.ObjectLayoutColumn;
import com.liferay.object.model.ObjectLayoutRow;
import com.liferay.object.model.ObjectLayoutTab;
import com.liferay.object.model.ObjectRelationship;
import com.liferay.object.rest.dto.v1_0.FileEntry;
import com.liferay.object.rest.dto.v1_0.ListEntry;
import com.liferay.object.rest.dto.v1_0.ObjectEntry;
import com.liferay.object.rest.dto.v1_0.Status;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManager;
import com.liferay.object.rest.manager.v1_0.ObjectEntryManagerRegistry;
import com.liferay.object.scope.ObjectScopeProvider;
import com.liferay.object.scope.ObjectScopeProviderRegistry;
import com.liferay.object.service.ObjectDefinitionLocalService;
import com.liferay.object.service.ObjectEntryLocalService;
import com.liferay.object.service.ObjectEntryService;
import com.liferay.object.service.ObjectEntryServiceUtil;
import com.liferay.object.service.ObjectFieldLocalService;
import com.liferay.object.service.ObjectFieldSettingLocalServiceUtil;
import com.liferay.object.service.ObjectLayoutLocalService;
import com.liferay.object.service.ObjectRelationshipLocalService;
import com.liferay.object.web.internal.display.context.helper.ObjectRequestHelper;
import com.liferay.object.web.internal.security.permission.resource.util.ObjectDefinitionResourcePermissionUtil;
import com.liferay.object.web.internal.util.ObjectEntryUtil;
import com.liferay.petra.function.transform.TransformUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.feature.flag.FeatureFlagManagerUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.url.builder.PortletURLBuilder;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import com.liferay.portal.vulcan.dto.converter.DefaultDTOConverterContext;
import com.liferay.taglib.servlet.PipingServletResponseFactory;

import java.sql.Timestamp;

import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.portlet.PortletRequest;
import javax.portlet.WindowState;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

/**
 * @author Marco Leo
 */
public class ObjectEntryDisplayContextImpl
	implements ObjectEntryDisplayContext {

	public ObjectEntryDisplayContextImpl(
		DDMExpressionFactory ddmExpressionFactory,
		DDMFormRenderer ddmFormRenderer, HttpServletRequest httpServletRequest,
		ItemSelector itemSelector,
		ObjectDefinitionLocalService objectDefinitionLocalService,
		ObjectEntryManagerRegistry objectEntryManagerRegistry,
		ObjectEntryLocalService objectEntryLocalService,
		ObjectEntryService objectEntryService,
		ObjectFieldBusinessTypeRegistry objectFieldBusinessTypeRegistry,
		ObjectFieldLocalService objectFieldLocalService,
		ObjectLayoutLocalService objectLayoutLocalService,
		ObjectRelationshipLocalService objectRelationshipLocalService,
		ObjectScopeProviderRegistry objectScopeProviderRegistry) {

		_ddmExpressionFactory = ddmExpressionFactory;
		_ddmFormRenderer = ddmFormRenderer;
		_itemSelector = itemSelector;
		_objectDefinitionLocalService = objectDefinitionLocalService;
		_objectEntryManagerRegistry = objectEntryManagerRegistry;
		_objectEntryLocalService = objectEntryLocalService;
		_objectEntryService = objectEntryService;
		_objectFieldBusinessTypeRegistry = objectFieldBusinessTypeRegistry;
		_objectFieldLocalService = objectFieldLocalService;
		_objectLayoutLocalService = objectLayoutLocalService;
		_objectRelationshipLocalService = objectRelationshipLocalService;
		_objectScopeProviderRegistry = objectScopeProviderRegistry;

		_objectRequestHelper = new ObjectRequestHelper(httpServletRequest);
		_readOnly = (Boolean)httpServletRequest.getAttribute(
			ObjectWebKeys.OBJECT_ENTRY_READ_ONLY);
		_themeDisplay = (ThemeDisplay)httpServletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
	}

	@Override
	public ObjectDefinition getObjectDefinition1() {
		HttpServletRequest httpServletRequest =
			_objectRequestHelper.getRequest();

		return (ObjectDefinition)httpServletRequest.getAttribute(
			ObjectWebKeys.OBJECT_DEFINITION);
	}

	@Override
	public ObjectDefinition getObjectDefinition2() throws PortalException {
		ObjectRelationship objectRelationship = getObjectRelationship();

		if (objectRelationship == null) {
			throw new NoSuchObjectRelationshipException();
		}

		return _objectDefinitionLocalService.getObjectDefinition(
			objectRelationship.getObjectDefinitionId2());
	}

	@Override
	public com.liferay.object.model.ObjectEntry getObjectEntry()
		throws PortalException {

		return _toServiceBuilderObjectEntry(_getObjectEntry());
	}

	@Override
	public ObjectLayout getObjectLayout() throws PortalException {
		ObjectDefinition objectDefinition = getObjectDefinition1();

		try {
			return _objectLayoutLocalService.getDefaultObjectLayout(
				objectDefinition.getObjectDefinitionId());
		}
		catch (NoSuchObjectLayoutException noSuchObjectLayoutException) {
			if (_log.isDebugEnabled()) {
				_log.debug(noSuchObjectLayoutException);
			}

			return null;
		}
	}

	@Override
	public ObjectLayoutBox getObjectLayoutBox(String type)
		throws PortalException {

		ObjectDefinition objectDefinition = getObjectDefinition1();

		if (!StringUtil.equals(
				objectDefinition.getStorageType(),
				ObjectDefinitionConstants.STORAGE_TYPE_DEFAULT)) {

			return null;
		}

		ObjectLayoutTab objectLayoutTab = getObjectLayoutTab();

		if (objectLayoutTab == null) {
			return null;
		}

		for (ObjectLayoutBox objectLayoutBox :
				objectLayoutTab.getObjectLayoutBoxes()) {

			if (StringUtil.equals(objectLayoutBox.getType(), type)) {
				return objectLayoutBox;
			}
		}

		return null;
	}

	@Override
	public ObjectLayoutTab getObjectLayoutTab() throws PortalException {
		ObjectLayout objectLayout = getObjectLayout();

		if (objectLayout == null) {
			return null;
		}

		List<ObjectLayoutTab> objectLayoutTabs =
			objectLayout.getObjectLayoutTabs();

		long objectLayoutTabId = ParamUtil.getLong(
			_objectRequestHelper.getRequest(), "screenNavigationCategoryKey");

		if (objectLayoutTabId == 0) {
			return objectLayoutTabs.get(0);
		}

		for (ObjectLayoutTab objectLayoutTab : objectLayoutTabs) {
			if (objectLayoutTab.getObjectLayoutTabId() == objectLayoutTabId) {
				return objectLayoutTab;
			}
		}

		return objectLayoutTabs.get(0);
	}

	@Override
	public ObjectRelationship getObjectRelationship() throws PortalException {
		ObjectLayoutTab objectLayoutTab = getObjectLayoutTab();

		if (objectLayoutTab != null) {
			return _objectRelationshipLocalService.fetchObjectRelationship(
				objectLayoutTab.getObjectRelationshipId());
		}

		return _objectRelationshipLocalService.fetchObjectRelationship(
			ParamUtil.getLong(
				_objectRequestHelper.getRequest(),
				"screenNavigationCategoryKey"));
	}

	@Override
	public String getObjectRelationshipERCObjectFieldName() {
		HttpServletRequest httpServletRequest =
			_objectRequestHelper.getRequest();

		return httpServletRequest.getParameter(
			ObjectFieldSettingConstants.
				NAME_OBJECT_RELATIONSHIP_ERC_OBJECT_FIELD_NAME);
	}

	@Override
	public String getParentObjectEntryId() {
		HttpServletRequest httpServletRequest =
			_objectRequestHelper.getRequest();

		return httpServletRequest.getParameter("parentObjectEntryERC");
	}

	@Override
	public CreationMenu getRelatedModelCreationMenu(
			ObjectRelationship objectRelationship)
		throws PortalException {

		if (_readOnly || isGuestUser()) {
			return null;
		}

		CreationMenu creationMenu = new CreationMenu();

		ObjectDefinition objectDefinition2 =
			_objectDefinitionLocalService.getObjectDefinition(
				objectRelationship.getObjectDefinitionId2());

		if ((getObjectLayoutTab() == null) && objectRelationship.isEdge()) {
			creationMenu.addDropdownItem(
				_getCreateNewRelatedModelDropdownItem(
					objectDefinition2, objectRelationship));

			return creationMenu;
		}

		ObjectDefinition objectDefinition1 = getObjectDefinition1();

		ObjectScopeProvider objectScopeProvider =
			_objectScopeProviderRegistry.getObjectScopeProvider(
				objectDefinition2.getScope());

		if (!objectDefinition1.isUnmodifiableSystemObject() &&
			!objectDefinition2.isUnmodifiableSystemObject() &&
			ObjectEntryServiceUtil.hasPortletResourcePermission(
				objectScopeProvider.getGroupId(
					_objectRequestHelper.getRequest()),
				objectDefinition2.getObjectDefinitionId(),
				ObjectActionKeys.ADD_OBJECT_ENTRY) &&
			!(StringUtil.equals(
				objectDefinition1.getScope(),
				ObjectDefinitionConstants.SCOPE_COMPANY) &&
			  StringUtil.equals(
				  objectDefinition2.getScope(),
				  ObjectDefinitionConstants.SCOPE_SITE)) &&
			StringUtil.equals(
				objectRelationship.getType(),
				ObjectRelationshipConstants.TYPE_ONE_TO_MANY)) {

			creationMenu.addDropdownItem(
				_getCreateNewRelatedModelDropdownItem(
					objectDefinition2, objectRelationship));
		}

		if (objectRelationship.isEdge()) {
			return creationMenu;
		}

		LiferayPortletResponse liferayPortletResponse =
			_objectRequestHelper.getLiferayPortletResponse();

		creationMenu.addDropdownItem(
			dropdownItem -> {
				dropdownItem.setHref(
					liferayPortletResponse.getNamespace() +
						"selectRelatedModel");
				dropdownItem.setLabel(
					LanguageUtil.get(
						_objectRequestHelper.getRequest(),
						"select-existing-one"));
				dropdownItem.setTarget("event");
			});

		return creationMenu;
	}

	@Override
	public String getRelatedObjectEntryItemSelectorURL(
			ObjectRelationship objectRelationship)
		throws PortalException {

		if (objectRelationship == null) {
			return StringPool.BLANK;
		}

		RequestBackedPortletURLFactory requestBackedPortletURLFactory =
			RequestBackedPortletURLFactoryUtil.create(
				_objectRequestHelper.getRequest());

		LiferayPortletResponse liferayPortletResponse =
			_objectRequestHelper.getLiferayPortletResponse();

		InfoItemItemSelectorCriterion infoItemItemSelectorCriterion =
			new InfoItemItemSelectorCriterion();

		infoItemItemSelectorCriterion.setDesiredItemSelectorReturnTypes(
			Collections.<ItemSelectorReturnType>singletonList(
				new InfoItemItemSelectorReturnType()));

		ObjectDefinition objectDefinition2 =
			_objectDefinitionLocalService.getObjectDefinition(
				objectRelationship.getObjectDefinitionId2());

		infoItemItemSelectorCriterion.setItemType(
			objectDefinition2.getClassName());

		return PortletURLBuilder.create(
			_itemSelector.getItemSelectorURL(
				requestBackedPortletURLFactory,
				liferayPortletResponse.getNamespace() +
					"selectRelatedModalEntry",
				infoItemItemSelectorCriterion)
		).setParameter(
			"groupId", _getGroupId()
		).setParameter(
			"objectDefinitionId",
			() -> {
				ObjectDefinition objectDefinition1 =
					_objectDefinitionLocalService.getObjectDefinition(
						objectRelationship.getObjectDefinitionId1());

				return objectDefinition1.getObjectDefinitionId();
			}
		).setParameter(
			"objectEntryId",
			() -> {
				ObjectEntry objectEntry = _getObjectEntry();

				return GetterUtil.getLong(objectEntry.getId());
			}
		).setParameter(
			"objectRelationshipId", objectRelationship.getObjectRelationshipId()
		).setParameter(
			"objectRelationshipType", objectRelationship.getType()
		).buildString();
	}

	@Override
	public Map<String, String> getRelationshipContextParams()
		throws PortalException {

		return HashMapBuilder.put(
			"objectEntryId", String.valueOf(_objectEntry.getId())
		).put(
			"objectRelationshipId",
			() -> {
				ObjectRelationship objectRelationship = getObjectRelationship();

				if (objectRelationship == null) {
					return null;
				}

				return String.valueOf(
					objectRelationship.getObjectRelationshipId());
			}
		).put(
			"readOnly", String.valueOf(_readOnly || isGuestUser())
		).build();
	}

	@Override
	public boolean isGuestUser() {
		PermissionChecker permissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		if (permissionChecker == null) {
			return true;
		}

		User user = permissionChecker.getUser();

		return user.isGuestUser();
	}

	@Override
	public boolean isReadOnly() {
		if (_readOnly) {
			return true;
		}

		try {
			ObjectEntry objectEntry = _getObjectEntry();

			if (objectEntry == null) {
				return false;
			}

			return !ObjectDefinitionResourcePermissionUtil.
				hasModelResourcePermission(
					getObjectDefinition1(), objectEntry, _objectEntryService,
					ActionKeys.UPDATE);
		}
		catch (PortalException portalException) {
			if (_log.isDebugEnabled()) {
				_log.debug(portalException);
			}
		}

		return false;
	}

	@Override
	public boolean isShowObjectEntryForm() throws PortalException {
		if ((getObjectEntry() == null) || (getObjectLayoutTab() == null)) {
			return true;
		}

		HttpServletRequest httpServletRequest =
			_objectRequestHelper.getRequest();

		return GetterUtil.getBoolean(
			httpServletRequest.getAttribute(
				ObjectWebKeys.REGULAR_OBJECT_LAYOUT_TAB));
	}

	@Override
	public String renderDDMForm(PageContext pageContext)
		throws PortalException {

		ObjectEntry objectEntry = _getObjectEntry();
		ObjectLayoutTab objectLayoutTab = getObjectLayoutTab();

		DDMForm ddmForm = _getDDMForm(objectEntry, objectLayoutTab);

		DDMFormRenderingContext ddmFormRenderingContext =
			new DDMFormRenderingContext();

		ddmFormRenderingContext.setContainerId("editObjectEntry");

		if (objectEntry != null) {
			ddmFormRenderingContext.addProperty(
				"objectEntryId", objectEntry.getId());

			DDMFormValues ddmFormValues = _getDDMFormValues(
				ddmForm, objectEntry);

			if (ddmFormValues != null) {
				ddmFormRenderingContext.setDDMFormValues(ddmFormValues);
			}
		}

		ddmFormRenderingContext.setGroupId(_getGroupId());
		ddmFormRenderingContext.setHttpServletRequest(
			_objectRequestHelper.getRequest());
		ddmFormRenderingContext.setHttpServletResponse(
			PipingServletResponseFactory.createPipingServletResponse(
				pageContext));
		ddmFormRenderingContext.setLocale(_objectRequestHelper.getLocale());

		LiferayPortletResponse liferayPortletResponse =
			_objectRequestHelper.getLiferayPortletResponse();

		ddmFormRenderingContext.setPortletNamespace(
			liferayPortletResponse.getNamespace());

		ddmFormRenderingContext.setShowRequiredFieldsWarning(true);

		ObjectDefinition objectDefinition = getObjectDefinition1();

		if ((objectLayoutTab == null) &&
			(objectDefinition.getRootObjectDefinitionId() == 0)) {

			return _ddmFormRenderer.render(ddmForm, ddmFormRenderingContext);
		}

		DDMFormLayout ddmFormLayout = new DDMFormLayout();

		DDMFormLayoutPage ddmFormLayoutPage = new DDMFormLayoutPage();

		ddmFormLayout.addDDMFormLayoutPage(ddmFormLayoutPage);

		if ((objectLayoutTab == null) &&
			(objectDefinition.getRootObjectDefinitionId() > 0)) {

			_addDDMFormLayoutRow(
				ddmFormLayoutPage,
				String.valueOf(objectDefinition.getPrimaryKey()));

			return _ddmFormRenderer.render(
				ddmForm, ddmFormLayout, ddmFormRenderingContext);
		}

		Map<String, DDMFormField> ddmFormFieldsMap =
			ddmForm.getDDMFormFieldsMap(false);

		for (ObjectLayoutBox objectLayoutBox :
				objectLayoutTab.getObjectLayoutBoxes()) {

			if (!ddmFormFieldsMap.containsKey(
					String.valueOf(objectLayoutBox.getPrimaryKey()))) {

				continue;
			}

			_addDDMFormLayoutRow(
				ddmFormLayoutPage,
				String.valueOf(objectLayoutBox.getPrimaryKey()));
		}

		return _ddmFormRenderer.render(
			ddmForm, ddmFormLayout, ddmFormRenderingContext);
	}

	private void _addDDMFormField(
			List<DDMFormField> ddmFormFields, ObjectEntry objectEntry,
			ObjectField objectField, boolean readOnly)
		throws PortalException {

		if (FeatureFlagManagerUtil.isEnabled("LPS-170122") ||
			(!objectField.compareBusinessType(
				ObjectFieldConstants.BUSINESS_TYPE_AGGREGATION) &&
			 !objectField.compareBusinessType(
				 ObjectFieldConstants.BUSINESS_TYPE_FORMULA))) {

			ddmFormFields.add(
				_getDDMFormField(objectEntry, objectField, readOnly));

			return;
		}

		ddmFormFields.add(_getDDMFormField(objectEntry, objectField, true));
	}

	private void _addDDMFormLayoutRow(
		DDMFormLayoutPage ddmFormLayoutPage, String fieldName) {

		DDMFormLayoutRow ddmFormLayoutRow = new DDMFormLayoutRow();

		ddmFormLayoutRow.addDDMFormLayoutColumn(
			new DDMFormLayoutColumn(12, fieldName));

		ddmFormLayoutPage.addDDMFormLayoutRow(ddmFormLayoutRow);
	}

	private void _addFieldsetDDMFormField(
		boolean collapsible, DDMForm ddmForm, String fieldName, String label,
		List<DDMFormField> nestedDDMFormFields, String rows) {

		if (nestedDDMFormFields.isEmpty()) {
			return;
		}

		ddmForm.addDDMFormField(
			new DDMFormField(fieldName, DDMFormFieldTypeConstants.FIELDSET) {
				{
					setLabel(
						new LocalizedValue() {
							{
								addString(
									_objectRequestHelper.getLocale(), label);
							}
						});
					setNestedDDMFormFields(nestedDDMFormFields);
					setProperty("collapsible", collapsible);
					setProperty("rows", rows);
					setShowLabel(true);
				}
			});
	}

	private ObjectFieldRenderingContext _createObjectFieldRenderingContext(
			ObjectEntry objectEntry)
		throws PortalException {

		ObjectFieldRenderingContext objectFieldRenderingContext =
			new ObjectFieldRenderingContext();

		objectFieldRenderingContext.setGroupId(
			_objectRequestHelper.getScopeGroupId());
		objectFieldRenderingContext.setHttpServletRequest(
			_objectRequestHelper.getRequest());
		objectFieldRenderingContext.setLocale(_objectRequestHelper.getLocale());

		if (objectEntry != null) {
			objectFieldRenderingContext.setExternalReferenceCode(
				objectEntry.getExternalReferenceCode());
			objectFieldRenderingContext.setProperties(
				objectEntry.getProperties());
		}

		objectFieldRenderingContext.setPortletId(
			_objectRequestHelper.getPortletId());
		objectFieldRenderingContext.setUserId(_objectRequestHelper.getUserId());

		return objectFieldRenderingContext;
	}

	private DropdownItem _getCreateNewRelatedModelDropdownItem(
			ObjectDefinition objectDefinition,
			ObjectRelationship objectRelationship)
		throws PortalException {

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		return DropdownItemBuilder.setHref(
			PortletURLBuilder.create(
				PortalUtil.getControlPanelPortletURL(
					_objectRequestHelper.getRequest(),
					serviceContext.getScopeGroup(),
					objectDefinition.getPortletId(), 0, 0,
					PortletRequest.RENDER_PHASE)
			).setMVCRenderCommandName(
				"/object_entries/edit_object_entry"
			).setBackURL(
				_objectRequestHelper.getCurrentURL()
			).setParameter(
				ObjectFieldSettingConstants.
					NAME_OBJECT_RELATIONSHIP_ERC_OBJECT_FIELD_NAME,
				ObjectFieldSettingUtil.getValue(
					ObjectFieldSettingConstants.
						NAME_OBJECT_RELATIONSHIP_ERC_OBJECT_FIELD_NAME,
					_objectFieldLocalService.getObjectField(
						objectRelationship.getObjectFieldId2()))
			).setParameter(
				"objectDefinitionId", objectDefinition.getObjectDefinitionId()
			).setParameter(
				"parentObjectEntryERC",
				() -> {
					ObjectEntry objectEntry = _getObjectEntry();

					return String.valueOf(
						objectEntry.getExternalReferenceCode());
				}
			).setWindowState(
				WindowState.MAXIMIZED
			).buildString()
		).setLabel(
			LanguageUtil.get(_objectRequestHelper.getRequest(), "create-new")
		).build();
	}

	private DDMForm _getDDMForm(
			ObjectEntry objectEntry, ObjectLayoutTab objectLayoutTab)
		throws PortalException {

		DDMForm ddmForm = new DDMForm();

		ddmForm.addAvailableLocale(_objectRequestHelper.getLocale());
		ddmForm.setDefaultLocale(_objectRequestHelper.getLocale());

		ObjectDefinition objectDefinition = getObjectDefinition1();

		boolean readOnly = _readOnly;

		if (!readOnly && (objectEntry != null)) {
			readOnly =
				!ObjectDefinitionResourcePermissionUtil.
					hasModelResourcePermission(
						objectDefinition, objectEntry, _objectEntryService,
						ActionKeys.UPDATE);
		}

		if (objectLayoutTab == null) {
			List<DDMFormField> ddmFormFields = new ArrayList<>();
			JSONArray rowsJSONArray = JSONFactoryUtil.createJSONArray();

			for (ObjectField objectField :
					_objectFieldLocalService.getObjectFields(
						objectDefinition.getObjectDefinitionId())) {

				if (!_isActive(objectField) || objectField.isMetadata()) {
					continue;
				}

				_addDDMFormField(
					ddmFormFields, objectEntry, objectField, readOnly);

				if (objectDefinition.getRootObjectDefinitionId() == 0) {
					continue;
				}

				rowsJSONArray.put(
					JSONUtil.put(
						"columns",
						JSONUtil.put(
							JSONUtil.put(
								"fields", JSONUtil.put(objectField.getName())
							).put(
								"size", 12
							))));
			}

			if (objectDefinition.getRootObjectDefinitionId() == 0) {
				ddmForm.setDDMFormFields(ddmFormFields);
			}
			else {
				_addFieldsetDDMFormField(
					true, ddmForm,
					String.valueOf(objectDefinition.getPrimaryKey()),
					objectDefinition.getLabel(_objectRequestHelper.getLocale()),
					ddmFormFields, rowsJSONArray.toString());
			}

			return ddmForm;
		}

		Map<Long, ObjectField> objectFieldsMap = new HashMap<>();

		ListUtil.isNotEmptyForEach(
			_objectFieldLocalService.getObjectFields(
				objectDefinition.getObjectDefinitionId()),
			objectField -> objectFieldsMap.put(
				objectField.getObjectFieldId(), objectField));

		for (ObjectLayoutBox objectLayoutBox :
				objectLayoutTab.getObjectLayoutBoxes()) {

			List<DDMFormField> nestedDDMFormFields = new ArrayList<>();
			JSONArray rowsJSONArray = JSONFactoryUtil.createJSONArray();

			for (ObjectLayoutRow objectLayoutRow :
					objectLayoutBox.getObjectLayoutRows()) {

				JSONArray columnsJSONArray = JSONFactoryUtil.createJSONArray();

				for (ObjectLayoutColumn objectLayoutColumn :
						objectLayoutRow.getObjectLayoutColumns()) {

					if (!objectFieldsMap.containsKey(
							objectLayoutColumn.getObjectFieldId())) {

						continue;
					}

					ObjectField objectField = objectFieldsMap.get(
						objectLayoutColumn.getObjectFieldId());

					if (!_isActive(objectField)) {
						continue;
					}

					_addDDMFormField(
						nestedDDMFormFields, objectEntry, objectField,
						readOnly);

					columnsJSONArray.put(
						JSONUtil.put(
							"fields", JSONUtil.put(objectField.getName())
						).put(
							"size", objectLayoutColumn.getSize()
						));
				}

				rowsJSONArray.put(JSONUtil.put("columns", columnsJSONArray));
			}

			_addFieldsetDDMFormField(
				objectLayoutBox.isCollapsable(), ddmForm,
				String.valueOf(objectLayoutBox.getPrimaryKey()),
				objectLayoutBox.getName(_objectRequestHelper.getLocale()),
				nestedDDMFormFields, rowsJSONArray.toString());
		}

		return ddmForm;
	}

	private DDMFormField _getDDMFormField(
			ObjectEntry objectEntry, ObjectField objectField, boolean readOnly)
		throws PortalException {

		// TODO Store the type and the object field type in the database

		ObjectFieldBusinessType objectFieldBusinessType =
			_objectFieldBusinessTypeRegistry.getObjectFieldBusinessType(
				objectField.getBusinessType());

		DDMFormField ddmFormField = new DDMFormField(
			objectField.getName(),
			objectFieldBusinessType.getDDMFormFieldTypeName(
				objectField.isLocalized()));

		Map<String, Object> properties = objectFieldBusinessType.getProperties(
			objectField, _createObjectFieldRenderingContext(objectEntry));

		ddmFormField.setDDMFormFieldValidation(
			_getDDMFormFieldValidation(
				objectField.getBusinessType(), objectField.getName(),
				properties));

		LocalizedValue ddmFormFieldLabelLocalizedValue = new LocalizedValue(
			_objectRequestHelper.getLocale());

		ddmFormFieldLabelLocalizedValue.addString(
			_objectRequestHelper.getLocale(),
			objectField.getLabel(_objectRequestHelper.getLocale()));

		ddmFormField.setLabel(ddmFormFieldLabelLocalizedValue);

		ddmFormField.setLocalizable(objectField.isLocalized());

		properties.forEach(
			(key, value) -> ddmFormField.setProperty(key, value));

		ddmFormField.setProperty(
			"objectFieldId", String.valueOf(objectField.getObjectFieldId()));

		if (Validator.isNotNull(objectField.getRelationshipType())) {
			ObjectRelationship objectRelationship =
				_objectRelationshipLocalService.
					fetchObjectRelationshipByObjectFieldId2(
						objectField.getObjectFieldId());

			ddmFormField.setProperty(
				"objectDefinitionId",
				String.valueOf(objectRelationship.getObjectDefinitionId1()));

			long parameterObjectFieldId =
				objectRelationship.getParameterObjectFieldId();

			if (parameterObjectFieldId > 0) {
				ObjectField parameterObjectField =
					_objectFieldLocalService.getObjectField(
						parameterObjectFieldId);

				ddmFormField.setProperty(
					"parameterObjectFieldName", parameterObjectField.getName());
			}
		}
		else if (StringUtil.equals(
					objectField.getBusinessType(),
					ObjectFieldConstants.BUSINESS_TYPE_ATTACHMENT) &&
				 (objectEntry != null)) {

			ObjectDefinition objectDefinition = getObjectDefinition1();

			ddmFormField.setProperty(
				"objectDefinitionExternalReferenceCode",
				objectDefinition.getExternalReferenceCode());

			ddmFormField.setProperty(
				"objectEntryExternalReferenceCode",
				objectEntry.getExternalReferenceCode());
		}

		ddmFormField.setReadOnly(
			_isReadOnly(objectEntry, objectField, readOnly));

		ddmFormField.setRequired(objectField.isRequired());

		if (objectField.isLocalized() &&
			StringUtil.equals(
				ddmFormField.getType(), DDMFormFieldTypeConstants.TEXT)) {

			ddmFormField.setType(DDMFormFieldTypeConstants.LOCALIZABLE_TEXT);
		}

		return ddmFormField;
	}

	private DDMFormFieldValidation _getDDMFormFieldValidation(
		String businessType, String objectFieldName,
		Map<String, Object> properties) {

		int defaultMaxLength = 0;

		if (Objects.equals(
				businessType, ObjectFieldConstants.BUSINESS_TYPE_LONG_TEXT)) {

			defaultMaxLength = 65000;
		}
		else if (Objects.equals(
					businessType, ObjectFieldConstants.BUSINESS_TYPE_TEXT)) {

			defaultMaxLength = 280;
		}

		if ((defaultMaxLength > 0) &&
			GetterUtil.getBoolean(properties.get("showCounter"))) {

			DDMFormFieldValidation ddmFormFieldValidation =
				new DDMFormFieldValidation();

			DDMFormFieldValidationExpression ddmFormFieldValidationExpression =
				new DDMFormFieldValidationExpression();

			int maxLength = GetterUtil.getInteger(
				properties.get("maxLength"), defaultMaxLength);

			ddmFormFieldValidationExpression.setValue(
				StringBundler.concat(
					"length(", objectFieldName, ") <= ", maxLength));

			ddmFormFieldValidation.setDDMFormFieldValidationExpression(
				ddmFormFieldValidationExpression);

			return ddmFormFieldValidation;
		}

		return null;
	}

	private DDMFormValues _getDDMFormValues(
		DDMForm ddmForm, ObjectEntry objectEntry) {

		Map<String, Object> values = _getValues(objectEntry);

		if (values.isEmpty()) {
			return null;
		}

		DDMFormValues ddmFormValues = new DDMFormValues(ddmForm);

		ddmFormValues.addAvailableLocale(_objectRequestHelper.getLocale());

		Map<String, DDMFormField> ddmFormFieldsMap =
			ddmForm.getDDMFormFieldsMap(false);

		ddmFormValues.setDDMFormFieldValues(
			TransformUtil.transform(
				ddmFormFieldsMap.values(),
				ddmFormField -> {
					DDMFormFieldValue ddmFormFieldValue =
						new DDMFormFieldValue();

					ddmFormFieldValue.setName(ddmFormField.getName());
					ddmFormFieldValue.setNestedDDMFormFields(
						_getNestedDDMFormFieldValues(
							ddmFormField.getNestedDDMFormFields(), values));

					if (!StringUtil.equals(
							ddmFormField.getType(),
							DDMFormFieldTypeConstants.FIELDSET)) {

						_setDDMFormFieldValueValue(
							ddmFormField, ddmFormFieldValue, values);
					}

					return ddmFormFieldValue;
				}));

		ddmFormValues.setDefaultLocale(_objectRequestHelper.getLocale());

		return ddmFormValues;
	}

	private DTOConverterContext _getDTOConverterContext() {
		return new DefaultDTOConverterContext(
			false, null, null, _objectRequestHelper.getRequest(), null,
			_themeDisplay.getLocale(), null, _themeDisplay.getUser());
	}

	private long _getGroupId() {
		ObjectDefinition objectDefinition = getObjectDefinition1();

		ObjectScopeProvider objectScopeProvider =
			_objectScopeProviderRegistry.getObjectScopeProvider(
				objectDefinition.getScope());

		try {
			return objectScopeProvider.getGroupId(
				_objectRequestHelper.getRequest());
		}
		catch (PortalException portalException) {
			if (_log.isDebugEnabled()) {
				_log.debug(portalException);
			}

			return 0L;
		}
	}

	private List<DDMFormFieldValue> _getNestedDDMFormFieldValues(
		List<DDMFormField> ddmFormFields, Map<String, Object> values) {

		return TransformUtil.transform(
			ddmFormFields,
			ddmFormField -> {
				DDMFormFieldValue ddmFormFieldValue = new DDMFormFieldValue();

				ddmFormFieldValue.setName(ddmFormField.getName());

				_setDDMFormFieldValueValue(
					ddmFormField, ddmFormFieldValue, values);

				return ddmFormFieldValue;
			});
	}

	private ObjectEntry _getObjectEntry() throws PortalException {
		if (_objectEntry != null) {
			return _objectEntry;
		}

		ObjectDefinition objectDefinition = getObjectDefinition1();

		ObjectEntryManager objectEntryManager =
			_objectEntryManagerRegistry.getObjectEntryManager(
				objectDefinition.getStorageType());

		String externalReferenceCode = ParamUtil.getString(
			_objectRequestHelper.getRequest(), "externalReferenceCode");

		if (_readOnly && Validator.isNull(externalReferenceCode)) {
			HttpServletRequest httpServletRequest =
				_objectRequestHelper.getRequest();

			externalReferenceCode = (String)httpServletRequest.getAttribute(
				ObjectWebKeys.OBJECT_ENTRY_EXTERNAL_REFERENCE_CODE);
		}

		try {
			_objectEntry = objectEntryManager.getObjectEntry(
				_objectRequestHelper.getCompanyId(), _getDTOConverterContext(),
				externalReferenceCode, objectDefinition,
				String.valueOf(_getGroupId()));
		}
		catch (Exception exception) {
			if (_log.isWarnEnabled()) {
				_log.warn(exception);
			}
		}

		return _objectEntry;
	}

	private Object _getValue(
		DDMFormField ddmFormField, Map<String, Object> values) {

		try {
			ObjectField objectField = _objectFieldLocalService.getObjectField(
				GetterUtil.getLong(ddmFormField.getProperty("objectFieldId")));

			ObjectFieldBusinessType objectFieldBusinessType =
				_objectFieldBusinessTypeRegistry.getObjectFieldBusinessType(
					objectField.getBusinessType());

			return objectFieldBusinessType.getDisplayContextValue(
				objectField, _objectRequestHelper.getUserId(), values);
		}
		catch (PortalException portalException) {
			if (_log.isDebugEnabled()) {
				_log.debug(portalException);
			}

			return null;
		}
	}

	private Map<String, Object> _getValues(ObjectEntry objectEntry) {
		Map<String, Object> values = objectEntry.getProperties();

		Date dateCreated = objectEntry.getDateCreated();

		if (dateCreated != null) {
			values.put("createDate", new Timestamp(dateCreated.getTime()));
		}

		Creator creator = objectEntry.getCreator();

		if (creator != null) {
			values.put("creator", creator.getName());
		}

		values.put(
			"externalReferenceCode", objectEntry.getExternalReferenceCode());
		values.put("id", objectEntry.getId());

		Date dateModified = objectEntry.getDateModified();

		if (dateModified != null) {
			values.put("modifiedDate", new Timestamp(dateModified.getTime()));
		}

		Status status = objectEntry.getStatus();

		if (status != null) {
			values.put("status", status.getLabel());
		}

		return values;
	}

	private boolean _isActive(ObjectField objectField) throws PortalException {
		if (Validator.isNull(objectField.getRelationshipType())) {
			return true;
		}

		if (Validator.isNotNull(getObjectRelationshipERCObjectFieldName()) &&
			Objects.equals(
				getObjectRelationshipERCObjectFieldName(),
				ObjectFieldSettingUtil.getValue(
					ObjectFieldSettingConstants.
						NAME_OBJECT_RELATIONSHIP_ERC_OBJECT_FIELD_NAME,
					objectField))) {

			return false;
		}

		ObjectRelationship objectRelationship =
			_objectRelationshipLocalService.
				fetchObjectRelationshipByObjectFieldId2(
					objectField.getObjectFieldId());

		if (objectRelationship.isEdge()) {
			return false;
		}

		ObjectDefinition relatedObjectDefinition =
			_objectDefinitionLocalService.getObjectDefinition(
				objectRelationship.getObjectDefinitionId1());

		return relatedObjectDefinition.isActive();
	}

	private boolean _isReadOnly(
			ObjectEntry objectEntry, ObjectField objectField, boolean readOnly)
		throws PortalException {

		if (!FeatureFlagManagerUtil.isEnabled("LPS-170122")) {
			return readOnly;
		}

		if (readOnly) {
			return true;
		}

		if (Objects.equals(
				objectField.getReadOnly(),
				ObjectFieldConstants.READ_ONLY_FALSE)) {

			return false;
		}

		if (Objects.equals(
				objectField.getReadOnly(),
				ObjectFieldConstants.READ_ONLY_TRUE)) {

			return true;
		}

		Map<String, Object> existingValues = new HashMap<>();

		if (objectEntry == null) {
			for (ObjectField objectField1 :
					_objectFieldLocalService.getObjectFields(
						objectField.getObjectDefinitionId())) {

				existingValues.put(
					objectField1.getName(),
					ObjectFieldSettingUtil.getDefaultValueAsString(
						null, objectField.getObjectFieldId(),
						ObjectFieldSettingLocalServiceUtil.getService(), null));
			}
		}
		else {
			com.liferay.object.model.ObjectEntry serviceBuilderObjectEntry =
				_objectEntryLocalService.getObjectEntry(
					objectEntry.getExternalReferenceCode(),
					objectField.getObjectDefinitionId());

			existingValues.putAll(
				_objectEntryLocalService.getSystemValues(
					serviceBuilderObjectEntry));
			existingValues.putAll(
				_objectEntryLocalService.getValues(serviceBuilderObjectEntry));

			existingValues.put("currentUserId", _themeDisplay.getUserId());
		}

		try {
			DDMExpression<Boolean> ddmExpression =
				_ddmExpressionFactory.createExpression(
					CreateExpressionRequest.Builder.newBuilder(
						objectField.getReadOnlyConditionExpression()
					).withDDMExpressionFieldAccessor(
						new ObjectEntryDDMExpressionFieldAccessor(
							existingValues)
					).build());

			ddmExpression.setVariables(existingValues);

			if (ddmExpression.evaluate()) {
				return true;
			}
		}
		catch (DDMExpressionException ddmExpressionException) {
			_log.error(ddmExpressionException);
		}

		return false;
	}

	private void _setDDMFormFieldValueValue(
		DDMFormField ddmFormField, DDMFormFieldValue ddmFormFieldValue,
		Map<String, Object> values) {

		Object value = _getValue(ddmFormField, values);

		if (value == null) {
			LocalizedValue ddmFormFieldPredefinedValue =
				ddmFormField.getPredefinedValue();

			if (MapUtil.isEmpty(ddmFormFieldPredefinedValue.getValues())) {
				ddmFormFieldValue.setValue(
					new UnlocalizedValue(StringPool.BLANK));
			}
			else {
				ddmFormFieldValue.setValue(
					new UnlocalizedValue(
						ddmFormFieldPredefinedValue.getString(
							_objectRequestHelper.getLocale())));
			}
		}
		else if (value instanceof ArrayList) {
			ddmFormFieldValue.setValue(
				new UnlocalizedValue(
					StringBundler.concat(
						StringPool.OPEN_BRACKET,
						StringUtil.merge(
							ListUtil.toList(
								(List<ListEntry>)value, ListEntry::getKey),
							StringPool.COMMA_AND_SPACE),
						StringPool.CLOSE_BRACKET)));
		}
		else if (value instanceof FileEntry) {
			FileEntry fileEntry = (FileEntry)value;

			ddmFormFieldValue.setValue(
				new UnlocalizedValue(String.valueOf(fileEntry.getId())));
		}
		else if (value instanceof ListEntry) {
			ListEntry listEntry = (ListEntry)value;

			ddmFormFieldValue.setValue(
				new UnlocalizedValue(listEntry.getKey()));
		}
		else if (FeatureFlagManagerUtil.isEnabled("LPS-172017") &&
				 (value instanceof Map)) {

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(
				(Map<String, String>)value);

			ddmFormFieldValue.setValue(
				new UnlocalizedValue(jsonObject.toString()));
		}
		else {
			if (value instanceof Double) {
				DecimalFormat decimalFormat =
					NumericDDMFormFieldUtil.getDecimalFormat(
						_objectRequestHelper.getLocale());

				value = decimalFormat.format(value);
			}

			ddmFormFieldValue.setValue(
				new UnlocalizedValue(String.valueOf(value)));
		}
	}

	private com.liferay.object.model.ObjectEntry _toServiceBuilderObjectEntry(
		ObjectEntry objectEntry) {

		if (objectEntry == null) {
			return null;
		}

		ObjectDefinition objectDefinition = getObjectDefinition1();

		return ObjectEntryUtil.toObjectEntry(
			objectDefinition.getObjectDefinitionId(), objectEntry);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ObjectEntryDisplayContextImpl.class);

	private final DDMExpressionFactory _ddmExpressionFactory;
	private final DDMFormRenderer _ddmFormRenderer;
	private final ItemSelector _itemSelector;
	private final ObjectDefinitionLocalService _objectDefinitionLocalService;
	private ObjectEntry _objectEntry;
	private final ObjectEntryLocalService _objectEntryLocalService;
	private final ObjectEntryManagerRegistry _objectEntryManagerRegistry;
	private final ObjectEntryService _objectEntryService;
	private final ObjectFieldBusinessTypeRegistry
		_objectFieldBusinessTypeRegistry;
	private final ObjectFieldLocalService _objectFieldLocalService;
	private final ObjectLayoutLocalService _objectLayoutLocalService;
	private final ObjectRelationshipLocalService
		_objectRelationshipLocalService;
	private final ObjectRequestHelper _objectRequestHelper;
	private final ObjectScopeProviderRegistry _objectScopeProviderRegistry;
	private final boolean _readOnly;
	private final ThemeDisplay _themeDisplay;

}