/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayAlert from '@clayui/alert';
import ClayButton from '@clayui/button';
import ClayDatePicker from '@clayui/date-picker';
import ClayDropDown from '@clayui/drop-down';
import ClayForm, {
	ClayInput,
	ClayRadio,
	ClayRadioGroup,
	ClaySelectWithOption,
} from '@clayui/form';
import ClayIcon from '@clayui/icon';
import ClayLabel from '@clayui/label';
import ClayLayout from '@clayui/layout';
import ClayModal from '@clayui/modal';
import classNames from 'classnames';
import {format, getYear, isBefore, isEqual} from 'date-fns';
import {fetch, navigate, openModal, sub} from 'frontend-js-web';
import fuzzy from 'fuzzy';
import React, {useEffect, useState} from 'react';

import {API_URL, OBJECT_RELATIONSHIP} from '../Constants';
import {FDSViewType} from '../FDSViews';
import {IPickList, getAllPicklists, getFields} from '../api';
import CheckboxMultiSelect from '../components/CheckboxMultiSelect';
import OrderableTable from '../components/OrderableTable';
import ValidationFeedback from '../components/ValidationFeedback';
import openDefaultFailureToast from '../utils/openDefaultFailureToast';
import openDefaultSuccessToast from '../utils/openDefaultSuccessToast';

import '../../css/Filters.scss';

enum EFilterType {
	DATE_RANGE = 'DATE_RANGE',
	SELECTION = 'SELECTION',
}

enum EFieldFormat {
	DATE = 'date',
	DATE_TIME = 'date-time',
	STRING = 'string',
}

interface IField {
	format: EFieldFormat;
	label: string;
	name: string;
	type: string;
}

interface IFilter {
	fieldName: string;
	id: number;
	label: string;
	name: string;
	type: string;
}

interface IDateFilter extends IFilter {
	from: string;
	to: string;
}

interface ISelectionFilter extends IFilter {
	include: boolean;
	listTypeDefinitionId: string;
	multiple: boolean;
	preselectedValues: string;
}

type FilterCollection = Array<IDateFilter | ISelectionFilter>;

interface IPropsAddFDSFilterModalContent {
	closeModal: Function;
	fdsView: FDSViewType;
	fieldNames?: string[];
	fields: IField[];
	filter?: IDateFilter | ISelectionFilter;
	filterType?: EFilterType;
	namespace: string;
	onSave: (newFilter: IFilter) => void;
}

function AddFDSFilterModalContent({
	closeModal,
	fdsView,
	fieldNames,
	fields,
	filter,
	filterType,
	namespace,
	onSave,
}: IPropsAddFDSFilterModalContent) {
	const [fieldInUseValidationError, setFieldInUseValidationError] = useState<
		boolean
	>();
	const [from, setFrom] = useState<string>(
		(filter as IDateFilter)?.from ?? format(new Date(), 'yyyy-MM-dd')
	);
	const [includeMode, setIncludeMode] = useState<string>(
		filter
			? (filter as ISelectionFilter)?.include
				? 'include'
				: 'exclude'
			: 'include'
	);
	const [isValidDateRange, setIsValidDateRange] = useState<boolean>(true);
	const [saveButtonDisabled, setSaveButtonDisabled] = useState<boolean>();
	const [multiple, setMultiple] = useState<boolean>(
		(filter as ISelectionFilter)?.multiple ?? true
	);
	const [name, setName] = useState(filter?.name || '');
	const [picklists, setPicklists] = useState<IPickList[]>([]);
	const [preselectedValues, setPreselectedValues] = useState<any[]>([]);
	const [preselectedValueInput, setPreselectedValueInput] = useState('');
	const [selectedField, setSelectedField] = useState<IField | null>(
		fields.find((item) => item.name === filter?.fieldName) || null
	);
	const [selectedPicklist, setSelectedPicklist] = useState<IPickList>();
	const [to, setTo] = useState<string>(
		(filter as IDateFilter)?.to ?? format(new Date(), 'yyyy-MM-dd')
	);

	useEffect(() => {
		getAllPicklists().then((items) => {
			setPicklists(items);

			const newVal = items.find(
				(item) =>
					String(item.id) === (filter as any)?.listTypeDefinitionId
			);

			if (newVal) {
				setSelectedPicklist(newVal);

				setPreselectedValues(
					newVal.listTypeEntries.filter((item) =>
						JSON.parse(
							(filter as ISelectionFilter).preselectedValues ||
								'[]'
						).includes(item.id)
					)
				);
			}
		});
	}, [filter]);

	useEffect(() => {
		let isValid = true;

		const dateTo = new Date(to);

		const dateFrom = new Date(from);

		if (to && from) {
			isValid = isBefore(dateFrom, dateTo) || isEqual(dateFrom, dateTo);
		}

		setIsValidDateRange(isValid);
	}, [from, to]);

	const handleFilterSave = async () => {
		setSaveButtonDisabled(true);

		if (!selectedField) {
			openDefaultFailureToast();

			return null;
		}

		let body: any = {
			fieldName: selectedField.name,
			name: name || selectedField.label,
		};

		let displayType: string = '';
		let url: string = '';

		if (
			selectedField.format === EFieldFormat.DATE_TIME ||
			selectedField.format === EFieldFormat.DATE
		) {
			url = API_URL.FDS_DATE_FILTERS;

			body = {
				...body,
				[OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DATE_FILTER_ID]: fdsView.id,
				from,
				to,
				type: selectedField.format,
			};

			displayType = Liferay.Language.get('date-filter');
		}
		else {
			url = API_URL.FDS_DYNAMIC_FILTERS;

			body = {
				...body,
				[OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DYNAMIC_FILTER_ID]:
					fdsView.id,
				include: includeMode === 'include',
				listTypeDefinitionId: selectedPicklist?.id,
				multiple,
				preselectedValues: preselectedValues.map((item) => item.id),
			};

			displayType = Liferay.Language.get('dynamic-filter');
		}

		let method = 'POST';

		if (filter) {
			method = 'PUT';
			url = `${url}/${filter.id}`;
		}

		const response = await fetch(url, {
			body: JSON.stringify(body),
			headers: {
				'Accept': 'application/json',
				'Content-Type': 'application/json',
			},
			method,
		});

		if (!response.ok) {
			setSaveButtonDisabled(false);

			openDefaultFailureToast();

			return null;
		}

		const responseJSON = await response.json();

		openDefaultSuccessToast();

		onSave({...responseJSON, displayType});

		closeModal();
	};

	const isValidSingleMode =
		multiple || (!multiple && !(preselectedValues.length > 1));

	const fromFormElementId = `${namespace}From`;
	const includeModeFormElementId = `${namespace}IncludeMode`;
	const multipleFormElementId = `${namespace}Multiple`;
	const nameFormElementId = `${namespace}Name`;
	const preselectedValuesFormElementId = `${namespace}PreselectedValues`;
	const selectedFieldFormElementId = `${namespace}SelectedField`;
	const sourceOptionFormElementId = `${namespace}SourceOption`;
	const toFormElementId = `${namespace}To`;

	const filteredSourceItems = !selectedPicklist
		? []
		: selectedPicklist.listTypeEntries
				.filter((item) => fuzzy.match(preselectedValueInput, item.name))
				.map((item) => ({
					label: item.name,
					value: String(item.id),
				}));

	const inUseFields = fields.map((item) =>
		fieldNames?.includes(item.name) ? item.name : undefined
	);

	const CellRendererDropdown = ({
		cellRenderers,
		inUseFields,
		namespace,
		onItemClick,
	}: {
		cellRenderers: IField[];
		inUseFields: (string | undefined)[];
		namespace: string;
		onItemClick: Function;
	}) => {
		return (
			<ClayDropDown
				closeOnClick
				menuElementAttrs={{
					className: 'fds-cell-renderers-dropdown-menu',
				}}
				trigger={
					<ClayButton
						aria-labelledby={`${namespace}cellRenderersLabel`}
						className="form-control form-control-select form-control-select-secondary"
						displayType="secondary"
					>
						{selectedField
							? selectedField.label
							: Liferay.Language.get('select')}
					</ClayButton>
				}
			>
				<ClayDropDown.ItemList items={cellRenderers} role="listbox">
					{cellRenderers.map((cellRenderer) => (
						<ClayDropDown.Item
							className="align-items-center d-flex justify-content-between"
							disabled={
								!!filter ||
								(filterType === EFilterType.SELECTION &&
									!picklists.length)
							}
							key={cellRenderer.name}
							onClick={() => onItemClick(cellRenderer)}
							roleItem="option"
						>
							{cellRenderer.label}

							{inUseFields.includes(cellRenderer.name) && (
								<ClayLabel displayType="info">
									{Liferay.Language.get('in-use')}
								</ClayLabel>
							)}
						</ClayDropDown.Item>
					))}
				</ClayDropDown.ItemList>
			</ClayDropDown>
		);
	};

	return (
		<>
			<ClayModal.Header>
				{filter &&
					sub(Liferay.Language.get('edit-x-filter'), [filter.name])}

				{!filter &&
					filterType === EFilterType.SELECTION &&
					Liferay.Language.get('new-selection-filter')}

				{!filter &&
					filterType !== EFilterType.SELECTION &&
					Liferay.Language.get('new-date-range-filter')}
			</ClayModal.Header>

			<ClayModal.Body>
				<ClayForm.Group>
					<label htmlFor={nameFormElementId}>
						{Liferay.Language.get('name')}

						<span
							className="label-icon lfr-portal-tooltip ml-2"
							title={Liferay.Language.get(
								'if-this-value-is-not-provided,-the-name-will-default-to-the-field-name'
							)}
						>
							<ClayIcon symbol="question-circle-full" />
						</span>
					</label>

					<ClayInput
						aria-label={Liferay.Language.get('name')}
						name={nameFormElementId}
						onChange={(event) => setName(event.target.value)}
						placeholder={
							selectedField?.label || Liferay.Language.get('name')
						}
						value={name}
					/>
				</ClayForm.Group>

				<ClayForm.Group
					className={classNames({
						'has-error': fieldInUseValidationError,
					})}
				>
					<label htmlFor={selectedFieldFormElementId}>
						{Liferay.Language.get('filter-by')}
					</label>

					<CellRendererDropdown
						cellRenderers={fields}
						inUseFields={inUseFields}
						namespace={namespace}
						onItemClick={(item: IField) => {
							const newVal = fields.find((field) => {
								return field.name === item.label;
							});

							if (newVal) {
								const inUse = inUseFields.includes(newVal.name);

								setFieldInUseValidationError(inUse);
								setSaveButtonDisabled(inUse);

								setSelectedField(newVal);
							}
						}}
					/>

					{fieldInUseValidationError && (
						<ValidationFeedback
							message={Liferay.Language.get(
								'this-field-is-being-used-by-another-filter'
							)}
						/>
					)}
				</ClayForm.Group>

				{filterType === EFilterType.SELECTION && !picklists.length && (
					<ClayAlert displayType="info" title="Info">
						{Liferay.Language.get(
							'no-filter-sources-are-available.-create-a-picklist-or-a-vocabulary-for-this-type-of-filter'
						)}
					</ClayAlert>
				)}

				{selectedField &&
					filterType === EFilterType.DATE_RANGE &&
					!fieldInUseValidationError && (
						<ClayForm.Group className="form-group-autofit">
							<div
								className={classNames('form-group-item', {
									'has-error': !isValidDateRange,
								})}
							>
								<label htmlFor={fromFormElementId}>
									{Liferay.Language.get('from')}
								</label>

								<ClayDatePicker
									inputName={fromFormElementId}
									onChange={setFrom}
									placeholder="YYYY-MM-DD"
									value={format(
										from ? new Date(from) : new Date(),
										'yyyy-MM-dd'
									)}
									years={{
										end: getYear(new Date()) + 25,
										start: getYear(new Date()) - 50,
									}}
								/>

								{!isValidDateRange && (
									<ClayForm.FeedbackGroup>
										<ClayForm.FeedbackItem>
											<ClayForm.FeedbackIndicator symbol="exclamation-full" />

											{Liferay.Language.get(
												'date-range-is-invalid.-from-must-be-before-to'
											)}
										</ClayForm.FeedbackItem>
									</ClayForm.FeedbackGroup>
								)}
							</div>

							<div className="form-group-item">
								<label htmlFor={toFormElementId}>
									{Liferay.Language.get('to')}
								</label>

								<ClayDatePicker
									inputName={toFormElementId}
									onChange={setTo}
									placeholder="YYYY-MM-DD"
									value={format(
										to ? new Date(to) : new Date(),
										'yyyy-MM-dd'
									)}
									years={{
										end: getYear(new Date()) + 25,
										start: getYear(new Date()) - 50,
									}}
								/>
							</div>
						</ClayForm.Group>
					)}

				{selectedField &&
					filterType === EFilterType.SELECTION &&
					!fieldInUseValidationError && (
						<>
							<ClayForm.Group>
								<label htmlFor={sourceOptionFormElementId}>
									{Liferay.Language.get('source-options')}

									<span
										className="label-icon lfr-portal-tooltip ml-2"
										title={Liferay.Language.get(
											'choose-a-picklist-to-associate-with-this-filter'
										)}
									>
										<ClayIcon symbol="question-circle-full" />
									</span>
								</label>

								<ClaySelectWithOption
									aria-label={Liferay.Language.get(
										'source-options'
									)}
									name={sourceOptionFormElementId}
									onChange={(event) => {
										setSelectedPicklist(
											picklists.find(
												(item) =>
													String(item.id) ===
													event.target.value
											)
										);

										setPreselectedValues([]);
									}}
									options={[
										{
											disabled: true,
											label: Liferay.Language.get(
												'select'
											),
											selected: true,
											value: '',
										},
										...picklists.map((item) => ({
											label: item.name,
											value: item.id,
										})),
									]}
									title={Liferay.Language.get(
										'source-options'
									)}
									value={selectedPicklist?.id}
								/>
							</ClayForm.Group>

							{selectedPicklist && (
								<>
									<ClayForm.Group>
										<label htmlFor={multipleFormElementId}>
											{Liferay.Language.get('selection')}

											<span
												className="label-icon lfr-portal-tooltip ml-2"
												title={Liferay.Language.get(
													'determines-how-many-preselected-values-for-the-filter-can-be-added'
												)}
											>
												<ClayIcon symbol="question-circle-full" />
											</span>
										</label>

										<ClayRadioGroup
											name={multipleFormElementId}
											onChange={(newVal: any) => {
												setMultiple(newVal === 'true');
											}}
											value={multiple ? 'true' : 'false'}
										>
											<ClayRadio
												label={Liferay.Language.get(
													'multiple'
												)}
												value="true"
											/>

											<ClayRadio
												label={Liferay.Language.get(
													'single'
												)}
												value="false"
											/>
										</ClayRadioGroup>
									</ClayForm.Group>
									<ClayForm.Group
										className={classNames({
											'has-error': !isValidSingleMode,
										})}
									>
										<label
											htmlFor={
												preselectedValuesFormElementId
											}
										>
											{Liferay.Language.get(
												'preselected-values'
											)}

											<span
												className="label-icon lfr-portal-tooltip ml-2"
												title={Liferay.Language.get(
													'choose-values-to-preselect-for-your-filters-source-option'
												)}
											>
												<ClayIcon symbol="question-circle-full" />
											</span>
										</label>

										<CheckboxMultiSelect
											allowsCustomLabel={false}
											aria-label={Liferay.Language.get(
												'preselected-values'
											)}
											inputName={
												preselectedValuesFormElementId
											}
											items={preselectedValues.map(
												(item) => ({
													label: item.name,
													value: String(item.id),
												})
											)}
											loadingState={4}
											onChange={setPreselectedValueInput}
											onItemsChange={(
												selectedItems: any
											) =>
												setPreselectedValues(
													selectedItems.map(
														({value}: any) => {
															return selectedPicklist.listTypeEntries.find(
																(item) =>
																	String(
																		item.id
																	) ===
																	String(
																		value
																	)
															);
														}
													)
												)
											}
											placeholder={Liferay.Language.get(
												'select-a-default-value-for-your-filter'
											)}
											sourceItems={filteredSourceItems}
											value={preselectedValueInput}
										/>

										{!isValidSingleMode && (
											<ClayForm.FeedbackGroup>
												<ClayForm.FeedbackItem>
													<ClayForm.FeedbackIndicator symbol="exclamation-full" />

													{Liferay.Language.get(
														'only-one-value-is-allowed-in-single-selection-mode'
													)}
												</ClayForm.FeedbackItem>
											</ClayForm.FeedbackGroup>
										)}
									</ClayForm.Group>
									<ClayForm.Group>
										<label
											htmlFor={includeModeFormElementId}
										>
											{Liferay.Language.get(
												'filter-mode'
											)}

											<span
												className="label-icon lfr-portal-tooltip ml-2"
												title={Liferay.Language.get(
													'include-returns-only-the-selected-values.-exclude-returns-all-except-the-selected-ones'
												)}
											>
												<ClayIcon symbol="question-circle-full" />
											</span>
										</label>

										<ClayRadioGroup
											name={includeModeFormElementId}
											onChange={(val: any) =>
												setIncludeMode(val)
											}
											value={includeMode}
										>
											<ClayRadio
												label={Liferay.Language.get(
													'include'
												)}
												value="include"
											/>

											<ClayRadio
												label={Liferay.Language.get(
													'exclude'
												)}
												value="exclude"
											/>
										</ClayRadioGroup>
									</ClayForm.Group>
								</>
							)}
						</>
					)}
			</ClayModal.Body>

			<ClayModal.Footer
				last={
					<ClayButton.Group spaced>
						<ClayButton
							disabled={
								!selectedField ||
								(!multiple && preselectedValues.length > 1) ||
								!isValidDateRange ||
								saveButtonDisabled
							}
							onClick={handleFilterSave}
							type="submit"
						>
							{Liferay.Language.get('save')}
						</ClayButton>

						<ClayButton
							displayType="secondary"
							onClick={() => closeModal()}
						>
							{Liferay.Language.get('cancel')}
						</ClayButton>
					</ClayButton.Group>
				}
			/>
		</>
	);
}

interface IProps {
	fdsView: FDSViewType;
	fdsViewsURL: string;
	namespace: string;
}

function Filters({fdsView, fdsViewsURL, namespace}: IProps) {
	const [fields, setFields] = useState<IField[]>([]);
	const [filters, setFilters] = useState<IFilter[]>([]);
	const [newFiltersOrder, setNewFiltersOrder] = useState<string>('');

	useEffect(() => {
		const getFilters = async () => {
			const response = await fetch(
				`${API_URL.FDS_VIEWS}/${fdsView.id}?nestedFields=${OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DATE_FILTER},${OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DYNAMIC_FILTER}`
			);

			const responseJSON = await response.json();

			const dateFiltersOrderer = responseJSON[
				OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DATE_FILTER
			] as IDateFilter[];
			const dynamicFiltersOrderer = responseJSON[
				OBJECT_RELATIONSHIP.FDS_VIEW_FDS_DYNAMIC_FILTER
			] as ISelectionFilter[];

			let filtersOrdered: FilterCollection = [
				...dateFiltersOrderer.map((item) => ({
					...item,
					displayType: Liferay.Language.get('date-filter'),
				})),
				...dynamicFiltersOrderer.map((item) => ({
					...item,
					displayType: Liferay.Language.get('dynamic-filter'),
				})),
			];

			if (fdsView.fdsFiltersOrder) {
				const order = fdsView.fdsFiltersOrder.split(',');

				let notOrdered: FilterCollection = [];

				notOrdered = filtersOrdered.filter(
					(filter) => !order.includes(String(filter.id))
				);

				filtersOrdered = fdsView.fdsFiltersOrder
					.split(',')
					.map((fdsFilterId) =>
						filtersOrdered.find(
							(filter) => filter.id === Number(fdsFilterId)
						)
					)
					.filter(Boolean) as FilterCollection;

				filtersOrdered = [...notOrdered, ...filtersOrdered];
			}

			setFilters(filtersOrdered);
		};

		getFields(fdsView).then((newFields) => {
			if (newFields) {
				setFields(newFields as IField[]);
			}
		});

		getFilters();
	}, [fdsView]);

	const updateFDSFiltersOrder = async () => {
		const response = await fetch(
			`${API_URL.FDS_VIEWS}/by-external-reference-code/${fdsView.externalReferenceCode}`,
			{
				body: JSON.stringify({
					fdsFiltersOrder: newFiltersOrder,
				}),
				headers: {
					'Accept': 'application/json',
					'Content-Type': 'application/json',
				},
				method: 'PATCH',
			}
		);

		if (!response.ok) {
			openDefaultFailureToast();

			return null;
		}

		const responseJSON = await response.json();

		const fdsFiltersOrder = responseJSON?.fdsFiltersOrder;

		if (fdsFiltersOrder && fdsFiltersOrder === newFiltersOrder) {
			openDefaultSuccessToast();

			setNewFiltersOrder('');
		}
		else {
			openDefaultFailureToast();
		}
	};

	const onCreationButtonClick = (filterType: EFilterType) => {
		const availableFields = fields.filter(
			(item) =>
				(filterType === EFilterType.SELECTION &&
					item.format === EFieldFormat.STRING) ||
				(filterType === EFilterType.DATE_RANGE &&
					item.format === EFieldFormat.DATE_TIME) ||
				item.format === EFieldFormat.DATE
		);

		if (!availableFields.length) {
			openModal({
				bodyHTML: Liferay.Language.get(
					'there-are-no-fields-compatible-with-this-type-of-filter'
				),
				buttons: [
					{
						displayType: 'primary',
						label: Liferay.Language.get('close'),
						onClick: ({processClose}: {processClose: Function}) => {
							processClose();
						},
					},
				],
				status: 'info',
				title: Liferay.Language.get('no-fields-available'),
			});
		}
		else {
			openModal({
				className: 'overflow-auto',
				contentComponent: ({closeModal}: {closeModal: Function}) => (
					<AddFDSFilterModalContent
						closeModal={closeModal}
						fdsView={fdsView}
						fieldNames={filters.map((filter) => filter.fieldName)}
						fields={availableFields}
						filterType={filterType}
						namespace={namespace}
						onSave={(newfilter) =>
							setFilters([...filters, newfilter])
						}
					/>
				),
				disableAutoClose: true,
			});
		}
	};

	const handleEdit = ({item}: {item: IDateFilter | ISelectionFilter}) =>
		openModal({
			className: 'overflow-auto',
			contentComponent: ({closeModal}: {closeModal: Function}) => (
				<AddFDSFilterModalContent
					closeModal={closeModal}
					fdsView={fdsView}
					fieldNames={filters.map((filter) => filter.fieldName)}
					fields={fields}
					filter={item}
					namespace={namespace}
					onSave={(newfilter) => {
						const newFilters = filters.map((item) => {
							if (item.id === newfilter.id) {
								return {...item, ...newfilter};
							}

							return item;
						});

						setFilters(newFilters);
					}}
				/>
			),
			disableAutoClose: true,
		});

	const handleDelete = async ({item}: {item: IFilter}) => {
		openModal({
			bodyHTML: Liferay.Language.get(
				'are-you-sure-you-want-to-delete-this-filter'
			),
			buttons: [
				{
					autoFocus: true,
					displayType: 'secondary',
					label: Liferay.Language.get('cancel'),
					type: 'cancel',
				},
				{
					displayType: 'danger',
					label: Liferay.Language.get('delete'),
					onClick: ({processClose}: {processClose: Function}) => {
						processClose();

						const url = `${
							item.type === 'date-time'
								? API_URL.FDS_DATE_FILTERS
								: API_URL.FDS_DYNAMIC_FILTERS
						}/${item.id}`;

						fetch(url, {
							method: 'DELETE',
						})
							.then(() => {
								openDefaultSuccessToast();

								setFilters(
									filters.filter(
										(filter: IFilter) =>
											filter.id !== item.id
									)
								);
							})
							.catch(openDefaultFailureToast);
					},
				},
			],
			status: 'warning',
			title: Liferay.Language.get('delete-filter'),
		});
	};

	return (
		<ClayLayout.ContainerFluid>
			<OrderableTable
				actions={[
					{
						icon: 'pencil',
						label: Liferay.Language.get('edit'),
						onClick: handleEdit,
					},
					{
						icon: 'trash',
						label: Liferay.Language.get('delete'),
						onClick: handleDelete,
					},
				]}
				creationMenuItems={[
					{
						label: Liferay.Language.get('date-range'),
						onClick: () =>
							onCreationButtonClick(EFilterType.DATE_RANGE),
					},
					{
						label: Liferay.Language.get('selection'),
						onClick: () =>
							onCreationButtonClick(EFilterType.SELECTION),
					},
				]}
				disableSave={!newFiltersOrder.length}
				fields={[
					{
						label: Liferay.Language.get('name'),
						name: 'name',
					},
					{
						label: Liferay.Language.get('Field Name'),
						name: 'fieldName',
					},
					{
						label: Liferay.Language.get('type'),
						name: 'displayType',
					},
				]}
				items={filters}
				noItemsButtonLabel={Liferay.Language.get('create-filter')}
				noItemsDescription={Liferay.Language.get(
					'start-creating-a-filter-to-display-specific-data'
				)}
				noItemsTitle={Liferay.Language.get(
					'no-default-filters-were-created'
				)}
				onCancelButtonClick={() => navigate(fdsViewsURL)}
				onOrderChange={({orderedItems}: {orderedItems: IFilter[]}) => {
					setNewFiltersOrder(
						orderedItems.map((filter) => filter.id).join(',')
					);
				}}
				onSaveButtonClick={updateFDSFiltersOrder}
				title={Liferay.Language.get('filters')}
			/>
		</ClayLayout.ContainerFluid>
	);
}

export default Filters;
