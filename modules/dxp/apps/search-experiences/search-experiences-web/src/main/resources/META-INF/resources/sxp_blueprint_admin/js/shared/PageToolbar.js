/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayButton from '@clayui/button';
import ClayIcon from '@clayui/icon';
import ClayLayout from '@clayui/layout';
import ClayLink from '@clayui/link';
import {useModal} from '@clayui/modal';
import ClayNavigationBar from '@clayui/navigation-bar';
import ClayToolbar from '@clayui/toolbar';
import {ClayTooltipProvider} from '@clayui/tooltip';
import PropTypes from 'prop-types';
import React, {useContext, useState} from 'react';

import formatLocaleWithDashes from '../utils/language/format_locale_with_dashes';
import formatLocaleWithUnderscores from '../utils/language/format_locale_with_underscores';
import EditTitleModal from './EditTitleModal';
import ThemeContext from './ThemeContext';

/**
 * Determines which language to display the title and description, by
 * checking what's available in title. This prevents title and description
 * from being displayed in two different languages. Preference is given to
 * the locale language, then the defaultLanguage. If neither are available,
 * it chooses the first available language.
 * @param {Object} titleI18n Titles in all available locales
 * @param {string} locale
 * @param {string} defaultLocale
 * @param {Object} availableLanguages
 * @returns {string}
 */
const getDisplayLocale = (
	titleI18n,
	locale,
	defaultLocale,
	availableLanguages
) => {
	if (titleI18n[formatLocaleWithDashes(locale)]) {
		return formatLocaleWithDashes(locale);
	}

	if (titleI18n[formatLocaleWithDashes(defaultLocale)]) {
		return formatLocaleWithDashes(defaultLocale);
	}

	if (
		Object.keys(titleI18n).length &&
		Object.keys(availableLanguages).includes(
			formatLocaleWithUnderscores(Object.keys(titleI18n)[0])
		)
	) {
		return Object.keys(titleI18n)[0];
	}

	return formatLocaleWithDashes(defaultLocale);
};

export default function PageToolbar({
	children,
	description,
	descriptionI18n,
	disableTitleAndDescriptionModal = false,
	isSubmitting,
	onCancel,
	onChangeTab,
	onSubmit,
	onTitleAndDescriptionChange,
	readOnly = false,
	tab,
	tabs,
	title,
	titleAndDescriptionEdited,
	titleI18n,
}) {
	const {availableLanguages, defaultLocale, locale} = useContext(
		ThemeContext
	);

	const [modalFieldFocus, setModalFieldFocus] = useState('title');
	const [modalVisible, setModalVisible] = useState(false);

	const {observer, onClose} = useModal({
		onClose: () => setModalVisible(false),
	});

	const displayLocale = getDisplayLocale(
		titleI18n,
		locale,
		defaultLocale,
		availableLanguages
	);

	const _handleClickEdit = (fieldFocus) => () => {
		setModalFieldFocus(fieldFocus);

		setModalVisible(true);
	};

	return (
		<div className="page-toolbar-root">
			<ClayToolbar
				aria-label={Liferay.Language.get('page-toolbar')}
				light
			>
				<ClayLayout.ContainerFluid>
					<ClayToolbar.Nav>
						<ClayToolbar.Item className="text-left" expand>
							{modalVisible && (
								<EditTitleModal
									disabled={disableTitleAndDescriptionModal}
									displayLocale={displayLocale}
									fieldFocus={modalFieldFocus}
									initialDescriptionI18n={descriptionI18n}
									initialTitleI18n={titleI18n}
									observer={observer}
									onClose={onClose}
									onSubmit={onTitleAndDescriptionChange}
								/>
							)}

							{readOnly ? (
								<div>
									<div className="entry-title text-truncate">
										{title || (
											<span className="entry-title-blank">
												{Liferay.Language.get(
													'untitled'
												)}
											</span>
										)}
									</div>

									<ClayTooltipProvider>
										<div
											className="entry-description text-truncate"
											data-tooltip-align="bottom"
											title={description}
										>
											{description || (
												<span className="entry-description-blank">
													{Liferay.Language.get(
														'no-description'
													)}
												</span>
											)}
										</div>
									</ClayTooltipProvider>
								</div>
							) : (
								<div>
									<ClayButton
										aria-label={Liferay.Language.get(
											'edit-title'
										)}
										className="entry-heading-edit-button"
										displayType="unstyled"
										monospaced={false}
										onClick={_handleClickEdit('title')}
									>
										<div className="entry-title text-truncate">
											{(!titleAndDescriptionEdited
												? title
												: titleI18n[displayLocale]) || (
												<span className="entry-title-blank">
													{Liferay.Language.get(
														'untitled'
													)}
												</span>
											)}

											<ClayIcon
												className="entry-heading-edit-icon"
												symbol="pencil"
											/>
										</div>
									</ClayButton>

									<ClayButton
										aria-label={Liferay.Language.get(
											'edit-description'
										)}
										className="entry-heading-edit-button"
										displayType="unstyled"
										monospaced={false}
										onClick={_handleClickEdit(
											'description'
										)}
									>
										<ClayTooltipProvider>
											<div
												className="entry-description text-truncate"
												data-tooltip-align="bottom"
												title={
													!titleAndDescriptionEdited
														? description
														: descriptionI18n[
																displayLocale
														  ]
												}
											>
												{(!titleAndDescriptionEdited
													? description
													: descriptionI18n[
															displayLocale
													  ]) || (
													<span className="entry-description-blank">
														{Liferay.Language.get(
															'no-description'
														)}
													</span>
												)}

												<ClayIcon
													className="entry-heading-edit-icon"
													symbol="pencil"
												/>
											</div>
										</ClayTooltipProvider>
									</ClayButton>
								</div>
							)}
						</ClayToolbar.Item>

						{children}

						{!!children && (
							<ClayToolbar.Item>
								<div className="tbar-divider" />
							</ClayToolbar.Item>
						)}

						{readOnly ? (
							<ClayToolbar.Item>
								<ClayLink
									displayType="secondary"
									href={onCancel}
									outline="secondary"
								>
									{Liferay.Language.get('close')}
								</ClayLink>
							</ClayToolbar.Item>
						) : (
							<>
								<ClayToolbar.Item>
									<ClayLink
										displayType="secondary"
										href={onCancel}
										outline="secondary"
									>
										{Liferay.Language.get('cancel')}
									</ClayLink>
								</ClayToolbar.Item>

								<ClayToolbar.Item>
									<ClayButton
										disabled={isSubmitting}
										onClick={onSubmit}
										small
										type="submit"
									>
										{Liferay.Language.get('save')}
									</ClayButton>
								</ClayToolbar.Item>
							</>
						)}
					</ClayToolbar.Nav>
				</ClayLayout.ContainerFluid>
			</ClayToolbar>

			{onChangeTab && (
				<ClayNavigationBar
					aria-label={Liferay.Language.get('navigation')}
					triggerLabel={tabs[tab]}
				>
					{Object.keys(tabs).map((tabKey) => (
						<ClayNavigationBar.Item
							active={tab === tabKey}
							key={tabKey}
						>
							<ClayButton onClick={() => onChangeTab(tabKey)}>
								{tabs[tabKey]}
							</ClayButton>
						</ClayNavigationBar.Item>
					))}
				</ClayNavigationBar>
			)}
		</div>
	);
}

PageToolbar.propTypes = {
	description: PropTypes.string,
	descriptionI18n: PropTypes.object,
	disableTitleAndDescriptionModal: PropTypes.bool,
	isSubmitting: PropTypes.bool,
	onCancel: PropTypes.string.isRequired,
	onChangeTab: PropTypes.func,
	onSubmit: PropTypes.func.isRequired,
	onTitleAndDescriptionChange: PropTypes.func,
	readOnly: PropTypes.bool,
	tab: PropTypes.string,
	tabs: PropTypes.object,
	title: PropTypes.string,
	titleAndDescriptionEdited: PropTypes.bool,
	titleI18n: PropTypes.object,
};
