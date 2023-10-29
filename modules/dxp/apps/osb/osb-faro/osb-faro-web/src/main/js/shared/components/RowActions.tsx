import ClayButton from '@clayui/button';
import ClayDropDown, {Align} from '@clayui/drop-down';
import ClayIcon from '@clayui/icon';
import ClayLink from '@clayui/link';
import React from 'react';

interface IRowActionsProps {
	actions?: (React.HTMLAttributes<HTMLElement> & {
		label: string;
	})[];
	quickActions?: {
		iconSymbol: string;
		label: string;
		href?: string;
		onClick?: () => void;
	}[];
}

const RowActions: React.FC<IRowActionsProps> = ({
	actions = [],
	quickActions = []
}) => (
	<>
		{!!quickActions?.length && (
			<div className='quick-action-menu'>
				{quickActions.map(({href, iconSymbol, label, onClick}) =>
					href ? (
						<ClayLink
							aria-label={label}
							button
							className='button-root component-action quick-action-item'
							data-tooltip
							displayType='unstyled'
							href={href}
							key={label}
							title={label}
						>
							<ClayIcon
								className='icon-root'
								symbol={iconSymbol}
							/>
						</ClayLink>
					) : (
						<ClayButton
							aria-label={label}
							className='button-root component-action quick-action-item'
							data-tooltip
							displayType='unstyled'
							key={label}
							onClick={onClick}
							title={label}
						>
							<ClayIcon
								className='icon-root'
								symbol={iconSymbol}
							/>
						</ClayButton>
					)
				)}
			</div>
		)}

		{!!actions?.length && (
			<ClayDropDown
				alignmentPosition={Align.BottomRight}
				className='dropdown-action'
				closeOnClick
				trigger={
					<ClayButton
						aria-label={Liferay.Language.get('menu')}
						className='component-action'
						displayType='unstyled'
					>
						<ClayIcon symbol='ellipsis-v' />
					</ClayButton>
				}
			>
				{actions.map(({label, ...props}) => (
					<ClayDropDown.Item key={label} {...props}>
						{label}
					</ClayDropDown.Item>
				))}
			</ClayDropDown>
		)}
	</>
);

export default RowActions;
