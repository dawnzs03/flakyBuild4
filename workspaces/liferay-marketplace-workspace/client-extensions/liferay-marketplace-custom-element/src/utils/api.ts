/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {z} from 'zod';

import {Liferay} from '../liferay/liferay';
import zodSchema from '../schema/zod';

const headers = {
	'Content-Type': 'application/json',
	'X-CSRF-Token': Liferay.authToken,
};

type UserForm = z.infer<typeof zodSchema.newCustomer>;

export const baseURL =
	window.location.origin + Liferay.ThemeDisplay.getPathContext();

export async function addExpandoValue({
	attributeValues,
	className,
	classPK,
	companyId,
	tableName,
}: {
	attributeValues: Object;
	className: string;
	classPK: number;
	companyId: number;
	tableName: string;
}) {
	await Liferay.Service('/expandovalue/add-values', {
		attributeValues,
		className,
		classPK,
		companyId,
		tableName,
	});
}

export function createApp({
	appCategories,
	appDescription,
	appName,
	catalogId,
	productChannels,
}: {
	appCategories: Categories[];
	appDescription: string;
	appName: string;
	catalogId: number;
	productChannels?: Partial<Channel>[];
}) {
	return fetch(`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products`, {
		body: JSON.stringify({
			active: true,
			catalogId,
			categories: appCategories,
			description: {en_US: appDescription},
			name: {en_US: appName},
			productChannels,
			productConfiguration: {allowBackOrder: true, maxOrderQuantity: 1},
			productStatus: 2,
			productType: 'virtual',
		}),
		headers,
		method: 'POST',
	});
}

export async function createAppLicensePrice({
	appProductId,
	body,
}: {
	appProductId: number;
	body: Object;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appProductId}/skus
	  `,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);

	return await response.json();
}

export async function createAppSKU({
	appProductId,
	body,
}: {
	appProductId: number;
	body: Object;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appProductId}/skus
	  `,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);

	return (await response.json()) as SKU;
}

export async function createAttachment({
	body,
	externalReferenceCode,
}: {
	body: Object;
	externalReferenceCode: string;
}) {
	return fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${externalReferenceCode}/attachments`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);
}

export function createImage({
	body,
	externalReferenceCode,
}: {
	body: Object;
	externalReferenceCode: string;
}) {
	return fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${externalReferenceCode}/images`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);
}

export async function createProductSpecification({
	appId,
	body,
}: {
	appId: string;
	body: Object;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appId}/productSpecifications`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);

	return await response.json();
}

export async function createSpecification({body}: {body: Object}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/specifications`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);

	return await response.json();
}

export async function deleteTrialSKU(skuTrialId: number) {
	await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/skus/${skuTrialId}`,
		{
			headers,
			method: 'DELETE',
		}
	);
}

export async function getAccountGroup(accountId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-account/v1.0/accounts/${accountId}/accountGroups`,
		{headers, method: 'GET'}
	);
	const {items} = await response.json();

	return items as AccountGroup[];
}

export async function getAccountInfo({accountId}: {accountId: number}) {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/accounts/${accountId}?nestedFields=accountUserAccounts`,
		{headers, method: 'GET'}
	);

	return response.json();
}

export async function getAccountInfoFromCommerce(accountId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-account/v1.0/accounts/${accountId}`,
		{headers, method: 'GET'}
	);

	return (await response.json()) as CommerceAccount;
}

export async function getAccountAddressesFromCommerce(accountId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-account/v1.0/accounts/${accountId}/accountAddresses`,
		{headers, method: 'GET'}
	);

	return (await response.json()) as {items: BillingAddress[]};
}

export async function getAccounts() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/accounts?pageSize=-1`,
		{
			headers,
			method: 'GET',
		}
	);

	return (await response.json()) as {items: Account[]};
}

export async function getAccountPostalAddressesByAccountId(accountId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/accounts/${accountId}/postal-addresses`,
		{
			headers,
			method: 'GET',
		}
	);

	return (await response.json()) as {items: AccountPostalAddresses[]};
}

export async function getCart(cartId: number) {
	const cartResponse = await fetch(
		`${baseURL}/o/headless-commerce-delivery-cart/v1.0/carts/${cartId}`,
		{
			headers,
			method: 'GET',
		}
	);

	return await cartResponse.json();
}

export async function getCartItems(cartId: number) {
	const cartResponse = await fetch(
		`${baseURL}/o/headless-commerce-delivery-cart/v1.0/carts/${cartId}/items`,
		{
			headers,
			method: 'GET',
		}
	);

	return await cartResponse.json();
}

export async function getCatalogs() {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/catalogs`,
		{headers, method: 'GET'}
	);

	const {items} = (await response.json()) as {items: Catalog[]};

	return items;
}

export async function getCatalog(catalogId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/catalog/${catalogId}`,
		{headers, method: 'GET'}
	);

	return response.json();
}

export async function getCategories({vocabId}: {vocabId: number}) {
	const response = await fetch(
		`${baseURL}/o/headless-admin-taxonomy/v1.0/taxonomy-vocabularies/${vocabId}/taxonomy-categories`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = (await response.json()) as {items: Vocabulary[]};

	return items;
}

export async function getCategoriesRanked() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-taxonomy/v1.0/taxonomy-categories/ranked`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = (await response.json()) as {items: Vocabulary[]};

	return items;
}

export async function getChannelById(channelId: number) {
	const channelResponse = await fetch(
		`${baseURL}/o/headless-commerce-admin-channel/v1.0/channels/${channelId}`,
		{
			headers,
			method: 'GET',
		}
	);

	return (await channelResponse.json()) as Channel;
}

export async function getChannels() {
	const channelsResponse = await fetch(
		`${baseURL}/o/headless-commerce-delivery-catalog/v1.0/channels`,
		{
			headers,
			method: 'GET',
		}
	);

	const response = await channelsResponse.json();

	return response.items as Channel[];
}

export async function getDeliveryProduct({
	accountId,
	appId,
	channelId,
}: {
	accountId: number;
	appId: number;
	channelId: number;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-delivery-catalog/v1.0/channels/${channelId}/products/${appId}?accountId=${accountId}`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getMyUserAccount(): Promise<UserAccount> {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/my-user-account`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getPaymentMethodURL(
	orderId: number,
	callbackURL: string
) {
	const paymentResponse = await fetch(
		`${baseURL}/o/headless-commerce-delivery-cart/v1.0/carts/${orderId}/payment-url?callbackURL=${callbackURL}`,
		{
			headers,
			method: 'GET',
		}
	);

	return await paymentResponse.text();
}

export async function getOptions() {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/options`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = await response.json();

	return items as CommerceOption[];
}

export async function getOrderbyERC(erc: string) {
	const orderResponse = await fetch(
		`${baseURL}/o/headless-commerce-admin-order/v1.0/orders/by-externalReferenceCode/${erc}`,
		{
			headers,
			method: 'GET',
		}
	);

	return await orderResponse.json();
}

export async function getPlacedOrders(
	accountId: number,
	channelId: number,
	page?: number,
	pageSize?: number
) {
	let url = `${baseURL}/o/headless-commerce-delivery-order/v1.0/channels/${channelId}/accounts/${accountId}/placed-orders`;

	if (page && pageSize) {
		url =
			url +
			`?nestedFields=placedOrderItems&page=${page}&pageSize=${pageSize}`;
	}

	const response = await fetch(url, {headers, method: 'GET'});

	return (await response.json()) as {
		items: PlacedOrder[];
		totalCount: number;
	};
}

export async function getOrderTypes() {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-order/v1.0/order-types`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = (await response.json()) as {items: OrderType[]};

	return items;
}

export async function getProduct({
	appERC,
	nestedFields,
}: {
	appERC: string;
	nestedFields?: string;
}) {
	let url = `/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${appERC}`;

	if (nestedFields) {
		url = url + `?nestedFields=${nestedFields}`;
	}

	const response = await fetch(url, {
		headers,
		method: 'GET',
	});

	return (await response.json()) as Product;
}

export async function getProductById(productId: number) {
	const url = `${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${productId}`;

	const response = await fetch(url, {
		headers,
		method: 'GET',
	});

	return (await response.json()) as Product;
}

export async function getProductAttachments(
	accountId: number,
	channelId: number,
	productId: number
) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-delivery-catalog/v1.0/channels/${channelId}/products/${productId}/attachments?accountId=${accountId}`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = await response.json();

	return items as ProductAttachment[];
}

export async function getProductIdCategories({appId}: {appId: string}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appId}/categories`,
		{
			headers,
			method: 'GET',
		}
	);

	return (await response.json()) as {items: Categories[]};
}

export async function getProductImages({appProductId}: {appProductId: number}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appProductId}/images`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getProducts(nestedFields?: string) {
	let url = `${baseURL}/o/headless-commerce-admin-catalog/v1.0/products?pageSize=-1`;

	if (nestedFields) {
		url = url + `&nestedFields=${nestedFields}`;
	}

	const response = await fetch(url, {
		headers,
		method: 'GET',
	});

	return (await response.json()) as {items: Product[]};
}

export async function getProductSKU({appProductId}: {appProductId: number}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appProductId}/skus`,
		{
			headers,
			method: 'GET',
		}
	);

	return (await response.json()) as {items: SKU[]};
}

export async function getProductSpecifications({
	appProductId,
}: {
	appProductId: number;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appProductId}/productSpecifications`,
		{
			headers,
			method: 'GET',
		}
	);

	const {items} = (await response.json()) as {
		items: ProductSpecification[];
	};

	return items;
}

export async function getProductSubscriptionConfiguration({
	appERC,
}: {
	appERC: string;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${appERC}/subscriptionConfiguration`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getSKUById(skuId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/skus/${skuId}`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getCustomFieldExpandoValue({
	className,
	classPK,
	columnName,
	companyId,
	tableName,
}: {
	className: string;
	classPK: number;
	columnName: string;
	companyId: number;
	tableName: string;
}) {
	let response = '';
	await Liferay.Service(
		'/expandovalue/get-data',
		{
			className,
			classPK,
			columnName,
			companyId,
			tableName,
		},
		(object: any) => {
			response = object;
		}
	);

	return response as string;
}

export async function getSpecifications() {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/specifications`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getUserAccount() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/my-user-account`,
		{headers, method: 'GET'}
	);

	return response.json();
}

export async function getUserAccounts() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/user-accounts`,
		{
			headers,
			method: 'GET',
		}
	);

	return await response.json();
}

export async function getUserAccountsById() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/user-accounts/${Liferay.ThemeDisplay.getUserId()}`,
		{
			headers,
			method: 'GET',
		}
	);

	return response;
}

export async function getUserAccountsByAccountId(accountId: number) {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/accounts/${accountId}/user-accounts`,
		{
			headers,
			method: 'GET',
		}
	);

	return response.json();
}

export async function getVocabularies() {
	const response = await fetch(
		`${baseURL}/o/headless-admin-taxonomy/v1.0/sites/${Liferay.ThemeDisplay.getCompanyGroupId()}/taxonomy-vocabularies`,
		{
			headers,
			method: 'GET',
		}
	);

	return response.json();
}

export function patchAppByExternalReferenceCode({
	body,
	externalReferenceCode,
}: {
	body: Object;
	externalReferenceCode: string;
}) {
	return fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${externalReferenceCode}/patchProductByExternalReferenceCode`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);
}

export async function patchOrderByERC(erc: string, body: any) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-order/v1.0/orders/by-externalReferenceCode/${erc}`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);

	return response;
}

export async function patchProductIdCategory({
	appId,
	body,
}: {
	appId: string;
	body: any;
}) {
	await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${appId}/categories`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);
}

export async function patchSKUById(skuId: number, body: any) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/skus/${skuId}`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);

	return await response.json();
}

export async function postCartByChannelId({
	cartBody,
	channelId,
}: {
	cartBody: any;
	channelId: number;
}) {
	const cartResponse = await fetch(
		`${baseURL}/o/headless-commerce-delivery-cart/v1.0/channels/${channelId}/carts`,
		{
			body: JSON.stringify(cartBody),
			headers,
			method: 'POST',
		}
	);

	return (await cartResponse.json()) as PostCartResponse;
}

export async function postCheckoutCart({
	body,
	cartId,
}: {
	body?: any;
	cartId: number;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-delivery-cart/v1.0/carts/${cartId}/checkout`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'POST',
		}
	);

	return (await await response.json()) as PostCheckoutCartResponse;
}

export async function postOptionValue(
	key: string,
	name: string,
	optionId: number,
	priority: number
) {
	{
		const response = await fetch(
			`${baseURL}/o/headless-commerce-admin-catalog/v1.0/productOptions/${optionId}/productOptionValues`,
			{
				body: JSON.stringify({
					key,
					name: {en_US: name},
					priority,
				}),
				headers,
				method: 'POST',
			}
		);

		const {id} = await response.json();

		return id;
	}
}

export async function postOrder(order: Order) {
	const response = await fetch(
		'/o/headless-commerce-admin-order/v1.0/orders',
		{
			body: JSON.stringify(order),
			headers,
			method: 'POST',
		}
	);

	return (await response.json()) as Order;
}

export async function postProduct(product: any) {
	const response = await fetch(
		'/o/headless-commerce-admin-catalog/v1.0/products',
		{
			body: JSON.stringify(product),
			headers,
			method: 'POST',
		}
	);

	return (await response.json()) as Product;
}

export async function postTrialOption() {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/options`,
		{
			body: JSON.stringify({
				fieldType: 'radio',
				key: 'trial',
				name: {en_US: 'Trial'},
			}),
			headers,
			method: 'POST',
		}
	);

	const {id} = await response.json();

	return id;
}

export async function postTrialProductOption(
	optionId: number,
	productId: number
) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/${productId}/productOptions`,
		{
			body: JSON.stringify([
				{
					description: {
						en_US:
							'Specifies if a trial exists for a given app or solution submission.',
					},
					facetable: true,
					fieldType: 'radio',
					key: 'trial',
					name: {
						en_US: 'Trial',
					},
					optionId,
					productOptionValues: [],
					required: true,
					skuContributor: true,
				},
			]),
			headers,
			method: 'POST',
		}
	);

	const {
		items: [{id}],
	} = (await response.json()) as {items: ProductOptionItem[]};

	return id;
}

export async function updateApp({
	appDescription,
	appERC,
	appName,
}: {
	appDescription: string;
	appERC: string;
	appName: string;
}) {
	return await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/products/by-externalReferenceCode/${appERC}`,
		{
			body: JSON.stringify({
				description: {en_US: appDescription},
				name: {en_US: appName},
			}),
			headers,
			method: 'PATCH',
		}
	);
}

export async function updateProductSpecification({
	body,
	id,
}: {
	body: Object;
	id: number;
}) {
	const response = await fetch(
		`${baseURL}/o/headless-commerce-admin-catalog/v1.0/productSpecifications/${id}`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);

	return await response.json();
}
export async function updateUserAdditionalInfos(body: Object, id: number) {
	const response = await fetch(
		`${baseURL}/o/c/useradditionalinfos/${id}/?filter=contains(sendType,'shipping')`,
		{
			body: JSON.stringify(body),
			headers,
			method: 'PATCH',
		}
	);

	return await response.json();
}

export async function getMyUserAditionalInfos(userId: number) {
	const userAdditionalInfos = await fetch(
		`${baseURL}/o/c/useradditionalinfos/?filter=r_userToUserAddInfo_userId eq '${userId}' and contains(sendType,'shipping')`,
		{headers}
	);

	return await userAdditionalInfos.json();
}

export async function updateUserPassword(password: string, id: number) {
	const response = await fetch(
		`/o/headless-admin-user/v1.0/user-accounts/${id}`,
		{
			body: JSON.stringify({password}),
			headers,
			method: 'PATCH',
		}
	);

	return response.json();
}

export async function sendRoleAccountUser(
	accountId: number,
	roleId: number,
	userId: number
) {
	await fetch(
		`/o/headless-admin-user/v1.0/accounts/${accountId}/account-roles/${roleId}/user-accounts/${userId}`,
		{
			headers: {
				...headers,
				accept: 'application/json',
			},
			method: 'POST',
		}
	);
}

export async function updateUserImage(userId: number, formData: FormData) {
	await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/user-accounts/${userId}/image`,
		{
			body: formData,
			headers: {
				'X-CSRF-Token': headers['X-CSRF-Token'],
			},
			method: 'POST',
		}
	);
}

export async function updateMyUserAccount(
	userId: number,
	formData: UserForm
): Promise<UserAccount> {
	const response = await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/user-accounts/${userId}`,
		{
			body: JSON.stringify(formData),
			headers,
			method: 'PATCH',
		}
	);

	const accountBriefs = formData.accountBriefs || [];

	for (const account of accountBriefs) {
		account.roleBriefs.forEach(async (roleBrief: RoleBrief) => {
			if (roleBrief.name === 'Invited Member') {
				await sendRoleAccountUser(account.id, roleBrief.id, userId);
			}
		});
	}

	return await response.json();
}

export async function getListTypeDefinitionByExternalReferenceCode(
	externalReferenceCode: string
) {
	const response = await fetch(
		`${baseURL}/o/headless-admin-list-type/v1.0/list-type-definitions/by-external-reference-code/${externalReferenceCode}`,
		{
			headers,
		}
	);

	return await response.json();
}

export async function postAccountByERCUserAccountByERC(
	accountExternalReferenceCode: string,
	userExternalReferenceCode: string
) {
	await fetch(
		`${baseURL}/o/headless-admin-user/v1.0/accounts/by-external-reference-code/${accountExternalReferenceCode}/user-accounts/by-external-reference-code/${userExternalReferenceCode}`,
		{headers, method: 'POST'}
	);
}
