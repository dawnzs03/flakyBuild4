/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.client.extension.type.factory;

import com.liferay.client.extension.constants.ClientExtensionEntryConstants;
import com.liferay.client.extension.model.ClientExtensionEntry;
import com.liferay.client.extension.type.CET;
import com.liferay.client.extension.type.configuration.CETConfiguration;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.UnicodeProperties;

import java.util.Collection;
import java.util.Map;

import javax.portlet.PortletRequest;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 */
@ProviderType
public interface CETFactory {

	public CET create(
			CETConfiguration cetConfiguration, long companyId,
			String externalReferenceCode)
		throws PortalException;

	public CET create(ClientExtensionEntry clientExtensionEntry)
		throws PortalException;

	public CET create(PortletRequest portletRequest, String type)
		throws PortalException;

	public Collection<String> getTypes();

	public void validate(
			UnicodeProperties newTypeSettingsUnicodeProperties,
			UnicodeProperties oldTypeSettingsUnicodeProperties, String type)
		throws PortalException;

	public final Map<String, String> FEATURE_FLAG_KEYS = HashMapBuilder.put(

		// feature.flag.LPS-164563

		ClientExtensionEntryConstants.TYPE_FDS_CELL_RENDERER, "LPS-164563"
	).put(

		// feature.flag.LPS-166479

		ClientExtensionEntryConstants.TYPE_THEME_SPRITEMAP, "LPS-166479"
	).put(

		// feature.flag.LPS-172903

		ClientExtensionEntryConstants.TYPE_JS_IMPORT_MAPS_ENTRY, "LPS-172903"
	).put(

		// feature.flag.LPS-177027

		ClientExtensionEntryConstants.TYPE_STATIC_CONTENT, "LPS-177027"
	).put(

		// feature.flag.LPS-184016

		ClientExtensionEntryConstants.TYPE_FDS_FILTER, "LPS-184016"
	).build();

}