/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayAlert from '@clayui/alert';
import ClayButton from '@clayui/button';
import ClayForm from '@clayui/form';
import ClayModal, {useModal} from '@clayui/modal';
import React, {useState} from 'react';

import {FormError, useForm} from '../../hooks/useForm';
import {save} from '../../utils/api';
import {REQUIRED_MSG} from '../../utils/constants';
import {Input} from '../Input';
import {openToast} from '../SidePanelContent';
import {Entity} from './index';

interface ModalEditExternalReferenceCodeProps {
	externalReferenceCode: string;
	handleOnClose: () => void;
	helpMessage: string;
	onExternalReferenceCodeChange?: (value: string) => void;
	onGetEntity: () => Promise<Entity>;
	saveURL: string;
	setExternalReferenceCode: (value: string) => void;
}

type TInitialValues = {
	externalReferenceCode: string;
};

export function ModalEditExternalReferenceCode({
	externalReferenceCode,
	handleOnClose,
	helpMessage,
	onExternalReferenceCodeChange,
	onGetEntity,
	saveURL,
	setExternalReferenceCode,
}: ModalEditExternalReferenceCodeProps) {
	const [error, setError] = useState<string>('');
	const initialValues: TInitialValues = {
		externalReferenceCode,
	};

	const {observer, onClose} = useModal({
		onClose: () => {
			handleOnClose();
		},
	});

	const onSubmit = async ({externalReferenceCode}: TInitialValues) => {
		try {
			const entity = await onGetEntity();

			await save({
				item: {
					...entity,
					externalReferenceCode,
				},
				url: `${saveURL}`,
			});

			setExternalReferenceCode(externalReferenceCode);

			if (onExternalReferenceCodeChange) {
				onExternalReferenceCodeChange(externalReferenceCode);
			}

			onClose();
			openToast({
				message: Liferay.Language.get(
					'your-request-completed-successfully'
				),
			});
		}
		catch (error) {
			setError((error as Error).message);
		}
	};

	const validate = ({externalReferenceCode}: TInitialValues) => {
		const errors: FormError<TInitialValues> = {};

		if (externalReferenceCode === '') {
			errors.externalReferenceCode = REQUIRED_MSG;
		}

		return errors;
	};

	const {errors, handleChange, handleSubmit, values} = useForm({
		initialValues,
		onSubmit,
		validate,
	});

	return (
		<ClayModal center observer={observer}>
			<ClayForm onSubmit={handleSubmit}>
				<ClayModal.Header>
					{Liferay.Util.sub(
						Liferay.Language.get('edit-x'),
						Liferay.Language.get('external-reference-code')
					)}
				</ClayModal.Header>

				<ClayModal.Body>
					{error && (
						<ClayAlert displayType="danger">{error}</ClayAlert>
					)}

					<Input
						error={errors.externalReferenceCode}
						feedbackMessage={helpMessage}
						id="externalReferenceCode"
						label={Liferay.Language.get('external-reference-code')}
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
	);
}
