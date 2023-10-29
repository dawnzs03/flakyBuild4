/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.dynamic.data.mapping.form.web.internal.portlet.action;

import com.liferay.document.library.kernel.exception.FileExtensionException;
import com.liferay.document.library.kernel.exception.FileNameException;
import com.liferay.document.library.kernel.exception.FileSizeException;
import com.liferay.document.library.kernel.exception.InvalidFileException;
import com.liferay.dynamic.data.mapping.constants.DDMActionKeys;
import com.liferay.dynamic.data.mapping.constants.DDMFormConstants;
import com.liferay.dynamic.data.mapping.constants.DDMPortletKeys;
import com.liferay.dynamic.data.mapping.form.web.internal.security.permission.resource.DDMFormInstancePermission;
import com.liferay.dynamic.data.mapping.form.web.internal.upload.DDMFormUploadValidator;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.object.exception.ObjectEntryValuesException;
import com.liferay.object.model.ObjectFieldSetting;
import com.liferay.object.service.ObjectFieldSettingLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portletfilerepository.PortletFileRepositoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.upload.UploadFileEntryHandler;
import com.liferay.upload.UploadHandler;
import com.liferay.upload.UploadResponseHandler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Roberto Díaz
 */
@Component(
	property = {
		"javax.portlet.name=" + DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM,
		"javax.portlet.name=" + DDMPortletKeys.DYNAMIC_DATA_MAPPING_FORM_ADMIN,
		"mvc.command.name=/dynamic_data_mapping_form/upload_file_entry"
	},
	service = MVCActionCommand.class
)
public class UploadFileEntryMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		_uploadHandler.upload(
			_ddmFormUploadFileEntryHandler, _ddmFormUploadResponseHandler,
			actionRequest, actionResponse);

		hideDefaultSuccessMessage(actionRequest);
	}

	@Reference
	private CompanyLocalService _companyLocalService;

	private final DDMFormUploadFileEntryHandler _ddmFormUploadFileEntryHandler =
		new DDMFormUploadFileEntryHandler();
	private final DDMFormUploadResponseHandler _ddmFormUploadResponseHandler =
		new DDMFormUploadResponseHandler();

	@Reference(target = "(upload.response.handler.system.default=true)")
	private UploadResponseHandler _defaultUploadResponseHandler;

	@Reference
	private Language _language;

	@Reference
	private ObjectFieldSettingLocalService _objectFieldSettingLocalService;

	@Reference
	private UploadHandler _uploadHandler;

	@Reference
	private UserLocalService _userLocalService;

	private class DDMFormUploadFileEntryHandler
		implements UploadFileEntryHandler {

		@Override
		public FileEntry upload(UploadPortletRequest uploadPortletRequest)
			throws IOException, PortalException {

			File file = null;

			try (InputStream inputStream = uploadPortletRequest.getFileAsStream(
					"file")) {

				long formInstanceId = ParamUtil.getLong(
					uploadPortletRequest, "formInstanceId");
				long groupId = ParamUtil.getLong(
					uploadPortletRequest, "groupId");
				long folderId = ParamUtil.getLong(
					uploadPortletRequest, "folderId");

				file = FileUtil.createTempFile(inputStream);

				String fileName = uploadPortletRequest.getFileName("file");

				DDMFormUploadValidator.validateFileSize(file, fileName);

				long objectFieldId = ParamUtil.getLong(
					uploadPortletRequest, "objectFieldId");

				if (objectFieldId > 0) {
					_validateAttachmentObjectField(fileName, objectFieldId);
				}

				DDMFormUploadValidator.validateFileExtension(fileName);

				ThemeDisplay themeDisplay =
					(ThemeDisplay)uploadPortletRequest.getAttribute(
						WebKeys.THEME_DISPLAY);

				return addFileEntry(
					formInstanceId, groupId, folderId, file, fileName,
					MimeTypesUtil.getContentType(file, fileName), themeDisplay);
			}
			finally {
				FileUtil.delete(file);
			}
		}

		protected FileEntry addFileEntry(
				long formInstanceId, long groupId, long folderId, File file,
				String fileName, String mimeType, ThemeDisplay themeDisplay)
			throws PortalException {

			if (!DDMFormInstancePermission.contains(
					themeDisplay.getPermissionChecker(), formInstanceId,
					DDMActionKeys.ADD_FORM_INSTANCE_RECORD)) {

				throw new PrincipalException.MustHavePermission(
					themeDisplay.getPermissionChecker(),
					DDMFormInstance.class.getName(), formInstanceId,
					DDMActionKeys.ADD_FORM_INSTANCE_RECORD);
			}

			long userId = _getDDMFormDefaultUserId(themeDisplay.getCompanyId());

			String uniqueFileName = PortletFileRepositoryUtil.getUniqueFileName(
				groupId, folderId, fileName);

			return PortletFileRepositoryUtil.addPortletFileEntry(
				null, groupId, userId, DDMFormInstance.class.getName(), 0,
				DDMFormConstants.SERVICE_NAME, folderId, file, uniqueFileName,
				mimeType, true);
		}

		private long _getDDMFormDefaultUserId(long companyId)
			throws PortalException {

			return _userLocalService.getUserIdByScreenName(
				companyId, DDMFormConstants.DDM_FORM_DEFAULT_USER_SCREEN_NAME);
		}

		private void _validateAttachmentObjectField(
				String fileName, long objectFieldId)
			throws PortalException {

			ObjectFieldSetting objectFieldSetting =
				_objectFieldSettingLocalService.fetchObjectFieldSetting(
					objectFieldId, "acceptedFileExtensions");

			String value = objectFieldSetting.getValue();

			if (!ArrayUtil.contains(
					value.split("\\s*,\\s*"), FileUtil.getExtension(fileName),
					true)) {

				throw new ObjectEntryValuesException.InvalidFileExtension(
					FileUtil.getExtension(fileName), fileName);
			}
		}

	}

	private class DDMFormUploadResponseHandler
		implements UploadResponseHandler {

		@Override
		public JSONObject onFailure(
				PortletRequest portletRequest, PortalException portalException)
			throws PortalException {

			if (_log.isDebugEnabled()) {
				_log.debug(portalException);
			}

			JSONObject jsonObject = _defaultUploadResponseHandler.onFailure(
				portletRequest, portalException);

			String errorMessage = StringPool.BLANK;

			ThemeDisplay themeDisplay =
				(ThemeDisplay)portletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			if (portalException instanceof FileExtensionException) {
				errorMessage = themeDisplay.translate(
					"please-enter-a-file-with-a-valid-extension-x",
					StringUtil.merge(
						DDMFormUploadValidator.getGuestUploadFileExtensions(),
						StringPool.COMMA_AND_SPACE));
			}
			else if (portalException instanceof FileNameException) {
				errorMessage = themeDisplay.translate(
					"please-enter-a-file-with-a-valid-file-name");
			}
			else if (portalException instanceof FileSizeException) {
				errorMessage = themeDisplay.translate(
					"please-enter-a-file-with-a-valid-file-size-no-larger-" +
						"than-x",
					_language.formatStorageSize(
						DDMFormUploadValidator.getGuestUploadMaximumFileSize(),
						themeDisplay.getLocale()));
			}
			else if (portalException instanceof InvalidFileException) {
				errorMessage = themeDisplay.translate(
					"please-enter-a-valid-file");
			}
			else if (portalException instanceof
						ObjectEntryValuesException.InvalidFileExtension) {

				ObjectFieldSetting objectFieldSetting =
					_objectFieldSettingLocalService.fetchObjectFieldSetting(
						ParamUtil.getLong(portletRequest, "objectFieldId"),
						"acceptedFileExtensions");

				errorMessage = themeDisplay.translate(
					"please-enter-a-file-with-a-valid-extension-x",
					objectFieldSetting.getValue());
			}
			else {
				errorMessage = themeDisplay.translate(
					"an-unexpected-error-occurred-while-uploading-your-file");
			}

			return jsonObject.put(
				"error", JSONUtil.put("message", errorMessage));
		}

		@Override
		public JSONObject onSuccess(
				UploadPortletRequest uploadPortletRequest, FileEntry fileEntry)
			throws PortalException {

			return _defaultUploadResponseHandler.onSuccess(
				uploadPortletRequest, fileEntry);
		}

		private final Log _log = LogFactoryUtil.getLog(
			DDMFormUploadResponseHandler.class);

	}

}