/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.upgrade.internal.recorder;

import com.liferay.petra.function.UnsafeBiConsumer;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.ReleaseManager;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.version.Version;
import com.liferay.portal.tools.DBUpgrader;
import com.liferay.portal.util.PropsValues;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.apache.logging.log4j.ThreadContext;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Luis Ortiz
 */
@Component(service = UpgradeRecorder.class)
public class UpgradeRecorder {

	public Map<String, Map<String, Integer>> getErrorMessages() {
		return _errorMessages;
	}

	public String getFinalSchemaVersion(String servletContextName) {
		SchemaVersions schemaVersions = _schemaVersionsMap.get(
			servletContextName);

		if (schemaVersions == null) {
			return null;
		}

		return schemaVersions._getFinal();
	}

	public String getInitialSchemaVersion(String servletContextName) {
		SchemaVersions schemaVersions = _schemaVersionsMap.get(
			servletContextName);

		if (schemaVersions == null) {
			return null;
		}

		return schemaVersions._getInitial();
	}

	public String getResult() {
		return _result;
	}

	public String getType() {
		return _type;
	}

	public Map<String, ArrayList<String>> getUpgradeProcessMessages() {
		return _upgradeProcessMessages;
	}

	public Map<String, Map<String, Integer>> getWarningMessages() {
		return _warningMessages;
	}

	public void recordErrorMessage(String loggerName, String message) {
		Map<String, Integer> messages = _errorMessages.computeIfAbsent(
			loggerName, key -> new ConcurrentHashMap<>());

		int occurrences = messages.computeIfAbsent(message, key -> 0);

		occurrences++;

		messages.put(message, occurrences);
	}

	public void recordUpgradeProcessMessage(String loggerName, String message) {
		List<String> messages = _upgradeProcessMessages.computeIfAbsent(
			loggerName, key -> new ArrayList<>());

		messages.add(message);
	}

	public void recordWarningMessage(String loggerName, String message) {
		Map<String, Integer> messages = _warningMessages.computeIfAbsent(
			loggerName, key -> new ConcurrentHashMap<>());

		int occurrences = messages.computeIfAbsent(message, key -> 0);

		occurrences++;

		messages.put(message, occurrences);
	}

	public void start() {
		_errorMessages.clear();
		_result = "running";
		_schemaVersionsMap.clear();
		_type = "pending";
		_upgradeProcessMessages.clear();
		_warningMessages.clear();

		_processRelease(
			(moduleSchemaVersions, schemaVersion) ->
				moduleSchemaVersions._setInitial(schemaVersion));
	}

	public void stop() {
		_filter(_errorMessages);
		_filter(_warningMessages);

		_result = _calculateResult();
		_type = _calculateType();

		if (PropsValues.UPGRADE_LOG_CONTEXT_ENABLED) {
			ThreadContext.put("upgrade.type", _type);
			ThreadContext.put("upgrade.result", _result);
		}

		if (_log.isInfoEnabled()) {
			if (_type.equals("no upgrade")) {
				if (_result.equals("success")) {
					_log.info("No pending upgrades to run");
				}
				else {
					_log.info(
						"Upgrade process failed or upgrade dependencies are " +
							"not resolved");
				}
			}
			else {
				_log.info(
					StringBundler.concat(
						StringUtil.toUpperCase(_type.substring(0, 1)),
						_type.substring(1), " upgrade finished with result ",
						_result));
			}
		}

		if (PropsValues.UPGRADE_LOG_CONTEXT_ENABLED) {
			ThreadContext.clearMap();
		}
	}

	@Activate
	protected void activate(BundleContext bundleContext) {
		_serviceTracker = new ServiceTracker<>(
			bundleContext, ReleaseManager.class, null);

		_serviceTracker.open();
	}

	@Deactivate
	protected void deactivate(BundleContext bundleContext) {
		_serviceTracker.close();
	}

	private String _calculateResult() {
		if (!_errorMessages.isEmpty()) {
			return "failure";
		}

		try {
			ReleaseManager releaseManager = _serviceTracker.getService();

			if (!releaseManager.isUpgraded()) {
				return "unresolved";
			}
		}
		catch (Exception exception) {
			_log.error(
				StringBundler.concat(
					"Unable to check the upgrade result due to ",
					exception.getMessage(), ". Please check manually."));

			return "failure";
		}

		if (!_warningMessages.isEmpty()) {
			return "warning";
		}

		return "success";
	}

	private String _calculateType() {
		_processRelease(
			(moduleSchemaVersions, schemaVersion) ->
				moduleSchemaVersions._setFinal(schemaVersion));

		String type = "no upgrade";

		for (Map.Entry<String, SchemaVersions> schemaVersionsEntry :
				_schemaVersionsMap.entrySet()) {

			SchemaVersions schemaVersions = schemaVersionsEntry.getValue();

			if (schemaVersions._getInitial() == null) {
				continue;
			}

			Version initialVersion = Version.parseVersion(
				schemaVersions._getInitial());
			Version finalVersion = Version.parseVersion(
				schemaVersions._getFinal());

			if (initialVersion.equals(finalVersion)) {
				continue;
			}

			if (initialVersion.getMajor() < finalVersion.getMajor()) {
				return "major";
			}

			if (type.equals("minor")) {
				continue;
			}

			if (initialVersion.getMinor() < finalVersion.getMinor()) {
				type = "minor";

				continue;
			}

			type = "micro";
		}

		return type;
	}

	private Map<String, Map<String, Integer>> _filter(
		Map<String, Map<String, Integer>> messages) {

		for (String filteredClassName : _FILTERED_CLASS_NAMES) {
			messages.remove(filteredClassName);
		}

		return messages;
	}

	private void _processRelease(
		UnsafeBiConsumer<SchemaVersions, String, Exception> unsafeBiConsumer) {

		DataSource dataSource = InfrastructureUtil.getDataSource();

		if (dataSource == null) {
			return;
		}

		try (Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(
				"select servletContextName, schemaVersion from Release_")) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String servletContextName = resultSet.getString(
					"servletContextName");
				String schemaVersion = resultSet.getString("schemaVersion");

				SchemaVersions moduleSchemaVersions = _schemaVersionsMap.get(
					servletContextName);

				if (moduleSchemaVersions == null) {
					moduleSchemaVersions = new SchemaVersions(null);

					_schemaVersionsMap.put(
						servletContextName, moduleSchemaVersions);
				}

				unsafeBiConsumer.accept(moduleSchemaVersions, schemaVersion);
			}
		}
		catch (SQLException sqlException) {
			_log.error("Unable to get schema version", sqlException);
		}
		catch (Exception exception) {
			_log.error("Unable to process Release_ table", exception);
		}
	}

	private static final String[] _FILTERED_CLASS_NAMES = {
		"com.liferay.portal.search.elasticsearch7.internal.sidecar." +
			"SidecarManager"
	};

	private static final Log _log = LogFactoryUtil.getLog(
		UpgradeRecorder.class);

	private static final Map<String, Map<String, Integer>> _errorMessages =
		new ConcurrentHashMap<>();
	private static String _result;
	private static final Map<String, SchemaVersions> _schemaVersionsMap =
		new ConcurrentHashMap<>();
	private static String _type;
	private static final Map<String, ArrayList<String>>
		_upgradeProcessMessages = new ConcurrentHashMap<>();
	private static final Map<String, Map<String, Integer>> _warningMessages =
		new ConcurrentHashMap<>();

	static {
		if (DBUpgrader.isUpgradeDatabaseAutoRunEnabled() ||
			DBUpgrader.isUpgradeClient()) {

			_result = "pending";
			_type = "pending";
		}
		else {
			_result = "not enabled";
			_type = "not enabled";
		}
	}

	private ServiceTracker<ReleaseManager, ReleaseManager> _serviceTracker;

	private class SchemaVersions {

		public SchemaVersions(String initial) {
			_initial = initial;
		}

		private String _getFinal() {
			return _final;
		}

		private String _getInitial() {
			return _initial;
		}

		private void _setFinal(String aFinal) {
			_final = aFinal;
		}

		private void _setInitial(String initial) {
			if (initial == null) {
				_initial = "0.0.0";

				return;
			}

			_initial = initial;
		}

		private String _final;
		private String _initial;

	}

}