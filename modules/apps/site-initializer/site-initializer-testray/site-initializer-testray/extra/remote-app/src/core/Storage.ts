/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

import {Liferay, LiferayStorage} from '~/services/liferay';
import {StorageType} from '~/services/rest';
import {CONSENT_TYPE} from '~/util/enum';

export enum STORAGE_KEYS {
	COMPARE_RUNS = '@testray/compare-runs',
	EXPORT_CASE_IDS = '@testray/export-case-ids',
	LIST_VIEW_COLUMNS = '@testray/listview-columns-',
	LIST_VIEW_PIN = '@testray/listview-pin-',
	SIDEBAR = '@testray/sidebar',
	SWR_CACHE = '@testray/swr-cache',
}

class Storage {
	private storage: LiferayStorage;

	constructor(storage: LiferayStorage) {
		this.storage = storage;
	}

	getItem(
		key: STORAGE_KEYS,
		consentType: CONSENT_TYPE = CONSENT_TYPE.NECESSARY
	): string | null {
		return this.storage.getItem(key, consentType);
	}

	removeItem(key: string): void {
		return this.storage.removeItem(key);
	}

	setItem(
		key: string,
		value: string,
		consentType: CONSENT_TYPE = CONSENT_TYPE.NECESSARY
	): void {
		return this.storage.setItem(key, value, consentType);
	}
}

class TestrayStorage {
	private LocalStorage = new Storage(Liferay.Util.LocalStorage);
	private SessionStorage = new Storage(Liferay.Util.SessionStorage);
	private static instance: TestrayStorage;
	static KEYS = STORAGE_KEYS;

	private constructor() {}

	public static getInstance(): TestrayStorage {
		if (!TestrayStorage.instance) {
			TestrayStorage.instance = new TestrayStorage();
		}

		return TestrayStorage.instance;
	}

	getStorage(storage: StorageType) {
		if (storage === 'persisted') {
			return this.LocalStorage;
		}

		return this.SessionStorage;
	}
}

export default TestrayStorage;
