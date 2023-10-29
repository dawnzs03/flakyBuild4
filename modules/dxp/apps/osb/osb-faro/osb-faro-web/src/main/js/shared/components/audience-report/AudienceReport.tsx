import AudienceReportDonut from './AudienceReportDonut';
import AudienceReportStateRenderer from './AudienceReportStateRenderer';
import HTMLBarChart from 'shared/components/HTMLBarChart';
import InfoPopover, {IInfoPopoverProps} from 'shared/components/InfoPopover';
import React from 'react';
import {DocumentNode} from 'graphql';
import {fetchPolicyDefinition} from 'shared/util/graphql';
import {formatData} from './util';
import {getFilters, RawFilters} from 'shared/util/filter';
import {getSafeRangeSelectors, getSafeTouchpoint} from 'shared/util/util';
import {IAudienceReportBaseCardProps, Name, TData} from './types';
import {RangeSelectors} from 'shared/types';
import {useParams} from 'react-router-dom';
import {useQuery} from '@apollo/react-hooks';

const AudienceReportTitle: React.FC<IInfoPopoverProps> = ({content, title}) => (
	<div className='d-inline-flex gap'>
		<h4 className='mb-3 text-center text-secondary title'>{title}</h4>

		{content && <InfoPopover content={content} title={title} />}
	</div>
);

interface IAudienceReportWithDataProps<TRawData>
	extends Partial<IAudienceReportBaseCardProps> {
	mapper: (data: TRawData) => TData;
	data: TRawData;
	name: Name;
}

function AudienceReportWithData<TRawData>({
	data,
	knownIndividualsTitle,
	mapper,
	name,
	segmentsTitle = Liferay.Language.get('viewer-segments'),
	uniqueVisitorsTitle = Liferay.Language.get('visitors')
}: IAudienceReportWithDataProps<TRawData>) {
	const result: TData = mapper(data);

	const {knownIndividuals, segments, uniqueVisitors} = formatData(result);

	return (
		<div className='audience-report-chart row w-100'>
			<div className='col-sm-6'>
				<div className='row'>
					<div className='col-sm-6 text-center'>
						<AudienceReportTitle title={uniqueVisitorsTitle} />

						<AudienceReportDonut {...uniqueVisitors} />
					</div>

					<div className='col-sm-6 text-center'>
						<AudienceReportTitle
							content={
								name === Name.Page
									? Liferay.Language.get(
											'only-known-individuals-that-interacted-with-the-current-page-are-accounted-for-in-this-chart'
									  )
									: Liferay.Language.get(
											'only-known-individuals-that-interacted-with-the-current-asset-are-accounted-for-in-this-chart'
									  )
							}
							title={knownIndividualsTitle}
						/>

						<AudienceReportDonut {...knownIndividuals} />
					</div>
				</div>
			</div>

			<div className='col-sm-6 pl-5'>
				<AudienceReportTitle
					content={
						name === Name.Page
							? Liferay.Language.get(
									'only-segmented-known-individuals-that-interacted-with-the-current-page-are-accounted-for-in-this-chart'
							  )
							: Liferay.Language.get(
									'only-segmented-known-individuals-that-interacted-with-the-current-asset-are-accounted-for-in-this-chart'
							  )
					}
					title={segmentsTitle}
				/>

				<div className='audience-report-chart-bar'>
					<HTMLBarChart {...segments} />
				</div>
			</div>
		</div>
	);
}

interface IAudienceReportProps<TRawData>
	extends Partial<IAudienceReportBaseCardProps> {
	filters: RawFilters;
	rangeSelectors: RangeSelectors;
	Query: DocumentNode;
	mapper: (data: TRawData) => TData;
	name: Name;
}

function AudienceReport<TRawData>({
	filters,
	Query,
	rangeSelectors,
	...otherProps
}: IAudienceReportProps<TRawData>) {
	const {assetId, channelId, title, touchpoint} = useParams();
	const {data, error, loading} = useQuery(Query, {
		fetchPolicy: fetchPolicyDefinition(rangeSelectors),
		variables: {
			assetId,
			channelId,
			title: decodeURIComponent(title),
			touchpoint: getSafeTouchpoint(touchpoint),
			...getFilters(filters),
			...getSafeRangeSelectors(rangeSelectors)
		}
	});

	return (
		<AudienceReportStateRenderer error={error} loading={loading}>
			<AudienceReportWithData {...otherProps} data={data} />
		</AudienceReportStateRenderer>
	);
}

export default AudienceReport;
