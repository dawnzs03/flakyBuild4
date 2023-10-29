/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayAlert from '@clayui/alert';
import ClayButton from '@clayui/button';
import ClayForm from '@clayui/form';
import ClayModal, {ClayModalProvider, useModal} from '@clayui/modal';
import {
	API,
	FormError,
	Input,
	REQUIRED_MSG,
	getLocalizableLabel,
	invalidateLocalizableLabelRequired,
	openToast,
	useForm,
} from '@liferay/object-js-components-web';
import {InputLocalized} from 'frontend-js-components-web';
import {sub} from 'frontend-js-web';
import React, {useState} from 'react';

import {defaultLanguageId} from '../../utils/constants';

interface ModalEditObjectFolderProps {
	externalReferenceCode: string;
	handleOnClose: () => void;
	id: number;
	initialLabel?: LocalizedValue<string>;
	name?: string;
}

type TInitialValues = {
	externalReferenceCode: string;
	label?: LocalizedValue<string>;
	name?: string;
};

export function ModalEditObjectFolder({
	externalReferenceCode,
	handleOnClose,
	id,
	initialLabel,
	name,
}: ModalEditObjectFolderProps) {
	const [error, setError] = useState<string>('');

	const [selectedLocale, setSelectedLocale] = useState<
		Liferay.Language.Locale
	>(defaultLanguageId);

	const {observer, onClose} = useModal({
		onClose: () => handleOnClose(),
	});

	const initialValues: TInitialValues = {
		externalReferenceCode,
		label: initialLabel,
		name,
	};

	const onSubmit = async (values: TInitialValues) => {
		const objectFolder: Partial<ObjectFolder> = values;

		try {
			await API.save({
				item: objectFolder,
				method: 'PATCH',
				url: `/o/object-admin/v1.0/object-folders/${id}`,
			});

			onClose();

			openToast({
				message: sub(
					Liferay.Language.get('x-was-saved-successfully'),
					`<strong>${getLocalizableLabel(
						defaultLanguageId,
						objectFolder.label,
						objectFolder.name
					)}</strong>`
				),
				type: 'success',
			});

			setTimeout(() => window.location.reload(), 1000);
		}
		catch (error) {
			setError((error as Error).message);
		}
	};

	const validate = (values: TInitialValues) => {
		const errors: FormError<TInitialValues> = {};

		if (invalidateLocalizableLabelRequired(values.label)) {
			errors.label = REQUIRED_MSG;
		}

		if (!values.externalReferenceCode) {
			errors.externalReferenceCode = REQUIRED_MSG;
		}

		return errors;
	};

	const {errors, handleChange, handleSubmit, setValues, values} = useForm({
		initialValues,
		onSubmit,
		validate,
	});

	return (
		<ClayModalProvider>
			<ClayModal observer={observer}>
				<ClayForm onSubmit={handleSubmit}>
					<ClayModal.Header>
						{Liferay.Language.get('edit-label-and-erc')}
					</ClayModal.Header>

					<ClayModal.Body>
						{error && (
							<ClayAlert displayType="danger">{error}</ClayAlert>
						)}

						<InputLocalized
							error={errors.label}
							label={Liferay.Language.get('label')}
							onChange={(label) => setValues({label})}
							onSelectedLocaleChange={setSelectedLocale}
							required
							selectedLocale={selectedLocale}
							translations={
								values.label as LocalizedValue<string>
							}
						/>

						<Input
							disabled
							label={Liferay.Language.get('name')}
							name="name"
							required
							value={values.name}
						/>

						<Input
							error={errors.externalReferenceCode}
							feedbackMessage={Liferay.Language.get(
								'unique-key-for-referencing-the-object-folder'
							)}
							label={Liferay.Language.get(
								'external-reference-code'
							)}
							name="externalReferenceCode"
							onChange={handleChange}
							required
							value={values.externalReferenceCode}
						/>
					</ClayModal.Body>

					<ClayModal.Footer
						last={
							<ClayButton.Group key={1} spaced>
								<ClayButton
									displayType="secondary"
									onClick={() => onClose()}
								>
									{Liferay.Language.get('cancel')}
								</ClayButton>

								<ClayButton displayType="primary" type="submit">
									{Liferay.Language.get('save')}
								</ClayButton>
							</ClayButton.Group>
						}
					/>
				</ClayForm>
			</ClayModal>
		</ClayModalProvider>
	);
}
