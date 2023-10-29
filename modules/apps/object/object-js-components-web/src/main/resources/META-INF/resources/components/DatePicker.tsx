/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import ClayDatePicker from '@clayui/date-picker';
import {FieldBase} from 'frontend-js-components-web';

// @ts-ignore

import moment from 'moment/min/moment-with-locales';
import React, {useEffect, useMemo, useRef, useState} from 'react';
import {createTextMaskInputElement} from 'text-mask-core';

import {createAutoCorrectedDatePipe} from '../utils/createAutoCorrectedDatePipe';
import {
	Date,
	generateDate,
	generateDateConfigurations,
	generateInputMask,
} from '../utils/datetime';

interface DatePickerProps
	extends Omit<React.HTMLAttributes<HTMLInputElement>, 'onChange'> {
	className?: string;
	defaultLanguageId?: Liferay.Language.Locale;
	disabled?: boolean;
	error?: string;
	feedbackMessage?: string;
	hideFeedback?: boolean;
	id?: string;
	label?: string;
	locale?: Liferay.Language.Locale;
	name?: string;
	onChange: (value: string) => void;
	range?: boolean;
	required?: boolean;
	type: 'date' | 'date_time' | 'Date' | 'DateTime';
	value?: string;
}

enum FirstDayOfWeek {
	Sunday = 0,
	Monday = 1,
	Tuesday = 2,
	Wednesday = 3,
	Thursday = 4,
	Friday = 5,
	Saturday = 6,
}

type DateMaskParams = {
	clayFormat?: string;
	firstDayOfWeek?: FirstDayOfWeek;
	isDateTime?: boolean;
	momentFormat?: string;
	months?: string[];
	placeholder?: string;
	serverFormat?: string;
	use12Hours?: boolean;
	weekdaysShort?: string[];
};

type MaskRef = {
	state: {
		previousConformedValue: string;
		previousPlaceholder: string;
	};
	update: (value: string) => void;
};

export function DatePicker({
	className,
	defaultLanguageId = Liferay.ThemeDisplay.getDefaultLanguageId(),
	disabled,
	error,
	feedbackMessage,
	hideFeedback,
	id,
	label,
	locale = Liferay.ThemeDisplay.getLanguageId(),
	onChange,
	name,
	range,
	required,
	type,
	value,
}: DatePickerProps) {
	const [expanded, setExpanded] = useState(false);

	const momentLocale = moment().locale(locale ?? defaultLanguageId);
	const months = momentLocale.localeData().months();
	const weekdaysShort = momentLocale.localeData().weekdaysShort();

	const inputRef = useRef(null);
	const maskRef = useRef<null | MaskRef>(null);
	const {
		clayFormat,
		firstDayOfWeek,
		isDateTime = false,
		momentFormat = '',
		placeholder,
		serverFormat = '',
		use12Hours,
	} = useMemo(() => {
		let dateMaskParameters: DateMaskParams = {};

		dateMaskParameters = generateDateConfigurations({
			defaultLanguageId,
			locale,
			type,
		});

		return dateMaskParameters;
	}, [defaultLanguageId, locale, type]);

	const date: Date = useMemo(() => {
		let formattedDate = '';
		let year = moment().year();
		const rawDate = value ?? '';

		if (rawDate !== '') {
			const date = moment(rawDate, serverFormat, true);
			formattedDate = date
				.locale(locale ?? defaultLanguageId)
				.format(momentFormat);
			year = date.year();
		}

		return {
			formattedDate,
			locale,
			name,
			rawDate,
			value,
			years: {end: year + 5, start: year - 5},
		};
	}, [momentFormat, defaultLanguageId, locale, name, serverFormat, value]);

	const [{formattedDate, rawDate, years}, setDate] = useState(date);

	/**
	 * Updates the rawDate state whenever the prop value or localizedValue changes,
	 * but it keep user's input case theres no language change.
	 */
	useEffect(() => {
		setDate(({formattedDate, name, rawDate, value}) =>
			name === date.name && value === date.value && rawDate === ''
				? {...date, formattedDate}
				: date
		);
	}, [date]);

	/**
	 * Creates the input mask and update it whenever the format changes
	 */
	useEffect(() => {
		const {mask, pipeFormat} = generateInputMask(momentFormat);

		maskRef.current = createTextMaskInputElement({
			guide: true,
			inputElement: inputRef.current,
			keepCharPositions: true,
			mask,
			pipe: createAutoCorrectedDatePipe(pipeFormat),
			showMask: true,
		});
	}, [momentFormat]);

	const handleValueChange = (value: string) => {
		const nextState = generateDate({
			isDateTime,
			momentFormat,
			serverFormat,
			value,
		});

		setDate((previousState) => ({...previousState, ...nextState}));

		if (nextState.rawDate !== rawDate) {
			onChange(nextState.rawDate as string);
		}

		setExpanded(false);
	};

	const onInputMask: React.FocusEventHandler<HTMLInputElement> = ({
		target: {value},
	}) => {
		try {
			maskRef.current?.update(value);
		}
		catch (error) {
			maskRef.current?.update('');
		}
	};

	return (
		<FieldBase
			className={className}
			disabled={disabled}
			errorMessage={error}
			helpMessage={feedbackMessage}
			hideFeedback={hideFeedback}
			id={id}
			label={label}
			required={required}
		>
			<ClayDatePicker
				dateFormat={clayFormat}
				expanded={expanded}
				firstDayOfWeek={firstDayOfWeek}
				months={months}
				onChange={handleValueChange}
				onExpandedChange={() => {
					setExpanded(!expanded);
				}}
				onInput={onInputMask}
				placeholder={placeholder}
				range={range}
				ref={inputRef}
				time={isDateTime}
				use12Hours={use12Hours}
				value={formattedDate}
				weekdaysShort={weekdaysShort}
				years={years}
				yearsCheck={false}
			/>
		</FieldBase>
	);
}
