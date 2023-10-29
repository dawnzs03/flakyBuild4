/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.commerce.product.definitions.web.internal.portlet.action;

import com.liferay.commerce.product.configuration.AttachmentsConfiguration;
import com.liferay.commerce.product.constants.CPPortletKeys;
import com.liferay.commerce.product.exception.CPAttachmentFileEntryNameException;
import com.liferay.commerce.product.exception.CPAttachmentFileEntrySizeException;
import com.liferay.commerce.product.service.CPDefinitionService;
import com.liferay.item.selector.ItemSelectorUploadResponseHandler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.ServletResponseConstants;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.File;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.TempFileEntryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.upload.UniqueFileNameProvider;
import com.liferay.upload.UploadFileEntryHandler;
import com.liferay.upload.UploadHandler;
import com.liferay.upload.UploadResponseHandler;

import java.io.IOException;
import java.io.InputStream;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Marco Leo
 */
@Component(
	configurationPid = "com.liferay.commerce.product.configuration.AttachmentsConfiguration",
	property = {
		"javax.portlet.name=" + CPPortletKeys.CP_DEFINITIONS,
		"mvc.command.name=/cp_definitions/upload_temp_attachment"
	},
	service = MVCActionCommand.class
)
public class UploadTempAttachmentMVCActionCommand extends BaseMVCActionCommand {

	@Activate
	protected void activate(Map<String, Object> properties) {
		_attachmentsConfiguration = ConfigurableUtil.createConfigurable(
			AttachmentsConfiguration.class, properties);
	}

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		_uploadHandler.upload(
			_tempAttachmentsUploadFileEntryHandler,
			_attachmentsUploadResponseHandler, actionRequest, actionResponse);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		UploadTempAttachmentMVCActionCommand.
			TempAttachmentsUploadFileEntryHandler.class);

	private volatile AttachmentsConfiguration _attachmentsConfiguration;
	private final AttachmentsUploadResponseHandler
		_attachmentsUploadResponseHandler =
			new AttachmentsUploadResponseHandler();

	@Reference
	private File _file;

	@Reference
	private ItemSelectorUploadResponseHandler
		_itemSelectorUploadResponseHandler;

	private final TempAttachmentsUploadFileEntryHandler
		_tempAttachmentsUploadFileEntryHandler =
			new TempAttachmentsUploadFileEntryHandler();

	@Reference
	private UniqueFileNameProvider _uniqueFileNameProvider;

	@Reference
	private UploadHandler _uploadHandler;

	private class AttachmentsUploadResponseHandler
		implements UploadResponseHandler {

		@Override
		public JSONObject onFailure(
				PortletRequest portletRequest, PortalException portalException)
			throws PortalException {

			JSONObject jsonObject =
				_itemSelectorUploadResponseHandler.onFailure(
					portletRequest, portalException);

			if (portalException instanceof CPAttachmentFileEntryNameException ||
				portalException instanceof CPAttachmentFileEntrySizeException) {

				String errorMessage = StringPool.BLANK;
				int errorType = 0;

				if (portalException instanceof
						CPAttachmentFileEntryNameException) {

					errorType =
						ServletResponseConstants.SC_FILE_EXTENSION_EXCEPTION;

					errorMessage = StringUtil.merge(
						_attachmentsConfiguration.imageExtensions());
				}
				else if (portalException instanceof
							CPAttachmentFileEntrySizeException) {

					errorType = ServletResponseConstants.SC_FILE_SIZE_EXCEPTION;
				}

				jsonObject.put(
					"error",
					JSONUtil.put(
						"errorType", errorType
					).put(
						"message", errorMessage
					));
			}
			else {
				throw portalException;
			}

			return jsonObject;
		}

		@Override
		public JSONObject onSuccess(
				UploadPortletRequest uploadPortletRequest, FileEntry fileEntry)
			throws PortalException {

			return _itemSelectorUploadResponseHandler.onSuccess(
				uploadPortletRequest, fileEntry);
		}

	}

	private class TempAttachmentsUploadFileEntryHandler
		implements UploadFileEntryHandler {

		@Override
		public FileEntry upload(UploadPortletRequest uploadPortletRequest)
			throws IOException, PortalException {

			ThemeDisplay themeDisplay =
				(ThemeDisplay)uploadPortletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			String fileName = uploadPortletRequest.getFileName(_parameterName);
			String contentType = uploadPortletRequest.getContentType(
				_parameterName);

			_validateFile(
				fileName, contentType,
				uploadPortletRequest.getSize(_parameterName));

			try (InputStream inputStream = uploadPortletRequest.getFileAsStream(
					_parameterName)) {

				return _addFileEntry(
					fileName, contentType, inputStream, themeDisplay);
			}
		}

		@Reference
		protected CPDefinitionService cpDefinitionService;

		private FileEntry _addFileEntry(
				String fileName, String contentType, InputStream inputStream,
				ThemeDisplay themeDisplay)
			throws PortalException {

			String uniqueFileName = _uniqueFileNameProvider.provide(
				fileName, curFileName -> _exists(themeDisplay, curFileName));

			return TempFileEntryUtil.addTempFileEntry(
				themeDisplay.getScopeGroupId(), themeDisplay.getUserId(),
				_tempFolderName, uniqueFileName, inputStream, contentType);
		}

		private boolean _exists(ThemeDisplay themeDisplay, String curFileName) {
			try {
				FileEntry fileEntry = TempFileEntryUtil.getTempFileEntry(
					themeDisplay.getScopeGroupId(), themeDisplay.getUserId(),
					_tempFolderName, curFileName);

				if (fileEntry != null) {
					return true;
				}

				return false;
			}
			catch (PortalException portalException) {
				if (_log.isDebugEnabled()) {
					_log.debug(portalException);
				}

				return false;
			}
		}

		private void _validateFile(
				String fileName, String contentType, long size)
			throws PortalException {

			if ((_attachmentsConfiguration.imageMaxSize() > 0) &&
				(size > _attachmentsConfiguration.imageMaxSize())) {

				throw new CPAttachmentFileEntrySizeException();
			}

			String extension = _file.getExtension(fileName);

			String[] imageExtensions =
				_attachmentsConfiguration.imageExtensions();

			for (String imageExtension : imageExtensions) {
				if (StringPool.STAR.equals(imageExtension) ||
					(imageExtension.equals(StringPool.PERIOD + extension) &&
					 MimeTypesUtil.getExtensionContentType(
						 imageExtension
					 ).equals(
						 contentType
					 ))) {

					return;
				}
			}

			throw new CPAttachmentFileEntryNameException(
				"Invalid image for file name " + fileName);
		}

		private final String _parameterName = "imageSelectorFileName";
		private final String _tempFolderName =
			UploadTempAttachmentMVCActionCommand.
				TempAttachmentsUploadFileEntryHandler.class.getName();

	}

}