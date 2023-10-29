/**
 * SPDX-FileCopyrightText: (c) 2023 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayButton from '@clayui/button';
import ClayForm from '@clayui/form';
import ClayModal, {ClayModalProvider, useModal} from '@clayui/modal';
import React from 'react';

interface RedirectToEditObjectDetailsModalProps {
	handleOnClose: () => void;
	viewObjectDetailsURL: string;
}

export function RedirectToEditObjectDetailsModal({
	handleOnClose,
	viewObjectDetailsURL,
}: RedirectToEditObjectDetailsModalProps) {
	const {observer, onClose} = useModal({
		onClose: () => handleOnClose(),
	});

	const handleSubmit = () => {
		window.open(viewObjectDetailsURL, '_blank');
	};

	return (
		<>
			<ClayModalProvider>
				<ClayModal center observer={observer} status="info">
					<ClayForm>
						<ClayModal.Header>
							{Liferay.Language.get(
								'leaving-object-model-builder'
							)}
						</ClayModal.Header>

						<ClayModal.Body>
							<p>
								{Liferay.Language.get(
									'you-are-leaving-object-model-builder-and-opening-the-object-admin-page-view-in-a-new-tab'
								)}
							</p>
						</ClayModal.Body>

						<ClayModal.Footer
							last={
								<ClayButton.Group key={1} spaced>
									<ClayButton
										displayType="secondary"
										onClick={onClose}
									>
										{Liferay.Language.get('Cancel')}
									</ClayButton>

									<ClayButton
										displayType="primary"
										onClick={handleSubmit}
									>
										{Liferay.Language.get('open-page-view')}
									</ClayButton>
								</ClayButton.Group>
							}
						/>
					</ClayForm>
				</ClayModal>
			</ClayModalProvider>
		</>
	);
}
