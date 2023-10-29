/**
 * SPDX-FileCopyrightText: (c) 2000 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.portal.upgrade.internal.apache.logging.log4j.core;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.upgrade.internal.recorder.UpgradeRecorder;
import com.liferay.portal.upgrade.internal.report.UpgradeReport;
import com.liferay.portal.util.PropsValues;

import java.io.Serializable;

import java.util.Objects;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.ErrorHandler;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Sam Ziemer
 */
@Component(
	property = "appender.name=UpgradeLogAppender", service = Appender.class
)
public class UpgradeLogAppender implements Appender {

	@Override
	public void append(LogEvent logEvent) {
		Message message = logEvent.getMessage();

		String formattedMessage = message.getFormattedMessage();

		if (formattedMessage.equals(StringPool.NULL)) {
			Throwable throwable = logEvent.getThrown();

			formattedMessage = throwable.getMessage();
		}

		if (logEvent.getLevel() == Level.ERROR) {
			_upgradeRecorder.recordErrorMessage(
				logEvent.getLoggerName(), formattedMessage);
		}
		else if (logEvent.getLevel() == Level.INFO) {
			if (Objects.equals(
					logEvent.getLoggerName(), UpgradeProcess.class.getName()) &&
				formattedMessage.startsWith("Completed upgrade process ")) {

				_upgradeRecorder.recordUpgradeProcessMessage(
					logEvent.getLoggerName(), formattedMessage);
			}
		}
		else if (logEvent.getLevel() == Level.WARN) {
			_upgradeRecorder.recordWarningMessage(
				logEvent.getLoggerName(), message.getFormattedMessage());
		}
	}

	@Override
	public ErrorHandler getHandler() {
		return null;
	}

	@Override
	public Layout<? extends Serializable> getLayout() {
		return null;
	}

	@Override
	public String getName() {
		return "UpgradeLogAppender";
	}

	@Override
	public State getState() {
		return null;
	}

	@Override
	public boolean ignoreExceptions() {
		return false;
	}

	@Override
	public void initialize() {
	}

	@Override
	public boolean isStarted() {
		return _started;
	}

	@Override
	public boolean isStopped() {
		return !_started;
	}

	@Override
	public void setHandler(ErrorHandler handler) {
	}

	@Override
	public void start() {
		_started = true;

		_upgradeRecorder.start();

		if (PropsValues.UPGRADE_REPORT_ENABLED) {
			_upgradeReport = new UpgradeReport();
		}

		_rootLogger.addAppender(this);
	}

	@Override
	public void stop() {
		if (_started) {
			_upgradeRecorder.stop();

			if (_upgradeReport != null) {
				_upgradeReport.generateReport(_upgradeRecorder);

				_upgradeReport = null;
			}
		}

		_started = false;

		_rootLogger.removeAppender(this);
	}

	private static final Logger _rootLogger =
		(Logger)LogManager.getRootLogger();

	private volatile boolean _started;

	@Reference
	private volatile UpgradeRecorder _upgradeRecorder;

	private UpgradeReport _upgradeReport;

}