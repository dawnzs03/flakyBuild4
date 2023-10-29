/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.content.web.internal.portlet.display.template;

import com.liferay.commerce.product.constants.CPPortletKeys;
import com.liferay.commerce.product.content.helper.CPContentHelper;
import com.liferay.commerce.product.content.web.internal.portlet.CPContentPortlet;
import com.liferay.commerce.product.model.CPDefinition;
import com.liferay.commerce.product.service.CPDefinitionLocalService;
import com.liferay.commerce.product.type.grouped.util.GroupedCPTypeHelper;
import com.liferay.commerce.product.type.virtual.util.VirtualCPTypeHelper;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portlet.display.template.BasePortletDisplayTemplateHandler;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	property = "javax.portlet.name=" + CPPortletKeys.CP_CONTENT_WEB,
	service = TemplateHandler.class
)
public class CPContentPortletDisplayTemplateHandler
	extends BasePortletDisplayTemplateHandler {

	@Override
	public String getClassName() {
		return CPContentPortlet.class.getName();
	}

	@Override
	public String getName(Locale locale) {
		StringBundler sb = new StringBundler(3);

		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		sb.append(
			_portal.getPortletTitle(
				CPPortletKeys.CP_CONTENT_WEB, resourceBundle));

		sb.append(StringPool.SPACE);
		sb.append(_language.get(locale, "template"));

		return sb.toString();
	}

	@Override
	public String getResourceName() {
		return CPPortletKeys.CP_CONTENT_WEB;
	}

	@Override
	public Map<String, TemplateVariableGroup> getTemplateVariableGroups(
			long classPK, String language, Locale locale)
		throws Exception {

		Map<String, TemplateVariableGroup> templateVariableGroups =
			super.getTemplateVariableGroups(classPK, language, locale);

		TemplateVariableGroup templateVariableGroup =
			templateVariableGroups.get("fields");

		templateVariableGroup.empty();

		templateVariableGroup.addVariable(
			"cp-catalog-entry", CPDefinition.class, "cpCatalogEntry");
		templateVariableGroup.addVariable(
			"cp-content-helper", CPContentHelper.class, "cpContentHelper");
		templateVariableGroup.addVariable(
			"grouped-cp-type-helper", GroupedCPTypeHelper.class,
			"groupedCPTypeHelper");
		templateVariableGroup.addVariable(
			"virtual-cp-type-helper", VirtualCPTypeHelper.class,
			"virtualCPTypeHelper");

		TemplateVariableGroup cpDefinitionsServicesTemplateVariableGroup =
			new TemplateVariableGroup(
				"cp-definition-services", getRestrictedVariables(language));

		cpDefinitionsServicesTemplateVariableGroup.setAutocompleteEnabled(
			false);

		cpDefinitionsServicesTemplateVariableGroup.addServiceLocatorVariables(
			CPDefinitionLocalService.class);

		templateVariableGroups.put(
			cpDefinitionsServicesTemplateVariableGroup.getLabel(),
			cpDefinitionsServicesTemplateVariableGroup);

		return templateVariableGroups;
	}

	@Reference
	private Language _language;

	@Reference
	private Portal _portal;

}