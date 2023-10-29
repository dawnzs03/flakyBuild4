/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {isNullOrUndefined} from '@liferay/layout-js-components-web';

import addFragmentEntryLinkComment from '../actions/addFragmentEntryLinkComment';
import addFragmentEntryLinks, {
	FragmentEntryLinkMap,
} from '../actions/addFragmentEntryLinks';
import addItem from '../actions/addItem';
import changeMasterLayout from '../actions/changeMasterLayout';
import deleteFragmentEntryLinkComment from '../actions/deleteFragmentEntryLinkComment';
import deleteItem from '../actions/deleteItem';
import duplicateItem from '../actions/duplicateItem';
import editFragmentEntryLinkComment from '../actions/editFragmentEntryLinkComment';
import {
	ADD_FRAGMENT_ENTRY_LINKS,
	ADD_FRAGMENT_ENTRY_LINK_COMMENT,
	ADD_ITEM,
	CHANGE_MASTER_LAYOUT,
	DELETE_FRAGMENT_ENTRY_LINK_COMMENT,
	DELETE_ITEM,
	DUPLICATE_ITEM,
	EDIT_FRAGMENT_ENTRY_LINK_COMMENT,
	UPDATE_COLLECTION_DISPLAY_COLLECTION,
	UPDATE_EDITABLE_VALUES,
	UPDATE_FORM_ITEM_CONFIG,
	UPDATE_FRAGMENT_ENTRY_LINK_CONFIGURATION,
	UPDATE_FRAGMENT_ENTRY_LINK_CONTENT,
	UPDATE_PREVIEW_IMAGE,
} from '../actions/types';
import updateCollectionDisplayCollection from '../actions/updateCollectionDisplayCollection';
import updateEditableValues from '../actions/updateEditableValues';
import updateFormItemConfig from '../actions/updateFormItemConfig';
import updateFragmentEntryLinkConfiguration from '../actions/updateFragmentEntryLinkConfiguration';
import updateFragmentEntryLinkContent from '../actions/updateFragmentEntryLinkContent';
import updatePreviewImage from '../actions/updatePreviewImage';

export const INITIAL_STATE: FragmentEntryLinkMap = {};

export default function fragmentEntryLinksReducer(
	fragmentEntryLinks = INITIAL_STATE,
	action: ReturnType<
		| typeof addItem
		| typeof addFragmentEntryLinks
		| typeof addFragmentEntryLinkComment
		| typeof changeMasterLayout
		| typeof deleteItem
		| typeof deleteFragmentEntryLinkComment
		| typeof duplicateItem
		| typeof editFragmentEntryLinkComment
		| typeof updateCollectionDisplayCollection
		| typeof updateEditableValues
		| typeof updateFormItemConfig
		| typeof updateFragmentEntryLinkConfiguration
		| typeof updateFragmentEntryLinkContent
		| typeof updatePreviewImage
	>
): FragmentEntryLinkMap {
	switch (action.type) {
		case ADD_ITEM: {
			const newFragmentEntryLinks: FragmentEntryLinkMap = {};

			if (action.fragmentEntryLinkIds) {
				action.fragmentEntryLinkIds.forEach((fragmentEntryLinkId) => {
					newFragmentEntryLinks[fragmentEntryLinkId] = {
						...fragmentEntryLinks[fragmentEntryLinkId],
						removed: false,
					};
				});

				return {
					...fragmentEntryLinks,
					...newFragmentEntryLinks,
				};
			}

			return fragmentEntryLinks;
		}

		case ADD_FRAGMENT_ENTRY_LINKS: {
			const newFragmentEntryLinks: FragmentEntryLinkMap = {};

			action.fragmentEntryLinks.forEach((fragmentEntryLink) => {
				newFragmentEntryLinks[
					fragmentEntryLink.fragmentEntryLinkId
				] = fragmentEntryLink;
			});

			return {
				...fragmentEntryLinks,
				...newFragmentEntryLinks,
			};
		}

		case ADD_FRAGMENT_ENTRY_LINK_COMMENT: {
			const fragmentEntryLink =
				fragmentEntryLinks[action.fragmentEntryLinkId];

			const {comments = []} = fragmentEntryLink;

			let nextComments;

			if (action.parentCommentId) {
				nextComments = comments.map((comment) =>
					comment.commentId === action.parentCommentId
						? {
								...comment,
								children: [
									...(comment.children || []),
									action.fragmentEntryLinkComment,
								],
						  }
						: comment
				);
			}
			else {
				nextComments = [...comments, action.fragmentEntryLinkComment];
			}

			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLink,
					comments: nextComments,
				},
			};
		}
		case CHANGE_MASTER_LAYOUT: {
			const nextFragmentEntryLinks: FragmentEntryLinkMap = {
				...(action.fragmentEntryLinks || {}),
			};

			Object.entries(fragmentEntryLinks).forEach(
				([fragmentEntryLinkId, fragmentEntryLink]) => {
					if (!fragmentEntryLink.masterLayout) {
						nextFragmentEntryLinks[
							fragmentEntryLinkId
						] = fragmentEntryLink;
					}
				}
			);

			return nextFragmentEntryLinks;
		}

		case DELETE_ITEM: {
			const newFragmentEntryLinks: FragmentEntryLinkMap = {};

			if (action.fragmentEntryLinkIds) {
				action.fragmentEntryLinkIds.forEach((fragmentEntryLinkId) => {
					newFragmentEntryLinks[fragmentEntryLinkId] = {
						...fragmentEntryLinks[fragmentEntryLinkId],
						removed: true,
					};
				});

				return {
					...fragmentEntryLinks,
					...newFragmentEntryLinks,
				};
			}

			return fragmentEntryLinks;
		}

		case DELETE_FRAGMENT_ENTRY_LINK_COMMENT: {
			const fragmentEntryLink =
				fragmentEntryLinks[action.fragmentEntryLinkId];

			const {comments = []} = fragmentEntryLink;

			let nextComments;

			if (action.parentCommentId) {
				nextComments = comments.map((comment) => {
					if (comment.commentId !== action.parentCommentId) {
						return comment;
					}

					return {
						...comment,
						children: comment.children?.filter(
							(childComment) =>
								childComment.commentId !== action.commentId
						),
					};
				});
			}
			else {
				nextComments = comments.filter(
					(comment) => comment.commentId !== action.commentId
				);
			}

			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLink,
					comments: nextComments,
				},
			};
		}

		case DUPLICATE_ITEM: {
			const nextFragmentEntryLinks: FragmentEntryLinkMap = {
				...fragmentEntryLinks,
			};

			action.addedFragmentEntryLinks.forEach((fragmentEntryLink) => {
				nextFragmentEntryLinks[
					fragmentEntryLink.fragmentEntryLinkId
				] = fragmentEntryLink;
			});

			return nextFragmentEntryLinks;
		}

		case EDIT_FRAGMENT_ENTRY_LINK_COMMENT: {
			const fragmentEntryLink =
				fragmentEntryLinks[action.fragmentEntryLinkId];

			const {comments = []} = fragmentEntryLink;

			let nextComments;

			if (action.parentCommentId) {
				nextComments = comments.map((comment) => {
					if (comment.commentId !== action.parentCommentId) {
						return comment;
					}

					return {
						...comment,
						children: comment.children?.map((childComment) =>
							childComment.commentId ===
							action.fragmentEntryLinkComment.commentId
								? action.fragmentEntryLinkComment
								: childComment
						),
					};
				});
			}
			else {
				nextComments = comments.map((comment) =>
					comment.commentId ===
					action.fragmentEntryLinkComment.commentId
						? {...comment, ...action.fragmentEntryLinkComment}
						: comment
				);
			}

			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLink,
					comments: nextComments,
				},
			};
		}

		case UPDATE_COLLECTION_DISPLAY_COLLECTION:
			return {
				...fragmentEntryLinks,
				...Object.fromEntries(
					action.fragmentEntryLinks.map((fragmentEntryLink) => [
						fragmentEntryLink.fragmentEntryLinkId,
						{
							...fragmentEntryLinks[
								fragmentEntryLink.fragmentEntryLinkId
							],
							...fragmentEntryLink,
						},
					])
				),
			};

		case UPDATE_EDITABLE_VALUES:
			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLinks[action.fragmentEntryLinkId],
					content: action.content,
					editableValues: action.editableValues,
				},
			};

		case UPDATE_FORM_ITEM_CONFIG: {
			const newFragmentEntryLinks: FragmentEntryLinkMap = action.addedFragmentEntryLinks
				? {...action.addedFragmentEntryLinks}
				: {};

			if (action.removedFragmentEntryLinkIds) {
				action.removedFragmentEntryLinkIds.forEach(
					(fragmentEntryLinkId) => {
						newFragmentEntryLinks[fragmentEntryLinkId] = {
							...fragmentEntryLinks[fragmentEntryLinkId],
							removed: true,
						};
					}
				);
			}

			if (action.restoredFragmentEntryLinkIds) {
				action.restoredFragmentEntryLinkIds.forEach(
					(fragmentEntryLinkId) => {
						newFragmentEntryLinks[fragmentEntryLinkId] = {
							...fragmentEntryLinks[fragmentEntryLinkId],
							removed: false,
						};
					}
				);
			}

			return {
				...fragmentEntryLinks,
				...newFragmentEntryLinks,
			};
		}

		case UPDATE_FRAGMENT_ENTRY_LINK_CONFIGURATION:
			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLinks[action.fragmentEntryLinkId],
					configuration: action.fragmentEntryLink.configuration,
					content: action.fragmentEntryLink.content,
					editableTypes: action.fragmentEntryLink.editableTypes,
					editableValues: action.fragmentEntryLink.editableValues,
				},
			};

		case UPDATE_FRAGMENT_ENTRY_LINK_CONTENT: {
			const fragmentEntryLink =
				fragmentEntryLinks[action.fragmentEntryLinkId];

			let collectionContent = fragmentEntryLink.collectionContent || {};

			if (!isNullOrUndefined(action.collectionContentId)) {
				collectionContent = {
					...collectionContent,
					[action.collectionContentId]: action.content,
				};
			}

			return {
				...fragmentEntryLinks,
				[action.fragmentEntryLinkId]: {
					...fragmentEntryLinks[action.fragmentEntryLinkId],
					collectionContent,
					content: action.content,
				},
			};
		}

		case UPDATE_PREVIEW_IMAGE: {
			const objectIsFileEntry = (
				object: any
			): object is {fileEntryId: string; url: string} => {
				return (
					object &&
					typeof object === 'object' &&
					'fileEntryId' in object &&
					object.fileEntryId === action.fileEntryId
				);
			};

			const updateFileEntryPreviewURL = <T>(object: T): T => {
				if (objectIsFileEntry(object)) {
					return {...object, url: action.previewURL};
				}
				else if (object && typeof object === 'object') {
					return Object.fromEntries(
						Object.entries(object).map(([key, value]) => [
							key,
							updateFileEntryPreviewURL(value),
						])
					) as T;
				}

				return object;
			};

			const newFragmentEntryLinks = action.contents.map(
				({content, fragmentEntryLinkId}) => {
					const {editableValues} = fragmentEntryLinks[
						fragmentEntryLinkId
					];

					return [
						fragmentEntryLinkId,
						{
							...fragmentEntryLinks[fragmentEntryLinkId],
							content,
							editableValues: updateFileEntryPreviewURL(
								editableValues
							),
						},
					];
				}
			);

			return {
				...fragmentEntryLinks,
				...Object.fromEntries(newFragmentEntryLinks),
			};
		}

		default:
			return fragmentEntryLinks;
	}
}
