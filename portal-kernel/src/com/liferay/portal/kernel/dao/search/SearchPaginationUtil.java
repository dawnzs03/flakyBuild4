/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.kernel.dao.search;

/**
 * @author Roberto Díaz
 */
public class SearchPaginationUtil {

	public static int[] calculateStartAndEnd(int cur, int delta) {
		int start = 0;

		if (cur > 0) {
			start = (cur - 1) * delta;
		}

		int end = start + delta;

		return new int[] {start, end};
	}

	public static int[] calculateStartAndEnd(int start, int end, int total) {
		if (total <= 0) {
			return new int[] {0, 0};
		}

		int delta = end - start;

		if (delta < 0) {
			return new int[] {0, 0};
		}

		int[] startAndEnd = {start, end};

		while ((start > 0) && (start >= total)) {
			int cur = start / delta;

			startAndEnd = calculateStartAndEnd(cur, delta);

			start = startAndEnd[0];
		}

		end = startAndEnd[1];

		if (end > total) {
			startAndEnd[1] = total;
		}

		return startAndEnd;
	}

}