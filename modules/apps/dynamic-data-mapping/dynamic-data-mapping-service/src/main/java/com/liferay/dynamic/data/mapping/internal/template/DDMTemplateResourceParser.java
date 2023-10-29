/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.mapping.internal.template;

import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.model.DDMTemplate;
import com.liferay.dynamic.data.mapping.service.DDMTemplateLocalService;
import com.liferay.dynamic.data.mapping.template.DDMTemplateResource;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateException;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.template.TemplateResourceParser;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Tina Tian
 * @author Juan Fernández
 */
@Component(
	property = {
		"lang.type=" + TemplateConstants.LANG_TYPE_FTL,
		"lang.type=" + TemplateConstants.LANG_TYPE_VM
	},
	service = TemplateResourceParser.class
)
public class DDMTemplateResourceParser implements TemplateResourceParser {

	@Override
	public TemplateResource getTemplateResource(String templateId)
		throws TemplateException {

		int pos = templateId.indexOf(
			TemplateConstants.TEMPLATE_SEPARATOR + StringPool.SLASH);

		if (pos == -1) {
			return null;
		}

		try {
			int w = templateId.indexOf(CharPool.SLASH, pos);

			int x = templateId.indexOf(CharPool.SLASH, w + 1);

			int y = templateId.indexOf(CharPool.SLASH, x + 1);

			int z = templateId.indexOf(CharPool.SLASH, y + 1);

			long companyId = GetterUtil.getLong(templateId.substring(w + 1, x));
			long groupId = GetterUtil.getLong(templateId.substring(x + 1, y));
			long classNameId = GetterUtil.getLong(
				templateId.substring(y + 1, z));
			String ddmTemplateKey = templateId.substring(z + 1);

			if (_log.isDebugEnabled()) {
				_log.debug(
					StringBundler.concat(
						"Loading {companyId=", companyId, ", groupId=", groupId,
						", classNameId=", classNameId, ", ddmTemplateKey=",
						ddmTemplateKey, "}"));
			}

			DDMTemplate ddmTemplate = _ddmTemplateLocalService.fetchTemplate(
				groupId, classNameId, ddmTemplateKey);

			if (ddmTemplate == null) {
				Group companyGroup = _groupLocalService.getCompanyGroup(
					companyId);

				ddmTemplate = _ddmTemplateLocalService.fetchTemplate(
					companyGroup.getGroupId(), classNameId, ddmTemplateKey);

				if (ddmTemplate == null) {
					classNameId = _portal.getClassNameId(DDMStructure.class);

					ddmTemplate = _ddmTemplateLocalService.fetchTemplate(
						groupId, classNameId, ddmTemplateKey);
				}

				if (ddmTemplate == null) {
					ddmTemplate = _ddmTemplateLocalService.fetchTemplate(
						companyGroup.getGroupId(), classNameId, ddmTemplateKey);
				}
			}

			if (ddmTemplate == null) {
				return null;
			}

			return new DDMTemplateResource(
				ddmTemplate.getTemplateKey(), ddmTemplate);
		}
		catch (Exception exception) {
			throw new TemplateException(
				"Unable to find template " + templateId, exception);
		}
	}

	@Override
	public boolean isTemplateResourceValid(String templateId, String langType) {
		if (templateId.contains(TemplateConstants.TEMPLATE_SEPARATOR)) {
			return true;
		}

		return false;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		DDMTemplateResourceParser.class);

	@Reference
	private DDMTemplateLocalService _ddmTemplateLocalService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private Portal _portal;

}