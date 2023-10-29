/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.jethr0.entity.repository;

import com.liferay.jethr0.entity.Entity;
import com.liferay.jethr0.entity.dalo.EntityDALO;

import java.util.Set;

import org.json.JSONObject;

/**
 * @author Michael Hashimoto
 */
public interface EntityRepository<T extends Entity> {

	public T add(JSONObject jsonObject);

	public T add(T entity);

	public Set<T> addAll(Set<T> entities);

	public Set<T> getAll();

	public T getById(long id);

	public EntityDALO<T> getEntityDALO();

	public boolean hasEntity(long id);

	public void initialize();

	public void initializeRelationships();

	public void remove(Set<T> entities);

	public void remove(T entity);

	public T update(T entity);

}